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
import java.util.List;

/**
 * This is a model class for OrderRequestType type.
 */
public class OrderRequestType {
    private String orderNumber;
    private LocalDate orderDate;
    private String description;
    private String subscriptionModelName;
    private String storeCode;
    private Boolean swapTitle;
    private Boolean sendEmail;
    private Account account;
    private List<OrderRequestTypeSubscription> orderRequestTypeSubscriptions;
    private OrderRequestProcessingOptions orderRequestProcessingOptions;
    private List<OrderRequestTypeProduct> orderRequestTypeProducts;
    private List<CustomField> customFields;
    private Object paymentCapture;

    /**
     * Default constructor.
     */
    public OrderRequestType() {
    }

    /**
     * Initialization constructor.
     * @param  orderNumber  String value for orderNumber.
     * @param  orderDate  LocalDate value for orderDate.
     * @param  description  String value for description.
     * @param  subscriptionModelName  String value for subscriptionModelName.
     * @param  storeCode  String value for storeCode.
     * @param  swapTitle  Boolean value for swapTitle.
     * @param  sendEmail  Boolean value for sendEmail.
     * @param  account  Account value for account.
     * @param  orderRequestTypeSubscriptions  List of OrderRequestTypeSubscription value for
     *         orderRequestTypeSubscriptions.
     * @param  orderRequestProcessingOptions  OrderRequestProcessingOptions value for
     *         orderRequestProcessingOptions.
     * @param  orderRequestTypeProducts  List of OrderRequestTypeProduct value for
     *         orderRequestTypeProducts.
     * @param  customFields  List of CustomField value for customFields.
     * @param  paymentCapture  Object value for paymentCapture.
     */
    public OrderRequestType(
            String orderNumber,
            LocalDate orderDate,
            String description,
            String subscriptionModelName,
            String storeCode,
            Boolean swapTitle,
            Boolean sendEmail,
            Account account,
            List<OrderRequestTypeSubscription> orderRequestTypeSubscriptions,
            OrderRequestProcessingOptions orderRequestProcessingOptions,
            List<OrderRequestTypeProduct> orderRequestTypeProducts,
            List<CustomField> customFields,
            Object paymentCapture) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.description = description;
        this.subscriptionModelName = subscriptionModelName;
        this.storeCode = storeCode;
        this.swapTitle = swapTitle;
        this.sendEmail = sendEmail;
        this.account = account;
        this.orderRequestTypeSubscriptions = orderRequestTypeSubscriptions;
        this.orderRequestProcessingOptions = orderRequestProcessingOptions;
        this.orderRequestTypeProducts = orderRequestTypeProducts;
        this.customFields = customFields;
        this.paymentCapture = paymentCapture;
    }

    /**
     * Getter for OrderNumber.
     * Hybris/PMC/OASIS Order Number.
     * @return Returns the String
     */
    @JsonGetter("orderNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Setter for OrderNumber.
     * Hybris/PMC/OASIS Order Number.
     * @param orderNumber Value for String
     */
    @JsonSetter("orderNumber")
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * Getter for OrderDate.
     * The date when the order is signed. All the order actions under this order will use this order
     * date as the contract effective date if the contract effective date field is skipped or its
     * value is left as null.
     * @return Returns the LocalDate
     */
    @JsonGetter("orderDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getOrderDate() {
        return orderDate;
    }

    /**
     * Setter for OrderDate.
     * The date when the order is signed. All the order actions under this order will use this order
     * date as the contract effective date if the contract effective date field is skipped or its
     * value is left as null.
     * @param orderDate Value for LocalDate
     */
    @JsonSetter("orderDate")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * Getter for Description.
     * A description of the order.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * A description of the order.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for SubscriptionModelName.
     * Subscription Model Name.
     * @return Returns the String
     */
    @JsonGetter("subscriptionModelName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubscriptionModelName() {
        return subscriptionModelName;
    }

    /**
     * Setter for SubscriptionModelName.
     * Subscription Model Name.
     * @param subscriptionModelName Value for String
     */
    @JsonSetter("subscriptionModelName")
    public void setSubscriptionModelName(String subscriptionModelName) {
        this.subscriptionModelName = subscriptionModelName;
    }

    /**
     * Getter for StoreCode.
     * store identifier
     * @return Returns the String
     */
    @JsonGetter("storeCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStoreCode() {
        return storeCode;
    }

    /**
     * Setter for StoreCode.
     * store identifier
     * @param storeCode Value for String
     */
    @JsonSetter("storeCode")
    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    /**
     * Getter for SwapTitle.
     * Use for swapTitle.If swaptitle than value will be true.
     * @return Returns the Boolean
     */
    @JsonGetter("swapTitle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSwapTitle() {
        return swapTitle;
    }

    /**
     * Setter for SwapTitle.
     * Use for swapTitle.If swaptitle than value will be true.
     * @param swapTitle Value for Boolean
     */
    @JsonSetter("swapTitle")
    public void setSwapTitle(Boolean swapTitle) {
        this.swapTitle = swapTitle;
    }

    /**
     * Getter for SendEmail.
     * send email to the user
     * @return Returns the Boolean
     */
    @JsonGetter("sendEmail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSendEmail() {
        return sendEmail;
    }

    /**
     * Setter for SendEmail.
     * send email to the user
     * @param sendEmail Value for Boolean
     */
    @JsonSetter("sendEmail")
    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    /**
     * Getter for Account.
     * @return Returns the Account
     */
    @JsonGetter("account")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Account getAccount() {
        return account;
    }

    /**
     * Setter for Account.
     * @param account Value for Account
     */
    @JsonSetter("account")
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * Getter for OrderRequestTypeSubscriptions.
     * new account details required to create subscription. This block is mandate for new customer
     * @return Returns the List of OrderRequestTypeSubscription
     */
    @JsonGetter("orderRequestTypeSubscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrderRequestTypeSubscription> getOrderRequestTypeSubscriptions() {
        return orderRequestTypeSubscriptions;
    }

    /**
     * Setter for OrderRequestTypeSubscriptions.
     * new account details required to create subscription. This block is mandate for new customer
     * @param orderRequestTypeSubscriptions Value for List of OrderRequestTypeSubscription
     */
    @JsonSetter("orderRequestTypeSubscriptions")
    public void setOrderRequestTypeSubscriptions(List<OrderRequestTypeSubscription> orderRequestTypeSubscriptions) {
        this.orderRequestTypeSubscriptions = orderRequestTypeSubscriptions;
    }

    /**
     * Getter for OrderRequestProcessingOptions.
     * Invoice or Payment.
     * @return Returns the OrderRequestProcessingOptions
     */
    @JsonGetter("orderRequestProcessingOptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderRequestProcessingOptions getOrderRequestProcessingOptions() {
        return orderRequestProcessingOptions;
    }

    /**
     * Setter for OrderRequestProcessingOptions.
     * Invoice or Payment.
     * @param orderRequestProcessingOptions Value for OrderRequestProcessingOptions
     */
    @JsonSetter("orderRequestProcessingOptions")
    public void setOrderRequestProcessingOptions(OrderRequestProcessingOptions orderRequestProcessingOptions) {
        this.orderRequestProcessingOptions = orderRequestProcessingOptions;
    }

    /**
     * Getter for OrderRequestTypeProducts.
     * @return Returns the List of OrderRequestTypeProduct
     */
    @JsonGetter("orderRequestTypeProducts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrderRequestTypeProduct> getOrderRequestTypeProducts() {
        return orderRequestTypeProducts;
    }

    /**
     * Setter for OrderRequestTypeProducts.
     * @param orderRequestTypeProducts Value for List of OrderRequestTypeProduct
     */
    @JsonSetter("orderRequestTypeProducts")
    public void setOrderRequestTypeProducts(List<OrderRequestTypeProduct> orderRequestTypeProducts) {
        this.orderRequestTypeProducts = orderRequestTypeProducts;
    }

    /**
     * Getter for CustomFields.
     * Information about the payment related fields.
     * @return Returns the List of CustomField
     */
    @JsonGetter("customFields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CustomField> getCustomFields() {
        return customFields;
    }

    /**
     * Setter for CustomFields.
     * Information about the payment related fields.
     * @param customFields Value for List of CustomField
     */
    @JsonSetter("customFields")
    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }

    /**
     * Getter for PaymentCapture.
     * @return Returns the Object
     */
    @JsonGetter("paymentCapture")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getPaymentCapture() {
        return paymentCapture;
    }

    /**
     * Setter for PaymentCapture.
     * @param paymentCapture Value for Object
     */
    @JsonSetter("paymentCapture")
    public void setPaymentCapture(Object paymentCapture) {
        this.paymentCapture = paymentCapture;
    }

    /**
     * Converts this OrderRequestType into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderRequestType [" + "orderNumber=" + orderNumber + ", orderDate=" + orderDate
                + ", description=" + description + ", subscriptionModelName="
                + subscriptionModelName + ", storeCode=" + storeCode + ", swapTitle=" + swapTitle
                + ", sendEmail=" + sendEmail + ", account=" + account
                + ", orderRequestTypeSubscriptions=" + orderRequestTypeSubscriptions
                + ", orderRequestProcessingOptions=" + orderRequestProcessingOptions
                + ", orderRequestTypeProducts=" + orderRequestTypeProducts + ", customFields="
                + customFields + ", paymentCapture=" + paymentCapture + "]";
    }

    /**
     * Builds a new {@link OrderRequestType.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderRequestType.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .orderNumber(getOrderNumber())
                .orderDate(getOrderDate())
                .description(getDescription())
                .subscriptionModelName(getSubscriptionModelName())
                .storeCode(getStoreCode())
                .swapTitle(getSwapTitle())
                .sendEmail(getSendEmail())
                .account(getAccount())
                .orderRequestTypeSubscriptions(getOrderRequestTypeSubscriptions())
                .orderRequestProcessingOptions(getOrderRequestProcessingOptions())
                .orderRequestTypeProducts(getOrderRequestTypeProducts())
                .customFields(getCustomFields())
                .paymentCapture(getPaymentCapture());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderRequestType}.
     */
    public static class Builder {
        private String orderNumber;
        private LocalDate orderDate;
        private String description;
        private String subscriptionModelName;
        private String storeCode;
        private Boolean swapTitle;
        private Boolean sendEmail;
        private Account account;
        private List<OrderRequestTypeSubscription> orderRequestTypeSubscriptions;
        private OrderRequestProcessingOptions orderRequestProcessingOptions;
        private List<OrderRequestTypeProduct> orderRequestTypeProducts;
        private List<CustomField> customFields;
        private Object paymentCapture;



        /**
         * Setter for orderNumber.
         * @param  orderNumber  String value for orderNumber.
         * @return Builder
         */
        public Builder orderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        /**
         * Setter for orderDate.
         * @param  orderDate  LocalDate value for orderDate.
         * @return Builder
         */
        public Builder orderDate(LocalDate orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for subscriptionModelName.
         * @param  subscriptionModelName  String value for subscriptionModelName.
         * @return Builder
         */
        public Builder subscriptionModelName(String subscriptionModelName) {
            this.subscriptionModelName = subscriptionModelName;
            return this;
        }

        /**
         * Setter for storeCode.
         * @param  storeCode  String value for storeCode.
         * @return Builder
         */
        public Builder storeCode(String storeCode) {
            this.storeCode = storeCode;
            return this;
        }

        /**
         * Setter for swapTitle.
         * @param  swapTitle  Boolean value for swapTitle.
         * @return Builder
         */
        public Builder swapTitle(Boolean swapTitle) {
            this.swapTitle = swapTitle;
            return this;
        }

        /**
         * Setter for sendEmail.
         * @param  sendEmail  Boolean value for sendEmail.
         * @return Builder
         */
        public Builder sendEmail(Boolean sendEmail) {
            this.sendEmail = sendEmail;
            return this;
        }

        /**
         * Setter for account.
         * @param  account  Account value for account.
         * @return Builder
         */
        public Builder account(Account account) {
            this.account = account;
            return this;
        }

        /**
         * Setter for orderRequestTypeSubscriptions.
         * @param  orderRequestTypeSubscriptions  List of OrderRequestTypeSubscription value for
         *         orderRequestTypeSubscriptions.
         * @return Builder
         */
        public Builder orderRequestTypeSubscriptions(
                List<OrderRequestTypeSubscription> orderRequestTypeSubscriptions) {
            this.orderRequestTypeSubscriptions = orderRequestTypeSubscriptions;
            return this;
        }

        /**
         * Setter for orderRequestProcessingOptions.
         * @param  orderRequestProcessingOptions  OrderRequestProcessingOptions value for
         *         orderRequestProcessingOptions.
         * @return Builder
         */
        public Builder orderRequestProcessingOptions(
                OrderRequestProcessingOptions orderRequestProcessingOptions) {
            this.orderRequestProcessingOptions = orderRequestProcessingOptions;
            return this;
        }

        /**
         * Setter for orderRequestTypeProducts.
         * @param  orderRequestTypeProducts  List of OrderRequestTypeProduct value for
         *         orderRequestTypeProducts.
         * @return Builder
         */
        public Builder orderRequestTypeProducts(
                List<OrderRequestTypeProduct> orderRequestTypeProducts) {
            this.orderRequestTypeProducts = orderRequestTypeProducts;
            return this;
        }

        /**
         * Setter for customFields.
         * @param  customFields  List of CustomField value for customFields.
         * @return Builder
         */
        public Builder customFields(List<CustomField> customFields) {
            this.customFields = customFields;
            return this;
        }

        /**
         * Setter for paymentCapture.
         * @param  paymentCapture  Object value for paymentCapture.
         * @return Builder
         */
        public Builder paymentCapture(Object paymentCapture) {
            this.paymentCapture = paymentCapture;
            return this;
        }

        /**
         * Builds a new {@link OrderRequestType} object using the set fields.
         * @return {@link OrderRequestType}
         */
        public OrderRequestType build() {
            return new OrderRequestType(orderNumber, orderDate, description, subscriptionModelName,
                    storeCode, swapTitle, sendEmail, account, orderRequestTypeSubscriptions,
                    orderRequestProcessingOptions, orderRequestTypeProducts, customFields,
                    paymentCapture);
        }
    }
}
