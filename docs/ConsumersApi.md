# ConsumersApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConsumerRecord**](ConsumersApi.md#createConsumerRecord) | **POST** /decisioning/v1/customers/{customerId}/consumer | Create Consumer |
| [**getByCustomerId**](ConsumersApi.md#getByCustomerId) | **GET** /decisioning/v1/customers/{customerId}/consumer | Get Consumer For Customer |
| [**getById**](ConsumersApi.md#getById) | **GET** /decisioning/v1/consumers/{consumerId} | Get Consumer by ID |
| [**modifyById**](ConsumersApi.md#modifyById) | **PUT** /decisioning/v1/consumers/{consumerId} | Modify Consumer by ID |


<a name="createConsumerRecord"></a>
# **createConsumerRecord**
> CreatedConsumer createConsumerRecord(customerId, newConsumer).execute();

Create Consumer

Create a consumer record associated with the given customer. A consumer persists as the owner of any reports that are generated, even after the original customer is deleted from the system.  A consumer must be created for the given customer before calling any of the Generate Report services.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConsumersApi;
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
    String firstName = "firstName_example"; // The first name of the account holder
    String lastName = "lastName_example"; // The last name of the account holder
    String address = "address_example"; // A street address
    String city = "city_example"; // City
    String state = "state_example"; // State
    String zip = "zip_example"; // A ZIP code
    String phone = "phone_example"; // A phone number (max length 15).
    String ssn = "ssn_example"; // A full SSN with or without hyphens
    Birthday birthday = new Birthday();
    String customerId = "1005061234"; // A customer ID
    String email = "email_example"; // An email address
    String suffix = "suffix_example"; // A generational or academic suffix
    try {
      CreatedConsumer result = client
              .consumers
              .createConsumerRecord(firstName, lastName, address, city, state, zip, phone, ssn, birthday, customerId)
              .email(email)
              .suffix(suffix)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getCustomerId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumersApi#createConsumerRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreatedConsumer> response = client
              .consumers
              .createConsumerRecord(firstName, lastName, address, city, state, zip, phone, ssn, birthday, customerId)
              .email(email)
              .suffix(suffix)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumersApi#createConsumerRecord");
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
| **newConsumer** | [**NewConsumer**](NewConsumer.md)|  | |

### Return type

[**CreatedConsumer**](CreatedConsumer.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The consumer was successfully created |  -  |

<a name="getByCustomerId"></a>
# **getByCustomerId**
> Consumer getByCustomerId(customerId).execute();

Get Consumer For Customer

Get the details of a consumer record by customer ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConsumersApi;
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
      Consumer result = client
              .consumers
              .getByCustomerId(customerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getCustomerId());
      System.out.println(result.getAddress());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZip());
      System.out.println(result.getPhone());
      System.out.println(result.getSsn());
      System.out.println(result.getBirthday());
      System.out.println(result.getEmail());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getSuffix());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumersApi#getByCustomerId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Consumer> response = client
              .consumers
              .getByCustomerId(customerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumersApi#getByCustomerId");
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

[**Consumer**](Consumer.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The consumer was successfully retrieved |  -  |

<a name="getById"></a>
# **getById**
> Consumer getById(consumerId).execute();

Get Consumer by ID

Get the details of a consumer record by consumer ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConsumersApi;
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
    String consumerId = "0bf46322c167b562e6cbed9d40e19a4c"; // The consumer ID
    try {
      Consumer result = client
              .consumers
              .getById(consumerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getCustomerId());
      System.out.println(result.getAddress());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZip());
      System.out.println(result.getPhone());
      System.out.println(result.getSsn());
      System.out.println(result.getBirthday());
      System.out.println(result.getEmail());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getSuffix());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumersApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Consumer> response = client
              .consumers
              .getById(consumerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumersApi#getById");
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
| **consumerId** | **String**| The consumer ID | |

### Return type

[**Consumer**](Consumer.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The consumer was successfully retrieved |  -  |

<a name="modifyById"></a>
# **modifyById**
> modifyById(consumerId, consumerUpdate).execute();

Modify Consumer by ID

Modify an existing consumer. All fields are required for a consumer record, but individual fields for this call are optional because fields that are not specified will be left unchanged.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConsumersApi;
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
    String consumerId = "0bf46322c167b562e6cbed9d40e19a4c"; // The consumer ID
    String firstName = "firstName_example"; // The first name of the account holder
    String lastName = "lastName_example"; // The last name of the account holder
    String address = "address_example"; // A street address
    String city = "city_example"; // City
    String state = "state_example"; // State
    String zip = "zip_example"; // A ZIP code
    String phone = "phone_example"; // A phone number (max length 15).
    String ssn = "ssn_example"; // A full SSN with or without hyphens
    Birthday birthday = new Birthday();
    String email = "email_example"; // An email address
    String suffix = "suffix_example"; // A generational or academic suffix
    try {
      client
              .consumers
              .modifyById(consumerId)
              .firstName(firstName)
              .lastName(lastName)
              .address(address)
              .city(city)
              .state(state)
              .zip(zip)
              .phone(phone)
              .ssn(ssn)
              .birthday(birthday)
              .email(email)
              .suffix(suffix)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumersApi#modifyById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .consumers
              .modifyById(consumerId)
              .firstName(firstName)
              .lastName(lastName)
              .address(address)
              .city(city)
              .state(state)
              .zip(zip)
              .phone(phone)
              .ssn(ssn)
              .birthday(birthday)
              .email(email)
              .suffix(suffix)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumersApi#modifyById");
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
| **consumerId** | **String**| The consumer ID | |
| **consumerUpdate** | [**ConsumerUpdate**](ConsumerUpdate.md)|  | |

### Return type

null (empty response body)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The consumer was successfully updated |  -  |

