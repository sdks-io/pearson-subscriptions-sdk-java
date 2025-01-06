# Subscriptions

```java
SubscriptionsController subscriptionsController = client.getSubscriptionsController();
```

## Class Name

`SubscriptionsController`

## Methods

* [Update Subscription](../../doc/controllers/subscriptions.md#update-subscription)
* [Cancel Subscription](../../doc/controllers/subscriptions.md#cancel-subscription)
* [Aggregate Subscription](../../doc/controllers/subscriptions.md#aggregate-subscription)
* [Expire Subscriptions](../../doc/controllers/subscriptions.md#expire-subscriptions)


# Update Subscription

```java
CompletableFuture<OrderRespType> updateSubscriptionAsync(
    final String xUserId,
    final String xAuthorization,
    final UpdateSubscription body,
    final String xTransactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `xUserId` | `String` | Header, Required | UserId of an user who bought a subscription. This will be an IES userId |
| `xAuthorization` | `String` | Header, Required | This will be an IES system token |
| `body` | [`UpdateSubscription`](../../doc/models/update-subscription.md) | Body, Required | Data |
| `xTransactionId` | `String` | Header, Optional | Unique ID for a transaction |

## Response Type

[`OrderRespType`](../../doc/models/order-resp-type.md)

## Example Usage

```java
String xUserId = "X-UserId4";
String xAuthorization = "X-Authorization6";
UpdateSubscription body = new UpdateSubscription.Builder(
    OrderTypeEnum.UPGRADE
)
.orderNumber("10034567")
.description("Sample description of the API")
.existingAccountNumber("A000000001")
.updateSubscriptionProducts(Arrays.asList(
        new Product.Builder()
            .isbn("20045634128")
            .ppid("A101702992101")
            .endDate("2021-05-14T07:12:27.152-0500")
            .build(),
        new Product.Builder()
            .isbn("10045634128")
            .ppid("A101702992102")
            .endDate("2021-05-14T07:12:27.152-0500")
            .build()
    ))
.customFields(Arrays.asList(
        new CustomField.Builder()
            .name("paymentMethod__c")
            .value("CREDIT CARD")
            .build(),
        new CustomField.Builder()
            .name("paymentInfo__c")
            .value("CREDIT CARD")
            .build(),
        new CustomField.Builder()
            .name("paymentToken__c")
            .value("4111111111111111")
            .build(),
        new CustomField.Builder()
            .name("iesId__c")
            .value("ea9mmnj1qe2tghnb3")
            .build(),
        new CustomField.Builder()
            .name("hybrisAccountNumber__c")
            .value("456")
            .build(),
        new CustomField.Builder()
            .name("tepAccountNumber__c")
            .value("c123")
            .build(),
        new CustomField.Builder()
            .name("institutionId__c")
            .value("5678")
            .build(),
        new CustomField.Builder()
            .name("tepPartyId__c")
            .value("GH6789")
            .build(),
        new CustomField.Builder()
            .name("campaignName__c")
            .value("test val")
            .build(),
        new CustomField.Builder()
            .name("promoCode__c")
            .value("PM10")
            .build(),
        new CustomField.Builder()
            .name("couponCode__c")
            .value("BA10")
            .build(),
        new CustomField.Builder()
            .name("discountCodeStartDate__c")
            .value("2021-09-21")
            .build(),
        new CustomField.Builder()
            .name("discountCodeEndDate__c")
            .value("2021-11-21")
            .build(),
        new CustomField.Builder()
            .name("amountBeforeTax__c")
            .value("9.99")
            .build(),
        new CustomField.Builder()
            .name("discountedAmountBeforeTax__c")
            .value("9.99")
            .build(),
        new CustomField.Builder()
            .name("subscriptionSource__c")
            .value("channel_partner")
            .build(),
        new CustomField.Builder()
            .name("upFrontPayment__c")
            .value("true")
            .build(),
        new CustomField.Builder()
            .name("embeddedPromoCode__c")
            .value("string")
            .build(),
        new CustomField.Builder()
            .name("discountCodeDescription__c")
            .value("string")
            .build()
    ))
.build();


subscriptionsController.updateSubscriptionAsync(xUserId, xAuthorization, body, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`InvalidReqTypeException`](../../doc/models/invalid-req-type-exception.md) |
| 401 | Unauthorized | [`AuthErrorTypeException`](../../doc/models/auth-error-type-exception.md) |
| 500 | Error | [`OrderErrorTypeException`](../../doc/models/order-error-type-exception.md) |


# Cancel Subscription

Cancel subscription for a given subscription ID

```java
CompletableFuture<CancelResType> cancelSubscriptionAsync(
    final String userId,
    final String xAuthorization,
    final CancelReqType body,
    final String xTransactionId,
    final String origin)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userId` | `String` | Header, Required | UserId of an user who bought a subscription. This will be an IES userId |
| `xAuthorization` | `String` | Header, Required | This will be an IES system token |
| `body` | [`CancelReqType`](../../doc/models/cancel-req-type.md) | Body, Required | Data |
| `xTransactionId` | `String` | Header, Optional | Unique ID for a transaction |
| `origin` | `String` | Header, Optional | Originating System |

## Response Type

[`CancelResType`](../../doc/models/cancel-res-type.md)

## Example Usage

```java
String userId = "userId0";
String xAuthorization = "X-Authorization6";
CancelReqType body = new CancelReqType.Builder(
    "urn:pearson:gps:subs:649e7109fc57341ba129e23",
    SubscriptionSourceEnum.INTERNAL,
    "No longer need service",
    "2023-06-30"
)
.build();


subscriptionsController.cancelSubscriptionAsync(userId, xAuthorization, body, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`InvalidReqTypeException`](../../doc/models/invalid-req-type-exception.md) |
| 401 | Unauthorized | [`AuthErrorTypeException`](../../doc/models/auth-error-type-exception.md) |
| 500 | Error | [`OrderErrorTypeException`](../../doc/models/order-error-type-exception.md) |


# Aggregate Subscription

```java
CompletableFuture<OrderRespType> aggregateSubscriptionAsync(
    final String xUserId,
    final String xAuthorization,
    final OrderRequestType body,
    final String xTransactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `xUserId` | `String` | Header, Required | UserId of an user who bought a subscription. This will be an IES userId |
| `xAuthorization` | `String` | Header, Required | This will be an IES system token |
| `body` | [`OrderRequestType`](../../doc/models/order-request-type.md) | Body, Required | Data |
| `xTransactionId` | `String` | Header, Optional | Unique ID for a transaction |

## Response Type

[`OrderRespType`](../../doc/models/order-resp-type.md)

## Example Usage

```java
String xUserId = "X-UserId4";
String xAuthorization = "X-Authorization6";
OrderRequestType body = new OrderRequestType.Builder()
    .orderNumber("10034567")
    .description("Sample description of the API")
    .subscriptionModelName("Mojo")
    .storeCode("US")
    .swapTitle(false)
    .sendEmail(true)
    .orderRequestTypeProducts(Arrays.asList(
        new OrderRequestTypeProduct.Builder()
            .isbn("4280134085545")
            .ppid("A101702992101")
            .build(),
        new OrderRequestTypeProduct.Builder()
            .isbn("4280134085546")
            .ppid("A101702992102")
            .build()
    ))
    .customFields(Arrays.asList(
        new CustomField.Builder()
            .name("paymentMethod__c")
            .value("CREDIT CARD")
            .build(),
        new CustomField.Builder()
            .name("paymentInfo__c")
            .value("CREDIT CARD")
            .build(),
        new CustomField.Builder()
            .name("paymentToken__c")
            .value("4111111111111111")
            .build(),
        new CustomField.Builder()
            .name("iesId__c")
            .value("ea9mmnj1qe2tghnb3")
            .build(),
        new CustomField.Builder()
            .name("hybrisAccountNumber__c")
            .value("456")
            .build(),
        new CustomField.Builder()
            .name("tepAccountNumber__c")
            .value("c123")
            .build(),
        new CustomField.Builder()
            .name("institutionId__c")
            .value("5678")
            .build(),
        new CustomField.Builder()
            .name("tepPartyId__c")
            .value("GH6789")
            .build(),
        new CustomField.Builder()
            .name("campaignName__c")
            .value("test val")
            .build(),
        new CustomField.Builder()
            .name("promoCode__c")
            .value("PM10")
            .build(),
        new CustomField.Builder()
            .name("couponCode__c")
            .value("BA10")
            .build(),
        new CustomField.Builder()
            .name("discountCodeStartDate__c")
            .value("2021-09-21")
            .build(),
        new CustomField.Builder()
            .name("discountCodeEndDate__c")
            .value("2021-11-21")
            .build(),
        new CustomField.Builder()
            .name("amountBeforeTax__c")
            .value("9.99")
            .build(),
        new CustomField.Builder()
            .name("discountedAmountBeforeTax__c")
            .value("9.99")
            .build(),
        new CustomField.Builder()
            .name("subscriptionSource__c")
            .value("channel_partner")
            .build(),
        new CustomField.Builder()
            .name("upFrontPayment__c")
            .value("true")
            .build(),
        new CustomField.Builder()
            .name("embeddedPromoCode__c")
            .value("string")
            .build(),
        new CustomField.Builder()
            .name("discountCodeDescription__c")
            .value("string")
            .build()
    ))
    .build();


subscriptionsController.aggregateSubscriptionAsync(xUserId, xAuthorization, body, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`InvalidReqTypeException`](../../doc/models/invalid-req-type-exception.md) |
| 401 | Unauthorized | [`AuthErrorTypeException`](../../doc/models/auth-error-type-exception.md) |
| 500 | Error | [`OrderRespTypeErrorException`](../../doc/models/order-resp-type-error-exception.md) |


# Expire Subscriptions

Expire subscription for all past enddate internal and IA subscriptions

```java
CompletableFuture<CancelResType> expireSubscriptionsAsync()
```

## Response Type

[`CancelResType`](../../doc/models/cancel-res-type.md)

## Example Usage

```java
subscriptionsController.expireSubscriptionsAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`InvalidReqTypeException`](../../doc/models/invalid-req-type-exception.md) |
| 401 | Unauthorized | [`AuthErrorTypeException`](../../doc/models/auth-error-type-exception.md) |
| 500 | Error | [`OrderErrorTypeException`](../../doc/models/order-error-type-exception.md) |

