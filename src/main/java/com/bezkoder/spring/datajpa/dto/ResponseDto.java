package com.bezkoder.spring.datajpa.dto;

public class ResponseDto<T> {
    private String message;
    private int status;
    private T body;

    public ResponseDto() {
    }

    public ResponseDto(String message, int status, T body) {
        this.message = message;
        this.status = status;
        this.body = body;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    //    public ResponseDto(Builder builder) {
//        this.message = builder.message;
//        this.status = builder.status;
//        this.body = builder.body;
//    }

//    static Builder getBuilder() {
//        return new Builder();
//    }
//
//    static class Builder {
//        private String message;
//        private int status;
//        private T body;
//
//        private Builder() {}
//
//        Builder message(String message) {
//            this.message = message;
//            return this;
//        }
//
//        Builder status(int status) {
//            this.status = status;
//            return this;
//        }
//
//        Builder body(T body) {
//            this.body = body;
//            return this;
//        }
//
//        ResponseDto build() {
//            ResponseDto build = new ResponseDto(this);
//
////            build.requireValidTitleAndDescription(build.getTitle(), build.getDescription());
//
//            return build;
//        }
//    }
}
