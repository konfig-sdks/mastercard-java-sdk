# CustomersApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**enrollActiveCustomer**](CustomersApi.md#enrollActiveCustomer) | **POST** /aggregation/v2/customers/active | Add Customer |
| [**enrollTestingCustomer**](CustomersApi.md#enrollTestingCustomer) | **POST** /aggregation/v2/customers/testing | Add Testing Customer |
| [**findEnrolledUsers**](CustomersApi.md#findEnrolledUsers) | **GET** /aggregation/v1/customers | Get Customers |
| [**getById**](CustomersApi.md#getById) | **GET** /aggregation/v1/customers/{customerId} | Get Customer by ID |
| [**getWithAppDataById**](CustomersApi.md#getWithAppDataById) | **GET** /aggregation/v1/customers/{customerId}/application | Get Customer With App Data by ID |
| [**modifyById**](CustomersApi.md#modifyById) | **PUT** /aggregation/v1/customers/{customerId} | Modify Customer by ID |
| [**removeById**](CustomersApi.md#removeById) | **DELETE** /aggregation/v1/customers/{customerId} | Delete Customer by ID |


<a name="enrollActiveCustomer"></a>
# **enrollActiveCustomer**
> CreatedCustomer enrollActiveCustomer(newCustomer).execute();

Add Customer

Enroll an active customer, which is the actual owner of one or more real-world accounts. This is a billable customer.  Active customers must use the \&quot;FinBank Billable\&quot; profiles for testing purposes.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomersApi;
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
    String username = "username_example"; // The customer's username, assigned by the partner (a unique identifier), following these rules: minimum 6 characters maximum 255 characters any mix of uppercase, lowercase, numeric, and non-alphabet special characters ! @ . # $ % & * _ - + the use of email in this field is discouraged it is recommended to use a unique non-email identifier. Use of special characters may result in an error (e.g. í, ü, etc.). Usernames are unique. A username used in Test Drive can't be reused in other plans.
    String firstName = "firstName_example"; // The first name of the account holder
    String lastName = "lastName_example"; // The last name of the account holder
    String applicationId = "applicationId_example"; // `applicationId` value returned from the Get App Registration Status API and the partner assign the customers to. This cannot be changed once set. Only applicable in cases of partners with multiple registered applications. If the partner only has one app, this can usually be omitted. This field is populated after the app is in a status approved.
    String phone = "phone_example"; // A phone number (max length 15).
    String email = "email_example"; // An email address
    try {
      CreatedCustomer result = client
              .customers
              .enrollActiveCustomer(username)
              .firstName(firstName)
              .lastName(lastName)
              .applicationId(applicationId)
              .phone(phone)
              .email(email)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUsername());
      System.out.println(result.getCreatedDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#enrollActiveCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreatedCustomer> response = client
              .customers
              .enrollActiveCustomer(username)
              .firstName(firstName)
              .lastName(lastName)
              .applicationId(applicationId)
              .phone(phone)
              .email(email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#enrollActiveCustomer");
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
| **newCustomer** | [**NewCustomer**](NewCustomer.md)|  | |

### Return type

[**CreatedCustomer**](CreatedCustomer.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The customer was successfully created |  -  |
| **429** | The service can&#39;t accept more requests or is not available from the Test Drive. |  -  |

<a name="enrollTestingCustomer"></a>
# **enrollTestingCustomer**
> CreatedCustomer enrollTestingCustomer(newCustomer).execute();

Add Testing Customer

Enroll a testing customer (Test Drive accounts).  For using testing customers with FinBank OAuth, you must register a test application with your systems engineer or account manager. Then, use that testing &#x60;applicationId&#x60; when creating testing customers.  Testing Customers can access FinBank profiles (except \&quot;FinBank Billable\&quot; profiles), and cannot access live financial institutions.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomersApi;
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
    String username = "username_example"; // The customer's username, assigned by the partner (a unique identifier), following these rules: minimum 6 characters maximum 255 characters any mix of uppercase, lowercase, numeric, and non-alphabet special characters ! @ . # $ % & * _ - + the use of email in this field is discouraged it is recommended to use a unique non-email identifier. Use of special characters may result in an error (e.g. í, ü, etc.). Usernames are unique. A username used in Test Drive can't be reused in other plans.
    String firstName = "firstName_example"; // The first name of the account holder
    String lastName = "lastName_example"; // The last name of the account holder
    String applicationId = "applicationId_example"; // `applicationId` value returned from the Get App Registration Status API and the partner assign the customers to. This cannot be changed once set. Only applicable in cases of partners with multiple registered applications. If the partner only has one app, this can usually be omitted. This field is populated after the app is in a status approved.
    String phone = "phone_example"; // A phone number (max length 15).
    String email = "email_example"; // An email address
    try {
      CreatedCustomer result = client
              .customers
              .enrollTestingCustomer(username)
              .firstName(firstName)
              .lastName(lastName)
              .applicationId(applicationId)
              .phone(phone)
              .email(email)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUsername());
      System.out.println(result.getCreatedDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#enrollTestingCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreatedCustomer> response = client
              .customers
              .enrollTestingCustomer(username)
              .firstName(firstName)
              .lastName(lastName)
              .applicationId(applicationId)
              .phone(phone)
              .email(email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#enrollTestingCustomer");
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
| **newCustomer** | [**NewCustomer**](NewCustomer.md)|  | |

### Return type

[**CreatedCustomer**](CreatedCustomer.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The customer was successfully created |  -  |

<a name="findEnrolledUsers"></a>
# **findEnrolledUsers**
> Customers findEnrolledUsers().username(username).type(type).search(search).start(start).limit(limit).execute();

Get Customers

Find all customers enrolled by the current partner, where the search text is found in the customer&#39;s username or any combination of &#x60;firstName&#x60; and &#x60;lastName&#x60; fields. If no search text is provided, all customers will be returned.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomersApi;
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
    String username = "customerusername1"; // Username for exact match (will return 0 or 1 record)
    String type = "active"; // \"testing\" or \"active\" to return only customers of that type, or leave empty to return all customers
    String search = "Search Value"; // The text you wish to match. Leave this empty if you wish to return all customers. Must be URL-encoded (see: [Handling Spaces in Queries](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/)).
    Integer start = 1; // Index of the page of results to return
    Integer limit = 25; // Maximum number of results per page
    try {
      Customers result = client
              .customers
              .findEnrolledUsers()
              .username(username)
              .type(type)
              .search(search)
              .start(start)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getFound());
      System.out.println(result.getDisplaying());
      System.out.println(result.getMoreAvailable());
      System.out.println(result.getCustomers());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#findEnrolledUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Customers> response = client
              .customers
              .findEnrolledUsers()
              .username(username)
              .type(type)
              .search(search)
              .start(start)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#findEnrolledUsers");
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
| **username** | **String**| Username for exact match (will return 0 or 1 record) | [optional] |
| **type** | **String**| \&quot;testing\&quot; or \&quot;active\&quot; to return only customers of that type, or leave empty to return all customers | [optional] |
| **search** | **String**| The text you wish to match. Leave this empty if you wish to return all customers. Must be URL-encoded (see: [Handling Spaces in Queries](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/)). | [optional] |
| **start** | **Integer**| Index of the page of results to return | [optional] [default to 1] |
| **limit** | **Integer**| Maximum number of results per page | [optional] [default to 25] |

### Return type

[**Customers**](Customers.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customers were successfully retrieved |  -  |

<a name="getById"></a>
# **getById**
> Customer getById(customerId).execute();

Get Customer by ID

Retrieve a customer by ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomersApi;
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
      Customer result = client
              .customers
              .getById(customerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUsername());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getType());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getLastModifiedDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Customer> response = client
              .customers
              .getById(customerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#getById");
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

[**Customer**](Customer.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The customer was successfully retrieved |  -  |

<a name="getWithAppDataById"></a>
# **getWithAppDataById**
> CustomerWithAppData getWithAppDataById(customerId).execute();

Get Customer With App Data by ID

Retrieve a customer along with additional details about the OAuth application.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomersApi;
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
      CustomerWithAppData result = client
              .customers
              .getWithAppDataById(customerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUsername());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getType());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getLastModifiedDate());
      System.out.println(result.getApplicationId());
      System.out.println(result.getApplicationName());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#getWithAppDataById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerWithAppData> response = client
              .customers
              .getWithAppDataById(customerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#getWithAppDataById");
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

[**CustomerWithAppData**](CustomerWithAppData.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The customer was successfully retrieved |  -  |

<a name="modifyById"></a>
# **modifyById**
> modifyById(customerId, customerUpdate).execute();

Modify Customer by ID

Modify an enrolled customer by ID.  You must specify either &#x60;firstName&#x60;, &#x60;lastName&#x60;, or both in the request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomersApi;
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
    String firstName = "firstName_example"; // The first name of the account holder
    String lastName = "lastName_example"; // The last name of the account holder
    try {
      client
              .customers
              .modifyById(customerId)
              .firstName(firstName)
              .lastName(lastName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#modifyById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .customers
              .modifyById(customerId)
              .firstName(firstName)
              .lastName(lastName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#modifyById");
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
| **customerUpdate** | [**CustomerUpdate**](CustomerUpdate.md)|  | |

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
| **204** | The customer was successfully updated |  -  |

<a name="removeById"></a>
# **removeById**
> removeById(customerId).execute();

Delete Customer by ID

Completely remove a customer from the system. This will remove the customer and all associated accounts and transactions.  ⚠️ Use this service carefully! It will not pause for confirmation before performing the operation!  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomersApi;
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
              .customers
              .removeById(customerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .customers
              .removeById(customerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#removeById");
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
| **204** | The customer was successfully deleted |  -  |

