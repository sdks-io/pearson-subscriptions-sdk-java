/*
 * PplusSubscriptionPapiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for CreateOrderOrderAction type.
 */
public class CreateOrderOrderAction {
    private TypeEnum type;
    private List<TriggerDate> triggerDates;
    private CreateSubscription createSubscription;

    /**
     * Default constructor.
     */
    public CreateOrderOrderAction() {
    }

    /**
     * Initialization constructor.
     * @param  type  TypeEnum value for type.
     * @param  triggerDates  List of TriggerDate value for triggerDates.
     * @param  createSubscription  CreateSubscription value for createSubscription.
     */
    public CreateOrderOrderAction(
            TypeEnum type,
            List<TriggerDate> triggerDates,
            CreateSubscription createSubscription) {
        this.type = type;
        this.triggerDates = triggerDates;
        this.createSubscription = createSubscription;
    }

    /**
     * Getter for Type.
     * @return Returns the TypeEnum
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for TypeEnum
     */
    @JsonSetter("type")
    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Getter for TriggerDates.
     * @return Returns the List of TriggerDate
     */
    @JsonGetter("triggerDates")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TriggerDate> getTriggerDates() {
        return triggerDates;
    }

    /**
     * Setter for TriggerDates.
     * @param triggerDates Value for List of TriggerDate
     */
    @JsonSetter("triggerDates")
    public void setTriggerDates(List<TriggerDate> triggerDates) {
        this.triggerDates = triggerDates;
    }

    /**
     * Getter for CreateSubscription.
     * Information about an order action of type `CreateSubscription`.
     * @return Returns the CreateSubscription
     */
    @JsonGetter("createSubscription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateSubscription getCreateSubscription() {
        return createSubscription;
    }

    /**
     * Setter for CreateSubscription.
     * Information about an order action of type `CreateSubscription`.
     * @param createSubscription Value for CreateSubscription
     */
    @JsonSetter("createSubscription")
    public void setCreateSubscription(CreateSubscription createSubscription) {
        this.createSubscription = createSubscription;
    }

    /**
     * Converts this CreateOrderOrderAction into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOrderOrderAction [" + "type=" + type + ", triggerDates=" + triggerDates
                + ", createSubscription=" + createSubscription + "]";
    }

    /**
     * Builds a new {@link CreateOrderOrderAction.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOrderOrderAction.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .type(getType())
                .triggerDates(getTriggerDates())
                .createSubscription(getCreateSubscription());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOrderOrderAction}.
     */
    public static class Builder {
        private TypeEnum type;
        private List<TriggerDate> triggerDates;
        private CreateSubscription createSubscription;



        /**
         * Setter for type.
         * @param  type  TypeEnum value for type.
         * @return Builder
         */
        public Builder type(TypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for triggerDates.
         * @param  triggerDates  List of TriggerDate value for triggerDates.
         * @return Builder
         */
        public Builder triggerDates(List<TriggerDate> triggerDates) {
            this.triggerDates = triggerDates;
            return this;
        }

        /**
         * Setter for createSubscription.
         * @param  createSubscription  CreateSubscription value for createSubscription.
         * @return Builder
         */
        public Builder createSubscription(CreateSubscription createSubscription) {
            this.createSubscription = createSubscription;
            return this;
        }

        /**
         * Builds a new {@link CreateOrderOrderAction} object using the set fields.
         * @return {@link CreateOrderOrderAction}
         */
        public CreateOrderOrderAction build() {
            return new CreateOrderOrderAction(type, triggerDates, createSubscription);
        }
    }
}