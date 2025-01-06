/*
 * PplusSubscriptionPapiLib
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
 * OrderTypeEnum to be used.
 */
public enum OrderTypeEnum {
    UPGRADE,

    DOWNGRADE,

    RENEWON,

    RENEWOFF,

    MIBUPGRADE,

    MIBRENEWON,

    MIBRENEWOFF;


    private static TreeMap<String, OrderTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        UPGRADE.value = "UPGRADE";
        DOWNGRADE.value = "DOWNGRADE";
        RENEWON.value = "RENEWON";
        RENEWOFF.value = "RENEWOFF";
        MIBUPGRADE.value = "MIBUPGRADE";
        MIBRENEWON.value = "MIBRENEWON";
        MIBRENEWOFF.value = "MIBRENEWOFF";

        valueMap.put("UPGRADE", UPGRADE);
        valueMap.put("DOWNGRADE", DOWNGRADE);
        valueMap.put("RENEWON", RENEWON);
        valueMap.put("RENEWOFF", RENEWOFF);
        valueMap.put("MIBUPGRADE", MIBUPGRADE);
        valueMap.put("MIBRENEWON", MIBRENEWON);
        valueMap.put("MIBRENEWOFF", MIBRENEWOFF);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static OrderTypeEnum constructFromString(String toConvert) throws IOException {
        OrderTypeEnum enumValue = fromString(toConvert);
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
    public static OrderTypeEnum fromString(String toConvert) {
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
     * Convert list of OrderTypeEnum values to list of string values.
     * @param toConvert The list of OrderTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OrderTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OrderTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 