# AccountsSimpleApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBasicInfo**](AccountsSimpleApi.md#getBasicInfo) | **GET** /aggregation/v1/customers/{customerId}/institutions/{institutionId}/accounts/simple | Get Customer Accounts by Institution ID (Simple) |
| [**getBasicInfo_0**](AccountsSimpleApi.md#getBasicInfo_0) | **GET** /aggregation/v1/customers/{customerId}/institutionLogins/{institutionLoginId}/accounts/simple | Get Customer Accounts by Institution Login ID (Simple) |
| [**getBasicInfo_1**](AccountsSimpleApi.md#getBasicInfo_1) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/simple | Get Customer Account by ID (Simple) |
| [**getBasicInfo_2**](AccountsSimpleApi.md#getBasicInfo_2) | **GET** /aggregation/v1/customers/{customerId}/accounts/simple | Get Customer Accounts (Simple) |


<a name="getBasicInfo"></a>
# **getBasicInfo**
> CustomerAccountsSimple getBasicInfo(customerId, institutionId).execute();

Get Customer Accounts by Institution ID (Simple)

This API is a lighter version of Get Customer Accounts by Institution ID, returning only basic information of active accounts owned by the given customer at the given institution.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsSimpleApi;
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
    Long institutionId = 4222L; // The institution ID
    try {
      CustomerAccountsSimple result = client
              .accountsSimple
              .getBasicInfo(customerId, institutionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsSimpleApi#getBasicInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerAccountsSimple> response = client
              .accountsSimple
              .getBasicInfo(customerId, institutionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsSimpleApi#getBasicInfo");
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
| **institutionId** | **Long**| The institution ID | |

### Return type

[**CustomerAccountsSimple**](CustomerAccountsSimple.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The account list was successfully retrieved |  -  |

<a name="getBasicInfo_0"></a>
# **getBasicInfo_0**
> CustomerAccountsSimple getBasicInfo_0(customerId, institutionLoginId).execute();

Get Customer Accounts by Institution Login ID (Simple)

This API is a lighter version of Get Customer Accounts by Institution Login ID, returning only basic information of all active accounts owned by the given customer at the given institution login ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsSimpleApi;
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
    String institutionLoginId = "1007302745"; // The institution login ID
    try {
      CustomerAccountsSimple result = client
              .accountsSimple
              .getBasicInfo_0(customerId, institutionLoginId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsSimpleApi#getBasicInfo_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerAccountsSimple> response = client
              .accountsSimple
              .getBasicInfo_0(customerId, institutionLoginId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsSimpleApi#getBasicInfo_0");
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
| **institutionLoginId** | **String**| The institution login ID | |

### Return type

[**CustomerAccountsSimple**](CustomerAccountsSimple.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The account list was successfully retrieved |  -  |

<a name="getBasicInfo_1"></a>
# **getBasicInfo_1**
> CustomerAccountSimple getBasicInfo_1(customerId, accountId).execute();

Get Customer Account by ID (Simple)

This API is a lighter version of Get Customer Accounts by ID, returning only basic information of a customer account.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsSimpleApi;
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
      CustomerAccountSimple result = client
              .accountsSimple
              .getBasicInfo_1(customerId, accountId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAccountNumberDisplay());
      System.out.println(result.getName());
      System.out.println(result.getType());
      System.out.println(result.getAggregationStatusCode());
      System.out.println(result.getStatus());
      System.out.println(result.getCustomerId());
      System.out.println(result.getInstitutionId());
      System.out.println(result.getAggregationSuccessDate());
      System.out.println(result.getAggregationAttemptDate());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getCurrency());
      System.out.println(result.getInstitutionLoginId());
      System.out.println(result.getDisplayPosition());
      System.out.println(result.getParentAccount());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsSimpleApi#getBasicInfo_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerAccountSimple> response = client
              .accountsSimple
              .getBasicInfo_1(customerId, accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsSimpleApi#getBasicInfo_1");
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

[**CustomerAccountSimple**](CustomerAccountSimple.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The account was successfully retrieved |  -  |

<a name="getBasicInfo_2"></a>
# **getBasicInfo_2**
> CustomerAccountsSimple getBasicInfo_2(customerId).execute();

Get Customer Accounts (Simple)

This API is a lighter version of Get Customer Accounts, returning only basic information of all active customer accounts.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsSimpleApi;
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
    try {
      CustomerAccountsSimple result = client
              .accountsSimple
              .getBasicInfo_2(customerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsSimpleApi#getBasicInfo_2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerAccountsSimple> response = client
              .accountsSimple
              .getBasicInfo_2(customerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsSimpleApi#getBasicInfo_2");
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

### Return type

[**CustomerAccountsSimple**](CustomerAccountsSimple.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The account list was successfully retrieved |  -  |

