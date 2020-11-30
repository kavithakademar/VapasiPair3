package com.vapasi;

import org.junit.jupiter.api.BeforeAll;
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
        Length length = new Length(5, feet);
        assertNotEquals(new Integer(5), length);
    }

    @Test
    public void shouldBeEqualWhenBothValuesAndUnitsAreSame() {
        Length length1 = new Length(5, inch);
        Length length2 = new Length(10, inch);
        assertNotEquals(length1, length2);
        Length length3 = new Length(5, feet);
        Length length4 = new Length(10, feet);
        assertNotEquals(length3, length4);
        Length length5 = new Length(5, cm);
        Length length6 = new Length(10, cm);
        assertNotEquals(length5, length6);

    }

    @Test
    public void shouldBeEqualForDifferentUnitsWithEquivalentValues() {
        Length length1 = new Length(5, feet);
        Length length2 = new Length(60, inch);
        assertEquals(length1, length2);
        Length length3 = new Length(36, inch);
        Length length4 = new Length(3, feet);
        assertEquals(length3, length4);
        Length length5 = new Length(2, inch);
        Length length6 = new Length(5, cm);
        assertEquals(length5, length6);
        Length length7 = new Length(10, cm);
        Length length8 = new Length(4, inch);
        assertEquals(length7, length8);

    }

    @Test
    public void shouldNotBeEqualForDifferentUnitsWithDifferentValues() {
        Length length1 = new Length(5, feet);
        Length length2 = new Length(65, inch);
        assertNotEquals(length1, length2);
        Length length3 = new Length(40, inch);
        Length length4 = new Length(3, feet);
        assertNotEquals(length3, length4);
        Length length5 = new Length(2, inch);
        Length length6 = new Length(10, cm);
        assertNotEquals(length5, length6);
        Length length7 = new Length(8, cm);
        Length length8 = new Length(4, inch);
        assertNotEquals(length7, length8);
    }

}
