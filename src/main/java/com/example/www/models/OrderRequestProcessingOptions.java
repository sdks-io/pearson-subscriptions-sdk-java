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
 * This is a model class for OrderRequestProcessingOptions type.
 */
public class OrderRequestProcessingOptions {
    private Boolean runBilling;
    private BillingOptions billingOptions;
    private Boolean collectPayment;

    /**
     * Default constructor.
     */
    public OrderRequestProcessingOptions() {
    }

    /**
     * Initialization constructor.
     * @param  runBilling  Boolean value for runBilling.
     * @param  billingOptions  BillingOptions value for billingOptions.
     * @param  collectPayment  Boolean value for collectPayment.
     */
    public OrderRequestProcessingOptions(
            Boolean runBilling,
            BillingOptions billingOptions,
            Boolean collectPayment) {
        this.runBilling = runBilling;
        this.billingOptions = billingOptions;
        this.collectPayment = collectPayment;
    }

    /**
     * Getter for RunBilling.
     * Indicates if the current request needs to generate an invoice. The invoice will be generated
     * against all subscriptions included in this order. For REDEMPTION, default it to true.
     * @return Returns the Boolean
     */
    @JsonGetter("runBilling")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRunBilling() {
        return runBilling;
    }

    /**
     * Setter for RunBilling.
     * Indicates if the current request needs to generate an invoice. The invoice will be generated
     * against all subscriptions included in this order. For REDEMPTION, default it to true.
     * @param runBilling Value for Boolean
     */
    @JsonSetter("runBilling")
    public void setRunBilling(Boolean runBilling) {
        this.runBilling = runBilling;
    }

    /**
     * Getter for BillingOptions.
     * @return Returns the BillingOptions
     */
    @JsonGetter("billingOptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillingOptions getBillingOptions() {
        return billingOptions;
    }

    /**
     * Setter for BillingOptions.
     * @param billingOptions Value for BillingOptions
     */
    @JsonSetter("billingOptions")
    public void setBillingOptions(BillingOptions billingOptions) {
        this.billingOptions = billingOptions;
    }

    /**
     * Getter for CollectPayment.
     * Indicates if the current request needs to collect payments. This value can not be 'true' when
     * 'runBilling' flag is 'false'.
     * @return Returns the Boolean
     */
    @JsonGetter("collectPayment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCollectPayment() {
        return collectPayment;
    }

    /**
     * Setter for CollectPayment.
     * Indicates if the current request needs to collect payments. This value can not be 'true' when
     * 'runBilling' flag is 'false'.
     * @param collectPayment Value for Boolean
     */
    @JsonSetter("collectPayment")
    public void setCollectPayment(Boolean collectPayment) {
        this.collectPayment = collectPayment;
    }

    /**
     * Converts this OrderRequestProcessingOptions into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderRequestProcessingOptions [" + "runBilling=" + runBilling + ", billingOptions="
                + billingOptions + ", collectPayment=" + collectPayment + "]";
    }

    /**
     * Builds a new {@link OrderRequestProcessingOptions.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderRequestProcessingOptions.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .runBilling(getRunBilling())
                .billingOptions(getBillingOptions())
                .collectPayment(getCollectPayment());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderRequestProcessingOptions}.
     */
    public static class Builder {
        private Boolean runBilling;
        private BillingOptions billingOptions;
        private Boolean collectPayment;



        /**
         * Setter for runBilling.
         * @param  runBilling  Boolean value for runBilling.
         * @return Builder
         */
        public Builder runBilling(Boolean runBilling) {
            this.runBilling = runBilling;
            return this;
        }

        /**
         * Setter for billingOptions.
         * @param  billingOptions  BillingOptions value for billingOptions.
         * @return Builder
         */
        public Builder billingOptions(BillingOptions billingOptions) {
            this.billingOptions = billingOptions;
            return this;
        }

        /**
         * Setter for collectPayment.
         * @param  collectPayment  Boolean value for collectPayment.
         * @return Builder
         */
        public Builder collectPayment(Boolean collectPayment) {
            this.collectPayment = collectPayment;
            return this;
        }

        /**
         * Builds a new {@link OrderRequestProcessingOptions} object using the set fields.
         * @return {@link OrderRequestProcessingOptions}
         */
        public OrderRequestProcessingOptions build() {
            return new OrderRequestProcessingOptions(runBilling, billingOptions, collectPayment);
        }
    }
}