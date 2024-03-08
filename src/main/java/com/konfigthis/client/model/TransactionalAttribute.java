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
import com.konfigthis.client.model.TransactionalTimeInterval;
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
 * An attribute which represents some categorization/classification of transactions. Enumerates those identified transactions and reports aggregations of them over the requested time interval(s).
 */
@ApiModel(description = "An attribute which represents some categorization/classification of transactions. Enumerates those identified transactions and reports aggregations of them over the requested time interval(s).")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TransactionalAttribute {
  public static final String SERIALIZED_NAME_AGGREGATED_BY_TIME_PERIODS = "aggregatedByTimePeriods";
  @SerializedName(SERIALIZED_NAME_AGGREGATED_BY_TIME_PERIODS)
  private List<TransactionalTimeInterval> aggregatedByTimePeriods = new ArrayList<>();

  public static final String SERIALIZED_NAME_ATTRIBUTE_NAME = "attributeName";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_NAME)
  private String attributeName;

  public static final String SERIALIZED_NAME_STREAM_IDS = "streamIds";
  @SerializedName(SERIALIZED_NAME_STREAM_IDS)
  private List<String> streamIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRANSACTION_IDS = "transactionIds";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_IDS)
  private List<String> transactionIds = new ArrayList<>();

  public TransactionalAttribute() {
  }

  public TransactionalAttribute aggregatedByTimePeriods(List<TransactionalTimeInterval> aggregatedByTimePeriods) {
    
    
    
    
    this.aggregatedByTimePeriods = aggregatedByTimePeriods;
    return this;
  }

  public TransactionalAttribute addAggregatedByTimePeriodsItem(TransactionalTimeInterval aggregatedByTimePeriodsItem) {
    this.aggregatedByTimePeriods.add(aggregatedByTimePeriodsItem);
    return this;
  }

   /**
   * List of aggregations by specified Time Interval
   * @return aggregatedByTimePeriods
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of aggregations by specified Time Interval")

  public List<TransactionalTimeInterval> getAggregatedByTimePeriods() {
    return aggregatedByTimePeriods;
  }


  public void setAggregatedByTimePeriods(List<TransactionalTimeInterval> aggregatedByTimePeriods) {
    
    
    
    this.aggregatedByTimePeriods = aggregatedByTimePeriods;
  }


  public TransactionalAttribute attributeName(String attributeName) {
    
    
    
    
    this.attributeName = attributeName;
    return this;
  }

   /**
   * Name of Attribute as mentioned in Data Dictionary
   * @return attributeName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "INFLOW_TRANSACTIONS", required = true, value = "Name of Attribute as mentioned in Data Dictionary")

  public String getAttributeName() {
    return attributeName;
  }


  public void setAttributeName(String attributeName) {
    
    
    
    this.attributeName = attributeName;
  }


  public TransactionalAttribute streamIds(List<String> streamIds) {
    
    
    
    
    this.streamIds = streamIds;
    return this;
  }

  public TransactionalAttribute addStreamIdsItem(String streamIdsItem) {
    this.streamIds.add(streamIdsItem);
    return this;
  }

   /**
   * List of stream IDs categorized as belonging to this attribute
   * @return streamIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"1\",\"2\"]", required = true, value = "List of stream IDs categorized as belonging to this attribute")

  public List<String> getStreamIds() {
    return streamIds;
  }


  public void setStreamIds(List<String> streamIds) {
    
    
    
    this.streamIds = streamIds;
  }


  public TransactionalAttribute transactionIds(List<String> transactionIds) {
    
    
    
    
    this.transactionIds = transactionIds;
    return this;
  }

  public TransactionalAttribute addTransactionIdsItem(String transactionIdsItem) {
    this.transactionIds.add(transactionIdsItem);
    return this;
  }

   /**
   * List of transaction IDs categorized as belonging to this attribute
   * @return transactionIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"6010290887\",\"6010290914\"]", required = true, value = "List of transaction IDs categorized as belonging to this attribute")

  public List<String> getTransactionIds() {
    return transactionIds;
  }


  public void setTransactionIds(List<String> transactionIds) {
    
    
    
    this.transactionIds = transactionIds;
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
   * @return the TransactionalAttribute instance itself
   */
  public TransactionalAttribute putAdditionalProperty(String key, Object value) {
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
    TransactionalAttribute transactionalAttribute = (TransactionalAttribute) o;
    return Objects.equals(this.aggregatedByTimePeriods, transactionalAttribute.aggregatedByTimePeriods) &&
        Objects.equals(this.attributeName, transactionalAttribute.attributeName) &&
        Objects.equals(this.streamIds, transactionalAttribute.streamIds) &&
        Objects.equals(this.transactionIds, transactionalAttribute.transactionIds)&&
        Objects.equals(this.additionalProperties, transactionalAttribute.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatedByTimePeriods, attributeName, streamIds, transactionIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionalAttribute {\n");
    sb.append("    aggregatedByTimePeriods: ").append(toIndentedString(aggregatedByTimePeriods)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    streamIds: ").append(toIndentedString(streamIds)).append("\n");
    sb.append("    transactionIds: ").append(toIndentedString(transactionIds)).append("\n");
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
    openapiFields.add("aggregatedByTimePeriods");
    openapiFields.add("attributeName");
    openapiFields.add("streamIds");
    openapiFields.add("transactionIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("aggregatedByTimePeriods");
    openapiRequiredFields.add("attributeName");
    openapiRequiredFields.add("streamIds");
    openapiRequiredFields.add("transactionIds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionalAttribute
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransactionalAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionalAttribute is not found in the empty JSON string", TransactionalAttribute.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionalAttribute.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("aggregatedByTimePeriods").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggregatedByTimePeriods` to be an array in the JSON string but got `%s`", jsonObj.get("aggregatedByTimePeriods").toString()));
      }

      JsonArray jsonArrayaggregatedByTimePeriods = jsonObj.getAsJsonArray("aggregatedByTimePeriods");
      // validate the required field `aggregatedByTimePeriods` (array)
      for (int i = 0; i < jsonArrayaggregatedByTimePeriods.size(); i++) {
        TransactionalTimeInterval.validateJsonObject(jsonArrayaggregatedByTimePeriods.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("attributeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeName").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("streamIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("streamIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `streamIds` to be an array in the JSON string but got `%s`", jsonObj.get("streamIds").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("transactionIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("transactionIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionIds` to be an array in the JSON string but got `%s`", jsonObj.get("transactionIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionalAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionalAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionalAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionalAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionalAttribute>() {
           @Override
           public void write(JsonWriter out, TransactionalAttribute value) throws IOException {
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
           public TransactionalAttribute read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TransactionalAttribute instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionalAttribute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionalAttribute
  * @throws IOException if the JSON string is invalid with respect to TransactionalAttribute
  */
  public static TransactionalAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionalAttribute.class);
  }

 /**
  * Convert an instance of TransactionalAttribute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

