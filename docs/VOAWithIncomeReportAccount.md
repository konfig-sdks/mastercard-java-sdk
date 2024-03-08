

# VOAWithIncomeReportAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the account |  [optional] |
|**number** | **String** | The account number from the institution (all digits except the last four are obfuscated) |  [optional] |
|**ownerName** | **String** | The name(s) of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report. |  [optional] |
|**ownerAddress** | **String** | The mailing address of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report. |  [optional] |
|**name** | **String** | The account name from the institution |  [optional] |
|**type** | **String** | One of the values from account types |  [optional] |
|**availableBalance** | **Double** | The available balance for the account |  [optional] |
|**aggregationStatusCode** | **Integer** | The status of the most recent aggregation attempt |  [optional] |
|**balance** | **Double** | The cleared balance of the account as-of balanceDate |  [optional] |
|**balanceDate** | **Long** | A timestamp showing when the balance was captured |  [optional] |
|**averageMonthlyBalance** | **Double** | The average monthly balance of this account |  [optional] |
|**totNumberInsufficientFundsFeeDebitTxAccount** | **Long** | The count for the total number of insufficient funds transactions, based on the &#x60;fromDate&#x60; of the report. |  [optional] |
|**totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount** | **Long** | The count for the total number of insufficient funds transactions for the last two months, based on the &#x60;fromDate&#x60; of the report. |  [optional] |
|**totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount** | **Long** | The number of days since the most recent insufficient funds transaction, based on the &#x60;fromDate&#x60; of the report. |  [optional] |
|**transactions** | [**List&lt;ReportTransactionNewTxBased&gt;**](ReportTransactionNewTxBased.md) | a list of transaction records |  [optional] |
|**details** | [**AccountDetailsTxBased**](AccountDetailsTxBased.md) |  |  [optional] |
|**position** | [**ReportAccountPosition**](ReportAccountPosition.md) |  |  [optional] |
|**asset** | [**PrequalificationReportAssetSummary**](PrequalificationReportAssetSummary.md) |  |  [optional] |
|**incomeStreams** | [**List&lt;VOAIReportIncomeStream&gt;**](VOAIReportIncomeStream.md) | A list of income stream records |  [optional] |



