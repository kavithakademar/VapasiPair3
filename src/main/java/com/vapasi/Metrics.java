package com.vapasi;

import java.util.Objects;

public class Metrics {
    
    private static final double FEET_TO_BASE = 30;
    private static final double INCH_TO_BASE = 2.5;
    private static final double CM_TO_BASE = 1;
    private static final String FEET = "ft";
    private static final String INCH = "inch";
    private static final String CM = "cm";

    private static Metrics feetMetrics = new Metrics(FEET_TO_BASE, FEET);
    private static Metrics inchMetrics = new Metrics(INCH_TO_BASE, INCH);
    private static Metrics centimeterMetrics = new Metrics(CM_TO_BASE, CM);
    private double standardConverter;
    private String unit;

    private Metrics(double standardConverter, String unit)    {
        this.standardConverter = standardConverter;
        this.unit = unit;
    }
    public static Metrics createFeetMetrics()   {
        return feetMetrics;
    }

    public static Metrics createInchMetrics()   {
        return inchMetrics;
    }

    public static Metrics createCentimeterMetrics()   {
        return centimeterMetrics;
    }

    public double convertToBaseUnits(double value)  {
        return standardConverter * value;
    }

    public static double convertBaseToResultantUnit(double value, Metrics expected)   {
        return value / expected.standardConverter;
    }
}
