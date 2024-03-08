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
import com.konfigthis.client.model.ThirdPartyAccessProduct;
import com.konfigthis.client.model.ThirdPartyAccessProvenance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * An object representing consent receipt
 */
@ApiModel(description = "An object representing consent receipt")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ThirdPartyAccessReceipt {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private Integer profile;

  public static final String SERIALIZED_NAME_RECEIPT_ID = "receiptId";
  @SerializedName(SERIALIZED_NAME_RECEIPT_ID)
  private String receiptId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partnerId";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<ThirdPartyAccessProduct> products = null;

  public static final String SERIALIZED_NAME_PROVENANCE = "provenance";
  @SerializedName(SERIALIZED_NAME_PROVENANCE)
  private ThirdPartyAccessProvenance provenance;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public ThirdPartyAccessReceipt() {
  }

  public ThirdPartyAccessReceipt version(String version) {
    
    
    
    
    this.version = version;
    return this;
  }

   /**
   * A schema version of receipt
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "A schema version of receipt")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    
    
    
    this.version = version;
  }


  public ThirdPartyAccessReceipt profile(Integer profile) {
    
    
    
    
    this.profile = profile;
    return this;
  }

   /**
   * Representation of the type of consent receipt
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Representation of the type of consent receipt")

  public Integer getProfile() {
    return profile;
  }


  public void setProfile(Integer profile) {
    
    
    
    this.profile = profile;
  }


  public ThirdPartyAccessReceipt receiptId(String receiptId) {
    
    
    
    
    this.receiptId = receiptId;
    return this;
  }

   /**
   * This is officially the Consent Receipt ID, but is aliased as the Access Key ID. This is a unique identifier managed by Finicity that points to the contents of this JSON document.
   * @return receiptId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cr_4pfI2r1X8aOHrDDwrwC01NHTxOXlT1", value = "This is officially the Consent Receipt ID, but is aliased as the Access Key ID. This is a unique identifier managed by Finicity that points to the contents of this JSON document.")

  public String getReceiptId() {
    return receiptId;
  }


  public void setReceiptId(String receiptId) {
    
    
    
    this.receiptId = receiptId;
  }


  public ThirdPartyAccessReceipt customerId(String customerId) {
    
    
    
    
    this.customerId = customerId;
    return this;
  }

   /**
   * This is recipient&#39;s customerId represented as a pseudo identifier
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3465230025077724000", value = "This is recipient's customerId represented as a pseudo identifier")

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    
    
    
    this.customerId = customerId;
  }


  public ThirdPartyAccessReceipt partnerId(String partnerId) {
    
    
    
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234583871234", value = "Your Partner ID displayed in the [Developer Dashboard](https://developer.mastercard.com/account/log-in)")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    
    
    
    this.partnerId = partnerId;
  }


  public ThirdPartyAccessReceipt products(List<ThirdPartyAccessProduct> products) {
    
    
    
    
    this.products = products;
    return this;
  }

  public ThirdPartyAccessReceipt addProductsItem(ThirdPartyAccessProduct productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ThirdPartyAccessProduct> getProducts() {
    return products;
  }


  public void setProducts(List<ThirdPartyAccessProduct> products) {
    
    
    
    this.products = products;
  }


  public ThirdPartyAccessReceipt provenance(ThirdPartyAccessProvenance provenance) {
    
    
    
    
    this.provenance = provenance;
    return this;
  }

   /**
   * Get provenance
   * @return provenance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ThirdPartyAccessProvenance getProvenance() {
    return provenance;
  }


  public void setProvenance(ThirdPartyAccessProvenance provenance) {
    
    
    
    this.provenance = provenance;
  }


  public ThirdPartyAccessReceipt timestamp(OffsetDateTime timestamp) {
    
    
    
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * A date-time with time zone
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-03-10T06:06:20.042584549Z", value = "A date-time with time zone")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    
    
    
    this.timestamp = timestamp;
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
   * @return the ThirdPartyAccessReceipt instance itself
   */
  public ThirdPartyAccessReceipt putAdditionalProperty(String key, Object value) {
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
    ThirdPartyAccessReceipt thirdPartyAccessReceipt = (ThirdPartyAccessReceipt) o;
    return Objects.equals(this.version, thirdPartyAccessReceipt.version) &&
        Objects.equals(this.profile, thirdPartyAccessReceipt.profile) &&
        Objects.equals(this.receiptId, thirdPartyAccessReceipt.receiptId) &&
        Objects.equals(this.customerId, thirdPartyAccessReceipt.customerId) &&
        Objects.equals(this.partnerId, thirdPartyAccessReceipt.partnerId) &&
        Objects.equals(this.products, thirdPartyAccessReceipt.products) &&
        Objects.equals(this.provenance, thirdPartyAccessReceipt.provenance) &&
        Objects.equals(this.timestamp, thirdPartyAccessReceipt.timestamp)&&
        Objects.equals(this.additionalProperties, thirdPartyAccessReceipt.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, profile, receiptId, customerId, partnerId, products, provenance, timestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyAccessReceipt {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    receiptId: ").append(toIndentedString(receiptId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("profile");
    openapiFields.add("receiptId");
    openapiFields.add("customerId");
    openapiFields.add("partnerId");
    openapiFields.add("products");
    openapiFields.add("provenance");
    openapiFields.add("timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThirdPartyAccessReceipt
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ThirdPartyAccessReceipt.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThirdPartyAccessReceipt is not found in the empty JSON string", ThirdPartyAccessReceipt.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("receiptId") != null && !jsonObj.get("receiptId").isJsonNull()) && !jsonObj.get("receiptId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receiptId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receiptId").toString()));
      }
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      if ((jsonObj.get("partnerId") != null && !jsonObj.get("partnerId").isJsonNull()) && !jsonObj.get("partnerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerId").toString()));
      }
      if (jsonObj.get("products") != null && !jsonObj.get("products").isJsonNull()) {
        JsonArray jsonArrayproducts = jsonObj.getAsJsonArray("products");
        if (jsonArrayproducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("products").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `products` to be an array in the JSON string but got `%s`", jsonObj.get("products").toString()));
          }

          // validate the optional field `products` (array)
          for (int i = 0; i < jsonArrayproducts.size(); i++) {
            ThirdPartyAccessProduct.validateJsonObject(jsonArrayproducts.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `provenance`
      if (jsonObj.get("provenance") != null && !jsonObj.get("provenance").isJsonNull()) {
        ThirdPartyAccessProvenance.validateJsonObject(jsonObj.getAsJsonObject("provenance"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThirdPartyAccessReceipt.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThirdPartyAccessReceipt' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThirdPartyAccessReceipt> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThirdPartyAccessReceipt.class));

       return (TypeAdapter<T>) new TypeAdapter<ThirdPartyAccessReceipt>() {
           @Override
           public void write(JsonWriter out, ThirdPartyAccessReceipt value) throws IOException {
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
           public ThirdPartyAccessReceipt read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ThirdPartyAccessReceipt instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ThirdPartyAccessReceipt given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThirdPartyAccessReceipt
  * @throws IOException if the JSON string is invalid with respect to ThirdPartyAccessReceipt
  */
  public static ThirdPartyAccessReceipt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThirdPartyAccessReceipt.class);
  }

 /**
  * Convert an instance of ThirdPartyAccessReceipt to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
