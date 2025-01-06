
# Discount

## Structure

`Discount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DiscountAmount` | `Double` | Optional | Only applicable if the discount charge is a fixed-amount discount. | Double getDiscountAmount() | setDiscountAmount(Double discountAmount) |
| `DiscountPercentage` | `Double` | Optional | Only applicable if the discount charge is a percentage discount | Double getDiscountPercentage() | setDiscountPercentage(Double discountPercentage) |

## Example (as JSON)

```json
{
  "discountAmount": 211.28,
  "discountPercentage": 228.18
}
```

