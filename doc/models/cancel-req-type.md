
# Cancel Req Type

## Structure

`CancelReqType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `String` | Required | Subscription id | String getSubscriptionId() | setSubscriptionId(String subscriptionId) |
| `SubscriptionSource` | [`SubscriptionSourceEnum`](../../doc/models/subscription-source-enum.md) | Required | Internal or external | SubscriptionSourceEnum getSubscriptionSource() | setSubscriptionSource(SubscriptionSourceEnum subscriptionSource) |
| `CancelReason` | `String` | Required | Reason for subscription cancel | String getCancelReason() | setCancelReason(String cancelReason) |
| `CancelDate` | `String` | Required | cancellation date | String getCancelDate() | setCancelDate(String cancelDate) |

## Example (as JSON)

```json
{
  "subscriptionId": "urn:pearson:gps:subs:649e7109fc57341ba129e23",
  "subscriptionSource": "Internal",
  "cancelReason": "No longer need service",
  "cancelDate": "2023-06-30"
}
```

