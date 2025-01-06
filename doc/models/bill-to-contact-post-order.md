
# Bill to Contact Post Order

Contact details associated with an account.

## Structure

`BillToContactPostOrder`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Address1` | `String` | Optional | First line of the contact's address. This is often a street address or a business name.<br>**Constraints**: *Maximum Length*: `255` | String getAddress1() | setAddress1(String address1) |
| `Address2` | `String` | Optional | Second line of the contact's address.<br>**Constraints**: *Maximum Length*: `255` | String getAddress2() | setAddress2(String address2) |
| `City` | `String` | Optional | City of the contact's address.<br>**Constraints**: *Maximum Length*: `40` | String getCity() | setCity(String city) |
| `Country` | `String` | Optional | Country; must be a valid country name or abbreviation. If using Zuora Tax, you must specify a country in the bill-to contact to calculate tax.<br>**Constraints**: *Maximum Length*: `64` | String getCountry() | setCountry(String country) |
| `County` | `String` | Optional | County of the contact's address.<br>**Constraints**: *Maximum Length*: `32` | String getCounty() | setCounty(String county) |
| `FirstName` | `String` | Optional | First name of the contact.<br>**Constraints**: *Maximum Length*: `100` | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | Last name of the contact.<br>**Constraints**: *Maximum Length*: `100` | String getLastName() | setLastName(String lastName) |
| `MobilePhone` | `String` | Optional | Mobile phone number of the contact.<br>**Constraints**: *Maximum Length*: `40` | String getMobilePhone() | setMobilePhone(String mobilePhone) |
| `PersonalEmail` | `String` | Optional | Personal email address of the contact.<br>**Constraints**: *Maximum Length*: `80` | String getPersonalEmail() | setPersonalEmail(String personalEmail) |
| `PostalCode` | `String` | Optional | ZIP code or other postal code of the contact's address.<br>**Constraints**: *Maximum Length*: `20` | String getPostalCode() | setPostalCode(String postalCode) |
| `State` | `String` | Optional | State or province of the contact's address.<br>**Constraints**: *Maximum Length*: `40` | String getState() | setState(String state) |
| `WorkEmail` | `String` | Optional | Business email address of the contact.<br>**Constraints**: *Maximum Length*: `80` | String getWorkEmail() | setWorkEmail(String workEmail) |
| `WorkPhone` | `String` | Optional | Business phone number of the contact.<br>**Constraints**: *Maximum Length*: `40` | String getWorkPhone() | setWorkPhone(String workPhone) |

## Example (as JSON)

```json
{
  "address1": "1051 E Hillsdale Blvd",
  "address2": "Santon street main",
  "city": "Durham",
  "country": "United States",
  "county": "Durham",
  "firstName": "Alex",
  "lastName": "Matthew",
  "mobilePhone": "1234567890",
  "personalEmail": "personal@email.com",
  "postalCode": "27703",
  "state": "NC",
  "workPhone": "1234567890"
}
```

