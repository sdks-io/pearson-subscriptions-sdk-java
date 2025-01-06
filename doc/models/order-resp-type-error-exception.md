
# Order Resp Type Error Exception

## Structure

`OrderRespTypeErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OrderNumber` | `String` | Optional | Order Number. | String getOrderNumber() | setOrderNumber(String orderNumber) |
| `SubscriptionId` | `String` | Optional | Pearson subscription id. | String getSubscriptionId() | setSubscriptionId(String subscriptionId) |
| `OrderRespError` | [`OrderRespError`](../../doc/models/order-resp-error.md) | Optional | - | OrderRespError getOrderRespError() | setOrderRespError(OrderRespError orderRespError) |

## Example (as JSON)

```json
{
  "orderNumber": "S12345",
  "subscriptionId": "S12345",
  "orderRespError": {
    "code": "E40",
    "message": "message6"
  }
}
```

