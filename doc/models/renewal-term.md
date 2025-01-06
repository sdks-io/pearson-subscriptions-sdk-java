
# Renewal Term

## Structure

`RenewalTerm`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Period` | `Integer` | Optional | Duration of the renewal term in months, years, days, or weeks, depending on the value of the `periodType` field. | Integer getPeriod() | setPeriod(Integer period) |
| `PeriodType` | [`PeriodTypeEnum`](../../doc/models/period-type-enum.md) | Optional | Unit of time that the renewal term is measured in. | PeriodTypeEnum getPeriodType() | setPeriodType(PeriodTypeEnum periodType) |

## Example (as JSON)

```json
{
  "period": 102,
  "periodType": "Day"
}
```

