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
 * CashFlowMonthlyCashFlowCharacteristics
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CashFlowMonthlyCashFlowCharacteristics {
  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private Long month;

  public static final String SERIALIZED_NAME_TOTAL_CREDITS_LESS_TOTAL_DEBITS = "totalCreditsLessTotalDebits";
  @SerializedName(SERIALIZED_NAME_TOTAL_CREDITS_LESS_TOTAL_DEBITS)
  private Double totalCreditsLessTotalDebits;

  public static final String SERIALIZED_NAME_TOTAL_CREDITS_LESS_TOTAL_DEBITS_LESS_TRANSFERS = "totalCreditsLessTotalDebitsLessTransfers";
  @SerializedName(SERIALIZED_NAME_TOTAL_CREDITS_LESS_TOTAL_DEBITS_LESS_TRANSFERS)
  private Double totalCreditsLessTotalDebitsLessTransfers;

  public static final String SERIALIZED_NAME_AVERAGE_TRANSACTION_AMOUNT = "averageTransactionAmount";
  @SerializedName(SERIALIZED_NAME_AVERAGE_TRANSACTION_AMOUNT)
  private Double averageTransactionAmount;

  public CashFlowMonthlyCashFlowCharacteristics() {
  }

  public CashFlowMonthlyCashFlowCharacteristics month(Long month) {
    
    
    
    
    this.month = month;
    return this;
  }

   /**
   * One instance for each complete calendar month in the report
   * @return month
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1512111600", required = true, value = "One instance for each complete calendar month in the report")

  public Long getMonth() {
    return month;
  }


  public void setMonth(Long month) {
    
    
    
    this.month = month;
  }


  public CashFlowMonthlyCashFlowCharacteristics totalCreditsLessTotalDebits(Double totalCreditsLessTotalDebits) {
    
    
    
    
    this.totalCreditsLessTotalDebits = totalCreditsLessTotalDebits;
    return this;
  }

  public CashFlowMonthlyCashFlowCharacteristics totalCreditsLessTotalDebits(Integer totalCreditsLessTotalDebits) {
    
    
    
    
    this.totalCreditsLessTotalDebits = totalCreditsLessTotalDebits.doubleValue();
    return this;
  }

   /**
   * Total Credits - Total Debits by month
   * @return totalCreditsLessTotalDebits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "15000", required = true, value = "Total Credits - Total Debits by month")

  public Double getTotalCreditsLessTotalDebits() {
    return totalCreditsLessTotalDebits;
  }


  public void setTotalCreditsLessTotalDebits(Double totalCreditsLessTotalDebits) {
    
    
    
    this.totalCreditsLessTotalDebits = totalCreditsLessTotalDebits;
  }


  public CashFlowMonthlyCashFlowCharacteristics totalCreditsLessTotalDebitsLessTransfers(Double totalCreditsLessTotalDebitsLessTransfers) {
    
    
    
    
    this.totalCreditsLessTotalDebitsLessTransfers = totalCreditsLessTotalDebitsLessTransfers;
    return this;
  }

  public CashFlowMonthlyCashFlowCharacteristics totalCreditsLessTotalDebitsLessTransfers(Integer totalCreditsLessTotalDebitsLessTransfers) {
    
    
    
    
    this.totalCreditsLessTotalDebitsLessTransfers = totalCreditsLessTotalDebitsLessTransfers.doubleValue();
    return this;
  }

   /**
   * Total Credits - Total Debits by month (Without Transfers)
   * @return totalCreditsLessTotalDebitsLessTransfers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "11000", required = true, value = "Total Credits - Total Debits by month (Without Transfers)")

  public Double getTotalCreditsLessTotalDebitsLessTransfers() {
    return totalCreditsLessTotalDebitsLessTransfers;
  }


  public void setTotalCreditsLessTotalDebitsLessTransfers(Double totalCreditsLessTotalDebitsLessTransfers) {
    
    
    
    this.totalCreditsLessTotalDebitsLessTransfers = totalCreditsLessTotalDebitsLessTransfers;
  }


  public CashFlowMonthlyCashFlowCharacteristics averageTransactionAmount(Double averageTransactionAmount) {
    
    
    
    
    this.averageTransactionAmount = averageTransactionAmount;
    return this;
  }

  public CashFlowMonthlyCashFlowCharacteristics averageTransactionAmount(Integer averageTransactionAmount) {
    
    
    
    
    this.averageTransactionAmount = averageTransactionAmount.doubleValue();
    return this;
  }

   /**
   * Average transaction amount by month
   * @return averageTransactionAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10", required = true, value = "Average transaction amount by month")

  public Double getAverageTransactionAmount() {
    return averageTransactionAmount;
  }


  public void setAverageTransactionAmount(Double averageTransactionAmount) {
    
    
    
    this.averageTransactionAmount = averageTransactionAmount;
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
   * @return the CashFlowMonthlyCashFlowCharacteristics instance itself
   */
  public CashFlowMonthlyCashFlowCharacteristics putAdditionalProperty(String key, Object value) {
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
    CashFlowMonthlyCashFlowCharacteristics cashFlowMonthlyCashFlowCharacteristics = (CashFlowMonthlyCashFlowCharacteristics) o;
    return Objects.equals(this.month, cashFlowMonthlyCashFlowCharacteristics.month) &&
        Objects.equals(this.totalCreditsLessTotalDebits, cashFlowMonthlyCashFlowCharacteristics.totalCreditsLessTotalDebits) &&
        Objects.equals(this.totalCreditsLessTotalDebitsLessTransfers, cashFlowMonthlyCashFlowCharacteristics.totalCreditsLessTotalDebitsLessTransfers) &&
        Objects.equals(this.averageTransactionAmount, cashFlowMonthlyCashFlowCharacteristics.averageTransactionAmount)&&
        Objects.equals(this.additionalProperties, cashFlowMonthlyCashFlowCharacteristics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, totalCreditsLessTotalDebits, totalCreditsLessTotalDebitsLessTransfers, averageTransactionAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowMonthlyCashFlowCharacteristics {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    totalCreditsLessTotalDebits: ").append(toIndentedString(totalCreditsLessTotalDebits)).append("\n");
    sb.append("    totalCreditsLessTotalDebitsLessTransfers: ").append(toIndentedString(totalCreditsLessTotalDebitsLessTransfers)).append("\n");
    sb.append("    averageTransactionAmount: ").append(toIndentedString(averageTransactionAmount)).append("\n");
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
    openapiFields.add("month");
    openapiFields.add("totalCreditsLessTotalDebits");
    openapiFields.add("totalCreditsLessTotalDebitsLessTransfers");
    openapiFields.add("averageTransactionAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("month");
    openapiRequiredFields.add("totalCreditsLessTotalDebits");
    openapiRequiredFields.add("totalCreditsLessTotalDebitsLessTransfers");
    openapiRequiredFields.add("averageTransactionAmount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CashFlowMonthlyCashFlowCharacteristics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CashFlowMonthlyCashFlowCharacteristics.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CashFlowMonthlyCashFlowCharacteristics is not found in the empty JSON string", CashFlowMonthlyCashFlowCharacteristics.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CashFlowMonthlyCashFlowCharacteristics.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CashFlowMonthlyCashFlowCharacteristics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CashFlowMonthlyCashFlowCharacteristics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CashFlowMonthlyCashFlowCharacteristics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CashFlowMonthlyCashFlowCharacteristics.class));

       return (TypeAdapter<T>) new TypeAdapter<CashFlowMonthlyCashFlowCharacteristics>() {
           @Override
           public void write(JsonWriter out, CashFlowMonthlyCashFlowCharacteristics value) throws IOException {
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
           public CashFlowMonthlyCashFlowCharacteristics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CashFlowMonthlyCashFlowCharacteristics instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CashFlowMonthlyCashFlowCharacteristics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CashFlowMonthlyCashFlowCharacteristics
  * @throws IOException if the JSON string is invalid with respect to CashFlowMonthlyCashFlowCharacteristics
  */
  public static CashFlowMonthlyCashFlowCharacteristics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CashFlowMonthlyCashFlowCharacteristics.class);
  }

 /**
  * Convert an instance of CashFlowMonthlyCashFlowCharacteristics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

