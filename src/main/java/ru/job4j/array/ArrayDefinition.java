package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива prices: " + prices.length);
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Vladimir Lenin";
        names[2] = "Iosif Stalin";
        names[3] = "Vladimir Putin";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}