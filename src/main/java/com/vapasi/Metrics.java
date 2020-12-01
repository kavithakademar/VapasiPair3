package com.vapasi;

import java.util.Objects;

public class Metrics {
    
    private static final double FEET_TO_BASE = 30;
    private static final double INCH_TO_BASE = 2.5;
    private static final double CM_TO_BASE = 1;
    private static Metrics feetMetrics;
    private static Metrics inchMetrics;
    private static Metrics centimeterMetrics;
    private double standardConverter;

    private Metrics(double standardConverter)    {
        this.standardConverter = standardConverter;
    }
    public static Metrics createFeetMetrics()   {
        if(feetMetrics == null)
            feetMetrics = new Metrics(FEET_TO_BASE);
        return feetMetrics;
    }

    public static Metrics createInchMetrics()   {
        if(inchMetrics == null)
            inchMetrics = new Metrics(INCH_TO_BASE);
        return inchMetrics;
    }

    public static Metrics createCentimeterMetrics()   {
        if(centimeterMetrics == null)
            centimeterMetrics = new Metrics(CM_TO_BASE);
        return centimeterMetrics;
    }

    public double convertToBaseUnits(double value)  {
        return standardConverter * value;
    }

}
