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
 * This is a model class for AddProductEndDate type.
 */
public class AddProductEndDate {
    private EndDateConditionEnum endDateCondition;
    private String specificEndDate;
    private Double upToPeriods;
    private String upToPeriodsType;

    /**
     * Default constructor.
     */
    public AddProductEndDate() {
    }

    /**
     * Initialization constructor.
     * @param  endDateCondition  EndDateConditionEnum value for endDateCondition.
     * @param  specificEndDate  String value for specificEndDate.
     * @param  upToPeriods  Double value for upToPeriods.
     * @param  upToPeriodsType  String value for upToPeriodsType.
     */
    public AddProductEndDate(
            EndDateConditionEnum endDateCondition,
            String specificEndDate,
            Double upToPeriods,
            String upToPeriodsType) {
        this.endDateCondition = endDateCondition;
        this.specificEndDate = specificEndDate;
        this.upToPeriods = upToPeriods;
        this.upToPeriodsType = upToPeriodsType;
    }

    /**
     * Getter for EndDateCondition.
     * enum values are "Subscription_End" "Fixed_Period" "Specific_End_Date"
     * @return Returns the EndDateConditionEnum
     */
    @JsonGetter("endDateCondition")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EndDateConditionEnum getEndDateCondition() {
        return endDateCondition;
    }

    /**
     * Setter for EndDateCondition.
     * enum values are "Subscription_End" "Fixed_Period" "Specific_End_Date"
     * @param endDateCondition Value for EndDateConditionEnum
     */
    @JsonSetter("endDateCondition")
    public void setEndDateCondition(EndDateConditionEnum endDateCondition) {
        this.endDateCondition = endDateCondition;
    }

    /**
     * Getter for SpecificEndDate.
     * @return Returns the String
     */
    @JsonGetter("specificEndDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSpecificEndDate() {
        return specificEndDate;
    }

    /**
     * Setter for SpecificEndDate.
     * @param specificEndDate Value for String
     */
    @JsonSetter("specificEndDate")
    public void setSpecificEndDate(String specificEndDate) {
        this.specificEndDate = specificEndDate;
    }

    /**
     * Getter for UpToPeriods.
     * @return Returns the Double
     */
    @JsonGetter("upToPeriods")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getUpToPeriods() {
        return upToPeriods;
    }

    /**
     * Setter for UpToPeriods.
     * @param upToPeriods Value for Double
     */
    @JsonSetter("upToPeriods")
    public void setUpToPeriods(Double upToPeriods) {
        this.upToPeriods = upToPeriods;
    }

    /**
     * Getter for UpToPeriodsType.
     * @return Returns the String
     */
    @JsonGetter("upToPeriodsType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpToPeriodsType() {
        return upToPeriodsType;
    }

    /**
     * Setter for UpToPeriodsType.
     * @param upToPeriodsType Value for String
     */
    @JsonSetter("upToPeriodsType")
    public void setUpToPeriodsType(String upToPeriodsType) {
        this.upToPeriodsType = upToPeriodsType;
    }

    /**
     * Converts this AddProductEndDate into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddProductEndDate [" + "endDateCondition=" + endDateCondition + ", specificEndDate="
                + specificEndDate + ", upToPeriods=" + upToPeriods + ", upToPeriodsType="
                + upToPeriodsType + "]";
    }

    /**
     * Builds a new {@link AddProductEndDate.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddProductEndDate.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .endDateCondition(getEndDateCondition())
                .specificEndDate(getSpecificEndDate())
                .upToPeriods(getUpToPeriods())
                .upToPeriodsType(getUpToPeriodsType());
        return builder;
    }

    /**
     * Class to build instances of {@link AddProductEndDate}.
     */
    public static class Builder {
        private EndDateConditionEnum endDateCondition;
        private String specificEndDate;
        private Double upToPeriods;
        private String upToPeriodsType;



        /**
         * Setter for endDateCondition.
         * @param  endDateCondition  EndDateConditionEnum value for endDateCondition.
         * @return Builder
         */
        public Builder endDateCondition(EndDateConditionEnum endDateCondition) {
            this.endDateCondition = endDateCondition;
            return this;
        }

        /**
         * Setter for specificEndDate.
         * @param  specificEndDate  String value for specificEndDate.
         * @return Builder
         */
        public Builder specificEndDate(String specificEndDate) {
            this.specificEndDate = specificEndDate;
            return this;
        }

        /**
         * Setter for upToPeriods.
         * @param  upToPeriods  Double value for upToPeriods.
         * @return Builder
         */
        public Builder upToPeriods(Double upToPeriods) {
            this.upToPeriods = upToPeriods;
            return this;
        }

        /**
         * Setter for upToPeriodsType.
         * @param  upToPeriodsType  String value for upToPeriodsType.
         * @return Builder
         */
        public Builder upToPeriodsType(String upToPeriodsType) {
            this.upToPeriodsType = upToPeriodsType;
            return this;
        }

        /**
         * Builds a new {@link AddProductEndDate} object using the set fields.
         * @return {@link AddProductEndDate}
         */
        public AddProductEndDate build() {
            return new AddProductEndDate(endDateCondition, specificEndDate, upToPeriods,
                    upToPeriodsType);
        }
    }
}
