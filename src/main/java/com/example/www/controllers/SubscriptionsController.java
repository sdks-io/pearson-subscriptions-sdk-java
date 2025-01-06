/*
 * PplusSubscriptionPapiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.controllers;

import com.example.www.ApiHelper;
import com.example.www.Server;
import com.example.www.exceptions.ApiException;
import com.example.www.exceptions.AuthErrorTypeException;
import com.example.www.exceptions.InvalidReqTypeException;
import com.example.www.exceptions.OrderErrorTypeException;
import com.example.www.exceptions.OrderRespTypeErrorException;
import com.example.www.http.request.HttpMethod;
import com.example.www.models.CancelReqType;
import com.example.www.models.CancelResType;
import com.example.www.models.OrderRequestType;
import com.example.www.models.OrderRespType;
import com.example.www.models.UpdateSubscription;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SubscriptionsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SubscriptionsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * @param  xUserId  Required parameter: UserId of an user who bought a subscription. This will
     *         be an IES userId
     * @param  xAuthorization  Required parameter: This will be an IES system token
     * @param  body  Required parameter: Data
     * @param  xTransactionId  Optional parameter: Unique ID for a transaction
     * @return    Returns the OrderRespType response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public OrderRespType updateSubscription(
            final String xUserId,
            final String xAuthorization,
            final UpdateSubscription body,
            final String xTransactionId) throws ApiException, IOException {
        return prepareUpdateSubscriptionRequest(xUserId, xAuthorization, body,
                xTransactionId).execute();
    }

    /**
     * @param  xUserId  Required parameter: UserId of an user who bought a subscription. This will
     *         be an IES userId
     * @param  xAuthorization  Required parameter: This will be an IES system token
     * @param  body  Required parameter: Data
     * @param  xTransactionId  Optional parameter: Unique ID for a transaction
     * @return    Returns the OrderRespType response from the API call
     */
    public CompletableFuture<OrderRespType> updateSubscriptionAsync(
            final String xUserId,
            final String xAuthorization,
            final UpdateSubscription body,
            final String xTransactionId) {
        try { 
            return prepareUpdateSubscriptionRequest(xUserId, xAuthorization, body,
            xTransactionId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateSubscription.
     */
    private ApiCall<OrderRespType, ApiException> prepareUpdateSubscriptionRequest(
            final String xUserId,
            final String xAuthorization,
            final UpdateSubscription body,
            final String xTransactionId) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<OrderRespType, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v1/mojo/aggregate-subscription")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("X-UserId")
                                .value(xUserId).isRequired(false))
                        .headerParam(param -> param.key("X-Authorization")
                                .value(xAuthorization).isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("X-TransactionId")
                                .value(xTransactionId).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, OrderRespType.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new InvalidReqTypeException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new AuthErrorTypeException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new OrderErrorTypeException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Cancel subscription for a given subscription ID.
     * @param  userId  Required parameter: UserId of an user who bought a subscription. This will be
     *         an IES userId
     * @param  xAuthorization  Required parameter: This will be an IES system token
     * @param  body  Required parameter: Data
     * @param  xTransactionId  Optional parameter: Unique ID for a transaction
     * @param  origin  Optional parameter: Originating System
     * @return    Returns the CancelResType response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CancelResType cancelSubscription(
            final String userId,
            final String xAuthorization,
            final CancelReqType body,
            final String xTransactionId,
            final String origin) throws ApiException, IOException {
        return prepareCancelSubscriptionRequest(userId, xAuthorization, body, xTransactionId,
                origin).execute();
    }

    /**
     * Cancel subscription for a given subscription ID.
     * @param  userId  Required parameter: UserId of an user who bought a subscription. This will be
     *         an IES userId
     * @param  xAuthorization  Required parameter: This will be an IES system token
     * @param  body  Required parameter: Data
     * @param  xTransactionId  Optional parameter: Unique ID for a transaction
     * @param  origin  Optional parameter: Originating System
     * @return    Returns the CancelResType response from the API call
     */
    public CompletableFuture<CancelResType> cancelSubscriptionAsync(
            final String userId,
            final String xAuthorization,
            final CancelReqType body,
            final String xTransactionId,
            final String origin) {
        try { 
            return prepareCancelSubscriptionRequest(userId, xAuthorization, body, xTransactionId,
            origin).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for cancelSubscription.
     */
    private ApiCall<CancelResType, ApiException> prepareCancelSubscriptionRequest(
            final String userId,
            final String xAuthorization,
            final CancelReqType body,
            final String xTransactionId,
            final String origin) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<CancelResType, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v1/subscriptions/cancel")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("userId")
                                .value(userId).isRequired(false))
                        .headerParam(param -> param.key("X-Authorization")
                                .value(xAuthorization).isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("X-TransactionId")
                                .value(xTransactionId).isRequired(false))
                        .headerParam(param -> param.key("origin")
                                .value(origin).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CancelResType.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new InvalidReqTypeException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new AuthErrorTypeException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new OrderErrorTypeException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  xUserId  Required parameter: UserId of an user who bought a subscription. This will
     *         be an IES userId
     * @param  xAuthorization  Required parameter: This will be an IES system token
     * @param  body  Required parameter: Data
     * @param  xTransactionId  Optional parameter: Unique ID for a transaction
     * @return    Returns the OrderRespType response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public OrderRespType aggregateSubscription(
            final String xUserId,
            final String xAuthorization,
            final OrderRequestType body,
            final String xTransactionId) throws ApiException, IOException {
        return prepareAggregateSubscriptionRequest(xUserId, xAuthorization, body,
                xTransactionId).execute();
    }

    /**
     * @param  xUserId  Required parameter: UserId of an user who bought a subscription. This will
     *         be an IES userId
     * @param  xAuthorization  Required parameter: This will be an IES system token
     * @param  body  Required parameter: Data
     * @param  xTransactionId  Optional parameter: Unique ID for a transaction
     * @return    Returns the OrderRespType response from the API call
     */
    public CompletableFuture<OrderRespType> aggregateSubscriptionAsync(
            final String xUserId,
            final String xAuthorization,
            final OrderRequestType body,
            final String xTransactionId) {
        try { 
            return prepareAggregateSubscriptionRequest(xUserId, xAuthorization, body,
            xTransactionId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for aggregateSubscription.
     */
    private ApiCall<OrderRespType, ApiException> prepareAggregateSubscriptionRequest(
            final String xUserId,
            final String xAuthorization,
            final OrderRequestType body,
            final String xTransactionId) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<OrderRespType, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v1/mojo/aggregate-subscription")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("X-UserId")
                                .value(xUserId).isRequired(false))
                        .headerParam(param -> param.key("X-Authorization")
                                .value(xAuthorization).isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("X-TransactionId")
                                .value(xTransactionId).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, OrderRespType.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new InvalidReqTypeException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new AuthErrorTypeException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new OrderRespTypeErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Expire subscription for all past enddate internal and IA subscriptions.
     * @return    Returns the CancelResType response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CancelResType expireSubscriptions() throws ApiException, IOException {
        return prepareExpireSubscriptionsRequest().execute();
    }

    /**
     * Expire subscription for all past enddate internal and IA subscriptions.
     * @return    Returns the CancelResType response from the API call
     */
    public CompletableFuture<CancelResType> expireSubscriptionsAsync() {
        try { 
            return prepareExpireSubscriptionsRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for expireSubscriptions.
     */
    private ApiCall<CancelResType, ApiException> prepareExpireSubscriptionsRequest() throws IOException {
        return new ApiCall.Builder<CancelResType, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v1/subscriptions/expiry")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CancelResType.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new InvalidReqTypeException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new AuthErrorTypeException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new OrderErrorTypeException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}