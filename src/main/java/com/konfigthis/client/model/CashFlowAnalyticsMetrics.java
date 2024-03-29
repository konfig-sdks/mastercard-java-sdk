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
import com.konfigthis.client.model.CashFlowInflowAttributes;
import com.konfigthis.client.model.CashFlowNegativeTriggers;
import com.konfigthis.client.model.CashFlowOutflowAttributes;
import com.konfigthis.client.model.CashFlowTransactionAnalyticsAttributes;
import com.konfigthis.client.model.ObbDateRangeAndAmount;
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
 * Cash flow analytics metrics and calculations
 */
@ApiModel(description = "Cash flow analytics metrics and calculations")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CashFlowAnalyticsMetrics {
  public static final String SERIALIZED_NAME_INFLOW = "inflow";
  @SerializedName(SERIALIZED_NAME_INFLOW)
  private CashFlowInflowAttributes inflow;

  public static final String SERIALIZED_NAME_NEGATIVE_TRIGGERS = "negativeTriggers";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_TRIGGERS)
  private CashFlowNegativeTriggers negativeTriggers;

  public static final String SERIALIZED_NAME_OUTFLOW = "outflow";
  @SerializedName(SERIALIZED_NAME_OUTFLOW)
  private CashFlowOutflowAttributes outflow;

  public static final String SERIALIZED_NAME_REVENUE_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD = "revenueByMonthForTheReportTimePeriod";
  @SerializedName(SERIALIZED_NAME_REVENUE_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD)
  private List<ObbDateRangeAndAmount> revenueByMonthForTheReportTimePeriod = null;

  public static final String SERIALIZED_NAME_REVENUE_FOR_THE_REPORT_TIME_PERIOD = "revenueForTheReportTimePeriod";
  @SerializedName(SERIALIZED_NAME_REVENUE_FOR_THE_REPORT_TIME_PERIOD)
  private Double revenueForTheReportTimePeriod;

  public static final String SERIALIZED_NAME_TRANSACTION_ANALYTICS = "transactionAnalytics";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ANALYTICS)
  private CashFlowTransactionAnalyticsAttributes transactionAnalytics;

  public CashFlowAnalyticsMetrics() {
  }

  public CashFlowAnalyticsMetrics inflow(CashFlowInflowAttributes inflow) {
    
    
    
    
    this.inflow = inflow;
    return this;
  }

   /**
   * Get inflow
   * @return inflow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CashFlowInflowAttributes getInflow() {
    return inflow;
  }


  public void setInflow(CashFlowInflowAttributes inflow) {
    
    
    
    this.inflow = inflow;
  }


  public CashFlowAnalyticsMetrics negativeTriggers(CashFlowNegativeTriggers negativeTriggers) {
    
    
    
    
    this.negativeTriggers = negativeTriggers;
    return this;
  }

   /**
   * Get negativeTriggers
   * @return negativeTriggers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CashFlowNegativeTriggers getNegativeTriggers() {
    return negativeTriggers;
  }


  public void setNegativeTriggers(CashFlowNegativeTriggers negativeTriggers) {
    
    
    
    this.negativeTriggers = negativeTriggers;
  }


  public CashFlowAnalyticsMetrics outflow(CashFlowOutflowAttributes outflow) {
    
    
    
    
    this.outflow = outflow;
    return this;
  }

   /**
   * Get outflow
   * @return outflow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CashFlowOutflowAttributes getOutflow() {
    return outflow;
  }


  public void setOutflow(CashFlowOutflowAttributes outflow) {
    
    
    
    this.outflow = outflow;
  }


  public CashFlowAnalyticsMetrics revenueByMonthForTheReportTimePeriod(List<ObbDateRangeAndAmount> revenueByMonthForTheReportTimePeriod) {
    
    
    
    
    this.revenueByMonthForTheReportTimePeriod = revenueByMonthForTheReportTimePeriod;
    return this;
  }

  public CashFlowAnalyticsMetrics addRevenueByMonthForTheReportTimePeriodItem(ObbDateRangeAndAmount revenueByMonthForTheReportTimePeriodItem) {
    if (this.revenueByMonthForTheReportTimePeriod == null) {
      this.revenueByMonthForTheReportTimePeriod = new ArrayList<>();
    }
    this.revenueByMonthForTheReportTimePeriod.add(revenueByMonthForTheReportTimePeriodItem);
    return this;
  }

   /**
   * Sum of all transactions categorized as revenue, split by months
   * @return revenueByMonthForTheReportTimePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sum of all transactions categorized as revenue, split by months")

  public List<ObbDateRangeAndAmount> getRevenueByMonthForTheReportTimePeriod() {
    return revenueByMonthForTheReportTimePeriod;
  }


  public void setRevenueByMonthForTheReportTimePeriod(List<ObbDateRangeAndAmount> revenueByMonthForTheReportTimePeriod) {
    
    
    
    this.revenueByMonthForTheReportTimePeriod = revenueByMonthForTheReportTimePeriod;
  }


  public CashFlowAnalyticsMetrics revenueForTheReportTimePeriod(Double revenueForTheReportTimePeriod) {
    
    
    
    
    this.revenueForTheReportTimePeriod = revenueForTheReportTimePeriod;
    return this;
  }

  public CashFlowAnalyticsMetrics revenueForTheReportTimePeriod(Integer revenueForTheReportTimePeriod) {
    
    
    
    
    this.revenueForTheReportTimePeriod = revenueForTheReportTimePeriod.doubleValue();
    return this;
  }

   /**
   * Sum of all transactions categorized as revenue
   * @return revenueForTheReportTimePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "43893.44", value = "Sum of all transactions categorized as revenue")

  public Double getRevenueForTheReportTimePeriod() {
    return revenueForTheReportTimePeriod;
  }


  public void setRevenueForTheReportTimePeriod(Double revenueForTheReportTimePeriod) {
    
    
    
    this.revenueForTheReportTimePeriod = revenueForTheReportTimePeriod;
  }


  public CashFlowAnalyticsMetrics transactionAnalytics(CashFlowTransactionAnalyticsAttributes transactionAnalytics) {
    
    
    
    
    this.transactionAnalytics = transactionAnalytics;
    return this;
  }

   /**
   * Get transactionAnalytics
   * @return transactionAnalytics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CashFlowTransactionAnalyticsAttributes getTransactionAnalytics() {
    return transactionAnalytics;
  }


  public void setTransactionAnalytics(CashFlowTransactionAnalyticsAttributes transactionAnalytics) {
    
    
    
    this.transactionAnalytics = transactionAnalytics;
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
   * @return the CashFlowAnalyticsMetrics instance itself
   */
  public CashFlowAnalyticsMetrics putAdditionalProperty(String key, Object value) {
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
    CashFlowAnalyticsMetrics cashFlowAnalyticsMetrics = (CashFlowAnalyticsMetrics) o;
    return Objects.equals(this.inflow, cashFlowAnalyticsMetrics.inflow) &&
        Objects.equals(this.negativeTriggers, cashFlowAnalyticsMetrics.negativeTriggers) &&
        Objects.equals(this.outflow, cashFlowAnalyticsMetrics.outflow) &&
        Objects.equals(this.revenueByMonthForTheReportTimePeriod, cashFlowAnalyticsMetrics.revenueByMonthForTheReportTimePeriod) &&
        Objects.equals(this.revenueForTheReportTimePeriod, cashFlowAnalyticsMetrics.revenueForTheReportTimePeriod) &&
        Objects.equals(this.transactionAnalytics, cashFlowAnalyticsMetrics.transactionAnalytics)&&
        Objects.equals(this.additionalProperties, cashFlowAnalyticsMetrics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inflow, negativeTriggers, outflow, revenueByMonthForTheReportTimePeriod, revenueForTheReportTimePeriod, transactionAnalytics, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowAnalyticsMetrics {\n");
    sb.append("    inflow: ").append(toIndentedString(inflow)).append("\n");
    sb.append("    negativeTriggers: ").append(toIndentedString(negativeTriggers)).append("\n");
    sb.append("    outflow: ").append(toIndentedString(outflow)).append("\n");
    sb.append("    revenueByMonthForTheReportTimePeriod: ").append(toIndentedString(revenueByMonthForTheReportTimePeriod)).append("\n");
    sb.append("    revenueForTheReportTimePeriod: ").append(toIndentedString(revenueForTheReportTimePeriod)).append("\n");
    sb.append("    transactionAnalytics: ").append(toIndentedString(transactionAnalytics)).append("\n");
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
    openapiFields.add("inflow");
    openapiFields.add("negativeTriggers");
    openapiFields.add("outflow");
    openapiFields.add("revenueByMonthForTheReportTimePeriod");
    openapiFields.add("revenueForTheReportTimePeriod");
    openapiFields.add("transactionAnalytics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CashFlowAnalyticsMetrics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CashFlowAnalyticsMetrics.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CashFlowAnalyticsMetrics is not found in the empty JSON string", CashFlowAnalyticsMetrics.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `inflow`
      if (jsonObj.get("inflow") != null && !jsonObj.get("inflow").isJsonNull()) {
        CashFlowInflowAttributes.validateJsonObject(jsonObj.getAsJsonObject("inflow"));
      }
      // validate the optional field `negativeTriggers`
      if (jsonObj.get("negativeTriggers") != null && !jsonObj.get("negativeTriggers").isJsonNull()) {
        CashFlowNegativeTriggers.validateJsonObject(jsonObj.getAsJsonObject("negativeTriggers"));
      }
      // validate the optional field `outflow`
      if (jsonObj.get("outflow") != null && !jsonObj.get("outflow").isJsonNull()) {
        CashFlowOutflowAttributes.validateJsonObject(jsonObj.getAsJsonObject("outflow"));
      }
      if (jsonObj.get("revenueByMonthForTheReportTimePeriod") != null && !jsonObj.get("revenueByMonthForTheReportTimePeriod").isJsonNull()) {
        JsonArray jsonArrayrevenueByMonthForTheReportTimePeriod = jsonObj.getAsJsonArray("revenueByMonthForTheReportTimePeriod");
        if (jsonArrayrevenueByMonthForTheReportTimePeriod != null) {
          // ensure the json data is an array
          if (!jsonObj.get("revenueByMonthForTheReportTimePeriod").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `revenueByMonthForTheReportTimePeriod` to be an array in the JSON string but got `%s`", jsonObj.get("revenueByMonthForTheReportTimePeriod").toString()));
          }

          // validate the optional field `revenueByMonthForTheReportTimePeriod` (array)
          for (int i = 0; i < jsonArrayrevenueByMonthForTheReportTimePeriod.size(); i++) {
            ObbDateRangeAndAmount.validateJsonObject(jsonArrayrevenueByMonthForTheReportTimePeriod.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `transactionAnalytics`
      if (jsonObj.get("transactionAnalytics") != null && !jsonObj.get("transactionAnalytics").isJsonNull()) {
        CashFlowTransactionAnalyticsAttributes.validateJsonObject(jsonObj.getAsJsonObject("transactionAnalytics"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CashFlowAnalyticsMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CashFlowAnalyticsMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CashFlowAnalyticsMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CashFlowAnalyticsMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<CashFlowAnalyticsMetrics>() {
           @Override
           public void write(JsonWriter out, CashFlowAnalyticsMetrics value) throws IOException {
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
           public CashFlowAnalyticsMetrics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CashFlowAnalyticsMetrics instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CashFlowAnalyticsMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CashFlowAnalyticsMetrics
  * @throws IOException if the JSON string is invalid with respect to CashFlowAnalyticsMetrics
  */
  public static CashFlowAnalyticsMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CashFlowAnalyticsMetrics.class);
  }

 /**
  * Convert an instance of CashFlowAnalyticsMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

