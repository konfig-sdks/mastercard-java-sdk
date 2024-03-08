

# ReportInstitutionAccount

An account record

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the account |  |
|**ownerName** | **String** | The name(s) of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report. |  [optional] |
|**ownerAddress** | **String** | The mailing address of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report. |  [optional] |
|**name** | **String** | The account name from the institution |  |
|**number** | **String** | The account number from the institution (all digits except the last four are obfuscated) |  |
|**type** | **String** | One of the values from account types |  |
|**aggregationStatusCode** | **Integer** | The status of the most recent aggregation attempt |  |
|**currentBalance** | **Double** | Current balance of the account |  [optional] |
|**availableBalance** | **Double** | The available balance for the account |  [optional] |
|**balanceDate** | **Long** | A timestamp showing when the balance was captured |  [optional] |
|**transactions** | [**List&lt;ReportTransactionNewTxBased&gt;**](ReportTransactionNewTxBased.md) | a list of transaction records |  |
|**details** | [**AccountDetailsTxBased**](AccountDetailsTxBased.md) |  |  [optional] |
|**accountAnalytics** | [**AccountAnalytics**](AccountAnalytics.md) |  |  [optional] |
|**cashFlowBalance** | [**CashFlowCashFlowBalance**](CashFlowCashFlowBalance.md) |  |  [optional] |
|**cashFlowCredit** | [**CashFlowCashFlowCredit**](CashFlowCashFlowCredit.md) |  |  [optional] |
|**cashFlowDebit** | [**CashFlowCashFlowDebit**](CashFlowCashFlowDebit.md) |  |  [optional] |
|**cashFlowCharacteristic** | [**CashFlowCashFlowCharacteristic**](CashFlowCashFlowCharacteristic.md) |  |  [optional] |
|**balance** | **Double** | The cleared balance of the account as-of &#x60;balanceDate&#x60; |  [optional] |
|**averageMonthlyBalance** | **Double** | The average monthly balance of this account |  [optional] |
|**totNumberInsufficientFundsFeeDebitTxAccount** | **Long** | The count for the total number of insufficient funds transactions, based on the &#x60;fromDate&#x60; of the report. |  [optional] |
|**totNumberInsufficientFundsFeeDebitTxOver6MonthsAccount** | **Integer** | The total number of  insufficient funds fees for the account over six months |  [optional] |
|**totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount** | **Long** | The number of days since the most recent insufficient funds transaction, based on the &#x60;fromDate&#x60; of the report. |  [optional] |
|**asset** | [**PrequalificationReportAssetSummary**](PrequalificationReportAssetSummary.md) |  |  [optional] |
|**totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount** | **Long** | The count for the total number of insufficient funds transactions for the last two months, based on the &#x60;fromDate&#x60; of the report. |  [optional] |
|**position** | [**ReportAccountPosition**](ReportAccountPosition.md) |  |  [optional] |
|**incomeStreams** | [**List&lt;VOIETXVerifyReportIncomeStream&gt;**](VOIETXVerifyReportIncomeStream.md) | A list of income stream records |  [optional] |
|**beginningBalance** | **Double** | Beginning balance of account per the time period in the report |  [optional] |
|**miscDeposits** | [**List&lt;ReportTransaction&gt;**](ReportTransaction.md) | A list of miscellaneous deposits |  [optional] |



