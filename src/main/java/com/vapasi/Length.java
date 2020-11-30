package com.vapasi;

import java.util.Objects;

public class Length {

    private final int value;
    private final String unit;
    
    public Length(int value, String unit)   {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        if (unit == length.unit) {
            if (value == length.value)
                return true;
                return false;
        }else {
           int unitInInches =  convertFeetToInch(length.value);
        }
        return value == length.value &&
                Objects.equals(unit, length.unit);
    }

    private int convertFeetToInch(int value) {
        return 0;
    }

}
