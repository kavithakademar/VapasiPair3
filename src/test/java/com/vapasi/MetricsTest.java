package com.vapasi;

import org.junit.jupiter.api.BeforeAll;
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
        double actualResult = Metrics.convertBaseToResultantUnit(10, inch);
        assertEquals(4, actualResult);

        actualResult = Metrics.convertBaseToResultantUnit(10, cm);
        assertEquals(10, actualResult);

        actualResult = Metrics.convertBaseToResultantUnit(60, feet);
        assertEquals(2, actualResult);


    }
}
