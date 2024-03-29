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
 * ReportIncomeEstimate
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReportIncomeEstimate {
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

  public ReportIncomeEstimate() {
  }

  public ReportIncomeEstimate netAnnual(Double netAnnual) {
    
    
    
    
    this.netAnnual = netAnnual;
    return this;
  }

  public ReportIncomeEstimate netAnnual(Integer netAnnual) {
    
    
    
    
    this.netAnnual = netAnnual.doubleValue();
    return this;
  }

   /**
   * Sum of all values in &#x60;netMonthlyIncome&#x60; over the previous 12 months
   * @return netAnnual
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1000.12", required = true, value = "Sum of all values in `netMonthlyIncome` over the previous 12 months")

  public Double getNetAnnual() {
    return netAnnual;
  }


  public void setNetAnnual(Double netAnnual) {
    
    
    
    this.netAnnual = netAnnual;
  }


  public ReportIncomeEstimate projectedNetAnnual(Double projectedNetAnnual) {
    
    
    
    
    this.projectedNetAnnual = projectedNetAnnual;
    return this;
  }

  public ReportIncomeEstimate projectedNetAnnual(Integer projectedNetAnnual) {
    
    
    
    
    this.projectedNetAnnual = projectedNetAnnual.doubleValue();
    return this;
  }

   /**
   * Projected net income over the next 12 months, across all income streams, based on &#x60;netAnnualIncome&#x60;
   * @return projectedNetAnnual
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1500.23", required = true, value = "Projected net income over the next 12 months, across all income streams, based on `netAnnualIncome`")

  public Double getProjectedNetAnnual() {
    return projectedNetAnnual;
  }


  public void setProjectedNetAnnual(Double projectedNetAnnual) {
    
    
    
    this.projectedNetAnnual = projectedNetAnnual;
  }


  public ReportIncomeEstimate estimatedGrossAnnual(Double estimatedGrossAnnual) {
    
    
    
    
    this.estimatedGrossAnnual = estimatedGrossAnnual;
    return this;
  }

  public ReportIncomeEstimate estimatedGrossAnnual(Integer estimatedGrossAnnual) {
    
    
    
    
    this.estimatedGrossAnnual = estimatedGrossAnnual.doubleValue();
    return this;
  }

   /**
   * Before-tax gross annual income (estimated from &#x60;netAnnual&#x60;) across all income stream in the past 12 months
   * @return estimatedGrossAnnual
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2000.12", required = true, value = "Before-tax gross annual income (estimated from `netAnnual`) across all income stream in the past 12 months")

  public Double getEstimatedGrossAnnual() {
    return estimatedGrossAnnual;
  }


  public void setEstimatedGrossAnnual(Double estimatedGrossAnnual) {
    
    
    
    this.estimatedGrossAnnual = estimatedGrossAnnual;
  }


  public ReportIncomeEstimate projectedGrossAnnual(Double projectedGrossAnnual) {
    
    
    
    
    this.projectedGrossAnnual = projectedGrossAnnual;
    return this;
  }

  public ReportIncomeEstimate projectedGrossAnnual(Integer projectedGrossAnnual) {
    
    
    
    
    this.projectedGrossAnnual = projectedGrossAnnual.doubleValue();
    return this;
  }

   /**
   * Projected gross income over the next 12 months, across all active income streams, based on &#x60;projectedNetAnnual&#x60;
   * @return projectedGrossAnnual
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2500.23", required = true, value = "Projected gross income over the next 12 months, across all active income streams, based on `projectedNetAnnual`")

  public Double getProjectedGrossAnnual() {
    return projectedGrossAnnual;
  }


  public void setProjectedGrossAnnual(Double projectedGrossAnnual) {
    
    
    
    this.projectedGrossAnnual = projectedGrossAnnual;
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
   * @return the ReportIncomeEstimate instance itself
   */
  public ReportIncomeEstimate putAdditionalProperty(String key, Object value) {
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
    ReportIncomeEstimate reportIncomeEstimate = (ReportIncomeEstimate) o;
    return Objects.equals(this.netAnnual, reportIncomeEstimate.netAnnual) &&
        Objects.equals(this.projectedNetAnnual, reportIncomeEstimate.projectedNetAnnual) &&
        Objects.equals(this.estimatedGrossAnnual, reportIncomeEstimate.estimatedGrossAnnual) &&
        Objects.equals(this.projectedGrossAnnual, reportIncomeEstimate.projectedGrossAnnual)&&
        Objects.equals(this.additionalProperties, reportIncomeEstimate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netAnnual, projectedNetAnnual, estimatedGrossAnnual, projectedGrossAnnual, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportIncomeEstimate {\n");
    sb.append("    netAnnual: ").append(toIndentedString(netAnnual)).append("\n");
    sb.append("    projectedNetAnnual: ").append(toIndentedString(projectedNetAnnual)).append("\n");
    sb.append("    estimatedGrossAnnual: ").append(toIndentedString(estimatedGrossAnnual)).append("\n");
    sb.append("    projectedGrossAnnual: ").append(toIndentedString(projectedGrossAnnual)).append("\n");
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
    openapiFields.add("netAnnual");
    openapiFields.add("projectedNetAnnual");
    openapiFields.add("estimatedGrossAnnual");
    openapiFields.add("projectedGrossAnnual");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("netAnnual");
    openapiRequiredFields.add("projectedNetAnnual");
    openapiRequiredFields.add("estimatedGrossAnnual");
    openapiRequiredFields.add("projectedGrossAnnual");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportIncomeEstimate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportIncomeEstimate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportIncomeEstimate is not found in the empty JSON string", ReportIncomeEstimate.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReportIncomeEstimate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportIncomeEstimate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportIncomeEstimate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportIncomeEstimate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportIncomeEstimate.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportIncomeEstimate>() {
           @Override
           public void write(JsonWriter out, ReportIncomeEstimate value) throws IOException {
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
           public ReportIncomeEstimate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportIncomeEstimate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportIncomeEstimate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportIncomeEstimate
  * @throws IOException if the JSON string is invalid with respect to ReportIncomeEstimate
  */
  public static ReportIncomeEstimate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportIncomeEstimate.class);
  }

 /**
  * Convert an instance of ReportIncomeEstimate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

