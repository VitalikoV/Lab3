package com.company.Task2;

public enum HttpCodes {
    HTTP_200(200),
    HTTP_300(300),
    HTTP_400(400),
    HTTP_500(500);

    private final int code;
    HttpCodes(int code){
        this.code = code;
    }

    @Override
    public String toString() {
        return String.valueOf(code);
    }
}
