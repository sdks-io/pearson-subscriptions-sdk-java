
# Account

The information of the new account to be created with the order. Note
that this actually specifies the invoice owner account of the
subscriptions included in this order. To create the new account,
either a **creditCard** structure or the
**hpmCreditCardPaymentMethodId** field (but not both) should be
provided. The one provided becomes the default payment method for this
account. If the credit card information is declined or can't be
verified, then the account is not created.

## Structure

`Account`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountNumber` | `String` | Optional | **Constraints**: *Maximum Length*: `70` | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AdditionalEmailAddresses` | `String` | Optional | List of additional email addresses to receive emailed invoices. Values should be a comma-separated list of email addresses.<br>**Constraints**: *Maximum Length*: `1200` | String getAdditionalEmailAddresses() | setAdditionalEmailAddresses(String additionalEmailAddresses) |
| `CustomerServiceRepName` | `String` | Optional | Name of the account's customer service representative, if applicable.<br>**Constraints**: *Maximum Length*: `50` | String getCustomerServiceRepName() | setCustomerServiceRepName(String customerServiceRepName) |
| `PurchaseOrderNumber` | `String` | Optional | The number of the purchase order associated with this account. Purchase order information generally comes from customers.<br>**Constraints**: *Maximum Length*: `100` | String getPurchaseOrderNumber() | setPurchaseOrderNumber(String purchaseOrderNumber) |
| `SalesRep` | `String` | Optional | The name of the sales representative associated with this account, if applicable.<br>**Constraints**: *Maximum Length*: `50` | String getSalesRep() | setSalesRep(String salesRep) |
| `SequenceSetId` | `String` | Optional | The ID of the billing document sequence set to assign to the customer account.<br><br>The billing documents to generate for this account will adopt the prefix and starting document number configured in the sequence set. | String getSequenceSetId() | setSequenceSetId(String sequenceSetId) |
| `AllowInvoiceEdit` | `Boolean` | Optional | Indicates if associated invoices can be edited.<br>Values are:<br><br>* `true`<br>* `false` (default)<br>**Default**: `false` | Boolean getAllowInvoiceEdit() | setAllowInvoiceEdit(Boolean allowInvoiceEdit) |
| `Name` | `String` | Optional | **Constraints**: *Maximum Length*: `255` | String getName() | setName(String name) |
| `Currency` | `String` | Optional | 3 uppercase character currency code | String getCurrency() | setCurrency(String currency) |
| `BillCycleDay` | `Integer` | Optional | Day of the month that the account prefers billing periods to begin on. If set to 0, the bill cycle day will be set as "AutoSet".<br>**Constraints**: `>= 0`, `<= 31` | Integer getBillCycleDay() | setBillCycleDay(Integer billCycleDay) |
| `InvoiceDeliveryPrefsPrint` | `Boolean` | Optional | Specifies whether to turn on the invoice delivery method 'Print' for the new account.<br>Values are:<br><br>* `true`. Turn on the invoice delivery method 'Print' for the new account.<br>* `false` (default). Turn off the invoice delivery method 'Print' for the new account.<br>**Default**: `false` | Boolean getInvoiceDeliveryPrefsPrint() | setInvoiceDeliveryPrefsPrint(Boolean invoiceDeliveryPrefsPrint) |
| `InvoiceDeliveryPrefsEmail` | `Boolean` | Optional | Specifies whether to turn on the invoice delivery method 'Email' for the new account.<br>Values are:<br><br>* `true` (default). Turn on the invoice delivery method 'Email' for the new account.<br>* `false`. Turn off the invoice delivery method 'Email' for the new account.<br>**Default**: `false` | Boolean getInvoiceDeliveryPrefsEmail() | setInvoiceDeliveryPrefsEmail(Boolean invoiceDeliveryPrefsEmail) |
| `AutoPay` | `Boolean` | Optional | Specifies whether future payments are to be automatically billed when they are due. Possible values are `true`, `false`.<br>**Default**: `true` | Boolean getAutoPay() | setAutoPay(Boolean autoPay) |
| `PaymentTerm` | `String` | Optional | - | String getPaymentTerm() | setPaymentTerm(String paymentTerm) |
| `CommunicationProfileId` | `String` | Optional | aaa. | String getCommunicationProfileId() | setCommunicationProfileId(String communicationProfileId) |
| `Batch` | `String` | Optional | Organizes your customer accounts into groups to optimize your billing and payment operations. | String getBatch() | setBatch(String batch) |
| `InvoiceTemplateId` | `String` | Optional | Invoice template ID, configured in Billing Settings. | String getInvoiceTemplateId() | setInvoiceTemplateId(String invoiceTemplateId) |
| `DebitMemoTemplateId` | `String` | Optional | The unique ID of the debit memo template, configured in Billing Settings. | String getDebitMemoTemplateId() | setDebitMemoTemplateId(String debitMemoTemplateId) |
| `CreditMemoTemplateId` | `String` | Optional | The unique ID of the credit memo template, configured in Billing Settings. | String getCreditMemoTemplateId() | setCreditMemoTemplateId(String creditMemoTemplateId) |
| `BillToContact` | [`BillToContactPostOrder`](../../doc/models/bill-to-contact-post-order.md) | Optional | - | BillToContactPostOrder getBillToContact() | setBillToContact(BillToContactPostOrder billToContact) |
| `SoldToContact` | [`BillToContactPostOrder`](../../doc/models/bill-to-contact-post-order.md) | Optional | - | BillToContactPostOrder getSoldToContact() | setSoldToContact(BillToContactPostOrder soldToContact) |

## Example (as JSON)

```json
{
  "accountNumber": "1234567890",
  "additionalEmailAddresses": "sample@email.com",
  "customerServiceRepName": "Alex Cutter",
  "purchaseOrderNumber": "q12345",
  "salesRep": "Alex Cutter",
  "sequenceSetId": "1",
  "allowInvoiceEdit": false,
  "name": "Demo test Account",
  "currency": "USD",
  "invoiceDeliveryPrefsPrint": false,
  "invoiceDeliveryPrefsEmail": false,
  "autoPay": true,
  "paymentTerm": "Due Upon Receipt",
  "communicationProfileId": "c123",
  "batch": "b1",
  "invoiceTemplateId": "in1",
  "debitMemoTemplateId": "dm1",
  "creditMemoTemplateId": "cm1"
}
```

