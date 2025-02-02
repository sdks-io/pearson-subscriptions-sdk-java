/*
 * PearsonSubscriptionsAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * UpToPeriodsTypeEnum to be used.
 */
public enum UpToPeriodsTypeEnum {
    BILLING_PERIODS,

    DAYS,

    WEEKS,

    MONTHS,

    YEARS;


    private static TreeMap<String, UpToPeriodsTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        BILLING_PERIODS.value = "Billing_Periods";
        DAYS.value = "Days";
        WEEKS.value = "Weeks";
        MONTHS.value = "Months";
        YEARS.value = "Years";

        valueMap.put("Billing_Periods", BILLING_PERIODS);
        valueMap.put("Days", DAYS);
        valueMap.put("Weeks", WEEKS);
        valueMap.put("Months", MONTHS);
        valueMap.put("Years", YEARS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static UpToPeriodsTypeEnum constructFromString(String toConvert) throws IOException {
        UpToPeriodsTypeEnum enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static UpToPeriodsTypeEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of UpToPeriodsTypeEnum values to list of string values.
     * @param toConvert The list of UpToPeriodsTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<UpToPeriodsTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (UpToPeriodsTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 