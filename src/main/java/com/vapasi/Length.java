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
        System.out.println(this.value);
        System.out.println(this.unit.toString());
        System.out.println(length.unit.toString());
        System.out.println(this.unit.conversionFactor(length.unit));
        return this.value == this.unit.conversionFactor(length.unit)*length.value;
    }
}
