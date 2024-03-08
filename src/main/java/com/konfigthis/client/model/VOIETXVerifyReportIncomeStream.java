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
import com.konfigthis.client.model.NetMonthly;
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
 * VOIETXVerifyReportIncomeStream
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VOIETXVerifyReportIncomeStream {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private Integer confidence;

  public static final String SERIALIZED_NAME_CADENCE = "cadence";
  @SerializedName(SERIALIZED_NAME_CADENCE)
  private CadenceDetails cadence;

  public static final String SERIALIZED_NAME_NET_MONTHLY = "netMonthly";
  @SerializedName(SERIALIZED_NAME_NET_MONTHLY)
  private List<NetMonthly> netMonthly = null;

  public static final String SERIALIZED_NAME_NET_ANNUAL = "netAnnual";
  @SerializedName(SERIALIZED_NAME_NET_ANNUAL)
  private Double netAnnual;

  public static final String SERIALIZED_NAME_PROJECTED_NET_ANNUAL = "projectedNetAnnual";
  @SerializedName(SERIALIZED_NAME_PROJECTED_NET_ANNUAL)
  private Double projectedNetAnnual;

  public static final String SERIALIZED_NAME_ESTIMATED_GROSS_ANNUAL = "estimatedGrossAnnual";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_GROSS_ANNUAL)
  private Double estimatedGrossAnnual;

  public static final String SERIALIZED_NAME_PROJECTED_GROSS_ANNUAL = "projectedGrossAnnual";
  @SerializedName(SERIALIZED_NAME_PROJECTED_GROSS_ANNUAL)
  private Double projectedGrossAnnual;

  public static final String SERIALIZED_NAME_AVERAGE_MONTHLY_INCOME_NET = "averageMonthlyIncomeNet";
  @SerializedName(SERIALIZED_NAME_AVERAGE_MONTHLY_INCOME_NET)
  private Double averageMonthlyIncomeNet;

  public static final String SERIALIZED_NAME_INCOME_STREAM_MONTHS = "incomeStreamMonths";
  @SerializedName(SERIALIZED_NAME_INCOME_STREAM_MONTHS)
  private Integer incomeStreamMonths;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<ReportTransaction> transactions = new ArrayList<>();

  public VOIETXVerifyReportIncomeStream() {
  }

  public VOIETXVerifyReportIncomeStream id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Finicity&#39;s income stream ID
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "dens28i3vsch-voietxverify", required = true, value = "Finicity's income stream ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public VOIETXVerifyReportIncomeStream name(String name) {
    
    
    
    
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


  public VOIETXVerifyReportIncomeStream status(String status) {
    
    
    
    
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


  public VOIETXVerifyReportIncomeStream confidence(Integer confidence) {
    
    
    
    
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


  public VOIETXVerifyReportIncomeStream cadence(CadenceDetails cadence) {
    
    
    
    
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


  public VOIETXVerifyReportIncomeStream netMonthly(List<NetMonthly> netMonthly) {
    
    
    
    
    this.netMonthly = netMonthly;
    return this;
  }

  public VOIETXVerifyReportIncomeStream addNetMonthlyItem(NetMonthly netMonthlyItem) {
    if (this.netMonthly == null) {
      this.netMonthly = new ArrayList<>();
    }
    this.netMonthly.add(netMonthlyItem);
    return this;
  }

   /**
   * A list of net monthly records. One instance for each complete calendar month in the report.
   * @return netMonthly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of net monthly records. One instance for each complete calendar month in the report.")

  public List<NetMonthly> getNetMonthly() {
    return netMonthly;
  }


  public void setNetMonthly(List<NetMonthly> netMonthly) {
    
    
    
    this.netMonthly = netMonthly;
  }


  public VOIETXVerifyReportIncomeStream netAnnual(Double netAnnual) {
    
    
    
    
    this.netAnnual = netAnnual;
    return this;
  }

  public VOIETXVerifyReportIncomeStream netAnnual(Integer netAnnual) {
    
    
    
    
    this.netAnnual = netAnnual.doubleValue();
    return this;
  }

   /**
   * Sum of all values in &#x60;netMonthlyIncome&#x60; over the previous 12 months
   * @return netAnnual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "110475.7", value = "Sum of all values in `netMonthlyIncome` over the previous 12 months")

  public Double getNetAnnual() {
    return netAnnual;
  }


  public void setNetAnnual(Double netAnnual) {
    
    
    
    this.netAnnual = netAnnual;
  }


  public VOIETXVerifyReportIncomeStream projectedNetAnnual(Double projectedNetAnnual) {
    
    
    
    
    this.projectedNetAnnual = projectedNetAnnual;
    return this;
  }

  public VOIETXVerifyReportIncomeStream projectedNetAnnual(Integer projectedNetAnnual) {
    
    
    
    
    this.projectedNetAnnual = projectedNetAnnual.doubleValue();
    return this;
  }

   /**
   * Projected net income over the next 12 months, across all income streams, based on &#x60;netAnnualIncome&#x60;
   * @return projectedNetAnnual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Projected net income over the next 12 months, across all income streams, based on `netAnnualIncome`")

  public Double getProjectedNetAnnual() {
    return projectedNetAnnual;
  }


  public void setProjectedNetAnnual(Double projectedNetAnnual) {
    
    
    
    this.projectedNetAnnual = projectedNetAnnual;
  }


  public VOIETXVerifyReportIncomeStream estimatedGrossAnnual(Double estimatedGrossAnnual) {
    
    
    
    
    this.estimatedGrossAnnual = estimatedGrossAnnual;
    return this;
  }

  public VOIETXVerifyReportIncomeStream estimatedGrossAnnual(Integer estimatedGrossAnnual) {
    
    
    
    
    this.estimatedGrossAnnual = estimatedGrossAnnual.doubleValue();
    return this;
  }

   /**
   * Before-tax gross annual income (estimated from &#x60;netAnnual&#x60;) across all income stream in the past 12 months
   * @return estimatedGrossAnnual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12321.1", value = "Before-tax gross annual income (estimated from `netAnnual`) across all income stream in the past 12 months")

  public Double getEstimatedGrossAnnual() {
    return estimatedGrossAnnual;
  }


  public void setEstimatedGrossAnnual(Double estimatedGrossAnnual) {
    
    
    
    this.estimatedGrossAnnual = estimatedGrossAnnual;
  }


  public VOIETXVerifyReportIncomeStream projectedGrossAnnual(Double projectedGrossAnnual) {
    
    
    
    
    this.projectedGrossAnnual = projectedGrossAnnual;
    return this;
  }

  public VOIETXVerifyReportIncomeStream projectedGrossAnnual(Integer projectedGrossAnnual) {
    
    
    
    
    this.projectedGrossAnnual = projectedGrossAnnual.doubleValue();
    return this;
  }

   /**
   * Projected gross income over the next 12 months, across all active income streams, based on &#x60;projectedNetAnnual&#x60;
   * @return projectedGrossAnnual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "151609", value = "Projected gross income over the next 12 months, across all active income streams, based on `projectedNetAnnual`")

  public Double getProjectedGrossAnnual() {
    return projectedGrossAnnual;
  }


  public void setProjectedGrossAnnual(Double projectedGrossAnnual) {
    
    
    
    this.projectedGrossAnnual = projectedGrossAnnual;
  }


  public VOIETXVerifyReportIncomeStream averageMonthlyIncomeNet(Double averageMonthlyIncomeNet) {
    
    
    
    
    this.averageMonthlyIncomeNet = averageMonthlyIncomeNet;
    return this;
  }

  public VOIETXVerifyReportIncomeStream averageMonthlyIncomeNet(Integer averageMonthlyIncomeNet) {
    
    
    
    
    this.averageMonthlyIncomeNet = averageMonthlyIncomeNet.doubleValue();
    return this;
  }

   /**
   * Monthly average amount over the previous 24 months
   * @return averageMonthlyIncomeNet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9206.31", value = "Monthly average amount over the previous 24 months")

  public Double getAverageMonthlyIncomeNet() {
    return averageMonthlyIncomeNet;
  }


  public void setAverageMonthlyIncomeNet(Double averageMonthlyIncomeNet) {
    
    
    
    this.averageMonthlyIncomeNet = averageMonthlyIncomeNet;
  }


  public VOIETXVerifyReportIncomeStream incomeStreamMonths(Integer incomeStreamMonths) {
    
    
    
    
    this.incomeStreamMonths = incomeStreamMonths;
    return this;
  }

   /**
   * The number of months the income transactions are observed
   * @return incomeStreamMonths
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "24", value = "The number of months the income transactions are observed")

  public Integer getIncomeStreamMonths() {
    return incomeStreamMonths;
  }


  public void setIncomeStreamMonths(Integer incomeStreamMonths) {
    
    
    
    this.incomeStreamMonths = incomeStreamMonths;
  }


  public VOIETXVerifyReportIncomeStream transactions(List<ReportTransaction> transactions) {
    
    
    
    
    this.transactions = transactions;
    return this;
  }

  public VOIETXVerifyReportIncomeStream addTransactionsItem(ReportTransaction transactionsItem) {
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
   * @return the VOIETXVerifyReportIncomeStream instance itself
   */
  public VOIETXVerifyReportIncomeStream putAdditionalProperty(String key, Object value) {
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
    VOIETXVerifyReportIncomeStream voIETXVerifyReportIncomeStream = (VOIETXVerifyReportIncomeStream) o;
    return Objects.equals(this.id, voIETXVerifyReportIncomeStream.id) &&
        Objects.equals(this.name, voIETXVerifyReportIncomeStream.name) &&
        Objects.equals(this.status, voIETXVerifyReportIncomeStream.status) &&
        Objects.equals(this.confidence, voIETXVerifyReportIncomeStream.confidence) &&
        Objects.equals(this.cadence, voIETXVerifyReportIncomeStream.cadence) &&
        Objects.equals(this.netMonthly, voIETXVerifyReportIncomeStream.netMonthly) &&
        Objects.equals(this.netAnnual, voIETXVerifyReportIncomeStream.netAnnual) &&
        Objects.equals(this.projectedNetAnnual, voIETXVerifyReportIncomeStream.projectedNetAnnual) &&
        Objects.equals(this.estimatedGrossAnnual, voIETXVerifyReportIncomeStream.estimatedGrossAnnual) &&
        Objects.equals(this.projectedGrossAnnual, voIETXVerifyReportIncomeStream.projectedGrossAnnual) &&
        Objects.equals(this.averageMonthlyIncomeNet, voIETXVerifyReportIncomeStream.averageMonthlyIncomeNet) &&
        Objects.equals(this.incomeStreamMonths, voIETXVerifyReportIncomeStream.incomeStreamMonths) &&
        Objects.equals(this.transactions, voIETXVerifyReportIncomeStream.transactions)&&
        Objects.equals(this.additionalProperties, voIETXVerifyReportIncomeStream.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, confidence, cadence, netMonthly, netAnnual, projectedNetAnnual, estimatedGrossAnnual, projectedGrossAnnual, averageMonthlyIncomeNet, incomeStreamMonths, transactions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VOIETXVerifyReportIncomeStream {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    cadence: ").append(toIndentedString(cadence)).append("\n");
    sb.append("    netMonthly: ").append(toIndentedString(netMonthly)).append("\n");
    sb.append("    netAnnual: ").append(toIndentedString(netAnnual)).append("\n");
    sb.append("    projectedNetAnnual: ").append(toIndentedString(projectedNetAnnual)).append("\n");
    sb.append("    estimatedGrossAnnual: ").append(toIndentedString(estimatedGrossAnnual)).append("\n");
    sb.append("    projectedGrossAnnual: ").append(toIndentedString(projectedGrossAnnual)).append("\n");
    sb.append("    averageMonthlyIncomeNet: ").append(toIndentedString(averageMonthlyIncomeNet)).append("\n");
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
    openapiFields.add("confidence");
    openapiFields.add("cadence");
    openapiFields.add("netMonthly");
    openapiFields.add("netAnnual");
    openapiFields.add("projectedNetAnnual");
    openapiFields.add("estimatedGrossAnnual");
    openapiFields.add("projectedGrossAnnual");
    openapiFields.add("averageMonthlyIncomeNet");
    openapiFields.add("incomeStreamMonths");
    openapiFields.add("transactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("confidence");
    openapiRequiredFields.add("cadence");
    openapiRequiredFields.add("transactions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VOIETXVerifyReportIncomeStream
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VOIETXVerifyReportIncomeStream.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VOIETXVerifyReportIncomeStream is not found in the empty JSON string", VOIETXVerifyReportIncomeStream.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VOIETXVerifyReportIncomeStream.openapiRequiredFields) {
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
      // validate the required field `cadence`
      CadenceDetails.validateJsonObject(jsonObj.getAsJsonObject("cadence"));
      if (jsonObj.get("netMonthly") != null && !jsonObj.get("netMonthly").isJsonNull()) {
        JsonArray jsonArraynetMonthly = jsonObj.getAsJsonArray("netMonthly");
        if (jsonArraynetMonthly != null) {
          // ensure the json data is an array
          if (!jsonObj.get("netMonthly").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `netMonthly` to be an array in the JSON string but got `%s`", jsonObj.get("netMonthly").toString()));
          }

          // validate the optional field `netMonthly` (array)
          for (int i = 0; i < jsonArraynetMonthly.size(); i++) {
            NetMonthly.validateJsonObject(jsonArraynetMonthly.get(i).getAsJsonObject());
          };
        }
      }
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
       if (!VOIETXVerifyReportIncomeStream.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VOIETXVerifyReportIncomeStream' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VOIETXVerifyReportIncomeStream> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VOIETXVerifyReportIncomeStream.class));

       return (TypeAdapter<T>) new TypeAdapter<VOIETXVerifyReportIncomeStream>() {
           @Override
           public void write(JsonWriter out, VOIETXVerifyReportIncomeStream value) throws IOException {
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
           public VOIETXVerifyReportIncomeStream read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VOIETXVerifyReportIncomeStream instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VOIETXVerifyReportIncomeStream given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VOIETXVerifyReportIncomeStream
  * @throws IOException if the JSON string is invalid with respect to VOIETXVerifyReportIncomeStream
  */
  public static VOIETXVerifyReportIncomeStream fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VOIETXVerifyReportIncomeStream.class);
  }

 /**
  * Convert an instance of VOIETXVerifyReportIncomeStream to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
