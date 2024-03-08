# PayStatementsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**uploadForCustomer**](PayStatementsApi.md#uploadForCustomer) | **POST** /aggregation/v1/customers/{customerId}/payStatements | Store Customer Pay Statement |


<a name="uploadForCustomer"></a>
# **uploadForCustomer**
> Asset uploadForCustomer(customerId, payStatement).execute();

Store Customer Pay Statement

Upload pay statements for a customer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayStatementsApi;
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
    String label = "label_example"; // The label to be associated with the pay statement. This label will allow the paystub to go through data extraction. * `lastPayPeriod`: default label that should be used for the VOIE - Paystub products * `lastPayPeriodMinusOne`: the second most recent pay statement * `lastPayPeriodMinusTwo`: the third most recent pay statement * `previousYearLastPayPeriod` Last pay statement of the previous calendar year * `previousYear2LastPayPeriod`: last pay statement of the calendar year 2 years prior * `earliestPayPeriod`: the earliest pay statement
    String statement = "statement_example"; // A Base64 encoded pay statement file. Finicity supports PDF, JPG, or PNG files.
    String customerId = "1005061234"; // A customer ID
    try {
      Asset result = client
              .payStatements
              .uploadForCustomer(label, statement, customerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssetId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayStatementsApi#uploadForCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Asset> response = client
              .payStatements
              .uploadForCustomer(label, statement, customerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayStatementsApi#uploadForCustomer");
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
| **payStatement** | [**PayStatement**](PayStatement.md)|  | |

### Return type

[**Asset**](Asset.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The pay statement was successfully uploaded |  -  |

