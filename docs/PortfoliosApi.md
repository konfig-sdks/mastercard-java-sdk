# PortfoliosApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMostRecentReports**](PortfoliosApi.md#getMostRecentReports) | **GET** /decisioning/v1/customers/{customerId}/portfolios/{portfolioId} | Get Portfolio by Customer |
| [**getPortfolioByConsumer**](PortfoliosApi.md#getPortfolioByConsumer) | **GET** /decisioning/v1/consumers/{consumerId}/portfolios/{portfolioId} | Get Portfolio by Consumer |


<a name="getMostRecentReports"></a>
# **getMostRecentReports**
> PortfolioSummary getMostRecentReports(customerId, portfolioId).execute();

Get Portfolio by Customer

Return a portfolio of most recently generated reports for each report type for the given customer. If there are multiple reports that were generated for a report type (VOA, VOI, etc.), only the most recently generated report for the type will be returned.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfoliosApi;
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
    String portfolioId = "y4zsgccj4xpw-6-port"; // A portfolio ID with the portfolio version number. Using the portfolio number without a version number will return the most recently generated reports.
    try {
      PortfolioSummary result = client
              .portfolios
              .getMostRecentReports(customerId, portfolioId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPortfolioId());
      System.out.println(result.getReports());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getMostRecentReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PortfolioSummary> response = client
              .portfolios
              .getMostRecentReports(customerId, portfolioId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getMostRecentReports");
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
| **portfolioId** | **String**| A portfolio ID with the portfolio version number. Using the portfolio number without a version number will return the most recently generated reports. | |

### Return type

[**PortfolioSummary**](PortfolioSummary.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The portfolio was successfully retrieved |  -  |

<a name="getPortfolioByConsumer"></a>
# **getPortfolioByConsumer**
> PortfolioWithConsumerSummary getPortfolioByConsumer(consumerId, portfolioId).execute();

Get Portfolio by Consumer

Return a portfolio of most recently generated reports for each report type for a given consumer. If there are multiple reports that were generated for a report type (VOA, VOI, etc.), only the most recently generated report for the type will be returned.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PortfoliosApi;
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
    String portfolioId = "y4zsgccj4xpw-6-port"; // A portfolio ID with the portfolio version number. Using the portfolio number without a version number will return the most recently generated reports.
    try {
      PortfolioWithConsumerSummary result = client
              .portfolios
              .getPortfolioByConsumer(consumerId, portfolioId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPortfolioId());
      System.out.println(result.getReports());
      System.out.println(result.getConsumer());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getPortfolioByConsumer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PortfolioWithConsumerSummary> response = client
              .portfolios
              .getPortfolioByConsumer(consumerId, portfolioId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getPortfolioByConsumer");
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
| **portfolioId** | **String**| A portfolio ID with the portfolio version number. Using the portfolio number without a version number will return the most recently generated reports. | |

### Return type

[**PortfolioWithConsumerSummary**](PortfolioWithConsumerSummary.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The portfolio was successfully retrieved |  -  |

