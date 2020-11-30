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
        feet = new Metrics("ft");
        inch = new Metrics("inch");
        cm = new Metrics("cm");
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
    }

    @Test
    public void shouldBeEqualForDifferentUnitsWithEquivalentValues() {
        Length length1 = new Length(5, feet);
        Length length2 = new Length(60, inch);
        assertEquals(length1, length2);
        Length length3 = new Length(36, inch);
        Length length4 = new Length(3, feet);
        assertEquals(length3, length4);
    }

    @Test
    public void shouldNotBeEqualForDifferentUnitsWithDifferentValues() {
        Length length1 = new Length(5, feet);
        Length length2 = new Length(65, inch);
        assertNotEquals(length1, length2);
        Length length3 = new Length(40, inch);
        Length length4 = new Length(3, feet);
        assertNotEquals(length3, length4);
    }

}
