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
 * PayStat
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayStat {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_AMOUNT_CURRENT = "amountCurrent";
  @SerializedName(SERIALIZED_NAME_AMOUNT_CURRENT)
  private Double amountCurrent;

  public static final String SERIALIZED_NAME_AMOUNT_Y_T_D = "amountYTD";
  @SerializedName(SERIALIZED_NAME_AMOUNT_Y_T_D)
  private Double amountYTD;

  public PayStat() {
  }

  public PayStat description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The earnings line&#39;s pay type description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "regular income", value = "The earnings line's pay type description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public PayStat name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The normalized category of the earnings with a number appended. The number is the will be the iterating number of the type&#39;s occurrence starting at one.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "regular 1", value = "The normalized category of the earnings with a number appended. The number is the will be the iterating number of the type's occurrence starting at one.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public PayStat type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The categorization based on the earning line&#39;s description. Possible values: * \&quot;bereavement\&quot;  * \&quot;bonus\&quot;  * \&quot;commission\&quot;  * \&quot;holiday\&quot;  * \&quot;jury duty\&quot;  * \&quot;overtime\&quot;  * \&quot;pension\&quot;  * \&quot;pto\&quot;  * \&quot;regular\&quot;  * \&quot;sick\&quot;  * \&quot;tips\&quot;  * \&quot;unknown\&quot;  * \&quot;vacation\&quot;  * \&quot;reimbursement\&quot;  * \&quot;stock\&quot;  * \&quot;benefit\&quot;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The categorization based on the earning line's description. Possible values: * \"bereavement\"  * \"bonus\"  * \"commission\"  * \"holiday\"  * \"jury duty\"  * \"overtime\"  * \"pension\"  * \"pto\"  * \"regular\"  * \"sick\"  * \"tips\"  * \"unknown\"  * \"vacation\"  * \"reimbursement\"  * \"stock\"  * \"benefit\"")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public PayStat amountCurrent(Double amountCurrent) {
    
    
    
    
    this.amountCurrent = amountCurrent;
    return this;
  }

  public PayStat amountCurrent(Integer amountCurrent) {
    
    
    
    
    this.amountCurrent = amountCurrent.doubleValue();
    return this;
  }

   /**
   * The amount for the earning line paid out to the employee for the specified pay period.
   * @return amountCurrent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6000", value = "The amount for the earning line paid out to the employee for the specified pay period.")

  public Double getAmountCurrent() {
    return amountCurrent;
  }


  public void setAmountCurrent(Double amountCurrent) {
    
    
    
    this.amountCurrent = amountCurrent;
  }


  public PayStat amountYTD(Double amountYTD) {
    
    
    
    
    this.amountYTD = amountYTD;
    return this;
  }

  public PayStat amountYTD(Integer amountYTD) {
    
    
    
    
    this.amountYTD = amountYTD.doubleValue();
    return this;
  }

   /**
   * The amount for the earning line being paid out to the employee for the current pay year.
   * @return amountYTD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18000", value = "The amount for the earning line being paid out to the employee for the current pay year.")

  public Double getAmountYTD() {
    return amountYTD;
  }


  public void setAmountYTD(Double amountYTD) {
    
    
    
    this.amountYTD = amountYTD;
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
   * @return the PayStat instance itself
   */
  public PayStat putAdditionalProperty(String key, Object value) {
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
    PayStat payStat = (PayStat) o;
    return Objects.equals(this.description, payStat.description) &&
        Objects.equals(this.name, payStat.name) &&
        Objects.equals(this.type, payStat.type) &&
        Objects.equals(this.amountCurrent, payStat.amountCurrent) &&
        Objects.equals(this.amountYTD, payStat.amountYTD)&&
        Objects.equals(this.additionalProperties, payStat.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, type, amountCurrent, amountYTD, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayStat {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amountCurrent: ").append(toIndentedString(amountCurrent)).append("\n");
    sb.append("    amountYTD: ").append(toIndentedString(amountYTD)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("amountCurrent");
    openapiFields.add("amountYTD");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayStat
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayStat.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayStat is not found in the empty JSON string", PayStat.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayStat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayStat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayStat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayStat.class));

       return (TypeAdapter<T>) new TypeAdapter<PayStat>() {
           @Override
           public void write(JsonWriter out, PayStat value) throws IOException {
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
           public PayStat read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayStat instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayStat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayStat
  * @throws IOException if the JSON string is invalid with respect to PayStat
  */
  public static PayStat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayStat.class);
  }

 /**
  * Convert an instance of PayStat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
