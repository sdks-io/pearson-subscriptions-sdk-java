
# Invalid Req Type Error

## Structure

`InvalidReqTypeError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | Error codes | String getCode() | setCode(String code) |
| `Message` | `String` | Optional | Error message. | String getMessage() | setMessage(String message) |

## Example (as JSON)

```json
{
  "code": "400",
  "message": "object has missing required properties ([\\\"orderNumber\\\"])"
}
```

