package com.example.summitclasses.notice;

public class notice_data_class {
    String date,time,url,text,key;
    public notice_data_class() {
    }

    public notice_data_class(String date, String time, String url, String text, String key) {
        this.date = date;
        this.key = key;
        this.text = text;
        this.time = time;
        this.url = url;


    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
