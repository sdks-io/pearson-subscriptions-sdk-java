
# Rate Plan End Date

## Structure

`RatePlanEndDate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EndDateCondition` | [`EndDateConditionEnum`](../../doc/models/end-date-condition-enum.md) | Optional | enum values are "Subscription_End" "Fixed_Period" "Specific_End_Date" | EndDateConditionEnum getEndDateCondition() | setEndDateCondition(EndDateConditionEnum endDateCondition) |
| `SpecificEndDate` | `LocalDate` | Optional | - | LocalDate getSpecificEndDate() | setSpecificEndDate(LocalDate specificEndDate) |
| `UpToPeriods` | `Double` | Optional | Duration of the charge in billing periods, days, weeks, months, or years, depending on the value of the upToPeriodsType field. Only applicable if the value of the endDateCondition field is Fixed_Period. | Double getUpToPeriods() | setUpToPeriods(Double upToPeriods) |
| `UpToPeriodsType` | [`UpToPeriodsTypeEnum`](../../doc/models/up-to-periods-type-enum.md) | Optional | Unit of time that the charge duration is measured in. Only applicable if the value of the endDateCondition field is Fixed_Period. | UpToPeriodsTypeEnum getUpToPeriodsType() | setUpToPeriodsType(UpToPeriodsTypeEnum upToPeriodsType) |

## Example (as JSON)

```json
{
  "endDateCondition": "Fixed_Period",
  "specificEndDate": "2016-03-13",
  "upToPeriods": 77.86,
  "upToPeriodsType": "Billing_Periods"
}
```

