# ConnectApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fixUrlGeneration**](ConnectApi.md#fixUrlGeneration) | **POST** /connect/v2/generate/fix | Generate Fix Connect URL |
| [**generateJointBorrowerUrl**](ConnectApi.md#generateJointBorrowerUrl) | **POST** /connect/v2/generate/jointBorrower | Generate Connect URL - Joint Borrower |
| [**generateLiteUrl**](ConnectApi.md#generateLiteUrl) | **POST** /connect/v2/generate/lite | Generate Lite Connect URL |
| [**generateUrl**](ConnectApi.md#generateUrl) | **POST** /connect/v2/generate | Generate Connect URL |
| [**sendConnectEmail**](ConnectApi.md#sendConnectEmail) | **POST** /connect/v2/send/email | Send Connect Email |
| [**sendEmailJointBorrower**](ConnectApi.md#sendEmailJointBorrower) | **POST** /connect/v2/send/email/jointBorrower | Send Connect Email - Joint Borrower |
| [**verifyMicroEntryMicrodeposits**](ConnectApi.md#verifyMicroEntryMicrodeposits) | **POST** /connect/v2/generate/microentry/verify | Account Validation Assistant User verification of microdeposits |


<a name="fixUrlGeneration"></a>
# **fixUrlGeneration**
> ConnectUrl fixUrlGeneration(fixConnectParameters).execute();

Generate Fix Connect URL

Use the Connect Fix API when the following conditions occur: * The connection to the user&#39;s financial institution is lost * The user&#39;s credentials were updated (for any number of reasons) * The user&#39;s MFA challenge has expired  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConnectApi;
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
    String partnerId = "partnerId_example"; // Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
    String customerId = "customerId_example"; // A customer ID. See Add Customer API for how to create a customer ID.
    String institutionLoginId = "institutionLoginId_example"; // An institution login ID (from the account record)
    String language = "language_example"; // By default, the Connect application is in English. You don't need to pass this parameter unless you want to translate Connect into one of our supported languages.  * Spanish (United States): `es` * French (Canada): `fr` 
    String redirectUri = "redirectUri_example"; // The URL that customers will be redirected to after completing Finicity Connect. Required unless Connect is embedded inside our application (iframe).
    String webhook = "webhook_example"; // The publicly available URL you want to be notified with events as the user progresses through the application. See [Connect Webhook Event](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-connect/) for event details.
    String webhookContentType = "application/json"; // The content type the webhook events will be sent in. Supported types: \\\"application/json\\\" and \\\"application/xml\\\".
    Object webhookData = null; // Allows additional identifiable information to be inserted into the payload of connect webhook events. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
    Object webhookHeaders = null; // Allows additional identifiable information to be included as headers of connect webhook event. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
    String experience = "experience_example"; // The `experience` field allows you to customize: * Brand: color and logo * Icon: displayed on the \\\"Share your data\\\" page * Popular institutions: displayed on the Bank Search page * Report: the credit decisioning report to send when Connect completes. * MVS modules: financial, payroll, paystub  Note: the Finicity sales engineers (SE) help you set up a default experience for your company when you migrate to Connect 2.0. For each additional experience you create thereafter, they'll give you a unique ID. See [Generate Connect URL](https://developer.mastercard.com/open-banking-us/documentation/connect/generate-2-connect-url-apis/).  Experience values options: * \\\"default\\\": your default experience (must be defined) * GUID: the code for a different experience * Not defined: If you don't pass the experience parameter, then Connect's out of the box default experience (add accounts but no branding) is used, and the MVS modules will not run.
    Boolean singleUseUrl = true; // \\\"true\\\": The URL link expires after a Connect session successfully completes.  Note: when the `singleUseUrl` and the `experience` parameters are passed in the same call, the `singleUseUrl` value overrides the `singleUseUrl` value configured in the `experience` parameter.
    Boolean isWebView = true; // \\\"true\\\": Indicates that the Connect Session will be displayed within a WebView. Note: when the `isWebView` parameter is `true` the `redirectUri` parameter is required.
    try {
      ConnectUrl result = client
              .connect
              .fixUrlGeneration(partnerId, customerId, institutionLoginId)
              .language(language)
              .redirectUri(redirectUri)
              .webhook(webhook)
              .webhookContentType(webhookContentType)
              .webhookData(webhookData)
              .webhookHeaders(webhookHeaders)
              .experience(experience)
              .singleUseUrl(singleUseUrl)
              .isWebView(isWebView)
              .execute();
      System.out.println(result);
      System.out.println(result.getLink());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#fixUrlGeneration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConnectUrl> response = client
              .connect
              .fixUrlGeneration(partnerId, customerId, institutionLoginId)
              .language(language)
              .redirectUri(redirectUri)
              .webhook(webhook)
              .webhookContentType(webhookContentType)
              .webhookData(webhookData)
              .webhookHeaders(webhookHeaders)
              .experience(experience)
              .singleUseUrl(singleUseUrl)
              .isWebView(isWebView)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#fixUrlGeneration");
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
| **fixConnectParameters** | [**FixConnectParameters**](FixConnectParameters.md)|  | |

### Return type

[**ConnectUrl**](ConnectUrl.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The URL link was successfully generated |  -  |

<a name="generateJointBorrowerUrl"></a>
# **generateJointBorrowerUrl**
> ConnectUrl generateJointBorrowerUrl(connectJointBorrowerParameters).execute();

Generate Connect URL - Joint Borrower

Same as Connect Full (&#x60;POST /connect/v2/generate&#x60;) but for joint borrowers.  MVS prompts both the primary and joint borrower to enter each of their financial, payroll, and paystub information in the same Connect session.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConnectApi;
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
    String partnerId = "partnerId_example"; // Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
    List<Borrower> borrowers = Arrays.asList(); // (MVS) Array of borrowers to pass the primary and joint borrower's customer and consumer IDs
    String language = "language_example"; // By default, the Connect application is in English. You don't need to pass this parameter unless you want to translate Connect into one of our supported languages.  * Spanish (United States): `es` * French (Canada): `fr` 
    String redirectUri = "redirectUri_example"; // The URL that customers will be redirected to after completing Finicity Connect. Required unless Connect is embedded inside our application (iframe).
    String webhook = "webhook_example"; // The publicly available URL you want to be notified with events as the user progresses through the application. See [Connect Webhook Event](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-connect/) for event details.
    String webhookContentType = "application/json"; // The content type the webhook events will be sent in. Supported types: \\\"application/json\\\" and \\\"application/xml\\\".
    Object webhookData = null; // Allows additional identifiable information to be inserted into the payload of connect webhook events. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
    Object webhookHeaders = null; // Allows additional identifiable information to be included as headers of connect webhook event. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
    Object institutionSettings = null; // Advanced options for configuration of which institutions to display in. See [Institution Settings](https://developer.mastercard.com/open-banking-us/documentation/connect/connect-institutions-settings/).
    String experience = "experience_example"; // The `experience` field allows you to customize: * Brand: color and logo * Icon: displayed on the \\\"Share your data\\\" page * Popular institutions: displayed on the Bank Search page * Report: the credit decisioning report to send when Connect completes. * MVS modules: financial, payroll, paystub  Note: the Finicity sales engineers (SE) help you set up a default experience for your company when you migrate to Connect 2.0. For each additional experience you create thereafter, they'll give you a unique ID. See [Generate Connect URL](https://developer.mastercard.com/open-banking-us/documentation/connect/generate-2-connect-url-apis/).  Experience values options: * \\\"default\\\": your default experience (must be defined) * GUID: the code for a different experience * Not defined: If you don't pass the experience parameter, then Connect's out of the box default experience (add accounts but no branding) is used, and the MVS modules will not run.
    Long fromDate = 56L; // The `fromDate` parameter is used when experiences are associated with a credit decisioning report and any other reports with transaction data. The value is in epoch time and must be 10 digits. Example: 1494449017. If it's greater than 10 digits, then the `fromDate` is set to the credit decisioning report's default `fromDate`.  For an experience that generates multiple reports, the `fromDate` gets passed to the reports that support it.  However, Connect doesn't pass this parameter to the following reports: * Pay Statement Extraction Report * VOIE - Paystub (with TXVerify) Report * Statement Report * Verification of Income Report * VOIE - Payroll Report  Note: this field isn't used if you're only collecting transaction data without a report.
    List<ReportCustomField> reportCustomFields = Arrays.asList(); // The `reportCustomFields` parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you'd like associated with the report when it's generated. Every custom field consists of three variables: `label`, `value`, and `shown`. The `shown` variable is \\\"true\\\" or \\\"false\\\". * \\\"true\\\": (default) display the custom field in the PDF report * \\\"false\\\": don't display the custom field in the PDF report  For an experience that generates multiple reports, the `reportCustomFields` parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.
    Boolean singleUseUrl = true; // \\\"true\\\": The URL link expires after a Connect session successfully completes.  Note: when the `singleUseUrl` and the `experience` parameters are passed in the same call, the `singleUseUrl` value overrides the `singleUseUrl` value configured in the `experience` parameter.
    try {
      ConnectUrl result = client
              .connect
              .generateJointBorrowerUrl(partnerId, borrowers)
              .language(language)
              .redirectUri(redirectUri)
              .webhook(webhook)
              .webhookContentType(webhookContentType)
              .webhookData(webhookData)
              .webhookHeaders(webhookHeaders)
              .institutionSettings(institutionSettings)
              .experience(experience)
              .fromDate(fromDate)
              .reportCustomFields(reportCustomFields)
              .singleUseUrl(singleUseUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getLink());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#generateJointBorrowerUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConnectUrl> response = client
              .connect
              .generateJointBorrowerUrl(partnerId, borrowers)
              .language(language)
              .redirectUri(redirectUri)
              .webhook(webhook)
              .webhookContentType(webhookContentType)
              .webhookData(webhookData)
              .webhookHeaders(webhookHeaders)
              .institutionSettings(institutionSettings)
              .experience(experience)
              .fromDate(fromDate)
              .reportCustomFields(reportCustomFields)
              .singleUseUrl(singleUseUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#generateJointBorrowerUrl");
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
| **connectJointBorrowerParameters** | [**ConnectJointBorrowerParameters**](ConnectJointBorrowerParameters.md)|  | |

### Return type

[**ConnectUrl**](ConnectUrl.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The URL link was successfully generated |  -  |

<a name="generateLiteUrl"></a>
# **generateLiteUrl**
> ConnectUrl generateLiteUrl(liteConnectParameters).execute();

Generate Lite Connect URL

Connect Lite is a variation of Connect Full (&#x60;POST /connect/v2/generate&#x60;), which has a limited set of features. * Sign in, user&#39;s credentials, and Multi-Factor Authentication (MFA) * No user account management  The Connect Web SDK isn&#39;t a requirement when using Connect lite. However, if you want to use the SDK events, routes, and user events, then you must integrate with the Connect Web SDK.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConnectApi;
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
    String partnerId = "partnerId_example"; // Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
    String customerId = "customerId_example"; // A customer ID. See Add Customer API for how to create a customer ID.
    Long institutionId = 56L; // The ID of a financial institution, represented as a number
    String language = "language_example"; // By default, the Connect application is in English. You don't need to pass this parameter unless you want to translate Connect into one of our supported languages.  * Spanish (United States): `es` * French (Canada): `fr` 
    String redirectUri = "redirectUri_example"; // The URL that customers will be redirected to after completing Finicity Connect. Required unless Connect is embedded inside our application (iframe).
    String webhook = "webhook_example"; // The publicly available URL you want to be notified with events as the user progresses through the application. See [Connect Webhook Event](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-connect/) for event details.
    String webhookContentType = "application/json"; // The content type the webhook events will be sent in. Supported types: \\\"application/json\\\" and \\\"application/xml\\\".
    Object webhookData = null; // Allows additional identifiable information to be inserted into the payload of connect webhook events. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
    Object webhookHeaders = null; // Allows additional identifiable information to be included as headers of connect webhook event. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
    String experience = "experience_example"; // The `experience` field allows you to customize: * Brand: color and logo * Icon: displayed on the \\\"Share your data\\\" page * Popular institutions: displayed on the Bank Search page * Report: the credit decisioning report to send when Connect completes. * MVS modules: financial, payroll, paystub  Note: the Finicity sales engineers (SE) help you set up a default experience for your company when you migrate to Connect 2.0. For each additional experience you create thereafter, they'll give you a unique ID. See [Generate Connect URL](https://developer.mastercard.com/open-banking-us/documentation/connect/generate-2-connect-url-apis/).  Experience values options: * \\\"default\\\": your default experience (must be defined) * GUID: the code for a different experience * Not defined: If you don't pass the experience parameter, then Connect's out of the box default experience (add accounts but no branding) is used, and the MVS modules will not run.
    Boolean singleUseUrl = true; // \\\"true\\\": The URL link expires after a Connect session successfully completes.  Note: when the `singleUseUrl` and the `experience` parameters are passed in the same call, the `singleUseUrl` value overrides the `singleUseUrl` value configured in the `experience` parameter.
    Boolean isWebView = true; // \\\"true\\\": Indicates that the Connect Session will be displayed within a WebView. Note: when the `isWebView` parameter is `true` the `redirectUri` parameter is required.
    try {
      ConnectUrl result = client
              .connect
              .generateLiteUrl(partnerId, customerId, institutionId)
              .language(language)
              .redirectUri(redirectUri)
              .webhook(webhook)
              .webhookContentType(webhookContentType)
              .webhookData(webhookData)
              .webhookHeaders(webhookHeaders)
              .experience(experience)
              .singleUseUrl(singleUseUrl)
              .isWebView(isWebView)
              .execute();
      System.out.println(result);
      System.out.println(result.getLink());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#generateLiteUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConnectUrl> response = client
              .connect
              .generateLiteUrl(partnerId, customerId, institutionId)
              .language(language)
              .redirectUri(redirectUri)
              .webhook(webhook)
              .webhookContentType(webhookContentType)
              .webhookData(webhookData)
              .webhookHeaders(webhookHeaders)
              .experience(experience)
              .singleUseUrl(singleUseUrl)
              .isWebView(isWebView)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#generateLiteUrl");
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
| **liteConnectParameters** | [**LiteConnectParameters**](LiteConnectParameters.md)|  | |

### Return type

[**ConnectUrl**](ConnectUrl.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The URL link was successfully generated |  -  |

<a name="generateUrl"></a>
# **generateUrl**
> ConnectUrl generateUrl(connectParameters).execute();

Generate Connect URL

Generate a Connect 2.0 URL link to add within your own applications.  Optional Parameters: * &#x60;experience&#x60;: Configure different customer experiences per Connect session by changing the brand, color, logo, icon, the type of credit decisioning report to generate after the session ends, and more. * &#x60;language&#x60;: By default, the Connect application is in English. You don&#39;t need to pass  this parameter unless you want to translate Connect into one of our supported languages.    * Spanish (United States)   * French (Canada)   MVS Developers: You can pre-populate the consumer&#39;s SSN on the Find employment records page at the beginning of the MVS payroll app. Pass the SSN value for the consumer in the body of the request call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConnectApi;
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
    String partnerId = "partnerId_example"; // Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
    String customerId = "customerId_example"; // A customer ID. See Add Customer API for how to create a customer ID.
    String language = "language_example"; // By default, the Connect application is in English. You don't need to pass this parameter unless you want to translate Connect into one of our supported languages.  * Spanish (United States): `es` * French (Canada): `fr` 
    String consumerId = "consumerId_example"; // A consumer ID. See Create Consumer API for how to create a consumer ID.
    String redirectUri = "redirectUri_example"; // The URL that customers will be redirected to after completing Finicity Connect. Required unless Connect is embedded inside our application (iframe).
    String webhook = "webhook_example"; // The publicly available URL you want to be notified with events as the user progresses through the application. See [Connect Webhook Event](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-connect/) for event details.
    String webhookContentType = "application/json"; // The content type the webhook events will be sent in. Supported types: \\\"application/json\\\" and \\\"application/xml\\\".
    Object webhookData = null; // Allows additional identifiable information to be inserted into the payload of connect webhook events. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
    Object webhookHeaders = null; // Allows additional identifiable information to be included as headers of connect webhook event. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
    ConsumerInfo optionalConsumerInfo = new ConsumerInfo();
    Boolean singleUseUrl = true; // \\\"true\\\": The URL link expires after a Connect session successfully completes.  Note: when the `singleUseUrl` and the `experience` parameters are passed in the same call, the `singleUseUrl` value overrides the `singleUseUrl` value configured in the `experience` parameter.
    String experience = "experience_example"; // The `experience` field allows you to customize: * Brand: color and logo * Icon: displayed on the \\\"Share your data\\\" page * Popular institutions: displayed on the Bank Search page * Report: the credit decisioning report to send when Connect completes. * MVS modules: financial, payroll, paystub  Note: the Finicity sales engineers (SE) help you set up a default experience for your company when you migrate to Connect 2.0. For each additional experience you create thereafter, they'll give you a unique ID. See [Generate Connect URL](https://developer.mastercard.com/open-banking-us/documentation/connect/generate-2-connect-url-apis/).  Experience values options: * \\\"default\\\": your default experience (must be defined) * GUID: the code for a different experience * Not defined: If you don't pass the experience parameter, then Connect's out of the box default experience (add accounts but no branding) is used, and the MVS modules will not run.
    Object institutionSettings = null; // Advanced options for configuration of which institutions to display in. See [Institution Settings](https://developer.mastercard.com/open-banking-us/documentation/connect/connect-institutions-settings/).
    Long fromDate = 56L; // The `fromDate` parameter is used when experiences are associated with a credit decisioning report and any other reports with transaction data. The value is in epoch time and must be 10 digits. Example: 1494449017. If it's greater than 10 digits, then the `fromDate` is set to the credit decisioning report's default `fromDate`.  For an experience that generates multiple reports, the `fromDate` gets passed to the reports that support it.  However, Connect doesn't pass this parameter to the following reports: * Pay Statement Extraction Report * VOIE - Paystub (with TXVerify) Report * Statement Report * Verification of Income Report * VOIE - Payroll Report  Note: this field isn't used if you're only collecting transaction data without a report.
    List<ReportCustomField> reportCustomFields = Arrays.asList(); // The `reportCustomFields` parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you'd like associated with the report when it's generated. Every custom field consists of three variables: `label`, `value`, and `shown`. The `shown` variable is \\\"true\\\" or \\\"false\\\". * \\\"true\\\": (default) display the custom field in the PDF report * \\\"false\\\": don't display the custom field in the PDF report  For an experience that generates multiple reports, the `reportCustomFields` parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.
    Boolean isWebView = true; // \\\"true\\\": Indicates that the Connect Session will be displayed within a WebView. Note: when the `isWebView` parameter is `true` the `redirectUri` parameter is required.
    try {
      ConnectUrl result = client
              .connect
              .generateUrl(partnerId, customerId)
              .language(language)
              .consumerId(consumerId)
              .redirectUri(redirectUri)
              .webhook(webhook)
              .webhookContentType(webhookContentType)
              .webhookData(webhookData)
              .webhookHeaders(webhookHeaders)
              .optionalConsumerInfo(optionalConsumerInfo)
              .singleUseUrl(singleUseUrl)
              .experience(experience)
              .institutionSettings(institutionSettings)
              .fromDate(fromDate)
              .reportCustomFields(reportCustomFields)
              .isWebView(isWebView)
              .execute();
      System.out.println(result);
      System.out.println(result.getLink());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#generateUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConnectUrl> response = client
              .connect
              .generateUrl(partnerId, customerId)
              .language(language)
              .consumerId(consumerId)
              .redirectUri(redirectUri)
              .webhook(webhook)
              .webhookContentType(webhookContentType)
              .webhookData(webhookData)
              .webhookHeaders(webhookHeaders)
              .optionalConsumerInfo(optionalConsumerInfo)
              .singleUseUrl(singleUseUrl)
              .experience(experience)
              .institutionSettings(institutionSettings)
              .fromDate(fromDate)
              .reportCustomFields(reportCustomFields)
              .isWebView(isWebView)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#generateUrl");
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
| **connectParameters** | [**ConnectParameters**](ConnectParameters.md)|  | |

### Return type

[**ConnectUrl**](ConnectUrl.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The URL link was successfully generated |  -  |

<a name="sendConnectEmail"></a>
# **sendConnectEmail**
> ConnectEmailUrl sendConnectEmail(connectEmailParameters).execute();

Send Connect Email

Same as Connect Full (&#x60;POST /connect/v2/generate&#x60;) but send a Connect email to a consumer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConnectApi;
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
    String partnerId = "partnerId_example"; // Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
    String customerId = "customerId_example"; // A customer ID. See Add Customer API for how to create a customer ID.
    String consumerId = "consumerId_example"; // A consumer ID. See Create Consumer API for how to create a consumer ID.
    EmailOptions email = new EmailOptions();
    String language = "language_example"; // By default, the Connect application is in English. You don't need to pass this parameter unless you want to translate Connect into one of our supported languages.  * Spanish (United States): `es` * French (Canada): `fr` 
    String redirectUri = "redirectUri_example"; // The URL that customers will be redirected to after completing Finicity Connect. Required unless Connect is embedded inside our application (iframe).
    String webhook = "webhook_example"; // The publicly available URL you want to be notified with events as the user progresses through the application. See [Connect Webhook Event](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-connect/) for event details.
    String webhookContentType = "application/json"; // The content type the webhook events will be sent in. Supported types: \\\"application/json\\\" and \\\"application/xml\\\".
    Object webhookData = null; // Allows additional identifiable information to be inserted into the payload of connect webhook events. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
    Object webhookHeaders = null; // Allows additional identifiable information to be included as headers of connect webhook event. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
    Object institutionSettings = null; // Advanced options for configuration of which institutions to display in. See [Institution Settings](https://developer.mastercard.com/open-banking-us/documentation/connect/connect-institutions-settings/).
    String experience = "experience_example"; // The `experience` field allows you to customize: * Brand: color and logo * Icon: displayed on the \\\"Share your data\\\" page * Popular institutions: displayed on the Bank Search page * Report: the credit decisioning report to send when Connect completes. * MVS modules: financial, payroll, paystub  Note: the Finicity sales engineers (SE) help you set up a default experience for your company when you migrate to Connect 2.0. For each additional experience you create thereafter, they'll give you a unique ID. See [Generate Connect URL](https://developer.mastercard.com/open-banking-us/documentation/connect/generate-2-connect-url-apis/).  Experience values options: * \\\"default\\\": your default experience (must be defined) * GUID: the code for a different experience * Not defined: If you don't pass the experience parameter, then Connect's out of the box default experience (add accounts but no branding) is used, and the MVS modules will not run.
    Boolean singleUseUrl = true; // \\\"true\\\": The URL link expires after a Connect session successfully completes.  Note: when the `singleUseUrl` and the `experience` parameters are passed in the same call, the `singleUseUrl` value overrides the `singleUseUrl` value configured in the `experience` parameter.
    Long fromDate = 56L; // The `fromDate` parameter is used when experiences are associated with a credit decisioning report and any other reports with transaction data. The value is in epoch time and must be 10 digits. Example: 1494449017. If it's greater than 10 digits, then the `fromDate` is set to the credit decisioning report's default `fromDate`.  For an experience that generates multiple reports, the `fromDate` gets passed to the reports that support it.  However, Connect doesn't pass this parameter to the following reports: * Pay Statement Extraction Report * VOIE - Paystub (with TXVerify) Report * Statement Report * Verification of Income Report * VOIE - Payroll Report  Note: this field isn't used if you're only collecting transaction data without a report.
    List<ReportCustomField> reportCustomFields = Arrays.asList(); // The `reportCustomFields` parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you'd like associated with the report when it's generated. Every custom field consists of three variables: `label`, `value`, and `shown`. The `shown` variable is \\\"true\\\" or \\\"false\\\". * \\\"true\\\": (default) display the custom field in the PDF report * \\\"false\\\": don't display the custom field in the PDF report  For an experience that generates multiple reports, the `reportCustomFields` parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.
    ConsumerInfo optionalConsumerInfo = new ConsumerInfo();
    try {
      ConnectEmailUrl result = client
              .connect
              .sendConnectEmail(partnerId, customerId, consumerId, email)
              .language(language)
              .redirectUri(redirectUri)
              .webhook(webhook)
              .webhookContentType(webhookContentType)
              .webhookData(webhookData)
              .webhookHeaders(webhookHeaders)
              .institutionSettings(institutionSettings)
              .experience(experience)
              .singleUseUrl(singleUseUrl)
              .fromDate(fromDate)
              .reportCustomFields(reportCustomFields)
              .optionalConsumerInfo(optionalConsumerInfo)
              .execute();
      System.out.println(result);
      System.out.println(result.getLink());
      System.out.println(result.getEmailConfig());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#sendConnectEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConnectEmailUrl> response = client
              .connect
              .sendConnectEmail(partnerId, customerId, consumerId, email)
              .language(language)
              .redirectUri(redirectUri)
              .webhook(webhook)
              .webhookContentType(webhookContentType)
              .webhookData(webhookData)
              .webhookHeaders(webhookHeaders)
              .institutionSettings(institutionSettings)
              .experience(experience)
              .singleUseUrl(singleUseUrl)
              .fromDate(fromDate)
              .reportCustomFields(reportCustomFields)
              .optionalConsumerInfo(optionalConsumerInfo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#sendConnectEmail");
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
| **connectEmailParameters** | [**ConnectEmailParameters**](ConnectEmailParameters.md)|  | |

### Return type

[**ConnectEmailUrl**](ConnectEmailUrl.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The URL link was successfully generated and the email sent |  -  |

<a name="sendEmailJointBorrower"></a>
# **sendEmailJointBorrower**
> ConnectEmailUrl sendEmailJointBorrower(connectJointBorrowerEmailParameters).execute();

Send Connect Email - Joint Borrower

Same as Connect Joint Borrower (&#x60;POST /connect/v2/generate/jointBorrower&#x60;) but send a Connect email  to at least one of the joint borrower&#39;s email addresses.  When the consumer opens the email, MVS prompts both the primary and joint borrower to enter each of their financial, payroll, and paystub information in the same Connect session.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConnectApi;
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
    String partnerId = "partnerId_example"; // Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
    List<Borrower> borrowers = Arrays.asList(); // (MVS) Array of borrowers to pass the primary and joint borrower's customer and consumer IDs
    EmailOptions email = new EmailOptions();
    String experience = "experience_example"; // The `experience` field allows you to customize: * Brand: color and logo * Icon: displayed on the \\\"Share your data\\\" page * Popular institutions: displayed on the Bank Search page * Report: the credit decisioning report to send when Connect completes. * MVS modules: financial, payroll, paystub  Note: the Finicity sales engineers (SE) help you set up a default experience for your company when you migrate to Connect 2.0. For each additional experience you create thereafter, they'll give you a unique ID. See [Generate Connect URL](https://developer.mastercard.com/open-banking-us/documentation/connect/generate-2-connect-url-apis/).  Experience values options: * \\\"default\\\": your default experience (must be defined) * GUID: the code for a different experience * Not defined: If you don't pass the experience parameter, then Connect's out of the box default experience (add accounts but no branding) is used, and the MVS modules will not run.
    String language = "language_example"; // By default, the Connect application is in English. You don't need to pass this parameter unless you want to translate Connect into one of our supported languages.  * Spanish (United States): `es` * French (Canada): `fr` 
    String redirectUri = "redirectUri_example"; // The URL that customers will be redirected to after completing Finicity Connect. Required unless Connect is embedded inside our application (iframe).
    String webhook = "webhook_example"; // The publicly available URL you want to be notified with events as the user progresses through the application. See [Connect Webhook Event](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-connect/) for event details.
    String webhookContentType = "application/json"; // The content type the webhook events will be sent in. Supported types: \\\"application/json\\\" and \\\"application/xml\\\".
    Object webhookData = null; // Allows additional identifiable information to be inserted into the payload of connect webhook events. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
    Object webhookHeaders = null; // Allows additional identifiable information to be included as headers of connect webhook event. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
    Object institutionSettings = null; // Advanced options for configuration of which institutions to display in. See [Institution Settings](https://developer.mastercard.com/open-banking-us/documentation/connect/connect-institutions-settings/).
    Long fromDate = 56L; // The `fromDate` parameter is used when experiences are associated with a credit decisioning report and any other reports with transaction data. The value is in epoch time and must be 10 digits. Example: 1494449017. If it's greater than 10 digits, then the `fromDate` is set to the credit decisioning report's default `fromDate`.  For an experience that generates multiple reports, the `fromDate` gets passed to the reports that support it.  However, Connect doesn't pass this parameter to the following reports: * Pay Statement Extraction Report * VOIE - Paystub (with TXVerify) Report * Statement Report * Verification of Income Report * VOIE - Payroll Report  Note: this field isn't used if you're only collecting transaction data without a report.
    List<ReportCustomField> reportCustomFields = Arrays.asList(); // The `reportCustomFields` parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you'd like associated with the report when it's generated. Every custom field consists of three variables: `label`, `value`, and `shown`. The `shown` variable is \\\"true\\\" or \\\"false\\\". * \\\"true\\\": (default) display the custom field in the PDF report * \\\"false\\\": don't display the custom field in the PDF report  For an experience that generates multiple reports, the `reportCustomFields` parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.
    Boolean singleUseUrl = true; // \\\"true\\\": The URL link expires after a Connect session successfully completes.  Note: when the `singleUseUrl` and the `experience` parameters are passed in the same call, the `singleUseUrl` value overrides the `singleUseUrl` value configured in the `experience` parameter.
    try {
      ConnectEmailUrl result = client
              .connect
              .sendEmailJointBorrower(partnerId, borrowers, email, experience)
              .language(language)
              .redirectUri(redirectUri)
              .webhook(webhook)
              .webhookContentType(webhookContentType)
              .webhookData(webhookData)
              .webhookHeaders(webhookHeaders)
              .institutionSettings(institutionSettings)
              .fromDate(fromDate)
              .reportCustomFields(reportCustomFields)
              .singleUseUrl(singleUseUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getLink());
      System.out.println(result.getEmailConfig());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#sendEmailJointBorrower");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConnectEmailUrl> response = client
              .connect
              .sendEmailJointBorrower(partnerId, borrowers, email, experience)
              .language(language)
              .redirectUri(redirectUri)
              .webhook(webhook)
              .webhookContentType(webhookContentType)
              .webhookData(webhookData)
              .webhookHeaders(webhookHeaders)
              .institutionSettings(institutionSettings)
              .fromDate(fromDate)
              .reportCustomFields(reportCustomFields)
              .singleUseUrl(singleUseUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#sendEmailJointBorrower");
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
| **connectJointBorrowerEmailParameters** | [**ConnectJointBorrowerEmailParameters**](ConnectJointBorrowerEmailParameters.md)|  | |

### Return type

[**ConnectEmailUrl**](ConnectEmailUrl.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The URL link was successfully generated and the email sent |  -  |

<a name="verifyMicroEntryMicrodeposits"></a>
# **verifyMicroEntryMicrodeposits**
> ConnectUrl verifyMicroEntryMicrodeposits(microEntryVerifyRequestParameter).execute();

Account Validation Assistant User verification of microdeposits

The UI re-engages the consumer to enter two microdeposit amounts found in their account and validates them.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConnectApi;
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
    String partnerId = "partnerId_example"; // Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
    String customerId = "customerId_example"; // A customer ID. See Add Customer API for how to create a customer ID.
    String redirectUri = "redirectUri_example"; // The URL that customers will be redirected to after completing Finicity Connect. Required unless Connect is embedded inside our application (iframe).
    String webhook = "webhook_example"; // The publicly available URL you want to be notified with events as the user progresses through the application. See [Connect Webhook Event](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-connect/) for event details.
    String webhookContentType = "application/json"; // The content type the webhook events will be sent in. Supported types: \\\"application/json\\\" and \\\"application/xml\\\".
    Object webhookData = null; // Allows additional identifiable information to be inserted into the payload of connect webhook events. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
    Object webhookHeaders = null; // Allows additional identifiable information to be included as headers of connect webhook event. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
    String experience = "experience_example"; // The `experience` field allows you to customize: * Brand: color and logo * Icon: displayed on the \\\"Share your data\\\" page * Popular institutions: displayed on the Bank Search page * Report: the credit decisioning report to send when Connect completes. * MVS modules: financial, payroll, paystub  Note: the Finicity sales engineers (SE) help you set up a default experience for your company when you migrate to Connect 2.0. For each additional experience you create thereafter, they'll give you a unique ID. See [Generate Connect URL](https://developer.mastercard.com/open-banking-us/documentation/connect/generate-2-connect-url-apis/).  Experience values options: * \\\"default\\\": your default experience (must be defined) * GUID: the code for a different experience * Not defined: If you don't pass the experience parameter, then Connect's out of the box default experience (add accounts but no branding) is used, and the MVS modules will not run.
    String accountId = "accountId_example"; // An account ID
    try {
      ConnectUrl result = client
              .connect
              .verifyMicroEntryMicrodeposits()
              .partnerId(partnerId)
              .customerId(customerId)
              .redirectUri(redirectUri)
              .webhook(webhook)
              .webhookContentType(webhookContentType)
              .webhookData(webhookData)
              .webhookHeaders(webhookHeaders)
              .experience(experience)
              .accountId(accountId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLink());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#verifyMicroEntryMicrodeposits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConnectUrl> response = client
              .connect
              .verifyMicroEntryMicrodeposits()
              .partnerId(partnerId)
              .customerId(customerId)
              .redirectUri(redirectUri)
              .webhook(webhook)
              .webhookContentType(webhookContentType)
              .webhookData(webhookData)
              .webhookHeaders(webhookHeaders)
              .experience(experience)
              .accountId(accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#verifyMicroEntryMicrodeposits");
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
| **microEntryVerifyRequestParameter** | [**MicroEntryVerifyRequestParameter**](MicroEntryVerifyRequestParameter.md)|  | |

### Return type

[**ConnectUrl**](ConnectUrl.md)

### Authorization

[FinicityAppKey](../README.md#FinicityAppKey), [FinicityAppToken](../README.md#FinicityAppToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The URL link was successfully generated |  -  |

