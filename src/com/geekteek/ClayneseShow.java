package com.geekteek;

public class ClayneseShow extends Youtuber implements Printable{

    private String voice;

    public ClayneseShow(int subscribers, String voice) {
        super(subscribers, Differences.смешной);
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public void print() {
        System.out.println("Количество подписчиков: " + this.getSubscribers() + "\n" +
                "Голос: " + this.getVoice() + "\n" +
                "отличие: " + this.getDifferences()+"\n");
    }
}
