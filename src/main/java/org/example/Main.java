package org.example;

public class Main {
    public static void main(String[] args) {
        CountDs countDs = new CountDs("My friend Dylan got distracted in school.");
        System.out.println(countDs.length());


        CountDs countDs1 = new CountDs("Debris was scattered all over the yard.");
        System.out.println(countDs1.length());

        CountDs countDs2 = new CountDs("The rodents hibernated in their den.");
        System.out.println(countDs2.length());

        CountDs countDs3 = new CountDs("The deepest part of the ocean is the darkest and most dreaded.");
        System.out.println(countDs3.length());


        Edabit edabit = new Edabit("edabit is amazing.");
        System.out.println(edabit.replacement());

        Edabit edabit1 = new Edabit("Mubashir is not amazing.");
        System.out.println(edabit1.replacement());

        Edabit edabit2 = new Edabit("Mubashir is not amazing.");
        System.out.println(edabit2.replacement());

    }
}