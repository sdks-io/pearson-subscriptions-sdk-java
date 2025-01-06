
# Update Order Order Action

## Structure

`UpdateOrderOrderAction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TriggerDates` | [`List<TriggerDate>`](../../doc/models/trigger-date.md) | Optional | - | List<TriggerDate> getTriggerDates() | setTriggerDates(List<TriggerDate> triggerDates) |
| `AddProduct` | [`AddProduct`](../../doc/models/add-product.md) | Optional | Information about an order action of type `addProduct`.<br><br>If you want to create a pending order through the "Add product" order action, and if the charge's trigger condition is `Specific Date`, you must set a charge number in the `chargeNumber` field for the "Add product" order action. | AddProduct getAddProduct() | setAddProduct(AddProduct addProduct) |
| `RemoveProduct` | [`RemoveProduct`](../../doc/models/remove-product.md) | Optional | Remove product details from the subscription plan | RemoveProduct getRemoveProduct() | setRemoveProduct(RemoveProduct removeProduct) |
| `TermsAndConditions` | [`TermsAndConditions`](../../doc/models/terms-and-conditions.md) | Optional | change the terms and conditions of a subscription . | TermsAndConditions getTermsAndConditions() | setTermsAndConditions(TermsAndConditions termsAndConditions) |

## Example (as JSON)

```json
{
  "triggerDates": [
    {
      "name": "name6",
      "triggerDate": "triggerDate6"
    }
  ],
  "addProduct": {
    "productRatePlanId": "productRatePlanId4",
    "updateOrAddProductChargeOverrides": [
      {
        "productRatePlanChargeId": "productRatePlanChargeId6",
        "customerFacingCustomFields": {
          "customerFacing__c": "customerFacing__c0"
        },
        "overridesPricing": {
          "discount": {
            "discountAmount": 252.52,
            "discountPercentage": 13.42
          }
        },
        "addProductEndDate": {
          "endDateCondition": "Specific_End_Date",
          "specificEndDate": "specificEndDate0",
          "upToPeriods": 155.16,
          "upToPeriodsType": "upToPeriodsType0"
        }
      },
      {
        "productRatePlanChargeId": "productRatePlanChargeId6",
        "customerFacingCustomFields": {
          "customerFacing__c": "customerFacing__c0"
        },
        "overridesPricing": {
          "discount": {
            "discountAmount": 252.52,
            "discountPercentage": 13.42
          }
        },
        "addProductEndDate": {
          "endDateCondition": "Specific_End_Date",
          "specificEndDate": "specificEndDate0",
          "upToPeriods": 155.16,
          "upToPeriodsType": "upToPeriodsType0"
        }
      }
    ]
  },
  "removeProduct": {
    "productRatePlanId": "productRatePlanId8"
  },
  "termsAndConditions": {
    "autorenew": false
  }
}
```

