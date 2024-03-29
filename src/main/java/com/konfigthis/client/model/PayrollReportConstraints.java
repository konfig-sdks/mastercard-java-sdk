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
import com.konfigthis.client.model.PayrollData;
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
 * PayrollReportConstraints
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayrollReportConstraints {
  public static final String SERIALIZED_NAME_PAYROLL_DATA = "payrollData";
  @SerializedName(SERIALIZED_NAME_PAYROLL_DATA)
  private PayrollData payrollData;

  public static final String SERIALIZED_NAME_REPORT_CUSTOM_FIELDS = "reportCustomFields";
  @SerializedName(SERIALIZED_NAME_REPORT_CUSTOM_FIELDS)
  private List<ReportCustomField> reportCustomFields = null;

  public static final String SERIALIZED_NAME_PAY_STATEMENTS_FROM_DATE = "payStatementsFromDate";
  @SerializedName(SERIALIZED_NAME_PAY_STATEMENTS_FROM_DATE)
  private Long payStatementsFromDate;

  public static final String SERIALIZED_NAME_MARKET_SEGMENT = "marketSegment";
  @SerializedName(SERIALIZED_NAME_MARKET_SEGMENT)
  private String marketSegment;

  public static final String SERIALIZED_NAME_EXCLUDE_EMP_INFO = "excludeEmpInfo";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_EMP_INFO)
  private Boolean excludeEmpInfo;

  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private String purpose;

  public PayrollReportConstraints() {
  }

  public PayrollReportConstraints payrollData(PayrollData payrollData) {
    
    
    
    
    this.payrollData = payrollData;
    return this;
  }

   /**
   * Get payrollData
   * @return payrollData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PayrollData getPayrollData() {
    return payrollData;
  }


  public void setPayrollData(PayrollData payrollData) {
    
    
    
    this.payrollData = payrollData;
  }


  public PayrollReportConstraints reportCustomFields(List<ReportCustomField> reportCustomFields) {
    
    
    
    
    this.reportCustomFields = reportCustomFields;
    return this;
  }

  public PayrollReportConstraints addReportCustomFieldsItem(ReportCustomField reportCustomFieldsItem) {
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


  public PayrollReportConstraints payStatementsFromDate(Long payStatementsFromDate) {
    
    
    
    
    this.payStatementsFromDate = payStatementsFromDate;
    return this;
  }

   /**
   * Limits the pay statement history in the VOIE - Payroll report income record. Pay statements are only included if the payDate of the statement is equal to or greater than the start date requested. Date should be in Unix epoch time (in seconds). See: Handling Epoch Dates and Times.
   * @return payStatementsFromDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1607450357", value = "Limits the pay statement history in the VOIE - Payroll report income record. Pay statements are only included if the payDate of the statement is equal to or greater than the start date requested. Date should be in Unix epoch time (in seconds). See: Handling Epoch Dates and Times.")

  public Long getPayStatementsFromDate() {
    return payStatementsFromDate;
  }


  public void setPayStatementsFromDate(Long payStatementsFromDate) {
    
    
    
    this.payStatementsFromDate = payStatementsFromDate;
  }


  public PayrollReportConstraints marketSegment(String marketSegment) {
    
    
    
    
    this.marketSegment = marketSegment;
    return this;
  }

   /**
   * Use case for requesting the consumer&#39;s data. Current supported enumerations are \&quot;Mortgage\&quot; and \&quot;KYC\&quot;. If your use case doesn&#39;t match one of these please reach out to your technical point of contact.
   * @return marketSegment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mortgage", value = "Use case for requesting the consumer's data. Current supported enumerations are \"Mortgage\" and \"KYC\". If your use case doesn't match one of these please reach out to your technical point of contact.")

  public String getMarketSegment() {
    return marketSegment;
  }


  public void setMarketSegment(String marketSegment) {
    
    
    
    this.marketSegment = marketSegment;
  }


  public PayrollReportConstraints excludeEmpInfo(Boolean excludeEmpInfo) {
    
    
    
    
    this.excludeEmpInfo = excludeEmpInfo;
    return this;
  }

   /**
   * Only used on an exception basis for clients that need to exclude EmpInfo data from the VOE-Payroll or VOIE-Payroll report. If true is passed EmpInfo payroll provider&#39;s data will not be searched or returned.
   * @return excludeEmpInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Only used on an exception basis for clients that need to exclude EmpInfo data from the VOE-Payroll or VOIE-Payroll report. If true is passed EmpInfo payroll provider's data will not be searched or returned.")

  public Boolean getExcludeEmpInfo() {
    return excludeEmpInfo;
  }


  public void setExcludeEmpInfo(Boolean excludeEmpInfo) {
    
    
    
    this.excludeEmpInfo = excludeEmpInfo;
  }


  public PayrollReportConstraints purpose(String purpose) {
    
    
    
    
    this.purpose = purpose;
    return this;
  }

   /**
   * FCRA required 2-digit Permissible Purpose Code, specifying the reason for retrieving this report.
   * @return purpose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "31", value = "FCRA required 2-digit Permissible Purpose Code, specifying the reason for retrieving this report.")

  public String getPurpose() {
    return purpose;
  }


  public void setPurpose(String purpose) {
    
    
    
    this.purpose = purpose;
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
   * @return the PayrollReportConstraints instance itself
   */
  public PayrollReportConstraints putAdditionalProperty(String key, Object value) {
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
    PayrollReportConstraints payrollReportConstraints = (PayrollReportConstraints) o;
    return Objects.equals(this.payrollData, payrollReportConstraints.payrollData) &&
        Objects.equals(this.reportCustomFields, payrollReportConstraints.reportCustomFields) &&
        Objects.equals(this.payStatementsFromDate, payrollReportConstraints.payStatementsFromDate) &&
        Objects.equals(this.marketSegment, payrollReportConstraints.marketSegment) &&
        Objects.equals(this.excludeEmpInfo, payrollReportConstraints.excludeEmpInfo) &&
        Objects.equals(this.purpose, payrollReportConstraints.purpose)&&
        Objects.equals(this.additionalProperties, payrollReportConstraints.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payrollData, reportCustomFields, payStatementsFromDate, marketSegment, excludeEmpInfo, purpose, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayrollReportConstraints {\n");
    sb.append("    payrollData: ").append(toIndentedString(payrollData)).append("\n");
    sb.append("    reportCustomFields: ").append(toIndentedString(reportCustomFields)).append("\n");
    sb.append("    payStatementsFromDate: ").append(toIndentedString(payStatementsFromDate)).append("\n");
    sb.append("    marketSegment: ").append(toIndentedString(marketSegment)).append("\n");
    sb.append("    excludeEmpInfo: ").append(toIndentedString(excludeEmpInfo)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
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
    openapiFields.add("payrollData");
    openapiFields.add("reportCustomFields");
    openapiFields.add("payStatementsFromDate");
    openapiFields.add("marketSegment");
    openapiFields.add("excludeEmpInfo");
    openapiFields.add("purpose");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("payrollData");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayrollReportConstraints
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayrollReportConstraints.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayrollReportConstraints is not found in the empty JSON string", PayrollReportConstraints.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PayrollReportConstraints.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `payrollData`
      PayrollData.validateJsonObject(jsonObj.getAsJsonObject("payrollData"));
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
      if ((jsonObj.get("marketSegment") != null && !jsonObj.get("marketSegment").isJsonNull()) && !jsonObj.get("marketSegment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marketSegment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marketSegment").toString()));
      }
      if ((jsonObj.get("purpose") != null && !jsonObj.get("purpose").isJsonNull()) && !jsonObj.get("purpose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purpose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purpose").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayrollReportConstraints.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayrollReportConstraints' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayrollReportConstraints> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayrollReportConstraints.class));

       return (TypeAdapter<T>) new TypeAdapter<PayrollReportConstraints>() {
           @Override
           public void write(JsonWriter out, PayrollReportConstraints value) throws IOException {
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
           public PayrollReportConstraints read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayrollReportConstraints instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayrollReportConstraints given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayrollReportConstraints
  * @throws IOException if the JSON string is invalid with respect to PayrollReportConstraints
  */
  public static PayrollReportConstraints fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayrollReportConstraints.class);
  }

 /**
  * Convert an instance of PayrollReportConstraints to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

