package com.github.bitcoin.chapterOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiniteFieldElementTest {


    @Test
    void testThatTwoFieldElementAreNotEqual(){
        FiniteFieldElement a = new FiniteFieldElement(7,13);
        FiniteFieldElement b = new FiniteFieldElement(6, 13);
        assertNotEquals(a, b);
    }
}