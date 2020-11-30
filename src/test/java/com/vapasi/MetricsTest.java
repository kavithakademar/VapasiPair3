package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MetricsTest {

    @Test
    public void shouldReturnConversionFactor()  {
        Metrics feet = Metrics.createFeetMetrics();
        Metrics inch = Metrics.createInchMetrics();
        Metrics cm = Metrics.createCentimeterMetrics();

        assertEquals(30, feet.standardConverterToBase());
        assertEquals(2.5, inch.standardConverterToBase());
        assertEquals(1, cm.standardConverterToBase());


    }
}
