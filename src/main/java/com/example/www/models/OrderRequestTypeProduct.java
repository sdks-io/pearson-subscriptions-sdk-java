/*
 * PearsonSubscriptionsAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for OrderRequestTypeProduct type.
 */
public class OrderRequestTypeProduct {
    private String isbn;
    private String ppid;
    private Double duration;
    private Double tax;
    private Double price;

    /**
     * Default constructor.
     */
    public OrderRequestTypeProduct() {
    }

    /**
     * Initialization constructor.
     * @param  isbn  String value for isbn.
     * @param  ppid  String value for ppid.
     * @param  duration  Double value for duration.
     * @param  tax  Double value for tax.
     * @param  price  Double value for price.
     */
    public OrderRequestTypeProduct(
            String isbn,
            String ppid,
            Double duration,
            Double tax,
            Double price) {
        this.isbn = isbn;
        this.ppid = ppid;
        this.duration = duration;
        this.tax = tax;
        this.price = price;
    }

    /**
     * Getter for Isbn.
     * product isbn value
     * @return Returns the String
     */
    @JsonGetter("isbn")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIsbn() {
        return isbn;
    }

    /**
     * Setter for Isbn.
     * product isbn value
     * @param isbn Value for String
     */
    @JsonSetter("isbn")
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Getter for Ppid.
     * product ppid value
     * @return Returns the String
     */
    @JsonGetter("ppid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPpid() {
        return ppid;
    }

    /**
     * Setter for Ppid.
     * product ppid value
     * @param ppid Value for String
     */
    @JsonSetter("ppid")
    public void setPpid(String ppid) {
        this.ppid = ppid;
    }

    /**
     * Getter for Duration.
     * Duration of the entitlement in days for this product
     * @return Returns the Double
     */
    @JsonGetter("duration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getDuration() {
        return duration;
    }

    /**
     * Setter for Duration.
     * Duration of the entitlement in days for this product
     * @param duration Value for Double
     */
    @JsonSetter("duration")
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * Getter for Tax.
     * Cost of tax on the product
     * @return Returns the Double
     */
    @JsonGetter("tax")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getTax() {
        return tax;
    }

    /**
     * Setter for Tax.
     * Cost of tax on the product
     * @param tax Value for Double
     */
    @JsonSetter("tax")
    public void setTax(Double tax) {
        this.tax = tax;
    }

    /**
     * Getter for Price.
     * Cost of the product
     * @return Returns the Double
     */
    @JsonGetter("price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getPrice() {
        return price;
    }

    /**
     * Setter for Price.
     * Cost of the product
     * @param price Value for Double
     */
    @JsonSetter("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Converts this OrderRequestTypeProduct into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderRequestTypeProduct [" + "isbn=" + isbn + ", ppid=" + ppid + ", duration="
                + duration + ", tax=" + tax + ", price=" + price + "]";
    }

    /**
     * Builds a new {@link OrderRequestTypeProduct.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderRequestTypeProduct.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .isbn(getIsbn())
                .ppid(getPpid())
                .duration(getDuration())
                .tax(getTax())
                .price(getPrice());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderRequestTypeProduct}.
     */
    public static class Builder {
        private String isbn;
        private String ppid;
        private Double duration;
        private Double tax;
        private Double price;



        /**
         * Setter for isbn.
         * @param  isbn  String value for isbn.
         * @return Builder
         */
        public Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        /**
         * Setter for ppid.
         * @param  ppid  String value for ppid.
         * @return Builder
         */
        public Builder ppid(String ppid) {
            this.ppid = ppid;
            return this;
        }

        /**
         * Setter for duration.
         * @param  duration  Double value for duration.
         * @return Builder
         */
        public Builder duration(Double duration) {
            this.duration = duration;
            return this;
        }

        /**
         * Setter for tax.
         * @param  tax  Double value for tax.
         * @return Builder
         */
        public Builder tax(Double tax) {
            this.tax = tax;
            return this;
        }

        /**
         * Setter for price.
         * @param  price  Double value for price.
         * @return Builder
         */
        public Builder price(Double price) {
            this.price = price;
            return this;
        }

        /**
         * Builds a new {@link OrderRequestTypeProduct} object using the set fields.
         * @return {@link OrderRequestTypeProduct}
         */
        public OrderRequestTypeProduct build() {
            return new OrderRequestTypeProduct(isbn, ppid, duration, tax, price);
        }
    }
}
