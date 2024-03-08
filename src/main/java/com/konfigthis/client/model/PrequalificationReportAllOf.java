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
import com.konfigthis.client.model.PrequalificationReportAssetSummary;
import com.konfigthis.client.model.ReportInstitution;
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
 * PrequalificationReportAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PrequalificationReportAllOf {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private Long startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private Long endDate;

  public static final String SERIALIZED_NAME_DAYS = "days";
  @SerializedName(SERIALIZED_NAME_DAYS)
  private Integer days;

  public static final String SERIALIZED_NAME_SEASONED = "seasoned";
  @SerializedName(SERIALIZED_NAME_SEASONED)
  private Boolean seasoned;

  public static final String SERIALIZED_NAME_CONSOLIDATED_AVAILABLE_BALANCE = "consolidatedAvailableBalance";
  @SerializedName(SERIALIZED_NAME_CONSOLIDATED_AVAILABLE_BALANCE)
  private Double consolidatedAvailableBalance;

  public static final String SERIALIZED_NAME_INSTITUTIONS = "institutions";
  @SerializedName(SERIALIZED_NAME_INSTITUTIONS)
  private List<ReportInstitution> institutions = null;

  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private PrequalificationReportAssetSummary assets;

  public PrequalificationReportAllOf() {
  }

  public PrequalificationReportAllOf startDate(Long startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The &#x60;postedDate&#x60; of the earliest transaction analyzed for the report. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1607450357", value = "The `postedDate` of the earliest transaction analyzed for the report. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).")

  public Long getStartDate() {
    return startDate;
  }


  public void setStartDate(Long startDate) {
    
    
    
    this.startDate = startDate;
  }


  public PrequalificationReportAllOf endDate(Long endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The &#x60;postedDate&#x60; of the latest transaction analyzed for the report. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1607450357", value = "The `postedDate` of the latest transaction analyzed for the report. A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).")

  public Long getEndDate() {
    return endDate;
  }


  public void setEndDate(Long endDate) {
    
    
    
    this.endDate = endDate;
  }


  public PrequalificationReportAllOf days(Integer days) {
    
    
    
    
    this.days = days;
    return this;
  }

   /**
   * The number of days covered by the report
   * @return days
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "230", value = "The number of days covered by the report")

  public Integer getDays() {
    return days;
  }


  public void setDays(Integer days) {
    
    
    
    this.days = days;
  }


  public PrequalificationReportAllOf seasoned(Boolean seasoned) {
    
    
    
    
    this.seasoned = seasoned;
    return this;
  }

   /**
   * \&quot;true\&quot; if the report covers more than 180 days
   * @return seasoned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "\"true\" if the report covers more than 180 days")

  public Boolean getSeasoned() {
    return seasoned;
  }


  public void setSeasoned(Boolean seasoned) {
    
    
    
    this.seasoned = seasoned;
  }


  public PrequalificationReportAllOf consolidatedAvailableBalance(Double consolidatedAvailableBalance) {
    
    
    
    
    this.consolidatedAvailableBalance = consolidatedAvailableBalance;
    return this;
  }

  public PrequalificationReportAllOf consolidatedAvailableBalance(Integer consolidatedAvailableBalance) {
    
    
    
    
    this.consolidatedAvailableBalance = consolidatedAvailableBalance.doubleValue();
    return this;
  }

   /**
   * The sum of available balance for all of the accounts included in the report
   * @return consolidatedAvailableBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1929.57", value = "The sum of available balance for all of the accounts included in the report")

  public Double getConsolidatedAvailableBalance() {
    return consolidatedAvailableBalance;
  }


  public void setConsolidatedAvailableBalance(Double consolidatedAvailableBalance) {
    
    
    
    this.consolidatedAvailableBalance = consolidatedAvailableBalance;
  }


  public PrequalificationReportAllOf institutions(List<ReportInstitution> institutions) {
    
    
    
    
    this.institutions = institutions;
    return this;
  }

  public PrequalificationReportAllOf addInstitutionsItem(ReportInstitution institutionsItem) {
    if (this.institutions == null) {
      this.institutions = new ArrayList<>();
    }
    this.institutions.add(institutionsItem);
    return this;
  }

   /**
   * A list of institution records, including information about the individual accounts in this report
   * @return institutions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of institution records, including information about the individual accounts in this report")

  public List<ReportInstitution> getInstitutions() {
    return institutions;
  }


  public void setInstitutions(List<ReportInstitution> institutions) {
    
    
    
    this.institutions = institutions;
  }


  public PrequalificationReportAllOf assets(PrequalificationReportAssetSummary assets) {
    
    
    
    
    this.assets = assets;
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PrequalificationReportAssetSummary getAssets() {
    return assets;
  }


  public void setAssets(PrequalificationReportAssetSummary assets) {
    
    
    
    this.assets = assets;
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
   * @return the PrequalificationReportAllOf instance itself
   */
  public PrequalificationReportAllOf putAdditionalProperty(String key, Object value) {
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
    PrequalificationReportAllOf prequalificationReportAllOf = (PrequalificationReportAllOf) o;
    return Objects.equals(this.startDate, prequalificationReportAllOf.startDate) &&
        Objects.equals(this.endDate, prequalificationReportAllOf.endDate) &&
        Objects.equals(this.days, prequalificationReportAllOf.days) &&
        Objects.equals(this.seasoned, prequalificationReportAllOf.seasoned) &&
        Objects.equals(this.consolidatedAvailableBalance, prequalificationReportAllOf.consolidatedAvailableBalance) &&
        Objects.equals(this.institutions, prequalificationReportAllOf.institutions) &&
        Objects.equals(this.assets, prequalificationReportAllOf.assets)&&
        Objects.equals(this.additionalProperties, prequalificationReportAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, days, seasoned, consolidatedAvailableBalance, institutions, assets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrequalificationReportAllOf {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    seasoned: ").append(toIndentedString(seasoned)).append("\n");
    sb.append("    consolidatedAvailableBalance: ").append(toIndentedString(consolidatedAvailableBalance)).append("\n");
    sb.append("    institutions: ").append(toIndentedString(institutions)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("days");
    openapiFields.add("seasoned");
    openapiFields.add("consolidatedAvailableBalance");
    openapiFields.add("institutions");
    openapiFields.add("assets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PrequalificationReportAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PrequalificationReportAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrequalificationReportAllOf is not found in the empty JSON string", PrequalificationReportAllOf.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("institutions") != null && !jsonObj.get("institutions").isJsonNull()) {
        JsonArray jsonArrayinstitutions = jsonObj.getAsJsonArray("institutions");
        if (jsonArrayinstitutions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("institutions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `institutions` to be an array in the JSON string but got `%s`", jsonObj.get("institutions").toString()));
          }

          // validate the optional field `institutions` (array)
          for (int i = 0; i < jsonArrayinstitutions.size(); i++) {
            ReportInstitution.validateJsonObject(jsonArrayinstitutions.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `assets`
      if (jsonObj.get("assets") != null && !jsonObj.get("assets").isJsonNull()) {
        PrequalificationReportAssetSummary.validateJsonObject(jsonObj.getAsJsonObject("assets"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrequalificationReportAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrequalificationReportAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrequalificationReportAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrequalificationReportAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<PrequalificationReportAllOf>() {
           @Override
           public void write(JsonWriter out, PrequalificationReportAllOf value) throws IOException {
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
           public PrequalificationReportAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PrequalificationReportAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PrequalificationReportAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PrequalificationReportAllOf
  * @throws IOException if the JSON string is invalid with respect to PrequalificationReportAllOf
  */
  public static PrequalificationReportAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrequalificationReportAllOf.class);
  }

 /**
  * Convert an instance of PrequalificationReportAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

