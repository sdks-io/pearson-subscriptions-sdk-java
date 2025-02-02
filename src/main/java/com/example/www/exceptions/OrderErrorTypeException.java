/*
 * PearsonSubscriptionsAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.exceptions;

import com.example.www.models.OrderError;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for OrderErrorTypeException type.
 */
public class OrderErrorTypeException extends ApiException {
    private static final long serialVersionUID = 1894853969888173738L;
    private String orderNumber;
    private OrderError orderError;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public OrderErrorTypeException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for OrderNumber.
     * Order Number.
     * @return Returns the String
     */
    @JsonGetter("orderNumber")
    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     * Setter for OrderNumber.
     * Order Number.
     * @param orderNumber Value for String
     */
    @JsonSetter("orderNumber")
    private void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * Getter for OrderError.
     * @return Returns the OrderError
     */
    @JsonGetter("orderError")
    public OrderError getOrderError() {
        return this.orderError;
    }

    /**
     * Setter for OrderError.
     * @param orderError Value for OrderError
     */
    @JsonSetter("orderError")
    private void setOrderError(OrderError orderError) {
        this.orderError = orderError;
    }

    /**
     * Converts this OrderErrorTypeException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderErrorTypeException [" + "statusCode=" + getResponseCode() + ", message="
                + getMessage() + ", orderNumber=" + orderNumber + ", orderError=" + orderError
                + "]";
    }
}
