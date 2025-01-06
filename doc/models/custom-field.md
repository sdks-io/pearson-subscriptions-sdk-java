
# Custom Field

## Structure

`CustomField`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Custom field name defined for future use | String getName() | setName(String name) |
| `Value` | `String` | Optional | Custom field value for future use.  paymentMethod__c is Payment Gateway PayPal or CyberSource or REDEMPTION; paymentToken__c is PayPal or CyberSource token. | String getValue() | setValue(String value) |

## Example (as JSON)

```json
{
  "name": "name8",
  "value": "value0"
}
```

