package com.app.furoappdemo;

public class ModelClass {

    private String title,hour,image;

    public ModelClass() { }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ModelClass(String title,  String  hour)
    {
        this.title = title;
        this. hour = hour;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getHour() {
        return  hour;
    }

    public void setHour(String hour) {
        this. hour = hour;
    }




}
