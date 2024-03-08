# ThirdPartyAccessApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateKey**](ThirdPartyAccessApi.md#generateKey) | **POST** /aggregation/v1/partners/accessKey | Generate Third Party Access Key |
| [**revokePartnersAccess**](ThirdPartyAccessApi.md#revokePartnersAccess) | **DELETE** /aggregation/v1/partners/accessKey/{consentReceiptId} | Revoke Third Party Access |
| [**updateAccess**](ThirdPartyAccessApi.md#updateAccess) | **PUT** /aggregation/v1/partners/accessKey/{consentReceiptId} | Update Third Party Access |


<a name="generateKey"></a>
# **generateKey**
> ThirdPartyAccessKeyReceiptData generateKey(thirdPartyAccessKeyData).execute();

Generate Third Party Access Key

Generate access key for third party partners. A partner can provide access to third party partners with this access key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThirdPartyAccessApi;
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
    String customerId = "customerId_example"; // A customer ID. See Add Customer API for how to create a customer ID.
    String partnerId = "partnerId_example"; // Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
    String thirdPartyPartnerId = "thirdPartyPartnerId_example"; // Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
    List<ThirdPartyAccessProduct> products = Arrays.asList();
    ThirdPartyAccessProvenance provenance = new ThirdPartyAccessProvenance();
    try {
      ThirdPartyAccessKeyReceiptData result = client
              .thirdPartyAccess
              .generateKey(customerId, partnerId, thirdPartyPartnerId, products)
              .provenance(provenance)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThirdPartyAccessApi#generateKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ThirdPartyAccessKeyReceiptData> response = client
              .thirdPartyAccess
              .generateKey(customerId, partnerId, thirdPartyPartnerId, products)
              .provenance(provenance)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThirdPartyAccessApi#generateKey");
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
| **thirdPartyAccessKeyData** | [**ThirdPartyAccessKeyData**](ThirdPartyAccessKeyData.md)|  | |

### Return type

[**ThirdPartyAccessKeyReceiptData**](ThirdPartyAccessKeyReceiptData.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The third party access key was successfully generated |  -  |

<a name="revokePartnersAccess"></a>
# **revokePartnersAccess**
> revokePartnersAccess(consentReceiptId).execute();

Revoke Third Party Access

Revoke access of third party partners

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThirdPartyAccessApi;
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
    String consentReceiptId = "cr_4pfI3r1X8aOHrDDwrwC01NHFxOXlT1"; // Third party access key receipt ID
    try {
      client
              .thirdPartyAccess
              .revokePartnersAccess(consentReceiptId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ThirdPartyAccessApi#revokePartnersAccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .thirdPartyAccess
              .revokePartnersAccess(consentReceiptId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ThirdPartyAccessApi#revokePartnersAccess");
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
| **consentReceiptId** | **String**| Third party access key receipt ID | |

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
| **204** | The third party access key was successfully revoked |  -  |

<a name="updateAccess"></a>
# **updateAccess**
> ThirdPartyAccessKeyReceiptData updateAccess(consentReceiptId, thirdPartyAccessKeyData).execute();

Update Third Party Access

Update access for third party partners

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThirdPartyAccessApi;
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
    String customerId = "customerId_example"; // A customer ID. See Add Customer API for how to create a customer ID.
    String partnerId = "partnerId_example"; // Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
    String thirdPartyPartnerId = "thirdPartyPartnerId_example"; // Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
    List<ThirdPartyAccessProduct> products = Arrays.asList();
    String consentReceiptId = "cr_4pfI3r1X8aOHrDDwrwC01NHFxOXlT1"; // Third party access key receipt ID
    ThirdPartyAccessProvenance provenance = new ThirdPartyAccessProvenance();
    try {
      ThirdPartyAccessKeyReceiptData result = client
              .thirdPartyAccess
              .updateAccess(customerId, partnerId, thirdPartyPartnerId, products, consentReceiptId)
              .provenance(provenance)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThirdPartyAccessApi#updateAccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ThirdPartyAccessKeyReceiptData> response = client
              .thirdPartyAccess
              .updateAccess(customerId, partnerId, thirdPartyPartnerId, products, consentReceiptId)
              .provenance(provenance)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThirdPartyAccessApi#updateAccess");
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
| **consentReceiptId** | **String**| Third party access key receipt ID | |
| **thirdPartyAccessKeyData** | [**ThirdPartyAccessKeyData**](ThirdPartyAccessKeyData.md)|  | |

### Return type

[**ThirdPartyAccessKeyReceiptData**](ThirdPartyAccessKeyReceiptData.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The third party access key was successfully updated |  -  |

