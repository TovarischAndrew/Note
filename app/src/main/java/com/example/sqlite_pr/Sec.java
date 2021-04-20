package com.example.sqlite_pr;
// навзание переменной точно должно быть через нижнее подчеркивание?
public class Sec {
    private String _Name;
    private String _Data;

    public Sec() {
    }

    public Sec(String name, String data) {
        _Name = name;
        _Data = data;
    }

    public String getName() {
        return _Name;
    }

    public void setName(String name) {
        _Name = name;
    }

    public String getData() {
        return _Data;
    }

    public void setPrice(String price) {
        _Data = price;
    }
}
