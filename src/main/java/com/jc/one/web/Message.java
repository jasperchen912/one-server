package com.jc.one.web;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

public class Message {

    private static final Integer SUCCESS = 200;

    private static final Integer ERROR = 500;

    public static abstract class MessageEntry {

        @Setter
        @Getter
        private Integer statusCode;

        MessageEntry(Integer statusCode) {
            this.statusCode = statusCode;
        }
    }

    private static class SuccessMessageEntry extends MessageEntry {

        @Setter
        @Getter
        private Object data;

        SuccessMessageEntry(Integer statusCode, Object data) {
            super(statusCode);
            this.data = data;
        }
    }

    private static class ErrorMessageEntry extends MessageEntry {

        @Setter
        @Getter
        private String errorCode;

        @Setter
        @Getter
        private String errorMsg;

        ErrorMessageEntry(Integer statusCode, String errorCode, String errorMsg) {
            super(statusCode);
            this.errorCode = errorCode;
            this.errorMsg = errorMsg;
        }
    }

    public static MessageEntry ok(Object data) {
        if (null == data) {
            data = new HashMap<String, String>();
        }
        return new SuccessMessageEntry(SUCCESS, data);
    }

    public static MessageEntry ok() {
        return new SuccessMessageEntry(SUCCESS, new HashMap<>());
    }

    public static MessageEntry error(String errorCode, String errorMsg) {
        return new ErrorMessageEntry(ERROR, errorCode, errorMsg);
    }
}
