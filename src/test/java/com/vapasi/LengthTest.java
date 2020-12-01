package com.vapasi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LengthTest {

    Metrics feet;
    Metrics inch;
    Metrics cm;

    @BeforeEach
    public void setup(){
        feet = Metrics.createFeetMetrics();
        inch = Metrics.createInchMetrics();
        cm = Metrics.createCentimeterMetrics();
    }

    @Test
    public void shouldReturnNotEqualForDifferentPhysicalParameters()    {
        Length length = Length.createLengthInFeet(5);
        assertNotEquals(new Integer(5), length);
    }

    @Test
    public void shouldBeEqualWhenBothValuesAndUnitsAreSame() {
        Length length1 = Length.createLengthInInch(5);
        Length length2 = Length.createLengthInInch(10);
        assertNotEquals(length1, length2);
        Length length3 = Length.createLengthInFeet(5);
        Length length4 = Length.createLengthInFeet(10);
        assertNotEquals(length3, length4);
        Length length5 = Length.createLengthInCM(5);
        Length length6 = Length.createLengthInCM(10);
        assertNotEquals(length5, length6);

    }

    @Test
    public void shouldBeEqualForDifferentUnitsWithEquivalentValues() {
        Length length1 = Length.createLengthInFeet(5);
        Length length2 = Length.createLengthInInch(60);
        assertEquals(length1, length2);
        Length length3 = Length.createLengthInInch(36);
        Length length4 = Length.createLengthInFeet(3);
        assertEquals(length3, length4);
        Length length5 = Length.createLengthInInch(2);
        Length length6 = Length.createLengthInCM(5);
        assertEquals(length5, length6);
        Length length7 = Length.createLengthInCM(10);
        Length length8 = Length.createLengthInInch(4);
        assertEquals(length7, length8);

    }

    @Test
    public void shouldNotBeEqualForDifferentUnitsWithDifferentValues() {
        Length length1 = Length.createLengthInFeet(5);
        Length length2 = Length.createLengthInInch(65);
        assertNotEquals(length1, length2);
        Length length3 = Length.createLengthInInch(40);
        Length length4 = Length.createLengthInFeet(3);
        assertNotEquals(length3, length4);
        Length length5 = Length.createLengthInInch(2);
        Length length6 = Length.createLengthInCM(10);
        assertNotEquals(length5, length6);
        Length length7 = Length.createLengthInCM(8);
        Length length8 = Length.createLengthInInch(4);
        assertNotEquals(length7, length8);
    }

    @Test
    public void shouldReturnSumOfLengthsWhenTwoUnitsAreSame(){
        Length length1 = Length.createLengthInInch(3);
        Length length2 = Length.createLengthInInch(7);
        Length actualSumOfTwoLengths = length1.addInInch(length2);
        Length expectedSumOfTwoLengths = Length.createLengthInInch(10);
        assertEquals(expectedSumOfTwoLengths, actualSumOfTwoLengths);
    }
}
