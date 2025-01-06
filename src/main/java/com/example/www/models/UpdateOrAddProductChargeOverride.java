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
 * This is a model class for UpdateOrAddProductChargeOverride type.
 */
public class UpdateOrAddProductChargeOverride {
    private String productRatePlanChargeId;
    private CustomerFacingCustomFields customerFacingCustomFields;
    private OverridesPricing overridesPricing;
    private AddProductEndDate addProductEndDate;

    /**
     * Default constructor.
     */
    public UpdateOrAddProductChargeOverride() {
    }

    /**
     * Initialization constructor.
     * @param  productRatePlanChargeId  String value for productRatePlanChargeId.
     * @param  customerFacingCustomFields  CustomerFacingCustomFields value for
     *         customerFacingCustomFields.
     * @param  overridesPricing  OverridesPricing value for overridesPricing.
     * @param  addProductEndDate  AddProductEndDate value for addProductEndDate.
     */
    public UpdateOrAddProductChargeOverride(
            String productRatePlanChargeId,
            CustomerFacingCustomFields customerFacingCustomFields,
            OverridesPricing overridesPricing,
            AddProductEndDate addProductEndDate) {
        this.productRatePlanChargeId = productRatePlanChargeId;
        this.customerFacingCustomFields = customerFacingCustomFields;
        this.overridesPricing = overridesPricing;
        this.addProductEndDate = addProductEndDate;
    }

    /**
     * Getter for ProductRatePlanChargeId.
     * This is unique rate plan charge id respective to rate plan id. It signifies the subscription
     * type,entitlementLevel,maxEntitlements,numEntitlements etc.
     * @return Returns the String
     */
    @JsonGetter("productRatePlanChargeId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductRatePlanChargeId() {
        return productRatePlanChargeId;
    }

    /**
     * Setter for ProductRatePlanChargeId.
     * This is unique rate plan charge id respective to rate plan id. It signifies the subscription
     * type,entitlementLevel,maxEntitlements,numEntitlements etc.
     * @param productRatePlanChargeId Value for String
     */
    @JsonSetter("productRatePlanChargeId")
    public void setProductRatePlanChargeId(String productRatePlanChargeId) {
        this.productRatePlanChargeId = productRatePlanChargeId;
    }

    /**
     * Getter for CustomerFacingCustomFields.
     * @return Returns the CustomerFacingCustomFields
     */
    @JsonGetter("customerFacingCustomFields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomerFacingCustomFields getCustomerFacingCustomFields() {
        return customerFacingCustomFields;
    }

    /**
     * Setter for CustomerFacingCustomFields.
     * @param customerFacingCustomFields Value for CustomerFacingCustomFields
     */
    @JsonSetter("customerFacingCustomFields")
    public void setCustomerFacingCustomFields(CustomerFacingCustomFields customerFacingCustomFields) {
        this.customerFacingCustomFields = customerFacingCustomFields;
    }

    /**
     * Getter for OverridesPricing.
     * @return Returns the OverridesPricing
     */
    @JsonGetter("overridesPricing")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OverridesPricing getOverridesPricing() {
        return overridesPricing;
    }

    /**
     * Setter for OverridesPricing.
     * @param overridesPricing Value for OverridesPricing
     */
    @JsonSetter("overridesPricing")
    public void setOverridesPricing(OverridesPricing overridesPricing) {
        this.overridesPricing = overridesPricing;
    }

    /**
     * Getter for AddProductEndDate.
     * @return Returns the AddProductEndDate
     */
    @JsonGetter("addProductEndDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AddProductEndDate getAddProductEndDate() {
        return addProductEndDate;
    }

    /**
     * Setter for AddProductEndDate.
     * @param addProductEndDate Value for AddProductEndDate
     */
    @JsonSetter("addProductEndDate")
    public void setAddProductEndDate(AddProductEndDate addProductEndDate) {
        this.addProductEndDate = addProductEndDate;
    }

    /**
     * Converts this UpdateOrAddProductChargeOverride into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateOrAddProductChargeOverride [" + "productRatePlanChargeId="
                + productRatePlanChargeId + ", customerFacingCustomFields="
                + customerFacingCustomFields + ", overridesPricing=" + overridesPricing
                + ", addProductEndDate=" + addProductEndDate + "]";
    }

    /**
     * Builds a new {@link UpdateOrAddProductChargeOverride.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateOrAddProductChargeOverride.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .productRatePlanChargeId(getProductRatePlanChargeId())
                .customerFacingCustomFields(getCustomerFacingCustomFields())
                .overridesPricing(getOverridesPricing())
                .addProductEndDate(getAddProductEndDate());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateOrAddProductChargeOverride}.
     */
    public static class Builder {
        private String productRatePlanChargeId;
        private CustomerFacingCustomFields customerFacingCustomFields;
        private OverridesPricing overridesPricing;
        private AddProductEndDate addProductEndDate;



        /**
         * Setter for productRatePlanChargeId.
         * @param  productRatePlanChargeId  String value for productRatePlanChargeId.
         * @return Builder
         */
        public Builder productRatePlanChargeId(String productRatePlanChargeId) {
            this.productRatePlanChargeId = productRatePlanChargeId;
            return this;
        }

        /**
         * Setter for customerFacingCustomFields.
         * @param  customerFacingCustomFields  CustomerFacingCustomFields value for
         *         customerFacingCustomFields.
         * @return Builder
         */
        public Builder customerFacingCustomFields(
                CustomerFacingCustomFields customerFacingCustomFields) {
            this.customerFacingCustomFields = customerFacingCustomFields;
            return this;
        }

        /**
         * Setter for overridesPricing.
         * @param  overridesPricing  OverridesPricing value for overridesPricing.
         * @return Builder
         */
        public Builder overridesPricing(OverridesPricing overridesPricing) {
            this.overridesPricing = overridesPricing;
            return this;
        }

        /**
         * Setter for addProductEndDate.
         * @param  addProductEndDate  AddProductEndDate value for addProductEndDate.
         * @return Builder
         */
        public Builder addProductEndDate(AddProductEndDate addProductEndDate) {
            this.addProductEndDate = addProductEndDate;
            return this;
        }

        /**
         * Builds a new {@link UpdateOrAddProductChargeOverride} object using the set fields.
         * @return {@link UpdateOrAddProductChargeOverride}
         */
        public UpdateOrAddProductChargeOverride build() {
            return new UpdateOrAddProductChargeOverride(productRatePlanChargeId,
                    customerFacingCustomFields, overridesPricing, addProductEndDate);
        }
    }
}