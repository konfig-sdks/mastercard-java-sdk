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
import com.konfigthis.client.model.CertifiedInstitution;
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
 * A list of financial institutions from the Get Certified Institutions API
 */
@ApiModel(description = "A list of financial institutions from the Get Certified Institutions API")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CertifiedInstitutions {
  public static final String SERIALIZED_NAME_FOUND = "found";
  @SerializedName(SERIALIZED_NAME_FOUND)
  private Integer found;

  public static final String SERIALIZED_NAME_DISPLAYING = "displaying";
  @SerializedName(SERIALIZED_NAME_DISPLAYING)
  private Integer displaying;

  public static final String SERIALIZED_NAME_MORE_AVAILABLE = "moreAvailable";
  @SerializedName(SERIALIZED_NAME_MORE_AVAILABLE)
  private Boolean moreAvailable;

  public static final String SERIALIZED_NAME_REQUESTED_DATE = "requestedDate";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DATE)
  private Long requestedDate;

  public static final String SERIALIZED_NAME_INSTITUTIONS = "institutions";
  @SerializedName(SERIALIZED_NAME_INSTITUTIONS)
  private List<CertifiedInstitution> institutions = new ArrayList<>();

  public CertifiedInstitutions() {
  }

  public CertifiedInstitutions found(Integer found) {
    
    
    
    
    this.found = found;
    return this;
  }

   /**
   * The total number of results matching search criteria
   * @return found
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "200", required = true, value = "The total number of results matching search criteria")

  public Integer getFound() {
    return found;
  }


  public void setFound(Integer found) {
    
    
    
    this.found = found;
  }


  public CertifiedInstitutions displaying(Integer displaying) {
    
    
    
    
    this.displaying = displaying;
    return this;
  }

   /**
   * The number of results returned
   * @return displaying
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The number of results returned")

  public Integer getDisplaying() {
    return displaying;
  }


  public void setDisplaying(Integer displaying) {
    
    
    
    this.displaying = displaying;
  }


  public CertifiedInstitutions moreAvailable(Boolean moreAvailable) {
    
    
    
    
    this.moreAvailable = moreAvailable;
    return this;
  }

   /**
   * If the value of &#x60;moreAvailable&#x60; is \&quot;true\&quot;, you can retrieve the next page of results by increasing the value of the start parameter in your next request:\&quot;...&amp;start&#x3D;6&amp;limit&#x3D;5\&quot;
   * @return moreAvailable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "If the value of `moreAvailable` is \"true\", you can retrieve the next page of results by increasing the value of the start parameter in your next request:\"...&start=6&limit=5\"")

  public Boolean getMoreAvailable() {
    return moreAvailable;
  }


  public void setMoreAvailable(Boolean moreAvailable) {
    
    
    
    this.moreAvailable = moreAvailable;
  }


  public CertifiedInstitutions requestedDate(Long requestedDate) {
    
    
    
    
    this.requestedDate = requestedDate;
    return this;
  }

   /**
   * A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
   * @return requestedDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1607450357", required = true, value = "A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).")

  public Long getRequestedDate() {
    return requestedDate;
  }


  public void setRequestedDate(Long requestedDate) {
    
    
    
    this.requestedDate = requestedDate;
  }


  public CertifiedInstitutions institutions(List<CertifiedInstitution> institutions) {
    
    
    
    
    this.institutions = institutions;
    return this;
  }

  public CertifiedInstitutions addInstitutionsItem(CertifiedInstitution institutionsItem) {
    this.institutions.add(institutionsItem);
    return this;
  }

   /**
   * A list of institutions
   * @return institutions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of institutions")

  public List<CertifiedInstitution> getInstitutions() {
    return institutions;
  }


  public void setInstitutions(List<CertifiedInstitution> institutions) {
    
    
    
    this.institutions = institutions;
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
   * @return the CertifiedInstitutions instance itself
   */
  public CertifiedInstitutions putAdditionalProperty(String key, Object value) {
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
    CertifiedInstitutions certifiedInstitutions = (CertifiedInstitutions) o;
    return Objects.equals(this.found, certifiedInstitutions.found) &&
        Objects.equals(this.displaying, certifiedInstitutions.displaying) &&
        Objects.equals(this.moreAvailable, certifiedInstitutions.moreAvailable) &&
        Objects.equals(this.requestedDate, certifiedInstitutions.requestedDate) &&
        Objects.equals(this.institutions, certifiedInstitutions.institutions)&&
        Objects.equals(this.additionalProperties, certifiedInstitutions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(found, displaying, moreAvailable, requestedDate, institutions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertifiedInstitutions {\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    displaying: ").append(toIndentedString(displaying)).append("\n");
    sb.append("    moreAvailable: ").append(toIndentedString(moreAvailable)).append("\n");
    sb.append("    requestedDate: ").append(toIndentedString(requestedDate)).append("\n");
    sb.append("    institutions: ").append(toIndentedString(institutions)).append("\n");
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
    openapiFields.add("found");
    openapiFields.add("displaying");
    openapiFields.add("moreAvailable");
    openapiFields.add("requestedDate");
    openapiFields.add("institutions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("found");
    openapiRequiredFields.add("displaying");
    openapiRequiredFields.add("moreAvailable");
    openapiRequiredFields.add("requestedDate");
    openapiRequiredFields.add("institutions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CertifiedInstitutions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CertifiedInstitutions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertifiedInstitutions is not found in the empty JSON string", CertifiedInstitutions.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CertifiedInstitutions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("institutions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `institutions` to be an array in the JSON string but got `%s`", jsonObj.get("institutions").toString()));
      }

      JsonArray jsonArrayinstitutions = jsonObj.getAsJsonArray("institutions");
      // validate the required field `institutions` (array)
      for (int i = 0; i < jsonArrayinstitutions.size(); i++) {
        CertifiedInstitution.validateJsonObject(jsonArrayinstitutions.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertifiedInstitutions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertifiedInstitutions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertifiedInstitutions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertifiedInstitutions.class));

       return (TypeAdapter<T>) new TypeAdapter<CertifiedInstitutions>() {
           @Override
           public void write(JsonWriter out, CertifiedInstitutions value) throws IOException {
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
           public CertifiedInstitutions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CertifiedInstitutions instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CertifiedInstitutions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CertifiedInstitutions
  * @throws IOException if the JSON string is invalid with respect to CertifiedInstitutions
  */
  public static CertifiedInstitutions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertifiedInstitutions.class);
  }

 /**
  * Convert an instance of CertifiedInstitutions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

