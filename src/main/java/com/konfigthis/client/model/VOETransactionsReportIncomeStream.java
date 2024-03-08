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
import com.konfigthis.client.model.CadenceDetails;
import com.konfigthis.client.model.ReportTransaction;
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
 * VOETransactionsReportIncomeStream
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VOETransactionsReportIncomeStream {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ESTIMATE_INCLUSION = "estimateInclusion";
  @SerializedName(SERIALIZED_NAME_ESTIMATE_INCLUSION)
  private String estimateInclusion;

  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private Integer confidence;

  public static final String SERIALIZED_NAME_CADENCE = "cadence";
  @SerializedName(SERIALIZED_NAME_CADENCE)
  private CadenceDetails cadence;

  public static final String SERIALIZED_NAME_DAYS_SINCE_LAST_TRANSACTION = "daysSinceLastTransaction";
  @SerializedName(SERIALIZED_NAME_DAYS_SINCE_LAST_TRANSACTION)
  private Integer daysSinceLastTransaction;

  public static final String SERIALIZED_NAME_NEXT_EXPECTED_TRANSACTION_DATE = "nextExpectedTransactionDate";
  @SerializedName(SERIALIZED_NAME_NEXT_EXPECTED_TRANSACTION_DATE)
  private Long nextExpectedTransactionDate;

  public static final String SERIALIZED_NAME_INCOME_STREAM_MONTHS = "incomeStreamMonths";
  @SerializedName(SERIALIZED_NAME_INCOME_STREAM_MONTHS)
  private Integer incomeStreamMonths;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<ReportTransaction> transactions = new ArrayList<>();

  public VOETransactionsReportIncomeStream() {
  }

  public VOETransactionsReportIncomeStream id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Income stream ID
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "dens28i3vsch-voah", required = true, value = "Income stream ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public VOETransactionsReportIncomeStream name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * A human-readable name based on the &#x60;normalizedPayee&#x60; name of the transactions for this income stream
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "none", required = true, value = "A human-readable name based on the `normalizedPayee` name of the transactions for this income stream")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public VOETransactionsReportIncomeStream status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Possible values: \&quot;ACTIVE\&quot;, \&quot;INACTIVE\&quot;
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ACTIVE", required = true, value = "Possible values: \"ACTIVE\", \"INACTIVE\"")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public VOETransactionsReportIncomeStream estimateInclusion(String estimateInclusion) {
    
    
    
    
    this.estimateInclusion = estimateInclusion;
    return this;
  }

   /**
   * Possible values: \&quot;HIGH\&quot;, \&quot;MODERATE\&quot;, \&quot;LOW\&quot;, \&quot;NO\&quot;
   * @return estimateInclusion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "HIGH", required = true, value = "Possible values: \"HIGH\", \"MODERATE\", \"LOW\", \"NO\"")

  public String getEstimateInclusion() {
    return estimateInclusion;
  }


  public void setEstimateInclusion(String estimateInclusion) {
    
    
    
    this.estimateInclusion = estimateInclusion;
  }


  public VOETransactionsReportIncomeStream confidence(Integer confidence) {
    
    
    
    
    this.confidence = confidence;
    return this;
  }

   /**
   * Level of confidence that the deposit stream represents income (example: 85%)
   * @return confidence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "70", required = true, value = "Level of confidence that the deposit stream represents income (example: 85%)")

  public Integer getConfidence() {
    return confidence;
  }


  public void setConfidence(Integer confidence) {
    
    
    
    this.confidence = confidence;
  }


  public VOETransactionsReportIncomeStream cadence(CadenceDetails cadence) {
    
    
    
    
    this.cadence = cadence;
    return this;
  }

   /**
   * Get cadence
   * @return cadence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CadenceDetails getCadence() {
    return cadence;
  }


  public void setCadence(CadenceDetails cadence) {
    
    
    
    this.cadence = cadence;
  }


  public VOETransactionsReportIncomeStream daysSinceLastTransaction(Integer daysSinceLastTransaction) {
    
    
    
    
    this.daysSinceLastTransaction = daysSinceLastTransaction;
    return this;
  }

   /**
   * The number of days since the last credit transaction for the particular income stream
   * @return daysSinceLastTransaction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "15", required = true, value = "The number of days since the last credit transaction for the particular income stream")

  public Integer getDaysSinceLastTransaction() {
    return daysSinceLastTransaction;
  }


  public void setDaysSinceLastTransaction(Integer daysSinceLastTransaction) {
    
    
    
    this.daysSinceLastTransaction = daysSinceLastTransaction;
  }


  public VOETransactionsReportIncomeStream nextExpectedTransactionDate(Long nextExpectedTransactionDate) {
    
    
    
    
    this.nextExpectedTransactionDate = nextExpectedTransactionDate;
    return this;
  }

   /**
   * The next expected credit transaction date for the particular income stream, based on the cadence
   * @return nextExpectedTransactionDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1572625469", required = true, value = "The next expected credit transaction date for the particular income stream, based on the cadence")

  public Long getNextExpectedTransactionDate() {
    return nextExpectedTransactionDate;
  }


  public void setNextExpectedTransactionDate(Long nextExpectedTransactionDate) {
    
    
    
    this.nextExpectedTransactionDate = nextExpectedTransactionDate;
  }


  public VOETransactionsReportIncomeStream incomeStreamMonths(Integer incomeStreamMonths) {
    
    
    
    
    this.incomeStreamMonths = incomeStreamMonths;
    return this;
  }

   /**
   * The number of months the income transactions are observed
   * @return incomeStreamMonths
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18", value = "The number of months the income transactions are observed")

  public Integer getIncomeStreamMonths() {
    return incomeStreamMonths;
  }


  public void setIncomeStreamMonths(Integer incomeStreamMonths) {
    
    
    
    this.incomeStreamMonths = incomeStreamMonths;
  }


  public VOETransactionsReportIncomeStream transactions(List<ReportTransaction> transactions) {
    
    
    
    
    this.transactions = transactions;
    return this;
  }

  public VOETransactionsReportIncomeStream addTransactionsItem(ReportTransaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * A list of transaction records
   * @return transactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of transaction records")

  public List<ReportTransaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<ReportTransaction> transactions) {
    
    
    
    this.transactions = transactions;
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
   * @return the VOETransactionsReportIncomeStream instance itself
   */
  public VOETransactionsReportIncomeStream putAdditionalProperty(String key, Object value) {
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
    VOETransactionsReportIncomeStream voETransactionsReportIncomeStream = (VOETransactionsReportIncomeStream) o;
    return Objects.equals(this.id, voETransactionsReportIncomeStream.id) &&
        Objects.equals(this.name, voETransactionsReportIncomeStream.name) &&
        Objects.equals(this.status, voETransactionsReportIncomeStream.status) &&
        Objects.equals(this.estimateInclusion, voETransactionsReportIncomeStream.estimateInclusion) &&
        Objects.equals(this.confidence, voETransactionsReportIncomeStream.confidence) &&
        Objects.equals(this.cadence, voETransactionsReportIncomeStream.cadence) &&
        Objects.equals(this.daysSinceLastTransaction, voETransactionsReportIncomeStream.daysSinceLastTransaction) &&
        Objects.equals(this.nextExpectedTransactionDate, voETransactionsReportIncomeStream.nextExpectedTransactionDate) &&
        Objects.equals(this.incomeStreamMonths, voETransactionsReportIncomeStream.incomeStreamMonths) &&
        Objects.equals(this.transactions, voETransactionsReportIncomeStream.transactions)&&
        Objects.equals(this.additionalProperties, voETransactionsReportIncomeStream.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, estimateInclusion, confidence, cadence, daysSinceLastTransaction, nextExpectedTransactionDate, incomeStreamMonths, transactions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VOETransactionsReportIncomeStream {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    estimateInclusion: ").append(toIndentedString(estimateInclusion)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    cadence: ").append(toIndentedString(cadence)).append("\n");
    sb.append("    daysSinceLastTransaction: ").append(toIndentedString(daysSinceLastTransaction)).append("\n");
    sb.append("    nextExpectedTransactionDate: ").append(toIndentedString(nextExpectedTransactionDate)).append("\n");
    sb.append("    incomeStreamMonths: ").append(toIndentedString(incomeStreamMonths)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("estimateInclusion");
    openapiFields.add("confidence");
    openapiFields.add("cadence");
    openapiFields.add("daysSinceLastTransaction");
    openapiFields.add("nextExpectedTransactionDate");
    openapiFields.add("incomeStreamMonths");
    openapiFields.add("transactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("estimateInclusion");
    openapiRequiredFields.add("confidence");
    openapiRequiredFields.add("cadence");
    openapiRequiredFields.add("daysSinceLastTransaction");
    openapiRequiredFields.add("nextExpectedTransactionDate");
    openapiRequiredFields.add("transactions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VOETransactionsReportIncomeStream
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VOETransactionsReportIncomeStream.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VOETransactionsReportIncomeStream is not found in the empty JSON string", VOETransactionsReportIncomeStream.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VOETransactionsReportIncomeStream.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("estimateInclusion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `estimateInclusion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("estimateInclusion").toString()));
      }
      // validate the required field `cadence`
      CadenceDetails.validateJsonObject(jsonObj.getAsJsonObject("cadence"));
      // ensure the json data is an array
      if (!jsonObj.get("transactions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactions` to be an array in the JSON string but got `%s`", jsonObj.get("transactions").toString()));
      }

      JsonArray jsonArraytransactions = jsonObj.getAsJsonArray("transactions");
      // validate the required field `transactions` (array)
      for (int i = 0; i < jsonArraytransactions.size(); i++) {
        ReportTransaction.validateJsonObject(jsonArraytransactions.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VOETransactionsReportIncomeStream.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VOETransactionsReportIncomeStream' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VOETransactionsReportIncomeStream> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VOETransactionsReportIncomeStream.class));

       return (TypeAdapter<T>) new TypeAdapter<VOETransactionsReportIncomeStream>() {
           @Override
           public void write(JsonWriter out, VOETransactionsReportIncomeStream value) throws IOException {
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
           public VOETransactionsReportIncomeStream read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VOETransactionsReportIncomeStream instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VOETransactionsReportIncomeStream given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VOETransactionsReportIncomeStream
  * @throws IOException if the JSON string is invalid with respect to VOETransactionsReportIncomeStream
  */
  public static VOETransactionsReportIncomeStream fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VOETransactionsReportIncomeStream.class);
  }

 /**
  * Convert an instance of VOETransactionsReportIncomeStream to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

