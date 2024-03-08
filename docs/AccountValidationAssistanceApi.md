# AccountValidationAssistanceApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMicroEntriesDetails**](AccountValidationAssistanceApi.md#getMicroEntriesDetails) | **GET** /microentry/v1/customers/{customerId}/accounts/{accountId} | Get Micro Entries Details |
| [**initiateMicroEntries**](AccountValidationAssistanceApi.md#initiateMicroEntries) | **POST** /microentry/v1/customers/{customerId} | Initiate Micro Entries |
| [**verifyMicroEntries**](AccountValidationAssistanceApi.md#verifyMicroEntries) | **POST** /microentry/v1/customers/{customerId}/accounts/{accountId}/amounts | Verify Micro Entries |


<a name="getMicroEntriesDetails"></a>
# **getMicroEntriesDetails**
> MicroDepositDetails getMicroEntriesDetails(customerId, accountId).execute();

Get Micro Entries Details

Fetch the micro entries details. &#x60;customerId&#x60; and &#x60;accountId&#x60; are the identifiers of the customer and account receiving the micro entries.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountValidationAssistanceApi;
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
      MicroDepositDetails result = client
              .accountValidationAssistance
              .getMicroEntriesDetails(customerId, accountId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getStatusDescription());
      System.out.println(result.getCreationDate());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getAccountNumberLast4());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountValidationAssistanceApi#getMicroEntriesDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MicroDepositDetails> response = client
              .accountValidationAssistance
              .getMicroEntriesDetails(customerId, accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountValidationAssistanceApi#getMicroEntriesDetails");
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

[**MicroDepositDetails**](MicroDepositDetails.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Micro entries were successfully retrieved |  -  |

<a name="initiateMicroEntries"></a>
# **initiateMicroEntries**
> InitiatedMicroDeposit initiateMicroEntries(customerId, microDepositInitiation).execute();

Initiate Micro Entries

Initiate the micro entries to customer&#39;s account.  Two random micro amounts less than a dollar each will be deposited to provided customer&#39;s account.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountValidationAssistanceApi;
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
    Receiver receiver = new Receiver();
    String customerId = "1005061234"; // A customer ID
    String institutionLoginId = "institutionLoginId_example"; // An institution login ID (from the account record)
    URI callbackUrl = new URI(); // A callback URL where to receive micro deposit notifications
    try {
      InitiatedMicroDeposit result = client
              .accountValidationAssistance
              .initiateMicroEntries(receiver, customerId)
              .institutionLoginId(institutionLoginId)
              .callbackUrl(callbackUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccountId());
      System.out.println(result.getStatus());
      System.out.println(result.getDepositCount());
      System.out.println(result.getStatusDescription());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountValidationAssistanceApi#initiateMicroEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InitiatedMicroDeposit> response = client
              .accountValidationAssistance
              .initiateMicroEntries(receiver, customerId)
              .institutionLoginId(institutionLoginId)
              .callbackUrl(callbackUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountValidationAssistanceApi#initiateMicroEntries");
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
| **microDepositInitiation** | [**MicroDepositInitiation**](MicroDepositInitiation.md)|  | |

### Return type

[**InitiatedMicroDeposit**](InitiatedMicroDeposit.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Micro entries were successfully initiated |  -  |
| **429** | The service can&#39;t accept more requests or is not available from the Test Drive. |  -  |

<a name="verifyMicroEntries"></a>
# **verifyMicroEntries**
> VerifiedMicroDeposit verifyMicroEntries(customerId, accountId, microDepositVerification).execute();

Verify Micro Entries

Verify the micro entries as received by customer in customer&#39;s account. Customer needs to verify the micro amounts received in customer&#39;s account. &#x60;customerId&#x60; and &#x60;accountId&#x60; are the identifiers of the customer and account  receiving the micro entries.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountValidationAssistanceApi;
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
    List<Float> amounts = Arrays.asList(); // The list of amounts to be verified
    String customerId = "1005061234"; // A customer ID
    String accountId = "5011648377"; // The account ID
    try {
      VerifiedMicroDeposit result = client
              .accountValidationAssistance
              .verifyMicroEntries(amounts, customerId, accountId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getStatusDescription());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountValidationAssistanceApi#verifyMicroEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VerifiedMicroDeposit> response = client
              .accountValidationAssistance
              .verifyMicroEntries(amounts, customerId, accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountValidationAssistanceApi#verifyMicroEntries");
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
| **microDepositVerification** | [**MicroDepositVerification**](MicroDepositVerification.md)|  | |

### Return type

[**VerifiedMicroDeposit**](VerifiedMicroDeposit.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Micro entries were successfully verified |  -  |

