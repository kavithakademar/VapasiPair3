package com.vapasi;

import java.util.Objects;

public class Length {

    private final double value;
    private final Metrics unit;
    
    private Length(double value, Metrics unit)   {
        this.value = value;
        this.unit = unit;
    }

    public static Length createLengthInFeet(double value)   {
        return new Length(value, Metrics.createFeetMetrics());
    }

    public static Length createLengthInInch(double value)   {
        return new Length(value, Metrics.createInchMetrics());
    }

    public static Length createLengthInCM(double value)   {
        return new Length(value, Metrics.createCentimeterMetrics());
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return unit.convertToBaseUnits(value) == length.unit.convertToBaseUnits(length.value);
    }

}
