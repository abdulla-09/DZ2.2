package com.geekteek;

public class Youtuber {

    private int subscribers;
    private Differences differences;

    public Youtuber(int subscribers,Differences differences) {
        this.subscribers = subscribers;
        this.differences=differences;
    }

    public int getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
    }

    public Differences getDifferences() {
        return differences;
    }

    public void setDifferences(Differences differences) {
        this.differences = differences;
    }
}
