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
 * AvailableBalance
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AvailableBalance {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_REAL_ACCOUNT_NUMBER_LAST4 = "realAccountNumberLast4";
  @SerializedName(SERIALIZED_NAME_REAL_ACCOUNT_NUMBER_LAST4)
  private String realAccountNumberLast4;

  public static final String SERIALIZED_NAME_AVAILABLE_BALANCE = "availableBalance";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE)
  private Double availableBalance;

  public static final String SERIALIZED_NAME_AVAILABLE_BALANCE_DATE = "availableBalanceDate";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE_DATE)
  private Long availableBalanceDate;

  public static final String SERIALIZED_NAME_CLEARED_BALANCE = "clearedBalance";
  @SerializedName(SERIALIZED_NAME_CLEARED_BALANCE)
  private Double clearedBalance;

  public static final String SERIALIZED_NAME_CLEARED_BALANCE_DATE = "clearedBalanceDate";
  @SerializedName(SERIALIZED_NAME_CLEARED_BALANCE_DATE)
  private Long clearedBalanceDate;

  public static final String SERIALIZED_NAME_AGGREGATION_STATUS_CODE = "aggregationStatusCode";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_STATUS_CODE)
  private Integer aggregationStatusCode;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public AvailableBalance() {
  }

  public AvailableBalance id(Long id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * A customer ID represented as a number. See Add Customer API for how to create a customer ID.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1005061234", required = true, value = "A customer ID represented as a number. See Add Customer API for how to create a customer ID.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    
    
    
    this.id = id;
  }


  public AvailableBalance realAccountNumberLast4(String realAccountNumberLast4) {
    
    
    
    
    this.realAccountNumberLast4 = realAccountNumberLast4;
    return this;
  }

   /**
   * The last 4 digits of the ACH account number
   * @return realAccountNumberLast4
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5678", required = true, value = "The last 4 digits of the ACH account number")

  public String getRealAccountNumberLast4() {
    return realAccountNumberLast4;
  }


  public void setRealAccountNumberLast4(String realAccountNumberLast4) {
    
    
    
    this.realAccountNumberLast4 = realAccountNumberLast4;
  }


  public AvailableBalance availableBalance(Double availableBalance) {
    
    
    
    
    this.availableBalance = availableBalance;
    return this;
  }

  public AvailableBalance availableBalance(Integer availableBalance) {
    
    
    
    
    this.availableBalance = availableBalance.doubleValue();
    return this;
  }

   /**
   * The available balance of the account
   * @return availableBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "173.47", required = true, value = "The available balance of the account")

  public Double getAvailableBalance() {
    return availableBalance;
  }


  public void setAvailableBalance(Double availableBalance) {
    
    
    
    this.availableBalance = availableBalance;
  }


  public AvailableBalance availableBalanceDate(Long availableBalanceDate) {
    
    
    
    
    this.availableBalanceDate = availableBalanceDate;
    return this;
  }

   /**
   * A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
   * @return availableBalanceDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1607450357", required = true, value = "A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).")

  public Long getAvailableBalanceDate() {
    return availableBalanceDate;
  }


  public void setAvailableBalanceDate(Long availableBalanceDate) {
    
    
    
    this.availableBalanceDate = availableBalanceDate;
  }


  public AvailableBalance clearedBalance(Double clearedBalance) {
    
    
    
    
    this.clearedBalance = clearedBalance;
    return this;
  }

  public AvailableBalance clearedBalance(Integer clearedBalance) {
    
    
    
    
    this.clearedBalance = clearedBalance.doubleValue();
    return this;
  }

   /**
   * The cleared balance of the account. Also referred as posted balance, current balance, ledger balance
   * @return clearedBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "222.25", required = true, value = "The cleared balance of the account. Also referred as posted balance, current balance, ledger balance")

  public Double getClearedBalance() {
    return clearedBalance;
  }


  public void setClearedBalance(Double clearedBalance) {
    
    
    
    this.clearedBalance = clearedBalance;
  }


  public AvailableBalance clearedBalanceDate(Long clearedBalanceDate) {
    
    
    
    
    this.clearedBalanceDate = clearedBalanceDate;
    return this;
  }

   /**
   * A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
   * @return clearedBalanceDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1607450357", required = true, value = "A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).")

  public Long getClearedBalanceDate() {
    return clearedBalanceDate;
  }


  public void setClearedBalanceDate(Long clearedBalanceDate) {
    
    
    
    this.clearedBalanceDate = clearedBalanceDate;
  }


  public AvailableBalance aggregationStatusCode(Integer aggregationStatusCode) {
    
    
    
    
    this.aggregationStatusCode = aggregationStatusCode;
    return this;
  }

   /**
   * The status of the most recent aggregation attempt (see [Aggregation Status Codes](https://developer.mastercard.com/open-banking-us/documentation/products/manage/account-aggregation/#aggregation-status-codes)). Won&#39;t be present until you have run your first aggregation for the account.
   * @return aggregationStatusCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The status of the most recent aggregation attempt (see [Aggregation Status Codes](https://developer.mastercard.com/open-banking-us/documentation/products/manage/account-aggregation/#aggregation-status-codes)). Won't be present until you have run your first aggregation for the account.")

  public Integer getAggregationStatusCode() {
    return aggregationStatusCode;
  }


  public void setAggregationStatusCode(Integer aggregationStatusCode) {
    
    
    
    this.aggregationStatusCode = aggregationStatusCode;
  }


  public AvailableBalance currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * A currency code
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USD", required = true, value = "A currency code")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
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
   * @return the AvailableBalance instance itself
   */
  public AvailableBalance putAdditionalProperty(String key, Object value) {
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
    AvailableBalance availableBalance = (AvailableBalance) o;
    return Objects.equals(this.id, availableBalance.id) &&
        Objects.equals(this.realAccountNumberLast4, availableBalance.realAccountNumberLast4) &&
        Objects.equals(this.availableBalance, availableBalance.availableBalance) &&
        Objects.equals(this.availableBalanceDate, availableBalance.availableBalanceDate) &&
        Objects.equals(this.clearedBalance, availableBalance.clearedBalance) &&
        Objects.equals(this.clearedBalanceDate, availableBalance.clearedBalanceDate) &&
        Objects.equals(this.aggregationStatusCode, availableBalance.aggregationStatusCode) &&
        Objects.equals(this.currency, availableBalance.currency)&&
        Objects.equals(this.additionalProperties, availableBalance.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, realAccountNumberLast4, availableBalance, availableBalanceDate, clearedBalance, clearedBalanceDate, aggregationStatusCode, currency, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableBalance {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    realAccountNumberLast4: ").append(toIndentedString(realAccountNumberLast4)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    availableBalanceDate: ").append(toIndentedString(availableBalanceDate)).append("\n");
    sb.append("    clearedBalance: ").append(toIndentedString(clearedBalance)).append("\n");
    sb.append("    clearedBalanceDate: ").append(toIndentedString(clearedBalanceDate)).append("\n");
    sb.append("    aggregationStatusCode: ").append(toIndentedString(aggregationStatusCode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("realAccountNumberLast4");
    openapiFields.add("availableBalance");
    openapiFields.add("availableBalanceDate");
    openapiFields.add("clearedBalance");
    openapiFields.add("clearedBalanceDate");
    openapiFields.add("aggregationStatusCode");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("realAccountNumberLast4");
    openapiRequiredFields.add("availableBalance");
    openapiRequiredFields.add("availableBalanceDate");
    openapiRequiredFields.add("clearedBalance");
    openapiRequiredFields.add("clearedBalanceDate");
    openapiRequiredFields.add("aggregationStatusCode");
    openapiRequiredFields.add("currency");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AvailableBalance
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AvailableBalance.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailableBalance is not found in the empty JSON string", AvailableBalance.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AvailableBalance.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("realAccountNumberLast4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `realAccountNumberLast4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("realAccountNumberLast4").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailableBalance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailableBalance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailableBalance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailableBalance.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailableBalance>() {
           @Override
           public void write(JsonWriter out, AvailableBalance value) throws IOException {
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
           public AvailableBalance read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AvailableBalance instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AvailableBalance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AvailableBalance
  * @throws IOException if the JSON string is invalid with respect to AvailableBalance
  */
  public static AvailableBalance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailableBalance.class);
  }

 /**
  * Convert an instance of AvailableBalance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

