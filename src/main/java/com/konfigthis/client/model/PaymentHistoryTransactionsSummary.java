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
 * Top-level summary of transactions
 */
@ApiModel(description = "Top-level summary of transactions")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentHistoryTransactionsSummary {
  public static final String SERIALIZED_NAME_TOTAL_NON_SUFFICIENT_FUNDS = "totalNonSufficientFunds";
  @SerializedName(SERIALIZED_NAME_TOTAL_NON_SUFFICIENT_FUNDS)
  private Double totalNonSufficientFunds;

  public static final String SERIALIZED_NAME_AVERAGE_MONTHLY_NON_SUFFICIENT_FUNDS = "averageMonthlyNonSufficientFunds";
  @SerializedName(SERIALIZED_NAME_AVERAGE_MONTHLY_NON_SUFFICIENT_FUNDS)
  private Double averageMonthlyNonSufficientFunds;

  public static final String SERIALIZED_NAME_TOTAL_DEPOSITS = "totalDeposits";
  @SerializedName(SERIALIZED_NAME_TOTAL_DEPOSITS)
  private Double totalDeposits;

  public static final String SERIALIZED_NAME_AVERAGE_MONTHLY_DEPOSITS = "averageMonthlyDeposits";
  @SerializedName(SERIALIZED_NAME_AVERAGE_MONTHLY_DEPOSITS)
  private Double averageMonthlyDeposits;

  public static final String SERIALIZED_NAME_TOTAL_WITHDRAWALS = "totalWithdrawals";
  @SerializedName(SERIALIZED_NAME_TOTAL_WITHDRAWALS)
  private Double totalWithdrawals;

  public static final String SERIALIZED_NAME_AVERAGE_MONTHLY_WITHDRAWALS = "averageMonthlyWithdrawals";
  @SerializedName(SERIALIZED_NAME_AVERAGE_MONTHLY_WITHDRAWALS)
  private Double averageMonthlyWithdrawals;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private String beginDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public PaymentHistoryTransactionsSummary() {
  }

  public PaymentHistoryTransactionsSummary totalNonSufficientFunds(Double totalNonSufficientFunds) {
    
    
    
    
    this.totalNonSufficientFunds = totalNonSufficientFunds;
    return this;
  }

  public PaymentHistoryTransactionsSummary totalNonSufficientFunds(Integer totalNonSufficientFunds) {
    
    
    
    
    this.totalNonSufficientFunds = totalNonSufficientFunds.doubleValue();
    return this;
  }

   /**
   * Total of NSF transactions
   * @return totalNonSufficientFunds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total of NSF transactions")

  public Double getTotalNonSufficientFunds() {
    return totalNonSufficientFunds;
  }


  public void setTotalNonSufficientFunds(Double totalNonSufficientFunds) {
    
    
    
    this.totalNonSufficientFunds = totalNonSufficientFunds;
  }


  public PaymentHistoryTransactionsSummary averageMonthlyNonSufficientFunds(Double averageMonthlyNonSufficientFunds) {
    
    
    
    
    this.averageMonthlyNonSufficientFunds = averageMonthlyNonSufficientFunds;
    return this;
  }

  public PaymentHistoryTransactionsSummary averageMonthlyNonSufficientFunds(Integer averageMonthlyNonSufficientFunds) {
    
    
    
    
    this.averageMonthlyNonSufficientFunds = averageMonthlyNonSufficientFunds.doubleValue();
    return this;
  }

   /**
   * Monthly average of NSF transactions
   * @return averageMonthlyNonSufficientFunds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Monthly average of NSF transactions")

  public Double getAverageMonthlyNonSufficientFunds() {
    return averageMonthlyNonSufficientFunds;
  }


  public void setAverageMonthlyNonSufficientFunds(Double averageMonthlyNonSufficientFunds) {
    
    
    
    this.averageMonthlyNonSufficientFunds = averageMonthlyNonSufficientFunds;
  }


  public PaymentHistoryTransactionsSummary totalDeposits(Double totalDeposits) {
    
    
    
    
    this.totalDeposits = totalDeposits;
    return this;
  }

  public PaymentHistoryTransactionsSummary totalDeposits(Integer totalDeposits) {
    
    
    
    
    this.totalDeposits = totalDeposits.doubleValue();
    return this;
  }

   /**
   * Total of deposit transactions
   * @return totalDeposits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total of deposit transactions")

  public Double getTotalDeposits() {
    return totalDeposits;
  }


  public void setTotalDeposits(Double totalDeposits) {
    
    
    
    this.totalDeposits = totalDeposits;
  }


  public PaymentHistoryTransactionsSummary averageMonthlyDeposits(Double averageMonthlyDeposits) {
    
    
    
    
    this.averageMonthlyDeposits = averageMonthlyDeposits;
    return this;
  }

  public PaymentHistoryTransactionsSummary averageMonthlyDeposits(Integer averageMonthlyDeposits) {
    
    
    
    
    this.averageMonthlyDeposits = averageMonthlyDeposits.doubleValue();
    return this;
  }

   /**
   * Monthly average of deposit transactions
   * @return averageMonthlyDeposits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Monthly average of deposit transactions")

  public Double getAverageMonthlyDeposits() {
    return averageMonthlyDeposits;
  }


  public void setAverageMonthlyDeposits(Double averageMonthlyDeposits) {
    
    
    
    this.averageMonthlyDeposits = averageMonthlyDeposits;
  }


  public PaymentHistoryTransactionsSummary totalWithdrawals(Double totalWithdrawals) {
    
    
    
    
    this.totalWithdrawals = totalWithdrawals;
    return this;
  }

  public PaymentHistoryTransactionsSummary totalWithdrawals(Integer totalWithdrawals) {
    
    
    
    
    this.totalWithdrawals = totalWithdrawals.doubleValue();
    return this;
  }

   /**
   * Total of withdrawals transactions
   * @return totalWithdrawals
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total of withdrawals transactions")

  public Double getTotalWithdrawals() {
    return totalWithdrawals;
  }


  public void setTotalWithdrawals(Double totalWithdrawals) {
    
    
    
    this.totalWithdrawals = totalWithdrawals;
  }


  public PaymentHistoryTransactionsSummary averageMonthlyWithdrawals(Double averageMonthlyWithdrawals) {
    
    
    
    
    this.averageMonthlyWithdrawals = averageMonthlyWithdrawals;
    return this;
  }

  public PaymentHistoryTransactionsSummary averageMonthlyWithdrawals(Integer averageMonthlyWithdrawals) {
    
    
    
    
    this.averageMonthlyWithdrawals = averageMonthlyWithdrawals.doubleValue();
    return this;
  }

   /**
   * Monthly average of withdrawal transactions
   * @return averageMonthlyWithdrawals
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Monthly average of withdrawal transactions")

  public Double getAverageMonthlyWithdrawals() {
    return averageMonthlyWithdrawals;
  }


  public void setAverageMonthlyWithdrawals(Double averageMonthlyWithdrawals) {
    
    
    
    this.averageMonthlyWithdrawals = averageMonthlyWithdrawals;
  }


  public PaymentHistoryTransactionsSummary beginDate(String beginDate) {
    
    
    
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * ISO-8601 date of earliest transaction
   * @return beginDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ISO-8601 date of earliest transaction")

  public String getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(String beginDate) {
    
    
    
    this.beginDate = beginDate;
  }


  public PaymentHistoryTransactionsSummary endDate(String endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * ISO-8601 date of latest transaction
   * @return endDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ISO-8601 date of latest transaction")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    
    
    
    this.endDate = endDate;
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
   * @return the PaymentHistoryTransactionsSummary instance itself
   */
  public PaymentHistoryTransactionsSummary putAdditionalProperty(String key, Object value) {
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
    PaymentHistoryTransactionsSummary paymentHistoryTransactionsSummary = (PaymentHistoryTransactionsSummary) o;
    return Objects.equals(this.totalNonSufficientFunds, paymentHistoryTransactionsSummary.totalNonSufficientFunds) &&
        Objects.equals(this.averageMonthlyNonSufficientFunds, paymentHistoryTransactionsSummary.averageMonthlyNonSufficientFunds) &&
        Objects.equals(this.totalDeposits, paymentHistoryTransactionsSummary.totalDeposits) &&
        Objects.equals(this.averageMonthlyDeposits, paymentHistoryTransactionsSummary.averageMonthlyDeposits) &&
        Objects.equals(this.totalWithdrawals, paymentHistoryTransactionsSummary.totalWithdrawals) &&
        Objects.equals(this.averageMonthlyWithdrawals, paymentHistoryTransactionsSummary.averageMonthlyWithdrawals) &&
        Objects.equals(this.beginDate, paymentHistoryTransactionsSummary.beginDate) &&
        Objects.equals(this.endDate, paymentHistoryTransactionsSummary.endDate)&&
        Objects.equals(this.additionalProperties, paymentHistoryTransactionsSummary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNonSufficientFunds, averageMonthlyNonSufficientFunds, totalDeposits, averageMonthlyDeposits, totalWithdrawals, averageMonthlyWithdrawals, beginDate, endDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentHistoryTransactionsSummary {\n");
    sb.append("    totalNonSufficientFunds: ").append(toIndentedString(totalNonSufficientFunds)).append("\n");
    sb.append("    averageMonthlyNonSufficientFunds: ").append(toIndentedString(averageMonthlyNonSufficientFunds)).append("\n");
    sb.append("    totalDeposits: ").append(toIndentedString(totalDeposits)).append("\n");
    sb.append("    averageMonthlyDeposits: ").append(toIndentedString(averageMonthlyDeposits)).append("\n");
    sb.append("    totalWithdrawals: ").append(toIndentedString(totalWithdrawals)).append("\n");
    sb.append("    averageMonthlyWithdrawals: ").append(toIndentedString(averageMonthlyWithdrawals)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("totalNonSufficientFunds");
    openapiFields.add("averageMonthlyNonSufficientFunds");
    openapiFields.add("totalDeposits");
    openapiFields.add("averageMonthlyDeposits");
    openapiFields.add("totalWithdrawals");
    openapiFields.add("averageMonthlyWithdrawals");
    openapiFields.add("beginDate");
    openapiFields.add("endDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("totalNonSufficientFunds");
    openapiRequiredFields.add("averageMonthlyNonSufficientFunds");
    openapiRequiredFields.add("totalDeposits");
    openapiRequiredFields.add("averageMonthlyDeposits");
    openapiRequiredFields.add("totalWithdrawals");
    openapiRequiredFields.add("averageMonthlyWithdrawals");
    openapiRequiredFields.add("beginDate");
    openapiRequiredFields.add("endDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentHistoryTransactionsSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentHistoryTransactionsSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentHistoryTransactionsSummary is not found in the empty JSON string", PaymentHistoryTransactionsSummary.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentHistoryTransactionsSummary.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("beginDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beginDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beginDate").toString()));
      }
      if (!jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentHistoryTransactionsSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentHistoryTransactionsSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentHistoryTransactionsSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentHistoryTransactionsSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentHistoryTransactionsSummary>() {
           @Override
           public void write(JsonWriter out, PaymentHistoryTransactionsSummary value) throws IOException {
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
           public PaymentHistoryTransactionsSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentHistoryTransactionsSummary instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentHistoryTransactionsSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentHistoryTransactionsSummary
  * @throws IOException if the JSON string is invalid with respect to PaymentHistoryTransactionsSummary
  */
  public static PaymentHistoryTransactionsSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentHistoryTransactionsSummary.class);
  }

 /**
  * Convert an instance of PaymentHistoryTransactionsSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

