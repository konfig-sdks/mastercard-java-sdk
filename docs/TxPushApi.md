# TxPushApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSubscription**](TxPushApi.md#deleteSubscription) | **DELETE** /aggregation/v1/customers/{customerId}/subscriptions/{subscriptionId} | Delete TxPush Subscription |
| [**disableNotifications**](TxPushApi.md#disableNotifications) | **DELETE** /aggregation/v1/customers/{customerId}/accounts/{accountId}/txpush | Disable TxPush Notifications |
| [**injectTestTransaction**](TxPushApi.md#injectTestTransaction) | **POST** /aggregation/v1/customers/{customerId}/accounts/{accountId}/transactions | Create TxPush Test Transaction |
| [**subscribeNotifications**](TxPushApi.md#subscribeNotifications) | **POST** /aggregation/v1/customers/{customerId}/accounts/{accountId}/txpush | Subscribe to TxPush Notifications |


<a name="deleteSubscription"></a>
# **deleteSubscription**
> deleteSubscription(customerId, subscriptionId).execute();

Delete TxPush Subscription

Delete a specific subscription to TxPush notifications for the given account. This could be individual deleting the account or transactions events. No more events will be sent for that specific subscription.  For additional details on this process, see [TxPush Listener Service](https://developer.mastercard.com/open-banking-us/documentation/products/manage/tx-push/#setting-up-the-txpush-listener-service).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TxPushApi;
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
    Long subscriptionId = 17554874L; // The subscription ID
    try {
      client
              .txPush
              .deleteSubscription(customerId, subscriptionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TxPushApi#deleteSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .txPush
              .deleteSubscription(customerId, subscriptionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TxPushApi#deleteSubscription");
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
| **subscriptionId** | **Long**| The subscription ID | |

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
| **204** | The subscription was successfully deleted |  -  |

<a name="disableNotifications"></a>
# **disableNotifications**
> disableNotifications(customerId, accountId).execute();

Disable TxPush Notifications

Delete all TxPush subscriptions with their notifications for the given account. No more notifications will be sent for account or transaction events.  For additional details on this process, see [TxPush Listener Service](https://developer.mastercard.com/open-banking-us/documentation/products/manage/tx-push/#setting-up-the-txpush-listener-service).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TxPushApi;
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
              .txPush
              .disableNotifications(customerId, accountId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TxPushApi#disableNotifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .txPush
              .disableNotifications(customerId, accountId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TxPushApi#disableNotifications");
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
| **204** | Subscriptions were successfully deleted for the given account |  -  |

<a name="injectTestTransaction"></a>
# **injectTestTransaction**
> CreatedTestTxPushTransaction injectTestTransaction(customerId, accountId, testTxPushTransaction).execute();

Create TxPush Test Transaction

Inject a transaction into the transaction list for a testing account. This allows an app to trigger TxPush notifications for the account in order to test the app&#39;s TxPush Listener service. This causes the platform to send one transaction event and one account event (showing that the account balance has changed). This service is only supported for testing accounts.  For additional details on this process, see [TxPush Listener Service](https://developer.mastercard.com/open-banking-us/documentation/products/manage/tx-push/#setting-up-the-txpush-listener-service).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TxPushApi;
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
    String description = "description_example"; // The description of the transaction
    Double amount = 3.4D; // The amount of the transaction
    Long transactionDate = 56L; // A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
    String customerId = "1005061234"; // A customer ID
    String accountId = "5011648377"; // The account ID
    String status = "active"; // \\\"active\\\" or \\\"pending\\\" (optional)
    Long postedDate = 56L; // A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
    try {
      CreatedTestTxPushTransaction result = client
              .txPush
              .injectTestTransaction(description, amount, transactionDate, customerId, accountId)
              .status(status)
              .postedDate(postedDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling TxPushApi#injectTestTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreatedTestTxPushTransaction> response = client
              .txPush
              .injectTestTransaction(description, amount, transactionDate, customerId, accountId)
              .status(status)
              .postedDate(postedDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TxPushApi#injectTestTransaction");
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
| **testTxPushTransaction** | [**TestTxPushTransaction**](TestTxPushTransaction.md)|  | |

### Return type

[**CreatedTestTxPushTransaction**](CreatedTestTxPushTransaction.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The test notification was successfully sent |  -  |

<a name="subscribeNotifications"></a>
# **subscribeNotifications**
> TxPushSubscriptions subscribeNotifications(customerId, accountId, txPushSubscriptionParameters).execute();

Subscribe to TxPush Notifications

Register a client app&#39;s TxPush Listener to receive TxPush notifications related to the given account.  Each call to this service will return two records, one with class account and one with class transaction. Account events are sent when values change in the account&#39;s fields (such as &#x60;balance&#x60; or &#x60;interestRate&#x60;). Transaction events are sent whenever a new transaction is posted for the account. For institutions that do not provide TxPush services, notifications are sent as soon as Finicity finds a new transaction or new account data through regular aggregation processes.  The listener&#39;s URL must be secure (HTTPS) for any real-world account. In addition, the client&#39;s TxPush Listener will need to be verified. HTTP and HTTPS connections are only allowed on the standard ports 80 (HTTP) and 443 (HTTPS). The use of other ports will result with the call failing.  For additional details on this process, see [TxPush Listener Service](https://developer.mastercard.com/open-banking-us/documentation/products/manage/tx-push/#setting-up-the-txpush-listener-service).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TxPushApi;
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
    String callbackUrl = "callbackUrl_example"; // A callback URL where to receive TxPush notifications
    String customerId = "1005061234"; // A customer ID
    String accountId = "5011648377"; // The account ID
    try {
      TxPushSubscriptions result = client
              .txPush
              .subscribeNotifications(callbackUrl, customerId, accountId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSubscriptions());
    } catch (ApiException e) {
      System.err.println("Exception when calling TxPushApi#subscribeNotifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TxPushSubscriptions> response = client
              .txPush
              .subscribeNotifications(callbackUrl, customerId, accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TxPushApi#subscribeNotifications");
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
| **txPushSubscriptionParameters** | [**TxPushSubscriptionParameters**](TxPushSubscriptionParameters.md)|  | |

### Return type

[**TxPushSubscriptions**](TxPushSubscriptions.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The subscription was successfully created |  -  |

