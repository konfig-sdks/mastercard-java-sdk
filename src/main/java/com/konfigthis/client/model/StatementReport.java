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
import com.konfigthis.client.model.ErrorMessage;
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
 * A Statement report
 */
@ApiModel(description = "A Statement report")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class StatementReport {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CUSTOMER_TYPE = "customerType";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_TYPE)
  private String customerType;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private Long customerId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_REQUESTER_NAME = "requesterName";
  @SerializedName(SERIALIZED_NAME_REQUESTER_NAME)
  private String requesterName;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private Long createdDate;

  public static final String SERIALIZED_NAME_CONSUMER_ID = "consumerId";
  @SerializedName(SERIALIZED_NAME_CONSUMER_ID)
  private String consumerId;

  public static final String SERIALIZED_NAME_CONSUMER_SSN = "consumerSsn";
  @SerializedName(SERIALIZED_NAME_CONSUMER_SSN)
  private String consumerSsn;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ErrorMessage> errors = null;

  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public StatementReport() {
  }

  public StatementReport title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Title of the report
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Finicity Asset Ready Report (CRA)", value = "Title of the report")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public StatementReport id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * A report ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "u4hstnnak45g", value = "A report ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public StatementReport customerType(String customerType) {
    
    
    
    
    this.customerType = customerType;
    return this;
  }

   /**
   * The type of customer (\&quot;active\&quot; or \&quot;testing\&quot; or \&quot;\&quot; for all types)
   * @return customerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "active", value = "The type of customer (\"active\" or \"testing\" or \"\" for all types)")

  public String getCustomerType() {
    return customerType;
  }


  public void setCustomerType(String customerType) {
    
    
    
    this.customerType = customerType;
  }


  public StatementReport customerId(Long customerId) {
    
    
    
    
    this.customerId = customerId;
    return this;
  }

   /**
   * A customer ID represented as a number. See Add Customer API for how to create a customer ID.
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1005061234", value = "A customer ID represented as a number. See Add Customer API for how to create a customer ID.")

  public Long getCustomerId() {
    return customerId;
  }


  public void setCustomerId(Long customerId) {
    
    
    
    this.customerId = customerId;
  }


  public StatementReport requestId(String requestId) {
    
    
    
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Finicity indicator to track all activity associated with this report
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cjqm4wtdcn", value = "Finicity indicator to track all activity associated with this report")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    
    
    
    this.requestId = requestId;
  }


  public StatementReport requesterName(String requesterName) {
    
    
    
    
    this.requesterName = requesterName;
    return this;
  }

   /**
   * Name of a Finicity partner
   * @return requesterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Finicity Test API", value = "Name of a Finicity partner")

  public String getRequesterName() {
    return requesterName;
  }


  public void setRequesterName(String requesterName) {
    
    
    
    this.requesterName = requesterName;
  }


  public StatementReport createdDate(Long createdDate) {
    
    
    
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). Note: If the report is retrieved on a day other than the day it was generated, on the header of the PDF version of the report there will be a \&quot;Retrieved Date\&quot; populated.
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1607450357", value = "A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). Note: If the report is retrieved on a day other than the day it was generated, on the header of the PDF version of the report there will be a \"Retrieved Date\" populated.")

  public Long getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(Long createdDate) {
    
    
    
    this.createdDate = createdDate;
  }


  public StatementReport consumerId(String consumerId) {
    
    
    
    
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


  public StatementReport consumerSsn(String consumerSsn) {
    
    
    
    
    this.consumerSsn = consumerSsn;
    return this;
  }

   /**
   * Last 4 digits of a SSN
   * @return consumerSsn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9999", value = "Last 4 digits of a SSN")

  public String getConsumerSsn() {
    return consumerSsn;
  }


  public void setConsumerSsn(String consumerSsn) {
    
    
    
    this.consumerSsn = consumerSsn;
  }


  public StatementReport type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * A report type. Possible values:  * &#x60;voi&#x60;  * &#x60;voa&#x60;  * &#x60;voaHistory&#x60;  * &#x60;history&#x60;  * &#x60;voieTxVerify&#x60;  * &#x60;voieWithReport&#x60;  * &#x60;voieWithInterview&#x60;  * &#x60;paystatement&#x60;  * &#x60;preQualVoa&#x60;  * &#x60;assetSummary&#x60;  * &#x60;voie&#x60;  * &#x60;transactions&#x60;  * &#x60;statement&#x60;  * &#x60;voiePayroll&#x60;  * &#x60;voeTransactions&#x60;  * &#x60;voePayroll&#x60;  * &#x60;cfrp&#x60;  * &#x60;cfrb&#x60;  * &#x60;barpcra&#x60;  * &#x60;barpnoncra&#x60;  * &#x60;barbcra&#x60;  * &#x60;barbftc&#x60;  * &#x60;barbnoncra&#x60; 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "voi", value = "A report type. Possible values:  * `voi`  * `voa`  * `voaHistory`  * `history`  * `voieTxVerify`  * `voieWithReport`  * `voieWithInterview`  * `paystatement`  * `preQualVoa`  * `assetSummary`  * `voie`  * `transactions`  * `statement`  * `voiePayroll`  * `voeTransactions`  * `voePayroll`  * `cfrp`  * `cfrb`  * `barpcra`  * `barpnoncra`  * `barbcra`  * `barbftc`  * `barbnoncra` ")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public StatementReport status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * A report generation status. Possible values:  * &#x60;inProgress&#x60;  * &#x60;success&#x60;  * &#x60;failure&#x60; 
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "inProgress", value = "A report generation status. Possible values:  * `inProgress`  * `success`  * `failure` ")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public StatementReport errors(List<ErrorMessage> errors) {
    
    
    
    
    this.errors = errors;
    return this;
  }

  public StatementReport addErrorsItem(ErrorMessage errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * In case errors occurred during the report generation
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "In case errors occurred during the report generation")

  public List<ErrorMessage> getErrors() {
    return errors;
  }


  public void setErrors(List<ErrorMessage> errors) {
    
    
    
    this.errors = errors;
  }


  public StatementReport assetId(String assetId) {
    
    
    
    
    this.assetId = assetId;
    return this;
  }

   /**
   * An asset ID. Generated by Connect or by using the Store Customer Pay Statement API.
   * @return assetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "097545c5-1c2a-4f20-a5ef-77f0820344c9-2018601178", value = "An asset ID. Generated by Connect or by using the Store Customer Pay Statement API.")

  public String getAssetId() {
    return assetId;
  }


  public void setAssetId(String assetId) {
    
    
    
    this.assetId = assetId;
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
   * @return the StatementReport instance itself
   */
  public StatementReport putAdditionalProperty(String key, Object value) {
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
    StatementReport statementReport = (StatementReport) o;
    return Objects.equals(this.title, statementReport.title) &&
        Objects.equals(this.id, statementReport.id) &&
        Objects.equals(this.customerType, statementReport.customerType) &&
        Objects.equals(this.customerId, statementReport.customerId) &&
        Objects.equals(this.requestId, statementReport.requestId) &&
        Objects.equals(this.requesterName, statementReport.requesterName) &&
        Objects.equals(this.createdDate, statementReport.createdDate) &&
        Objects.equals(this.consumerId, statementReport.consumerId) &&
        Objects.equals(this.consumerSsn, statementReport.consumerSsn) &&
        Objects.equals(this.type, statementReport.type) &&
        Objects.equals(this.status, statementReport.status) &&
        Objects.equals(this.errors, statementReport.errors) &&
        Objects.equals(this.assetId, statementReport.assetId)&&
        Objects.equals(this.additionalProperties, statementReport.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, id, customerType, customerId, requestId, requesterName, createdDate, consumerId, consumerSsn, type, status, errors, assetId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementReport {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    requesterName: ").append(toIndentedString(requesterName)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    consumerSsn: ").append(toIndentedString(consumerSsn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("customerType");
    openapiFields.add("customerId");
    openapiFields.add("requestId");
    openapiFields.add("requesterName");
    openapiFields.add("createdDate");
    openapiFields.add("consumerId");
    openapiFields.add("consumerSsn");
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("errors");
    openapiFields.add("assetId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatementReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StatementReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatementReport is not found in the empty JSON string", StatementReport.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("customerType") != null && !jsonObj.get("customerType").isJsonNull()) && !jsonObj.get("customerType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerType").toString()));
      }
      if ((jsonObj.get("requestId") != null && !jsonObj.get("requestId").isJsonNull()) && !jsonObj.get("requestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestId").toString()));
      }
      if ((jsonObj.get("requesterName") != null && !jsonObj.get("requesterName").isJsonNull()) && !jsonObj.get("requesterName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requesterName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requesterName").toString()));
      }
      if ((jsonObj.get("consumerId") != null && !jsonObj.get("consumerId").isJsonNull()) && !jsonObj.get("consumerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumerId").toString()));
      }
      if ((jsonObj.get("consumerSsn") != null && !jsonObj.get("consumerSsn").isJsonNull()) && !jsonObj.get("consumerSsn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumerSsn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumerSsn").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            ErrorMessage.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonNull()) && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatementReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatementReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatementReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatementReport.class));

       return (TypeAdapter<T>) new TypeAdapter<StatementReport>() {
           @Override
           public void write(JsonWriter out, StatementReport value) throws IOException {
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
           public StatementReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StatementReport instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StatementReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatementReport
  * @throws IOException if the JSON string is invalid with respect to StatementReport
  */
  public static StatementReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatementReport.class);
  }

 /**
  * Convert an instance of StatementReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
