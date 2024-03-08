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
 * VOIReportConstraints
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VOIReportConstraints {
  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "accountIds";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private String accountIds;

  public static final String SERIALIZED_NAME_REPORT_CUSTOM_FIELDS = "reportCustomFields";
  @SerializedName(SERIALIZED_NAME_REPORT_CUSTOM_FIELDS)
  private List<ReportCustomField> reportCustomFields = null;

  public static final String SERIALIZED_NAME_FROM_DATE = "fromDate";
  @SerializedName(SERIALIZED_NAME_FROM_DATE)
  private Long fromDate;

  public static final String SERIALIZED_NAME_INCOME_STREAM_CONFIDENCE_MINIMUM = "incomeStreamConfidenceMinimum";
  @SerializedName(SERIALIZED_NAME_INCOME_STREAM_CONFIDENCE_MINIMUM)
  private Integer incomeStreamConfidenceMinimum;

  public VOIReportConstraints() {
  }

  public VOIReportConstraints accountIds(String accountIds) {
    
    
    
    
    this.accountIds = accountIds;
    return this;
  }

   /**
   * A whitespace-separated list of account IDs to be included in the report (all accounts will be included if not set)
   * @return accountIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5011648377 5011648378 5011648379", value = "A whitespace-separated list of account IDs to be included in the report (all accounts will be included if not set)")

  public String getAccountIds() {
    return accountIds;
  }


  public void setAccountIds(String accountIds) {
    
    
    
    this.accountIds = accountIds;
  }


  public VOIReportConstraints reportCustomFields(List<ReportCustomField> reportCustomFields) {
    
    
    
    
    this.reportCustomFields = reportCustomFields;
    return this;
  }

  public VOIReportConstraints addReportCustomFieldsItem(ReportCustomField reportCustomFieldsItem) {
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


  public VOIReportConstraints fromDate(Long fromDate) {
    
    
    
    
    this.fromDate = fromDate;
    return this;
  }

   /**
   * A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
   * @return fromDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1607450357", value = "A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).")

  public Long getFromDate() {
    return fromDate;
  }


  public void setFromDate(Long fromDate) {
    
    
    
    this.fromDate = fromDate;
  }


  public VOIReportConstraints incomeStreamConfidenceMinimum(Integer incomeStreamConfidenceMinimum) {
    
    
    
    
    this.incomeStreamConfidenceMinimum = incomeStreamConfidenceMinimum;
    return this;
  }

   /**
   * Include income streams in the report, based on the income stream&#39;s confidence score. For example, Use the value 50 to include only income streams with a confidence score of 50 or higher.
   * @return incomeStreamConfidenceMinimum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "Include income streams in the report, based on the income stream's confidence score. For example, Use the value 50 to include only income streams with a confidence score of 50 or higher.")

  public Integer getIncomeStreamConfidenceMinimum() {
    return incomeStreamConfidenceMinimum;
  }


  public void setIncomeStreamConfidenceMinimum(Integer incomeStreamConfidenceMinimum) {
    
    
    
    this.incomeStreamConfidenceMinimum = incomeStreamConfidenceMinimum;
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
   * @return the VOIReportConstraints instance itself
   */
  public VOIReportConstraints putAdditionalProperty(String key, Object value) {
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
    VOIReportConstraints voIReportConstraints = (VOIReportConstraints) o;
    return Objects.equals(this.accountIds, voIReportConstraints.accountIds) &&
        Objects.equals(this.reportCustomFields, voIReportConstraints.reportCustomFields) &&
        Objects.equals(this.fromDate, voIReportConstraints.fromDate) &&
        Objects.equals(this.incomeStreamConfidenceMinimum, voIReportConstraints.incomeStreamConfidenceMinimum)&&
        Objects.equals(this.additionalProperties, voIReportConstraints.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, reportCustomFields, fromDate, incomeStreamConfidenceMinimum, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VOIReportConstraints {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    reportCustomFields: ").append(toIndentedString(reportCustomFields)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    incomeStreamConfidenceMinimum: ").append(toIndentedString(incomeStreamConfidenceMinimum)).append("\n");
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
    openapiFields.add("accountIds");
    openapiFields.add("reportCustomFields");
    openapiFields.add("fromDate");
    openapiFields.add("incomeStreamConfidenceMinimum");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VOIReportConstraints
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VOIReportConstraints.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VOIReportConstraints is not found in the empty JSON string", VOIReportConstraints.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("accountIds") != null && !jsonObj.get("accountIds").isJsonNull()) && !jsonObj.get("accountIds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountIds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountIds").toString()));
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
       if (!VOIReportConstraints.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VOIReportConstraints' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VOIReportConstraints> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VOIReportConstraints.class));

       return (TypeAdapter<T>) new TypeAdapter<VOIReportConstraints>() {
           @Override
           public void write(JsonWriter out, VOIReportConstraints value) throws IOException {
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
           public VOIReportConstraints read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VOIReportConstraints instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VOIReportConstraints given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VOIReportConstraints
  * @throws IOException if the JSON string is invalid with respect to VOIReportConstraints
  */
  public static VOIReportConstraints fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VOIReportConstraints.class);
  }

 /**
  * Convert an instance of VOIReportConstraints to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

