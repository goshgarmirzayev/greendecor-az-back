package com.goshgarmirzayev.reponse;

public enum ApiResponseEnum {
    SUCCESS(200),
    NO_DATA_FOUND(404),
    ERROR(500);
    private int value;

    ApiResponseEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
