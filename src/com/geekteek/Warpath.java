package com.geekteek;

public class Warpath extends Youtuber implements Printable{

    private int cars;

    public Warpath(int subscribers, int cars) {
        super(subscribers,Differences.много_подписчеков);
        this.cars = cars;
    }

    public int getCars() {
        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    @Override
    public void print() {
        System.out.println("Количество подписчиков: " + this.getSubscribers() + "\n" +
                "Количество машин: " + this.getCars() + "\n" +
                "отличие: " + this.getDifferences()+"\n");
    }
}
