# BankStatementsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateReport**](BankStatementsApi.md#generateReport) | **POST** /decisioning/v2/customers/{customerId}/statement | Generate Statement Report |
| [**getCustomerStatementInPdf**](BankStatementsApi.md#getCustomerStatementInPdf) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/statement | Get Customer Account Statement |
| [**getMultipleStatements**](BankStatementsApi.md#getMultipleStatements) | **GET** /aggregation/v3/customers/{customerId}/accounts/{accountId}/statement | Get Customer Account Multiple Statements |


<a name="generateReport"></a>
# **generateReport**
> StatementReportAck generateReport(customerId, statementReportConstraints).callbackUrl(callbackUrl).execute();

Generate Statement Report

Generate a Statement Report for the given accounts under the given customer.  This is a premium service. A billable event will be created upon the successful generation of the Statement Report.  Before calling this API, a consumer must be created for the given customer ID (see Consumers APIs).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankStatementsApi;
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
    StatementData statementReportData = new StatementData();
    String customerId = "1005061234"; // A customer ID
    List<ReportCustomField> reportCustomFields = Arrays.asList(); // The `reportCustomFields` parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you'd like associated with the report when it's generated. Every custom field consists of three variables: `label`, `value`, and `shown`. The `shown` variable is \\\"true\\\" or \\\"false\\\". * \\\"true\\\": (default) display the custom field in the PDF report * \\\"false\\\": don't display the custom field in the PDF report  For an experience that generates multiple reports, the `reportCustomFields` parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.
    String callbackUrl = "https://finicity-test/webhook"; // A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    try {
      StatementReportAck result = client
              .bankStatements
              .generateReport(statementReportData, customerId)
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
      System.err.println("Exception when calling BankStatementsApi#generateReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StatementReportAck> response = client
              .bankStatements
              .generateReport(statementReportData, customerId)
              .reportCustomFields(reportCustomFields)
              .callbackUrl(callbackUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankStatementsApi#generateReport");
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
| **statementReportConstraints** | [**StatementReportConstraints**](StatementReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**StatementReportAck**](StatementReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |

<a name="getCustomerStatementInPdf"></a>
# **getCustomerStatementInPdf**
> File getCustomerStatementInPdf(customerId, accountId).index(index).type(type).execute();

Get Customer Account Statement

Retrieve the customer&#39;s bank statements in PDF format. Up to 24 months of history is available depending on the financial institution. Since this is a premium service, charges incur per each successful statement retrieved.  For certified financial institutions, statements are available for the following account types: * Checking * Savings * Money market * CDs * Investments * Mortgage * Credit cards * Loans * Line of credit * Student Loans  Note: setting the timeout to 180 seconds is recommended to allow enough time for a response.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankStatementsApi;
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
    String accountId = "5011648377"; // The account ID
    Integer index = 1; // Request statements from 1-24. By default, 1 is the most recent statement. Increase the index value to count back (by month) and retrieve its most recent statement.
    String type = "taxStatement"; // The type of statement to retrieve
    try {
      File result = client
              .bankStatements
              .getCustomerStatementInPdf(customerId, accountId)
              .index(index)
              .type(type)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BankStatementsApi#getCustomerStatementInPdf");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .bankStatements
              .getCustomerStatementInPdf(customerId, accountId)
              .index(index)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankStatementsApi#getCustomerStatementInPdf");
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
| **accountId** | **String**| The account ID | |
| **index** | **Integer**| Request statements from 1-24. By default, 1 is the most recent statement. Increase the index value to count back (by month) and retrieve its most recent statement. | [optional] [default to 1] |
| **type** | **String**| The type of statement to retrieve | [optional] |

### Return type

[**File**](File.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The statement was successfully downloaded as a PDF file |  -  |
| **203** | The response contains an MFA challenge in XML or JSON format. Contact your Account Manager or Systems Engineers to determine the best route to handle this error. |  -  |

<a name="getMultipleStatements"></a>
# **getMultipleStatements**
> CustomerAccountMultipleStatements getMultipleStatements(customerId, accountId).index(index).execute();

Get Customer Account Multiple Statements

This endpoint is retrieving the account statement for a given customer. The maximum number of indexes it will fetch for a single login is 24.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankStatementsApi;
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
    String accountId = "5011648377"; // The account ID
    String index = "1"; // Request statements with comma-separated indexes ranged between 1-24. The default value is 1 and it will return the most recent statement. Increasing the index will return older statements, for example, setting the index value to 6 will return a statement from six months ago.
    try {
      CustomerAccountMultipleStatements result = client
              .bankStatements
              .getMultipleStatements(customerId, accountId)
              .index(index)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatements());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankStatementsApi#getMultipleStatements");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerAccountMultipleStatements> response = client
              .bankStatements
              .getMultipleStatements(customerId, accountId)
              .index(index)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankStatementsApi#getMultipleStatements");
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
| **accountId** | **String**| The account ID | |
| **index** | **String**| Request statements with comma-separated indexes ranged between 1-24. The default value is 1 and it will return the most recent statement. Increasing the index will return older statements, for example, setting the index value to 6 will return a statement from six months ago. | [optional] [default to 1] |

### Return type

[**CustomerAccountMultipleStatements**](CustomerAccountMultipleStatements.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The account statements were successfully retrieved. |  -  |
| **203** | The response contains an MFA challenge in XML or JSON format. Contact your Account Manager or Systems Engineers to determine the best route to handle this error. |  -  |

