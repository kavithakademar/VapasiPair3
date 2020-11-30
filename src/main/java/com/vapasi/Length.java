package com.vapasi;

import java.util.Objects;

public class Length {

    private final String FT = "ft";
    private final String INCH = "inch";
    private static final int FT_TO_INCH = 12;
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
        }
        else {
            if(unit.equalsIgnoreCase(FT)) {
                if (convertFeetToInch(value) == length.value) return true;
                return false;
            }
            else    {
                if(convertFeetToInch(length.value) == value) return true;
                return false;
            }
        }
    }

    public static int convertFeetToInch(int value) {
        return value * FT_TO_INCH;
    }

}
