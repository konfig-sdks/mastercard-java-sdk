

# VOIReportAccount


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
|**incomeStreams** | [**List&lt;VOIReportIncomeStream&gt;**](VOIReportIncomeStream.md) | A list of income stream records |  [optional] |
|**balance** | **Double** | The cleared balance of the account as-of &#x60;balanceDate&#x60; |  [optional] |
|**averageMonthlyBalance** | **Double** | The average monthly balance of this account |  [optional] |
|**transactions** | [**List&lt;ReportTransaction&gt;**](ReportTransaction.md) | a list of transaction records |  [optional] |
|**availableBalance** | **Double** | The available balance for the account |  [optional] |
|**currentBalance** | **Double** | Current balance of the account |  [optional] |
|**beginningBalance** | **Double** | Beginning balance of account per the time period in the report |  [optional] |
|**miscDeposits** | [**List&lt;ReportTransaction&gt;**](ReportTransaction.md) | A list of miscellaneous deposits |  [optional] |



