/*
 * PplusSubscriptionPapiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for InvalidReqTypeError type.
 */
public class InvalidReqTypeError {
    private String code;
    private String message;

    /**
     * Default constructor.
     */
    public InvalidReqTypeError() {
    }

    /**
     * Initialization constructor.
     * @param  code  String value for code.
     * @param  message  String value for message.
     */
    public InvalidReqTypeError(
            String code,
            String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Getter for Code.
     * Error codes
     * @return Returns the String
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Error codes
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
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
     * Converts this InvalidReqTypeError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvalidReqTypeError [" + "code=" + code + ", message=" + message + "]";
    }

    /**
     * Builds a new {@link InvalidReqTypeError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvalidReqTypeError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .code(getCode())
                .message(getMessage());
        return builder;
    }

    /**
     * Class to build instances of {@link InvalidReqTypeError}.
     */
    public static class Builder {
        private String code;
        private String message;



        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
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
         * Builds a new {@link InvalidReqTypeError} object using the set fields.
         * @return {@link InvalidReqTypeError}
         */
        public InvalidReqTypeError build() {
            return new InvalidReqTypeError(code, message);
        }
    }
}
