

# VOIEPayrollReportAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employmentHistory** | [**List&lt;PayrollEmploymentHistoryVOIE&gt;**](PayrollEmploymentHistoryVOIE.md) | An array of employment histories, one for each of the consumer&#39;s verified employers |  [optional] |
|**gseEnabled** | **Boolean** | Mastercard Open Banking internal use only to flag reports that should not be retrieved by the GSE&#39;s (Government-Sponsored Enterprise).  This is a mandatory field for VOE-payroll and VOIE-payroll report types. |  [optional] |
|**reportStyle** | **String** | A report style. Possible values are directAPIPayroll, credentialedPayroll, paystatement, voieWithInterview, voieWithStatement, voieWithReport |  [optional] |



