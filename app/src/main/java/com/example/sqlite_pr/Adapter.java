package com.example.sqlite_pr;

import android.annotation.SuppressLint;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.TextView;

import java.util.List;

    public class Adapter extends BaseAdapter {
        private List<Sec> Notes;

        public Adapter(List<Sec> notes){
            Notes=notes;
        }

        @Override
        public int getCount(){
            return Notes.size();
        }

        @Override
        public Sec getItem (int position){
            return Notes.get(position);
        }

        @Override
        public long getItemId (int position){
            return 0;
        }

        @SuppressLint("SetTextI18n")
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            if (convertView == null) {
                convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_sec, null);
            }
            ((TextView) convertView.findViewById(R.id.Title)).setText(getItem(position).getName());
            ((TextView) convertView.findViewById(R.id.Data)).setText(getItem(position).getData());
            return convertView;
        }
    }

