# BusinessesApiApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewBusiness**](BusinessesApiApi.md#createNewBusiness) | **POST** /business-services/customers/{customer_id}/businesses | Create a New Business for a Customer |
| [**getDetailsByCustomerId**](BusinessesApiApi.md#getDetailsByCustomerId) | **GET** /business-services/customers/{customer_id}/businesses | Get Business for Customer |
| [**getDetailsById**](BusinessesApiApi.md#getDetailsById) | **GET** /business-services/businesses/{business_id} | Get Business by ID |
| [**updateById**](BusinessesApiApi.md#updateById) | **PUT** /business-services/businesses/{business_id} | Update Business by ID |


<a name="createNewBusiness"></a>
# **createNewBusiness**
> Business createNewBusiness(customerId, newBusiness).execute();

Create a New Business for a Customer

Create a new business record for the associated customer. A customer can have one business record associated.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessesApiApi;
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
    String name = "name_example"; // The legal name of the business
    Boolean personallyLiable = true; // Indicates whether a business owner is personally liable for a loan
    NewAddress address = new NewAddress();
    PhoneNumberFormat phoneNumber = new PhoneNumberFormat();
    String customerId = "1005061234"; // Unique identifier of the customer
    URI url = new URI(); // A URL for the business website
    String email = "email_example"; // An email address
    String type = "type_example"; // The business type eg LLC, Corp, S Corp, C Corp, B Corp, Sole Propriertorship, Nonprofit, etc.
    String taxId = "taxId_example"; // Provide details of the tax id for the business
    try {
      Business result = client
              .businessesApi
              .createNewBusiness(name, personallyLiable, address, phoneNumber, customerId)
              .url(url)
              .email(email)
              .type(type)
              .taxId(taxId)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getPersonallyLiable());
      System.out.println(result.getAddress());
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getUrl());
      System.out.println(result.getEmail());
      System.out.println(result.getType());
      System.out.println(result.getTaxId());
      System.out.println(result.getBusinessId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getModifiedDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessesApiApi#createNewBusiness");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Business> response = client
              .businessesApi
              .createNewBusiness(name, personallyLiable, address, phoneNumber, customerId)
              .url(url)
              .email(email)
              .type(type)
              .taxId(taxId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessesApiApi#createNewBusiness");
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
| **customerId** | **String**| Unique identifier of the customer | |
| **newBusiness** | [**NewBusiness**](NewBusiness.md)|  | |

### Return type

[**Business**](Business.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The business was successfully created. |  -  |

<a name="getDetailsByCustomerId"></a>
# **getDetailsByCustomerId**
> List&lt;Business&gt; getDetailsByCustomerId(customerId).execute();

Get Business for Customer

Retrieve business details associated with a specific customer. By providing the unique customer identifier, details about the associated business can be accessed.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessesApiApi;
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
    String customerId = "1005061234"; // Unique identifier of the customer
    try {
      List<Business> result = client
              .businessesApi
              .getDetailsByCustomerId(customerId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessesApiApi#getDetailsByCustomerId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Business>> response = client
              .businessesApi
              .getDetailsByCustomerId(customerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessesApiApi#getDetailsByCustomerId");
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
| **customerId** | **String**| Unique identifier of the customer | |

### Return type

[**List&lt;Business&gt;**](Business.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The business information was successfully retrieved. |  -  |

<a name="getDetailsById"></a>
# **getDetailsById**
> List&lt;Business&gt; getDetailsById(customerId).execute();

Get Business by ID

Retrieve business details.  _Supported regions_: ![\\U0001F1FA\\U0001F1F8](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessesApiApi;
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
    String customerId = "1005061234"; // Unique identifier of the customer
    try {
      List<Business> result = client
              .businessesApi
              .getDetailsById(customerId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessesApiApi#getDetailsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Business>> response = client
              .businessesApi
              .getDetailsById(customerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessesApiApi#getDetailsById");
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
| **customerId** | **String**| Unique identifier of the customer | |

### Return type

[**List&lt;Business&gt;**](Business.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The business information was successfully retrieved. |  -  |

<a name="updateById"></a>
# **updateById**
> Business updateById(customerId, newBusiness).execute();

Update Business by ID

Update the details of a business based on its unique identifier. By providing the specific business ID and the updated information in the request, modifications can be made to the business&#39;s profile.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessesApiApi;
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
    String name = "name_example"; // The legal name of the business
    Boolean personallyLiable = true; // Indicates whether a business owner is personally liable for a loan
    NewAddress address = new NewAddress();
    PhoneNumberFormat phoneNumber = new PhoneNumberFormat();
    String customerId = "1005061234"; // Unique identifier of the customer
    URI url = new URI(); // A URL for the business website
    String email = "email_example"; // An email address
    String type = "type_example"; // The business type eg LLC, Corp, S Corp, C Corp, B Corp, Sole Propriertorship, Nonprofit, etc.
    String taxId = "taxId_example"; // Provide details of the tax id for the business
    try {
      Business result = client
              .businessesApi
              .updateById(name, personallyLiable, address, phoneNumber, customerId)
              .url(url)
              .email(email)
              .type(type)
              .taxId(taxId)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getPersonallyLiable());
      System.out.println(result.getAddress());
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getUrl());
      System.out.println(result.getEmail());
      System.out.println(result.getType());
      System.out.println(result.getTaxId());
      System.out.println(result.getBusinessId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getModifiedDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessesApiApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Business> response = client
              .businessesApi
              .updateById(name, personallyLiable, address, phoneNumber, customerId)
              .url(url)
              .email(email)
              .type(type)
              .taxId(taxId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessesApiApi#updateById");
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
| **customerId** | **String**| Unique identifier of the customer | |
| **newBusiness** | [**NewBusiness**](NewBusiness.md)|  | |

### Return type

[**Business**](Business.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The business information was updated. |  -  |

