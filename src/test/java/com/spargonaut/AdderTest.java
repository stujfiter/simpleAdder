package com.spargonaut;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class AdderTest {
    @Test
    public void shouldAddTwoInts() {
        int firstNumber = 3;
        int secondNumber = 5;
        Adder adder = new Adder();
        assertThat(adder.addTwoInts(firstNumber, secondNumber), is(8));
    }

    @Test
    public void shouldAddTwoOtherInts() {
        int firstNumber = 6;
        int secondNumber = 8;
        Adder adder = new Adder();
        assertThat(adder.addTwoInts(firstNumber, secondNumber), is(14));
    }
}
        
