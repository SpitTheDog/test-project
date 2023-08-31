package org.example;

public class Main {

    public String getLargeString(String s) {
        return s.toUpperCase();
    }

    public String getLittleString(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("This is Branch One");
        System.out.println("Oh what fun");
        System.out.println("Yet another change");
        System.out.println("One more change");
        System.out.println("Finally");
        System.out.println("One more for luck");
        System.out.println("Definitely the last");
        System.out.println("I lied");
        System.out.println(new Main().getLargeString("hello"));
        System.out.println(new Main().getLittleString("BON JOUR"));
    }
}