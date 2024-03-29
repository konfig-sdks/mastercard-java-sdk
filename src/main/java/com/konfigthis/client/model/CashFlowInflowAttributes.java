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
import com.konfigthis.client.model.ObbDateRangeAndAmount;
import com.konfigthis.client.model.ObbDateRangeAndCount;
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
 * Inflow Attributes
 */
@ApiModel(description = "Inflow Attributes")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CashFlowInflowAttributes {
  public static final String SERIALIZED_NAME_AVERAGE_DEPOSIT_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD = "averageDepositByMonthForTheReportTimePeriod";
  @SerializedName(SERIALIZED_NAME_AVERAGE_DEPOSIT_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD)
  private List<ObbDateRangeAndAmount> averageDepositByMonthForTheReportTimePeriod = null;

  public static final String SERIALIZED_NAME_COUNT_DEPOSITS_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD = "countDepositsByMonthForTheReportTimePeriod";
  @SerializedName(SERIALIZED_NAME_COUNT_DEPOSITS_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD)
  private List<ObbDateRangeAndCount> countDepositsByMonthForTheReportTimePeriod = new ArrayList<>();

  public static final String SERIALIZED_NAME_HISTORIC_COUNT_OF_DEPOSIT_TRANSACTIONS = "historicCountOfDepositTransactions";
  @SerializedName(SERIALIZED_NAME_HISTORIC_COUNT_OF_DEPOSIT_TRANSACTIONS)
  private Integer historicCountOfDepositTransactions;

  public static final String SERIALIZED_NAME_HISTORIC_SUM_OF_DEPOSITS = "historicSumOfDeposits";
  @SerializedName(SERIALIZED_NAME_HISTORIC_SUM_OF_DEPOSITS)
  private Double historicSumOfDeposits;

  public static final String SERIALIZED_NAME_MAXIMUM_DEPOSIT_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD = "maximumDepositByMonthForTheReportTimePeriod";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_DEPOSIT_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD)
  private List<ObbDateRangeAndAmount> maximumDepositByMonthForTheReportTimePeriod = new ArrayList<>();

  public static final String SERIALIZED_NAME_MINIMUM_DEPOSIT_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD = "minimumDepositByMonthForTheReportTimePeriod";
  @SerializedName(SERIALIZED_NAME_MINIMUM_DEPOSIT_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD)
  private List<ObbDateRangeAndAmount> minimumDepositByMonthForTheReportTimePeriod = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUM_DEPOSITS_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD = "sumDepositsByMonthForTheReportTimePeriod";
  @SerializedName(SERIALIZED_NAME_SUM_DEPOSITS_BY_MONTH_FOR_THE_REPORT_TIME_PERIOD)
  private List<ObbDateRangeAndAmount> sumDepositsByMonthForTheReportTimePeriod = new ArrayList<>();

  public CashFlowInflowAttributes() {
  }

  public CashFlowInflowAttributes averageDepositByMonthForTheReportTimePeriod(List<ObbDateRangeAndAmount> averageDepositByMonthForTheReportTimePeriod) {
    
    
    
    
    this.averageDepositByMonthForTheReportTimePeriod = averageDepositByMonthForTheReportTimePeriod;
    return this;
  }

  public CashFlowInflowAttributes addAverageDepositByMonthForTheReportTimePeriodItem(ObbDateRangeAndAmount averageDepositByMonthForTheReportTimePeriodItem) {
    if (this.averageDepositByMonthForTheReportTimePeriod == null) {
      this.averageDepositByMonthForTheReportTimePeriod = new ArrayList<>();
    }
    this.averageDepositByMonthForTheReportTimePeriod.add(averageDepositByMonthForTheReportTimePeriodItem);
    return this;
  }

   /**
   * Average value of deposits during periods in the report
   * @return averageDepositByMonthForTheReportTimePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average value of deposits during periods in the report")

  public List<ObbDateRangeAndAmount> getAverageDepositByMonthForTheReportTimePeriod() {
    return averageDepositByMonthForTheReportTimePeriod;
  }


  public void setAverageDepositByMonthForTheReportTimePeriod(List<ObbDateRangeAndAmount> averageDepositByMonthForTheReportTimePeriod) {
    
    
    
    this.averageDepositByMonthForTheReportTimePeriod = averageDepositByMonthForTheReportTimePeriod;
  }


  public CashFlowInflowAttributes countDepositsByMonthForTheReportTimePeriod(List<ObbDateRangeAndCount> countDepositsByMonthForTheReportTimePeriod) {
    
    
    
    
    this.countDepositsByMonthForTheReportTimePeriod = countDepositsByMonthForTheReportTimePeriod;
    return this;
  }

  public CashFlowInflowAttributes addCountDepositsByMonthForTheReportTimePeriodItem(ObbDateRangeAndCount countDepositsByMonthForTheReportTimePeriodItem) {
    this.countDepositsByMonthForTheReportTimePeriod.add(countDepositsByMonthForTheReportTimePeriodItem);
    return this;
  }

   /**
   * Count of all deposits during periods in the report
   * @return countDepositsByMonthForTheReportTimePeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Count of all deposits during periods in the report")

  public List<ObbDateRangeAndCount> getCountDepositsByMonthForTheReportTimePeriod() {
    return countDepositsByMonthForTheReportTimePeriod;
  }


  public void setCountDepositsByMonthForTheReportTimePeriod(List<ObbDateRangeAndCount> countDepositsByMonthForTheReportTimePeriod) {
    
    
    
    this.countDepositsByMonthForTheReportTimePeriod = countDepositsByMonthForTheReportTimePeriod;
  }


  public CashFlowInflowAttributes historicCountOfDepositTransactions(Integer historicCountOfDepositTransactions) {
    
    
    
    
    this.historicCountOfDepositTransactions = historicCountOfDepositTransactions;
    return this;
  }

   /**
   * Count of ALL deposits over entire known history of the account (may exceed requested length of report)
   * @return historicCountOfDepositTransactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20", required = true, value = "Count of ALL deposits over entire known history of the account (may exceed requested length of report)")

  public Integer getHistoricCountOfDepositTransactions() {
    return historicCountOfDepositTransactions;
  }


  public void setHistoricCountOfDepositTransactions(Integer historicCountOfDepositTransactions) {
    
    
    
    this.historicCountOfDepositTransactions = historicCountOfDepositTransactions;
  }


  public CashFlowInflowAttributes historicSumOfDeposits(Double historicSumOfDeposits) {
    
    
    
    
    this.historicSumOfDeposits = historicSumOfDeposits;
    return this;
  }

  public CashFlowInflowAttributes historicSumOfDeposits(Integer historicSumOfDeposits) {
    
    
    
    
    this.historicSumOfDeposits = historicSumOfDeposits.doubleValue();
    return this;
  }

   /**
   * Sum of ALL deposits over entire known history of the account (may exceed requested length of report)
   * @return historicSumOfDeposits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "389.22", value = "Sum of ALL deposits over entire known history of the account (may exceed requested length of report)")

  public Double getHistoricSumOfDeposits() {
    return historicSumOfDeposits;
  }


  public void setHistoricSumOfDeposits(Double historicSumOfDeposits) {
    
    
    
    this.historicSumOfDeposits = historicSumOfDeposits;
  }


  public CashFlowInflowAttributes maximumDepositByMonthForTheReportTimePeriod(List<ObbDateRangeAndAmount> maximumDepositByMonthForTheReportTimePeriod) {
    
    
    
    
    this.maximumDepositByMonthForTheReportTimePeriod = maximumDepositByMonthForTheReportTimePeriod;
    return this;
  }

  public CashFlowInflowAttributes addMaximumDepositByMonthForTheReportTimePeriodItem(ObbDateRangeAndAmount maximumDepositByMonthForTheReportTimePeriodItem) {
    this.maximumDepositByMonthForTheReportTimePeriod.add(maximumDepositByMonthForTheReportTimePeriodItem);
    return this;
  }

   /**
   * Maximum deposit value for different periods in the report
   * @return maximumDepositByMonthForTheReportTimePeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Maximum deposit value for different periods in the report")

  public List<ObbDateRangeAndAmount> getMaximumDepositByMonthForTheReportTimePeriod() {
    return maximumDepositByMonthForTheReportTimePeriod;
  }


  public void setMaximumDepositByMonthForTheReportTimePeriod(List<ObbDateRangeAndAmount> maximumDepositByMonthForTheReportTimePeriod) {
    
    
    
    this.maximumDepositByMonthForTheReportTimePeriod = maximumDepositByMonthForTheReportTimePeriod;
  }


  public CashFlowInflowAttributes minimumDepositByMonthForTheReportTimePeriod(List<ObbDateRangeAndAmount> minimumDepositByMonthForTheReportTimePeriod) {
    
    
    
    
    this.minimumDepositByMonthForTheReportTimePeriod = minimumDepositByMonthForTheReportTimePeriod;
    return this;
  }

  public CashFlowInflowAttributes addMinimumDepositByMonthForTheReportTimePeriodItem(ObbDateRangeAndAmount minimumDepositByMonthForTheReportTimePeriodItem) {
    this.minimumDepositByMonthForTheReportTimePeriod.add(minimumDepositByMonthForTheReportTimePeriodItem);
    return this;
  }

   /**
   * Minimum deposit value for different periods in the report
   * @return minimumDepositByMonthForTheReportTimePeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Minimum deposit value for different periods in the report")

  public List<ObbDateRangeAndAmount> getMinimumDepositByMonthForTheReportTimePeriod() {
    return minimumDepositByMonthForTheReportTimePeriod;
  }


  public void setMinimumDepositByMonthForTheReportTimePeriod(List<ObbDateRangeAndAmount> minimumDepositByMonthForTheReportTimePeriod) {
    
    
    
    this.minimumDepositByMonthForTheReportTimePeriod = minimumDepositByMonthForTheReportTimePeriod;
  }


  public CashFlowInflowAttributes sumDepositsByMonthForTheReportTimePeriod(List<ObbDateRangeAndAmount> sumDepositsByMonthForTheReportTimePeriod) {
    
    
    
    
    this.sumDepositsByMonthForTheReportTimePeriod = sumDepositsByMonthForTheReportTimePeriod;
    return this;
  }

  public CashFlowInflowAttributes addSumDepositsByMonthForTheReportTimePeriodItem(ObbDateRangeAndAmount sumDepositsByMonthForTheReportTimePeriodItem) {
    this.sumDepositsByMonthForTheReportTimePeriod.add(sumDepositsByMonthForTheReportTimePeriodItem);
    return this;
  }

   /**
   * Sum of all deposits during periods in the report
   * @return sumDepositsByMonthForTheReportTimePeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Sum of all deposits during periods in the report")

  public List<ObbDateRangeAndAmount> getSumDepositsByMonthForTheReportTimePeriod() {
    return sumDepositsByMonthForTheReportTimePeriod;
  }


  public void setSumDepositsByMonthForTheReportTimePeriod(List<ObbDateRangeAndAmount> sumDepositsByMonthForTheReportTimePeriod) {
    
    
    
    this.sumDepositsByMonthForTheReportTimePeriod = sumDepositsByMonthForTheReportTimePeriod;
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
   * @return the CashFlowInflowAttributes instance itself
   */
  public CashFlowInflowAttributes putAdditionalProperty(String key, Object value) {
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
    CashFlowInflowAttributes cashFlowInflowAttributes = (CashFlowInflowAttributes) o;
    return Objects.equals(this.averageDepositByMonthForTheReportTimePeriod, cashFlowInflowAttributes.averageDepositByMonthForTheReportTimePeriod) &&
        Objects.equals(this.countDepositsByMonthForTheReportTimePeriod, cashFlowInflowAttributes.countDepositsByMonthForTheReportTimePeriod) &&
        Objects.equals(this.historicCountOfDepositTransactions, cashFlowInflowAttributes.historicCountOfDepositTransactions) &&
        Objects.equals(this.historicSumOfDeposits, cashFlowInflowAttributes.historicSumOfDeposits) &&
        Objects.equals(this.maximumDepositByMonthForTheReportTimePeriod, cashFlowInflowAttributes.maximumDepositByMonthForTheReportTimePeriod) &&
        Objects.equals(this.minimumDepositByMonthForTheReportTimePeriod, cashFlowInflowAttributes.minimumDepositByMonthForTheReportTimePeriod) &&
        Objects.equals(this.sumDepositsByMonthForTheReportTimePeriod, cashFlowInflowAttributes.sumDepositsByMonthForTheReportTimePeriod)&&
        Objects.equals(this.additionalProperties, cashFlowInflowAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageDepositByMonthForTheReportTimePeriod, countDepositsByMonthForTheReportTimePeriod, historicCountOfDepositTransactions, historicSumOfDeposits, maximumDepositByMonthForTheReportTimePeriod, minimumDepositByMonthForTheReportTimePeriod, sumDepositsByMonthForTheReportTimePeriod, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowInflowAttributes {\n");
    sb.append("    averageDepositByMonthForTheReportTimePeriod: ").append(toIndentedString(averageDepositByMonthForTheReportTimePeriod)).append("\n");
    sb.append("    countDepositsByMonthForTheReportTimePeriod: ").append(toIndentedString(countDepositsByMonthForTheReportTimePeriod)).append("\n");
    sb.append("    historicCountOfDepositTransactions: ").append(toIndentedString(historicCountOfDepositTransactions)).append("\n");
    sb.append("    historicSumOfDeposits: ").append(toIndentedString(historicSumOfDeposits)).append("\n");
    sb.append("    maximumDepositByMonthForTheReportTimePeriod: ").append(toIndentedString(maximumDepositByMonthForTheReportTimePeriod)).append("\n");
    sb.append("    minimumDepositByMonthForTheReportTimePeriod: ").append(toIndentedString(minimumDepositByMonthForTheReportTimePeriod)).append("\n");
    sb.append("    sumDepositsByMonthForTheReportTimePeriod: ").append(toIndentedString(sumDepositsByMonthForTheReportTimePeriod)).append("\n");
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
    openapiFields.add("averageDepositByMonthForTheReportTimePeriod");
    openapiFields.add("countDepositsByMonthForTheReportTimePeriod");
    openapiFields.add("historicCountOfDepositTransactions");
    openapiFields.add("historicSumOfDeposits");
    openapiFields.add("maximumDepositByMonthForTheReportTimePeriod");
    openapiFields.add("minimumDepositByMonthForTheReportTimePeriod");
    openapiFields.add("sumDepositsByMonthForTheReportTimePeriod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("countDepositsByMonthForTheReportTimePeriod");
    openapiRequiredFields.add("historicCountOfDepositTransactions");
    openapiRequiredFields.add("maximumDepositByMonthForTheReportTimePeriod");
    openapiRequiredFields.add("minimumDepositByMonthForTheReportTimePeriod");
    openapiRequiredFields.add("sumDepositsByMonthForTheReportTimePeriod");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CashFlowInflowAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CashFlowInflowAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CashFlowInflowAttributes is not found in the empty JSON string", CashFlowInflowAttributes.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CashFlowInflowAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("averageDepositByMonthForTheReportTimePeriod") != null && !jsonObj.get("averageDepositByMonthForTheReportTimePeriod").isJsonNull()) {
        JsonArray jsonArrayaverageDepositByMonthForTheReportTimePeriod = jsonObj.getAsJsonArray("averageDepositByMonthForTheReportTimePeriod");
        if (jsonArrayaverageDepositByMonthForTheReportTimePeriod != null) {
          // ensure the json data is an array
          if (!jsonObj.get("averageDepositByMonthForTheReportTimePeriod").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `averageDepositByMonthForTheReportTimePeriod` to be an array in the JSON string but got `%s`", jsonObj.get("averageDepositByMonthForTheReportTimePeriod").toString()));
          }

          // validate the optional field `averageDepositByMonthForTheReportTimePeriod` (array)
          for (int i = 0; i < jsonArrayaverageDepositByMonthForTheReportTimePeriod.size(); i++) {
            ObbDateRangeAndAmount.validateJsonObject(jsonArrayaverageDepositByMonthForTheReportTimePeriod.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("countDepositsByMonthForTheReportTimePeriod").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `countDepositsByMonthForTheReportTimePeriod` to be an array in the JSON string but got `%s`", jsonObj.get("countDepositsByMonthForTheReportTimePeriod").toString()));
      }

      JsonArray jsonArraycountDepositsByMonthForTheReportTimePeriod = jsonObj.getAsJsonArray("countDepositsByMonthForTheReportTimePeriod");
      // validate the required field `countDepositsByMonthForTheReportTimePeriod` (array)
      for (int i = 0; i < jsonArraycountDepositsByMonthForTheReportTimePeriod.size(); i++) {
        ObbDateRangeAndCount.validateJsonObject(jsonArraycountDepositsByMonthForTheReportTimePeriod.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("maximumDepositByMonthForTheReportTimePeriod").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `maximumDepositByMonthForTheReportTimePeriod` to be an array in the JSON string but got `%s`", jsonObj.get("maximumDepositByMonthForTheReportTimePeriod").toString()));
      }

      JsonArray jsonArraymaximumDepositByMonthForTheReportTimePeriod = jsonObj.getAsJsonArray("maximumDepositByMonthForTheReportTimePeriod");
      // validate the required field `maximumDepositByMonthForTheReportTimePeriod` (array)
      for (int i = 0; i < jsonArraymaximumDepositByMonthForTheReportTimePeriod.size(); i++) {
        ObbDateRangeAndAmount.validateJsonObject(jsonArraymaximumDepositByMonthForTheReportTimePeriod.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("minimumDepositByMonthForTheReportTimePeriod").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `minimumDepositByMonthForTheReportTimePeriod` to be an array in the JSON string but got `%s`", jsonObj.get("minimumDepositByMonthForTheReportTimePeriod").toString()));
      }

      JsonArray jsonArrayminimumDepositByMonthForTheReportTimePeriod = jsonObj.getAsJsonArray("minimumDepositByMonthForTheReportTimePeriod");
      // validate the required field `minimumDepositByMonthForTheReportTimePeriod` (array)
      for (int i = 0; i < jsonArrayminimumDepositByMonthForTheReportTimePeriod.size(); i++) {
        ObbDateRangeAndAmount.validateJsonObject(jsonArrayminimumDepositByMonthForTheReportTimePeriod.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("sumDepositsByMonthForTheReportTimePeriod").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sumDepositsByMonthForTheReportTimePeriod` to be an array in the JSON string but got `%s`", jsonObj.get("sumDepositsByMonthForTheReportTimePeriod").toString()));
      }

      JsonArray jsonArraysumDepositsByMonthForTheReportTimePeriod = jsonObj.getAsJsonArray("sumDepositsByMonthForTheReportTimePeriod");
      // validate the required field `sumDepositsByMonthForTheReportTimePeriod` (array)
      for (int i = 0; i < jsonArraysumDepositsByMonthForTheReportTimePeriod.size(); i++) {
        ObbDateRangeAndAmount.validateJsonObject(jsonArraysumDepositsByMonthForTheReportTimePeriod.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CashFlowInflowAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CashFlowInflowAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CashFlowInflowAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CashFlowInflowAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CashFlowInflowAttributes>() {
           @Override
           public void write(JsonWriter out, CashFlowInflowAttributes value) throws IOException {
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
           public CashFlowInflowAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CashFlowInflowAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CashFlowInflowAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CashFlowInflowAttributes
  * @throws IOException if the JSON string is invalid with respect to CashFlowInflowAttributes
  */
  public static CashFlowInflowAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CashFlowInflowAttributes.class);
  }

 /**
  * Convert an instance of CashFlowInflowAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

