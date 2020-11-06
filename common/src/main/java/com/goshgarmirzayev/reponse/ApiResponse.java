package com.goshgarmirzayev.reponse;

public class ApiResponse {
    private int code;
    private Object response;
    private String messageAZ;
    private String messageEn;

    public ApiResponse(int code, Object response, String messageAZ, String messageEn) {
        this.code = code;
        this.response = response;
        this.messageAZ = messageAZ;
        this.messageEn = messageEn;
    }

    public ApiResponse() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public String getMessageAZ() {
        return messageAZ;
    }

    public void setMessageAZ(String messageAZ) {
        this.messageAZ = messageAZ;
    }

    public String getMessageEn() {
        return messageEn;
    }

    public void setMessageEn(String messageEn) {
        this.messageEn = messageEn;
    }
}
