package com.example.summitclasses.Fragments.helperclass;

public class ahelperclass {
    String image;
    String namer, marks, batch;

    public ahelperclass(String image, String namer, String marks, String batch) {
        this.image = image;
        this.namer = namer;
        this.marks = marks;
        this.batch = batch;
    }

    public String getImage() {
        return image;
    }

    public String getNamer() {
        return namer;
    }

    public String getMarks() {
        return marks;
    }

    public String getBatch() {
        return batch;
    }
}
