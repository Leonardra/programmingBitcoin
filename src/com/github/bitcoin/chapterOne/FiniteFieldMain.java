package com.github.bitcoin.chapterOne;

public class FiniteFieldMain {

    public static void main(String[] args) {
        FiniteFieldElement a = new FiniteFieldElement(7,13);
        FiniteFieldElement b = new FiniteFieldElement(6, 13);

        System.out.println(a.equals(b));
        System.out.println(a.equals(a));
    }
}