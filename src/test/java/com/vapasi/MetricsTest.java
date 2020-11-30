package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MetricsTest {

    @Test
    public void shouldReturnConversionFactor()  {
        Metrics unit1 = new Metrics("ft");
        Metrics unit2 = new Metrics("inch");
        Metrics unit3 = new Metrics("cm");

        assertEquals(12, unit1.conversionFactor(unit2));
        assertEquals(2.5, unit2.conversionFactor(unit3));


    }
}
