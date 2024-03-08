# InstitutionsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBrandingById**](InstitutionsApi.md#getBrandingById) | **GET** /institution/v2/institutions/{institutionId}/branding | Get Institution Branding by ID |
| [**getByIdDetails**](InstitutionsApi.md#getByIdDetails) | **GET** /institution/v2/institutions/{institutionId} | Get Institution by ID |
| [**getCertifiedInstitutionsWithRssd**](InstitutionsApi.md#getCertifiedInstitutionsWithRssd) | **GET** /institution/v2/certifiedInstitutions/rssd | Get Certified Institutions With RSSD |
| [**listCertifiedInstitutions**](InstitutionsApi.md#listCertifiedInstitutions) | **GET** /institution/v2/certifiedInstitutions | Get Certified Institutions |
| [**searchFinancialInstitutions**](InstitutionsApi.md#searchFinancialInstitutions) | **GET** /institution/v2/institutions | Get Institutions |


<a name="getBrandingById"></a>
# **getBrandingById**
> BrandingWrapper getBrandingById(institutionId).execute();

Get Institution Branding by ID

Return the branding information for a financial institution.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InstitutionsApi;
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
    Long institutionId = 4222L; // The institution ID
    try {
      BrandingWrapper result = client
              .institutions
              .getBrandingById(institutionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getBranding());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#getBrandingById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BrandingWrapper> response = client
              .institutions
              .getBrandingById(institutionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#getBrandingById");
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
| **institutionId** | **Long**| The institution ID | |

### Return type

[**BrandingWrapper**](BrandingWrapper.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Institution branding was successfully retrieved |  -  |

<a name="getByIdDetails"></a>
# **getByIdDetails**
> InstitutionWrapper getByIdDetails(institutionId).execute();

Get Institution by ID

Get financial institution details by ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InstitutionsApi;
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
    Long institutionId = 4222L; // The institution ID
    try {
      InstitutionWrapper result = client
              .institutions
              .getByIdDetails(institutionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getInstitution());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#getByIdDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstitutionWrapper> response = client
              .institutions
              .getByIdDetails(institutionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#getByIdDetails");
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
| **institutionId** | **Long**| The institution ID | |

### Return type

[**InstitutionWrapper**](InstitutionWrapper.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Institution was successfully retrieved |  -  |

<a name="getCertifiedInstitutionsWithRssd"></a>
# **getCertifiedInstitutionsWithRssd**
> CertifiedInstitutions getCertifiedInstitutionsWithRssd().search(search).start(start).limit(limit).type(type).supportedCountries(supportedCountries).execute();

Get Certified Institutions With RSSD

Search for certified financial institutions w/RSSD.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InstitutionsApi;
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
    String search = "finbank"; // Search term (financial institution `name` field). Leave empty for all FIs.
    Integer start = 1; // Index of the page of results to return
    Integer limit = 25; // Maximum number of results per page
    String type = "voa"; // A product type: \"transAgg\", \"ach\", \"stateAgg\", \"voi\", \"voa\", \"aha\", \"availBalance\", \"accountOwner\"
    List<String> supportedCountries = Arrays.asList(); // A list of country codes, '*' for all countries.
    try {
      CertifiedInstitutions result = client
              .institutions
              .getCertifiedInstitutionsWithRssd()
              .search(search)
              .start(start)
              .limit(limit)
              .type(type)
              .supportedCountries(supportedCountries)
              .execute();
      System.out.println(result);
      System.out.println(result.getFound());
      System.out.println(result.getDisplaying());
      System.out.println(result.getMoreAvailable());
      System.out.println(result.getRequestedDate());
      System.out.println(result.getInstitutions());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#getCertifiedInstitutionsWithRssd");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CertifiedInstitutions> response = client
              .institutions
              .getCertifiedInstitutionsWithRssd()
              .search(search)
              .start(start)
              .limit(limit)
              .type(type)
              .supportedCountries(supportedCountries)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#getCertifiedInstitutionsWithRssd");
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
| **search** | **String**| Search term (financial institution &#x60;name&#x60; field). Leave empty for all FIs. | [optional] |
| **start** | **Integer**| Index of the page of results to return | [optional] [default to 1] |
| **limit** | **Integer**| Maximum number of results per page | [optional] [default to 25] |
| **type** | **String**| A product type: \&quot;transAgg\&quot;, \&quot;ach\&quot;, \&quot;stateAgg\&quot;, \&quot;voi\&quot;, \&quot;voa\&quot;, \&quot;aha\&quot;, \&quot;availBalance\&quot;, \&quot;accountOwner\&quot; | [optional] |
| **supportedCountries** | [**List&lt;String&gt;**](String.md)| A list of country codes, &#39;*&#39; for all countries. | [optional] |

### Return type

[**CertifiedInstitutions**](CertifiedInstitutions.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Institutions were successfully retrieved |  -  |

<a name="listCertifiedInstitutions"></a>
# **listCertifiedInstitutions**
> CertifiedInstitutions listCertifiedInstitutions().search(search).start(start).limit(limit).type(type).supportedCountries(supportedCountries).execute();

Get Certified Institutions

Search for financial institutions by certified product.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InstitutionsApi;
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
    String search = "finbank"; // Search term (financial institution `name` field). Leave empty for all FIs.
    Integer start = 1; // Index of the page of results to return
    Integer limit = 25; // Maximum number of results per page
    String type = "voa"; // A product type: \"transAgg\", \"ach\", \"stateAgg\", \"voi\", \"voa\", \"aha\", \"availBalance\", \"accountOwner\"
    List<String> supportedCountries = Arrays.asList(); // A list of country codes, '*' for all countries.
    try {
      CertifiedInstitutions result = client
              .institutions
              .listCertifiedInstitutions()
              .search(search)
              .start(start)
              .limit(limit)
              .type(type)
              .supportedCountries(supportedCountries)
              .execute();
      System.out.println(result);
      System.out.println(result.getFound());
      System.out.println(result.getDisplaying());
      System.out.println(result.getMoreAvailable());
      System.out.println(result.getRequestedDate());
      System.out.println(result.getInstitutions());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#listCertifiedInstitutions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CertifiedInstitutions> response = client
              .institutions
              .listCertifiedInstitutions()
              .search(search)
              .start(start)
              .limit(limit)
              .type(type)
              .supportedCountries(supportedCountries)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#listCertifiedInstitutions");
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
| **search** | **String**| Search term (financial institution &#x60;name&#x60; field). Leave empty for all FIs. | [optional] |
| **start** | **Integer**| Index of the page of results to return | [optional] [default to 1] |
| **limit** | **Integer**| Maximum number of results per page | [optional] [default to 25] |
| **type** | **String**| A product type: \&quot;transAgg\&quot;, \&quot;ach\&quot;, \&quot;stateAgg\&quot;, \&quot;voi\&quot;, \&quot;voa\&quot;, \&quot;aha\&quot;, \&quot;availBalance\&quot;, \&quot;accountOwner\&quot; | [optional] |
| **supportedCountries** | [**List&lt;String&gt;**](String.md)| A list of country codes, &#39;*&#39; for all countries. | [optional] |

### Return type

[**CertifiedInstitutions**](CertifiedInstitutions.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Institutions were successfully retrieved |  -  |

<a name="searchFinancialInstitutions"></a>
# **searchFinancialInstitutions**
> Institutions searchFinancialInstitutions().search(search).start(start).limit(limit).type(type).supportedCountries(supportedCountries).execute();

Get Institutions

Search for financial institutions.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InstitutionsApi;
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
    String search = "finbank"; // Search term (financial institution `name` field). Leave empty for all FIs.
    Integer start = 1; // Index of the page of results to return
    Integer limit = 25; // Maximum number of results per page
    String type = "voa"; // A product type: \"transAgg\", \"ach\", \"stateAgg\", \"voi\", \"voa\", \"aha\", \"availBalance\", \"accountOwner\"
    List<String> supportedCountries = Arrays.asList(); // A list of country codes, '*' for all countries.
    try {
      Institutions result = client
              .institutions
              .searchFinancialInstitutions()
              .search(search)
              .start(start)
              .limit(limit)
              .type(type)
              .supportedCountries(supportedCountries)
              .execute();
      System.out.println(result);
      System.out.println(result.getFound());
      System.out.println(result.getDisplaying());
      System.out.println(result.getMoreAvailable());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getInstitutions());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#searchFinancialInstitutions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Institutions> response = client
              .institutions
              .searchFinancialInstitutions()
              .search(search)
              .start(start)
              .limit(limit)
              .type(type)
              .supportedCountries(supportedCountries)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#searchFinancialInstitutions");
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
| **search** | **String**| Search term (financial institution &#x60;name&#x60; field). Leave empty for all FIs. | [optional] |
| **start** | **Integer**| Index of the page of results to return | [optional] [default to 1] |
| **limit** | **Integer**| Maximum number of results per page | [optional] [default to 25] |
| **type** | **String**| A product type: \&quot;transAgg\&quot;, \&quot;ach\&quot;, \&quot;stateAgg\&quot;, \&quot;voi\&quot;, \&quot;voa\&quot;, \&quot;aha\&quot;, \&quot;availBalance\&quot;, \&quot;accountOwner\&quot; | [optional] |
| **supportedCountries** | [**List&lt;String&gt;**](String.md)| A list of country codes, &#39;*&#39; for all countries. | [optional] |

### Return type

[**Institutions**](Institutions.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Institutions were successfully retrieved |  -  |

