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
import com.konfigthis.client.model.CashFlowActivityDepositsCredits;
import com.konfigthis.client.model.CashFlowActivityWithdrawalsDebits;
import com.konfigthis.client.model.CashFlowNumWeeksZeros;
import com.konfigthis.client.model.CashFlowTransactionAnalyticsAttributesLastTransactionDateInner;
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
 * Transaction Analytics Attributes
 */
@ApiModel(description = "Transaction Analytics Attributes")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CashFlowTransactionAnalyticsAttributes {
  public static final String SERIALIZED_NAME_ACTIVITY_DEPOSITS_CREDITS_FOR_THE_REPORT_TIME_PERIOD = "activityDepositsCreditsForTheReportTimePeriod";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_DEPOSITS_CREDITS_FOR_THE_REPORT_TIME_PERIOD)
  private List<CashFlowActivityDepositsCredits> activityDepositsCreditsForTheReportTimePeriod = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACTIVITY_WITHDRAWALS_DEBITS_FOR_THE_REPORT_TIME_PERIOD = "activityWithdrawalsDebitsForTheReportTimePeriod";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_WITHDRAWALS_DEBITS_FOR_THE_REPORT_TIME_PERIOD)
  private List<CashFlowActivityWithdrawalsDebits> activityWithdrawalsDebitsForTheReportTimePeriod = new ArrayList<>();

  public static final String SERIALIZED_NAME_AVERAGE_TRANSACTION_VALUE_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD = "averageTransactionValueByMonthForTheReportTimePeriod";
  @SerializedName(SERIALIZED_NAME_AVERAGE_TRANSACTION_VALUE_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD)
  private List<ObbDateRangeAndAmount> averageTransactionValueByMonthForTheReportTimePeriod = new ArrayList<>();

  public static final String SERIALIZED_NAME_HISTORIC_WEEKS_WITH_ZERO_TRANSACTIONS = "historicWeeksWithZeroTransactions";
  @SerializedName(SERIALIZED_NAME_HISTORIC_WEEKS_WITH_ZERO_TRANSACTIONS)
  private CashFlowNumWeeksZeros historicWeeksWithZeroTransactions;

  public static final String SERIALIZED_NAME_LAST_TRANSACTION_DATE = "lastTransactionDate";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSACTION_DATE)
  private List<CashFlowTransactionAnalyticsAttributesLastTransactionDateInner> lastTransactionDate = null;

  public static final String SERIALIZED_NAME_NET_CASH_FLOW_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD = "netCashFlowByMonthForTheReportTimePeriod";
  @SerializedName(SERIALIZED_NAME_NET_CASH_FLOW_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD)
  private List<ObbDateRangeAndAmount> netCashFlowByMonthForTheReportTimePeriod = null;

  public static final String SERIALIZED_NAME_NET_CASH_FLOW_FOR_THE_REPORT_TIME_PERIOD = "netCashFlowForTheReportTimePeriod";
  @SerializedName(SERIALIZED_NAME_NET_CASH_FLOW_FOR_THE_REPORT_TIME_PERIOD)
  private Double netCashFlowForTheReportTimePeriod;

  public CashFlowTransactionAnalyticsAttributes() {
  }

  public CashFlowTransactionAnalyticsAttributes activityDepositsCreditsForTheReportTimePeriod(List<CashFlowActivityDepositsCredits> activityDepositsCreditsForTheReportTimePeriod) {
    
    
    
    
    this.activityDepositsCreditsForTheReportTimePeriod = activityDepositsCreditsForTheReportTimePeriod;
    return this;
  }

  public CashFlowTransactionAnalyticsAttributes addActivityDepositsCreditsForTheReportTimePeriodItem(CashFlowActivityDepositsCredits activityDepositsCreditsForTheReportTimePeriodItem) {
    this.activityDepositsCreditsForTheReportTimePeriod.add(activityDepositsCreditsForTheReportTimePeriodItem);
    return this;
  }

   /**
   * List of all deposit transactions posted to the account during the report period
   * @return activityDepositsCreditsForTheReportTimePeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of all deposit transactions posted to the account during the report period")

  public List<CashFlowActivityDepositsCredits> getActivityDepositsCreditsForTheReportTimePeriod() {
    return activityDepositsCreditsForTheReportTimePeriod;
  }


  public void setActivityDepositsCreditsForTheReportTimePeriod(List<CashFlowActivityDepositsCredits> activityDepositsCreditsForTheReportTimePeriod) {
    
    
    
    this.activityDepositsCreditsForTheReportTimePeriod = activityDepositsCreditsForTheReportTimePeriod;
  }


  public CashFlowTransactionAnalyticsAttributes activityWithdrawalsDebitsForTheReportTimePeriod(List<CashFlowActivityWithdrawalsDebits> activityWithdrawalsDebitsForTheReportTimePeriod) {
    
    
    
    
    this.activityWithdrawalsDebitsForTheReportTimePeriod = activityWithdrawalsDebitsForTheReportTimePeriod;
    return this;
  }

  public CashFlowTransactionAnalyticsAttributes addActivityWithdrawalsDebitsForTheReportTimePeriodItem(CashFlowActivityWithdrawalsDebits activityWithdrawalsDebitsForTheReportTimePeriodItem) {
    this.activityWithdrawalsDebitsForTheReportTimePeriod.add(activityWithdrawalsDebitsForTheReportTimePeriodItem);
    return this;
  }

   /**
   * List of all withdrawal transactions posted to the account during the report period
   * @return activityWithdrawalsDebitsForTheReportTimePeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of all withdrawal transactions posted to the account during the report period")

  public List<CashFlowActivityWithdrawalsDebits> getActivityWithdrawalsDebitsForTheReportTimePeriod() {
    return activityWithdrawalsDebitsForTheReportTimePeriod;
  }


  public void setActivityWithdrawalsDebitsForTheReportTimePeriod(List<CashFlowActivityWithdrawalsDebits> activityWithdrawalsDebitsForTheReportTimePeriod) {
    
    
    
    this.activityWithdrawalsDebitsForTheReportTimePeriod = activityWithdrawalsDebitsForTheReportTimePeriod;
  }


  public CashFlowTransactionAnalyticsAttributes averageTransactionValueByMonthForTheReportTimePeriod(List<ObbDateRangeAndAmount> averageTransactionValueByMonthForTheReportTimePeriod) {
    
    
    
    
    this.averageTransactionValueByMonthForTheReportTimePeriod = averageTransactionValueByMonthForTheReportTimePeriod;
    return this;
  }

  public CashFlowTransactionAnalyticsAttributes addAverageTransactionValueByMonthForTheReportTimePeriodItem(ObbDateRangeAndAmount averageTransactionValueByMonthForTheReportTimePeriodItem) {
    this.averageTransactionValueByMonthForTheReportTimePeriod.add(averageTransactionValueByMonthForTheReportTimePeriodItem);
    return this;
  }

   /**
   * Average value of transactions during periods in the report. Values may be positive or negative
   * @return averageTransactionValueByMonthForTheReportTimePeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Average value of transactions during periods in the report. Values may be positive or negative")

  public List<ObbDateRangeAndAmount> getAverageTransactionValueByMonthForTheReportTimePeriod() {
    return averageTransactionValueByMonthForTheReportTimePeriod;
  }


  public void setAverageTransactionValueByMonthForTheReportTimePeriod(List<ObbDateRangeAndAmount> averageTransactionValueByMonthForTheReportTimePeriod) {
    
    
    
    this.averageTransactionValueByMonthForTheReportTimePeriod = averageTransactionValueByMonthForTheReportTimePeriod;
  }


  public CashFlowTransactionAnalyticsAttributes historicWeeksWithZeroTransactions(CashFlowNumWeeksZeros historicWeeksWithZeroTransactions) {
    
    
    
    
    this.historicWeeksWithZeroTransactions = historicWeeksWithZeroTransactions;
    return this;
  }

   /**
   * Get historicWeeksWithZeroTransactions
   * @return historicWeeksWithZeroTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CashFlowNumWeeksZeros getHistoricWeeksWithZeroTransactions() {
    return historicWeeksWithZeroTransactions;
  }


  public void setHistoricWeeksWithZeroTransactions(CashFlowNumWeeksZeros historicWeeksWithZeroTransactions) {
    
    
    
    this.historicWeeksWithZeroTransactions = historicWeeksWithZeroTransactions;
  }


  public CashFlowTransactionAnalyticsAttributes lastTransactionDate(List<CashFlowTransactionAnalyticsAttributesLastTransactionDateInner> lastTransactionDate) {
    
    
    
    
    this.lastTransactionDate = lastTransactionDate;
    return this;
  }

  public CashFlowTransactionAnalyticsAttributes addLastTransactionDateItem(CashFlowTransactionAnalyticsAttributesLastTransactionDateInner lastTransactionDateItem) {
    if (this.lastTransactionDate == null) {
      this.lastTransactionDate = new ArrayList<>();
    }
    this.lastTransactionDate.add(lastTransactionDateItem);
    return this;
  }

   /**
   * Latest posted transaction(s) to the account. May be more than one if they share the same timestamp
   * @return lastTransactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Latest posted transaction(s) to the account. May be more than one if they share the same timestamp")

  public List<CashFlowTransactionAnalyticsAttributesLastTransactionDateInner> getLastTransactionDate() {
    return lastTransactionDate;
  }


  public void setLastTransactionDate(List<CashFlowTransactionAnalyticsAttributesLastTransactionDateInner> lastTransactionDate) {
    
    
    
    this.lastTransactionDate = lastTransactionDate;
  }


  public CashFlowTransactionAnalyticsAttributes netCashFlowByMonthForTheReportTimePeriod(List<ObbDateRangeAndAmount> netCashFlowByMonthForTheReportTimePeriod) {
    
    
    
    
    this.netCashFlowByMonthForTheReportTimePeriod = netCashFlowByMonthForTheReportTimePeriod;
    return this;
  }

  public CashFlowTransactionAnalyticsAttributes addNetCashFlowByMonthForTheReportTimePeriodItem(ObbDateRangeAndAmount netCashFlowByMonthForTheReportTimePeriodItem) {
    if (this.netCashFlowByMonthForTheReportTimePeriod == null) {
      this.netCashFlowByMonthForTheReportTimePeriod = new ArrayList<>();
    }
    this.netCashFlowByMonthForTheReportTimePeriod.add(netCashFlowByMonthForTheReportTimePeriodItem);
    return this;
  }

   /**
   * Net cash flow for each month during the report period
   * @return netCashFlowByMonthForTheReportTimePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Net cash flow for each month during the report period")

  public List<ObbDateRangeAndAmount> getNetCashFlowByMonthForTheReportTimePeriod() {
    return netCashFlowByMonthForTheReportTimePeriod;
  }


  public void setNetCashFlowByMonthForTheReportTimePeriod(List<ObbDateRangeAndAmount> netCashFlowByMonthForTheReportTimePeriod) {
    
    
    
    this.netCashFlowByMonthForTheReportTimePeriod = netCashFlowByMonthForTheReportTimePeriod;
  }


  public CashFlowTransactionAnalyticsAttributes netCashFlowForTheReportTimePeriod(Double netCashFlowForTheReportTimePeriod) {
    
    
    
    
    this.netCashFlowForTheReportTimePeriod = netCashFlowForTheReportTimePeriod;
    return this;
  }

  public CashFlowTransactionAnalyticsAttributes netCashFlowForTheReportTimePeriod(Integer netCashFlowForTheReportTimePeriod) {
    
    
    
    
    this.netCashFlowForTheReportTimePeriod = netCashFlowForTheReportTimePeriod.doubleValue();
    return this;
  }

   /**
   * Net cash flow during the report period (may be positive or negative)
   * @return netCashFlowForTheReportTimePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1544.94", value = "Net cash flow during the report period (may be positive or negative)")

  public Double getNetCashFlowForTheReportTimePeriod() {
    return netCashFlowForTheReportTimePeriod;
  }


  public void setNetCashFlowForTheReportTimePeriod(Double netCashFlowForTheReportTimePeriod) {
    
    
    
    this.netCashFlowForTheReportTimePeriod = netCashFlowForTheReportTimePeriod;
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
   * @return the CashFlowTransactionAnalyticsAttributes instance itself
   */
  public CashFlowTransactionAnalyticsAttributes putAdditionalProperty(String key, Object value) {
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
    CashFlowTransactionAnalyticsAttributes cashFlowTransactionAnalyticsAttributes = (CashFlowTransactionAnalyticsAttributes) o;
    return Objects.equals(this.activityDepositsCreditsForTheReportTimePeriod, cashFlowTransactionAnalyticsAttributes.activityDepositsCreditsForTheReportTimePeriod) &&
        Objects.equals(this.activityWithdrawalsDebitsForTheReportTimePeriod, cashFlowTransactionAnalyticsAttributes.activityWithdrawalsDebitsForTheReportTimePeriod) &&
        Objects.equals(this.averageTransactionValueByMonthForTheReportTimePeriod, cashFlowTransactionAnalyticsAttributes.averageTransactionValueByMonthForTheReportTimePeriod) &&
        Objects.equals(this.historicWeeksWithZeroTransactions, cashFlowTransactionAnalyticsAttributes.historicWeeksWithZeroTransactions) &&
        Objects.equals(this.lastTransactionDate, cashFlowTransactionAnalyticsAttributes.lastTransactionDate) &&
        Objects.equals(this.netCashFlowByMonthForTheReportTimePeriod, cashFlowTransactionAnalyticsAttributes.netCashFlowByMonthForTheReportTimePeriod) &&
        Objects.equals(this.netCashFlowForTheReportTimePeriod, cashFlowTransactionAnalyticsAttributes.netCashFlowForTheReportTimePeriod)&&
        Objects.equals(this.additionalProperties, cashFlowTransactionAnalyticsAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityDepositsCreditsForTheReportTimePeriod, activityWithdrawalsDebitsForTheReportTimePeriod, averageTransactionValueByMonthForTheReportTimePeriod, historicWeeksWithZeroTransactions, lastTransactionDate, netCashFlowByMonthForTheReportTimePeriod, netCashFlowForTheReportTimePeriod, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowTransactionAnalyticsAttributes {\n");
    sb.append("    activityDepositsCreditsForTheReportTimePeriod: ").append(toIndentedString(activityDepositsCreditsForTheReportTimePeriod)).append("\n");
    sb.append("    activityWithdrawalsDebitsForTheReportTimePeriod: ").append(toIndentedString(activityWithdrawalsDebitsForTheReportTimePeriod)).append("\n");
    sb.append("    averageTransactionValueByMonthForTheReportTimePeriod: ").append(toIndentedString(averageTransactionValueByMonthForTheReportTimePeriod)).append("\n");
    sb.append("    historicWeeksWithZeroTransactions: ").append(toIndentedString(historicWeeksWithZeroTransactions)).append("\n");
    sb.append("    lastTransactionDate: ").append(toIndentedString(lastTransactionDate)).append("\n");
    sb.append("    netCashFlowByMonthForTheReportTimePeriod: ").append(toIndentedString(netCashFlowByMonthForTheReportTimePeriod)).append("\n");
    sb.append("    netCashFlowForTheReportTimePeriod: ").append(toIndentedString(netCashFlowForTheReportTimePeriod)).append("\n");
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
    openapiFields.add("activityDepositsCreditsForTheReportTimePeriod");
    openapiFields.add("activityWithdrawalsDebitsForTheReportTimePeriod");
    openapiFields.add("averageTransactionValueByMonthForTheReportTimePeriod");
    openapiFields.add("historicWeeksWithZeroTransactions");
    openapiFields.add("lastTransactionDate");
    openapiFields.add("netCashFlowByMonthForTheReportTimePeriod");
    openapiFields.add("netCashFlowForTheReportTimePeriod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("activityDepositsCreditsForTheReportTimePeriod");
    openapiRequiredFields.add("activityWithdrawalsDebitsForTheReportTimePeriod");
    openapiRequiredFields.add("averageTransactionValueByMonthForTheReportTimePeriod");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CashFlowTransactionAnalyticsAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CashFlowTransactionAnalyticsAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CashFlowTransactionAnalyticsAttributes is not found in the empty JSON string", CashFlowTransactionAnalyticsAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CashFlowTransactionAnalyticsAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("activityDepositsCreditsForTheReportTimePeriod").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `activityDepositsCreditsForTheReportTimePeriod` to be an array in the JSON string but got `%s`", jsonObj.get("activityDepositsCreditsForTheReportTimePeriod").toString()));
      }

      JsonArray jsonArrayactivityDepositsCreditsForTheReportTimePeriod = jsonObj.getAsJsonArray("activityDepositsCreditsForTheReportTimePeriod");
      // validate the required field `activityDepositsCreditsForTheReportTimePeriod` (array)
      for (int i = 0; i < jsonArrayactivityDepositsCreditsForTheReportTimePeriod.size(); i++) {
        CashFlowActivityDepositsCredits.validateJsonObject(jsonArrayactivityDepositsCreditsForTheReportTimePeriod.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("activityWithdrawalsDebitsForTheReportTimePeriod").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `activityWithdrawalsDebitsForTheReportTimePeriod` to be an array in the JSON string but got `%s`", jsonObj.get("activityWithdrawalsDebitsForTheReportTimePeriod").toString()));
      }

      JsonArray jsonArrayactivityWithdrawalsDebitsForTheReportTimePeriod = jsonObj.getAsJsonArray("activityWithdrawalsDebitsForTheReportTimePeriod");
      // validate the required field `activityWithdrawalsDebitsForTheReportTimePeriod` (array)
      for (int i = 0; i < jsonArrayactivityWithdrawalsDebitsForTheReportTimePeriod.size(); i++) {
        CashFlowActivityWithdrawalsDebits.validateJsonObject(jsonArrayactivityWithdrawalsDebitsForTheReportTimePeriod.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("averageTransactionValueByMonthForTheReportTimePeriod").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `averageTransactionValueByMonthForTheReportTimePeriod` to be an array in the JSON string but got `%s`", jsonObj.get("averageTransactionValueByMonthForTheReportTimePeriod").toString()));
      }

      JsonArray jsonArrayaverageTransactionValueByMonthForTheReportTimePeriod = jsonObj.getAsJsonArray("averageTransactionValueByMonthForTheReportTimePeriod");
      // validate the required field `averageTransactionValueByMonthForTheReportTimePeriod` (array)
      for (int i = 0; i < jsonArrayaverageTransactionValueByMonthForTheReportTimePeriod.size(); i++) {
        ObbDateRangeAndAmount.validateJsonObject(jsonArrayaverageTransactionValueByMonthForTheReportTimePeriod.get(i).getAsJsonObject());
      };
      // validate the optional field `historicWeeksWithZeroTransactions`
      if (jsonObj.get("historicWeeksWithZeroTransactions") != null && !jsonObj.get("historicWeeksWithZeroTransactions").isJsonNull()) {
        CashFlowNumWeeksZeros.validateJsonObject(jsonObj.getAsJsonObject("historicWeeksWithZeroTransactions"));
      }
      if (jsonObj.get("lastTransactionDate") != null && !jsonObj.get("lastTransactionDate").isJsonNull()) {
        JsonArray jsonArraylastTransactionDate = jsonObj.getAsJsonArray("lastTransactionDate");
        if (jsonArraylastTransactionDate != null) {
          // ensure the json data is an array
          if (!jsonObj.get("lastTransactionDate").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `lastTransactionDate` to be an array in the JSON string but got `%s`", jsonObj.get("lastTransactionDate").toString()));
          }

          // validate the optional field `lastTransactionDate` (array)
          for (int i = 0; i < jsonArraylastTransactionDate.size(); i++) {
            CashFlowTransactionAnalyticsAttributesLastTransactionDateInner.validateJsonObject(jsonArraylastTransactionDate.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("netCashFlowByMonthForTheReportTimePeriod") != null && !jsonObj.get("netCashFlowByMonthForTheReportTimePeriod").isJsonNull()) {
        JsonArray jsonArraynetCashFlowByMonthForTheReportTimePeriod = jsonObj.getAsJsonArray("netCashFlowByMonthForTheReportTimePeriod");
        if (jsonArraynetCashFlowByMonthForTheReportTimePeriod != null) {
          // ensure the json data is an array
          if (!jsonObj.get("netCashFlowByMonthForTheReportTimePeriod").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `netCashFlowByMonthForTheReportTimePeriod` to be an array in the JSON string but got `%s`", jsonObj.get("netCashFlowByMonthForTheReportTimePeriod").toString()));
          }

          // validate the optional field `netCashFlowByMonthForTheReportTimePeriod` (array)
          for (int i = 0; i < jsonArraynetCashFlowByMonthForTheReportTimePeriod.size(); i++) {
            ObbDateRangeAndAmount.validateJsonObject(jsonArraynetCashFlowByMonthForTheReportTimePeriod.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CashFlowTransactionAnalyticsAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CashFlowTransactionAnalyticsAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CashFlowTransactionAnalyticsAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CashFlowTransactionAnalyticsAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CashFlowTransactionAnalyticsAttributes>() {
           @Override
           public void write(JsonWriter out, CashFlowTransactionAnalyticsAttributes value) throws IOException {
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
           public CashFlowTransactionAnalyticsAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CashFlowTransactionAnalyticsAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CashFlowTransactionAnalyticsAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CashFlowTransactionAnalyticsAttributes
  * @throws IOException if the JSON string is invalid with respect to CashFlowTransactionAnalyticsAttributes
  */
  public static CashFlowTransactionAnalyticsAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CashFlowTransactionAnalyticsAttributes.class);
  }

 /**
  * Convert an instance of CashFlowTransactionAnalyticsAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

