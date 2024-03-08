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
 * Categorization Record
 */
@ApiModel(description = "Categorization Record")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Categorization {
  public static final String SERIALIZED_NAME_NORMALIZED_PAYEE_NAME = "normalizedPayeeName";
  @SerializedName(SERIALIZED_NAME_NORMALIZED_PAYEE_NAME)
  private String normalizedPayeeName;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_BEST_REPRESENTATION = "bestRepresentation";
  @SerializedName(SERIALIZED_NAME_BEST_REPRESENTATION)
  private String bestRepresentation;

  public Categorization() {
  }

  public Categorization normalizedPayeeName(String normalizedPayeeName) {
    
    
    
    
    this.normalizedPayeeName = normalizedPayeeName;
    return this;
  }

   /**
   * A normalized payee, derived from the transaction&#39;s description and memo fields
   * @return normalizedPayeeName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Mad Science Research", required = true, value = "A normalized payee, derived from the transaction's description and memo fields")

  public String getNormalizedPayeeName() {
    return normalizedPayeeName;
  }


  public void setNormalizedPayeeName(String normalizedPayeeName) {
    
    
    
    this.normalizedPayeeName = normalizedPayeeName;
  }


  public Categorization category(String category) {
    
    
    
    
    this.category = category;
    return this;
  }

   /**
   * The different categories for transactions. * \&quot;ATM Fee\&quot;  * \&quot;Advertising\&quot;  * \&quot;Air Travel\&quot;  * \&quot;Alcohol &amp; Bars\&quot;  * \&quot;Allowance\&quot;  * \&quot;Amusement\&quot;  * \&quot;Arts\&quot;  * \&quot;Auto &amp; Transport\&quot;  * \&quot;Auto Insurance\&quot;  * \&quot;Auto Payment\&quot;  * \&quot;Baby Supplies\&quot;  * \&quot;Babysitter &amp; Daycare\&quot;  * \&quot;Bank Fee\&quot;  * \&quot;Bills &amp; Utilities\&quot;  * \&quot;Bonus\&quot;  * \&quot;Books\&quot;  * \&quot;Books &amp; Supplies\&quot;  * \&quot;Business Services\&quot;  * \&quot;Buy\&quot;  * \&quot;Cash &amp; ATM\&quot;  * \&quot;Charity\&quot;  * \&quot;Check\&quot;  * \&quot;Child Support\&quot;  * \&quot;Clothing\&quot;  * \&quot;Coffee Shops\&quot;  * \&quot;Credit Card Payment\&quot;  * \&quot;Dentist\&quot;  * \&quot;Deposit\&quot;  * \&quot;Dividend &amp; Cap Gains\&quot;  * \&quot;Doctor\&quot;  * \&quot;Education\&quot;  * \&quot;Electronics &amp; Software\&quot;  * \&quot;Entertainment\&quot;  * \&quot;Eyecare\&quot;  * \&quot;Fast Food\&quot;  * \&quot;Federal Tax\&quot;  * \&quot;Fees &amp; Charges\&quot;  * \&quot;Finance Charge\&quot;  * \&quot;Financial\&quot;  * \&quot;Financial Advisor\&quot;  * \&quot;Food &amp; Dining\&quot;  * \&quot;Furnishings\&quot;  * \&quot;Gas &amp; Fuel\&quot;  * \&quot;Gift\&quot;  * \&quot;Gifts &amp; Donations\&quot;  * \&quot;Groceries\&quot;  * \&quot;Gym\&quot;  * \&quot;Hair\&quot;  * \&quot;Health &amp; Fitness\&quot;  * \&quot;Health Insurance\&quot;  * \&quot;Hobbies\&quot;  * \&quot;Home\&quot;  * \&quot;Home Improvement\&quot;  * \&quot;Home Insurance\&quot;  * \&quot;Home Phone\&quot;  * \&quot;Home Services\&quot;  * \&quot;Home Supplies\&quot;  * \&quot;Hotel\&quot;  * \&quot;Income\&quot;  * \&quot;Interest Income\&quot;  * \&quot;Internet\&quot;  * \&quot;Investments\&quot;  * \&quot;Kids\&quot;  * \&quot;Kids Activities\&quot;  * \&quot;Late Fee\&quot;  * \&quot;Laundry\&quot;  * \&quot;Lawn &amp; Garden\&quot;  * \&quot;Legal\&quot;  * \&quot;Life Insurance\&quot;  * \&quot;Loan Fees and Charges\&quot;  * \&quot;Loan Insurance\&quot;  * \&quot;Loan Interest\&quot;  * \&quot;Loan Payment\&quot;  * \&quot;Loan Principal\&quot;  * \&quot;Loans\&quot;  * \&quot;Local Tax\&quot;  * \&quot;Low Balance\&quot;  * \&quot;Mobile Phone\&quot;  * \&quot;Mortgage &amp; Rent\&quot;  * \&quot;Movies &amp; DVDs\&quot;  * \&quot;Music\&quot;  * \&quot;Newspapers &amp; Magazines\&quot;  * \&quot;Office Supplies\&quot;  * \&quot;Parking\&quot;  * \&quot;Paycheck\&quot;  * \&quot;Personal Care\&quot;  * \&quot;Pet Food &amp; Supplies\&quot;  * \&quot;Pet Grooming\&quot;  * \&quot;Pets\&quot;  * \&quot;Pharmacy\&quot;  * \&quot;Printing\&quot;  * \&quot;Property Tax\&quot;  * \&quot;Public Transportation\&quot;  * \&quot;Reimbursement\&quot;  * \&quot;Rental Car &amp; Taxi\&quot;  * \&quot;Restaurants\&quot;  * \&quot;Sales Tax\&quot;  * \&quot;Sell\&quot;  * \&quot;Service &amp; Parts\&quot;  * \&quot;Service Fee\&quot;  * \&quot;Shipping\&quot;  * \&quot;Shopping\&quot;  * \&quot;Spa &amp; Massage\&quot;  * \&quot;Sporting Goods\&quot;  * \&quot;Sports\&quot;  * \&quot;State Tax\&quot;  * \&quot;Streaming Services\&quot;  * \&quot;Student Loan\&quot;  * \&quot;Taxes\&quot;  * \&quot;Television\&quot;  * \&quot;Toys\&quot;  * \&quot;Trade Commissions\&quot;  * \&quot;Transfer\&quot;  * \&quot;Transfer for Cash Spending\&quot;  * \&quot;Travel\&quot;  * \&quot;Tuition\&quot;  * \&quot;Uncategorized\&quot;  * \&quot;Utilities\&quot;  * \&quot;Vacation\&quot;  * \&quot;Veterinary\&quot;  * \&quot;Internet / Broadband Charges\&quot;
   * @return category
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ATM Fee", required = true, value = "The different categories for transactions. * \"ATM Fee\"  * \"Advertising\"  * \"Air Travel\"  * \"Alcohol & Bars\"  * \"Allowance\"  * \"Amusement\"  * \"Arts\"  * \"Auto & Transport\"  * \"Auto Insurance\"  * \"Auto Payment\"  * \"Baby Supplies\"  * \"Babysitter & Daycare\"  * \"Bank Fee\"  * \"Bills & Utilities\"  * \"Bonus\"  * \"Books\"  * \"Books & Supplies\"  * \"Business Services\"  * \"Buy\"  * \"Cash & ATM\"  * \"Charity\"  * \"Check\"  * \"Child Support\"  * \"Clothing\"  * \"Coffee Shops\"  * \"Credit Card Payment\"  * \"Dentist\"  * \"Deposit\"  * \"Dividend & Cap Gains\"  * \"Doctor\"  * \"Education\"  * \"Electronics & Software\"  * \"Entertainment\"  * \"Eyecare\"  * \"Fast Food\"  * \"Federal Tax\"  * \"Fees & Charges\"  * \"Finance Charge\"  * \"Financial\"  * \"Financial Advisor\"  * \"Food & Dining\"  * \"Furnishings\"  * \"Gas & Fuel\"  * \"Gift\"  * \"Gifts & Donations\"  * \"Groceries\"  * \"Gym\"  * \"Hair\"  * \"Health & Fitness\"  * \"Health Insurance\"  * \"Hobbies\"  * \"Home\"  * \"Home Improvement\"  * \"Home Insurance\"  * \"Home Phone\"  * \"Home Services\"  * \"Home Supplies\"  * \"Hotel\"  * \"Income\"  * \"Interest Income\"  * \"Internet\"  * \"Investments\"  * \"Kids\"  * \"Kids Activities\"  * \"Late Fee\"  * \"Laundry\"  * \"Lawn & Garden\"  * \"Legal\"  * \"Life Insurance\"  * \"Loan Fees and Charges\"  * \"Loan Insurance\"  * \"Loan Interest\"  * \"Loan Payment\"  * \"Loan Principal\"  * \"Loans\"  * \"Local Tax\"  * \"Low Balance\"  * \"Mobile Phone\"  * \"Mortgage & Rent\"  * \"Movies & DVDs\"  * \"Music\"  * \"Newspapers & Magazines\"  * \"Office Supplies\"  * \"Parking\"  * \"Paycheck\"  * \"Personal Care\"  * \"Pet Food & Supplies\"  * \"Pet Grooming\"  * \"Pets\"  * \"Pharmacy\"  * \"Printing\"  * \"Property Tax\"  * \"Public Transportation\"  * \"Reimbursement\"  * \"Rental Car & Taxi\"  * \"Restaurants\"  * \"Sales Tax\"  * \"Sell\"  * \"Service & Parts\"  * \"Service Fee\"  * \"Shipping\"  * \"Shopping\"  * \"Spa & Massage\"  * \"Sporting Goods\"  * \"Sports\"  * \"State Tax\"  * \"Streaming Services\"  * \"Student Loan\"  * \"Taxes\"  * \"Television\"  * \"Toys\"  * \"Trade Commissions\"  * \"Transfer\"  * \"Transfer for Cash Spending\"  * \"Travel\"  * \"Tuition\"  * \"Uncategorized\"  * \"Utilities\"  * \"Vacation\"  * \"Veterinary\"  * \"Internet / Broadband Charges\"")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    
    
    
    this.category = category;
  }


  public Categorization city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Murray", value = "City")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public Categorization state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * State
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UT", value = "State")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public Categorization postalCode(String postalCode) {
    
    
    
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * A ZIP code
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "84123", value = "A ZIP code")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    
    
    
    this.postalCode = postalCode;
  }


  public Categorization country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Country code is Iso3166-1 Alpha-2 code and Alpha 3 standard (max length 3).
   * @return country
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USA", required = true, value = "Country code is Iso3166-1 Alpha-2 code and Alpha 3 standard (max length 3).")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public Categorization bestRepresentation(String bestRepresentation) {
    
    
    
    
    this.bestRepresentation = bestRepresentation;
    return this;
  }

   /**
   * Combines the &#x60;description&#x60; and &#x60;memo&#x60; data together, removing duplicated information and numbers and special characters
   * @return bestRepresentation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VERIZON WIRELESS PAYMENTS", value = "Combines the `description` and `memo` data together, removing duplicated information and numbers and special characters")

  public String getBestRepresentation() {
    return bestRepresentation;
  }


  public void setBestRepresentation(String bestRepresentation) {
    
    
    
    this.bestRepresentation = bestRepresentation;
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
   * @return the Categorization instance itself
   */
  public Categorization putAdditionalProperty(String key, Object value) {
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
    Categorization categorization = (Categorization) o;
    return Objects.equals(this.normalizedPayeeName, categorization.normalizedPayeeName) &&
        Objects.equals(this.category, categorization.category) &&
        Objects.equals(this.city, categorization.city) &&
        Objects.equals(this.state, categorization.state) &&
        Objects.equals(this.postalCode, categorization.postalCode) &&
        Objects.equals(this.country, categorization.country) &&
        Objects.equals(this.bestRepresentation, categorization.bestRepresentation)&&
        Objects.equals(this.additionalProperties, categorization.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(normalizedPayeeName, category, city, state, postalCode, country, bestRepresentation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Categorization {\n");
    sb.append("    normalizedPayeeName: ").append(toIndentedString(normalizedPayeeName)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    bestRepresentation: ").append(toIndentedString(bestRepresentation)).append("\n");
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
    openapiFields.add("normalizedPayeeName");
    openapiFields.add("category");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("postalCode");
    openapiFields.add("country");
    openapiFields.add("bestRepresentation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("normalizedPayeeName");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("country");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Categorization
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Categorization.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Categorization is not found in the empty JSON string", Categorization.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Categorization.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("normalizedPayeeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `normalizedPayeeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("normalizedPayeeName").toString()));
      }
      if (!jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("postalCode") != null && !jsonObj.get("postalCode").isJsonNull()) && !jsonObj.get("postalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalCode").toString()));
      }
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("bestRepresentation") != null && !jsonObj.get("bestRepresentation").isJsonNull()) && !jsonObj.get("bestRepresentation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bestRepresentation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bestRepresentation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Categorization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Categorization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Categorization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Categorization.class));

       return (TypeAdapter<T>) new TypeAdapter<Categorization>() {
           @Override
           public void write(JsonWriter out, Categorization value) throws IOException {
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
           public Categorization read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Categorization instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Categorization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Categorization
  * @throws IOException if the JSON string is invalid with respect to Categorization
  */
  public static Categorization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Categorization.class);
  }

 /**
  * Convert an instance of Categorization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

