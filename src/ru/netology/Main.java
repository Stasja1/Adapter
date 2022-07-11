package ru.netology;

public class Main {
    public static void main(String[] args) {

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(5, 2));
        System.out.println(intsCalc.mult(2, 3));
        System.out.println(intsCalc.pow(4, 8));
    }
}