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
import com.konfigthis.client.model.ObbAccountOwner;
import com.konfigthis.client.model.ObbInstitution;
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
 * Details of the account and financial institution
 */
@ApiModel(description = "Details of the account and financial institution")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ObbAccountDetails {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER_DISPLAY = "accountNumberDisplay";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER_DISPLAY)
  private String accountNumberDisplay;

  public static final String SERIALIZED_NAME_ACCOUNT_OWNER = "accountOwner";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_OWNER)
  private ObbAccountOwner accountOwner;

  public static final String SERIALIZED_NAME_AGGREGATION_ATTEMPT_DATE = "aggregationAttemptDate";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_ATTEMPT_DATE)
  private String aggregationAttemptDate;

  public static final String SERIALIZED_NAME_AGGREGATION_STATUS_CODE = "aggregationStatusCode";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_STATUS_CODE)
  private Integer aggregationStatusCode;

  public static final String SERIALIZED_NAME_AGGREGATION_SUCCESS_DATE = "aggregationSuccessDate";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_SUCCESS_DATE)
  private String aggregationSuccessDate;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_CURRENT_BALANCE = "currentBalance";
  @SerializedName(SERIALIZED_NAME_CURRENT_BALANCE)
  private Double currentBalance;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private ObbInstitution institution;

  public static final String SERIALIZED_NAME_INSTITUTION_LOGIN_ID = "institutionLoginId";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_LOGIN_ID)
  private Long institutionLoginId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REAL_ACCOUNT_NUMBER_LAST4 = "realAccountNumberLast4";
  @SerializedName(SERIALIZED_NAME_REAL_ACCOUNT_NUMBER_LAST4)
  private Integer realAccountNumberLast4;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ObbAccountDetails() {
  }

  public ObbAccountDetails accountNumberDisplay(String accountNumberDisplay) {
    
    
    if (accountNumberDisplay != null && accountNumberDisplay.length() < 0) {
      throw new IllegalArgumentException("Invalid value for accountNumberDisplay. Length must be greater than or equal to 0.");
    }
    
    this.accountNumberDisplay = accountNumberDisplay;
    return this;
  }

   /**
   * The account number from a financial institution in truncated format
   * @return accountNumberDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8888", value = "The account number from a financial institution in truncated format")

  public String getAccountNumberDisplay() {
    return accountNumberDisplay;
  }


  public void setAccountNumberDisplay(String accountNumberDisplay) {
    
    
    if (accountNumberDisplay != null && accountNumberDisplay.length() < 0) {
      throw new IllegalArgumentException("Invalid value for accountNumberDisplay. Length must be greater than or equal to 0.");
    }
    this.accountNumberDisplay = accountNumberDisplay;
  }


  public ObbAccountDetails accountOwner(ObbAccountOwner accountOwner) {
    
    
    
    
    this.accountOwner = accountOwner;
    return this;
  }

   /**
   * Get accountOwner
   * @return accountOwner
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ObbAccountOwner getAccountOwner() {
    return accountOwner;
  }


  public void setAccountOwner(ObbAccountOwner accountOwner) {
    
    
    
    this.accountOwner = accountOwner;
  }


  public ObbAccountDetails aggregationAttemptDate(String aggregationAttemptDate) {
    
    
    if (aggregationAttemptDate != null && aggregationAttemptDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for aggregationAttemptDate. Length must be greater than or equal to 25.");
    }
    
    this.aggregationAttemptDate = aggregationAttemptDate;
    return this;
  }

   /**
   * A timestamp showing the last aggregation attempt. This will not be present until you have run your first aggregation for the account.
   * @return aggregationAttemptDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-03-30T14:47:19-07:00", value = "A timestamp showing the last aggregation attempt. This will not be present until you have run your first aggregation for the account.")

  public String getAggregationAttemptDate() {
    return aggregationAttemptDate;
  }


  public void setAggregationAttemptDate(String aggregationAttemptDate) {
    
    
    if (aggregationAttemptDate != null && aggregationAttemptDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for aggregationAttemptDate. Length must be greater than or equal to 25.");
    }
    this.aggregationAttemptDate = aggregationAttemptDate;
  }


  public ObbAccountDetails aggregationStatusCode(Integer aggregationStatusCode) {
    
    
    
    
    this.aggregationStatusCode = aggregationStatusCode;
    return this;
  }

   /**
   * The status of the most recent aggregation attempt. This will not be present until you have run your first aggregation for the account
   * @return aggregationStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The status of the most recent aggregation attempt. This will not be present until you have run your first aggregation for the account")

  public Integer getAggregationStatusCode() {
    return aggregationStatusCode;
  }


  public void setAggregationStatusCode(Integer aggregationStatusCode) {
    
    
    
    this.aggregationStatusCode = aggregationStatusCode;
  }


  public ObbAccountDetails aggregationSuccessDate(String aggregationSuccessDate) {
    
    
    if (aggregationSuccessDate != null && aggregationSuccessDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for aggregationSuccessDate. Length must be greater than or equal to 25.");
    }
    
    this.aggregationSuccessDate = aggregationSuccessDate;
    return this;
  }

   /**
   * A timestamp showing the last successful aggregation of the account. This will not be present until you have run your first aggregation for the account.
   * @return aggregationSuccessDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-03-30T14:47:19-07:00", value = "A timestamp showing the last successful aggregation of the account. This will not be present until you have run your first aggregation for the account.")

  public String getAggregationSuccessDate() {
    return aggregationSuccessDate;
  }


  public void setAggregationSuccessDate(String aggregationSuccessDate) {
    
    
    if (aggregationSuccessDate != null && aggregationSuccessDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for aggregationSuccessDate. Length must be greater than or equal to 25.");
    }
    this.aggregationSuccessDate = aggregationSuccessDate;
  }


  public ObbAccountDetails currency(String currency) {
    
    
    if (currency != null && currency.length() < 0) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 0.");
    }
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the account
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The currency of the account")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    if (currency != null && currency.length() < 0) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 0.");
    }
    this.currency = currency;
  }


  public ObbAccountDetails currentBalance(Double currentBalance) {
    
    
    
    
    this.currentBalance = currentBalance;
    return this;
  }

  public ObbAccountDetails currentBalance(Integer currentBalance) {
    
    
    
    
    this.currentBalance = currentBalance.doubleValue();
    return this;
  }

   /**
   * Current reported balance of the account
   * @return currentBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2239.22", value = "Current reported balance of the account")

  public Double getCurrentBalance() {
    return currentBalance;
  }


  public void setCurrentBalance(Double currentBalance) {
    
    
    
    this.currentBalance = currentBalance;
  }


  public ObbAccountDetails id(Long id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * An account ID represented as a number
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5011648377", required = true, value = "An account ID represented as a number")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    
    
    
    this.id = id;
  }


  public ObbAccountDetails institution(ObbInstitution institution) {
    
    
    
    
    this.institution = institution;
    return this;
  }

   /**
   * Get institution
   * @return institution
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ObbInstitution getInstitution() {
    return institution;
  }


  public void setInstitution(ObbInstitution institution) {
    
    
    
    this.institution = institution;
  }


  public ObbAccountDetails institutionLoginId(Long institutionLoginId) {
    
    
    
    
    this.institutionLoginId = institutionLoginId;
    return this;
  }

   /**
   * An institution login ID (from the account record), represented as a number
   * @return institutionLoginId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1007302745", value = "An institution login ID (from the account record), represented as a number")

  public Long getInstitutionLoginId() {
    return institutionLoginId;
  }


  public void setInstitutionLoginId(Long institutionLoginId) {
    
    
    
    this.institutionLoginId = institutionLoginId;
  }


  public ObbAccountDetails name(String name) {
    
    
    if (name != null && name.length() < 0) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 0.");
    }
    
    this.name = name;
    return this;
  }

   /**
   * The account name from the institution
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Super Checking", value = "The account name from the institution")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    if (name != null && name.length() < 0) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 0.");
    }
    this.name = name;
  }


  public ObbAccountDetails realAccountNumberLast4(Integer realAccountNumberLast4) {
    
    
    
    
    this.realAccountNumberLast4 = realAccountNumberLast4;
    return this;
  }

   /**
   * The last 4 digits of the ACH account number
   * @return realAccountNumberLast4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5678", value = "The last 4 digits of the ACH account number")

  public Integer getRealAccountNumberLast4() {
    return realAccountNumberLast4;
  }


  public void setRealAccountNumberLast4(Integer realAccountNumberLast4) {
    
    
    
    this.realAccountNumberLast4 = realAccountNumberLast4;
  }


  public ObbAccountDetails status(String status) {
    
    
    if (status != null && status.length() < 0) {
      throw new IllegalArgumentException("Invalid value for status. Length must be greater than or equal to 0.");
    }
    
    this.status = status;
    return this;
  }

   /**
   * pending during account discovery, always active following successful account activation
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "active", value = "pending during account discovery, always active following successful account activation")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    if (status != null && status.length() < 0) {
      throw new IllegalArgumentException("Invalid value for status. Length must be greater than or equal to 0.");
    }
    this.status = status;
  }


  public ObbAccountDetails type(String type) {
    
    
    if (type != null && type.length() < 0) {
      throw new IllegalArgumentException("Invalid value for type. Length must be greater than or equal to 0.");
    }
    
    this.type = type;
    return this;
  }

   /**
   * Account type, e.g. checking/saving
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "checking", value = "Account type, e.g. checking/saving")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    if (type != null && type.length() < 0) {
      throw new IllegalArgumentException("Invalid value for type. Length must be greater than or equal to 0.");
    }
    this.type = type;
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
   * @return the ObbAccountDetails instance itself
   */
  public ObbAccountDetails putAdditionalProperty(String key, Object value) {
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
    ObbAccountDetails obbAccountDetails = (ObbAccountDetails) o;
    return Objects.equals(this.accountNumberDisplay, obbAccountDetails.accountNumberDisplay) &&
        Objects.equals(this.accountOwner, obbAccountDetails.accountOwner) &&
        Objects.equals(this.aggregationAttemptDate, obbAccountDetails.aggregationAttemptDate) &&
        Objects.equals(this.aggregationStatusCode, obbAccountDetails.aggregationStatusCode) &&
        Objects.equals(this.aggregationSuccessDate, obbAccountDetails.aggregationSuccessDate) &&
        Objects.equals(this.currency, obbAccountDetails.currency) &&
        Objects.equals(this.currentBalance, obbAccountDetails.currentBalance) &&
        Objects.equals(this.id, obbAccountDetails.id) &&
        Objects.equals(this.institution, obbAccountDetails.institution) &&
        Objects.equals(this.institutionLoginId, obbAccountDetails.institutionLoginId) &&
        Objects.equals(this.name, obbAccountDetails.name) &&
        Objects.equals(this.realAccountNumberLast4, obbAccountDetails.realAccountNumberLast4) &&
        Objects.equals(this.status, obbAccountDetails.status) &&
        Objects.equals(this.type, obbAccountDetails.type)&&
        Objects.equals(this.additionalProperties, obbAccountDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumberDisplay, accountOwner, aggregationAttemptDate, aggregationStatusCode, aggregationSuccessDate, currency, currentBalance, id, institution, institutionLoginId, name, realAccountNumberLast4, status, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObbAccountDetails {\n");
    sb.append("    accountNumberDisplay: ").append(toIndentedString(accountNumberDisplay)).append("\n");
    sb.append("    accountOwner: ").append(toIndentedString(accountOwner)).append("\n");
    sb.append("    aggregationAttemptDate: ").append(toIndentedString(aggregationAttemptDate)).append("\n");
    sb.append("    aggregationStatusCode: ").append(toIndentedString(aggregationStatusCode)).append("\n");
    sb.append("    aggregationSuccessDate: ").append(toIndentedString(aggregationSuccessDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    institutionLoginId: ").append(toIndentedString(institutionLoginId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    realAccountNumberLast4: ").append(toIndentedString(realAccountNumberLast4)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("accountNumberDisplay");
    openapiFields.add("accountOwner");
    openapiFields.add("aggregationAttemptDate");
    openapiFields.add("aggregationStatusCode");
    openapiFields.add("aggregationSuccessDate");
    openapiFields.add("currency");
    openapiFields.add("currentBalance");
    openapiFields.add("id");
    openapiFields.add("institution");
    openapiFields.add("institutionLoginId");
    openapiFields.add("name");
    openapiFields.add("realAccountNumberLast4");
    openapiFields.add("status");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountOwner");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("institution");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ObbAccountDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ObbAccountDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ObbAccountDetails is not found in the empty JSON string", ObbAccountDetails.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ObbAccountDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("accountNumberDisplay") != null && !jsonObj.get("accountNumberDisplay").isJsonNull()) && !jsonObj.get("accountNumberDisplay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumberDisplay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumberDisplay").toString()));
      }
      // validate the required field `accountOwner`
      ObbAccountOwner.validateJsonObject(jsonObj.getAsJsonObject("accountOwner"));
      if ((jsonObj.get("aggregationAttemptDate") != null && !jsonObj.get("aggregationAttemptDate").isJsonNull()) && !jsonObj.get("aggregationAttemptDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggregationAttemptDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aggregationAttemptDate").toString()));
      }
      if ((jsonObj.get("aggregationSuccessDate") != null && !jsonObj.get("aggregationSuccessDate").isJsonNull()) && !jsonObj.get("aggregationSuccessDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggregationSuccessDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aggregationSuccessDate").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the required field `institution`
      ObbInstitution.validateJsonObject(jsonObj.getAsJsonObject("institution"));
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ObbAccountDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ObbAccountDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ObbAccountDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ObbAccountDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ObbAccountDetails>() {
           @Override
           public void write(JsonWriter out, ObbAccountDetails value) throws IOException {
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
           public ObbAccountDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ObbAccountDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ObbAccountDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ObbAccountDetails
  * @throws IOException if the JSON string is invalid with respect to ObbAccountDetails
  */
  public static ObbAccountDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ObbAccountDetails.class);
  }

 /**
  * Convert an instance of ObbAccountDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

