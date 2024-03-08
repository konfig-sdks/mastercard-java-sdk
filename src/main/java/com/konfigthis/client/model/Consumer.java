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
import com.konfigthis.client.model.Birthday;
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
 * A finicity consumer record
 */
@ApiModel(description = "A finicity consumer record")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Consumer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private Long customerId;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_SSN = "ssn";
  @SerializedName(SERIALIZED_NAME_SSN)
  private String ssn;

  public static final String SERIALIZED_NAME_BIRTHDAY = "birthday";
  @SerializedName(SERIALIZED_NAME_BIRTHDAY)
  private Birthday birthday;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private Long createdDate;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private String suffix;

  public Consumer() {
  }

  public Consumer id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * A consumer ID. See Create Consumer API for how to create a consumer ID.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0bf46322c167b562e6cbed9d40e19a4c", required = true, value = "A consumer ID. See Create Consumer API for how to create a consumer ID.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Consumer firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the account holder
   * @return firstName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "John", required = true, value = "The first name of the account holder")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public Consumer lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the account holder
   * @return lastName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Smith", required = true, value = "The last name of the account holder")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public Consumer customerId(Long customerId) {
    
    
    
    
    this.customerId = customerId;
    return this;
  }

   /**
   * A customer ID represented as a number. See Add Customer API for how to create a customer ID.
   * @return customerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1005061234", required = true, value = "A customer ID represented as a number. See Add Customer API for how to create a customer ID.")

  public Long getCustomerId() {
    return customerId;
  }


  public void setCustomerId(Long customerId) {
    
    
    
    this.customerId = customerId;
  }


  public Consumer address(String address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * A street address
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "434 W Ascension Way", required = true, value = "A street address")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    
    
    
    this.address = address;
  }


  public Consumer city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Murray", required = true, value = "City")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public Consumer state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * State
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "UT", required = true, value = "State")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public Consumer zip(String zip) {
    
    
    
    
    this.zip = zip;
    return this;
  }

   /**
   * A ZIP code
   * @return zip
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "84123", required = true, value = "A ZIP code")

  public String getZip() {
    return zip;
  }


  public void setZip(String zip) {
    
    
    
    this.zip = zip;
  }


  public Consumer phone(String phone) {
    
    
    
    
    this.phone = phone;
    return this;
  }

   /**
   * A phone number (max length 15).
   * @return phone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1-801-984-4200", required = true, value = "A phone number (max length 15).")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    
    
    
    this.phone = phone;
  }


  public Consumer ssn(String ssn) {
    
    
    
    
    this.ssn = ssn;
    return this;
  }

   /**
   * Last 4 digits of a SSN
   * @return ssn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "9999", required = true, value = "Last 4 digits of a SSN")

  public String getSsn() {
    return ssn;
  }


  public void setSsn(String ssn) {
    
    
    
    this.ssn = ssn;
  }


  public Consumer birthday(Birthday birthday) {
    
    
    
    
    this.birthday = birthday;
    return this;
  }

   /**
   * Get birthday
   * @return birthday
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Birthday getBirthday() {
    return birthday;
  }


  public void setBirthday(Birthday birthday) {
    
    
    
    this.birthday = birthday;
  }


  public Consumer email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * An email address
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "myname@mycompany.com", required = true, value = "An email address")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public Consumer createdDate(Long createdDate) {
    
    
    
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).
   * @return createdDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1607450357", required = true, value = "A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/).")

  public Long getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(Long createdDate) {
    
    
    
    this.createdDate = createdDate;
  }


  public Consumer suffix(String suffix) {
    
    
    
    
    this.suffix = suffix;
    return this;
  }

   /**
   * A generational or academic suffix
   * @return suffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PhD", value = "A generational or academic suffix")

  public String getSuffix() {
    return suffix;
  }


  public void setSuffix(String suffix) {
    
    
    
    this.suffix = suffix;
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
   * @return the Consumer instance itself
   */
  public Consumer putAdditionalProperty(String key, Object value) {
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
    Consumer consumer = (Consumer) o;
    return Objects.equals(this.id, consumer.id) &&
        Objects.equals(this.firstName, consumer.firstName) &&
        Objects.equals(this.lastName, consumer.lastName) &&
        Objects.equals(this.customerId, consumer.customerId) &&
        Objects.equals(this.address, consumer.address) &&
        Objects.equals(this.city, consumer.city) &&
        Objects.equals(this.state, consumer.state) &&
        Objects.equals(this.zip, consumer.zip) &&
        Objects.equals(this.phone, consumer.phone) &&
        Objects.equals(this.ssn, consumer.ssn) &&
        Objects.equals(this.birthday, consumer.birthday) &&
        Objects.equals(this.email, consumer.email) &&
        Objects.equals(this.createdDate, consumer.createdDate) &&
        Objects.equals(this.suffix, consumer.suffix)&&
        Objects.equals(this.additionalProperties, consumer.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, customerId, address, city, state, zip, phone, ssn, birthday, email, createdDate, suffix, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consumer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("customerId");
    openapiFields.add("address");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");
    openapiFields.add("phone");
    openapiFields.add("ssn");
    openapiFields.add("birthday");
    openapiFields.add("email");
    openapiFields.add("createdDate");
    openapiFields.add("suffix");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("customerId");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("zip");
    openapiRequiredFields.add("phone");
    openapiRequiredFields.add("ssn");
    openapiRequiredFields.add("birthday");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("createdDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Consumer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Consumer.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Consumer is not found in the empty JSON string", Consumer.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Consumer.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (!jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if (!jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (!jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
      if (!jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (!jsonObj.get("ssn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssn").toString()));
      }
      // validate the required field `birthday`
      Birthday.validateJsonObject(jsonObj.getAsJsonObject("birthday"));
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("suffix") != null && !jsonObj.get("suffix").isJsonNull()) && !jsonObj.get("suffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suffix").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Consumer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Consumer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Consumer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Consumer.class));

       return (TypeAdapter<T>) new TypeAdapter<Consumer>() {
           @Override
           public void write(JsonWriter out, Consumer value) throws IOException {
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
           public Consumer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Consumer instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Consumer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Consumer
  * @throws IOException if the JSON string is invalid with respect to Consumer
  */
  public static Consumer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Consumer.class);
  }

 /**
  * Convert an instance of Consumer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

