
# Order Resp Error

## Structure

`OrderRespError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | [`CodeEnum`](../../doc/models/code-enum.md) | Optional | Error codes. | CodeEnum getCode() | setCode(CodeEnum code) |
| `Message` | `String` | Optional | Error message. | String getMessage() | setMessage(String message) |

## Example (as JSON)

```json
{
  "message": "Subscription Already Exists.",
  "code": "E41"
}
```

