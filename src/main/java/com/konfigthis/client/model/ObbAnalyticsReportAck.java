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
 * Response given when analytics were generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF.
 */
@ApiModel(description = "Response given when analytics were generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ObbAnalyticsReportAck {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "accountIds";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private List<Long> accountIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_BUSINESS_ID = "businessId";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ID)
  private Integer businessId;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private String createdDate;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private Long customerId;

  public static final String SERIALIZED_NAME_REPORT_ID = "reportId";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_REPORT_PIN = "reportPin";
  @SerializedName(SERIALIZED_NAME_REPORT_PIN)
  private String reportPin;

  public static final String SERIALIZED_NAME_REQUESTER_NAME = "requesterName";
  @SerializedName(SERIALIZED_NAME_REQUESTER_NAME)
  private String requesterName;

  public ObbAnalyticsReportAck() {
  }

  public ObbAnalyticsReportAck title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Title of the report
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Finicity Asset Ready Report (CRA)", required = true, value = "Title of the report")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public ObbAnalyticsReportAck accountIds(List<Long> accountIds) {
    
    
    
    
    this.accountIds = accountIds;
    return this;
  }

  public ObbAnalyticsReportAck addAccountIdsItem(Long accountIdsItem) {
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * List of account IDs included in the report
   * @return accountIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of account IDs included in the report")

  public List<Long> getAccountIds() {
    return accountIds;
  }


  public void setAccountIds(List<Long> accountIds) {
    
    
    
    this.accountIds = accountIds;
  }


  public ObbAnalyticsReportAck businessId(Integer businessId) {
    
    
    
    
    this.businessId = businessId;
    return this;
  }

   /**
   * Business ID associated with the requested customer
   * @return businessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1005061234", value = "Business ID associated with the requested customer")

  public Integer getBusinessId() {
    return businessId;
  }


  public void setBusinessId(Integer businessId) {
    
    
    
    this.businessId = businessId;
  }


  public ObbAnalyticsReportAck createdDate(String createdDate) {
    
    
    if (createdDate != null && createdDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for createdDate. Length must be greater than or equal to 25.");
    }
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Created date of balance analytics request
   * @return createdDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2023-05-17T06:48:22-07:00", required = true, value = "Created date of balance analytics request")

  public String getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(String createdDate) {
    
    
    if (createdDate != null && createdDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for createdDate. Length must be greater than or equal to 25.");
    }
    this.createdDate = createdDate;
  }


  public ObbAnalyticsReportAck customerId(Long customerId) {
    
    
    
    
    this.customerId = customerId;
    return this;
  }

   /**
   * A customer ID represented as a number. See Add Customer API for how to create a customer ID.
   * @return customerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1005061234", required = true, value = "A customer ID represented as a number. See Add Customer API for how to create a customer ID.")

  public Long getCustomerId() {
    return customerId;
  }


  public void setCustomerId(Long customerId) {
    
    
    
    this.customerId = customerId;
  }


  public ObbAnalyticsReportAck reportId(String reportId) {
    
    
    
    
    this.reportId = reportId;
    return this;
  }

   /**
   * A report ID
   * @return reportId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "u4hstnnak45g", required = true, value = "A report ID")

  public String getReportId() {
    return reportId;
  }


  public void setReportId(String reportId) {
    
    
    
    this.reportId = reportId;
  }


  public ObbAnalyticsReportAck reportPin(String reportPin) {
    
    
    if (reportPin != null && reportPin.length() < 0) {
      throw new IllegalArgumentException("Invalid value for reportPin. Length must be greater than or equal to 0.");
    }
    
    this.reportPin = reportPin;
    return this;
  }

   /**
   * PIN that may be used to access the report
   * @return reportPin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "qert", required = true, value = "PIN that may be used to access the report")

  public String getReportPin() {
    return reportPin;
  }


  public void setReportPin(String reportPin) {
    
    
    if (reportPin != null && reportPin.length() < 0) {
      throw new IllegalArgumentException("Invalid value for reportPin. Length must be greater than or equal to 0.");
    }
    this.reportPin = reportPin;
  }


  public ObbAnalyticsReportAck requesterName(String requesterName) {
    
    
    if (requesterName != null && requesterName.length() < 0) {
      throw new IllegalArgumentException("Invalid value for requesterName. Length must be greater than or equal to 0.");
    }
    
    this.requesterName = requesterName;
    return this;
  }

   /**
   * Name of requester
   * @return requesterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mortgage ABC LLC", value = "Name of requester")

  public String getRequesterName() {
    return requesterName;
  }


  public void setRequesterName(String requesterName) {
    
    
    if (requesterName != null && requesterName.length() < 0) {
      throw new IllegalArgumentException("Invalid value for requesterName. Length must be greater than or equal to 0.");
    }
    this.requesterName = requesterName;
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
   * @return the ObbAnalyticsReportAck instance itself
   */
  public ObbAnalyticsReportAck putAdditionalProperty(String key, Object value) {
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
    ObbAnalyticsReportAck obbAnalyticsReportAck = (ObbAnalyticsReportAck) o;
    return Objects.equals(this.title, obbAnalyticsReportAck.title) &&
        Objects.equals(this.accountIds, obbAnalyticsReportAck.accountIds) &&
        Objects.equals(this.businessId, obbAnalyticsReportAck.businessId) &&
        Objects.equals(this.createdDate, obbAnalyticsReportAck.createdDate) &&
        Objects.equals(this.customerId, obbAnalyticsReportAck.customerId) &&
        Objects.equals(this.reportId, obbAnalyticsReportAck.reportId) &&
        Objects.equals(this.reportPin, obbAnalyticsReportAck.reportPin) &&
        Objects.equals(this.requesterName, obbAnalyticsReportAck.requesterName)&&
        Objects.equals(this.additionalProperties, obbAnalyticsReportAck.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, accountIds, businessId, createdDate, customerId, reportId, reportPin, requesterName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObbAnalyticsReportAck {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    reportPin: ").append(toIndentedString(reportPin)).append("\n");
    sb.append("    requesterName: ").append(toIndentedString(requesterName)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("accountIds");
    openapiFields.add("businessId");
    openapiFields.add("createdDate");
    openapiFields.add("customerId");
    openapiFields.add("reportId");
    openapiFields.add("reportPin");
    openapiFields.add("requesterName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("accountIds");
    openapiRequiredFields.add("createdDate");
    openapiRequiredFields.add("customerId");
    openapiRequiredFields.add("reportId");
    openapiRequiredFields.add("reportPin");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ObbAnalyticsReportAck
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ObbAnalyticsReportAck.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ObbAnalyticsReportAck is not found in the empty JSON string", ObbAnalyticsReportAck.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ObbAnalyticsReportAck.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("accountIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("accountIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountIds` to be an array in the JSON string but got `%s`", jsonObj.get("accountIds").toString()));
      }
      if (!jsonObj.get("createdDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdDate").toString()));
      }
      if (!jsonObj.get("reportId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportId").toString()));
      }
      if (!jsonObj.get("reportPin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportPin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportPin").toString()));
      }
      if ((jsonObj.get("requesterName") != null && !jsonObj.get("requesterName").isJsonNull()) && !jsonObj.get("requesterName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requesterName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requesterName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ObbAnalyticsReportAck.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ObbAnalyticsReportAck' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ObbAnalyticsReportAck> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ObbAnalyticsReportAck.class));

       return (TypeAdapter<T>) new TypeAdapter<ObbAnalyticsReportAck>() {
           @Override
           public void write(JsonWriter out, ObbAnalyticsReportAck value) throws IOException {
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
           public ObbAnalyticsReportAck read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ObbAnalyticsReportAck instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ObbAnalyticsReportAck given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ObbAnalyticsReportAck
  * @throws IOException if the JSON string is invalid with respect to ObbAnalyticsReportAck
  */
  public static ObbAnalyticsReportAck fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ObbAnalyticsReportAck.class);
  }

 /**
  * Convert an instance of ObbAnalyticsReportAck to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

