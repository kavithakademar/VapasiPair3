package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MetricsTest {

    @Test
    public void shouldReturnConversionFactor()  {
        Metrics feet = new Metrics("ft");
        Metrics inch = new Metrics("inch");
        Metrics cm = new Metrics("cm");

        assertEquals(12, feet.conversionFactor(inch));
        assertEquals(2.5, inch.conversionFactor(cm));
        assertEquals(1/12.0, inch.conversionFactor(feet));
        assertEquals(1/2.5, cm.conversionFactor(inch));


    }
}
