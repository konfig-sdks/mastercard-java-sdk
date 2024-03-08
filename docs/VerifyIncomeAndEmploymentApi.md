# VerifyIncomeAndEmploymentApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVOIReport**](VerifyIncomeAndEmploymentApi.md#createVOIReport) | **POST** /decisioning/v2/customers/{customerId}/voi | Generate VOI Report |
| [**generatePayStatementReport**](VerifyIncomeAndEmploymentApi.md#generatePayStatementReport) | **POST** /decisioning/v2/customers/{customerId}/payStatement | Generate Pay Statement Report |
| [**generateVOETransactionsReport**](VerifyIncomeAndEmploymentApi.md#generateVOETransactionsReport) | **POST** /decisioning/v2/customers/{customerId}/voeTransactions | Generate VOE - Transactions Report |
| [**generateVOIEPaystubWithTxVerifyReport**](VerifyIncomeAndEmploymentApi.md#generateVOIEPaystubWithTxVerifyReport) | **POST** /decisioning/v2/customers/{customerId}/voieTxVerify/withInterview | Generate VOIE - Paystub (with TXVerify) Report |
| [**generateVoePayrollReport**](VerifyIncomeAndEmploymentApi.md#generateVoePayrollReport) | **POST** /decisioning/v2/customers/{customerId}/voePayroll | Generate VOE - Payroll Report |
| [**generateVoiePaystubReport**](VerifyIncomeAndEmploymentApi.md#generateVoiePaystubReport) | **POST** /decisioning/v2/customers/{customerId}/voieTxVerify/withStatement | Generate VOIE - Paystub Report |
| [**refreshVOIEPayrollReport**](VerifyIncomeAndEmploymentApi.md#refreshVOIEPayrollReport) | **POST** /decisioning/v2/customers/{customerId}/voiePayroll | Generate VOIE - Payroll Report |


<a name="createVOIReport"></a>
# **createVOIReport**
> VOIReportAck createVOIReport(customerId, voIReportConstraints).callbackUrl(callbackUrl).execute();

Generate VOI Report

Generate a Verification of Income (VOI) report for all checking, savings, and money market accounts for the given customer. This service retrieves up to two years of transaction history for each account and uses this information to generate the VOI report.  This is a premium service. The billing rate is the variable rate for Verification of Income under the current subscription plan. The billable event is the successful generation of a VOI report.  If no account of type checking, savings, or money market is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VerifyIncomeAndEmploymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.finicity.com";
    
    configuration.finicityAppKey  = "YOUR API KEY";
    
    configuration.finicityAppToken  = "YOUR API KEY";
    Mastercard client = new Mastercard(configuration);
    String customerId = "1005061234"; // A customer ID
    String accountIds = "accountIds_example"; // A whitespace-separated list of account IDs to be included in the report (all accounts will be included if not set)
    List<ReportCustomField> reportCustomFields = Arrays.asList(); // The `reportCustomFields` parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you'd like associated with the report when it's generated. Every custom field consists of three variables: `label`, `value`, and `shown`. The `shown` variable is \\\"true\\\" or \\\"false\\\". * \\\"true\\\": (default) display the custom field in the PDF report * \\\"false\\\": don't display the custom field in the PDF report  For an experience that generates multiple reports, the `reportCustomFields` parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.
    Long fromDate = 56L; // A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
    Integer incomeStreamConfidenceMinimum = 56; // Include income streams in the report, based on the income stream's confidence score. For example, Use the value 50 to include only income streams with a confidence score of 50 or higher.
    String callbackUrl = "https://finicity-test/webhook"; // A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      VOIReportAck result = client
              .verifyIncomeAndEmployment
              .createVOIReport(customerId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .fromDate(fromDate)
              .incomeStreamConfidenceMinimum(incomeStreamConfidenceMinimum)
              .callbackUrl(callbackUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getCustomerType());
      System.out.println(result.getCustomerId());
      System.out.println(result.getRequestId());
      System.out.println(result.getRequesterName());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getConsumerId());
      System.out.println(result.getConsumerSsn());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getErrors());
      System.out.println(result.getPortfolioId());
      System.out.println(result.getConstraints());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyIncomeAndEmploymentApi#createVOIReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VOIReportAck> response = client
              .verifyIncomeAndEmployment
              .createVOIReport(customerId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .fromDate(fromDate)
              .incomeStreamConfidenceMinimum(incomeStreamConfidenceMinimum)
              .callbackUrl(callbackUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyIncomeAndEmploymentApi#createVOIReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A customer ID | |
| **voIReportConstraints** | [**VOIReportConstraints**](VOIReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**VOIReportAck**](VOIReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |

<a name="generatePayStatementReport"></a>
# **generatePayStatementReport**
> PayStatementReportAck generatePayStatementReport(customerId, payStatementReportConstraints).callbackUrl(callbackUrl).execute();

Generate Pay Statement Report

Generate Pay Statement Extraction Report for the given customer. This service accepts asset IDs of the stored pay statements to generate a Pay Statement Extraction Report.  This is a premium service. The billing rate is the variable rate for Pay Statement Extraction Report under the current subscription plan. The billable event is the successful generation of a Pay Statement Extraction Report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VerifyIncomeAndEmploymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.finicity.com";
    
    configuration.finicityAppKey  = "YOUR API KEY";
    
    configuration.finicityAppToken  = "YOUR API KEY";
    Mastercard client = new Mastercard(configuration);
    PayStatementData paystatementReport = new PayStatementData();
    String customerId = "1005061234"; // A customer ID
    List<ReportCustomField> reportCustomFields = Arrays.asList(); // The `reportCustomFields` parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you'd like associated with the report when it's generated. Every custom field consists of three variables: `label`, `value`, and `shown`. The `shown` variable is \\\"true\\\" or \\\"false\\\". * \\\"true\\\": (default) display the custom field in the PDF report * \\\"false\\\": don't display the custom field in the PDF report  For an experience that generates multiple reports, the `reportCustomFields` parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.
    String callbackUrl = "https://finicity-test/webhook"; // A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      PayStatementReportAck result = client
              .verifyIncomeAndEmployment
              .generatePayStatementReport(paystatementReport, customerId)
              .reportCustomFields(reportCustomFields)
              .callbackUrl(callbackUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getCustomerType());
      System.out.println(result.getCustomerId());
      System.out.println(result.getRequestId());
      System.out.println(result.getRequesterName());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getConsumerId());
      System.out.println(result.getConsumerSsn());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getErrors());
      System.out.println(result.getPortfolioId());
      System.out.println(result.getConstraints());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyIncomeAndEmploymentApi#generatePayStatementReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayStatementReportAck> response = client
              .verifyIncomeAndEmployment
              .generatePayStatementReport(paystatementReport, customerId)
              .reportCustomFields(reportCustomFields)
              .callbackUrl(callbackUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyIncomeAndEmploymentApi#generatePayStatementReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A customer ID | |
| **payStatementReportConstraints** | [**PayStatementReportConstraints**](PayStatementReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**PayStatementReportAck**](PayStatementReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |

<a name="generateVOETransactionsReport"></a>
# **generateVOETransactionsReport**
> VOETransactionsReportAck generateVOETransactionsReport(customerId, voETransactionsReportConstraints).callbackUrl(callbackUrl).execute();

Generate VOE - Transactions Report

Premium Service: A billable event when the API response is successful.  MVS-Direct integration developers only.  Used as a complimentary report to the VOA with Income and VOIE - Paystub (with TXVerify) reports and used to fulfill the pre-close VOE requirements.  Retrieve the latest credit transaction information from the borrower&#39;s connected bank accounts and groups them into income streams so that you can view their payment history to ensure a direct deport was made within the expected cadence. The report displays transaction descriptions without any dollar amounts so that income re-verification isn&#39;t necessary.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VerifyIncomeAndEmploymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.finicity.com";
    
    configuration.finicityAppKey  = "YOUR API KEY";
    
    configuration.finicityAppToken  = "YOUR API KEY";
    Mastercard client = new Mastercard(configuration);
    String customerId = "1005061234"; // A customer ID
    String reportId = "reportId_example"; // A report ID
    String accountIds = "accountIds_example"; // A whitespace-separated list of account IDs to be included in the report (all accounts will be included if not set)
    List<ReportCustomField> reportCustomFields = Arrays.asList(); // The `reportCustomFields` parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you'd like associated with the report when it's generated. Every custom field consists of three variables: `label`, `value`, and `shown`. The `shown` variable is \\\"true\\\" or \\\"false\\\". * \\\"true\\\": (default) display the custom field in the PDF report * \\\"false\\\": don't display the custom field in the PDF report  For an experience that generates multiple reports, the `reportCustomFields` parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.
    Long fromDate = 56L; // A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
    Integer incomeStreamConfidenceMinimum = 56; // Include income streams in the report, based on the income stream's confidence score. For example, Use the value 50 to include only income streams with a confidence score of 50 or higher.
    String callbackUrl = "https://finicity-test/webhook"; // A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      VOETransactionsReportAck result = client
              .verifyIncomeAndEmployment
              .generateVOETransactionsReport(customerId)
              .reportId(reportId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .fromDate(fromDate)
              .incomeStreamConfidenceMinimum(incomeStreamConfidenceMinimum)
              .callbackUrl(callbackUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getCustomerType());
      System.out.println(result.getCustomerId());
      System.out.println(result.getRequestId());
      System.out.println(result.getRequesterName());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getConsumerId());
      System.out.println(result.getConsumerSsn());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getErrors());
      System.out.println(result.getPortfolioId());
      System.out.println(result.getConstraints());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyIncomeAndEmploymentApi#generateVOETransactionsReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VOETransactionsReportAck> response = client
              .verifyIncomeAndEmployment
              .generateVOETransactionsReport(customerId)
              .reportId(reportId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .fromDate(fromDate)
              .incomeStreamConfidenceMinimum(incomeStreamConfidenceMinimum)
              .callbackUrl(callbackUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyIncomeAndEmploymentApi#generateVOETransactionsReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A customer ID | |
| **voETransactionsReportConstraints** | [**VOETransactionsReportConstraints**](VOETransactionsReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**VOETransactionsReportAck**](VOETransactionsReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |

<a name="generateVOIEPaystubWithTxVerifyReport"></a>
# **generateVOIEPaystubWithTxVerifyReport**
> VOIEPaystubWithTXVerifyReportAck generateVOIEPaystubWithTxVerifyReport(customerId, voIEWithTXVerifyReportConstraints).callbackUrl(callbackUrl).execute();

Generate VOIE - Paystub (with TXVerify) Report

Generate a VOIE - Paystub (with TXVerify) report for all checking and savings under the given customer. This service retrieves up to two years of transaction history for the given accounts. It then uses this information as well as the provided paystub(s), which are passed into the request body as asset IDs (generated using the Store Customer Pay Statement API) to generate the VOIE - Paystub (with TXVerify) report.  Note: if you are using this API to refresh the bank transactions, use the same asset ID from the first report. A new paystub is not required unless the paystub is too old for underwriting requirements. Using the same asset ID that was on the original report and the previously extracted details will be used to speed up report generation response time.  This is a premium service. The billing rate is the variable rate for VOIE TXVerify under the current subscription plan. The billable event is the successful generation of a VOIE TXVerify Report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VerifyIncomeAndEmploymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.finicity.com";
    
    configuration.finicityAppKey  = "YOUR API KEY";
    
    configuration.finicityAppToken  = "YOUR API KEY";
    Mastercard client = new Mastercard(configuration);
    VOIEWithInterviewData voieWithInterviewData = new VOIEWithInterviewData();
    String customerId = "1005061234"; // A customer ID
    String accountIds = "accountIds_example"; // A whitespace-separated list of account IDs to be included in the report (all accounts will be included if not set)
    List<ReportCustomField> reportCustomFields = Arrays.asList(); // The `reportCustomFields` parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you'd like associated with the report when it's generated. Every custom field consists of three variables: `label`, `value`, and `shown`. The `shown` variable is \\\"true\\\" or \\\"false\\\". * \\\"true\\\": (default) display the custom field in the PDF report * \\\"false\\\": don't display the custom field in the PDF report  For an experience that generates multiple reports, the `reportCustomFields` parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.
    Long fromDate = 56L; // A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
    Integer incomeStreamConfidenceMinimum = 56; // Include income streams in the report, based on the income stream's confidence score. For example, Use the value 50 to include only income streams with a confidence score of 50 or higher.
    String callbackUrl = "https://finicity-test/webhook"; // A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      VOIEPaystubWithTXVerifyReportAck result = client
              .verifyIncomeAndEmployment
              .generateVOIEPaystubWithTxVerifyReport(voieWithInterviewData, customerId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .fromDate(fromDate)
              .incomeStreamConfidenceMinimum(incomeStreamConfidenceMinimum)
              .callbackUrl(callbackUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getCustomerType());
      System.out.println(result.getCustomerId());
      System.out.println(result.getRequestId());
      System.out.println(result.getRequesterName());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getConsumerId());
      System.out.println(result.getConsumerSsn());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getErrors());
      System.out.println(result.getPortfolioId());
      System.out.println(result.getConstraints());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyIncomeAndEmploymentApi#generateVOIEPaystubWithTxVerifyReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VOIEPaystubWithTXVerifyReportAck> response = client
              .verifyIncomeAndEmployment
              .generateVOIEPaystubWithTxVerifyReport(voieWithInterviewData, customerId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .fromDate(fromDate)
              .incomeStreamConfidenceMinimum(incomeStreamConfidenceMinimum)
              .callbackUrl(callbackUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyIncomeAndEmploymentApi#generateVOIEPaystubWithTxVerifyReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A customer ID | |
| **voIEWithTXVerifyReportConstraints** | [**VOIEWithTXVerifyReportConstraints**](VOIEWithTXVerifyReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**VOIEPaystubWithTXVerifyReportAck**](VOIEPaystubWithTXVerifyReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |

<a name="generateVoePayrollReport"></a>
# **generateVoePayrollReport**
> PayrollReportAck generateVoePayrollReport(customerId, payrollReportConstraints).callbackUrl(callbackUrl).execute();

Generate VOE - Payroll Report

Generate or refresh a VOE - Payroll report. Often used as a complementary report to the VOIE-Payroll report to fulfill the pre-close VOE requirements. It retrieves the customer&#39;s employment details and employment status through the payroll source without any income information.  This is a premium service. The billable event is the successful generation of a VOE - Payroll report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VerifyIncomeAndEmploymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.finicity.com";
    
    configuration.finicityAppKey  = "YOUR API KEY";
    
    configuration.finicityAppToken  = "YOUR API KEY";
    Mastercard client = new Mastercard(configuration);
    PayrollData payrollData = new PayrollData();
    String customerId = "1005061234"; // A customer ID
    List<ReportCustomField> reportCustomFields = Arrays.asList(); // The `reportCustomFields` parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you'd like associated with the report when it's generated. Every custom field consists of three variables: `label`, `value`, and `shown`. The `shown` variable is \\\"true\\\" or \\\"false\\\". * \\\"true\\\": (default) display the custom field in the PDF report * \\\"false\\\": don't display the custom field in the PDF report  For an experience that generates multiple reports, the `reportCustomFields` parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.
    Long payStatementsFromDate = 56L; // Limits the pay statement history in the VOIE - Payroll report income record. Pay statements are only included if the payDate of the statement is equal to or greater than the start date requested. Date should be in Unix epoch time (in seconds). See: Handling Epoch Dates and Times.
    String marketSegment = "marketSegment_example"; // Use case for requesting the consumer's data. Current supported enumerations are \\\"Mortgage\\\" and \\\"KYC\\\". If your use case doesn't match one of these please reach out to your technical point of contact.
    Boolean excludeEmpInfo = true; // Only used on an exception basis for clients that need to exclude EmpInfo data from the VOE-Payroll or VOIE-Payroll report. If true is passed EmpInfo payroll provider's data will not be searched or returned.
    String purpose = "purpose_example"; // FCRA required 2-digit Permissible Purpose Code, specifying the reason for retrieving this report.
    String callbackUrl = "https://finicity-test/webhook"; // A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      PayrollReportAck result = client
              .verifyIncomeAndEmployment
              .generateVoePayrollReport(payrollData, customerId)
              .reportCustomFields(reportCustomFields)
              .payStatementsFromDate(payStatementsFromDate)
              .marketSegment(marketSegment)
              .excludeEmpInfo(excludeEmpInfo)
              .purpose(purpose)
              .callbackUrl(callbackUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getCustomerType());
      System.out.println(result.getCustomerId());
      System.out.println(result.getRequestId());
      System.out.println(result.getRequesterName());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getConsumerId());
      System.out.println(result.getConsumerSsn());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getErrors());
      System.out.println(result.getPortfolioId());
      System.out.println(result.getReportStyle());
      System.out.println(result.getConstraints());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyIncomeAndEmploymentApi#generateVoePayrollReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayrollReportAck> response = client
              .verifyIncomeAndEmployment
              .generateVoePayrollReport(payrollData, customerId)
              .reportCustomFields(reportCustomFields)
              .payStatementsFromDate(payStatementsFromDate)
              .marketSegment(marketSegment)
              .excludeEmpInfo(excludeEmpInfo)
              .purpose(purpose)
              .callbackUrl(callbackUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyIncomeAndEmploymentApi#generateVoePayrollReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A customer ID | |
| **payrollReportConstraints** | [**PayrollReportConstraints**](PayrollReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**PayrollReportAck**](PayrollReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |

<a name="generateVoiePaystubReport"></a>
# **generateVoiePaystubReport**
> VOIEPaystubReportAck generateVoiePaystubReport(customerId, voIEReportConstraints).callbackUrl(callbackUrl).execute();

Generate VOIE - Paystub Report

Generate a VOIE - Paystub report. This service uses the provided paystub(s), which are passed into the request body as asset IDs (generated using the Store Customer Pay Statement API) to generate the VOIE - Paystub report with digitized paystub details.  This is a premium service. The billing rate is the variable rate for VOIE - Paystub under the current subscription plan. The billable event is the successful generation of a VOIE - Paystub Report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VerifyIncomeAndEmploymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.finicity.com";
    
    configuration.finicityAppKey  = "YOUR API KEY";
    
    configuration.finicityAppToken  = "YOUR API KEY";
    Mastercard client = new Mastercard(configuration);
    VOIEWithStatementData voieWithStatementData = new VOIEWithStatementData();
    String customerId = "1005061234"; // A customer ID
    List<ReportCustomField> reportCustomFields = Arrays.asList(); // The `reportCustomFields` parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you'd like associated with the report when it's generated. Every custom field consists of three variables: `label`, `value`, and `shown`. The `shown` variable is \\\"true\\\" or \\\"false\\\". * \\\"true\\\": (default) display the custom field in the PDF report * \\\"false\\\": don't display the custom field in the PDF report  For an experience that generates multiple reports, the `reportCustomFields` parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.
    String callbackUrl = "https://finicity-test/webhook"; // A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      VOIEPaystubReportAck result = client
              .verifyIncomeAndEmployment
              .generateVoiePaystubReport(voieWithStatementData, customerId)
              .reportCustomFields(reportCustomFields)
              .callbackUrl(callbackUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getCustomerType());
      System.out.println(result.getCustomerId());
      System.out.println(result.getRequestId());
      System.out.println(result.getRequesterName());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getConsumerId());
      System.out.println(result.getConsumerSsn());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getErrors());
      System.out.println(result.getPortfolioId());
      System.out.println(result.getConstraints());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyIncomeAndEmploymentApi#generateVoiePaystubReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VOIEPaystubReportAck> response = client
              .verifyIncomeAndEmployment
              .generateVoiePaystubReport(voieWithStatementData, customerId)
              .reportCustomFields(reportCustomFields)
              .callbackUrl(callbackUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyIncomeAndEmploymentApi#generateVoiePaystubReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A customer ID | |
| **voIEReportConstraints** | [**VOIEReportConstraints**](VOIEReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**VOIEPaystubReportAck**](VOIEPaystubReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |

<a name="refreshVOIEPayrollReport"></a>
# **refreshVOIEPayrollReport**
> PayrollReportAck refreshVOIEPayrollReport(customerId, payrollReportConstraints).callbackUrl(callbackUrl).execute();

Generate VOIE - Payroll Report

Generate or refresh a VOIE - Payroll report. For clients using the product via a consumer permissioning experience via Connect, the original VOIE - Payroll report generates when the consumer completes the Connect experience, and this API is only used for future report refreshes without reengaging the consumer.  This is a premium service. The billable event is the successful generation of a VOIE - Payroll report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VerifyIncomeAndEmploymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.finicity.com";
    
    configuration.finicityAppKey  = "YOUR API KEY";
    
    configuration.finicityAppToken  = "YOUR API KEY";
    Mastercard client = new Mastercard(configuration);
    PayrollData payrollData = new PayrollData();
    String customerId = "1005061234"; // A customer ID
    List<ReportCustomField> reportCustomFields = Arrays.asList(); // The `reportCustomFields` parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you'd like associated with the report when it's generated. Every custom field consists of three variables: `label`, `value`, and `shown`. The `shown` variable is \\\"true\\\" or \\\"false\\\". * \\\"true\\\": (default) display the custom field in the PDF report * \\\"false\\\": don't display the custom field in the PDF report  For an experience that generates multiple reports, the `reportCustomFields` parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.
    Long payStatementsFromDate = 56L; // Limits the pay statement history in the VOIE - Payroll report income record. Pay statements are only included if the payDate of the statement is equal to or greater than the start date requested. Date should be in Unix epoch time (in seconds). See: Handling Epoch Dates and Times.
    String marketSegment = "marketSegment_example"; // Use case for requesting the consumer's data. Current supported enumerations are \\\"Mortgage\\\" and \\\"KYC\\\". If your use case doesn't match one of these please reach out to your technical point of contact.
    Boolean excludeEmpInfo = true; // Only used on an exception basis for clients that need to exclude EmpInfo data from the VOE-Payroll or VOIE-Payroll report. If true is passed EmpInfo payroll provider's data will not be searched or returned.
    String purpose = "purpose_example"; // FCRA required 2-digit Permissible Purpose Code, specifying the reason for retrieving this report.
    String callbackUrl = "https://finicity-test/webhook"; // A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      PayrollReportAck result = client
              .verifyIncomeAndEmployment
              .refreshVOIEPayrollReport(payrollData, customerId)
              .reportCustomFields(reportCustomFields)
              .payStatementsFromDate(payStatementsFromDate)
              .marketSegment(marketSegment)
              .excludeEmpInfo(excludeEmpInfo)
              .purpose(purpose)
              .callbackUrl(callbackUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getCustomerType());
      System.out.println(result.getCustomerId());
      System.out.println(result.getRequestId());
      System.out.println(result.getRequesterName());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getConsumerId());
      System.out.println(result.getConsumerSsn());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getErrors());
      System.out.println(result.getPortfolioId());
      System.out.println(result.getReportStyle());
      System.out.println(result.getConstraints());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyIncomeAndEmploymentApi#refreshVOIEPayrollReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayrollReportAck> response = client
              .verifyIncomeAndEmployment
              .refreshVOIEPayrollReport(payrollData, customerId)
              .reportCustomFields(reportCustomFields)
              .payStatementsFromDate(payStatementsFromDate)
              .marketSegment(marketSegment)
              .excludeEmpInfo(excludeEmpInfo)
              .purpose(purpose)
              .callbackUrl(callbackUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyIncomeAndEmploymentApi#refreshVOIEPayrollReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | **String**| A customer ID | |
| **payrollReportConstraints** | [**PayrollReportConstraints**](PayrollReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**PayrollReportAck**](PayrollReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |

