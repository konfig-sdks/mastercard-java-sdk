# PaymentsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccountOwnerDetails**](PaymentsApi.md#getAccountOwnerDetails) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/owner | Get Account Owner |
| [**getAccountOwnerDetails_0**](PaymentsApi.md#getAccountOwnerDetails_0) | **GET** /aggregation/v3/customers/{customerId}/accounts/{accountId}/owner | Get Account Owner Details |
| [**getAchDetails**](PaymentsApi.md#getAchDetails) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/details | Get Account ACH Details |
| [**getAvailableBalanceLive**](PaymentsApi.md#getAvailableBalanceLive) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/availableBalance/live | Get Available Balance - Live |
| [**getLatestCachedBalance**](PaymentsApi.md#getLatestCachedBalance) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/availableBalance | Get Available Balance |
| [**getLoanPaymentDetails**](PaymentsApi.md#getLoanPaymentDetails) | **GET** /aggregation/v2/customers/{customerId}/accounts/{accountId}/loanDetails | Get Loan Payment Details |


<a name="getAccountOwnerDetails"></a>
# **getAccountOwnerDetails**
> AccountOwner getAccountOwnerDetails(customerId, accountId).execute();

Get Account Owner

Retrieve the names and addresses of the account owner from a financial institution.  Note: this is a premium service, billable per every successful API call.  This service retrieves account data from the institution. This usually returns quickly, but in some scenarios may take a few minutes to complete. In the event of a timeout condition, retry the call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentsApi;
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
      AccountOwner result = client
              .payments
              .getAccountOwnerDetails(customerId, accountId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOwnerName());
      System.out.println(result.getOwnerAddress());
      System.out.println(result.getAsOfDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getAccountOwnerDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccountOwner> response = client
              .payments
              .getAccountOwnerDetails(customerId, accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getAccountOwnerDetails");
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

[**AccountOwner**](AccountOwner.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The account owner was successfully retrieved |  -  |
| **203** | The response contains an MFA challenge in XML or JSON format. Contact your Account Manager or Systems Engineers to determine the best route to handle this error. |  -  |

<a name="getAccountOwnerDetails_0"></a>
# **getAccountOwnerDetails_0**
> AccountOwnerHolders getAccountOwnerDetails_0(customerId, accountId).withInsights(withInsights).execute();

Get Account Owner Details

This service retrieves the account details for an account holder from an institution. The following data objects are available.  * Account holders  * Addresses  * Emails  * Phones  * Documentations  * Identity Insights   Note: The data returned varies from institution to institution as not all of them make the same data available. This is a premium service, billable per each successful API call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentsApi;
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
    Boolean withInsights = false; // If this parameter is true, Identity Insights data will be returned along with the account owner information
    try {
      AccountOwnerHolders result = client
              .payments
              .getAccountOwnerDetails_0(customerId, accountId)
              .withInsights(withInsights)
              .execute();
      System.out.println(result);
      System.out.println(result.getHolders());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getAccountOwnerDetails_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccountOwnerHolders> response = client
              .payments
              .getAccountOwnerDetails_0(customerId, accountId)
              .withInsights(withInsights)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getAccountOwnerDetails_0");
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
| **withInsights** | **Boolean**| If this parameter is true, Identity Insights data will be returned along with the account owner information | [optional] |

### Return type

[**AccountOwnerHolders**](AccountOwnerHolders.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The account owner was successfully retrieved |  -  |

<a name="getAchDetails"></a>
# **getAchDetails**
> ACHDetails getAchDetails(customerId, accountId).execute();

Get Account ACH Details

Return the real account number and routing number details for an ACH payment.  Note: this is a premium service, billable per every successful API call.  _Supported account types_: \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;moneyMarket\&quot;, \&quot;cd\&quot;  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentsApi;
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
      ACHDetails result = client
              .payments
              .getAchDetails(customerId, accountId)
              .execute();
      System.out.println(result);
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getRealAccountNumber());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getAchDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ACHDetails> response = client
              .payments
              .getAchDetails(customerId, accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getAchDetails");
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

[**ACHDetails**](ACHDetails.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account ACH details were successfully retrieved |  -  |

<a name="getAvailableBalanceLive"></a>
# **getAvailableBalanceLive**
> AvailableBalance getAvailableBalanceLive(customerId, accountId).execute();

Get Available Balance - Live

Retrieve the available and cleared account balances for a single account in real-time directly from a financial institution.  Note: this is a premium service, billable per every successful API call.  _Supported account types_: \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;moneyMarket\&quot;, \&quot;cd\&quot;  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentsApi;
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
      AvailableBalance result = client
              .payments
              .getAvailableBalanceLive(customerId, accountId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getRealAccountNumberLast4());
      System.out.println(result.getAvailableBalance());
      System.out.println(result.getAvailableBalanceDate());
      System.out.println(result.getClearedBalance());
      System.out.println(result.getClearedBalanceDate());
      System.out.println(result.getAggregationStatusCode());
      System.out.println(result.getCurrency());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getAvailableBalanceLive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AvailableBalance> response = client
              .payments
              .getAvailableBalanceLive(customerId, accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getAvailableBalanceLive");
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

[**AvailableBalance**](AvailableBalance.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The live balance was successfully retrieved |  -  |

<a name="getLatestCachedBalance"></a>
# **getLatestCachedBalance**
> AvailableBalance getLatestCachedBalance(customerId, accountId).execute();

Get Available Balance

Retrieve the latest cached available and cleared account balances for a customer. Since we update and store balances throughout the day, this is the most accurate balance information available when a connection to a financial institution is unavailable or when a faster response is needed. Only deposit account types are supported: Checking, Savings, Money Market, and CD.  Note: this is a premium service, billable per every successful API call. Enrollment is required.  _Supported account types_: \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;moneyMarket\&quot;, \&quot;cd\&quot;  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentsApi;
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
      AvailableBalance result = client
              .payments
              .getLatestCachedBalance(customerId, accountId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getRealAccountNumberLast4());
      System.out.println(result.getAvailableBalance());
      System.out.println(result.getAvailableBalanceDate());
      System.out.println(result.getClearedBalance());
      System.out.println(result.getClearedBalanceDate());
      System.out.println(result.getAggregationStatusCode());
      System.out.println(result.getCurrency());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getLatestCachedBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AvailableBalance> response = client
              .payments
              .getLatestCachedBalance(customerId, accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getLatestCachedBalance");
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

[**AvailableBalance**](AvailableBalance.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The balance was successfully retrieved |  -  |

<a name="getLoanPaymentDetails"></a>
# **getLoanPaymentDetails**
> LoanPaymentDetails getLoanPaymentDetails(customerId, accountId).execute();

Get Loan Payment Details

Return the loan payment details of the customer for a loan-type account.  Note: this is a premium service, billable per every successful API call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentsApi;
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
      LoanPaymentDetails result = client
              .payments
              .getLoanPaymentDetails(customerId, accountId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLoanNumber());
      System.out.println(result.getLoanPaymentNumber());
      System.out.println(result.getLoanPaymentAddress());
      System.out.println(result.getAccountDetail());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getLoanPaymentDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LoanPaymentDetails> response = client
              .payments
              .getLoanPaymentDetails(customerId, accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getLoanPaymentDetails");
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

[**LoanPaymentDetails**](LoanPaymentDetails.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The loan payment details were successfully retrieved |  -  |

