package com.vapasi;

import java.util.Objects;

public class Metrics {
    
    private final String unit;
    private final double FEET_TO_INCH = 12;
    private final double INCH_TO_CM = 2.5;
    private final double INCH_TO_FEET = 1/FEET_TO_INCH;
    private final double CM_TO_INCH = 1/INCH_TO_CM;
    private final double NO_CONVERSION = 1;
    private final double INVALID = 0;
    private final String FEET = "ft";
    private final String INCH = "inch";
    private final String CM = "cm";

    public Metrics(String unit) {
        this.unit = unit;
    }

    public double conversionFactor(Metrics toUnit){
        if (unit == toUnit.unit)
            return NO_CONVERSION;
        if (unit == FEET && toUnit.unit == INCH)
            return FEET_TO_INCH;
        if(unit == INCH && toUnit.unit == CM)
            return INCH_TO_CM;
        if (unit == INCH && toUnit.unit == FEET)
            return INCH_TO_FEET;
        if (unit == CM && toUnit.unit == INCH)
            return CM_TO_INCH;
        return INVALID;
    }

    @Override
    public String toString() {
        return "Metrics{" +
                "unit='" + unit + '\'' +
                '}';
    }
}
