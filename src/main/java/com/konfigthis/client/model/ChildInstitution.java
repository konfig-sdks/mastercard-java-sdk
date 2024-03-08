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
 * ChildInstitution
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ChildInstitution {
  public static final String SERIALIZED_NAME_RSSD = "rssd";
  @SerializedName(SERIALIZED_NAME_RSSD)
  private Long rssd;

  public static final String SERIALIZED_NAME_PARENT_R_S_S_D = "parentRSSD";
  @SerializedName(SERIALIZED_NAME_PARENT_R_S_S_D)
  private Long parentRSSD;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institutionId";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private Long institutionId;

  public ChildInstitution() {
  }

  public ChildInstitution rssd(Long rssd) {
    
    
    
    
    this.rssd = rssd;
    return this;
  }

   /**
   * The RSSD ID is a unique identifier assigned to financial institutions by the Federal Reserve. While the length of the RSSD ID varies by institution, it cannot exceed 10 numerical digits.
   * @return rssd
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "490535", required = true, value = "The RSSD ID is a unique identifier assigned to financial institutions by the Federal Reserve. While the length of the RSSD ID varies by institution, it cannot exceed 10 numerical digits.")

  public Long getRssd() {
    return rssd;
  }


  public void setRssd(Long rssd) {
    
    
    
    this.rssd = rssd;
  }


  public ChildInstitution parentRSSD(Long parentRSSD) {
    
    
    
    
    this.parentRSSD = parentRSSD;
    return this;
  }

   /**
   * The RSSD ID is a unique identifier assigned to financial institutions by the Federal Reserve. While the length of the RSSD ID varies by institution, it cannot exceed 10 numerical digits.
   * @return parentRSSD
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "490535", required = true, value = "The RSSD ID is a unique identifier assigned to financial institutions by the Federal Reserve. While the length of the RSSD ID varies by institution, it cannot exceed 10 numerical digits.")

  public Long getParentRSSD() {
    return parentRSSD;
  }


  public void setParentRSSD(Long parentRSSD) {
    
    
    
    this.parentRSSD = parentRSSD;
  }


  public ChildInstitution name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the institution
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "FinBank", required = true, value = "The name of the institution")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ChildInstitution institutionId(Long institutionId) {
    
    
    
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The ID of a financial institution, represented as a number
   * @return institutionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4222", required = true, value = "The ID of a financial institution, represented as a number")

  public Long getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(Long institutionId) {
    
    
    
    this.institutionId = institutionId;
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
   * @return the ChildInstitution instance itself
   */
  public ChildInstitution putAdditionalProperty(String key, Object value) {
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
    ChildInstitution childInstitution = (ChildInstitution) o;
    return Objects.equals(this.rssd, childInstitution.rssd) &&
        Objects.equals(this.parentRSSD, childInstitution.parentRSSD) &&
        Objects.equals(this.name, childInstitution.name) &&
        Objects.equals(this.institutionId, childInstitution.institutionId)&&
        Objects.equals(this.additionalProperties, childInstitution.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rssd, parentRSSD, name, institutionId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildInstitution {\n");
    sb.append("    rssd: ").append(toIndentedString(rssd)).append("\n");
    sb.append("    parentRSSD: ").append(toIndentedString(parentRSSD)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
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
    openapiFields.add("rssd");
    openapiFields.add("parentRSSD");
    openapiFields.add("name");
    openapiFields.add("institutionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rssd");
    openapiRequiredFields.add("parentRSSD");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("institutionId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChildInstitution
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChildInstitution.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChildInstitution is not found in the empty JSON string", ChildInstitution.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChildInstitution.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChildInstitution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChildInstitution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChildInstitution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChildInstitution.class));

       return (TypeAdapter<T>) new TypeAdapter<ChildInstitution>() {
           @Override
           public void write(JsonWriter out, ChildInstitution value) throws IOException {
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
           public ChildInstitution read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ChildInstitution instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChildInstitution given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChildInstitution
  * @throws IOException if the JSON string is invalid with respect to ChildInstitution
  */
  public static ChildInstitution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChildInstitution.class);
  }

 /**
  * Convert an instance of ChildInstitution to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
