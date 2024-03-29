

# VOIETXVerifyReportIncomeStream


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Finicity&#39;s income stream ID |  |
|**name** | **String** | A human-readable name based on the &#x60;normalizedPayee&#x60; name of the transactions for this income stream |  |
|**status** | **String** | Possible values: \&quot;ACTIVE\&quot;, \&quot;INACTIVE\&quot; |  |
|**confidence** | **Integer** | Level of confidence that the deposit stream represents income (example: 85%) |  |
|**cadence** | [**CadenceDetails**](CadenceDetails.md) |  |  |
|**netMonthly** | [**List&lt;NetMonthly&gt;**](NetMonthly.md) | A list of net monthly records. One instance for each complete calendar month in the report. |  [optional] |
|**netAnnual** | **Double** | Sum of all values in &#x60;netMonthlyIncome&#x60; over the previous 12 months |  [optional] |
|**projectedNetAnnual** | **Double** | Projected net income over the next 12 months, across all income streams, based on &#x60;netAnnualIncome&#x60; |  [optional] |
|**estimatedGrossAnnual** | **Double** | Before-tax gross annual income (estimated from &#x60;netAnnual&#x60;) across all income stream in the past 12 months |  [optional] |
|**projectedGrossAnnual** | **Double** | Projected gross income over the next 12 months, across all active income streams, based on &#x60;projectedNetAnnual&#x60; |  [optional] |
|**averageMonthlyIncomeNet** | **Double** | Monthly average amount over the previous 24 months |  [optional] |
|**incomeStreamMonths** | **Integer** | The number of months the income transactions are observed |  [optional] |
|**transactions** | [**List&lt;ReportTransaction&gt;**](ReportTransaction.md) | A list of transaction records |  |



