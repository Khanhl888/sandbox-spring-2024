package org.example.sandbox.inheritance.aggregation;

public class Driver {

    public static void main(String[] args) {

        String amountOfLettuce="a lot";
        Salad salad = new Salad(amountOfLettuce," a lot","not much","tons","a few");
        System.out.println(salad);

        Salad anotherSalad = new Salad();//composition
        System.out.println(anotherSalad);

    }


}
