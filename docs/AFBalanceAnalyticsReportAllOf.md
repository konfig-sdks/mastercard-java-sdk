

# AFBalanceAnalyticsReportAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **Long** | The &#x60;postedDate&#x60; of the earliest transaction analyzed for the report. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**endDate** | **Long** | The &#x60;postedDate&#x60; of the latest transaction analyzed for the report. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**days** | **Integer** | Number of days covered by the report |  [optional] |
|**seasoned** | **Boolean** | \&quot;true\&quot; if the report covers more than 365 days |  [optional] |
|**institutions** | [**List&lt;ReportInstitution&gt;**](ReportInstitution.md) | A list of institution records, including information about the individual accounts used in this report |  [optional] |
|**customerAnalytics** | [**CustomerAnalytics**](CustomerAnalytics.md) |  |  [optional] |



