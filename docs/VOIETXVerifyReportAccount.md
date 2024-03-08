

# VOIETXVerifyReportAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the account |  |
|**number** | **String** | The account number from the institution (all digits except the last four are obfuscated) |  |
|**ownerName** | **String** | The name(s) of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report. |  [optional] |
|**ownerAddress** | **String** | The mailing address of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report. |  [optional] |
|**name** | **String** | The account name from the institution |  |
|**type** | **String** | One of the values from account types |  |
|**aggregationStatusCode** | **Integer** | The status of the most recent aggregation attempt |  |
|**incomeStreams** | [**List&lt;VOIETXVerifyReportIncomeStream&gt;**](VOIETXVerifyReportIncomeStream.md) | A list of income stream records |  [optional] |
|**balance** | **Double** | The cleared balance of the account as-of &#x60;balanceDate&#x60; |  [optional] |
|**averageMonthlyBalance** | **Double** | The average monthly balance of this account |  [optional] |
|**transactions** | [**List&lt;ReportTransactionNewTxBased&gt;**](ReportTransactionNewTxBased.md) | a list of transaction records |  |
|**details** | [**AccountDetailsTxBased**](AccountDetailsTxBased.md) |  |  [optional] |
|**position** | [**ReportAccountPosition**](ReportAccountPosition.md) |  |  [optional] |
|**availableBalance** | **Double** | The available balance for the account |  [optional] |



