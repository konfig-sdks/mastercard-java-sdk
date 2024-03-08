# AccountsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](AccountsApi.md#getById) | **GET** /aggregation/v2/customers/{customerId}/accounts/{accountId} | Get Customer Account by ID |
| [**getByInstitutionLogin**](AccountsApi.md#getByInstitutionLogin) | **GET** /aggregation/v1/customers/{customerId}/institutionLogins/{institutionLoginId}/accounts | Get Customer Accounts by Institution Login ID |
| [**getCustomerAccounts**](AccountsApi.md#getCustomerAccounts) | **GET** /aggregation/v1/customers/{customerId}/accounts | Get Customer Accounts |
| [**getCustomerInstitutionAccounts**](AccountsApi.md#getCustomerInstitutionAccounts) | **GET** /aggregation/v1/customers/{customerId}/institutions/{institutionId}/accounts | Get Customer Accounts by Institution ID |
| [**refreshCustomerAccountByInstitutionLogin**](AccountsApi.md#refreshCustomerAccountByInstitutionLogin) | **POST** /aggregation/v2/customers/{customerId}/institutionLogins/{institutionLoginId}/accounts | Refresh Customer Account by Institution Login ID for Data Access Tiers |
| [**refreshCustomerAggregation**](AccountsApi.md#refreshCustomerAggregation) | **POST** /aggregation/v1/customers/{customerId}/accounts | Refresh Customer Accounts |
| [**refreshCustomerByInstitutionLogin**](AccountsApi.md#refreshCustomerByInstitutionLogin) | **POST** /aggregation/v1/customers/{customerId}/institutionLogins/{institutionLoginId}/accounts | Refresh Customer Accounts by Institution Login ID |
| [**refreshCustomerData**](AccountsApi.md#refreshCustomerData) | **POST** /aggregation/v2/customers/{customerId}/accounts | Refresh Customer Accounts for Data Access Tiers |
| [**removeByCustomerIdAndAccountId**](AccountsApi.md#removeByCustomerIdAndAccountId) | **DELETE** /aggregation/v1/customers/{customerId}/accounts/{accountId} | Delete Customer Account by ID |
| [**removeByInstitutionLogin**](AccountsApi.md#removeByInstitutionLogin) | **DELETE** /aggregation/v1/customers/{customerId}/institutionLogins/{institutionLoginId} | Delete Customer Accounts by Institution Login ID |


<a name="getById"></a>
# **getById**
> CustomerAccount getById(customerId, accountId).execute();

Get Customer Account by ID

Get a customer account by ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
      CustomerAccount result = client
              .accounts
              .getById(customerId, accountId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getNumber());
      System.out.println(result.getAccountNumberDisplay());
      System.out.println(result.getRealAccountNumberLast4());
      System.out.println(result.getName());
      System.out.println(result.getBalance());
      System.out.println(result.getType());
      System.out.println(result.getAggregationStatusCode());
      System.out.println(result.getStatus());
      System.out.println(result.getCustomerId());
      System.out.println(result.getInstitutionId());
      System.out.println(result.getBalanceDate());
      System.out.println(result.getAggregationSuccessDate());
      System.out.println(result.getAggregationAttemptDate());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getLastUpdatedDate());
      System.out.println(result.getMarketSegment());
      System.out.println(result.getCurrency());
      System.out.println(result.getLastTransactionDate());
      System.out.println(result.getOldestTransactionDate());
      System.out.println(result.getInstitutionLoginId());
      System.out.println(result.getDetail());
      System.out.println(result.getPosition());
      System.out.println(result.getDisplayPosition());
      System.out.println(result.getParentAccount());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerAccount> response = client
              .accounts
              .getById(customerId, accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getById");
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

[**CustomerAccount**](CustomerAccount.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The account was successfully retrieved |  -  |

<a name="getByInstitutionLogin"></a>
# **getByInstitutionLogin**
> CustomerAccounts getByInstitutionLogin(customerId, institutionLoginId).execute();

Get Customer Accounts by Institution Login ID

Get all accounts associated with the given institution login. All accounts returned are accessible by a single set of credentials on a single institution.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
      CustomerAccounts result = client
              .accounts
              .getByInstitutionLogin(customerId, institutionLoginId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getByInstitutionLogin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerAccounts> response = client
              .accounts
              .getByInstitutionLogin(customerId, institutionLoginId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getByInstitutionLogin");
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

[**CustomerAccounts**](CustomerAccounts.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The account list was successfully retrieved |  -  |

<a name="getCustomerAccounts"></a>
# **getCustomerAccounts**
> CustomerAccounts getCustomerAccounts(customerId).status(status).accountType(accountType).execute();

Get Customer Accounts

Get all accounts owned by the given customer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    String status = "pending"; // A filter to fetch account in the given status
    String accountType = "ava"; // A filter to fetch accounts for the given type. Currently supported types: \"ava\"
    try {
      CustomerAccounts result = client
              .accounts
              .getCustomerAccounts(customerId)
              .status(status)
              .accountType(accountType)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getCustomerAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerAccounts> response = client
              .accounts
              .getCustomerAccounts(customerId)
              .status(status)
              .accountType(accountType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getCustomerAccounts");
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
| **status** | **String**| A filter to fetch account in the given status | [optional] |
| **accountType** | **String**| A filter to fetch accounts for the given type. Currently supported types: \&quot;ava\&quot; | [optional] |

### Return type

[**CustomerAccounts**](CustomerAccounts.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The account list was successfully retrieved |  -  |

<a name="getCustomerInstitutionAccounts"></a>
# **getCustomerInstitutionAccounts**
> CustomerAccounts getCustomerInstitutionAccounts(customerId, institutionId).execute();

Get Customer Accounts by Institution ID

Get all active accounts owned by the given customer at the given institution.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
      CustomerAccounts result = client
              .accounts
              .getCustomerInstitutionAccounts(customerId, institutionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getCustomerInstitutionAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerAccounts> response = client
              .accounts
              .getCustomerInstitutionAccounts(customerId, institutionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getCustomerInstitutionAccounts");
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

[**CustomerAccounts**](CustomerAccounts.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The account list was successfully retrieved |  -  |

<a name="refreshCustomerAccountByInstitutionLogin"></a>
# **refreshCustomerAccountByInstitutionLogin**
> refreshCustomerAccountByInstitutionLogin(customerId, institutionLoginId).execute();

Refresh Customer Account by Institution Login ID for Data Access Tiers

Refresh account and transaction data for all accounts associated with a given &#39;institutionLoginId&#x60; with a connection to the institution. Client apps are not permitted to automate calls to the Refresh services. Active accounts are automatically refreshed by Finicity once per day.  Apps may call Refresh services for a specific customer when there is a specific business case for the need of data that is up to date as of the moment. Please discuss with your account manager and systems engineer for further clarification.  Note: This service will be used for dynamic billing tiers ASD, AFD and ATD.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
      client
              .accounts
              .refreshCustomerAccountByInstitutionLogin(customerId, institutionLoginId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#refreshCustomerAccountByInstitutionLogin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .accounts
              .refreshCustomerAccountByInstitutionLogin(customerId, institutionLoginId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#refreshCustomerAccountByInstitutionLogin");
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

null (empty response body)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The account list was successfully refreshed |  -  |

<a name="refreshCustomerAggregation"></a>
# **refreshCustomerAggregation**
> CustomerAccounts refreshCustomerAggregation(customerId).execute();

Refresh Customer Accounts

Refresh account and transaction data for all accounts associated with the  given &#x60;customerId&#x60; with a connection to the institution.  Client apps are not permitted to automate calls to the Refresh services. Active accounts are automatically refreshed by Finicity once per day. Because many financial institutions only post transactions once per day, calling Refresh services repeatedly is usually a waste of resources and is not recommended.  Apps may call Refresh services for a specific customer when there is a specific business case for the need of data that is up to date as of the moment. Please discuss with your account manager and systems engineer for further clarification.  The recommended timeout setting for this request is 120 seconds in order to receive a response. However, you can terminate the connection after making the call the operation will still complete. You will have to pull the account records to check for an updated aggregation attempt date to know when the refresh is complete.  Note: This service is not available for all tiers of dynamic billing.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
      CustomerAccounts result = client
              .accounts
              .refreshCustomerAggregation(customerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#refreshCustomerAggregation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerAccounts> response = client
              .accounts
              .refreshCustomerAggregation(customerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#refreshCustomerAggregation");
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

[**CustomerAccounts**](CustomerAccounts.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The account list was successfully refreshed |  -  |

<a name="refreshCustomerByInstitutionLogin"></a>
# **refreshCustomerByInstitutionLogin**
> CustomerAccounts refreshCustomerByInstitutionLogin(customerId, institutionLoginId).execute();

Refresh Customer Accounts by Institution Login ID

Refresh account and transaction data for all accounts associated with a given &#x60;institutionLoginId&#x60; with a connection to the institution.  Client apps are not permitted to automate calls to the Refresh services. Active accounts are automatically refreshed by Finicity once per day. Because many financial institutions only post transactions once per day, calling Refresh repeatedly is usually a waste of resources and is not recommended.  Apps may call Refresh services for a specific customer when there is a specific business case for the need of data that is up to date as of the moment. Please discuss with your account manager and systems engineer for further clarification.  The recommended timeout setting for this request is 120 seconds in order to receive a response. However, you can terminate the connection after making the call the operation will still complete. You will have to pull the account records to check for an updated aggregation attempt date to know when the refresh is complete.  Note: This service is not available for all tiers of dynamic billing.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
      CustomerAccounts result = client
              .accounts
              .refreshCustomerByInstitutionLogin(customerId, institutionLoginId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#refreshCustomerByInstitutionLogin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerAccounts> response = client
              .accounts
              .refreshCustomerByInstitutionLogin(customerId, institutionLoginId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#refreshCustomerByInstitutionLogin");
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

[**CustomerAccounts**](CustomerAccounts.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The account list was successfully refreshed |  -  |

<a name="refreshCustomerData"></a>
# **refreshCustomerData**
> refreshCustomerData(customerId).execute();

Refresh Customer Accounts for Data Access Tiers

Refresh account and transaction data for all accounts associated with the  given &#x60;customerId&#x60; with a connection to the institution.  Client apps are not permitted to automate calls to the Refresh services. Active accounts are automatically refreshed by Finicity once per day. Apps may call Refresh services for a specific customer when there is a specific business case for the need of data that is up to date as of the moment. Please discuss with your account manager and systems engineer for further clarification.  Note: This service will be used for dynamic billing tiers ASD, AFD and ATD.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
      client
              .accounts
              .refreshCustomerData(customerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#refreshCustomerData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .accounts
              .refreshCustomerData(customerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#refreshCustomerData");
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

null (empty response body)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The account list was successfully refreshed |  -  |

<a name="removeByCustomerIdAndAccountId"></a>
# **removeByCustomerIdAndAccountId**
> removeByCustomerIdAndAccountId(customerId, accountId).execute();

Delete Customer Account by ID

Remove the given account from Finicity aggregation.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
              .accounts
              .removeByCustomerIdAndAccountId(customerId, accountId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#removeByCustomerIdAndAccountId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .accounts
              .removeByCustomerIdAndAccountId(customerId, accountId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#removeByCustomerIdAndAccountId");
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
| **204** | The customer account was successfully deleted |  -  |

<a name="removeByInstitutionLogin"></a>
# **removeByInstitutionLogin**
> removeByInstitutionLogin(customerId, institutionLoginId).execute();

Delete Customer Accounts by Institution Login ID

Remove from Finicity aggregation the set of accounts matching the institution login ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
      client
              .accounts
              .removeByInstitutionLogin(customerId, institutionLoginId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#removeByInstitutionLogin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .accounts
              .removeByInstitutionLogin(customerId, institutionLoginId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#removeByInstitutionLogin");
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

null (empty response body)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The customer accounts were successfully deleted |  -  |

