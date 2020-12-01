package com.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MetricsTest {

    @Test
    public void shouldReturnConversionFactor()  {
        Metrics feet = Metrics.createFeetMetrics();
        Metrics inch = Metrics.createInchMetrics();
        Metrics cm = Metrics.createCentimeterMetrics();

        assertEquals(60, feet.convertToBaseUnits(2));
        assertEquals(15, inch.convertToBaseUnits(6));
        assertEquals(100, cm.convertToBaseUnits(100));


    }
}
