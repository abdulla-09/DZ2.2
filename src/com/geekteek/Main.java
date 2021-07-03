package com.geekteek;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Printable[] printables = {
                createObject("Warpath"),
                createObject("ClayneseShow"),
                createObject("FlackJK")
        };

        for (Printable prints : printables) {
            prints.print();
        }

    }

    static Printable createObject(String className) {
        switch (className) {
            case "Warpath":
                Warpath warpath = new Warpath(56344, 23);
                return warpath;
            case "ClayneseShow":
                ClayneseShow clayneseShow = new ClayneseShow(56344, "разнообразный");
                return clayneseShow;
            case "FlackJK":
                FlackJK flackJK = new FlackJK(3478925, Differences.не_снимает_один, "AssiMaslow");
                return flackJK;
        }
        return null;
    }

}
