# VerifyAssetsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customerVOAReport**](VerifyAssetsApi.md#customerVOAReport) | **POST** /decisioning/v2/customers/{customerId}/voa | Generate VOA Report |
| [**generateVOAWithIncomeReport**](VerifyAssetsApi.md#generateVOAWithIncomeReport) | **POST** /decisioning/v2/customers/{customerId}/voaHistory | Generate VOA With Income Report |
| [**getAssetSummary**](VerifyAssetsApi.md#getAssetSummary) | **POST** /decisioning/v2/customers/{customerId}/assetSummary | Generate Prequalification (Non-CRA) Report |
| [**getCheckingSavingsInvestmentAccounts**](VerifyAssetsApi.md#getCheckingSavingsInvestmentAccounts) | **POST** /decisioning/v2/customers/{customerId}/preQualVoa | Generate Prequalification (CRA) Report |


<a name="customerVOAReport"></a>
# **customerVOAReport**
> VOAReportAck customerVOAReport(customerId, voAReportConstraints).callbackUrl(callbackUrl).execute();

Generate VOA Report

Generate a Verification of Assets (VOA) report for all checking, savings, money market, and investment accounts for the given customer. This service retrieves up to twelve months of transaction history for each account and uses this information to generate the VOA report.  This is a premium service. The billing rate is the variable rate for Verification of Assets under the current subscription plan. The billable event is the successful generation of a VOA report.  Before calling this API, a consumer must be created for the given customer ID (see Consumers APIs).  If no account of type checking, savings, money market, or investment is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VerifyAssetsApi;
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
    String callbackUrl = "https://finicity-test/webhook"; // A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      VOAReportAck result = client
              .verifyAssets
              .customerVOAReport(customerId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .showNsf(showNsf)
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
      System.out.println(result.getPortfolioId());
      System.out.println(result.getConstraints());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyAssetsApi#customerVOAReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VOAReportAck> response = client
              .verifyAssets
              .customerVOAReport(customerId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .showNsf(showNsf)
              .fromDate(fromDate)
              .callbackUrl(callbackUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyAssetsApi#customerVOAReport");
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
| **voAReportConstraints** | [**VOAReportConstraints**](VOAReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**VOAReportAck**](VOAReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |

<a name="generateVOAWithIncomeReport"></a>
# **generateVOAWithIncomeReport**
> VOAWithIncomeReportAck generateVOAWithIncomeReport(customerId, voAWithIncomeReportConstraints).callbackUrl(callbackUrl).execute();

Generate VOA With Income Report

Generate a Verification of Assets with Income (VOAI) report for all checking, savings, money market, and investment accounts for the given customer. This service retrieves up to 24 months of transaction history for each account and uses this information to generate the VOAI report. The report includes 1 - 6 months of all debit and credit transactions for asset verification. By default, the history is set to 61 days, however, you can change the transaction history in this section by setting the &#x60;fromDate&#x60; parameter. The report also includes up to 24 months of income credit transactions (ordered by account and confidence level) regardless of &#x60;fromDate&#x60; for income verification.  This is a premium service. The billable event is the successful generation of a VOAI report.  Before calling this API, a consumer must be created for the given customer ID (see Consumers APIs).  If no account of type checking, savings, money market, or investment is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VerifyAssetsApi;
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
      VOAWithIncomeReportAck result = client
              .verifyAssets
              .generateVOAWithIncomeReport(customerId)
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
      System.out.println(result.getPortfolioId());
      System.out.println(result.getConstraints());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyAssetsApi#generateVOAWithIncomeReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VOAWithIncomeReportAck> response = client
              .verifyAssets
              .generateVOAWithIncomeReport(customerId)
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
      System.err.println("Exception when calling VerifyAssetsApi#generateVOAWithIncomeReport");
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
| **voAWithIncomeReportConstraints** | [**VOAWithIncomeReportConstraints**](VOAWithIncomeReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**VOAWithIncomeReportAck**](VOAWithIncomeReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |

<a name="getAssetSummary"></a>
# **getAssetSummary**
> PrequalificationReportAck getAssetSummary(customerId, prequalificationReportConstraints).callbackUrl(callbackUrl).execute();

Generate Prequalification (Non-CRA) Report

Retrieve all checking, savings, money market, and investment accounts for a customer. The account, owner information, and the number of insufficient funds (NSFs) for checking accounts are also provided.  If no account type of checking, savings, money market, or investment is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VerifyAssetsApi;
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
    String callbackUrl = "https://finicity-test/webhook"; // A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      PrequalificationReportAck result = client
              .verifyAssets
              .getAssetSummary(customerId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .showNsf(showNsf)
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
      System.out.println(result.getPortfolioId());
      System.out.println(result.getConstraints());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyAssetsApi#getAssetSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PrequalificationReportAck> response = client
              .verifyAssets
              .getAssetSummary(customerId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .showNsf(showNsf)
              .fromDate(fromDate)
              .callbackUrl(callbackUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyAssetsApi#getAssetSummary");
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
| **prequalificationReportConstraints** | [**PrequalificationReportConstraints**](PrequalificationReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**PrequalificationReportAck**](PrequalificationReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |

<a name="getCheckingSavingsInvestmentAccounts"></a>
# **getCheckingSavingsInvestmentAccounts**
> PrequalificationReportAck getCheckingSavingsInvestmentAccounts(customerId, prequalificationReportConstraints).callbackUrl(callbackUrl).execute();

Generate Prequalification (CRA) Report

Retrieve all checking, savings, money market, and investment accounts for a consumer. The account, owner information, and the number of insufficient funds (NSFs) for checking accounts are also provided.  If no account of type checking, savings, money market, or investment is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VerifyAssetsApi;
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
    String callbackUrl = "https://finicity-test/webhook"; // A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      PrequalificationReportAck result = client
              .verifyAssets
              .getCheckingSavingsInvestmentAccounts(customerId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .showNsf(showNsf)
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
      System.out.println(result.getPortfolioId());
      System.out.println(result.getConstraints());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyAssetsApi#getCheckingSavingsInvestmentAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PrequalificationReportAck> response = client
              .verifyAssets
              .getCheckingSavingsInvestmentAccounts(customerId)
              .accountIds(accountIds)
              .reportCustomFields(reportCustomFields)
              .showNsf(showNsf)
              .fromDate(fromDate)
              .callbackUrl(callbackUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyAssetsApi#getCheckingSavingsInvestmentAccounts");
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
| **prequalificationReportConstraints** | [**PrequalificationReportConstraints**](PrequalificationReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**PrequalificationReportAck**](PrequalificationReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |

