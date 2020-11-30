package com.vapasi;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LengthTest {

    @Test
    public void shouldReturnNotEqualForDifferentPhysicalParameters()    {
        Length length = new Length(5, "ft");
        assertNotEquals(new Integer(5), length);
    }

    @Test
    public void shouldBeEqualWhenBothValuesAndUnitsAreSame() {
        Length length1 = new Length(10, "inch");
        Length length2 = new Length(10, "inch");
        assertEquals(length1, length2);
        Length length3 = new Length(10, "ft");
        Length length4 = new Length(10, "ft");
        assertEquals(length3, length4);
    }
    @Test
    public void shouldNotBeEqualForSameUnitsDifferentValues() {
        Length length1 = new Length(5, "inch");
        Length length2 = new Length(10, "inch");
        assertNotEquals(length1, length2);
        Length length3 = new Length(5, "ft");
        Length length4 = new Length(10, "ft");
        assertNotEquals(length3, length4);
    }

    @Test
    public void shouldBeEqualForDifferentUnitsWithEquivalentValues() {
        Length length1 = new Length(5, "ft");
        Length length2 = new Length(60, "inch");
        assertEquals(length1, length2);
        Length length3 = new Length(36, "inch");
        Length length4 = new Length(3, "ft");
        assertEquals(length3, length4);
    }

    @Test
    public void shouldNotBeEqualForDifferentUnitsWithDifferentValues() {
        Length length1 = new Length(5, "ft");
        Length length2 = new Length(65, "inch");
        assertNotEquals(length1, length2);
        Length length3 = new Length(40, "inch");
        Length length4 = new Length(3, "ft");
        assertNotEquals(length3, length4);
    }

    @Test
    public void shoudReturnInchValueForFeet()   {
        Length length = new Length(5, "ft");
        int actualValue = length.convertFeetToInch(5);
        int expectedValue = 60;
        assertEquals(expectedValue, actualValue);
    }
}
