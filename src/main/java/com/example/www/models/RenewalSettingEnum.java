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
 * RenewalSettingEnum to be used.
 */
public enum RenewalSettingEnum {
    RENEW_WITH_SPECIFIC_TERM,

    RENEW_TO_EVERGREEN;


    private static TreeMap<String, RenewalSettingEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        RENEW_WITH_SPECIFIC_TERM.value = "RENEW_WITH_SPECIFIC_TERM";
        RENEW_TO_EVERGREEN.value = "RENEW_TO_EVERGREEN";

        valueMap.put("RENEW_WITH_SPECIFIC_TERM", RENEW_WITH_SPECIFIC_TERM);
        valueMap.put("RENEW_TO_EVERGREEN", RENEW_TO_EVERGREEN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static RenewalSettingEnum constructFromString(String toConvert) throws IOException {
        RenewalSettingEnum enumValue = fromString(toConvert);
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
    public static RenewalSettingEnum fromString(String toConvert) {
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
     * Convert list of RenewalSettingEnum values to list of string values.
     * @param toConvert The list of RenewalSettingEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<RenewalSettingEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (RenewalSettingEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 