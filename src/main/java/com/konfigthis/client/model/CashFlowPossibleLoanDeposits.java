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
import com.konfigthis.client.model.CashFlowPossibleLoanDepositsInstitutions;
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
 * CashFlowPossibleLoanDeposits
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CashFlowPossibleLoanDeposits {
  public static final String SERIALIZED_NAME_INSTITUTIONS = "institutions";
  @SerializedName(SERIALIZED_NAME_INSTITUTIONS)
  private List<CashFlowPossibleLoanDepositsInstitutions> institutions = new ArrayList<>();

  public CashFlowPossibleLoanDeposits() {
  }

  public CashFlowPossibleLoanDeposits institutions(List<CashFlowPossibleLoanDepositsInstitutions> institutions) {
    
    
    
    
    this.institutions = institutions;
    return this;
  }

  public CashFlowPossibleLoanDeposits addInstitutionsItem(CashFlowPossibleLoanDepositsInstitutions institutionsItem) {
    this.institutions.add(institutionsItem);
    return this;
  }

   /**
   * A list of loan deposit institutions
   * @return institutions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of loan deposit institutions")

  public List<CashFlowPossibleLoanDepositsInstitutions> getInstitutions() {
    return institutions;
  }


  public void setInstitutions(List<CashFlowPossibleLoanDepositsInstitutions> institutions) {
    
    
    
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
   * @return the CashFlowPossibleLoanDeposits instance itself
   */
  public CashFlowPossibleLoanDeposits putAdditionalProperty(String key, Object value) {
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
    CashFlowPossibleLoanDeposits cashFlowPossibleLoanDeposits = (CashFlowPossibleLoanDeposits) o;
    return Objects.equals(this.institutions, cashFlowPossibleLoanDeposits.institutions)&&
        Objects.equals(this.additionalProperties, cashFlowPossibleLoanDeposits.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institutions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowPossibleLoanDeposits {\n");
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
    openapiFields.add("institutions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("institutions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CashFlowPossibleLoanDeposits
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CashFlowPossibleLoanDeposits.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CashFlowPossibleLoanDeposits is not found in the empty JSON string", CashFlowPossibleLoanDeposits.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CashFlowPossibleLoanDeposits.openapiRequiredFields) {
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
        CashFlowPossibleLoanDepositsInstitutions.validateJsonObject(jsonArrayinstitutions.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CashFlowPossibleLoanDeposits.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CashFlowPossibleLoanDeposits' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CashFlowPossibleLoanDeposits> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CashFlowPossibleLoanDeposits.class));

       return (TypeAdapter<T>) new TypeAdapter<CashFlowPossibleLoanDeposits>() {
           @Override
           public void write(JsonWriter out, CashFlowPossibleLoanDeposits value) throws IOException {
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
           public CashFlowPossibleLoanDeposits read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CashFlowPossibleLoanDeposits instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CashFlowPossibleLoanDeposits given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CashFlowPossibleLoanDeposits
  * @throws IOException if the JSON string is invalid with respect to CashFlowPossibleLoanDeposits
  */
  public static CashFlowPossibleLoanDeposits fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CashFlowPossibleLoanDeposits.class);
  }

 /**
  * Convert an instance of CashFlowPossibleLoanDeposits to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

