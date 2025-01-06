
# Order Request Type Product

## Structure

`OrderRequestTypeProduct`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Isbn` | `String` | Optional | product isbn value<br>**Constraints**: *Minimum Length*: `1` | String getIsbn() | setIsbn(String isbn) |
| `Ppid` | `String` | Optional | product ppid value<br>**Constraints**: *Minimum Length*: `1` | String getPpid() | setPpid(String ppid) |
| `Duration` | `Double` | Optional | Duration of the entitlement in days for this product | Double getDuration() | setDuration(Double duration) |
| `Tax` | `Double` | Optional | Cost of tax on the product | Double getTax() | setTax(Double tax) |
| `Price` | `Double` | Optional | Cost of the product | Double getPrice() | setPrice(Double price) |

## Example (as JSON)

```json
{
  "isbn": "isbn2",
  "ppid": "ppid6",
  "duration": 32.56,
  "tax": 244.04,
  "price": 147.92
}
```

