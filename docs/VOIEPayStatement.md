

# VOIEPayStatement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payPeriod** | **String** | The pay period of the pay statement |  [optional] |
|**billable** | **Boolean** | Designates whether the pay statement is billable |  [optional] |
|**assetId** | **String** | The asset ID of the stored pay statement |  [optional] |
|**payDate** | **Long** | The listed pay date for the pay statement |  [optional] |
|**startDate** | **Long** | The beginning of the pay period |  [optional] |
|**endDate** | **Long** | The end of the pay period |  [optional] |
|**netPayCurrent** | **Double** | The total pay after deductions for the employee for the current pay period |  [optional] |
|**netPayYTD** | **Double** | The total accumulation of pay after deductions for the employee for the current pay year |  [optional] |
|**grossPayCurrent** | **Double** | The total pay before deductions for the employee for the current pay period |  [optional] |
|**grossPayYTD** | **Double** | The total accumulation of pay before deductions for the employee for the current pay year |  [optional] |
|**payrollProvider** | **String** | The company that provides the pay stub. |  [optional] |
|**employer** | [**Employer**](Employer.md) |  |  [optional] |
|**employee** | [**Employee**](Employee.md) |  |  [optional] |
|**payStat** | [**List&lt;PayStat&gt;**](PayStat.md) | Information pertaining to the earnings on the pay statement |  [optional] |
|**deductions** | [**List&lt;Deduction&gt;**](Deduction.md) | Information pertaining to deductions on the pay statement |  [optional] |
|**directDeposits** | [**List&lt;DirectDeposit&gt;**](DirectDeposit.md) | Information pertaining to direct deposits on the pay statement |  [optional] |



