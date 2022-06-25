package com.github.bitcoin.chapterOne;

import java.util.Objects;

public class FiniteFieldElement {

    public int num;
    public int prime;

    public FiniteFieldElement(int num, int prime){
        if(num < 0 || num >= prime){
            throw new IllegalArgumentException("Number not in field range 0 to "+prime);
        }
        this.num = num;
        this.prime = prime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FiniteFieldElement)) return false;
        FiniteFieldElement that = (FiniteFieldElement) o;
        return num == that.num && prime == that.prime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, prime);
    }
}
