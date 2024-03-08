# PaymentHistoryApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateCustomerPaymentReport**](PaymentHistoryApi.md#generateCustomerPaymentReport) | **POST** /analytics/payment-history/v1/customer/{customerId} | Generate Payment History |
| [**generateFcraPaymentReport**](PaymentHistoryApi.md#generateFcraPaymentReport) | **POST** /analytics/payment-history/v1/customer/{customerId}/fcra | Generate Payment History - FCRA |
| [**getReportData**](PaymentHistoryApi.md#getReportData) | **GET** /analytics/data/v1/{obb_report_id} | Get OBB Analytics Report |
| [**getReportDataFcra**](PaymentHistoryApi.md#getReportDataFcra) | **GET** /analytics/data/v1/{obb_report_id}/fcra | Get OBB Analytics Report - FCRA |


<a name="generateCustomerPaymentReport"></a>
# **generateCustomerPaymentReport**
> ObbAnalyticsReportAck generateCustomerPaymentReport(customerId).referenceNumber(referenceNumber).execute();

Generate Payment History

Payment history report analyzes up to 12-months of transactions and predicts the probability that a SMB will experience a payment risk event, such as NSF/Overdraft or missed recurring payments, in the near future when making a payment. The Risk Score provided in the report is a 2-digit ranking with four levels of risk going from low to high.  Some of the highlights of calculated risk present in the report include: * Risk Score representing the likelihood of a missed payment   based on analysis of permissioned open-banking data  * Monthly average balance for all accounts by month in the requested   time period  * Total deposit amount by month for all accounts in the requested time   period  * Total withdrawal amounts by month for all accounts in the requested   time period  * Number of NSF counts and aggregate amount per month in the requested   time period  * Recurring loan payment amounts per month in the requested time period * Insurance payment amount per month in the requested time period * Tax payment amounts per month in the requested time period  This version of the API is intended for piloting and integration testing your application with the Payment History product. It does not adhere to FCRA requirements, and should not be used for production/lending purposes. See _Generate Payment History - FCRA_ for the FCRA compliant version of this API.  *Note:* this is a premium service, billable per every successful API call for non-testing customers.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get OBB Analytics Report_ (operation: _GetObbAnalyticsReport_). *Note:* this is a premium service, billable per every successful API call for non-testing customers.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentHistoryApi;
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
    String referenceNumber = "abc123"; // Partner-provided reference number to correlate reports.
    try {
      ObbAnalyticsReportAck result = client
              .paymentHistory
              .generateCustomerPaymentReport(customerId)
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
      System.err.println("Exception when calling PaymentHistoryApi#generateCustomerPaymentReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ObbAnalyticsReportAck> response = client
              .paymentHistory
              .generateCustomerPaymentReport(customerId)
              .referenceNumber(referenceNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentHistoryApi#generateCustomerPaymentReport");
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
| **referenceNumber** | **String**| Partner-provided reference number to correlate reports. | [optional] |

### Return type

[**ObbAnalyticsReportAck**](ObbAnalyticsReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response given when payment history was generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF. |  -  |

<a name="generateFcraPaymentReport"></a>
# **generateFcraPaymentReport**
> ObbAnalyticsReportAck generateFcraPaymentReport(customerId).referenceNumber(referenceNumber).execute();

Generate Payment History - FCRA

Payment history report analyzes up to 12-months of transactions and predicts the probability that a SMB will experience a payment risk event, such as NSF/Overdraft or missed recurring payments, in the near future when making a payment. The Risk Score provided in the report is a 2-digit ranking with four levels of risk going from low to high.  Some of the highlights of calculated risk present in the report include: * Risk Score representing the likelihood of a missed payment   based on analysis of permissioned open-banking data  * Monthly average balance for all accounts by month in the requested   time period  * Total deposit amount by month for all accounts in the requested time   period  * Total withdrawal amounts by month for all accounts in the requested   time period  * Number of NSF counts and aggregate amount per month in the requested   time period  * Recurring loan payment amounts per month in the requested time period * Insurance payment amount per month in the requested time period * Tax payment amounts per month in the requested time period  This version of the API is intended for production use. It maintains and  enforces all compliance with FCRA rules and requirements.   *Note:* this is a premium service, billable per every successful API call for non-testing customers.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get OBB Analytics Report - FCRA_  (operation: _GetObbAnalyticsReportFcra_).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentHistoryApi;
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
    String referenceNumber = "abc123"; // Partner-provided reference number to correlate reports.
    try {
      ObbAnalyticsReportAck result = client
              .paymentHistory
              .generateFcraPaymentReport(customerId)
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
      System.err.println("Exception when calling PaymentHistoryApi#generateFcraPaymentReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ObbAnalyticsReportAck> response = client
              .paymentHistory
              .generateFcraPaymentReport(customerId)
              .referenceNumber(referenceNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentHistoryApi#generateFcraPaymentReport");
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
| **referenceNumber** | **String**| Partner-provided reference number to correlate reports. | [optional] |

### Return type

[**ObbAnalyticsReportAck**](ObbAnalyticsReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response given when payment history (FCRA) was generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF. |  -  |

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
import com.konfigthis.client.api.PaymentHistoryApi;
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
              .paymentHistory
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
      System.err.println("Exception when calling PaymentHistoryApi#getReportData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ObbAnalyticsReport> response = client
              .paymentHistory
              .getReportData(obbReportId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentHistoryApi#getReportData");
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
import com.konfigthis.client.api.PaymentHistoryApi;
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
              .paymentHistory
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
      System.err.println("Exception when calling PaymentHistoryApi#getReportDataFcra");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ObbAnalyticsReport> response = client
              .paymentHistory
              .getReportDataFcra(obbReportId, purpose)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentHistoryApi#getReportDataFcra");
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

