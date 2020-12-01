package com.vapasi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MetricsTest {

    private static Metrics feet;
    private static Metrics inch;
    private static Metrics cm;

    @BeforeEach
    public void setup() {
        feet = Metrics.createFeetMetrics();
        inch = Metrics.createInchMetrics();
        cm = Metrics.createCentimeterMetrics();
    }

    @Test
    public void shouldReturnConversionFactor()  {
        assertEquals(60, feet.convertToBaseUnits(2));
        assertEquals(15, inch.convertToBaseUnits(6));
        assertEquals(100, cm.convertToBaseUnits(100));
    }

    @Test
    public void shouldReturnBaseUnitToResultantUnit()   {
        double actualResult = feet.convertToResultantUnit(10, inch);
        assertEquals(120, actualResult);

        actualResult = inch.convertToResultantUnit(10, cm);
        assertEquals(25, actualResult);

        actualResult = cm.convertToResultantUnit(60, feet);
        assertEquals(2, actualResult);

    }
}
