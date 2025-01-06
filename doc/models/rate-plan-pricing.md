
# Rate Plan Pricing

## Structure

`RatePlanPricing`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Discount` | [`Discount`](../../doc/models/discount.md) | Optional | - | Discount getDiscount() | setDiscount(Discount discount) |
| `RecurringFlatFee` | [`RecurringFlatFee`](../../doc/models/recurring-flat-fee.md) | Optional | - | RecurringFlatFee getRecurringFlatFee() | setRecurringFlatFee(RecurringFlatFee recurringFlatFee) |

## Example (as JSON)

```json
{
  "discount": {
    "discountAmount": 252.52,
    "discountPercentage": 13.42
  },
  "recurringFlatFee": {
    "listPrice": 233.52
  }
}
```

