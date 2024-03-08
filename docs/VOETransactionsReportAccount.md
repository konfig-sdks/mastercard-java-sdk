

# VOETransactionsReportAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the account |  [optional] |
|**number** | **String** | The account number from the institution (all digits except the last four are obfuscated) |  [optional] |
|**ownerName** | **String** | The name(s) of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report. |  [optional] |
|**ownerAddress** | **String** | The mailing address of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report. |  [optional] |
|**name** | **String** | The account name from the institution |  [optional] |
|**type** | **String** | One of the values from account types |  [optional] |
|**aggregationStatusCode** | **Integer** | The status of the most recent aggregation attempt |  [optional] |
|**incomeStreams** | [**List&lt;VOETransactionsReportIncomeStream&gt;**](VOETransactionsReportIncomeStream.md) | A list of income stream records |  [optional] |



