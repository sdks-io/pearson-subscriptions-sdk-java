/*
 * PearsonSubscriptionsAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for OrderRespError type.
 */
public class OrderRespError {
    private CodeEnum code;
    private String message;

    /**
     * Default constructor.
     */
    public OrderRespError() {
    }

    /**
     * Initialization constructor.
     * @param  code  CodeEnum value for code.
     * @param  message  String value for message.
     */
    public OrderRespError(
            CodeEnum code,
            String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Getter for Code.
     * Error codes.
     * @return Returns the CodeEnum
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CodeEnum getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Error codes.
     * @param code Value for CodeEnum
     */
    @JsonSetter("code")
    public void setCode(CodeEnum code) {
        this.code = code;
    }

    /**
     * Getter for Message.
     * Error message.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * Error message.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Converts this OrderRespError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderRespError [" + "code=" + code + ", message=" + message + "]";
    }

    /**
     * Builds a new {@link OrderRespError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderRespError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .code(getCode())
                .message(getMessage());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderRespError}.
     */
    public static class Builder {
        private CodeEnum code;
        private String message;



        /**
         * Setter for code.
         * @param  code  CodeEnum value for code.
         * @return Builder
         */
        public Builder code(CodeEnum code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds a new {@link OrderRespError} object using the set fields.
         * @return {@link OrderRespError}
         */
        public OrderRespError build() {
            return new OrderRespError(code, message);
        }
    }
}
