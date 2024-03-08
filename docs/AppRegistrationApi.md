# AppRegistrationApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignApplications**](AppRegistrationApi.md#assignApplications) | **PUT** /aggregation/v1/customers/{customerId}/applications/{applicationId} | Set Customer App ID |
| [**createNewApplication**](AppRegistrationApi.md#createNewApplication) | **POST** /aggregation/v1/partners/applications | Register App |
| [**getApplicationStatus**](AppRegistrationApi.md#getApplicationStatus) | **GET** /aggregation/v2/partners/applications | Get App Registration Status |
| [**migrateInstitutionLoginAccounts**](AppRegistrationApi.md#migrateInstitutionLoginAccounts) | **PUT** /aggregation/v2/customers/{customerId}/institutionLogins/{institutionLoginId}/migration | Migrate Institution Login Accounts |
| [**updateRegistration**](AppRegistrationApi.md#updateRegistration) | **PUT** /aggregation/v1/partners/applications/{preAppId} | Modify App Registration |


<a name="assignApplications"></a>
# **assignApplications**
> assignApplications(customerId, applicationId).execute();

Set Customer App ID

If you have multiple applications for a single client, and you want to register their applications to access financial institutions using OAuth connections, then use this API to assign applications to an existing customer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppRegistrationApi;
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
    String applicationId = "123456789"; // The application ID
    try {
      client
              .appRegistration
              .assignApplications(customerId, applicationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#assignApplications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .appRegistration
              .assignApplications(customerId, applicationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#assignApplications");
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
| **applicationId** | **String**| The application ID | |

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
| **200** | The app was successfully assigned |  -  |

<a name="createNewApplication"></a>
# **createNewApplication**
> RegisteredApplication createNewApplication(application).execute();

Register App

Register a new application to access financial institutions using OAuth connections.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppRegistrationApi;
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
    String appDescription = "appDescription_example"; // A short description of the app. This will be visible to end users in the FI interface.
    String appName = "appName_example"; // The name of the application assigned to the customer
    String appUrl = "appUrl_example"; // An URL for the app. This will be visible to end users in the FI interface.
    String ownerAddressLine1 = "ownerAddressLine1_example"; // Address line 1
    String ownerAddressLine2 = "ownerAddressLine2_example"; // Address line 2
    String ownerCity = "ownerCity_example"; // City for the business entity that owns the app. Information for registration purposes only and not given to the end user.
    String ownerCountry = "ownerCountry_example"; // Country for the  business entity that owns the app. Information for registration purposes only and not given to the end user.
    String ownerName = "ownerName_example"; // Business name for the business entity that owns the app. Information for registration purposes only and not given to the end user.
    String ownerPostalCode = "ownerPostalCode_example"; // Zip code for the business entity that owns the app. Information for registration purposes only and not given to the end user.
    String ownerState = "ownerState_example"; // State for the business entity that owns the app. Information for registration purposes only and not given to the end user.
    String image = "image_example"; // An app logo passed as a Base64 encoded image (1:1 SVG file, must be less than 50KB)
    try {
      RegisteredApplication result = client
              .appRegistration
              .createNewApplication(appDescription, appName, appUrl, ownerAddressLine1, ownerAddressLine2, ownerCity, ownerCountry, ownerName, ownerPostalCode, ownerState, image)
              .execute();
      System.out.println(result);
      System.out.println(result.getPreAppId());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#createNewApplication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RegisteredApplication> response = client
              .appRegistration
              .createNewApplication(appDescription, appName, appUrl, ownerAddressLine1, ownerAddressLine2, ownerCity, ownerCountry, ownerName, ownerPostalCode, ownerState, image)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#createNewApplication");
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
| **application** | [**Application**](Application.md)|  | |

### Return type

[**RegisteredApplication**](RegisteredApplication.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The app registration was successfully created |  -  |

<a name="getApplicationStatus"></a>
# **getApplicationStatus**
> AppStatuses getApplicationStatus().preAppId(preAppId).applicationId(applicationId).status(status).appName(appName).submittedDate(submittedDate).modifiedDate(modifiedDate).page(page).pageSize(pageSize).execute();

Get App Registration Status

Get the status of your application registration(s).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppRegistrationApi;
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
    String preAppId = "2581"; // The application registration tracking ID
    String applicationId = "123456789"; // The application ID
    String status = "P"; // Look up app registration requests by status
    String appName = "Awesome Budget App"; // Look up app registration requests by app name
    Long submittedDate = 1607450357L; // Look up app registration requests by the date they were submitted
    Long modifiedDate = 1607450357L; // Look up app registration requests by the date the request was updated. This can be used to determine when a request was updated to \"A\" or \"R\".
    Integer page = 1; // Index of the page of results to return
    Integer pageSize = 1; // Maximum number of results per page
    try {
      AppStatuses result = client
              .appRegistration
              .getApplicationStatus()
              .preAppId(preAppId)
              .applicationId(applicationId)
              .status(status)
              .appName(appName)
              .submittedDate(submittedDate)
              .modifiedDate(modifiedDate)
              .page(page)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalRecords());
      System.out.println(result.getTotalPages());
      System.out.println(result.getPageNumber());
      System.out.println(result.getNumberOfRecordsPerPage());
      System.out.println(result.getApplications());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#getApplicationStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppStatuses> response = client
              .appRegistration
              .getApplicationStatus()
              .preAppId(preAppId)
              .applicationId(applicationId)
              .status(status)
              .appName(appName)
              .submittedDate(submittedDate)
              .modifiedDate(modifiedDate)
              .page(page)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#getApplicationStatus");
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
| **preAppId** | **String**| The application registration tracking ID | [optional] |
| **applicationId** | **String**| The application ID | [optional] |
| **status** | **String**| Look up app registration requests by status | [optional] |
| **appName** | **String**| Look up app registration requests by app name | [optional] |
| **submittedDate** | **Long**| Look up app registration requests by the date they were submitted | [optional] |
| **modifiedDate** | **Long**| Look up app registration requests by the date the request was updated. This can be used to determine when a request was updated to \&quot;A\&quot; or \&quot;R\&quot;. | [optional] |
| **page** | **Integer**| Index of the page of results to return | [optional] [default to 1] |
| **pageSize** | **Integer**| Maximum number of results per page | [optional] [default to 1] |

### Return type

[**AppStatuses**](AppStatuses.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The app registration statuses were returned |  -  |

<a name="migrateInstitutionLoginAccounts"></a>
# **migrateInstitutionLoginAccounts**
> CustomerAccounts migrateInstitutionLoginAccounts(customerId, institutionLoginId).execute();

Migrate Institution Login Accounts

The &#x60;institutionLoginId&#x60; parameter uses Finicity&#39;s internal FI mapping to move accounts from the current FI legacy connection to the new OAuth FI connection.  This API returns a list of accounts for the given institution login ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppRegistrationApi;
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
              .appRegistration
              .migrateInstitutionLoginAccounts(customerId, institutionLoginId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#migrateInstitutionLoginAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerAccounts> response = client
              .appRegistration
              .migrateInstitutionLoginAccounts(customerId, institutionLoginId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#migrateInstitutionLoginAccounts");
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
| **200** | The migration succeeded |  -  |

<a name="updateRegistration"></a>
# **updateRegistration**
> RegisteredApplication updateRegistration(preAppId, application).execute();

Modify App Registration

Update a registered application.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppRegistrationApi;
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
    String appDescription = "appDescription_example"; // A short description of the app. This will be visible to end users in the FI interface.
    String appName = "appName_example"; // The name of the application assigned to the customer
    String appUrl = "appUrl_example"; // An URL for the app. This will be visible to end users in the FI interface.
    String ownerAddressLine1 = "ownerAddressLine1_example"; // Address line 1
    String ownerAddressLine2 = "ownerAddressLine2_example"; // Address line 2
    String ownerCity = "ownerCity_example"; // City for the business entity that owns the app. Information for registration purposes only and not given to the end user.
    String ownerCountry = "ownerCountry_example"; // Country for the  business entity that owns the app. Information for registration purposes only and not given to the end user.
    String ownerName = "ownerName_example"; // Business name for the business entity that owns the app. Information for registration purposes only and not given to the end user.
    String ownerPostalCode = "ownerPostalCode_example"; // Zip code for the business entity that owns the app. Information for registration purposes only and not given to the end user.
    String ownerState = "ownerState_example"; // State for the business entity that owns the app. Information for registration purposes only and not given to the end user.
    String image = "image_example"; // An app logo passed as a Base64 encoded image (1:1 SVG file, must be less than 50KB)
    String preAppId = "2581"; // The application registration tracking ID
    try {
      RegisteredApplication result = client
              .appRegistration
              .updateRegistration(appDescription, appName, appUrl, ownerAddressLine1, ownerAddressLine2, ownerCity, ownerCountry, ownerName, ownerPostalCode, ownerState, image, preAppId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPreAppId());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#updateRegistration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RegisteredApplication> response = client
              .appRegistration
              .updateRegistration(appDescription, appName, appUrl, ownerAddressLine1, ownerAddressLine2, ownerCity, ownerCountry, ownerName, ownerPostalCode, ownerState, image, preAppId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRegistrationApi#updateRegistration");
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
| **preAppId** | **String**| The application registration tracking ID | |
| **application** | [**Application**](Application.md)|  | |

### Return type

[**RegisteredApplication**](RegisteredApplication.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The app registration was updated |  -  |

