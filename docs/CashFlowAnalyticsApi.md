# CashFlowAnalyticsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateAnalytics**](CashFlowAnalyticsApi.md#generateAnalytics) | **POST** /analytics/cashflow/v1/customer/{customerId} | Generate Cash Flow Analytics |
| [**generateFcraAnalyticsReport**](CashFlowAnalyticsApi.md#generateFcraAnalyticsReport) | **POST** /analytics/cashflow/v1/customer/{customerId}/fcra | Generate Cash Flow Analytics - FCRA |
| [**generateReport**](CashFlowAnalyticsApi.md#generateReport) | **POST** /decisioning/v2/customers/{customerId}/reports/cashflow-analytics/userTypes/{userType} | Generate Cashflow Analytics Report - Personal/Business |
| [**getReportData**](CashFlowAnalyticsApi.md#getReportData) | **GET** /analytics/data/v1/{obb_report_id} | Get OBB Analytics Report |
| [**getReportDataFcra**](CashFlowAnalyticsApi.md#getReportDataFcra) | **GET** /analytics/data/v1/{obb_report_id}/fcra | Get OBB Analytics Report - FCRA |


<a name="generateAnalytics"></a>
# **generateAnalytics**
> ObbAnalyticsReportAck generateAnalytics(customerId, balanceAndCashFlowAnalyticsReportConstraints).referenceNumber(referenceNumber).execute();

Generate Cash Flow Analytics

Cash Flow Analytics for Business analyzes cash flow over time to report metrics and identify behavior that may indicate risk.  Calculated metrics include: * Average transaction value by month over the requested time period * Net cash flow over the requested time period and broken down by month * Count and report of weeks in the requested time period where there   were zero transactions posted to the customer&#39;s accounts  * Minimum/maximum/average/sum/count of deposits by month * Minimum/maximum/average/sum/count of withdrawals by month * Estimated amount of deposits that can be classified as business   revenue  * Number of transactions posted incurring a non-sufficient funds (NSF)   fee, and net amount charged in NSF fees   This version of the API is intended for piloting and integration testing your application with the Cash Flow Analytics product. It does not adhere to FCRA requirements, and should not be used for production/lending purposes. See _Generate Cash Flow Analytics - FCRA_ for the FCRA compliant version of this API.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get Cash Flow Analytics Report_ (operation: _GetCashFlowAnalyticsReport_).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CashFlowAnalyticsApi;
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
    List<Long> accountIds = Arrays.asList(); // The list of account IDs to include in the report. If omitted, all accounts on record for the customer will be used.
    Integer lengthOfReport = 56; // Number of days to search for transactions. Must be one of 30, 90, 180, 270, 365, or 730. If omitted, defaults to 2 years from current time at which the request was received (730 days).
    String referenceNumber = "abc123"; // Partner-provided reference number to correlate reports.
    try {
      ObbAnalyticsReportAck result = client
              .cashFlowAnalytics
              .generateAnalytics(customerId)
              .accountIds(accountIds)
              .lengthOfReport(lengthOfReport)
              .referenceNumber(referenceNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getAccountIds());
      System.out.println(result.getBusinessId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getCustomerId());
      System.out.println(result.getReportId());
      System.out.println(result.getReportPin());
      System.out.println(result.getRequesterName());
    } catch (ApiException e) {
      System.err.println("Exception when calling CashFlowAnalyticsApi#generateAnalytics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ObbAnalyticsReportAck> response = client
              .cashFlowAnalytics
              .generateAnalytics(customerId)
              .accountIds(accountIds)
              .lengthOfReport(lengthOfReport)
              .referenceNumber(referenceNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CashFlowAnalyticsApi#generateAnalytics");
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
| **balanceAndCashFlowAnalyticsReportConstraints** | [**BalanceAndCashFlowAnalyticsReportConstraints**](BalanceAndCashFlowAnalyticsReportConstraints.md)|  | |
| **referenceNumber** | **String**| Partner-provided reference number to correlate reports. | [optional] |

### Return type

[**ObbAnalyticsReportAck**](ObbAnalyticsReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response given when cash flow analytics were generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF. |  -  |

<a name="generateFcraAnalyticsReport"></a>
# **generateFcraAnalyticsReport**
> ObbAnalyticsReportAck generateFcraAnalyticsReport(customerId, balanceAndCashFlowAnalyticsReportConstraints).referenceNumber(referenceNumber).execute();

Generate Cash Flow Analytics - FCRA

Cash Flow Analytics for Business analyzes cash flow over time to report metrics and identify behavior that may indicate risk.  Calculated metrics include: * Average transaction value by month over the requested time period * Net cash flow over the requested time period and broken down by month * Count and report of weeks in the requested time period where there   were zero transactions posted to the customer&#39;s accounts  * Minimum/maximum/average/sum/count of deposits by month * Minimum/maximum/average/sum/count of withdrawals by month * Estimated amount of deposits that can be classified as business   revenue  * Number of transactions posted incurring a non-sufficient funds (NSF)   fee, and net amount charged in NSF fees   This version of the API is intended for production use. It maintains and enforces all compliance with FCRA rules and requirements.  *Note:* this is a premium service, billable per every successful API call for non-testing customers.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get Cash Flow Analytics Report - FCRA_ (operation: _GetCashFlowAnalyticsReportFCRA_).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CashFlowAnalyticsApi;
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
    List<Long> accountIds = Arrays.asList(); // The list of account IDs to include in the report. If omitted, all accounts on record for the customer will be used.
    Integer lengthOfReport = 56; // Number of days to search for transactions. Must be one of 30, 90, 180, 270, 365, or 730. If omitted, defaults to 2 years from current time at which the request was received (730 days).
    String referenceNumber = "abc123"; // Partner-provided reference number to correlate reports.
    try {
      ObbAnalyticsReportAck result = client
              .cashFlowAnalytics
              .generateFcraAnalyticsReport(customerId)
              .accountIds(accountIds)
              .lengthOfReport(lengthOfReport)
              .referenceNumber(referenceNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getAccountIds());
      System.out.println(result.getBusinessId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getCustomerId());
      System.out.println(result.getReportId());
      System.out.println(result.getReportPin());
      System.out.println(result.getRequesterName());
    } catch (ApiException e) {
      System.err.println("Exception when calling CashFlowAnalyticsApi#generateFcraAnalyticsReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ObbAnalyticsReportAck> response = client
              .cashFlowAnalytics
              .generateFcraAnalyticsReport(customerId)
              .accountIds(accountIds)
              .lengthOfReport(lengthOfReport)
              .referenceNumber(referenceNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CashFlowAnalyticsApi#generateFcraAnalyticsReport");
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
| **balanceAndCashFlowAnalyticsReportConstraints** | [**BalanceAndCashFlowAnalyticsReportConstraints**](BalanceAndCashFlowAnalyticsReportConstraints.md)|  | |
| **referenceNumber** | **String**| Partner-provided reference number to correlate reports. | [optional] |

### Return type

[**ObbAnalyticsReportAck**](ObbAnalyticsReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response given when cash flow analytics (FCRA) were generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF. |  -  |

<a name="generateReport"></a>
# **generateReport**
> AnalyticsReportAck generateReport(customerId, userType, analyticsReportConstraints).callbackUrl(callbackUrl).execute();

Generate Cashflow Analytics Report - Personal/Business

Generate a Cashflow Analytics Report for a given customer. This service retrieves up to two years of transaction history from connected accounts.  Cashflow Analytics analyzes transaction over time to report metrics and identify behavior that may indicate risk.  Before calling this API, A consumer or business may need to be created for the given customer ID based on the user type (see Consumer/Business APIs).  If no account type of checking or savings is found, the service will return HTTP 400 Bad Request.  This is a premium service, billable per every successful API call for non-testing customers. A successful call to this API will generate analytics report which can be retrieved via Get Report by Customer or Get Report by Consumer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CashFlowAnalyticsApi;
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
    String userType = "personal"; // UserType indicates if the request is for a business or personal use case, Allowed values: business/personal.
    AnalyticsReportData analyticsReportData = new AnalyticsReportData();
    String accountIds = "accountIds_example"; // A whitespace-separated list of account IDs to be included in the report (all accounts will be included if not set)
    List<ReportCustomField> reportCustomFields = Arrays.asList(); // The `reportCustomFields` parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you'd like associated with the report when it's generated. Every custom field consists of three variables: `label`, `value`, and `shown`. The `shown` variable is \\\"true\\\" or \\\"false\\\". * \\\"true\\\": (default) display the custom field in the PDF report * \\\"false\\\": don't display the custom field in the PDF report  For an experience that generates multiple reports, the `reportCustomFields` parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.
    Long fromDate = 56L; // A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
    String callbackUrl = "https://finicity-test/webhook"; // A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      AnalyticsReportAck result = client
              .cashFlowAnalytics
              .generateReport(customerId, userType)
              .analyticsReportData(analyticsReportData)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .fromDate(fromDate)
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
      System.out.println(result.getBusinessDetails());
      System.out.println(result.getReportPin());
      System.out.println(result.getConstraints());
    } catch (ApiException e) {
      System.err.println("Exception when calling CashFlowAnalyticsApi#generateReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AnalyticsReportAck> response = client
              .cashFlowAnalytics
              .generateReport(customerId, userType)
              .analyticsReportData(analyticsReportData)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .fromDate(fromDate)
              .callbackUrl(callbackUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CashFlowAnalyticsApi#generateReport");
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
| **userType** | **String**| UserType indicates if the request is for a business or personal use case, Allowed values: business/personal. | |
| **analyticsReportConstraints** | [**AnalyticsReportConstraints**](AnalyticsReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**AnalyticsReportAck**](AnalyticsReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  * Location - Please Check the Report status at URL /decisioning/v4/consumers/{consumer_id}/reports/{report_id} /decisioning/v4/customers/{customer_id}/reports/{report_id} <br>  |

<a name="getReportData"></a>
# **getReportData**
> ObbAnalyticsReport getReportData(obbReportId).execute();

Get OBB Analytics Report

Retrieve the report saved by _Generate Balance Analytics_, _Generate Cash Flow Analytics_, or _Generate Payment History_. Requires the report ID generated by the previous call.  Report data can either be retrieved as a JSON document or PDF file.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CashFlowAnalyticsApi;
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
    String obbReportId = "bcab9592-e032-4e7b-b737-0380619a0573"; // Report ID generated and returned by OBB products
    try {
      ObbAnalyticsReport result = client
              .cashFlowAnalytics
              .getReportData(obbReportId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getAccountResults());
      System.out.println(result.getBusinessId());
      System.out.println(result.getBusinessSummary());
      System.out.println(result.getCustomerId());
      System.out.println(result.getReportHeader());
      System.out.println(result.getRequesterName());
      System.out.println(result.getTotalRevenue());
      System.out.println(result.getAccountIds());
      System.out.println(result.getAnalytics());
    } catch (ApiException e) {
      System.err.println("Exception when calling CashFlowAnalyticsApi#getReportData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ObbAnalyticsReport> response = client
              .cashFlowAnalytics
              .getReportData(obbReportId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CashFlowAnalyticsApi#getReportData");
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
| **obbReportId** | **String**| Report ID generated and returned by OBB products | |

### Return type

[**ObbAnalyticsReport**](ObbAnalyticsReport.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/pdf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OBB Analytics report data as JSON or PDF |  -  |

<a name="getReportDataFcra"></a>
# **getReportDataFcra**
> ObbAnalyticsReport getReportDataFcra(obbReportId, purpose).execute();

Get OBB Analytics Report - FCRA

Retrieve the report saved by _Generate Balance Analytics - FCRA_, _Generate Cash Flow Analytics - FCRA_, or _Generate Payment History - FCRA_. Requires the report ID generated by the previous call.  Report data can either be retrieved as a JSON document or PDF file.  *Note:* this is a premium service, billable per every successful API call for non-testing customers.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CashFlowAnalyticsApi;
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
    String obbReportId = "bcab9592-e032-4e7b-b737-0380619a0573"; // Report ID generated and returned by OBB products
    String purpose = "3F"; // 2-digit code from [Permissible Purpose Codes](https://developer.mastercard.com/open-banking-us/documentation/products/lend/report-handling/permissible-purpose-codes/), specifying the reason for retrieving this report. Required for retrieving some reports.
    try {
      ObbAnalyticsReport result = client
              .cashFlowAnalytics
              .getReportDataFcra(obbReportId, purpose)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getAccountResults());
      System.out.println(result.getBusinessId());
      System.out.println(result.getBusinessSummary());
      System.out.println(result.getCustomerId());
      System.out.println(result.getReportHeader());
      System.out.println(result.getRequesterName());
      System.out.println(result.getTotalRevenue());
      System.out.println(result.getAccountIds());
      System.out.println(result.getAnalytics());
    } catch (ApiException e) {
      System.err.println("Exception when calling CashFlowAnalyticsApi#getReportDataFcra");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ObbAnalyticsReport> response = client
              .cashFlowAnalytics
              .getReportDataFcra(obbReportId, purpose)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CashFlowAnalyticsApi#getReportDataFcra");
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
| **obbReportId** | **String**| Report ID generated and returned by OBB products | |
| **purpose** | **String**| 2-digit code from [Permissible Purpose Codes](https://developer.mastercard.com/open-banking-us/documentation/products/lend/report-handling/permissible-purpose-codes/), specifying the reason for retrieving this report. Required for retrieving some reports. | |

### Return type

[**ObbAnalyticsReport**](ObbAnalyticsReport.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/pdf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OBB Analytics FCRA report data as JSON or PDF |  -  |

