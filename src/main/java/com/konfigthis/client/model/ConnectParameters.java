/*
 * Open Banking
 * OpenAPI specification for Finicity APIs.  Open Banking solutions in the US are provided by Finicity, a Mastercard company.
 *
 * The version of the OpenAPI document: 1.16.0
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.ConsumerInfo;
import com.konfigthis.client.model.ReportCustomField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * ConnectParameters
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ConnectParameters {
  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partnerId";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_CONSUMER_ID = "consumerId";
  @SerializedName(SERIALIZED_NAME_CONSUMER_ID)
  private String consumerId;

  public static final String SERIALIZED_NAME_REDIRECT_URI = "redirectUri";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URI)
  private String redirectUri;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;

  public static final String SERIALIZED_NAME_WEBHOOK_CONTENT_TYPE = "webhookContentType";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CONTENT_TYPE)
  private String webhookContentType = "application/json";

  public static final String SERIALIZED_NAME_WEBHOOK_DATA = "webhookData";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_DATA)
  private Object webhookData;

  public static final String SERIALIZED_NAME_WEBHOOK_HEADERS = "webhookHeaders";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_HEADERS)
  private Object webhookHeaders;

  public static final String SERIALIZED_NAME_OPTIONAL_CONSUMER_INFO = "optionalConsumerInfo";
  @SerializedName(SERIALIZED_NAME_OPTIONAL_CONSUMER_INFO)
  private ConsumerInfo optionalConsumerInfo;

  public static final String SERIALIZED_NAME_SINGLE_USE_URL = "singleUseUrl";
  @SerializedName(SERIALIZED_NAME_SINGLE_USE_URL)
  private Boolean singleUseUrl;

  public static final String SERIALIZED_NAME_EXPERIENCE = "experience";
  @SerializedName(SERIALIZED_NAME_EXPERIENCE)
  private String experience;

  public static final String SERIALIZED_NAME_INSTITUTION_SETTINGS = "institutionSettings";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_SETTINGS)
  private Object institutionSettings;

  public static final String SERIALIZED_NAME_FROM_DATE = "fromDate";
  @SerializedName(SERIALIZED_NAME_FROM_DATE)
  private Long fromDate;

  public static final String SERIALIZED_NAME_REPORT_CUSTOM_FIELDS = "reportCustomFields";
  @SerializedName(SERIALIZED_NAME_REPORT_CUSTOM_FIELDS)
  private List<ReportCustomField> reportCustomFields = null;

  public static final String SERIALIZED_NAME_IS_WEB_VIEW = "isWebView";
  @SerializedName(SERIALIZED_NAME_IS_WEB_VIEW)
  private Boolean isWebView;

  public ConnectParameters() {
  }

  public ConnectParameters language(String language) {
    
    
    
    
    this.language = language;
    return this;
  }

   /**
   * By default, the Connect application is in English. You don&#39;t need to pass this parameter unless you want to translate Connect into one of our supported languages.  * Spanish (United States): &#x60;es&#x60; * French (Canada): &#x60;fr&#x60; 
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "es", value = "By default, the Connect application is in English. You don't need to pass this parameter unless you want to translate Connect into one of our supported languages.  * Spanish (United States): `es` * French (Canada): `fr` ")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    
    
    
    this.language = language;
  }


  public ConnectParameters partnerId(String partnerId) {
    
    
    
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
   * @return partnerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1234583871234", required = true, value = "Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    
    
    
    this.partnerId = partnerId;
  }


  public ConnectParameters customerId(String customerId) {
    
    
    
    
    this.customerId = customerId;
    return this;
  }

   /**
   * A customer ID. See Add Customer API for how to create a customer ID.
   * @return customerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1005061234", required = true, value = "A customer ID. See Add Customer API for how to create a customer ID.")

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    
    
    
    this.customerId = customerId;
  }


  public ConnectParameters consumerId(String consumerId) {
    
    
    
    
    this.consumerId = consumerId;
    return this;
  }

   /**
   * A consumer ID. See Create Consumer API for how to create a consumer ID.
   * @return consumerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0bf46322c167b562e6cbed9d40e19a4c", value = "A consumer ID. See Create Consumer API for how to create a consumer ID.")

  public String getConsumerId() {
    return consumerId;
  }


  public void setConsumerId(String consumerId) {
    
    
    
    this.consumerId = consumerId;
  }


  public ConnectParameters redirectUri(String redirectUri) {
    
    
    
    
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * The URL that customers will be redirected to after completing Finicity Connect. Required unless Connect is embedded inside our application (iframe).
   * @return redirectUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.finicity.com/connect/", value = "The URL that customers will be redirected to after completing Finicity Connect. Required unless Connect is embedded inside our application (iframe).")

  public String getRedirectUri() {
    return redirectUri;
  }


  public void setRedirectUri(String redirectUri) {
    
    
    
    this.redirectUri = redirectUri;
  }


  public ConnectParameters webhook(String webhook) {
    
    
    
    
    this.webhook = webhook;
    return this;
  }

   /**
   * The publicly available URL you want to be notified with events as the user progresses through the application. See [Connect Webhook Event](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-connect/) for event details.
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://webhook.site/8d4421a7-d1d1-4f01-bb08-5370aff0321b", value = "The publicly available URL you want to be notified with events as the user progresses through the application. See [Connect Webhook Event](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-connect/) for event details.")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    
    
    
    this.webhook = webhook;
  }


  public ConnectParameters webhookContentType(String webhookContentType) {
    
    
    
    
    this.webhookContentType = webhookContentType;
    return this;
  }

   /**
   * The content type the webhook events will be sent in. Supported types: \&quot;application/json\&quot; and \&quot;application/xml\&quot;.
   * @return webhookContentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "application/json", value = "The content type the webhook events will be sent in. Supported types: \"application/json\" and \"application/xml\".")

  public String getWebhookContentType() {
    return webhookContentType;
  }


  public void setWebhookContentType(String webhookContentType) {
    
    
    
    this.webhookContentType = webhookContentType;
  }


  public ConnectParameters webhookData(Object webhookData) {
    
    
    
    
    this.webhookData = webhookData;
    return this;
  }

   /**
   * Allows additional identifiable information to be inserted into the payload of connect webhook events. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
   * @return webhookData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows additional identifiable information to be inserted into the payload of connect webhook events. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).")

  public Object getWebhookData() {
    return webhookData;
  }


  public void setWebhookData(Object webhookData) {
    
    
    
    this.webhookData = webhookData;
  }


  public ConnectParameters webhookHeaders(Object webhookHeaders) {
    
    
    
    
    this.webhookHeaders = webhookHeaders;
    return this;
  }

   /**
   * Allows additional identifiable information to be included as headers of connect webhook event. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).
   * @return webhookHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows additional identifiable information to be included as headers of connect webhook event. See: [Custom Webhooks](https://developer.mastercard.com/open-banking-us/documentation/webhooks/webhooks-custom/).")

  public Object getWebhookHeaders() {
    return webhookHeaders;
  }


  public void setWebhookHeaders(Object webhookHeaders) {
    
    
    
    this.webhookHeaders = webhookHeaders;
  }


  public ConnectParameters optionalConsumerInfo(ConsumerInfo optionalConsumerInfo) {
    
    
    
    
    this.optionalConsumerInfo = optionalConsumerInfo;
    return this;
  }

   /**
   * Get optionalConsumerInfo
   * @return optionalConsumerInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsumerInfo getOptionalConsumerInfo() {
    return optionalConsumerInfo;
  }


  public void setOptionalConsumerInfo(ConsumerInfo optionalConsumerInfo) {
    
    
    
    this.optionalConsumerInfo = optionalConsumerInfo;
  }


  public ConnectParameters singleUseUrl(Boolean singleUseUrl) {
    
    
    
    
    this.singleUseUrl = singleUseUrl;
    return this;
  }

   /**
   * \&quot;true\&quot;: The URL link expires after a Connect session successfully completes.  Note: when the &#x60;singleUseUrl&#x60; and the &#x60;experience&#x60; parameters are passed in the same call, the &#x60;singleUseUrl&#x60; value overrides the &#x60;singleUseUrl&#x60; value configured in the &#x60;experience&#x60; parameter.
   * @return singleUseUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "\"true\": The URL link expires after a Connect session successfully completes.  Note: when the `singleUseUrl` and the `experience` parameters are passed in the same call, the `singleUseUrl` value overrides the `singleUseUrl` value configured in the `experience` parameter.")

  public Boolean getSingleUseUrl() {
    return singleUseUrl;
  }


  public void setSingleUseUrl(Boolean singleUseUrl) {
    
    
    
    this.singleUseUrl = singleUseUrl;
  }


  public ConnectParameters experience(String experience) {
    
    
    
    
    this.experience = experience;
    return this;
  }

   /**
   * The &#x60;experience&#x60; field allows you to customize: * Brand: color and logo * Icon: displayed on the \&quot;Share your data\&quot; page * Popular institutions: displayed on the Bank Search page * Report: the credit decisioning report to send when Connect completes. * MVS modules: financial, payroll, paystub  Note: the Finicity sales engineers (SE) help you set up a default experience for your company when you migrate to Connect 2.0. For each additional experience you create thereafter, they&#39;ll give you a unique ID. See [Generate Connect URL](https://developer.mastercard.com/open-banking-us/documentation/connect/generate-2-connect-url-apis/).  Experience values options: * \&quot;default\&quot;: your default experience (must be defined) * GUID: the code for a different experience * Not defined: If you don&#39;t pass the experience parameter, then Connect&#39;s out of the box default experience (add accounts but no branding) is used, and the MVS modules will not run.
   * @return experience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "default", value = "The `experience` field allows you to customize: * Brand: color and logo * Icon: displayed on the \"Share your data\" page * Popular institutions: displayed on the Bank Search page * Report: the credit decisioning report to send when Connect completes. * MVS modules: financial, payroll, paystub  Note: the Finicity sales engineers (SE) help you set up a default experience for your company when you migrate to Connect 2.0. For each additional experience you create thereafter, they'll give you a unique ID. See [Generate Connect URL](https://developer.mastercard.com/open-banking-us/documentation/connect/generate-2-connect-url-apis/).  Experience values options: * \"default\": your default experience (must be defined) * GUID: the code for a different experience * Not defined: If you don't pass the experience parameter, then Connect's out of the box default experience (add accounts but no branding) is used, and the MVS modules will not run.")

  public String getExperience() {
    return experience;
  }


  public void setExperience(String experience) {
    
    
    
    this.experience = experience;
  }


  public ConnectParameters institutionSettings(Object institutionSettings) {
    
    
    
    
    this.institutionSettings = institutionSettings;
    return this;
  }

   /**
   * Advanced options for configuration of which institutions to display in. See [Institution Settings](https://developer.mastercard.com/open-banking-us/documentation/connect/connect-institutions-settings/).
   * @return institutionSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Advanced options for configuration of which institutions to display in. See [Institution Settings](https://developer.mastercard.com/open-banking-us/documentation/connect/connect-institutions-settings/).")

  public Object getInstitutionSettings() {
    return institutionSettings;
  }


  public void setInstitutionSettings(Object institutionSettings) {
    
    
    
    this.institutionSettings = institutionSettings;
  }


  public ConnectParameters fromDate(Long fromDate) {
    
    
    
    
    this.fromDate = fromDate;
    return this;
  }

   /**
   * The &#x60;fromDate&#x60; parameter is used when experiences are associated with a credit decisioning report and any other reports with transaction data. The value is in epoch time and must be 10 digits. Example: 1494449017. If it&#39;s greater than 10 digits, then the &#x60;fromDate&#x60; is set to the credit decisioning report&#39;s default &#x60;fromDate&#x60;.  For an experience that generates multiple reports, the &#x60;fromDate&#x60; gets passed to the reports that support it.  However, Connect doesn&#39;t pass this parameter to the following reports: * Pay Statement Extraction Report * VOIE - Paystub (with TXVerify) Report * Statement Report * Verification of Income Report * VOIE - Payroll Report  Note: this field isn&#39;t used if you&#39;re only collecting transaction data without a report.
   * @return fromDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1607450357", value = "The `fromDate` parameter is used when experiences are associated with a credit decisioning report and any other reports with transaction data. The value is in epoch time and must be 10 digits. Example: 1494449017. If it's greater than 10 digits, then the `fromDate` is set to the credit decisioning report's default `fromDate`.  For an experience that generates multiple reports, the `fromDate` gets passed to the reports that support it.  However, Connect doesn't pass this parameter to the following reports: * Pay Statement Extraction Report * VOIE - Paystub (with TXVerify) Report * Statement Report * Verification of Income Report * VOIE - Payroll Report  Note: this field isn't used if you're only collecting transaction data without a report.")

  public Long getFromDate() {
    return fromDate;
  }


  public void setFromDate(Long fromDate) {
    
    
    
    this.fromDate = fromDate;
  }


  public ConnectParameters reportCustomFields(List<ReportCustomField> reportCustomFields) {
    
    
    
    
    this.reportCustomFields = reportCustomFields;
    return this;
  }

  public ConnectParameters addReportCustomFieldsItem(ReportCustomField reportCustomFieldsItem) {
    if (this.reportCustomFields == null) {
      this.reportCustomFields = new ArrayList<>();
    }
    this.reportCustomFields.add(reportCustomFieldsItem);
    return this;
  }

   /**
   * The &#x60;reportCustomFields&#x60; parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you&#39;d like associated with the report when it&#39;s generated. Every custom field consists of three variables: &#x60;label&#x60;, &#x60;value&#x60;, and &#x60;shown&#x60;. The &#x60;shown&#x60; variable is \&quot;true\&quot; or \&quot;false\&quot;. * \&quot;true\&quot;: (default) display the custom field in the PDF report * \&quot;false\&quot;: don&#39;t display the custom field in the PDF report  For an experience that generates multiple reports, the &#x60;reportCustomFields&#x60; parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.
   * @return reportCustomFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `reportCustomFields` parameter is used when experiences are associated with a credit decisioning report.  Designate up to 5 custom fields that you'd like associated with the report when it's generated. Every custom field consists of three variables: `label`, `value`, and `shown`. The `shown` variable is \"true\" or \"false\". * \"true\": (default) display the custom field in the PDF report * \"false\": don't display the custom field in the PDF report  For an experience that generates multiple reports, the `reportCustomFields` parameter gets passed to all reports.  All custom fields display in the Reseller Billing API.")

  public List<ReportCustomField> getReportCustomFields() {
    return reportCustomFields;
  }


  public void setReportCustomFields(List<ReportCustomField> reportCustomFields) {
    
    
    
    this.reportCustomFields = reportCustomFields;
  }


  public ConnectParameters isWebView(Boolean isWebView) {
    
    
    
    
    this.isWebView = isWebView;
    return this;
  }

   /**
   * \&quot;true\&quot;: Indicates that the Connect Session will be displayed within a WebView. Note: when the &#x60;isWebView&#x60; parameter is &#x60;true&#x60; the &#x60;redirectUri&#x60; parameter is required.
   * @return isWebView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "\"true\": Indicates that the Connect Session will be displayed within a WebView. Note: when the `isWebView` parameter is `true` the `redirectUri` parameter is required.")

  public Boolean getIsWebView() {
    return isWebView;
  }


  public void setIsWebView(Boolean isWebView) {
    
    
    
    this.isWebView = isWebView;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ConnectParameters instance itself
   */
  public ConnectParameters putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectParameters connectParameters = (ConnectParameters) o;
    return Objects.equals(this.language, connectParameters.language) &&
        Objects.equals(this.partnerId, connectParameters.partnerId) &&
        Objects.equals(this.customerId, connectParameters.customerId) &&
        Objects.equals(this.consumerId, connectParameters.consumerId) &&
        Objects.equals(this.redirectUri, connectParameters.redirectUri) &&
        Objects.equals(this.webhook, connectParameters.webhook) &&
        Objects.equals(this.webhookContentType, connectParameters.webhookContentType) &&
        Objects.equals(this.webhookData, connectParameters.webhookData) &&
        Objects.equals(this.webhookHeaders, connectParameters.webhookHeaders) &&
        Objects.equals(this.optionalConsumerInfo, connectParameters.optionalConsumerInfo) &&
        Objects.equals(this.singleUseUrl, connectParameters.singleUseUrl) &&
        Objects.equals(this.experience, connectParameters.experience) &&
        Objects.equals(this.institutionSettings, connectParameters.institutionSettings) &&
        Objects.equals(this.fromDate, connectParameters.fromDate) &&
        Objects.equals(this.reportCustomFields, connectParameters.reportCustomFields) &&
        Objects.equals(this.isWebView, connectParameters.isWebView)&&
        Objects.equals(this.additionalProperties, connectParameters.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, partnerId, customerId, consumerId, redirectUri, webhook, webhookContentType, webhookData, webhookHeaders, optionalConsumerInfo, singleUseUrl, experience, institutionSettings, fromDate, reportCustomFields, isWebView, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectParameters {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    webhookContentType: ").append(toIndentedString(webhookContentType)).append("\n");
    sb.append("    webhookData: ").append(toIndentedString(webhookData)).append("\n");
    sb.append("    webhookHeaders: ").append(toIndentedString(webhookHeaders)).append("\n");
    sb.append("    optionalConsumerInfo: ").append(toIndentedString(optionalConsumerInfo)).append("\n");
    sb.append("    singleUseUrl: ").append(toIndentedString(singleUseUrl)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    institutionSettings: ").append(toIndentedString(institutionSettings)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    reportCustomFields: ").append(toIndentedString(reportCustomFields)).append("\n");
    sb.append("    isWebView: ").append(toIndentedString(isWebView)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("language");
    openapiFields.add("partnerId");
    openapiFields.add("customerId");
    openapiFields.add("consumerId");
    openapiFields.add("redirectUri");
    openapiFields.add("webhook");
    openapiFields.add("webhookContentType");
    openapiFields.add("webhookData");
    openapiFields.add("webhookHeaders");
    openapiFields.add("optionalConsumerInfo");
    openapiFields.add("singleUseUrl");
    openapiFields.add("experience");
    openapiFields.add("institutionSettings");
    openapiFields.add("fromDate");
    openapiFields.add("reportCustomFields");
    openapiFields.add("isWebView");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("partnerId");
    openapiRequiredFields.add("customerId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectParameters
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConnectParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectParameters is not found in the empty JSON string", ConnectParameters.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConnectParameters.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (!jsonObj.get("partnerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerId").toString()));
      }
      if (!jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      if ((jsonObj.get("consumerId") != null && !jsonObj.get("consumerId").isJsonNull()) && !jsonObj.get("consumerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumerId").toString()));
      }
      if ((jsonObj.get("redirectUri") != null && !jsonObj.get("redirectUri").isJsonNull()) && !jsonObj.get("redirectUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirectUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirectUri").toString()));
      }
      if ((jsonObj.get("webhook") != null && !jsonObj.get("webhook").isJsonNull()) && !jsonObj.get("webhook").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhook` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhook").toString()));
      }
      if ((jsonObj.get("webhookContentType") != null && !jsonObj.get("webhookContentType").isJsonNull()) && !jsonObj.get("webhookContentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhookContentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhookContentType").toString()));
      }
      // validate the optional field `optionalConsumerInfo`
      if (jsonObj.get("optionalConsumerInfo") != null && !jsonObj.get("optionalConsumerInfo").isJsonNull()) {
        ConsumerInfo.validateJsonObject(jsonObj.getAsJsonObject("optionalConsumerInfo"));
      }
      if ((jsonObj.get("experience") != null && !jsonObj.get("experience").isJsonNull()) && !jsonObj.get("experience").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `experience` to be a primitive type in the JSON string but got `%s`", jsonObj.get("experience").toString()));
      }
      if (jsonObj.get("reportCustomFields") != null && !jsonObj.get("reportCustomFields").isJsonNull()) {
        JsonArray jsonArrayreportCustomFields = jsonObj.getAsJsonArray("reportCustomFields");
        if (jsonArrayreportCustomFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reportCustomFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reportCustomFields` to be an array in the JSON string but got `%s`", jsonObj.get("reportCustomFields").toString()));
          }

          // validate the optional field `reportCustomFields` (array)
          for (int i = 0; i < jsonArrayreportCustomFields.size(); i++) {
            ReportCustomField.validateJsonObject(jsonArrayreportCustomFields.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectParameters>() {
           @Override
           public void write(JsonWriter out, ConnectParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ConnectParameters read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConnectParameters instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConnectParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectParameters
  * @throws IOException if the JSON string is invalid with respect to ConnectParameters
  */
  public static ConnectParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectParameters.class);
  }

 /**
  * Convert an instance of ConnectParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
