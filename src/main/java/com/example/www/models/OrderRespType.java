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
 * This is a model class for OrderRespType type.
 */
public class OrderRespType {
    private String message;
    private String orderNumber;
    private String subscriptionNumber;

    /**
     * Default constructor.
     */
    public OrderRespType() {
    }

    /**
     * Initialization constructor.
     * @param  message  String value for message.
     * @param  orderNumber  String value for orderNumber.
     * @param  subscriptionNumber  String value for subscriptionNumber.
     */
    public OrderRespType(
            String message,
            String orderNumber,
            String subscriptionNumber) {
        this.message = message;
        this.orderNumber = orderNumber;
        this.subscriptionNumber = subscriptionNumber;
    }

    /**
     * Getter for Message.
     * message description once subscription creation is sucess.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * message description once subscription creation is sucess.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for OrderNumber.
     * order number.
     * @return Returns the String
     */
    @JsonGetter("orderNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Setter for OrderNumber.
     * order number.
     * @param orderNumber Value for String
     */
    @JsonSetter("orderNumber")
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * Getter for SubscriptionNumber.
     * subscription id.
     * @return Returns the String
     */
    @JsonGetter("subscriptionNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubscriptionNumber() {
        return subscriptionNumber;
    }

    /**
     * Setter for SubscriptionNumber.
     * subscription id.
     * @param subscriptionNumber Value for String
     */
    @JsonSetter("subscriptionNumber")
    public void setSubscriptionNumber(String subscriptionNumber) {
        this.subscriptionNumber = subscriptionNumber;
    }

    /**
     * Converts this OrderRespType into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderRespType [" + "message=" + message + ", orderNumber=" + orderNumber
                + ", subscriptionNumber=" + subscriptionNumber + "]";
    }

    /**
     * Builds a new {@link OrderRespType.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderRespType.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .message(getMessage())
                .orderNumber(getOrderNumber())
                .subscriptionNumber(getSubscriptionNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderRespType}.
     */
    public static class Builder {
        private String message;
        private String orderNumber;
        private String subscriptionNumber;



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
         * Setter for orderNumber.
         * @param  orderNumber  String value for orderNumber.
         * @return Builder
         */
        public Builder orderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        /**
         * Setter for subscriptionNumber.
         * @param  subscriptionNumber  String value for subscriptionNumber.
         * @return Builder
         */
        public Builder subscriptionNumber(String subscriptionNumber) {
            this.subscriptionNumber = subscriptionNumber;
            return this;
        }

        /**
         * Builds a new {@link OrderRespType} object using the set fields.
         * @return {@link OrderRespType}
         */
        public OrderRespType build() {
            return new OrderRespType(message, orderNumber, subscriptionNumber);
        }
    }
}