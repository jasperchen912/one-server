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
}
