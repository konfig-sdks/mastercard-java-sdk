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
 * AnnualIncome
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AnnualIncome {
  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private String year;

  public static final String SERIALIZED_NAME_GROSS_PAY_AMOUNT_Y_T_D = "grossPayAmountYTD";
  @SerializedName(SERIALIZED_NAME_GROSS_PAY_AMOUNT_Y_T_D)
  private Double grossPayAmountYTD;

  public static final String SERIALIZED_NAME_NET_PAY_AMOUNT_Y_T_D = "netPayAmountYTD";
  @SerializedName(SERIALIZED_NAME_NET_PAY_AMOUNT_Y_T_D)
  private Double netPayAmountYTD;

  public static final String SERIALIZED_NAME_BASE_PAY_AMOUNT_Y_T_D = "basePayAmountYTD";
  @SerializedName(SERIALIZED_NAME_BASE_PAY_AMOUNT_Y_T_D)
  private Double basePayAmountYTD;

  public static final String SERIALIZED_NAME_OVERTIME_PAY_AMOUNT_Y_T_D = "overtimePayAmountYTD";
  @SerializedName(SERIALIZED_NAME_OVERTIME_PAY_AMOUNT_Y_T_D)
  private Double overtimePayAmountYTD;

  public static final String SERIALIZED_NAME_OTHER_PAY_AMOUNT_Y_T_D = "otherPayAmountYTD";
  @SerializedName(SERIALIZED_NAME_OTHER_PAY_AMOUNT_Y_T_D)
  private Double otherPayAmountYTD;

  public static final String SERIALIZED_NAME_COMMISSION_PAY_AMOUNT = "commissionPayAmount";
  @SerializedName(SERIALIZED_NAME_COMMISSION_PAY_AMOUNT)
  private Double commissionPayAmount;

  public AnnualIncome() {
  }

  public AnnualIncome year(String year) {
    
    
    
    
    this.year = year;
    return this;
  }

   /**
   * The year for the amounts given in YTD totals for an employer
   * @return year
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2022", required = true, value = "The year for the amounts given in YTD totals for an employer")

  public String getYear() {
    return year;
  }


  public void setYear(String year) {
    
    
    
    this.year = year;
  }


  public AnnualIncome grossPayAmountYTD(Double grossPayAmountYTD) {
    
    
    
    
    this.grossPayAmountYTD = grossPayAmountYTD;
    return this;
  }

  public AnnualIncome grossPayAmountYTD(Integer grossPayAmountYTD) {
    
    
    
    
    this.grossPayAmountYTD = grossPayAmountYTD.doubleValue();
    return this;
  }

   /**
   * Year to date (YTD) gross pay amount for the indicated year
   * @return grossPayAmountYTD
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.45", required = true, value = "Year to date (YTD) gross pay amount for the indicated year")

  public Double getGrossPayAmountYTD() {
    return grossPayAmountYTD;
  }


  public void setGrossPayAmountYTD(Double grossPayAmountYTD) {
    
    
    
    this.grossPayAmountYTD = grossPayAmountYTD;
  }


  public AnnualIncome netPayAmountYTD(Double netPayAmountYTD) {
    
    
    
    
    this.netPayAmountYTD = netPayAmountYTD;
    return this;
  }

  public AnnualIncome netPayAmountYTD(Integer netPayAmountYTD) {
    
    
    
    
    this.netPayAmountYTD = netPayAmountYTD.doubleValue();
    return this;
  }

   /**
   * Year to date (YTD) net pay amount for the indicated year
   * @return netPayAmountYTD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123.45", value = "Year to date (YTD) net pay amount for the indicated year")

  public Double getNetPayAmountYTD() {
    return netPayAmountYTD;
  }


  public void setNetPayAmountYTD(Double netPayAmountYTD) {
    
    
    
    this.netPayAmountYTD = netPayAmountYTD;
  }


  public AnnualIncome basePayAmountYTD(Double basePayAmountYTD) {
    
    
    
    
    this.basePayAmountYTD = basePayAmountYTD;
    return this;
  }

  public AnnualIncome basePayAmountYTD(Integer basePayAmountYTD) {
    
    
    
    
    this.basePayAmountYTD = basePayAmountYTD.doubleValue();
    return this;
  }

   /**
   * Year to date (YTD) base pay amount for the year indicated
   * @return basePayAmountYTD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123.45", value = "Year to date (YTD) base pay amount for the year indicated")

  public Double getBasePayAmountYTD() {
    return basePayAmountYTD;
  }


  public void setBasePayAmountYTD(Double basePayAmountYTD) {
    
    
    
    this.basePayAmountYTD = basePayAmountYTD;
  }


  public AnnualIncome overtimePayAmountYTD(Double overtimePayAmountYTD) {
    
    
    
    
    this.overtimePayAmountYTD = overtimePayAmountYTD;
    return this;
  }

  public AnnualIncome overtimePayAmountYTD(Integer overtimePayAmountYTD) {
    
    
    
    
    this.overtimePayAmountYTD = overtimePayAmountYTD.doubleValue();
    return this;
  }

   /**
   * Year to date (YTD) overtime pay amount for the year indicated
   * @return overtimePayAmountYTD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123.45", value = "Year to date (YTD) overtime pay amount for the year indicated")

  public Double getOvertimePayAmountYTD() {
    return overtimePayAmountYTD;
  }


  public void setOvertimePayAmountYTD(Double overtimePayAmountYTD) {
    
    
    
    this.overtimePayAmountYTD = overtimePayAmountYTD;
  }


  public AnnualIncome otherPayAmountYTD(Double otherPayAmountYTD) {
    
    
    
    
    this.otherPayAmountYTD = otherPayAmountYTD;
    return this;
  }

  public AnnualIncome otherPayAmountYTD(Integer otherPayAmountYTD) {
    
    
    
    
    this.otherPayAmountYTD = otherPayAmountYTD.doubleValue();
    return this;
  }

   /**
   * Year to date (YTD) other pay amount for the indicated year. Other pay is pay that is not categorized into one of the other categories.
   * @return otherPayAmountYTD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123.45", value = "Year to date (YTD) other pay amount for the indicated year. Other pay is pay that is not categorized into one of the other categories.")

  public Double getOtherPayAmountYTD() {
    return otherPayAmountYTD;
  }


  public void setOtherPayAmountYTD(Double otherPayAmountYTD) {
    
    
    
    this.otherPayAmountYTD = otherPayAmountYTD;
  }


  public AnnualIncome commissionPayAmount(Double commissionPayAmount) {
    
    
    
    
    this.commissionPayAmount = commissionPayAmount;
    return this;
  }

  public AnnualIncome commissionPayAmount(Integer commissionPayAmount) {
    
    
    
    
    this.commissionPayAmount = commissionPayAmount.doubleValue();
    return this;
  }

   /**
   * Year to date (YTD) commission pay amount for the indicated year
   * @return commissionPayAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123.45", value = "Year to date (YTD) commission pay amount for the indicated year")

  public Double getCommissionPayAmount() {
    return commissionPayAmount;
  }


  public void setCommissionPayAmount(Double commissionPayAmount) {
    
    
    
    this.commissionPayAmount = commissionPayAmount;
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
   * @return the AnnualIncome instance itself
   */
  public AnnualIncome putAdditionalProperty(String key, Object value) {
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
    AnnualIncome annualIncome = (AnnualIncome) o;
    return Objects.equals(this.year, annualIncome.year) &&
        Objects.equals(this.grossPayAmountYTD, annualIncome.grossPayAmountYTD) &&
        Objects.equals(this.netPayAmountYTD, annualIncome.netPayAmountYTD) &&
        Objects.equals(this.basePayAmountYTD, annualIncome.basePayAmountYTD) &&
        Objects.equals(this.overtimePayAmountYTD, annualIncome.overtimePayAmountYTD) &&
        Objects.equals(this.otherPayAmountYTD, annualIncome.otherPayAmountYTD) &&
        Objects.equals(this.commissionPayAmount, annualIncome.commissionPayAmount)&&
        Objects.equals(this.additionalProperties, annualIncome.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, grossPayAmountYTD, netPayAmountYTD, basePayAmountYTD, overtimePayAmountYTD, otherPayAmountYTD, commissionPayAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnualIncome {\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    grossPayAmountYTD: ").append(toIndentedString(grossPayAmountYTD)).append("\n");
    sb.append("    netPayAmountYTD: ").append(toIndentedString(netPayAmountYTD)).append("\n");
    sb.append("    basePayAmountYTD: ").append(toIndentedString(basePayAmountYTD)).append("\n");
    sb.append("    overtimePayAmountYTD: ").append(toIndentedString(overtimePayAmountYTD)).append("\n");
    sb.append("    otherPayAmountYTD: ").append(toIndentedString(otherPayAmountYTD)).append("\n");
    sb.append("    commissionPayAmount: ").append(toIndentedString(commissionPayAmount)).append("\n");
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
    openapiFields.add("year");
    openapiFields.add("grossPayAmountYTD");
    openapiFields.add("netPayAmountYTD");
    openapiFields.add("basePayAmountYTD");
    openapiFields.add("overtimePayAmountYTD");
    openapiFields.add("otherPayAmountYTD");
    openapiFields.add("commissionPayAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("year");
    openapiRequiredFields.add("grossPayAmountYTD");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnnualIncome
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AnnualIncome.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnnualIncome is not found in the empty JSON string", AnnualIncome.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AnnualIncome.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("year").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnnualIncome.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnnualIncome' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnnualIncome> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnnualIncome.class));

       return (TypeAdapter<T>) new TypeAdapter<AnnualIncome>() {
           @Override
           public void write(JsonWriter out, AnnualIncome value) throws IOException {
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
           public AnnualIncome read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AnnualIncome instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AnnualIncome given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnnualIncome
  * @throws IOException if the JSON string is invalid with respect to AnnualIncome
  */
  public static AnnualIncome fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnnualIncome.class);
  }

 /**
  * Convert an instance of AnnualIncome to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

