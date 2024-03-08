# TransactionsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get24MonthsHistoryAndGenerateReport**](TransactionsApi.md#get24MonthsHistoryAndGenerateReport) | **POST** /decisioning/v2/customers/{customerId}/transactions | Generate Transactions Report |
| [**getAllCustomerTransactions**](TransactionsApi.md#getAllCustomerTransactions) | **GET** /aggregation/v3/customers/{customerId}/transactions | Get All Customer Transactions |
| [**getById**](TransactionsApi.md#getById) | **GET** /aggregation/v2/customers/{customerId}/transactions/{transactionId} | Get Customer Transaction by ID |
| [**getCustomerAccountTransactions**](TransactionsApi.md#getCustomerAccountTransactions) | **GET** /aggregation/v4/customers/{customerId}/accounts/{accountId}/transactions | Get Customer Account Transactions |
| [**loadHistoricTransactionsForCustomerAccount**](TransactionsApi.md#loadHistoricTransactionsForCustomerAccount) | **POST** /aggregation/v1/customers/{customerId}/accounts/{accountId}/transactions/historic | Load Historic Transactions for Customer Account |


<a name="get24MonthsHistoryAndGenerateReport"></a>
# **get24MonthsHistoryAndGenerateReport**
> TransactionsReportAck get24MonthsHistoryAndGenerateReport(customerId, toDate, transactionsReportConstraints).callbackUrl(callbackUrl).includePending(includePending).execute();

Generate Transactions Report

Generate a Transaction Report for the given accounts under the given customer. This service retrieves up to 24 months of transaction history for the given customer. It then uses this information to generate the Transaction Report.  This is a premium service. A billable event will be created upon the successful generation of the Transactions Report.  Before calling this API, a consumer must be created for the given customer ID (see Consumers APIs).  There cannot be more than 24 months between &#x60;fromDate&#x60; and &#x60;toDate&#x60;.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionsApi;
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
    Long toDate = 1607450357L; // A end date
    String accountIds = "accountIds_example"; // A whitespace-separated list of account IDs to be included in the report (all accounts will be included if not set)
    Long fromDate = 56L; // A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
    List<ReportCustomField> reportCustomFields = Arrays.asList(); // The `reportCustomFields` parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you'd like associated with the report when it's generated. Every custom field consists of three variables: `label`, `value`, and `shown`. The `shown` variable is \\\"true\\\" or \\\"false\\\". * \\\"true\\\": (default) display the custom field in the PDF report * \\\"false\\\": don't display the custom field in the PDF report  For an experience that generates multiple reports, the `reportCustomFields` parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.
    String callbackUrl = "https://finicity-test/webhook"; // A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
    Boolean includePending = false; // If pending transactions must be included
    try {
      TransactionsReportAck result = client
              .transactions
              .get24MonthsHistoryAndGenerateReport(customerId, toDate)
              .accountIds(accountIds)
              .fromDate(fromDate)
              .reportCustomFields(reportCustomFields)
              .callbackUrl(callbackUrl)
              .includePending(includePending)
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
      System.err.println("Exception when calling TransactionsApi#get24MonthsHistoryAndGenerateReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TransactionsReportAck> response = client
              .transactions
              .get24MonthsHistoryAndGenerateReport(customerId, toDate)
              .accountIds(accountIds)
              .fromDate(fromDate)
              .reportCustomFields(reportCustomFields)
              .callbackUrl(callbackUrl)
              .includePending(includePending)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#get24MonthsHistoryAndGenerateReport");
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
| **toDate** | **Long**| A end date | |
| **transactionsReportConstraints** | [**TransactionsReportConstraints**](TransactionsReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |
| **includePending** | **Boolean**| If pending transactions must be included | [optional] [default to false] |

### Return type

[**TransactionsReportAck**](TransactionsReportAck.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  -  |

<a name="getAllCustomerTransactions"></a>
# **getAllCustomerTransactions**
> Transactions getAllCustomerTransactions(customerId, fromDate, toDate).start(start).limit(limit).sort(sort).includePending(includePending).execute();

Get All Customer Transactions

Get all transactions available for this customer within the given date range, across all accounts. This service supports paging and sorting by &#x60;transactionDate&#x60; (or &#x60;postedDate&#x60; if no transaction date is provided), with a maximum of 1000 transactions per request.  Standard consumer aggregation provides up to 180 days of transactions prior to the date each account was added to the Finicity system. To access older transactions, you must first call the service Load Historic Transactions for Account.  There is no limit for the size of the window between &#x60;fromDate&#x60; and &#x60;toDate&#x60;, however, the maximum number of transactions returned on one page is 1000.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionsApi;
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
    Long fromDate = 1607450357L; // A start date
    Long toDate = 1607450357L; // A end date
    Integer start = 1; // Index of the page of results to return
    Integer limit = 25; // Maximum number of results per page
    String sort = "desc"; // Date sort order: \"asc\" for ascending, \"desc\" for descending
    Boolean includePending = false; // If pending transactions must be included
    try {
      Transactions result = client
              .transactions
              .getAllCustomerTransactions(customerId, fromDate, toDate)
              .start(start)
              .limit(limit)
              .sort(sort)
              .includePending(includePending)
              .execute();
      System.out.println(result);
      System.out.println(result.getFound());
      System.out.println(result.getDisplaying());
      System.out.println(result.getMoreAvailable());
      System.out.println(result.getFromDate());
      System.out.println(result.getToDate());
      System.out.println(result.getSort());
      System.out.println(result.getTransactions());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getAllCustomerTransactions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Transactions> response = client
              .transactions
              .getAllCustomerTransactions(customerId, fromDate, toDate)
              .start(start)
              .limit(limit)
              .sort(sort)
              .includePending(includePending)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getAllCustomerTransactions");
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
| **fromDate** | **Long**| A start date | |
| **toDate** | **Long**| A end date | |
| **start** | **Integer**| Index of the page of results to return | [optional] [default to 1] |
| **limit** | **Integer**| Maximum number of results per page | [optional] [default to 25] |
| **sort** | **String**| Date sort order: \&quot;asc\&quot; for ascending, \&quot;desc\&quot; for descending | [optional] [default to desc] |
| **includePending** | **Boolean**| If pending transactions must be included | [optional] [default to false] |

### Return type

[**Transactions**](Transactions.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The transactions were successfully retrieved |  -  |

<a name="getById"></a>
# **getById**
> Transaction getById(customerId, transactionId).execute();

Get Customer Transaction by ID

Get details for the given transaction.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionsApi;
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
    Long transactionId = 21284820852L; // A transaction ID
    try {
      Transaction result = client
              .transactions
              .getById(customerId, transactionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getAmount());
      System.out.println(result.getAccountId());
      System.out.println(result.getCustomerId());
      System.out.println(result.getStatus());
      System.out.println(result.getMemo());
      System.out.println(result.getType());
      System.out.println(result.getTransactionDate());
      System.out.println(result.getPostedDate());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getFirstEffectiveDate());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getOptionExpireDate());
      System.out.println(result.getCheckNum());
      System.out.println(result.getEscrowAmount());
      System.out.println(result.getFeeAmount());
      System.out.println(result.getSuspenseAmount());
      System.out.println(result.getInterestAmount());
      System.out.println(result.getPrincipalAmount());
      System.out.println(result.getOptionStrikePrice());
      System.out.println(result.getUnitQuantity());
      System.out.println(result.getUnitPrice());
      System.out.println(result.getCategorization());
      System.out.println(result.getRunningBalanceAmount());
      System.out.println(result.getSubaccountSecurityType());
      System.out.println(result.getCommissionAmount());
      System.out.println(result.getTicker());
      System.out.println(result.getInvestmentTransactionType());
      System.out.println(result.getTaxesAmount());
      System.out.println(result.getCurrencySymbol());
      System.out.println(result.getIncomeType());
      System.out.println(result.getSplitDenominator());
      System.out.println(result.getSplitNumerator());
      System.out.println(result.getSharesPerContract());
      System.out.println(result.getSubAccountFund());
      System.out.println(result.getSecurityId());
      System.out.println(result.getSecurityIdType());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Transaction> response = client
              .transactions
              .getById(customerId, transactionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getById");
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
| **transactionId** | **Long**| A transaction ID | |

### Return type

[**Transaction**](Transaction.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The transaction was successfully retrieved |  -  |

<a name="getCustomerAccountTransactions"></a>
# **getCustomerAccountTransactions**
> Transactions getCustomerAccountTransactions(customerId, accountId, fromDate, toDate).start(start).limit(limit).sort(sort).includePending(includePending).execute();

Get Customer Account Transactions

Get all transactions available for this customer account within the given date range. This service supports paging and sorting by &#x60;transactionDate&#x60; (or &#x60;postedDate&#x60; if no transaction date is provided), with a maximum of 1000 transactions per request.  Standard consumer aggregation provides up to 180 days of transactions prior to the date each account was added to the Finicity system. To access older transactions, you must first call the Cash Flow Verification service Load Historic Transactions for Account.  There is no limit for the size of the window between &#x60;fromDate&#x60; and &#x60;toDate&#x60;, however, the maximum number of transactions returned on one page is 1000.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionsApi;
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
    Long fromDate = 1607450357L; // A start date
    Long toDate = 1607450357L; // A end date
    Integer start = 1; // Index of the page of results to return
    Integer limit = 25; // Maximum number of results per page
    String sort = "desc"; // Date sort order: \"asc\" for ascending, \"desc\" for descending
    Boolean includePending = false; // If pending transactions must be included
    try {
      Transactions result = client
              .transactions
              .getCustomerAccountTransactions(customerId, accountId, fromDate, toDate)
              .start(start)
              .limit(limit)
              .sort(sort)
              .includePending(includePending)
              .execute();
      System.out.println(result);
      System.out.println(result.getFound());
      System.out.println(result.getDisplaying());
      System.out.println(result.getMoreAvailable());
      System.out.println(result.getFromDate());
      System.out.println(result.getToDate());
      System.out.println(result.getSort());
      System.out.println(result.getTransactions());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getCustomerAccountTransactions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Transactions> response = client
              .transactions
              .getCustomerAccountTransactions(customerId, accountId, fromDate, toDate)
              .start(start)
              .limit(limit)
              .sort(sort)
              .includePending(includePending)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getCustomerAccountTransactions");
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
| **fromDate** | **Long**| A start date | |
| **toDate** | **Long**| A end date | |
| **start** | **Integer**| Index of the page of results to return | [optional] [default to 1] |
| **limit** | **Integer**| Maximum number of results per page | [optional] [default to 25] |
| **sort** | **String**| Date sort order: \&quot;asc\&quot; for ascending, \&quot;desc\&quot; for descending | [optional] [default to desc] |
| **includePending** | **Boolean**| If pending transactions must be included | [optional] [default to false] |

### Return type

[**Transactions**](Transactions.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The transactions were successfully retrieved |  -  |

<a name="loadHistoricTransactionsForCustomerAccount"></a>
# **loadHistoricTransactionsForCustomerAccount**
> loadHistoricTransactionsForCustomerAccount(customerId, accountId).execute();

Load Historic Transactions for Customer Account

Connect to the account&#39;s financial institution and load up to 24 months of historic transactions for the account. Length of history varies by institution.  This is a premium service. The billable event is a call to this service specifying a customer ID that has not been seen before by this service. (If this service is called multiple times with the same customer ID, to load transactions from multiple accounts, only one billable event has occurred.)  The recommended timeout setting for this request is 180 seconds in order to receive a response. However, you can terminate the connection after making the call the operation will still complete. You will have to pull the account records to check for an updated aggregation attempt date to know when the refresh is complete.  The date range sent to the institution is calculated from the account&#39;s &#x60;createdDate&#x60;. This means that calling this service a second time for the same account normally will not add any new transactions for the account. For this reason, a second call to this service for a known account ID will usually return immediately.  In a few specific scenarios, it may be desirable to force a second connection to the institution for a known account ID. Some examples are:  * The institution&#39;s policy has changed, making more transactions available * Finicity has now added a longer transaction history support for the institution * The first call encountered an error, and the resulting Aggregation Ticket has now been fixed by the Finicity Support Team  In these cases, the POST request can contain the parameter &#x60;force&#x3D;true&#x60; in the request body to force the second connection.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionsApi;
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
    try {
      client
              .transactions
              .loadHistoricTransactionsForCustomerAccount(customerId, accountId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#loadHistoricTransactionsForCustomerAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .transactions
              .loadHistoricTransactionsForCustomerAccount(customerId, accountId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#loadHistoricTransactionsForCustomerAccount");
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

### Return type

null (empty response body)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **203** | The response contains an MFA challenge in XML or JSON format. Contact your Account Manager or Systems Engineers to determine the best route to handle this error. |  -  |
| **204** | Historic transactions have been loaded successfully. The transactions are now available by calling the Get Customer Account Transactions API. |  -  |

