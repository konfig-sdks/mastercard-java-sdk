

# PayStatementReportAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **Long** | The &#x60;postedDate&#x60; of the earliest transaction analyzed for the report. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**endDate** | **Long** | The &#x60;postedDate&#x60; of the latest transaction analyzed for the report. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). |  [optional] |
|**reportStyle** | **String** | A report style. Possible values are directAPIPayroll, credentialedPayroll, paystatement, voieWithInterview, voieWithStatement, voieWithReport |  [optional] |
|**numberOfBillableAssets** | **Integer** | Total number of billable pay statements included in the report |  [optional] |
|**assetIds** | **List&lt;String&gt;** |  |  [optional] |
|**payStatements** | [**List&lt;VOIEPayStatement&gt;**](VOIEPayStatement.md) | Extracted pay statement details |  [optional] |



