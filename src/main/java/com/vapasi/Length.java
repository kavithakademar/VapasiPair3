package com.vapasi;

import java.util.Objects;

public class Length {

    private final double value;
    private final Metrics unit;
    
    public Length(double value, Metrics unit)   {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return length.value == unit.conversionFactor(length.unit)*value;
    }
}
