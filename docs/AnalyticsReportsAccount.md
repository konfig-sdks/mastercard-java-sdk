

# AnalyticsReportsAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the account |  |
|**ownerName** | **String** | The name(s) of the account owner(s), retrieved from the institution. |  [optional] |
|**ownerAddress** | **String** | The mailing address of the account owner, retrieved from the institution. |  [optional] |
|**name** | **String** | The account name from the institution |  |
|**number** | **String** | The account number from the institution (obfuscated) |  |
|**type** | **String** | One of the values from account types |  |
|**aggregationStatusCode** | **Integer** | The status of the most recent aggregation attempt |  [optional] |
|**currentBalance** | **Double** | The cleared balance of the account as-of &#x60;balanceDate&#x60; |  [optional] |
|**availableBalance** | **Double** | Available balance |  [optional] |
|**balanceDate** | **Long** | A timestamp showing when the &#x60;balance&#x60; was captured |  [optional] |
|**transactions** | [**List&lt;ReportTransaction&gt;**](ReportTransaction.md) | a list of transaction records |  |
|**details** | [**AccountDetails**](AccountDetails.md) |  |  [optional] |
|**accountAnalytics** | [**AccountAnalytics**](AccountAnalytics.md) |  |  [optional] |



