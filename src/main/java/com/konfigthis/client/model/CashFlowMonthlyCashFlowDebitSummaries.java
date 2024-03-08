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
 * CashFlowMonthlyCashFlowDebitSummaries
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CashFlowMonthlyCashFlowDebitSummaries {
  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private Long month;

  public static final String SERIALIZED_NAME_NUMBER_OF_DEBITS = "numberOfDebits";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_DEBITS)
  private String numberOfDebits;

  public static final String SERIALIZED_NAME_TOTAL_DEBITS_AMOUNT = "totalDebitsAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DEBITS_AMOUNT)
  private Double totalDebitsAmount;

  public static final String SERIALIZED_NAME_LARGEST_DEBIT = "largestDebit";
  @SerializedName(SERIALIZED_NAME_LARGEST_DEBIT)
  private Double largestDebit;

  public static final String SERIALIZED_NAME_NUMBER_OF_DEBITS_LESS_TRANSFERS = "numberOfDebitsLessTransfers";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_DEBITS_LESS_TRANSFERS)
  private String numberOfDebitsLessTransfers;

  public static final String SERIALIZED_NAME_TOTAL_DEBITS_AMOUNT_LESS_TRANSFERS = "totalDebitsAmountLessTransfers";
  @SerializedName(SERIALIZED_NAME_TOTAL_DEBITS_AMOUNT_LESS_TRANSFERS)
  private Double totalDebitsAmountLessTransfers;

  public static final String SERIALIZED_NAME_AVERAGE_DEBIT_AMOUNT = "averageDebitAmount";
  @SerializedName(SERIALIZED_NAME_AVERAGE_DEBIT_AMOUNT)
  private Double averageDebitAmount;

  public CashFlowMonthlyCashFlowDebitSummaries() {
  }

  public CashFlowMonthlyCashFlowDebitSummaries month(Long month) {
    
    
    
    
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


  public CashFlowMonthlyCashFlowDebitSummaries numberOfDebits(String numberOfDebits) {
    
    
    
    
    this.numberOfDebits = numberOfDebits;
    return this;
  }

   /**
   * Number of Debits by month across all accounts
   * @return numberOfDebits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1500", required = true, value = "Number of Debits by month across all accounts")

  public String getNumberOfDebits() {
    return numberOfDebits;
  }


  public void setNumberOfDebits(String numberOfDebits) {
    
    
    
    this.numberOfDebits = numberOfDebits;
  }


  public CashFlowMonthlyCashFlowDebitSummaries totalDebitsAmount(Double totalDebitsAmount) {
    
    
    
    
    this.totalDebitsAmount = totalDebitsAmount;
    return this;
  }

  public CashFlowMonthlyCashFlowDebitSummaries totalDebitsAmount(Integer totalDebitsAmount) {
    
    
    
    
    this.totalDebitsAmount = totalDebitsAmount.doubleValue();
    return this;
  }

   /**
   * Total Amount of Debits by month across all accounts
   * @return totalDebitsAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "-12345.46", required = true, value = "Total Amount of Debits by month across all accounts")

  public Double getTotalDebitsAmount() {
    return totalDebitsAmount;
  }


  public void setTotalDebitsAmount(Double totalDebitsAmount) {
    
    
    
    this.totalDebitsAmount = totalDebitsAmount;
  }


  public CashFlowMonthlyCashFlowDebitSummaries largestDebit(Double largestDebit) {
    
    
    
    
    this.largestDebit = largestDebit;
    return this;
  }

  public CashFlowMonthlyCashFlowDebitSummaries largestDebit(Integer largestDebit) {
    
    
    
    
    this.largestDebit = largestDebit.doubleValue();
    return this;
  }

   /**
   * Largest Debit by month
   * @return largestDebit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "-20000", required = true, value = "Largest Debit by month")

  public Double getLargestDebit() {
    return largestDebit;
  }


  public void setLargestDebit(Double largestDebit) {
    
    
    
    this.largestDebit = largestDebit;
  }


  public CashFlowMonthlyCashFlowDebitSummaries numberOfDebitsLessTransfers(String numberOfDebitsLessTransfers) {
    
    
    
    
    this.numberOfDebitsLessTransfers = numberOfDebitsLessTransfers;
    return this;
  }

   /**
   * Number of Debits by month (less transfers)
   * @return numberOfDebitsLessTransfers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "Number of Debits by month (less transfers)")

  public String getNumberOfDebitsLessTransfers() {
    return numberOfDebitsLessTransfers;
  }


  public void setNumberOfDebitsLessTransfers(String numberOfDebitsLessTransfers) {
    
    
    
    this.numberOfDebitsLessTransfers = numberOfDebitsLessTransfers;
  }


  public CashFlowMonthlyCashFlowDebitSummaries totalDebitsAmountLessTransfers(Double totalDebitsAmountLessTransfers) {
    
    
    
    
    this.totalDebitsAmountLessTransfers = totalDebitsAmountLessTransfers;
    return this;
  }

  public CashFlowMonthlyCashFlowDebitSummaries totalDebitsAmountLessTransfers(Integer totalDebitsAmountLessTransfers) {
    
    
    
    
    this.totalDebitsAmountLessTransfers = totalDebitsAmountLessTransfers.doubleValue();
    return this;
  }

   /**
   * Total amount of debits by month (less transfers)
   * @return totalDebitsAmountLessTransfers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "-2000", required = true, value = "Total amount of debits by month (less transfers)")

  public Double getTotalDebitsAmountLessTransfers() {
    return totalDebitsAmountLessTransfers;
  }


  public void setTotalDebitsAmountLessTransfers(Double totalDebitsAmountLessTransfers) {
    
    
    
    this.totalDebitsAmountLessTransfers = totalDebitsAmountLessTransfers;
  }


  public CashFlowMonthlyCashFlowDebitSummaries averageDebitAmount(Double averageDebitAmount) {
    
    
    
    
    this.averageDebitAmount = averageDebitAmount;
    return this;
  }

  public CashFlowMonthlyCashFlowDebitSummaries averageDebitAmount(Integer averageDebitAmount) {
    
    
    
    
    this.averageDebitAmount = averageDebitAmount.doubleValue();
    return this;
  }

   /**
   * The average debit amount
   * @return averageDebitAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "500", required = true, value = "The average debit amount")

  public Double getAverageDebitAmount() {
    return averageDebitAmount;
  }


  public void setAverageDebitAmount(Double averageDebitAmount) {
    
    
    
    this.averageDebitAmount = averageDebitAmount;
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
   * @return the CashFlowMonthlyCashFlowDebitSummaries instance itself
   */
  public CashFlowMonthlyCashFlowDebitSummaries putAdditionalProperty(String key, Object value) {
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
    CashFlowMonthlyCashFlowDebitSummaries cashFlowMonthlyCashFlowDebitSummaries = (CashFlowMonthlyCashFlowDebitSummaries) o;
    return Objects.equals(this.month, cashFlowMonthlyCashFlowDebitSummaries.month) &&
        Objects.equals(this.numberOfDebits, cashFlowMonthlyCashFlowDebitSummaries.numberOfDebits) &&
        Objects.equals(this.totalDebitsAmount, cashFlowMonthlyCashFlowDebitSummaries.totalDebitsAmount) &&
        Objects.equals(this.largestDebit, cashFlowMonthlyCashFlowDebitSummaries.largestDebit) &&
        Objects.equals(this.numberOfDebitsLessTransfers, cashFlowMonthlyCashFlowDebitSummaries.numberOfDebitsLessTransfers) &&
        Objects.equals(this.totalDebitsAmountLessTransfers, cashFlowMonthlyCashFlowDebitSummaries.totalDebitsAmountLessTransfers) &&
        Objects.equals(this.averageDebitAmount, cashFlowMonthlyCashFlowDebitSummaries.averageDebitAmount)&&
        Objects.equals(this.additionalProperties, cashFlowMonthlyCashFlowDebitSummaries.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, numberOfDebits, totalDebitsAmount, largestDebit, numberOfDebitsLessTransfers, totalDebitsAmountLessTransfers, averageDebitAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowMonthlyCashFlowDebitSummaries {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    numberOfDebits: ").append(toIndentedString(numberOfDebits)).append("\n");
    sb.append("    totalDebitsAmount: ").append(toIndentedString(totalDebitsAmount)).append("\n");
    sb.append("    largestDebit: ").append(toIndentedString(largestDebit)).append("\n");
    sb.append("    numberOfDebitsLessTransfers: ").append(toIndentedString(numberOfDebitsLessTransfers)).append("\n");
    sb.append("    totalDebitsAmountLessTransfers: ").append(toIndentedString(totalDebitsAmountLessTransfers)).append("\n");
    sb.append("    averageDebitAmount: ").append(toIndentedString(averageDebitAmount)).append("\n");
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
    openapiFields.add("numberOfDebits");
    openapiFields.add("totalDebitsAmount");
    openapiFields.add("largestDebit");
    openapiFields.add("numberOfDebitsLessTransfers");
    openapiFields.add("totalDebitsAmountLessTransfers");
    openapiFields.add("averageDebitAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("month");
    openapiRequiredFields.add("numberOfDebits");
    openapiRequiredFields.add("totalDebitsAmount");
    openapiRequiredFields.add("largestDebit");
    openapiRequiredFields.add("numberOfDebitsLessTransfers");
    openapiRequiredFields.add("totalDebitsAmountLessTransfers");
    openapiRequiredFields.add("averageDebitAmount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CashFlowMonthlyCashFlowDebitSummaries
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CashFlowMonthlyCashFlowDebitSummaries.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CashFlowMonthlyCashFlowDebitSummaries is not found in the empty JSON string", CashFlowMonthlyCashFlowDebitSummaries.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CashFlowMonthlyCashFlowDebitSummaries.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("numberOfDebits").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberOfDebits` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberOfDebits").toString()));
      }
      if (!jsonObj.get("numberOfDebitsLessTransfers").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberOfDebitsLessTransfers` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberOfDebitsLessTransfers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CashFlowMonthlyCashFlowDebitSummaries.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CashFlowMonthlyCashFlowDebitSummaries' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CashFlowMonthlyCashFlowDebitSummaries> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CashFlowMonthlyCashFlowDebitSummaries.class));

       return (TypeAdapter<T>) new TypeAdapter<CashFlowMonthlyCashFlowDebitSummaries>() {
           @Override
           public void write(JsonWriter out, CashFlowMonthlyCashFlowDebitSummaries value) throws IOException {
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
           public CashFlowMonthlyCashFlowDebitSummaries read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CashFlowMonthlyCashFlowDebitSummaries instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CashFlowMonthlyCashFlowDebitSummaries given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CashFlowMonthlyCashFlowDebitSummaries
  * @throws IOException if the JSON string is invalid with respect to CashFlowMonthlyCashFlowDebitSummaries
  */
  public static CashFlowMonthlyCashFlowDebitSummaries fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CashFlowMonthlyCashFlowDebitSummaries.class);
  }

 /**
  * Convert an instance of CashFlowMonthlyCashFlowDebitSummaries to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

