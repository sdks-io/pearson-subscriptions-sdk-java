
# Add Product End Date

## Structure

`AddProductEndDate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EndDateCondition` | [`EndDateConditionEnum`](../../doc/models/end-date-condition-enum.md) | Optional | enum values are "Subscription_End" "Fixed_Period" "Specific_End_Date" | EndDateConditionEnum getEndDateCondition() | setEndDateCondition(EndDateConditionEnum endDateCondition) |
| `SpecificEndDate` | `String` | Optional | - | String getSpecificEndDate() | setSpecificEndDate(String specificEndDate) |
| `UpToPeriods` | `Double` | Optional | - | Double getUpToPeriods() | setUpToPeriods(Double upToPeriods) |
| `UpToPeriodsType` | `String` | Optional | - | String getUpToPeriodsType() | setUpToPeriodsType(String upToPeriodsType) |

## Example (as JSON)

```json
{
  "endDateCondition": "Fixed_Period",
  "specificEndDate": "specificEndDate8",
  "upToPeriods": 47.48,
  "upToPeriodsType": "upToPeriodsType2"
}
```

