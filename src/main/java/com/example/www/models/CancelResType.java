/*
 * PearsonSubscriptionsAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CancelResType type.
 */
public class CancelResType {
    private String message;

    /**
     * Default constructor.
     */
    public CancelResType() {
    }

    /**
     * Initialization constructor.
     * @param  message  String value for message.
     */
    public CancelResType(
            String message) {
        this.message = message;
    }

    /**
     * Getter for Message.
     * Response Message
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * Response Message
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Converts this CancelResType into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CancelResType [" + "message=" + message + "]";
    }

    /**
     * Builds a new {@link CancelResType.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CancelResType.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(message);
        return builder;
    }

    /**
     * Class to build instances of {@link CancelResType}.
     */
    public static class Builder {
        private String message;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  message  String value for message.
         */
        public Builder(String message) {
            this.message = message;
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
         * Builds a new {@link CancelResType} object using the set fields.
         * @return {@link CancelResType}
         */
        public CancelResType build() {
            return new CancelResType(message);
        }
    }
}
