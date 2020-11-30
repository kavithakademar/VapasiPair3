package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LengthTest {

    @Test
    public void shouldReturnNotEqualForDifferentPhysicalParameters()    {
        Length length = new Length(5, "ft");
        assertNotEquals(new Integer(5), length);
    }
}
