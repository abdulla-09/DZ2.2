package com.geekteek;

public class FlackJK extends Youtuber implements Printable{

    private String колега;

    public FlackJK(int subscribers, Differences differences, String колега) {
        super(subscribers, differences);
        this.колега = колега;
    }

    public String getКолега() {
        return колега;
    }

    public void setКолега(String колега) {
        this.колега = колега;
    }

    @Override
    public void print() {
        System.out.println("Количество подписчиков: " + this.getSubscribers() + "\n" +
                "Коллега: " + this.getКолега() + "\n" +
                "отличие: " + this.getDifferences()+"\n");
    }
}
