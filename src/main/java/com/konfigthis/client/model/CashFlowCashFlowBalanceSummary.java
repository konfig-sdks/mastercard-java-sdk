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
import com.konfigthis.client.model.CashFlowMonthlyCashFlowBalanceSummaries;
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
 * CashFlowCashFlowBalanceSummary
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CashFlowCashFlowBalanceSummary {
  public static final String SERIALIZED_NAME_MONTHLY_CASH_FLOW_BALANCE_SUMMARIES = "monthlyCashFlowBalanceSummaries";
  @SerializedName(SERIALIZED_NAME_MONTHLY_CASH_FLOW_BALANCE_SUMMARIES)
  private List<CashFlowMonthlyCashFlowBalanceSummaries> monthlyCashFlowBalanceSummaries = new ArrayList<>();

  public static final String SERIALIZED_NAME_MIN_DAILY_BALANCE = "minDailyBalance";
  @SerializedName(SERIALIZED_NAME_MIN_DAILY_BALANCE)
  private Double minDailyBalance;

  public static final String SERIALIZED_NAME_MAX_DAILY_BALANCE = "maxDailyBalance";
  @SerializedName(SERIALIZED_NAME_MAX_DAILY_BALANCE)
  private Double maxDailyBalance;

  public static final String SERIALIZED_NAME_TWELVE_MONTH_AVERAGE_DAILY_BALANCE = "twelveMonthAverageDailyBalance";
  @SerializedName(SERIALIZED_NAME_TWELVE_MONTH_AVERAGE_DAILY_BALANCE)
  private Double twelveMonthAverageDailyBalance;

  public static final String SERIALIZED_NAME_SIX_MONTH_AVERAGE_DAILY_BALANCE = "sixMonthAverageDailyBalance";
  @SerializedName(SERIALIZED_NAME_SIX_MONTH_AVERAGE_DAILY_BALANCE)
  private Double sixMonthAverageDailyBalance;

  public static final String SERIALIZED_NAME_TWO_MONTH_AVERAGE_DAILY_BALANCE = "twoMonthAverageDailyBalance";
  @SerializedName(SERIALIZED_NAME_TWO_MONTH_AVERAGE_DAILY_BALANCE)
  private Double twoMonthAverageDailyBalance;

  public static final String SERIALIZED_NAME_TWELVE_MONTH_STANDARD_DEVIATION_OF_DAILY_BALANCE = "twelveMonthStandardDeviationOfDailyBalance";
  @SerializedName(SERIALIZED_NAME_TWELVE_MONTH_STANDARD_DEVIATION_OF_DAILY_BALANCE)
  private String twelveMonthStandardDeviationOfDailyBalance;

  public static final String SERIALIZED_NAME_SIX_MONTH_STANDARD_DEVIATION_OF_DAILY_BALANCE = "sixMonthStandardDeviationOfDailyBalance";
  @SerializedName(SERIALIZED_NAME_SIX_MONTH_STANDARD_DEVIATION_OF_DAILY_BALANCE)
  private String sixMonthStandardDeviationOfDailyBalance;

  public static final String SERIALIZED_NAME_TWO_MONTH_STANDARD_DEVIATION_OF_DAILY_BALANCE = "twoMonthStandardDeviationOfDailyBalance";
  @SerializedName(SERIALIZED_NAME_TWO_MONTH_STANDARD_DEVIATION_OF_DAILY_BALANCE)
  private String twoMonthStandardDeviationOfDailyBalance;

  public static final String SERIALIZED_NAME_NUMBER_OF_DAYS_NEGATIVE_BALANCE = "numberOfDaysNegativeBalance";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_DAYS_NEGATIVE_BALANCE)
  private String numberOfDaysNegativeBalance;

  public static final String SERIALIZED_NAME_NUMBER_OF_DAYS_POSITIVE_BALANCE = "numberOfDaysPositiveBalance";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_DAYS_POSITIVE_BALANCE)
  private String numberOfDaysPositiveBalance;

  public CashFlowCashFlowBalanceSummary() {
  }

  public CashFlowCashFlowBalanceSummary monthlyCashFlowBalanceSummaries(List<CashFlowMonthlyCashFlowBalanceSummaries> monthlyCashFlowBalanceSummaries) {
    
    
    
    
    this.monthlyCashFlowBalanceSummaries = monthlyCashFlowBalanceSummaries;
    return this;
  }

  public CashFlowCashFlowBalanceSummary addMonthlyCashFlowBalanceSummariesItem(CashFlowMonthlyCashFlowBalanceSummaries monthlyCashFlowBalanceSummariesItem) {
    this.monthlyCashFlowBalanceSummaries.add(monthlyCashFlowBalanceSummariesItem);
    return this;
  }

   /**
   * List of attributes for each month
   * @return monthlyCashFlowBalanceSummaries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of attributes for each month")

  public List<CashFlowMonthlyCashFlowBalanceSummaries> getMonthlyCashFlowBalanceSummaries() {
    return monthlyCashFlowBalanceSummaries;
  }


  public void setMonthlyCashFlowBalanceSummaries(List<CashFlowMonthlyCashFlowBalanceSummaries> monthlyCashFlowBalanceSummaries) {
    
    
    
    this.monthlyCashFlowBalanceSummaries = monthlyCashFlowBalanceSummaries;
  }


  public CashFlowCashFlowBalanceSummary minDailyBalance(Double minDailyBalance) {
    
    
    
    
    this.minDailyBalance = minDailyBalance;
    return this;
  }

  public CashFlowCashFlowBalanceSummary minDailyBalance(Integer minDailyBalance) {
    
    
    
    
    this.minDailyBalance = minDailyBalance.doubleValue();
    return this;
  }

   /**
   * Min Daily Balance across entire transaction history  for all accounts
   * @return minDailyBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3479.39", required = true, value = "Min Daily Balance across entire transaction history  for all accounts")

  public Double getMinDailyBalance() {
    return minDailyBalance;
  }


  public void setMinDailyBalance(Double minDailyBalance) {
    
    
    
    this.minDailyBalance = minDailyBalance;
  }


  public CashFlowCashFlowBalanceSummary maxDailyBalance(Double maxDailyBalance) {
    
    
    
    
    this.maxDailyBalance = maxDailyBalance;
    return this;
  }

  public CashFlowCashFlowBalanceSummary maxDailyBalance(Integer maxDailyBalance) {
    
    
    
    
    this.maxDailyBalance = maxDailyBalance.doubleValue();
    return this;
  }

   /**
   * Max Daily Balance across entire transaction history for all accounts
   * @return maxDailyBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3479.39", required = true, value = "Max Daily Balance across entire transaction history for all accounts")

  public Double getMaxDailyBalance() {
    return maxDailyBalance;
  }


  public void setMaxDailyBalance(Double maxDailyBalance) {
    
    
    
    this.maxDailyBalance = maxDailyBalance;
  }


  public CashFlowCashFlowBalanceSummary twelveMonthAverageDailyBalance(Double twelveMonthAverageDailyBalance) {
    
    
    
    
    this.twelveMonthAverageDailyBalance = twelveMonthAverageDailyBalance;
    return this;
  }

  public CashFlowCashFlowBalanceSummary twelveMonthAverageDailyBalance(Integer twelveMonthAverageDailyBalance) {
    
    
    
    
    this.twelveMonthAverageDailyBalance = twelveMonthAverageDailyBalance.doubleValue();
    return this;
  }

   /**
   * Average Daily Balance across twelve months for all accounts
   * @return twelveMonthAverageDailyBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3479.39", required = true, value = "Average Daily Balance across twelve months for all accounts")

  public Double getTwelveMonthAverageDailyBalance() {
    return twelveMonthAverageDailyBalance;
  }


  public void setTwelveMonthAverageDailyBalance(Double twelveMonthAverageDailyBalance) {
    
    
    
    this.twelveMonthAverageDailyBalance = twelveMonthAverageDailyBalance;
  }


  public CashFlowCashFlowBalanceSummary sixMonthAverageDailyBalance(Double sixMonthAverageDailyBalance) {
    
    
    
    
    this.sixMonthAverageDailyBalance = sixMonthAverageDailyBalance;
    return this;
  }

  public CashFlowCashFlowBalanceSummary sixMonthAverageDailyBalance(Integer sixMonthAverageDailyBalance) {
    
    
    
    
    this.sixMonthAverageDailyBalance = sixMonthAverageDailyBalance.doubleValue();
    return this;
  }

   /**
   * Average Daily Balance across six months for all accounts
   * @return sixMonthAverageDailyBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3479.39", required = true, value = "Average Daily Balance across six months for all accounts")

  public Double getSixMonthAverageDailyBalance() {
    return sixMonthAverageDailyBalance;
  }


  public void setSixMonthAverageDailyBalance(Double sixMonthAverageDailyBalance) {
    
    
    
    this.sixMonthAverageDailyBalance = sixMonthAverageDailyBalance;
  }


  public CashFlowCashFlowBalanceSummary twoMonthAverageDailyBalance(Double twoMonthAverageDailyBalance) {
    
    
    
    
    this.twoMonthAverageDailyBalance = twoMonthAverageDailyBalance;
    return this;
  }

  public CashFlowCashFlowBalanceSummary twoMonthAverageDailyBalance(Integer twoMonthAverageDailyBalance) {
    
    
    
    
    this.twoMonthAverageDailyBalance = twoMonthAverageDailyBalance.doubleValue();
    return this;
  }

   /**
   * Average Daily Balance across two months for all accounts
   * @return twoMonthAverageDailyBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3479.39", required = true, value = "Average Daily Balance across two months for all accounts")

  public Double getTwoMonthAverageDailyBalance() {
    return twoMonthAverageDailyBalance;
  }


  public void setTwoMonthAverageDailyBalance(Double twoMonthAverageDailyBalance) {
    
    
    
    this.twoMonthAverageDailyBalance = twoMonthAverageDailyBalance;
  }


  public CashFlowCashFlowBalanceSummary twelveMonthStandardDeviationOfDailyBalance(String twelveMonthStandardDeviationOfDailyBalance) {
    
    
    
    
    this.twelveMonthStandardDeviationOfDailyBalance = twelveMonthStandardDeviationOfDailyBalance;
    return this;
  }

   /**
   * Standard Deviation of Daily Balance across twelve months for all accounts
   * @return twelveMonthStandardDeviationOfDailyBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20", required = true, value = "Standard Deviation of Daily Balance across twelve months for all accounts")

  public String getTwelveMonthStandardDeviationOfDailyBalance() {
    return twelveMonthStandardDeviationOfDailyBalance;
  }


  public void setTwelveMonthStandardDeviationOfDailyBalance(String twelveMonthStandardDeviationOfDailyBalance) {
    
    
    
    this.twelveMonthStandardDeviationOfDailyBalance = twelveMonthStandardDeviationOfDailyBalance;
  }


  public CashFlowCashFlowBalanceSummary sixMonthStandardDeviationOfDailyBalance(String sixMonthStandardDeviationOfDailyBalance) {
    
    
    
    
    this.sixMonthStandardDeviationOfDailyBalance = sixMonthStandardDeviationOfDailyBalance;
    return this;
  }

   /**
   * Standard Deviation of Daily Balance across six months for all accounts
   * @return sixMonthStandardDeviationOfDailyBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "Standard Deviation of Daily Balance across six months for all accounts")

  public String getSixMonthStandardDeviationOfDailyBalance() {
    return sixMonthStandardDeviationOfDailyBalance;
  }


  public void setSixMonthStandardDeviationOfDailyBalance(String sixMonthStandardDeviationOfDailyBalance) {
    
    
    
    this.sixMonthStandardDeviationOfDailyBalance = sixMonthStandardDeviationOfDailyBalance;
  }


  public CashFlowCashFlowBalanceSummary twoMonthStandardDeviationOfDailyBalance(String twoMonthStandardDeviationOfDailyBalance) {
    
    
    
    
    this.twoMonthStandardDeviationOfDailyBalance = twoMonthStandardDeviationOfDailyBalance;
    return this;
  }

   /**
   * Standard Deviation of Daily Balance across two months for all accounts
   * @return twoMonthStandardDeviationOfDailyBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20", required = true, value = "Standard Deviation of Daily Balance across two months for all accounts")

  public String getTwoMonthStandardDeviationOfDailyBalance() {
    return twoMonthStandardDeviationOfDailyBalance;
  }


  public void setTwoMonthStandardDeviationOfDailyBalance(String twoMonthStandardDeviationOfDailyBalance) {
    
    
    
    this.twoMonthStandardDeviationOfDailyBalance = twoMonthStandardDeviationOfDailyBalance;
  }


  public CashFlowCashFlowBalanceSummary numberOfDaysNegativeBalance(String numberOfDaysNegativeBalance) {
    
    
    
    
    this.numberOfDaysNegativeBalance = numberOfDaysNegativeBalance;
    return this;
  }

   /**
   * Number of Days Negative Balance over entire transaction history for all accounts
   * @return numberOfDaysNegativeBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6", required = true, value = "Number of Days Negative Balance over entire transaction history for all accounts")

  public String getNumberOfDaysNegativeBalance() {
    return numberOfDaysNegativeBalance;
  }


  public void setNumberOfDaysNegativeBalance(String numberOfDaysNegativeBalance) {
    
    
    
    this.numberOfDaysNegativeBalance = numberOfDaysNegativeBalance;
  }


  public CashFlowCashFlowBalanceSummary numberOfDaysPositiveBalance(String numberOfDaysPositiveBalance) {
    
    
    
    
    this.numberOfDaysPositiveBalance = numberOfDaysPositiveBalance;
    return this;
  }

   /**
   * Number of Days Positive Balance over entire transaction history for all accounts
   * @return numberOfDaysPositiveBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "11", required = true, value = "Number of Days Positive Balance over entire transaction history for all accounts")

  public String getNumberOfDaysPositiveBalance() {
    return numberOfDaysPositiveBalance;
  }


  public void setNumberOfDaysPositiveBalance(String numberOfDaysPositiveBalance) {
    
    
    
    this.numberOfDaysPositiveBalance = numberOfDaysPositiveBalance;
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
   * @return the CashFlowCashFlowBalanceSummary instance itself
   */
  public CashFlowCashFlowBalanceSummary putAdditionalProperty(String key, Object value) {
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
    CashFlowCashFlowBalanceSummary cashFlowCashFlowBalanceSummary = (CashFlowCashFlowBalanceSummary) o;
    return Objects.equals(this.monthlyCashFlowBalanceSummaries, cashFlowCashFlowBalanceSummary.monthlyCashFlowBalanceSummaries) &&
        Objects.equals(this.minDailyBalance, cashFlowCashFlowBalanceSummary.minDailyBalance) &&
        Objects.equals(this.maxDailyBalance, cashFlowCashFlowBalanceSummary.maxDailyBalance) &&
        Objects.equals(this.twelveMonthAverageDailyBalance, cashFlowCashFlowBalanceSummary.twelveMonthAverageDailyBalance) &&
        Objects.equals(this.sixMonthAverageDailyBalance, cashFlowCashFlowBalanceSummary.sixMonthAverageDailyBalance) &&
        Objects.equals(this.twoMonthAverageDailyBalance, cashFlowCashFlowBalanceSummary.twoMonthAverageDailyBalance) &&
        Objects.equals(this.twelveMonthStandardDeviationOfDailyBalance, cashFlowCashFlowBalanceSummary.twelveMonthStandardDeviationOfDailyBalance) &&
        Objects.equals(this.sixMonthStandardDeviationOfDailyBalance, cashFlowCashFlowBalanceSummary.sixMonthStandardDeviationOfDailyBalance) &&
        Objects.equals(this.twoMonthStandardDeviationOfDailyBalance, cashFlowCashFlowBalanceSummary.twoMonthStandardDeviationOfDailyBalance) &&
        Objects.equals(this.numberOfDaysNegativeBalance, cashFlowCashFlowBalanceSummary.numberOfDaysNegativeBalance) &&
        Objects.equals(this.numberOfDaysPositiveBalance, cashFlowCashFlowBalanceSummary.numberOfDaysPositiveBalance)&&
        Objects.equals(this.additionalProperties, cashFlowCashFlowBalanceSummary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthlyCashFlowBalanceSummaries, minDailyBalance, maxDailyBalance, twelveMonthAverageDailyBalance, sixMonthAverageDailyBalance, twoMonthAverageDailyBalance, twelveMonthStandardDeviationOfDailyBalance, sixMonthStandardDeviationOfDailyBalance, twoMonthStandardDeviationOfDailyBalance, numberOfDaysNegativeBalance, numberOfDaysPositiveBalance, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowCashFlowBalanceSummary {\n");
    sb.append("    monthlyCashFlowBalanceSummaries: ").append(toIndentedString(monthlyCashFlowBalanceSummaries)).append("\n");
    sb.append("    minDailyBalance: ").append(toIndentedString(minDailyBalance)).append("\n");
    sb.append("    maxDailyBalance: ").append(toIndentedString(maxDailyBalance)).append("\n");
    sb.append("    twelveMonthAverageDailyBalance: ").append(toIndentedString(twelveMonthAverageDailyBalance)).append("\n");
    sb.append("    sixMonthAverageDailyBalance: ").append(toIndentedString(sixMonthAverageDailyBalance)).append("\n");
    sb.append("    twoMonthAverageDailyBalance: ").append(toIndentedString(twoMonthAverageDailyBalance)).append("\n");
    sb.append("    twelveMonthStandardDeviationOfDailyBalance: ").append(toIndentedString(twelveMonthStandardDeviationOfDailyBalance)).append("\n");
    sb.append("    sixMonthStandardDeviationOfDailyBalance: ").append(toIndentedString(sixMonthStandardDeviationOfDailyBalance)).append("\n");
    sb.append("    twoMonthStandardDeviationOfDailyBalance: ").append(toIndentedString(twoMonthStandardDeviationOfDailyBalance)).append("\n");
    sb.append("    numberOfDaysNegativeBalance: ").append(toIndentedString(numberOfDaysNegativeBalance)).append("\n");
    sb.append("    numberOfDaysPositiveBalance: ").append(toIndentedString(numberOfDaysPositiveBalance)).append("\n");
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
    openapiFields.add("monthlyCashFlowBalanceSummaries");
    openapiFields.add("minDailyBalance");
    openapiFields.add("maxDailyBalance");
    openapiFields.add("twelveMonthAverageDailyBalance");
    openapiFields.add("sixMonthAverageDailyBalance");
    openapiFields.add("twoMonthAverageDailyBalance");
    openapiFields.add("twelveMonthStandardDeviationOfDailyBalance");
    openapiFields.add("sixMonthStandardDeviationOfDailyBalance");
    openapiFields.add("twoMonthStandardDeviationOfDailyBalance");
    openapiFields.add("numberOfDaysNegativeBalance");
    openapiFields.add("numberOfDaysPositiveBalance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("monthlyCashFlowBalanceSummaries");
    openapiRequiredFields.add("minDailyBalance");
    openapiRequiredFields.add("maxDailyBalance");
    openapiRequiredFields.add("twelveMonthAverageDailyBalance");
    openapiRequiredFields.add("sixMonthAverageDailyBalance");
    openapiRequiredFields.add("twoMonthAverageDailyBalance");
    openapiRequiredFields.add("twelveMonthStandardDeviationOfDailyBalance");
    openapiRequiredFields.add("twoMonthStandardDeviationOfDailyBalance");
    openapiRequiredFields.add("numberOfDaysNegativeBalance");
    openapiRequiredFields.add("numberOfDaysPositiveBalance");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CashFlowCashFlowBalanceSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CashFlowCashFlowBalanceSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CashFlowCashFlowBalanceSummary is not found in the empty JSON string", CashFlowCashFlowBalanceSummary.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CashFlowCashFlowBalanceSummary.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("monthlyCashFlowBalanceSummaries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `monthlyCashFlowBalanceSummaries` to be an array in the JSON string but got `%s`", jsonObj.get("monthlyCashFlowBalanceSummaries").toString()));
      }

      JsonArray jsonArraymonthlyCashFlowBalanceSummaries = jsonObj.getAsJsonArray("monthlyCashFlowBalanceSummaries");
      // validate the required field `monthlyCashFlowBalanceSummaries` (array)
      for (int i = 0; i < jsonArraymonthlyCashFlowBalanceSummaries.size(); i++) {
        CashFlowMonthlyCashFlowBalanceSummaries.validateJsonObject(jsonArraymonthlyCashFlowBalanceSummaries.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("twelveMonthStandardDeviationOfDailyBalance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twelveMonthStandardDeviationOfDailyBalance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twelveMonthStandardDeviationOfDailyBalance").toString()));
      }
      if ((jsonObj.get("sixMonthStandardDeviationOfDailyBalance") != null && !jsonObj.get("sixMonthStandardDeviationOfDailyBalance").isJsonNull()) && !jsonObj.get("sixMonthStandardDeviationOfDailyBalance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sixMonthStandardDeviationOfDailyBalance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sixMonthStandardDeviationOfDailyBalance").toString()));
      }
      if (!jsonObj.get("twoMonthStandardDeviationOfDailyBalance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twoMonthStandardDeviationOfDailyBalance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twoMonthStandardDeviationOfDailyBalance").toString()));
      }
      if (!jsonObj.get("numberOfDaysNegativeBalance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberOfDaysNegativeBalance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberOfDaysNegativeBalance").toString()));
      }
      if (!jsonObj.get("numberOfDaysPositiveBalance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberOfDaysPositiveBalance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberOfDaysPositiveBalance").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CashFlowCashFlowBalanceSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CashFlowCashFlowBalanceSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CashFlowCashFlowBalanceSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CashFlowCashFlowBalanceSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<CashFlowCashFlowBalanceSummary>() {
           @Override
           public void write(JsonWriter out, CashFlowCashFlowBalanceSummary value) throws IOException {
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
           public CashFlowCashFlowBalanceSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CashFlowCashFlowBalanceSummary instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CashFlowCashFlowBalanceSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CashFlowCashFlowBalanceSummary
  * @throws IOException if the JSON string is invalid with respect to CashFlowCashFlowBalanceSummary
  */
  public static CashFlowCashFlowBalanceSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CashFlowCashFlowBalanceSummary.class);
  }

 /**
  * Convert an instance of CashFlowCashFlowBalanceSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
