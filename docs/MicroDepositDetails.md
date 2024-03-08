

# MicroDepositDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | The following values may be returned in the field of a status:  * \&quot;Pending\&quot; : Micro entries not yet deposited to customer&#39;s account * \&quot;Completed\&quot;: Micro entries deposited to customer&#39;s account * \&quot;Verified\&quot;: Micro entries got successfully verified * \&quot;Rejected\&quot;: Micro entries got rejected due to some reason * \&quot;Returned\&quot;: Micro entries got returned back * \&quot;Failed\&quot;: Micro entries got failed due to some reason * \&quot;Expired\&quot;: Micro entries got expired as they remains unverified for certain defined days |  [optional] |
|**statusDescription** | **String** | Micro entries status description |  [optional] |
|**creationDate** | **String** | A date-time without time zone |  [optional] |
|**routingNumber** | **String** | Routing number of receiving bank |  [optional] |
|**accountNumberLast4** | **String** | The last 4 digits of the ACH account number |  [optional] |



