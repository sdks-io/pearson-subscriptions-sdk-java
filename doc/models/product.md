
# Product

## Structure

`Product`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Isbn` | `String` | Optional | product isbn number | String getIsbn() | setIsbn(String isbn) |
| `Ppid` | `String` | Optional | product ppid number | String getPpid() | setPpid(String ppid) |
| `Duration` | `Double` | Optional | Duration of the entitlement in days for this product | Double getDuration() | setDuration(Double duration) |
| `EndDate` | `String` | Optional | end date for the entitlement. in yyyy-MM-dd'T'HH:mm:ss.SSSZ format. | String getEndDate() | setEndDate(String endDate) |
| `Tax` | `Double` | Optional | Cost of tax on the product | Double getTax() | setTax(Double tax) |
| `Price` | `Double` | Optional | Cost of the product | Double getPrice() | setPrice(Double price) |

## Example (as JSON)

```json
{
  "isbn": "isbn8",
  "ppid": "ppid0",
  "duration": 117.0,
  "endDate": "endDate6",
  "tax": 72.48
}
```

