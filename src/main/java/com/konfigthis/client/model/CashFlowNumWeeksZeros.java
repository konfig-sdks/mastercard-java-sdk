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
import com.konfigthis.client.model.ObbWeekOfYear;
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
 * Weeks with zero transactions during the known history of the account
 */
@ApiModel(description = "Weeks with zero transactions during the known history of the account")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CashFlowNumWeeksZeros {
  public static final String SERIALIZED_NAME_HISTORIC_NUMBER_OF_WEEKS_WITH_DATA_AVAILABLE = "historicNumberOfWeeksWithDataAvailable";
  @SerializedName(SERIALIZED_NAME_HISTORIC_NUMBER_OF_WEEKS_WITH_DATA_AVAILABLE)
  private Integer historicNumberOfWeeksWithDataAvailable;

  public static final String SERIALIZED_NAME_HISTORIC_NUMBER_OF_WEEKS_ZERO_TRANSACTIONS = "historicNumberOfWeeksZeroTransactions";
  @SerializedName(SERIALIZED_NAME_HISTORIC_NUMBER_OF_WEEKS_ZERO_TRANSACTIONS)
  private Integer historicNumberOfWeeksZeroTransactions;

  public static final String SERIALIZED_NAME_HISTORIC_WEEKS_WITH_ZERO_TRANSACTIONS = "historicWeeksWithZeroTransactions";
  @SerializedName(SERIALIZED_NAME_HISTORIC_WEEKS_WITH_ZERO_TRANSACTIONS)
  private List<ObbWeekOfYear> historicWeeksWithZeroTransactions = new ArrayList<>();

  public CashFlowNumWeeksZeros() {
  }

  public CashFlowNumWeeksZeros historicNumberOfWeeksWithDataAvailable(Integer historicNumberOfWeeksWithDataAvailable) {
    
    
    
    
    this.historicNumberOfWeeksWithDataAvailable = historicNumberOfWeeksWithDataAvailable;
    return this;
  }

   /**
   * Number of weeks during known history of account in which data was available
   * @return historicNumberOfWeeksWithDataAvailable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10", required = true, value = "Number of weeks during known history of account in which data was available")

  public Integer getHistoricNumberOfWeeksWithDataAvailable() {
    return historicNumberOfWeeksWithDataAvailable;
  }


  public void setHistoricNumberOfWeeksWithDataAvailable(Integer historicNumberOfWeeksWithDataAvailable) {
    
    
    
    this.historicNumberOfWeeksWithDataAvailable = historicNumberOfWeeksWithDataAvailable;
  }


  public CashFlowNumWeeksZeros historicNumberOfWeeksZeroTransactions(Integer historicNumberOfWeeksZeroTransactions) {
    
    
    
    
    this.historicNumberOfWeeksZeroTransactions = historicNumberOfWeeksZeroTransactions;
    return this;
  }

   /**
   * Number of weeks during known history of account where zero transactions were posted
   * @return historicNumberOfWeeksZeroTransactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "Number of weeks during known history of account where zero transactions were posted")

  public Integer getHistoricNumberOfWeeksZeroTransactions() {
    return historicNumberOfWeeksZeroTransactions;
  }


  public void setHistoricNumberOfWeeksZeroTransactions(Integer historicNumberOfWeeksZeroTransactions) {
    
    
    
    this.historicNumberOfWeeksZeroTransactions = historicNumberOfWeeksZeroTransactions;
  }


  public CashFlowNumWeeksZeros historicWeeksWithZeroTransactions(List<ObbWeekOfYear> historicWeeksWithZeroTransactions) {
    
    
    
    
    this.historicWeeksWithZeroTransactions = historicWeeksWithZeroTransactions;
    return this;
  }

  public CashFlowNumWeeksZeros addHistoricWeeksWithZeroTransactionsItem(ObbWeekOfYear historicWeeksWithZeroTransactionsItem) {
    this.historicWeeksWithZeroTransactions.add(historicWeeksWithZeroTransactionsItem);
    return this;
  }

   /**
   * List of weeks with zero reported transactions
   * @return historicWeeksWithZeroTransactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of weeks with zero reported transactions")

  public List<ObbWeekOfYear> getHistoricWeeksWithZeroTransactions() {
    return historicWeeksWithZeroTransactions;
  }


  public void setHistoricWeeksWithZeroTransactions(List<ObbWeekOfYear> historicWeeksWithZeroTransactions) {
    
    
    
    this.historicWeeksWithZeroTransactions = historicWeeksWithZeroTransactions;
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
   * @return the CashFlowNumWeeksZeros instance itself
   */
  public CashFlowNumWeeksZeros putAdditionalProperty(String key, Object value) {
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
    CashFlowNumWeeksZeros cashFlowNumWeeksZeros = (CashFlowNumWeeksZeros) o;
    return Objects.equals(this.historicNumberOfWeeksWithDataAvailable, cashFlowNumWeeksZeros.historicNumberOfWeeksWithDataAvailable) &&
        Objects.equals(this.historicNumberOfWeeksZeroTransactions, cashFlowNumWeeksZeros.historicNumberOfWeeksZeroTransactions) &&
        Objects.equals(this.historicWeeksWithZeroTransactions, cashFlowNumWeeksZeros.historicWeeksWithZeroTransactions)&&
        Objects.equals(this.additionalProperties, cashFlowNumWeeksZeros.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historicNumberOfWeeksWithDataAvailable, historicNumberOfWeeksZeroTransactions, historicWeeksWithZeroTransactions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowNumWeeksZeros {\n");
    sb.append("    historicNumberOfWeeksWithDataAvailable: ").append(toIndentedString(historicNumberOfWeeksWithDataAvailable)).append("\n");
    sb.append("    historicNumberOfWeeksZeroTransactions: ").append(toIndentedString(historicNumberOfWeeksZeroTransactions)).append("\n");
    sb.append("    historicWeeksWithZeroTransactions: ").append(toIndentedString(historicWeeksWithZeroTransactions)).append("\n");
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
    openapiFields.add("historicNumberOfWeeksWithDataAvailable");
    openapiFields.add("historicNumberOfWeeksZeroTransactions");
    openapiFields.add("historicWeeksWithZeroTransactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("historicNumberOfWeeksWithDataAvailable");
    openapiRequiredFields.add("historicNumberOfWeeksZeroTransactions");
    openapiRequiredFields.add("historicWeeksWithZeroTransactions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CashFlowNumWeeksZeros
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CashFlowNumWeeksZeros.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CashFlowNumWeeksZeros is not found in the empty JSON string", CashFlowNumWeeksZeros.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CashFlowNumWeeksZeros.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("historicWeeksWithZeroTransactions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `historicWeeksWithZeroTransactions` to be an array in the JSON string but got `%s`", jsonObj.get("historicWeeksWithZeroTransactions").toString()));
      }

      JsonArray jsonArrayhistoricWeeksWithZeroTransactions = jsonObj.getAsJsonArray("historicWeeksWithZeroTransactions");
      // validate the required field `historicWeeksWithZeroTransactions` (array)
      for (int i = 0; i < jsonArrayhistoricWeeksWithZeroTransactions.size(); i++) {
        ObbWeekOfYear.validateJsonObject(jsonArrayhistoricWeeksWithZeroTransactions.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CashFlowNumWeeksZeros.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CashFlowNumWeeksZeros' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CashFlowNumWeeksZeros> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CashFlowNumWeeksZeros.class));

       return (TypeAdapter<T>) new TypeAdapter<CashFlowNumWeeksZeros>() {
           @Override
           public void write(JsonWriter out, CashFlowNumWeeksZeros value) throws IOException {
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
           public CashFlowNumWeeksZeros read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CashFlowNumWeeksZeros instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CashFlowNumWeeksZeros given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CashFlowNumWeeksZeros
  * @throws IOException if the JSON string is invalid with respect to CashFlowNumWeeksZeros
  */
  public static CashFlowNumWeeksZeros fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CashFlowNumWeeksZeros.class);
  }

 /**
  * Convert an instance of CashFlowNumWeeksZeros to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

