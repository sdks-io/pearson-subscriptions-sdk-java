
# Billing Options

## Structure

`BillingOptions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DocumentDate` | `LocalDate` | Optional | - | LocalDate getDocumentDate() | setDocumentDate(LocalDate documentDate) |
| `TargetDate` | `LocalDate` | Optional | For REDEMPTION, it is end of term date | LocalDate getTargetDate() | setTargetDate(LocalDate targetDate) |

## Example (as JSON)

```json
{
  "documentDate": "2016-03-13",
  "targetDate": "2016-03-13"
}
```

