package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double semiP = (a + b + c) / 2;
        double rsl = Math.sqrt((semiP * (semiP - a) * (semiP - b) * (semiP - c)));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("Area 2, 2, 2 = " + rsl);
    }
}
