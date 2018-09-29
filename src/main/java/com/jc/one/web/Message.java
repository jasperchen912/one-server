package com.jc.one.web;

import lombok.Getter;
import lombok.Setter;

public class Message {

    //
    private static final Integer SUCCESS = 200;

    private static final Integer ERROR = 500;


    public abstract class MessageEntry {

        @Setter
        @Getter
        private String statusCode;

        MessageEntry(String statusCode) {
            this.statusCode = statusCode;
        }
    }

    private class SuccessMessageEntry extends MessageEntry {

        @Setter
        @Getter
        private Object data;

        SuccessMessageEntry(String statusCode, Object data) {
            super(statusCode);
            this.data = data;
        }
    }

    private class ErrorMessageEntry extends MessageEntry {

        @Setter
        @Getter
        private String errorCode;

        @Setter
        @Getter
        private String errorMsg;

        ErrorMessageEntry(String statusCode, String errorCode, String errorMsg) {
            super(statusCode);
            this.errorCode = errorCode;
            this.errorMsg = errorMsg;
        }
    }
}
