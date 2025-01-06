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
 * This is a model class for Account type.
 */
public class Account {
    private String accountNumber;
    private String additionalEmailAddresses;
    private String customerServiceRepName;
    private String purchaseOrderNumber;
    private String salesRep;
    private String sequenceSetId;
    private Boolean allowInvoiceEdit;
    private String name;
    private String currency;
    private Integer billCycleDay;
    private Boolean invoiceDeliveryPrefsPrint;
    private Boolean invoiceDeliveryPrefsEmail;
    private Boolean autoPay;
    private String paymentTerm;
    private String communicationProfileId;
    private String batch;
    private String invoiceTemplateId;
    private String debitMemoTemplateId;
    private String creditMemoTemplateId;
    private BillToContactPostOrder billToContact;
    private BillToContactPostOrder soldToContact;

    /**
     * Default constructor.
     */
    public Account() {
        allowInvoiceEdit = false;
        invoiceDeliveryPrefsPrint = false;
        invoiceDeliveryPrefsEmail = false;
        autoPay = true;
    }

    /**
     * Initialization constructor.
     * @param  accountNumber  String value for accountNumber.
     * @param  additionalEmailAddresses  String value for additionalEmailAddresses.
     * @param  customerServiceRepName  String value for customerServiceRepName.
     * @param  purchaseOrderNumber  String value for purchaseOrderNumber.
     * @param  salesRep  String value for salesRep.
     * @param  sequenceSetId  String value for sequenceSetId.
     * @param  allowInvoiceEdit  Boolean value for allowInvoiceEdit.
     * @param  name  String value for name.
     * @param  currency  String value for currency.
     * @param  billCycleDay  Integer value for billCycleDay.
     * @param  invoiceDeliveryPrefsPrint  Boolean value for invoiceDeliveryPrefsPrint.
     * @param  invoiceDeliveryPrefsEmail  Boolean value for invoiceDeliveryPrefsEmail.
     * @param  autoPay  Boolean value for autoPay.
     * @param  paymentTerm  String value for paymentTerm.
     * @param  communicationProfileId  String value for communicationProfileId.
     * @param  batch  String value for batch.
     * @param  invoiceTemplateId  String value for invoiceTemplateId.
     * @param  debitMemoTemplateId  String value for debitMemoTemplateId.
     * @param  creditMemoTemplateId  String value for creditMemoTemplateId.
     * @param  billToContact  BillToContactPostOrder value for billToContact.
     * @param  soldToContact  BillToContactPostOrder value for soldToContact.
     */
    public Account(
            String accountNumber,
            String additionalEmailAddresses,
            String customerServiceRepName,
            String purchaseOrderNumber,
            String salesRep,
            String sequenceSetId,
            Boolean allowInvoiceEdit,
            String name,
            String currency,
            Integer billCycleDay,
            Boolean invoiceDeliveryPrefsPrint,
            Boolean invoiceDeliveryPrefsEmail,
            Boolean autoPay,
            String paymentTerm,
            String communicationProfileId,
            String batch,
            String invoiceTemplateId,
            String debitMemoTemplateId,
            String creditMemoTemplateId,
            BillToContactPostOrder billToContact,
            BillToContactPostOrder soldToContact) {
        this.accountNumber = accountNumber;
        this.additionalEmailAddresses = additionalEmailAddresses;
        this.customerServiceRepName = customerServiceRepName;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.salesRep = salesRep;
        this.sequenceSetId = sequenceSetId;
        this.allowInvoiceEdit = allowInvoiceEdit;
        this.name = name;
        this.currency = currency;
        this.billCycleDay = billCycleDay;
        this.invoiceDeliveryPrefsPrint = invoiceDeliveryPrefsPrint;
        this.invoiceDeliveryPrefsEmail = invoiceDeliveryPrefsEmail;
        this.autoPay = autoPay;
        this.paymentTerm = paymentTerm;
        this.communicationProfileId = communicationProfileId;
        this.batch = batch;
        this.invoiceTemplateId = invoiceTemplateId;
        this.debitMemoTemplateId = debitMemoTemplateId;
        this.creditMemoTemplateId = creditMemoTemplateId;
        this.billToContact = billToContact;
        this.soldToContact = soldToContact;
    }

