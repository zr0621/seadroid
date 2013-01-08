package com.seafile.seadroid;

public class SeafException extends Exception {

    private int code;
    
    public SeafException(int code, String msg) {
        super(msg);
        this.code = code;
    }
    
    public int getCode() {
        return code;
    }
    
}