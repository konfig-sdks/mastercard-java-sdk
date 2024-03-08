# CashFlowApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generatePersonalReport**](CashFlowApi.md#generatePersonalReport) | **POST** /decisioning/v2/customers/{customerId}/cashFlowPersonal | Generate Cash Flow Report - Personal |
| [**generateReportBusiness**](CashFlowApi.md#generateReportBusiness) | **POST** /decisioning/v2/customers/{customerId}/cashFlowBusiness | Generate Cash Flow Report - Business |


<a name="generatePersonalReport"></a>
# **generatePersonalReport**
> CashFlowReportAck generatePersonalReport(customerId, cashFlowReportConstraints).callbackUrl(callbackUrl).execute();

Generate Cash Flow Report - Personal

Generate a Cash Flow Report (Personal) report for all checking and savings under the given customer. This service retrieves up to two years of transaction history for the given account. It then uses this information to generate the CFR report.  This report is provided under FCRA rules, with Finicity acting as the CRA (Consumer Reporting Agency). If an individual account is included in the report - for example, with an individual acting as an personal guarantor on the loan - then this version of the report should be used. In case of an adverse action on the loan where the decision was based on this report, then the borrower can be referred to the [Finicity Consumer Portal](https://consumer.finicityreports.com) where they can view this report and submit a dispute if they feel any information in this report is inaccurate.  Before calling this API, a consumer must be created for the given customer ID (see Consumers APIs).  If no account type of checking or savings is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CashFlowApi;
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
    Boolean showNsf = true; // Include the non-sufficient funds (NSF) summary JSON and the NSF summary PDF section in the report. Data included: * Account  * Total number of NSF funds  * Days since the most recent NFS funds fee
    Long fromDate = 56L; // A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
    Integer incomeStreamConfidenceMinimum = 56; // Include income streams in the report, based on the income stream's confidence score. For example, Use the value 50 to include only income streams with a confidence score of 50 or higher.
    String callbackUrl = "https://finicity-test/webhook"; // A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      CashFlowReportAck result = client
              .cashFlow
              .generatePersonalReport(customerId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .showNsf(showNsf)
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
      System.out.println(result.getConstraints());
    } catch (ApiException e) {
      System.err.println("Exception when calling CashFlowApi#generatePersonalReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CashFlowReportAck> response = client
              .cashFlow
              .generatePersonalReport(customerId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .showNsf(showNsf)
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
      System.err.println("Exception when calling CashFlowApi#generatePersonalReport");
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
| **cashFlowReportConstraints** | [**CashFlowReportConstraints**](CashFlowReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**CashFlowReportAck**](CashFlowReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |

<a name="generateReportBusiness"></a>
# **generateReportBusiness**
> CashFlowReportAck generateReportBusiness(customerId, cashFlowReportConstraints).callbackUrl(callbackUrl).execute();

Generate Cash Flow Report - Business

Generate a Cash Flow Report (Business) report for all checking and savings under the given customer. This service retrieves up to two years of transaction history for the given account. It then uses this information to generate the CFR report. A consumer is not required to generate this report.  This report is not provided under FCRA rules, and this report is not available in the Finicity Consumer Portal for the borrower to view.  If no account type of checking or savings is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CashFlowApi;
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
    Boolean showNsf = true; // Include the non-sufficient funds (NSF) summary JSON and the NSF summary PDF section in the report. Data included: * Account  * Total number of NSF funds  * Days since the most recent NFS funds fee
    Long fromDate = 56L; // A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
    Integer incomeStreamConfidenceMinimum = 56; // Include income streams in the report, based on the income stream's confidence score. For example, Use the value 50 to include only income streams with a confidence score of 50 or higher.
    String callbackUrl = "https://finicity-test/webhook"; // A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      CashFlowReportAck result = client
              .cashFlow
              .generateReportBusiness(customerId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .showNsf(showNsf)
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
      System.out.println(result.getConstraints());
    } catch (ApiException e) {
      System.err.println("Exception when calling CashFlowApi#generateReportBusiness");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CashFlowReportAck> response = client
              .cashFlow
              .generateReportBusiness(customerId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .showNsf(showNsf)
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
      System.err.println("Exception when calling CashFlowApi#generateReportBusiness");
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
| **cashFlowReportConstraints** | [**CashFlowReportConstraints**](CashFlowReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**CashFlowReportAck**](CashFlowReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |

