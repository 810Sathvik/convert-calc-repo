package com.mmi.convertcalcapi.constants;

/**
 * Created by c817105 on 20/03/2020.
 */
public enum Constants {

    MILLIMETRE("mm"),
    CENTIMETRE("cm"),
    METRE("m"),
    KILOMETRE("km"),
    INCHES("in"),
    FEET("ft"),
    YARDS("yd"),
    MILES("ml"),
    NANO_MILES("nm"),

    MILLIGRAM("mg"),
    GRAM("g"),
    KILOGRAM("kg"),
    TONNES("t"),
    OUNCES("oz"),
    POUNDS("lb"),
    STONES("s"),
    UK_HUNDRED_WEIGHT("cwt"),
    UK_LONG_TON("ton"),

    SQUARE_MILLIMETRES("mm2"),
    SQUARE_CENTIMETRES("cm2"),
    SQUARE_METRES("m2"),
    HECTARES("ha"),
    SQUARE_KILOMETRES("km2"),
    SQUARE_INCHES("in2"),
    SQUARE_FEET("sq ft"),
    SQUARE_YARDS("yd2"),
    SQUARE_MILES("ml2"),
    ACRES("a"),

    FARHENHEIT("f"),
    CELSIUS("c");


    private String url;

    Constants(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
