
# Order Resp Type

## Structure

`OrderRespType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Message` | `String` | Optional | message description once subscription creation is sucess. | String getMessage() | setMessage(String message) |
| `OrderNumber` | `String` | Optional | order number. | String getOrderNumber() | setOrderNumber(String orderNumber) |
| `SubscriptionNumber` | `String` | Optional | subscription id. | String getSubscriptionNumber() | setSubscriptionNumber(String subscriptionNumber) |

## Example (as JSON)

```json
{
  "message": "sucess",
  "orderNumber": "10034567",
  "subscriptionNumber": "S12345"
}
```

