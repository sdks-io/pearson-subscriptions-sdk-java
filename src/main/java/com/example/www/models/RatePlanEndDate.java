/*
 * PplusSubscriptionPapiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.models;

import com.example.www.DateTimeHelper;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDate;

/**
 * This is a model class for RatePlanEndDate type.
 */
public class RatePlanEndDate {
    private EndDateConditionEnum endDateCondition;
    private LocalDate specificEndDate;
    private Double upToPeriods;
    private UpToPeriodsTypeEnum upToPeriodsType;

    /**
     * Default constructor.
     */
    public RatePlanEndDate() {
    }

    /**
     * Initialization constructor.
     * @param  endDateCondition  EndDateConditionEnum value for endDateCondition.
     * @param  specificEndDate  LocalDate value for specificEndDate.
     * @param  upToPeriods  Double value for upToPeriods.
     * @param  upToPeriodsType  UpToPeriodsTypeEnum value for upToPeriodsType.
     */
    public RatePlanEndDate(
            EndDateConditionEnum endDateCondition,
            LocalDate specificEndDate,
            Double upToPeriods,
            UpToPeriodsTypeEnum upToPeriodsType) {
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
     * @return Returns the LocalDate
     */
    @JsonGetter("specificEndDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getSpecificEndDate() {
        return specificEndDate;
    }

    /**
     * Setter for SpecificEndDate.
     * @param specificEndDate Value for LocalDate
     */
    @JsonSetter("specificEndDate")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setSpecificEndDate(LocalDate specificEndDate) {
        this.specificEndDate = specificEndDate;
    }

    /**
     * Getter for UpToPeriods.
     * Duration of the charge in billing periods, days, weeks, months, or years, depending on the
     * value of the upToPeriodsType field. Only applicable if the value of the endDateCondition
     * field is Fixed_Period.
     * @return Returns the Double
     */
    @JsonGetter("upToPeriods")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getUpToPeriods() {
        return upToPeriods;
    }

    /**
     * Setter for UpToPeriods.
     * Duration of the charge in billing periods, days, weeks, months, or years, depending on the
     * value of the upToPeriodsType field. Only applicable if the value of the endDateCondition
     * field is Fixed_Period.
     * @param upToPeriods Value for Double
     */
    @JsonSetter("upToPeriods")
    public void setUpToPeriods(Double upToPeriods) {
        this.upToPeriods = upToPeriods;
    }

    /**
     * Getter for UpToPeriodsType.
     * Unit of time that the charge duration is measured in. Only applicable if the value of the
     * endDateCondition field is Fixed_Period.
     * @return Returns the UpToPeriodsTypeEnum
     */
    @JsonGetter("upToPeriodsType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpToPeriodsTypeEnum getUpToPeriodsType() {
        return upToPeriodsType;
    }

    /**
     * Setter for UpToPeriodsType.
     * Unit of time that the charge duration is measured in. Only applicable if the value of the
     * endDateCondition field is Fixed_Period.
     * @param upToPeriodsType Value for UpToPeriodsTypeEnum
     */
    @JsonSetter("upToPeriodsType")
    public void setUpToPeriodsType(UpToPeriodsTypeEnum upToPeriodsType) {
        this.upToPeriodsType = upToPeriodsType;
    }

    /**
     * Converts this RatePlanEndDate into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RatePlanEndDate [" + "endDateCondition=" + endDateCondition + ", specificEndDate="
                + specificEndDate + ", upToPeriods=" + upToPeriods + ", upToPeriodsType="
                + upToPeriodsType + "]";
    }

    /**
     * Builds a new {@link RatePlanEndDate.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RatePlanEndDate.Builder} object
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
     * Class to build instances of {@link RatePlanEndDate}.
     */
    public static class Builder {
        private EndDateConditionEnum endDateCondition;
        private LocalDate specificEndDate;
        private Double upToPeriods;
        private UpToPeriodsTypeEnum upToPeriodsType;



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
         * @param  specificEndDate  LocalDate value for specificEndDate.
         * @return Builder
         */
        public Builder specificEndDate(LocalDate specificEndDate) {
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
         * @param  upToPeriodsType  UpToPeriodsTypeEnum value for upToPeriodsType.
         * @return Builder
         */
        public Builder upToPeriodsType(UpToPeriodsTypeEnum upToPeriodsType) {
            this.upToPeriodsType = upToPeriodsType;
            return this;
        }

        /**
         * Builds a new {@link RatePlanEndDate} object using the set fields.
         * @return {@link RatePlanEndDate}
         */
        public RatePlanEndDate build() {
            return new RatePlanEndDate(endDateCondition, specificEndDate, upToPeriods,
                    upToPeriodsType);
        }
    }
}