# AuthenticationApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAccessToken**](AuthenticationApi.md#createAccessToken) | **POST** /aggregation/v2/partners/authentication | Create Access Token |
| [**modifyPartnerSecret**](AuthenticationApi.md#modifyPartnerSecret) | **PUT** /aggregation/v2/partners/authentication | Modify Partner Secret |


<a name="createAccessToken"></a>
# **createAccessToken**
> AccessToken createAccessToken(partnerCredentials).execute();

Create Access Token

Send Partner ID and Partner Secret to the Partner Authentication service to obtain a token for accessing Finicity APIs. * The token is valid for two hours and is required on all calls to the Finicity APIs * As a best practice, use a single token for all calls. Assign a timestamp for each token, and then check the current timestamp before making any calls. If the token is greater than 90 minutes, generate a new one. * ⚠️ After five failed attempts to authenticate, your account will be locked. Contact [support@finicity.com](mailto:support@finicity.com) to get help resetting your account.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.finicity.com";
    
    configuration.finicityAppKey  = "YOUR API KEY";
    Mastercard client = new Mastercard(configuration);
    String partnerId = "partnerId_example"; // Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
    String partnerSecret = "partnerSecret_example"; // Your Partner Secret displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
    try {
      AccessToken result = client
              .authentication
              .createAccessToken(partnerId, partnerSecret)
              .execute();
      System.out.println(result);
      System.out.println(result.getToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#createAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessToken> response = client
              .authentication
              .createAccessToken(partnerId, partnerSecret)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#createAccessToken");
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
| **partnerCredentials** | [**PartnerCredentials**](PartnerCredentials.md)|  | |

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The access token was successfully created |  -  |

<a name="modifyPartnerSecret"></a>
# **modifyPartnerSecret**
> modifyPartnerSecret(partnerCredentialsWithNewSecret).execute();

Modify Partner Secret

Change the Partner Secret used to authenticate this partner.  The secret does not expire, but can be changed by calling this API. A valid Partner Secret may contain upper and lowercase characters, numbers, and the characters !, @, #, $, %, &amp;, *, _, -, +. It must include at least one number and at least one letter, and its length should be between 12 and 255 characters.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.finicity.com";
    
    configuration.finicityAppKey  = "YOUR API KEY";
    Mastercard client = new Mastercard(configuration);
    String partnerId = "partnerId_example"; // Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
    String partnerSecret = "partnerSecret_example"; // Your Partner Secret displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
    String newPartnerSecret = "newPartnerSecret_example"; // A new value for the Partner Secret
    try {
      client
              .authentication
              .modifyPartnerSecret(partnerId, partnerSecret, newPartnerSecret)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#modifyPartnerSecret");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authentication
              .modifyPartnerSecret(partnerId, partnerSecret, newPartnerSecret)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#modifyPartnerSecret");
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
| **partnerCredentialsWithNewSecret** | [**PartnerCredentialsWithNewSecret**](PartnerCredentialsWithNewSecret.md)|  | |

### Return type

null (empty response body)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The Partner Secret was successfully updated |  -  |

