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
 * This is a model class for Terms type.
 */
public class Terms {
    private InitialTerm initialTerm;
    private List<RenewalTerm> renewalTerms;
    private RenewalSettingEnum renewalSetting;
    private Boolean autoRenew;

    /**
     * Default constructor.
     */
    public Terms() {
    }

    /**
     * Initialization constructor.
     * @param  initialTerm  InitialTerm value for initialTerm.
     * @param  renewalTerms  List of RenewalTerm value for renewalTerms.
     * @param  renewalSetting  RenewalSettingEnum value for renewalSetting.
     * @param  autoRenew  Boolean value for autoRenew.
     */
    public Terms(
            InitialTerm initialTerm,
            List<RenewalTerm> renewalTerms,
            RenewalSettingEnum renewalSetting,
            Boolean autoRenew) {
        this.initialTerm = initialTerm;
        this.renewalTerms = renewalTerms;
        this.renewalSetting = renewalSetting;
        this.autoRenew = autoRenew;
    }

    /**
     * Getter for InitialTerm.
     * Information about the first term of the subscription.
     * @return Returns the InitialTerm
     */
    @JsonGetter("initialTerm")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InitialTerm getInitialTerm() {
        return initialTerm;
    }

    /**
     * Setter for InitialTerm.
     * Information about the first term of the subscription.
     * @param initialTerm Value for InitialTerm
     */
    @JsonSetter("initialTerm")
    public void setInitialTerm(InitialTerm initialTerm) {
        this.initialTerm = initialTerm;
    }

    /**
     * Getter for RenewalTerms.
     * List of renewal terms of the subscription. Only applicable if the type of the first term is
     * `TERMED` and the value of the `renewalSetting` field is `RENEW_WITH_SPECIFIC_TERM`.
     * @return Returns the List of RenewalTerm
     */
    @JsonGetter("renewalTerms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<RenewalTerm> getRenewalTerms() {
        return renewalTerms;
    }

    /**
     * Setter for RenewalTerms.
     * List of renewal terms of the subscription. Only applicable if the type of the first term is
     * `TERMED` and the value of the `renewalSetting` field is `RENEW_WITH_SPECIFIC_TERM`.
     * @param renewalTerms Value for List of RenewalTerm
     */
    @JsonSetter("renewalTerms")
    public void setRenewalTerms(List<RenewalTerm> renewalTerms) {
        this.renewalTerms = renewalTerms;
    }

    /**
     * Getter for RenewalSetting.
     * Specifies the type of the terms that follow the first term if the subscription is renewed.
     * Only applicable if the type of the first term is `TERMED`. * `RENEW_WITH_SPECIFIC_TERM` -
     * Each renewal term has a predefined duration. The first entry in `renewalTerms` specifies the
     * duration of the second term of the subscription, the second entry in `renewalTerms` specifies
     * the duration of the third term of the subscription, and so on. The last entry in
     * `renewalTerms` specifies the ultimate duration of each renewal term. * `RENEW_TO_EVERGREEN` -
     * The second term of the subscription does not have a predefined duration.
     * @return Returns the RenewalSettingEnum
     */
    @JsonGetter("renewalSetting")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RenewalSettingEnum getRenewalSetting() {
        return renewalSetting;
    }

    /**
     * Setter for RenewalSetting.
     * Specifies the type of the terms that follow the first term if the subscription is renewed.
     * Only applicable if the type of the first term is `TERMED`. * `RENEW_WITH_SPECIFIC_TERM` -
     * Each renewal term has a predefined duration. The first entry in `renewalTerms` specifies the
     * duration of the second term of the subscription, the second entry in `renewalTerms` specifies
     * the duration of the third term of the subscription, and so on. The last entry in
     * `renewalTerms` specifies the ultimate duration of each renewal term. * `RENEW_TO_EVERGREEN` -
     * The second term of the subscription does not have a predefined duration.
     * @param renewalSetting Value for RenewalSettingEnum
     */
    @JsonSetter("renewalSetting")
    public void setRenewalSetting(RenewalSettingEnum renewalSetting) {
        this.renewalSetting = renewalSetting;
    }

    /**
     * Getter for AutoRenew.
     * Specifies whether the subscription automatically renews at the end of the each term. For
     * REDEMPTION, default it to false.
     * @return Returns the Boolean
     */
    @JsonGetter("autoRenew")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAutoRenew() {
        return autoRenew;
    }

    /**
     * Setter for AutoRenew.
     * Specifies whether the subscription automatically renews at the end of the each term. For
     * REDEMPTION, default it to false.
     * @param autoRenew Value for Boolean
     */
    @JsonSetter("autoRenew")
    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * Converts this Terms into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Terms [" + "initialTerm=" + initialTerm + ", renewalTerms=" + renewalTerms
                + ", renewalSetting=" + renewalSetting + ", autoRenew=" + autoRenew + "]";
    }

    /**
     * Builds a new {@link Terms.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Terms.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .initialTerm(getInitialTerm())
                .renewalTerms(getRenewalTerms())
                .renewalSetting(getRenewalSetting())
                .autoRenew(getAutoRenew());
        return builder;
    }

    /**
     * Class to build instances of {@link Terms}.
     */
    public static class Builder {
        private InitialTerm initialTerm;
        private List<RenewalTerm> renewalTerms;
        private RenewalSettingEnum renewalSetting;
        private Boolean autoRenew;



        /**
         * Setter for initialTerm.
         * @param  initialTerm  InitialTerm value for initialTerm.
         * @return Builder
         */
        public Builder initialTerm(InitialTerm initialTerm) {
            this.initialTerm = initialTerm;
            return this;
        }

        /**
         * Setter for renewalTerms.
         * @param  renewalTerms  List of RenewalTerm value for renewalTerms.
         * @return Builder
         */
        public Builder renewalTerms(List<RenewalTerm> renewalTerms) {
            this.renewalTerms = renewalTerms;
            return this;
        }

        /**
         * Setter for renewalSetting.
         * @param  renewalSetting  RenewalSettingEnum value for renewalSetting.
         * @return Builder
         */
        public Builder renewalSetting(RenewalSettingEnum renewalSetting) {
            this.renewalSetting = renewalSetting;
            return this;
        }

        /**
         * Setter for autoRenew.
         * @param  autoRenew  Boolean value for autoRenew.
         * @return Builder
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * Builds a new {@link Terms} object using the set fields.
         * @return {@link Terms}
         */
        public Terms build() {
            return new Terms(initialTerm, renewalTerms, renewalSetting, autoRenew);
        }
    }
}