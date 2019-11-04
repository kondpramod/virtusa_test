package com.number.conversion.algorithm.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.number.conversion.algorithm.NumberWordConverter;

public class NumberWordConverterUnitTest {

    @Test
    public void whenZeroGiven_thenReturnEmptyString() {
        assertEquals("", NumberWordConverter.getNumberIntoWords(0));
    }

    @Test
    public void whenOnly1Given_thenReturnWords() {
        assertEquals("one", NumberWordConverter.getNumberIntoWords(1));
    }

    @Test
    public void whenAlmostAMillionGiven_thenReturnWords() {
        String expectedResult = "nine hundred ninety nine thousand nine hundred ninety nine";
        assertEquals(expectedResult, NumberWordConverter.getNumberIntoWords(999999));
    }
    
    @Test
    public void whenThirtyMillionGiven_thenReturnWords() {
        String expectedResult = "thirty three million three hundred forty eight thousand nine hundred seventy eight";
        assertEquals(expectedResult, NumberWordConverter.getNumberIntoWords(33348978));
    }
    
    @Test
    public void whenTwoBillionGiven_thenReturnWords() {
        String expectedResult = "two billion one hundred thirty three million two hundred forty seven thousand eight hundred ten";
        assertEquals(expectedResult, NumberWordConverter.getNumberIntoWords(2133247810));
    }

 }