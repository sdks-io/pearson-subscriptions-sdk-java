/*
 * PplusSubscriptionPapiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.exceptions;

import com.example.www.models.AuthError;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for AuthErrorTypeException type.
 */
public class AuthErrorTypeException extends ApiException {
    private static final long serialVersionUID = -78256159493534644L;
    private AuthError authError;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public AuthErrorTypeException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for AuthError.
     * @return Returns the AuthError
     */
    @JsonGetter("authError")
    public AuthError getAuthError() {
        return this.authError;
    }

    /**
     * Setter for AuthError.
     * @param authError Value for AuthError
     */
    @JsonSetter("authError")
    private void setAuthError(AuthError authError) {
        this.authError = authError;
    }

    /**
     * Converts this AuthErrorTypeException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AuthErrorTypeException [" + "statusCode=" + getResponseCode() + ", message="
                + getMessage() + ", authError=" + authError + "]";
    }
}
