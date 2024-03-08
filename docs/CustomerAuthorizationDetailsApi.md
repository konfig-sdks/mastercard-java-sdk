# CustomerAuthorizationDetailsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuthorizationDetails**](CustomerAuthorizationDetailsApi.md#getAuthorizationDetails) | **GET** /customers/institution-logins/{institution_login_id}/authorization-details | Returns customer authorization details for the institution login identification. |


<a name="getAuthorizationDetails"></a>
# **getAuthorizationDetails**
> CustomerAuthorizationDetails getAuthorizationDetails(institutionLoginId).execute();

Returns customer authorization details for the institution login identification.

The endpoint provides customer authorization details like authorization start date, authorization end date against the requested institution login id  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomerAuthorizationDetailsApi;
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
    Long institutionLoginId = 7008461438L; // Institution login id of the customer.
    try {
      CustomerAuthorizationDetails result = client
              .customerAuthorizationDetails
              .getAuthorizationDetails(institutionLoginId)
              .execute();
      System.out.println(result);
      System.out.println(result.getInstitutionLoginId());
      System.out.println(result.getAuthorizationStartDate());
      System.out.println(result.getAuthorizationEndDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAuthorizationDetailsApi#getAuthorizationDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerAuthorizationDetails> response = client
              .customerAuthorizationDetails
              .getAuthorizationDetails(institutionLoginId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAuthorizationDetailsApi#getAuthorizationDetails");
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
| **institutionLoginId** | **Long**| Institution login id of the customer. | |

### Return type

[**CustomerAuthorizationDetails**](CustomerAuthorizationDetails.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved customer authorization details by institution login id. |  -  |

