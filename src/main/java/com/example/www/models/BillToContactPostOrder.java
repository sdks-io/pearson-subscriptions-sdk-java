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
 * This is a model class for BillToContactPostOrder type.
 */
public class BillToContactPostOrder {
    private String address1;
    private String address2;
    private String city;
    private String country;
    private String county;
    private String firstName;
    private String lastName;
    private String mobilePhone;
    private String personalEmail;
    private String postalCode;
    private String state;
    private String workEmail;
    private String workPhone;

    /**
     * Default constructor.
     */
    public BillToContactPostOrder() {
    }

    /**
     * Initialization constructor.
     * @param  address1  String value for address1.
     * @param  address2  String value for address2.
     * @param  city  String value for city.
     * @param  country  String value for country.
     * @param  county  String value for county.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  mobilePhone  String value for mobilePhone.
     * @param  personalEmail  String value for personalEmail.
     * @param  postalCode  String value for postalCode.
     * @param  state  String value for state.
     * @param  workEmail  String value for workEmail.
     * @param  workPhone  String value for workPhone.
     */
    public BillToContactPostOrder(
            String address1,
            String address2,
            String city,
            String country,
            String county,
            String firstName,
            String lastName,
            String mobilePhone,
            String personalEmail,
            String postalCode,
            String state,
            String workEmail,
            String workPhone) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.country = country;
        this.county = county;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobilePhone = mobilePhone;
        this.personalEmail = personalEmail;
        this.postalCode = postalCode;
        this.state = state;
        this.workEmail = workEmail;
        this.workPhone = workPhone;
    }

    /**
     * Getter for Address1.
     * First line of the contact's address. This is often a street address or a business name.
     * @return Returns the String
     */
    @JsonGetter("address1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddress1() {
        return address1;
    }

    /**
     * Setter for Address1.
     * First line of the contact's address. This is often a street address or a business name.
     * @param address1 Value for String
     */
    @JsonSetter("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * Getter for Address2.
     * Second line of the contact's address.
     * @return Returns the String
     */
    @JsonGetter("address2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddress2() {
        return address2;
    }

    /**
     * Setter for Address2.
     * Second line of the contact's address.
     * @param address2 Value for String
     */
    @JsonSetter("address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * Getter for City.
     * City of the contact's address.
     * @return Returns the String
     */
    @JsonGetter("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * City of the contact's address.
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for Country.
     * Country; must be a valid country name or abbreviation. If using Zuora Tax, you must specify a
     * country in the bill-to contact to calculate tax.
     * @return Returns the String
     */
    @JsonGetter("country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * Country; must be a valid country name or abbreviation. If using Zuora Tax, you must specify a
     * country in the bill-to contact to calculate tax.
     * @param country Value for String
     */
    @JsonSetter("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for County.
     * County of the contact's address.
     * @return Returns the String
     */
    @JsonGetter("county")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCounty() {
        return county;
    }

    /**
     * Setter for County.
     * County of the contact's address.
     * @param county Value for String
     */
    @JsonSetter("county")
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * Getter for FirstName.
     * First name of the contact.
     * @return Returns the String
     */
    @JsonGetter("firstName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * First name of the contact.
     * @param firstName Value for String
     */
    @JsonSetter("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * Last name of the contact.
     * @return Returns the String
     */
    @JsonGetter("lastName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * Last name of the contact.
     * @param lastName Value for String
     */
    @JsonSetter("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for MobilePhone.
     * Mobile phone number of the contact.
     * @return Returns the String
     */
    @JsonGetter("mobilePhone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Setter for MobilePhone.
     * Mobile phone number of the contact.
     * @param mobilePhone Value for String
     */
    @JsonSetter("mobilePhone")
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * Getter for PersonalEmail.
     * Personal email address of the contact.
     * @return Returns the String
     */
    @JsonGetter("personalEmail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPersonalEmail() {
        return personalEmail;
    }

    /**
     * Setter for PersonalEmail.
     * Personal email address of the contact.
     * @param personalEmail Value for String
     */
    @JsonSetter("personalEmail")
    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    /**
     * Getter for PostalCode.
     * ZIP code or other postal code of the contact's address.
     * @return Returns the String
     */
    @JsonGetter("postalCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Setter for PostalCode.
     * ZIP code or other postal code of the contact's address.
     * @param postalCode Value for String
     */
    @JsonSetter("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Getter for State.
     * State or province of the contact's address.
     * @return Returns the String
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * State or province of the contact's address.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for WorkEmail.
     * Business email address of the contact.
     * @return Returns the String
     */
    @JsonGetter("workEmail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWorkEmail() {
        return workEmail;
    }

    /**
     * Setter for WorkEmail.
     * Business email address of the contact.
     * @param workEmail Value for String
     */
    @JsonSetter("workEmail")
    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    /**
     * Getter for WorkPhone.
     * Business phone number of the contact.
     * @return Returns the String
     */
    @JsonGetter("workPhone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Setter for WorkPhone.
     * Business phone number of the contact.
     * @param workPhone Value for String
     */
    @JsonSetter("workPhone")
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    /**
     * Converts this BillToContactPostOrder into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BillToContactPostOrder [" + "address1=" + address1 + ", address2=" + address2
                + ", city=" + city + ", country=" + country + ", county=" + county + ", firstName="
                + firstName + ", lastName=" + lastName + ", mobilePhone=" + mobilePhone
                + ", personalEmail=" + personalEmail + ", postalCode=" + postalCode + ", state="
                + state + ", workEmail=" + workEmail + ", workPhone=" + workPhone + "]";
    }

    /**
     * Builds a new {@link BillToContactPostOrder.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BillToContactPostOrder.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .address1(getAddress1())
                .address2(getAddress2())
                .city(getCity())
                .country(getCountry())
                .county(getCounty())
                .firstName(getFirstName())
                .lastName(getLastName())
                .mobilePhone(getMobilePhone())
                .personalEmail(getPersonalEmail())
                .postalCode(getPostalCode())
                .state(getState())
                .workEmail(getWorkEmail())
                .workPhone(getWorkPhone());
        return builder;
    }

    /**
     * Class to build instances of {@link BillToContactPostOrder}.
     */
    public static class Builder {
        private String address1;
        private String address2;
        private String city;
        private String country;
        private String county;
        private String firstName;
        private String lastName;
        private String mobilePhone;
        private String personalEmail;
        private String postalCode;
        private String state;
        private String workEmail;
        private String workPhone;



        /**
         * Setter for address1.
         * @param  address1  String value for address1.
         * @return Builder
         */
        public Builder address1(String address1) {
            this.address1 = address1;
            return this;
        }

        /**
         * Setter for address2.
         * @param  address2  String value for address2.
         * @return Builder
         */
        public Builder address2(String address2) {
            this.address2 = address2;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  String value for country.
         * @return Builder
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * Setter for county.
         * @param  county  String value for county.
         * @return Builder
         */
        public Builder county(String county) {
            this.county = county;
            return this;
        }

        /**
         * Setter for firstName.
         * @param  firstName  String value for firstName.
         * @return Builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Setter for lastName.
         * @param  lastName  String value for lastName.
         * @return Builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Setter for mobilePhone.
         * @param  mobilePhone  String value for mobilePhone.
         * @return Builder
         */
        public Builder mobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }

        /**
         * Setter for personalEmail.
         * @param  personalEmail  String value for personalEmail.
         * @return Builder
         */
        public Builder personalEmail(String personalEmail) {
            this.personalEmail = personalEmail;
            return this;
        }

        /**
         * Setter for postalCode.
         * @param  postalCode  String value for postalCode.
         * @return Builder
         */
        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for workEmail.
         * @param  workEmail  String value for workEmail.
         * @return Builder
         */
        public Builder workEmail(String workEmail) {
            this.workEmail = workEmail;
            return this;
        }

        /**
         * Setter for workPhone.
         * @param  workPhone  String value for workPhone.
         * @return Builder
         */
        public Builder workPhone(String workPhone) {
            this.workPhone = workPhone;
            return this;
        }

        /**
         * Builds a new {@link BillToContactPostOrder} object using the set fields.
         * @return {@link BillToContactPostOrder}
         */
        public BillToContactPostOrder build() {
            return new BillToContactPostOrder(address1, address2, city, country, county, firstName,
                    lastName, mobilePhone, personalEmail, postalCode, state, workEmail, workPhone);
        }
    }
}
