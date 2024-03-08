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
import com.konfigthis.client.model.CashFlowMonthlyCashFlowCharacteristicsSummaries;
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
 * CashFlowCashFlowCharacteristicsSummary
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CashFlowCashFlowCharacteristicsSummary {
  public static final String SERIALIZED_NAME_MONTHLY_CASH_FLOW_CHARACTERISTICS_SUMMARIES = "monthlyCashFlowCharacteristicsSummaries";
  @SerializedName(SERIALIZED_NAME_MONTHLY_CASH_FLOW_CHARACTERISTICS_SUMMARIES)
  private List<CashFlowMonthlyCashFlowCharacteristicsSummaries> monthlyCashFlowCharacteristicsSummaries = null;

  public static final String SERIALIZED_NAME_AVERAGE_MONTHLY_NET = "averageMonthlyNet";
  @SerializedName(SERIALIZED_NAME_AVERAGE_MONTHLY_NET)
  private Double averageMonthlyNet;

  public static final String SERIALIZED_NAME_AVERAGE_MONTHLY_NET_LESS_TRANSFERS = "averageMonthlyNetLessTransfers";
  @SerializedName(SERIALIZED_NAME_AVERAGE_MONTHLY_NET_LESS_TRANSFERS)
  private Double averageMonthlyNetLessTransfers;

  public static final String SERIALIZED_NAME_TWELVE_MONTH_TOTAL_NET = "twelveMonthTotalNet";
  @SerializedName(SERIALIZED_NAME_TWELVE_MONTH_TOTAL_NET)
  private Double twelveMonthTotalNet;

  public static final String SERIALIZED_NAME_TWELVE_MONTH_TOTAL_NET_LESS_TRANSFERS = "twelveMonthTotalNetLessTransfers";
  @SerializedName(SERIALIZED_NAME_TWELVE_MONTH_TOTAL_NET_LESS_TRANSFERS)
  private Double twelveMonthTotalNetLessTransfers;

  public static final String SERIALIZED_NAME_SIX_MONTH_AVERAGE_TOTAL_CREDITS_LESS_TOTAL_DEBITS = "sixMonthAverageTotalCreditsLessTotalDebits";
  @SerializedName(SERIALIZED_NAME_SIX_MONTH_AVERAGE_TOTAL_CREDITS_LESS_TOTAL_DEBITS)
  private Double sixMonthAverageTotalCreditsLessTotalDebits;

  public static final String SERIALIZED_NAME_SIX_MONTH_AVERAGE_TOTAL_CREDITS_LESS_TOTAL_DEBITS_LESS_TRANSFERS = "sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers";
  @SerializedName(SERIALIZED_NAME_SIX_MONTH_AVERAGE_TOTAL_CREDITS_LESS_TOTAL_DEBITS_LESS_TRANSFERS)
  private Double sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers;

  public static final String SERIALIZED_NAME_TWO_MONTH_AVERAGE_TOTAL_CREDITS_LESS_TOTAL_DEBITS = "twoMonthAverageTotalCreditsLessTotalDebits";
  @SerializedName(SERIALIZED_NAME_TWO_MONTH_AVERAGE_TOTAL_CREDITS_LESS_TOTAL_DEBITS)
  private Double twoMonthAverageTotalCreditsLessTotalDebits;

  public static final String SERIALIZED_NAME_TWO_MONTH_AVERAGE_TOTAL_CREDITS_LESS_TOTAL_DEBITS_LESS_TRANSFERS = "twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers";
  @SerializedName(SERIALIZED_NAME_TWO_MONTH_AVERAGE_TOTAL_CREDITS_LESS_TOTAL_DEBITS_LESS_TRANSFERS)
  private Double twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers;

  public CashFlowCashFlowCharacteristicsSummary() {
  }

  public CashFlowCashFlowCharacteristicsSummary monthlyCashFlowCharacteristicsSummaries(List<CashFlowMonthlyCashFlowCharacteristicsSummaries> monthlyCashFlowCharacteristicsSummaries) {
    
    
    
    
    this.monthlyCashFlowCharacteristicsSummaries = monthlyCashFlowCharacteristicsSummaries;
    return this;
  }

  public CashFlowCashFlowCharacteristicsSummary addMonthlyCashFlowCharacteristicsSummariesItem(CashFlowMonthlyCashFlowCharacteristicsSummaries monthlyCashFlowCharacteristicsSummariesItem) {
    if (this.monthlyCashFlowCharacteristicsSummaries == null) {
      this.monthlyCashFlowCharacteristicsSummaries = new ArrayList<>();
    }
    this.monthlyCashFlowCharacteristicsSummaries.add(monthlyCashFlowCharacteristicsSummariesItem);
    return this;
  }

   /**
   * List of attributes for each month
   * @return monthlyCashFlowCharacteristicsSummaries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of attributes for each month")

  public List<CashFlowMonthlyCashFlowCharacteristicsSummaries> getMonthlyCashFlowCharacteristicsSummaries() {
    return monthlyCashFlowCharacteristicsSummaries;
  }


  public void setMonthlyCashFlowCharacteristicsSummaries(List<CashFlowMonthlyCashFlowCharacteristicsSummaries> monthlyCashFlowCharacteristicsSummaries) {
    
    
    
    this.monthlyCashFlowCharacteristicsSummaries = monthlyCashFlowCharacteristicsSummaries;
  }


  public CashFlowCashFlowCharacteristicsSummary averageMonthlyNet(Double averageMonthlyNet) {
    
    
    
    
    this.averageMonthlyNet = averageMonthlyNet;
    return this;
  }

  public CashFlowCashFlowCharacteristicsSummary averageMonthlyNet(Integer averageMonthlyNet) {
    
    
    
    
    this.averageMonthlyNet = averageMonthlyNet.doubleValue();
    return this;
  }

   /**
   * Average monthly net amount
   * @return averageMonthlyNet
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1250", required = true, value = "Average monthly net amount")

  public Double getAverageMonthlyNet() {
    return averageMonthlyNet;
  }


  public void setAverageMonthlyNet(Double averageMonthlyNet) {
    
    
    
    this.averageMonthlyNet = averageMonthlyNet;
  }


  public CashFlowCashFlowCharacteristicsSummary averageMonthlyNetLessTransfers(Double averageMonthlyNetLessTransfers) {
    
    
    
    
    this.averageMonthlyNetLessTransfers = averageMonthlyNetLessTransfers;
    return this;
  }

  public CashFlowCashFlowCharacteristicsSummary averageMonthlyNetLessTransfers(Integer averageMonthlyNetLessTransfers) {
    
    
    
    
    this.averageMonthlyNetLessTransfers = averageMonthlyNetLessTransfers.doubleValue();
    return this;
  }

   /**
   * Average monthly net less transfers
   * @return averageMonthlyNetLessTransfers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1000", required = true, value = "Average monthly net less transfers")

  public Double getAverageMonthlyNetLessTransfers() {
    return averageMonthlyNetLessTransfers;
  }


  public void setAverageMonthlyNetLessTransfers(Double averageMonthlyNetLessTransfers) {
    
    
    
    this.averageMonthlyNetLessTransfers = averageMonthlyNetLessTransfers;
  }


  public CashFlowCashFlowCharacteristicsSummary twelveMonthTotalNet(Double twelveMonthTotalNet) {
    
    
    
    
    this.twelveMonthTotalNet = twelveMonthTotalNet;
    return this;
  }

  public CashFlowCashFlowCharacteristicsSummary twelveMonthTotalNet(Integer twelveMonthTotalNet) {
    
    
    
    
    this.twelveMonthTotalNet = twelveMonthTotalNet.doubleValue();
    return this;
  }

   /**
   * Sum of all monthly (Total Credits - Total Debits) each month by the account
   * @return twelveMonthTotalNet
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12500", required = true, value = "Sum of all monthly (Total Credits - Total Debits) each month by the account")

  public Double getTwelveMonthTotalNet() {
    return twelveMonthTotalNet;
  }


  public void setTwelveMonthTotalNet(Double twelveMonthTotalNet) {
    
    
    
    this.twelveMonthTotalNet = twelveMonthTotalNet;
  }


  public CashFlowCashFlowCharacteristicsSummary twelveMonthTotalNetLessTransfers(Double twelveMonthTotalNetLessTransfers) {
    
    
    
    
    this.twelveMonthTotalNetLessTransfers = twelveMonthTotalNetLessTransfers;
    return this;
  }

  public CashFlowCashFlowCharacteristicsSummary twelveMonthTotalNetLessTransfers(Integer twelveMonthTotalNetLessTransfers) {
    
    
    
    
    this.twelveMonthTotalNetLessTransfers = twelveMonthTotalNetLessTransfers.doubleValue();
    return this;
  }

   /**
   * Sum of all monthly (Total Credits - Total Debits) without transfers by the account
   * @return twelveMonthTotalNetLessTransfers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12400", required = true, value = "Sum of all monthly (Total Credits - Total Debits) without transfers by the account")

  public Double getTwelveMonthTotalNetLessTransfers() {
    return twelveMonthTotalNetLessTransfers;
  }


  public void setTwelveMonthTotalNetLessTransfers(Double twelveMonthTotalNetLessTransfers) {
    
    
    
    this.twelveMonthTotalNetLessTransfers = twelveMonthTotalNetLessTransfers;
  }


  public CashFlowCashFlowCharacteristicsSummary sixMonthAverageTotalCreditsLessTotalDebits(Double sixMonthAverageTotalCreditsLessTotalDebits) {
    
    
    
    
    this.sixMonthAverageTotalCreditsLessTotalDebits = sixMonthAverageTotalCreditsLessTotalDebits;
    return this;
  }

  public CashFlowCashFlowCharacteristicsSummary sixMonthAverageTotalCreditsLessTotalDebits(Integer sixMonthAverageTotalCreditsLessTotalDebits) {
    
    
    
    
    this.sixMonthAverageTotalCreditsLessTotalDebits = sixMonthAverageTotalCreditsLessTotalDebits.doubleValue();
    return this;
  }

   /**
   * 6 Month Average (Total Credits - Total Debits) across all accounts
   * @return sixMonthAverageTotalCreditsLessTotalDebits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "55555", required = true, value = "6 Month Average (Total Credits - Total Debits) across all accounts")

  public Double getSixMonthAverageTotalCreditsLessTotalDebits() {
    return sixMonthAverageTotalCreditsLessTotalDebits;
  }


  public void setSixMonthAverageTotalCreditsLessTotalDebits(Double sixMonthAverageTotalCreditsLessTotalDebits) {
    
    
    
    this.sixMonthAverageTotalCreditsLessTotalDebits = sixMonthAverageTotalCreditsLessTotalDebits;
  }


  public CashFlowCashFlowCharacteristicsSummary sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers(Double sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers) {
    
    
    
    
    this.sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers = sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers;
    return this;
  }

  public CashFlowCashFlowCharacteristicsSummary sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers(Integer sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers) {
    
    
    
    
    this.sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers = sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers.doubleValue();
    return this;
  }

   /**
   * 6 Month Average (Total Credits - Total Debits) - (Without Transfers) across all accounts
   * @return sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "55555", required = true, value = "6 Month Average (Total Credits - Total Debits) - (Without Transfers) across all accounts")

  public Double getSixMonthAverageTotalCreditsLessTotalDebitsLessTransfers() {
    return sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers;
  }


  public void setSixMonthAverageTotalCreditsLessTotalDebitsLessTransfers(Double sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers) {
    
    
    
    this.sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers = sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers;
  }


  public CashFlowCashFlowCharacteristicsSummary twoMonthAverageTotalCreditsLessTotalDebits(Double twoMonthAverageTotalCreditsLessTotalDebits) {
    
    
    
    
    this.twoMonthAverageTotalCreditsLessTotalDebits = twoMonthAverageTotalCreditsLessTotalDebits;
    return this;
  }

  public CashFlowCashFlowCharacteristicsSummary twoMonthAverageTotalCreditsLessTotalDebits(Integer twoMonthAverageTotalCreditsLessTotalDebits) {
    
    
    
    
    this.twoMonthAverageTotalCreditsLessTotalDebits = twoMonthAverageTotalCreditsLessTotalDebits.doubleValue();
    return this;
  }

   /**
   * 2 Month Average (Total Credits - Total Debits) across all accounts
   * @return twoMonthAverageTotalCreditsLessTotalDebits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "55555", required = true, value = "2 Month Average (Total Credits - Total Debits) across all accounts")

  public Double getTwoMonthAverageTotalCreditsLessTotalDebits() {
    return twoMonthAverageTotalCreditsLessTotalDebits;
  }


  public void setTwoMonthAverageTotalCreditsLessTotalDebits(Double twoMonthAverageTotalCreditsLessTotalDebits) {
    
    
    
    this.twoMonthAverageTotalCreditsLessTotalDebits = twoMonthAverageTotalCreditsLessTotalDebits;
  }


  public CashFlowCashFlowCharacteristicsSummary twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers(Double twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers) {
    
    
    
    
    this.twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers = twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers;
    return this;
  }

  public CashFlowCashFlowCharacteristicsSummary twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers(Integer twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers) {
    
    
    
    
    this.twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers = twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers.doubleValue();
    return this;
  }

   /**
   * 2 Month Average (Total Credits - Total Debits) - (Without Transfers) across all accounts
   * @return twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "55555", value = "2 Month Average (Total Credits - Total Debits) - (Without Transfers) across all accounts")

  public Double getTwoMonthAverageTotalCreditsLessTotalDebitsLessTransfers() {
    return twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers;
  }


  public void setTwoMonthAverageTotalCreditsLessTotalDebitsLessTransfers(Double twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers) {
    
    
    
    this.twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers = twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers;
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
   * @return the CashFlowCashFlowCharacteristicsSummary instance itself
   */
  public CashFlowCashFlowCharacteristicsSummary putAdditionalProperty(String key, Object value) {
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
    CashFlowCashFlowCharacteristicsSummary cashFlowCashFlowCharacteristicsSummary = (CashFlowCashFlowCharacteristicsSummary) o;
    return Objects.equals(this.monthlyCashFlowCharacteristicsSummaries, cashFlowCashFlowCharacteristicsSummary.monthlyCashFlowCharacteristicsSummaries) &&
        Objects.equals(this.averageMonthlyNet, cashFlowCashFlowCharacteristicsSummary.averageMonthlyNet) &&
        Objects.equals(this.averageMonthlyNetLessTransfers, cashFlowCashFlowCharacteristicsSummary.averageMonthlyNetLessTransfers) &&
        Objects.equals(this.twelveMonthTotalNet, cashFlowCashFlowCharacteristicsSummary.twelveMonthTotalNet) &&
        Objects.equals(this.twelveMonthTotalNetLessTransfers, cashFlowCashFlowCharacteristicsSummary.twelveMonthTotalNetLessTransfers) &&
        Objects.equals(this.sixMonthAverageTotalCreditsLessTotalDebits, cashFlowCashFlowCharacteristicsSummary.sixMonthAverageTotalCreditsLessTotalDebits) &&
        Objects.equals(this.sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers, cashFlowCashFlowCharacteristicsSummary.sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers) &&
        Objects.equals(this.twoMonthAverageTotalCreditsLessTotalDebits, cashFlowCashFlowCharacteristicsSummary.twoMonthAverageTotalCreditsLessTotalDebits) &&
        Objects.equals(this.twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers, cashFlowCashFlowCharacteristicsSummary.twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers)&&
        Objects.equals(this.additionalProperties, cashFlowCashFlowCharacteristicsSummary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthlyCashFlowCharacteristicsSummaries, averageMonthlyNet, averageMonthlyNetLessTransfers, twelveMonthTotalNet, twelveMonthTotalNetLessTransfers, sixMonthAverageTotalCreditsLessTotalDebits, sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers, twoMonthAverageTotalCreditsLessTotalDebits, twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowCashFlowCharacteristicsSummary {\n");
    sb.append("    monthlyCashFlowCharacteristicsSummaries: ").append(toIndentedString(monthlyCashFlowCharacteristicsSummaries)).append("\n");
    sb.append("    averageMonthlyNet: ").append(toIndentedString(averageMonthlyNet)).append("\n");
    sb.append("    averageMonthlyNetLessTransfers: ").append(toIndentedString(averageMonthlyNetLessTransfers)).append("\n");
    sb.append("    twelveMonthTotalNet: ").append(toIndentedString(twelveMonthTotalNet)).append("\n");
    sb.append("    twelveMonthTotalNetLessTransfers: ").append(toIndentedString(twelveMonthTotalNetLessTransfers)).append("\n");
    sb.append("    sixMonthAverageTotalCreditsLessTotalDebits: ").append(toIndentedString(sixMonthAverageTotalCreditsLessTotalDebits)).append("\n");
    sb.append("    sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers: ").append(toIndentedString(sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers)).append("\n");
    sb.append("    twoMonthAverageTotalCreditsLessTotalDebits: ").append(toIndentedString(twoMonthAverageTotalCreditsLessTotalDebits)).append("\n");
    sb.append("    twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers: ").append(toIndentedString(twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers)).append("\n");
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
    openapiFields.add("monthlyCashFlowCharacteristicsSummaries");
    openapiFields.add("averageMonthlyNet");
    openapiFields.add("averageMonthlyNetLessTransfers");
    openapiFields.add("twelveMonthTotalNet");
    openapiFields.add("twelveMonthTotalNetLessTransfers");
    openapiFields.add("sixMonthAverageTotalCreditsLessTotalDebits");
    openapiFields.add("sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers");
    openapiFields.add("twoMonthAverageTotalCreditsLessTotalDebits");
    openapiFields.add("twoMonthAverageTotalCreditsLessTotalDebitsLessTransfers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("averageMonthlyNet");
    openapiRequiredFields.add("averageMonthlyNetLessTransfers");
    openapiRequiredFields.add("twelveMonthTotalNet");
    openapiRequiredFields.add("twelveMonthTotalNetLessTransfers");
    openapiRequiredFields.add("sixMonthAverageTotalCreditsLessTotalDebits");
    openapiRequiredFields.add("sixMonthAverageTotalCreditsLessTotalDebitsLessTransfers");
    openapiRequiredFields.add("twoMonthAverageTotalCreditsLessTotalDebits");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CashFlowCashFlowCharacteristicsSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CashFlowCashFlowCharacteristicsSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CashFlowCashFlowCharacteristicsSummary is not found in the empty JSON string", CashFlowCashFlowCharacteristicsSummary.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CashFlowCashFlowCharacteristicsSummary.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("monthlyCashFlowCharacteristicsSummaries") != null && !jsonObj.get("monthlyCashFlowCharacteristicsSummaries").isJsonNull()) {
        JsonArray jsonArraymonthlyCashFlowCharacteristicsSummaries = jsonObj.getAsJsonArray("monthlyCashFlowCharacteristicsSummaries");
        if (jsonArraymonthlyCashFlowCharacteristicsSummaries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("monthlyCashFlowCharacteristicsSummaries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `monthlyCashFlowCharacteristicsSummaries` to be an array in the JSON string but got `%s`", jsonObj.get("monthlyCashFlowCharacteristicsSummaries").toString()));
          }

          // validate the optional field `monthlyCashFlowCharacteristicsSummaries` (array)
          for (int i = 0; i < jsonArraymonthlyCashFlowCharacteristicsSummaries.size(); i++) {
            CashFlowMonthlyCashFlowCharacteristicsSummaries.validateJsonObject(jsonArraymonthlyCashFlowCharacteristicsSummaries.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CashFlowCashFlowCharacteristicsSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CashFlowCashFlowCharacteristicsSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CashFlowCashFlowCharacteristicsSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CashFlowCashFlowCharacteristicsSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<CashFlowCashFlowCharacteristicsSummary>() {
           @Override
           public void write(JsonWriter out, CashFlowCashFlowCharacteristicsSummary value) throws IOException {
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
           public CashFlowCashFlowCharacteristicsSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CashFlowCashFlowCharacteristicsSummary instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CashFlowCashFlowCharacteristicsSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CashFlowCashFlowCharacteristicsSummary
  * @throws IOException if the JSON string is invalid with respect to CashFlowCashFlowCharacteristicsSummary
  */
  public static CashFlowCashFlowCharacteristicsSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CashFlowCashFlowCharacteristicsSummary.class);
  }

 /**
  * Convert an instance of CashFlowCashFlowCharacteristicsSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
