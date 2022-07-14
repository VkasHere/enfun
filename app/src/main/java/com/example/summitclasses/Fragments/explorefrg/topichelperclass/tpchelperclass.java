package com.example.summitclasses.Fragments.explorefrg.topichelperclass;

public class tpchelperclass {

    String num,topicnm;
    int plybtn;

    public tpchelperclass() {
    }

    public tpchelperclass(String num, String topicnm, int plybtn) {
        this.num = num;
        this.topicnm = topicnm;
        this.plybtn = plybtn;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTopicnm() {
        return topicnm;
    }

    public void setTopicnm(String topicnm) {
        this.topicnm = topicnm;
    }

    public int getPlybtn() {
        return plybtn;
    }

    public void setPlybtn(int plybtn) {
        this.plybtn = plybtn;
    }
}
