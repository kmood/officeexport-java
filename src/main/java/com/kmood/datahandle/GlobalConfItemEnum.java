package com.kmood.datahandle;


public enum GlobalConfItemEnum {
    D_F("DATE_FORMAT"),B_F("BOOLEAN_FORMAT"),N_F("NUMBER_FORMAT");

    private final String name;

    private GlobalConfItemEnum(String name)
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
