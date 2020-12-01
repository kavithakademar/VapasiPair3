package com.vapasi;

public class Length {

    private final double length;
    private final Metrics unit;
    
    private Length(double value, Metrics unit)   {
        this.length = value;
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
        return unit.convertToBaseUnits(this.length) == length.unit.convertToBaseUnits(length.length);
    }

    public Length addInInch(Length lengthInInch) {
        return createLengthInInch(length + lengthInInch.length);
    }

    public Length add(Length that, Metrics resultantUnit) {
        double resultInResultantUnit = this.unit.convertToResultantUnit(this.length, resultantUnit)
                + that.unit.convertToResultantUnit(that.length, resultantUnit);
        return new Length(resultInResultantUnit, resultantUnit);
    }
}
