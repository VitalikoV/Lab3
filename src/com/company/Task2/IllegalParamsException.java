package com.company.Task2;

public class IllegalParamsException extends IllegalArgumentException{
    HttpCodes code;

    public IllegalParamsException(String message, HttpCodes code){
        super(message);
        this.code = code;
    }

    public IllegalParamsException(HttpCodes code){
        this.code = code;
    }

    public HttpCodes getCode() {
        return code;
    }

    public void setCode(HttpCodes code) {
        this.code = code;
    }
}