    /**
     * Getter for AccountNumber.
     * @return Returns the String
     */
    @JsonGetter("accountNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setter for AccountNumber.
     * @param accountNumber Value for String
     */
    @JsonSetter("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Getter for AdditionalEmailAddresses.
     * List of additional email addresses to receive emailed invoices. Values should be a
     * comma-separated list of email addresses.
     * @return Returns the String
     */
    @JsonGetter("additionalEmailAddresses")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAdditionalEmailAddresses() {
        return additionalEmailAddresses;
    }

    /**
     * Setter for AdditionalEmailAddresses.
     * List of additional email addresses to receive emailed invoices. Values should be a
     * comma-separated list of email addresses.
     * @param additionalEmailAddresses Value for String
     */
    @JsonSetter("additionalEmailAddresses")
    public void setAdditionalEmailAddresses(String additionalEmailAddresses) {
        this.additionalEmailAddresses = additionalEmailAddresses;
    }

    /**
     * Getter for CustomerServiceRepName.
     * Name of the account's customer service representative, if applicable.
     * @return Returns the String
     */
    @JsonGetter("customerServiceRepName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomerServiceRepName() {
        return customerServiceRepName;
    }

    /**
     * Setter for CustomerServiceRepName.
     * Name of the account's customer service representative, if applicable.
     * @param customerServiceRepName Value for String
     */
    @JsonSetter("customerServiceRepName")
    public void setCustomerServiceRepName(String customerServiceRepName) {
        this.customerServiceRepName = customerServiceRepName;
    }

    /**
     * Getter for PurchaseOrderNumber.
     * The number of the purchase order associated with this account. Purchase order information
     * generally comes from customers.
     * @return Returns the String
     */
    @JsonGetter("purchaseOrderNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Setter for PurchaseOrderNumber.
     * The number of the purchase order associated with this account. Purchase order information
     * generally comes from customers.
     * @param purchaseOrderNumber Value for String
     */
    @JsonSetter("purchaseOrderNumber")
    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    /**
     * Getter for SalesRep.
     * The name of the sales representative associated with this account, if applicable.
     * @return Returns the String
     */
    @JsonGetter("salesRep")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSalesRep() {
        return salesRep;
    }

    /**
     * Setter for SalesRep.
     * The name of the sales representative associated with this account, if applicable.
     * @param salesRep Value for String
     */
    @JsonSetter("salesRep")
    public void setSalesRep(String salesRep) {
        this.salesRep = salesRep;
    }

    /**
     * Getter for SequenceSetId.
     * The ID of the billing document sequence set to assign to the customer account. The billing
     * documents to generate for this account will adopt the prefix and starting document number
     * configured in the sequence set.
     * @return Returns the String
     */
    @JsonGetter("sequenceSetId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSequenceSetId() {
        return sequenceSetId;
    }

    /**
     * Setter for SequenceSetId.
     * The ID of the billing document sequence set to assign to the customer account. The billing
     * documents to generate for this account will adopt the prefix and starting document number
     * configured in the sequence set.
     * @param sequenceSetId Value for String
     */
    @JsonSetter("sequenceSetId")
    public void setSequenceSetId(String sequenceSetId) {
        this.sequenceSetId = sequenceSetId;
    }

    /**
     * Getter for AllowInvoiceEdit.
     * Indicates if associated invoices can be edited. Values are: * `true` * `false` (default)
     * @return Returns the Boolean
     */
    @JsonGetter("allowInvoiceEdit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAllowInvoiceEdit() {
        return allowInvoiceEdit;
    }

    /**
     * Setter for AllowInvoiceEdit.
     * Indicates if associated invoices can be edited. Values are: * `true` * `false` (default)
     * @param allowInvoiceEdit Value for Boolean
     */
    @JsonSetter("allowInvoiceEdit")
    public void setAllowInvoiceEdit(Boolean allowInvoiceEdit) {
        this.allowInvoiceEdit = allowInvoiceEdit;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Currency.
     * 3 uppercase character currency code
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * 3 uppercase character currency code
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for BillCycleDay.
     * Day of the month that the account prefers billing periods to begin on. If set to 0, the bill
     * cycle day will be set as "AutoSet".
     * @return Returns the Integer
     */
    @JsonGetter("billCycleDay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getBillCycleDay() {
        return billCycleDay;
    }

    /**
     * Setter for BillCycleDay.
     * Day of the month that the account prefers billing periods to begin on. If set to 0, the bill
     * cycle day will be set as "AutoSet".
     * @param billCycleDay Value for Integer
     */
    @JsonSetter("billCycleDay")
    public void setBillCycleDay(Integer billCycleDay) {
        this.billCycleDay = billCycleDay;
    }

    /**
     * Getter for InvoiceDeliveryPrefsPrint.
     * Specifies whether to turn on the invoice delivery method 'Print' for the new account. Values
     * are: * `true`. Turn on the invoice delivery method 'Print' for the new account. * `false`
     * (default). Turn off the invoice delivery method 'Print' for the new account.
     * @return Returns the Boolean
     */
    @JsonGetter("invoiceDeliveryPrefsPrint")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getInvoiceDeliveryPrefsPrint() {
        return invoiceDeliveryPrefsPrint;
    }

    /**
     * Setter for InvoiceDeliveryPrefsPrint.
     * Specifies whether to turn on the invoice delivery method 'Print' for the new account. Values
     * are: * `true`. Turn on the invoice delivery method 'Print' for the new account. * `false`
     * (default). Turn off the invoice delivery method 'Print' for the new account.
     * @param invoiceDeliveryPrefsPrint Value for Boolean
     */
    @JsonSetter("invoiceDeliveryPrefsPrint")
    public void setInvoiceDeliveryPrefsPrint(Boolean invoiceDeliveryPrefsPrint) {
        this.invoiceDeliveryPrefsPrint = invoiceDeliveryPrefsPrint;
    }

    /**
     * Getter for InvoiceDeliveryPrefsEmail.
     * Specifies whether to turn on the invoice delivery method 'Email' for the new account. Values
     * are: * `true` (default). Turn on the invoice delivery method 'Email' for the new account. *
     * `false`. Turn off the invoice delivery method 'Email' for the new account.
     * @return Returns the Boolean
     */
    @JsonGetter("invoiceDeliveryPrefsEmail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getInvoiceDeliveryPrefsEmail() {
        return invoiceDeliveryPrefsEmail;
    }

    /**
     * Setter for InvoiceDeliveryPrefsEmail.
     * Specifies whether to turn on the invoice delivery method 'Email' for the new account. Values
     * are: * `true` (default). Turn on the invoice delivery method 'Email' for the new account. *
     * `false`. Turn off the invoice delivery method 'Email' for the new account.
     * @param invoiceDeliveryPrefsEmail Value for Boolean
     */
    @JsonSetter("invoiceDeliveryPrefsEmail")
    public void setInvoiceDeliveryPrefsEmail(Boolean invoiceDeliveryPrefsEmail) {
        this.invoiceDeliveryPrefsEmail = invoiceDeliveryPrefsEmail;
    }

    /**
     * Getter for AutoPay.
     * Specifies whether future payments are to be automatically billed when they are due. Possible
     * values are `true`, `false`.
     * @return Returns the Boolean
     */
    @JsonGetter("autoPay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAutoPay() {
        return autoPay;
    }

    /**
     * Setter for AutoPay.
     * Specifies whether future payments are to be automatically billed when they are due. Possible
     * values are `true`, `false`.
     * @param autoPay Value for Boolean
     */
    @JsonSetter("autoPay")
    public void setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
    }

    /**
     * Getter for PaymentTerm.
     * @return Returns the String
     */
    @JsonGetter("paymentTerm")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Setter for PaymentTerm.
     * @param paymentTerm Value for String
     */
    @JsonSetter("paymentTerm")
    public void setPaymentTerm(String paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    /**
     * Getter for CommunicationProfileId.
     * aaa.
     * @return Returns the String
     */
    @JsonGetter("communicationProfileId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCommunicationProfileId() {
        return communicationProfileId;
    }

    /**
     * Setter for CommunicationProfileId.
     * aaa.
     * @param communicationProfileId Value for String
     */
    @JsonSetter("communicationProfileId")
    public void setCommunicationProfileId(String communicationProfileId) {
        this.communicationProfileId = communicationProfileId;
    }

    /**
     * Getter for Batch.
     * Organizes your customer accounts into groups to optimize your billing and payment operations.
     * @return Returns the String
     */
    @JsonGetter("batch")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBatch() {
        return batch;
    }

    /**
     * Setter for Batch.
     * Organizes your customer accounts into groups to optimize your billing and payment operations.
     * @param batch Value for String
     */
    @JsonSetter("batch")
    public void setBatch(String batch) {
        this.batch = batch;
    }

    /**
     * Getter for InvoiceTemplateId.
     * Invoice template ID, configured in Billing Settings.
     * @return Returns the String
     */
    @JsonGetter("invoiceTemplateId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInvoiceTemplateId() {
        return invoiceTemplateId;
    }

    /**
     * Setter for InvoiceTemplateId.
     * Invoice template ID, configured in Billing Settings.
     * @param invoiceTemplateId Value for String
     */
    @JsonSetter("invoiceTemplateId")
    public void setInvoiceTemplateId(String invoiceTemplateId) {
        this.invoiceTemplateId = invoiceTemplateId;
    }

    /**
     * Getter for DebitMemoTemplateId.
     * The unique ID of the debit memo template, configured in Billing Settings.
     * @return Returns the String
     */
    @JsonGetter("debitMemoTemplateId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDebitMemoTemplateId() {
        return debitMemoTemplateId;
    }

    /**
     * Setter for DebitMemoTemplateId.
     * The unique ID of the debit memo template, configured in Billing Settings.
     * @param debitMemoTemplateId Value for String
     */
    @JsonSetter("debitMemoTemplateId")
    public void setDebitMemoTemplateId(String debitMemoTemplateId) {
        this.debitMemoTemplateId = debitMemoTemplateId;
    }

    /**
     * Getter for CreditMemoTemplateId.
     * The unique ID of the credit memo template, configured in Billing Settings.
     * @return Returns the String
     */
    @JsonGetter("creditMemoTemplateId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreditMemoTemplateId() {
        return creditMemoTemplateId;
    }

    /**
     * Setter for CreditMemoTemplateId.
     * The unique ID of the credit memo template, configured in Billing Settings.
     * @param creditMemoTemplateId Value for String
     */
    @JsonSetter("creditMemoTemplateId")
    public void setCreditMemoTemplateId(String creditMemoTemplateId) {
        this.creditMemoTemplateId = creditMemoTemplateId;
    }

    /**
     * Getter for BillToContact.
     * @return Returns the BillToContactPostOrder
     */
    @JsonGetter("billToContact")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillToContactPostOrder getBillToContact() {
        return billToContact;
    }

    /**
     * Setter for BillToContact.
     * @param billToContact Value for BillToContactPostOrder
     */
    @JsonSetter("billToContact")
    public void setBillToContact(BillToContactPostOrder billToContact) {
        this.billToContact = billToContact;
    }

    /**
     * Getter for SoldToContact.
     * @return Returns the BillToContactPostOrder
     */
    @JsonGetter("soldToContact")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillToContactPostOrder getSoldToContact() {
        return soldToContact;
    }

    /**
     * Setter for SoldToContact.
     * @param soldToContact Value for BillToContactPostOrder
     */
    @JsonSetter("soldToContact")
    public void setSoldToContact(BillToContactPostOrder soldToContact) {
        this.soldToContact = soldToContact;
    }

    /**
     * Converts this Account into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Account [" + "accountNumber=" + accountNumber + ", additionalEmailAddresses="
                + additionalEmailAddresses + ", customerServiceRepName=" + customerServiceRepName
                + ", purchaseOrderNumber=" + purchaseOrderNumber + ", salesRep=" + salesRep
                + ", sequenceSetId=" + sequenceSetId + ", allowInvoiceEdit=" + allowInvoiceEdit
                + ", name=" + name + ", currency=" + currency + ", billCycleDay=" + billCycleDay
                + ", invoiceDeliveryPrefsPrint=" + invoiceDeliveryPrefsPrint
                + ", invoiceDeliveryPrefsEmail=" + invoiceDeliveryPrefsEmail + ", autoPay="
                + autoPay + ", paymentTerm=" + paymentTerm + ", communicationProfileId="
                + communicationProfileId + ", batch=" + batch + ", invoiceTemplateId="
                + invoiceTemplateId + ", debitMemoTemplateId=" + debitMemoTemplateId
                + ", creditMemoTemplateId=" + creditMemoTemplateId + ", billToContact="
                + billToContact + ", soldToContact=" + soldToContact + "]";
    }

    /**
     * Builds a new {@link Account.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Account.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accountNumber(getAccountNumber())
                .additionalEmailAddresses(getAdditionalEmailAddresses())
                .customerServiceRepName(getCustomerServiceRepName())
                .purchaseOrderNumber(getPurchaseOrderNumber())
                .salesRep(getSalesRep())
                .sequenceSetId(getSequenceSetId())
                .allowInvoiceEdit(getAllowInvoiceEdit())
                .name(getName())
                .currency(getCurrency())
                .billCycleDay(getBillCycleDay())
                .invoiceDeliveryPrefsPrint(getInvoiceDeliveryPrefsPrint())
                .invoiceDeliveryPrefsEmail(getInvoiceDeliveryPrefsEmail())
                .autoPay(getAutoPay())
                .paymentTerm(getPaymentTerm())
                .communicationProfileId(getCommunicationProfileId())
                .batch(getBatch())
                .invoiceTemplateId(getInvoiceTemplateId())
                .debitMemoTemplateId(getDebitMemoTemplateId())
                .creditMemoTemplateId(getCreditMemoTemplateId())
                .billToContact(getBillToContact())
                .soldToContact(getSoldToContact());
        return builder;
    }

    /**
     * Class to build instances of {@link Account}.
     */
    public static class Builder {
        private String accountNumber;
        private String additionalEmailAddresses;
        private String customerServiceRepName;
        private String purchaseOrderNumber;
        private String salesRep;
        private String sequenceSetId;
        private Boolean allowInvoiceEdit = false;
        private String name;
        private String currency;
        private Integer billCycleDay;
        private Boolean invoiceDeliveryPrefsPrint = false;
        private Boolean invoiceDeliveryPrefsEmail = false;
        private Boolean autoPay = true;
        private String paymentTerm;
        private String communicationProfileId;
        private String batch;
        private String invoiceTemplateId;
        private String debitMemoTemplateId;
        private String creditMemoTemplateId;
        private BillToContactPostOrder billToContact;
        private BillToContactPostOrder soldToContact;



        /**
         * Setter for accountNumber.
         * @param  accountNumber  String value for accountNumber.
         * @return Builder
         */
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        /**
         * Setter for additionalEmailAddresses.
         * @param  additionalEmailAddresses  String value for additionalEmailAddresses.
         * @return Builder
         */
        public Builder additionalEmailAddresses(String additionalEmailAddresses) {
            this.additionalEmailAddresses = additionalEmailAddresses;
            return this;
        }

        /**
         * Setter for customerServiceRepName.
         * @param  customerServiceRepName  String value for customerServiceRepName.
         * @return Builder
         */
        public Builder customerServiceRepName(String customerServiceRepName) {
            this.customerServiceRepName = customerServiceRepName;
            return this;
        }

        /**
         * Setter for purchaseOrderNumber.
         * @param  purchaseOrderNumber  String value for purchaseOrderNumber.
         * @return Builder
         */
        public Builder purchaseOrderNumber(String purchaseOrderNumber) {
            this.purchaseOrderNumber = purchaseOrderNumber;
            return this;
        }

        /**
         * Setter for salesRep.
         * @param  salesRep  String value for salesRep.
         * @return Builder
         */
        public Builder salesRep(String salesRep) {
            this.salesRep = salesRep;
            return this;
        }

        /**
         * Setter for sequenceSetId.
         * @param  sequenceSetId  String value for sequenceSetId.
         * @return Builder
         */
        public Builder sequenceSetId(String sequenceSetId) {
            this.sequenceSetId = sequenceSetId;
            return this;
        }

        /**
         * Setter for allowInvoiceEdit.
         * @param  allowInvoiceEdit  Boolean value for allowInvoiceEdit.
         * @return Builder
         */
        public Builder allowInvoiceEdit(Boolean allowInvoiceEdit) {
            this.allowInvoiceEdit = allowInvoiceEdit;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for billCycleDay.
         * @param  billCycleDay  Integer value for billCycleDay.
         * @return Builder
         */
        public Builder billCycleDay(Integer billCycleDay) {
            this.billCycleDay = billCycleDay;
            return this;
        }

        /**
         * Setter for invoiceDeliveryPrefsPrint.
         * @param  invoiceDeliveryPrefsPrint  Boolean value for invoiceDeliveryPrefsPrint.
         * @return Builder
         */
        public Builder invoiceDeliveryPrefsPrint(Boolean invoiceDeliveryPrefsPrint) {
            this.invoiceDeliveryPrefsPrint = invoiceDeliveryPrefsPrint;
            return this;
        }

        /**
         * Setter for invoiceDeliveryPrefsEmail.
         * @param  invoiceDeliveryPrefsEmail  Boolean value for invoiceDeliveryPrefsEmail.
         * @return Builder
         */
        public Builder invoiceDeliveryPrefsEmail(Boolean invoiceDeliveryPrefsEmail) {
            this.invoiceDeliveryPrefsEmail = invoiceDeliveryPrefsEmail;
            return this;
        }

        /**
         * Setter for autoPay.
         * @param  autoPay  Boolean value for autoPay.
         * @return Builder
         */
        public Builder autoPay(Boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Setter for paymentTerm.
         * @param  paymentTerm  String value for paymentTerm.
         * @return Builder
         */
        public Builder paymentTerm(String paymentTerm) {
            this.paymentTerm = paymentTerm;
            return this;
        }

        /**
         * Setter for communicationProfileId.
         * @param  communicationProfileId  String value for communicationProfileId.
         * @return Builder
         */
        public Builder communicationProfileId(String communicationProfileId) {
            this.communicationProfileId = communicationProfileId;
            return this;
        }

        /**
         * Setter for batch.
         * @param  batch  String value for batch.
         * @return Builder
         */
        public Builder batch(String batch) {
            this.batch = batch;
            return this;
        }

        /**
         * Setter for invoiceTemplateId.
         * @param  invoiceTemplateId  String value for invoiceTemplateId.
         * @return Builder
         */
        public Builder invoiceTemplateId(String invoiceTemplateId) {
            this.invoiceTemplateId = invoiceTemplateId;
            return this;
        }

        /**
         * Setter for debitMemoTemplateId.
         * @param  debitMemoTemplateId  String value for debitMemoTemplateId.
         * @return Builder
         */
        public Builder debitMemoTemplateId(String debitMemoTemplateId) {
            this.debitMemoTemplateId = debitMemoTemplateId;
            return this;
        }

        /**
         * Setter for creditMemoTemplateId.
         * @param  creditMemoTemplateId  String value for creditMemoTemplateId.
         * @return Builder
         */
        public Builder creditMemoTemplateId(String creditMemoTemplateId) {
            this.creditMemoTemplateId = creditMemoTemplateId;
            return this;
        }

        /**
         * Setter for billToContact.
         * @param  billToContact  BillToContactPostOrder value for billToContact.
         * @return Builder
         */
        public Builder billToContact(BillToContactPostOrder billToContact) {
            this.billToContact = billToContact;
            return this;
        }

        /**
         * Setter for soldToContact.
         * @param  soldToContact  BillToContactPostOrder value for soldToContact.
         * @return Builder
         */
        public Builder soldToContact(BillToContactPostOrder soldToContact) {
            this.soldToContact = soldToContact;
            return this;
        }

        /**
         * Builds a new {@link Account} object using the set fields.
         * @return {@link Account}
         */
        public Account build() {
            return new Account(accountNumber, additionalEmailAddresses, customerServiceRepName,
                    purchaseOrderNumber, salesRep, sequenceSetId, allowInvoiceEdit, name, currency,
                    billCycleDay, invoiceDeliveryPrefsPrint, invoiceDeliveryPrefsEmail, autoPay,
                    paymentTerm, communicationProfileId, batch, invoiceTemplateId,
                    debitMemoTemplateId, creditMemoTemplateId, billToContact, soldToContact);
        }
    }
}