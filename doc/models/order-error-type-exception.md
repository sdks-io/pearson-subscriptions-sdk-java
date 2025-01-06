
# Order Error Type Exception

## Structure

`OrderErrorTypeException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OrderNumber` | `String` | Optional | Order Number. | String getOrderNumber() | setOrderNumber(String orderNumber) |
| `OrderError` | [`OrderError`](../../doc/models/order-error.md) | Optional | - | OrderError getOrderError() | setOrderError(OrderError orderError) |

## Example (as JSON)

```json
{
  "orderNumber": "S12345",
  "orderError": {
    "code": "code4",
    "message": "message6"
  }
}
```

