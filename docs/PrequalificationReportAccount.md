

# PrequalificationReportAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the account |  [optional] |
|**number** | **String** | The account number from the institution (all digits except the last four are obfuscated) |  [optional] |
|**ownerName** | **String** | The name of the account owner. If no owner information is available, this field won&#39;t appear in the report. |  [optional] |
|**ownerAddress** | **String** | The mailing address of the account owner. If no owner information is available, this field won&#39;t appear in the report. |  [optional] |
|**name** | **String** | The account name from the institution |  [optional] |
|**type** | **String** | One of the values from account types |  [optional] |
|**aggregationStatusCode** | **Integer** | The status of the most recent aggregation attempt |  [optional] |
|**balance** | **Double** | The cleared balance of the account as-of &#x60;balanceDate&#x60; |  [optional] |
|**balanceDate** | **Long** | A timestamp of the balance |  [optional] |
|**availableBalance** | **Double** | Available balance |  [optional] |
|**averageMonthlyBalance** | **Double** | The average monthly balance of the account |  [optional] |
|**totNumberInsufficientFundsFeeDebitTxAccount** | **Integer** | The count for the total number of insufficient funds transactions, based on the &#x60;fromDate&#x60; of the report |  [optional] |
|**totNumberInsufficientFundsFeeDebitTxOver6MonthsAccount** | **Integer** | The total number of  insufficient funds fees for the account over six months |  [optional] |
|**totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount** | **Long** | The total number of days since the most recent insufficient funds fee for the account |  [optional] |
|**transactions** | [**List&lt;ReportTransaction&gt;**](ReportTransaction.md) | a list of transaction records |  [optional] |
|**asset** | [**PrequalificationReportAssetSummary**](PrequalificationReportAssetSummary.md) |  |  [optional] |
|**details** | [**AccountDetails**](AccountDetails.md) |  |  [optional] |



