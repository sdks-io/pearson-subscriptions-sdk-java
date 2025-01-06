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
 * This is a model class for Discount type.
 */
public class Discount {
    private Double discountAmount;
    private Double discountPercentage;

    /**
     * Default constructor.
     */
    public Discount() {
    }

    /**
     * Initialization constructor.
     * @param  discountAmount  Double value for discountAmount.
     * @param  discountPercentage  Double value for discountPercentage.
     */
    public Discount(
            Double discountAmount,
            Double discountPercentage) {
        this.discountAmount = discountAmount;
        this.discountPercentage = discountPercentage;
    }

    /**
     * Getter for DiscountAmount.
     * Only applicable if the discount charge is a fixed-amount discount.
     * @return Returns the Double
     */
    @JsonGetter("discountAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Setter for DiscountAmount.
     * Only applicable if the discount charge is a fixed-amount discount.
     * @param discountAmount Value for Double
     */
    @JsonSetter("discountAmount")
    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * Getter for DiscountPercentage.
     * Only applicable if the discount charge is a percentage discount
     * @return Returns the Double
     */
    @JsonGetter("discountPercentage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * Setter for DiscountPercentage.
     * Only applicable if the discount charge is a percentage discount
     * @param discountPercentage Value for Double
     */
    @JsonSetter("discountPercentage")
    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    /**
     * Converts this Discount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Discount [" + "discountAmount=" + discountAmount + ", discountPercentage="
                + discountPercentage + "]";
    }

    /**
     * Builds a new {@link Discount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Discount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .discountAmount(getDiscountAmount())
                .discountPercentage(getDiscountPercentage());
        return builder;
    }

    /**
     * Class to build instances of {@link Discount}.
     */
    public static class Builder {
        private Double discountAmount;
        private Double discountPercentage;



        /**
         * Setter for discountAmount.
         * @param  discountAmount  Double value for discountAmount.
         * @return Builder
         */
        public Builder discountAmount(Double discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }

        /**
         * Setter for discountPercentage.
         * @param  discountPercentage  Double value for discountPercentage.
         * @return Builder
         */
        public Builder discountPercentage(Double discountPercentage) {
            this.discountPercentage = discountPercentage;
            return this;
        }

        /**
         * Builds a new {@link Discount} object using the set fields.
         * @return {@link Discount}
         */
        public Discount build() {
            return new Discount(discountAmount, discountPercentage);
        }
    }
}
