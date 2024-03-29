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
import com.konfigthis.client.model.VOIEPaystubPayStatement;
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
 * VOIEPaystubReportAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VOIEPaystubReportAllOf {
  public static final String SERIALIZED_NAME_ASSET_IDS = "assetIds";
  @SerializedName(SERIALIZED_NAME_ASSET_IDS)
  private List<String> assetIds = null;

  public static final String SERIALIZED_NAME_NUMBER_OF_BILLABLE_ASSETS = "numberOfBillableAssets";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_BILLABLE_ASSETS)
  private Integer numberOfBillableAssets;

  public static final String SERIALIZED_NAME_PAY_STATEMENTS = "payStatements";
  @SerializedName(SERIALIZED_NAME_PAY_STATEMENTS)
  private List<VOIEPaystubPayStatement> payStatements = null;

  public VOIEPaystubReportAllOf() {
  }

  public VOIEPaystubReportAllOf assetIds(List<String> assetIds) {
    
    
    
    
    this.assetIds = assetIds;
    return this;
  }

  public VOIEPaystubReportAllOf addAssetIdsItem(String assetIdsItem) {
    if (this.assetIds == null) {
      this.assetIds = new ArrayList<>();
    }
    this.assetIds.add(assetIdsItem);
    return this;
  }

   /**
   * The pay statements included in the report
   * @return assetIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pay statements included in the report")

  public List<String> getAssetIds() {
    return assetIds;
  }


  public void setAssetIds(List<String> assetIds) {
    
    
    
    this.assetIds = assetIds;
  }


  public VOIEPaystubReportAllOf numberOfBillableAssets(Integer numberOfBillableAssets) {
    
    
    
    
    this.numberOfBillableAssets = numberOfBillableAssets;
    return this;
  }

   /**
   * Total number of billable pay statements included in the report
   * @return numberOfBillableAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Total number of billable pay statements included in the report")

  public Integer getNumberOfBillableAssets() {
    return numberOfBillableAssets;
  }


  public void setNumberOfBillableAssets(Integer numberOfBillableAssets) {
    
    
    
    this.numberOfBillableAssets = numberOfBillableAssets;
  }


  public VOIEPaystubReportAllOf payStatements(List<VOIEPaystubPayStatement> payStatements) {
    
    
    
    
    this.payStatements = payStatements;
    return this;
  }

  public VOIEPaystubReportAllOf addPayStatementsItem(VOIEPaystubPayStatement payStatementsItem) {
    if (this.payStatements == null) {
      this.payStatements = new ArrayList<>();
    }
    this.payStatements.add(payStatementsItem);
    return this;
  }

   /**
   * Extracted pay statement details, and the transaction matching summary
   * @return payStatements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extracted pay statement details, and the transaction matching summary")

  public List<VOIEPaystubPayStatement> getPayStatements() {
    return payStatements;
  }


  public void setPayStatements(List<VOIEPaystubPayStatement> payStatements) {
    
    
    
    this.payStatements = payStatements;
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
   * @return the VOIEPaystubReportAllOf instance itself
   */
  public VOIEPaystubReportAllOf putAdditionalProperty(String key, Object value) {
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
    VOIEPaystubReportAllOf voIEPaystubReportAllOf = (VOIEPaystubReportAllOf) o;
    return Objects.equals(this.assetIds, voIEPaystubReportAllOf.assetIds) &&
        Objects.equals(this.numberOfBillableAssets, voIEPaystubReportAllOf.numberOfBillableAssets) &&
        Objects.equals(this.payStatements, voIEPaystubReportAllOf.payStatements)&&
        Objects.equals(this.additionalProperties, voIEPaystubReportAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIds, numberOfBillableAssets, payStatements, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VOIEPaystubReportAllOf {\n");
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
    sb.append("    numberOfBillableAssets: ").append(toIndentedString(numberOfBillableAssets)).append("\n");
    sb.append("    payStatements: ").append(toIndentedString(payStatements)).append("\n");
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
    openapiFields.add("assetIds");
    openapiFields.add("numberOfBillableAssets");
    openapiFields.add("payStatements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VOIEPaystubReportAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VOIEPaystubReportAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VOIEPaystubReportAllOf is not found in the empty JSON string", VOIEPaystubReportAllOf.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("assetIds") != null && !jsonObj.get("assetIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetIds` to be an array in the JSON string but got `%s`", jsonObj.get("assetIds").toString()));
      }
      if (jsonObj.get("payStatements") != null && !jsonObj.get("payStatements").isJsonNull()) {
        JsonArray jsonArraypayStatements = jsonObj.getAsJsonArray("payStatements");
        if (jsonArraypayStatements != null) {
          // ensure the json data is an array
          if (!jsonObj.get("payStatements").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `payStatements` to be an array in the JSON string but got `%s`", jsonObj.get("payStatements").toString()));
          }

          // validate the optional field `payStatements` (array)
          for (int i = 0; i < jsonArraypayStatements.size(); i++) {
            VOIEPaystubPayStatement.validateJsonObject(jsonArraypayStatements.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VOIEPaystubReportAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VOIEPaystubReportAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VOIEPaystubReportAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VOIEPaystubReportAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<VOIEPaystubReportAllOf>() {
           @Override
           public void write(JsonWriter out, VOIEPaystubReportAllOf value) throws IOException {
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
           public VOIEPaystubReportAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VOIEPaystubReportAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VOIEPaystubReportAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VOIEPaystubReportAllOf
  * @throws IOException if the JSON string is invalid with respect to VOIEPaystubReportAllOf
  */
  public static VOIEPaystubReportAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VOIEPaystubReportAllOf.class);
  }

 /**
  * Convert an instance of VOIEPaystubReportAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

