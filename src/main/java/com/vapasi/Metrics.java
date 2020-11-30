package com.vapasi;

import java.util.Objects;

public class Metrics {
    
    private final String unit;
    private final double FEET_TO_INCH = 12;
    private final double INCH_TO_CM = 2.5;
    private final double INCH_TO_FEET = 1/FEET_TO_INCH;
    private final double CM_TO_INCH = 1/INCH_TO_CM;
    private final String FEET = "ft";
    private final String INCH = "in";
    private final String CM = "cm";

    public Metrics(String unit) {
        this.unit = unit;
    }

    public double conversionFactor(Metrics toUnit){
        if (toUnit.unit == this.unit)
            return 1;
        if (toUnit.unit == FEET && this.unit == INCH)
            return FEET_TO_INCH;
        if(toUnit.unit == INCH && this.unit == CM)
            return INCH_TO_CM;
        if (this.unit == INCH && toUnit.unit == FEET)
            return INCH_TO_FEET;
        if (this.unit == CM && toUnit.unit == INCH)
            return CM_TO_INCH;
        return 0;
    }

    @Override
    public String toString() {
        return "Metrics{" +
                "unit='" + unit + '\'' +
                '}';
    }
}
