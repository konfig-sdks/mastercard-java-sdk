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
import com.konfigthis.client.model.AccountOwnerAddress;
import com.konfigthis.client.model.AccountOwnerDocumentation;
import com.konfigthis.client.model.AccountOwnerEmail;
import com.konfigthis.client.model.AccountOwnerIdentityInsights;
import com.konfigthis.client.model.AccountOwnerPhone;
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
 * Owner of a customer account
 */
@ApiModel(description = "Owner of a customer account")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AccountOwnerDetails {
  public static final String SERIALIZED_NAME_RELATIONSHIP = "relationship";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP)
  private String relationship;

  public static final String SERIALIZED_NAME_OWNER_NAME = "ownerName";
  @SerializedName(SERIALIZED_NAME_OWNER_NAME)
  private String ownerName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private String suffix;

  public static final String SERIALIZED_NAME_NAME_CLASSIFICATION = "nameClassification";
  @SerializedName(SERIALIZED_NAME_NAME_CLASSIFICATION)
  private String nameClassification;

  public static final String SERIALIZED_NAME_NAME_CLASSIFICATIONCONFIDENCESCORE = "nameClassificationconfidencescore";
  @SerializedName(SERIALIZED_NAME_NAME_CLASSIFICATIONCONFIDENCESCORE)
  private Double nameClassificationconfidencescore;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<AccountOwnerAddress> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<AccountOwnerEmail> emails = null;

  public static final String SERIALIZED_NAME_PHONES = "phones";
  @SerializedName(SERIALIZED_NAME_PHONES)
  private List<AccountOwnerPhone> phones = null;

  public static final String SERIALIZED_NAME_DOCUMENTATIONS = "documentations";
  @SerializedName(SERIALIZED_NAME_DOCUMENTATIONS)
  private List<AccountOwnerDocumentation> documentations = null;

  public static final String SERIALIZED_NAME_IDENTITY_INSIGHTS = "identityInsights";
  @SerializedName(SERIALIZED_NAME_IDENTITY_INSIGHTS)
  private AccountOwnerIdentityInsights identityInsights;

  public AccountOwnerDetails() {
  }

  public AccountOwnerDetails relationship(String relationship) {
    
    
    
    
    this.relationship = relationship;
    return this;
  }

   /**
   * The type of relationship to the account: * \&quot;AUTHORIZED_USER\&quot;  * \&quot;BUSINESS\&quot;  * \&quot;FOR_BENEFIT_OF_PRIMARY\&quot;  * \&quot;FOR_BENEFIT_OF_PRIMARY_JOINT_RESTRICTED\&quot;  * \&quot;FOR_BENEFIT_OF_SECONDARY\&quot;  * \&quot;FOR_BENEFIT_OF_SECONDARY_JOINT_RESTRICTED\&quot;  * \&quot;FOR_BENEFIT_OF_SOLE_OWNER_RESTRICTED\&quot;  * \&quot;POWER_OF_ATTORNEY\&quot;  * \&quot;PRIMARY_JOINT_TENANTS\&quot;  * \&quot;PRIMARY\&quot;  * \&quot;PRIMARY_BORROWER\&quot;  * \&quot;PRIMARY_JOINT\&quot;  * \&quot;SECONDARY\&quot;  * \&quot;SECONDARY_JOINT_TENANTS\&quot;  * \&quot;SECONDARY_BORROWER\&quot;  * \&quot;SECONDARY_JOINT\&quot;  * \&quot;SOLE_OWNER\&quot;  * \&quot;TRUSTEE\&quot;  * \&quot;UNIFORM_TRANSFER_TO_MINOR\&quot;
   * @return relationship
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUTHORIZED_USER", value = "The type of relationship to the account: * \"AUTHORIZED_USER\"  * \"BUSINESS\"  * \"FOR_BENEFIT_OF_PRIMARY\"  * \"FOR_BENEFIT_OF_PRIMARY_JOINT_RESTRICTED\"  * \"FOR_BENEFIT_OF_SECONDARY\"  * \"FOR_BENEFIT_OF_SECONDARY_JOINT_RESTRICTED\"  * \"FOR_BENEFIT_OF_SOLE_OWNER_RESTRICTED\"  * \"POWER_OF_ATTORNEY\"  * \"PRIMARY_JOINT_TENANTS\"  * \"PRIMARY\"  * \"PRIMARY_BORROWER\"  * \"PRIMARY_JOINT\"  * \"SECONDARY\"  * \"SECONDARY_JOINT_TENANTS\"  * \"SECONDARY_BORROWER\"  * \"SECONDARY_JOINT\"  * \"SOLE_OWNER\"  * \"TRUSTEE\"  * \"UNIFORM_TRANSFER_TO_MINOR\"")

  public String getRelationship() {
    return relationship;
  }


  public void setRelationship(String relationship) {
    
    
    
    this.relationship = relationship;
  }


  public AccountOwnerDetails ownerName(String ownerName) {
    
    
    
    
    this.ownerName = ownerName;
    return this;
  }

   /**
   * The full name of the account owner. Multiple account owners are returned in one string per the source data from the institution.
   * @return ownerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "John Smith, PhD", required = true, value = "The full name of the account owner. Multiple account owners are returned in one string per the source data from the institution.")

  public String getOwnerName() {
    return ownerName;
  }


  public void setOwnerName(String ownerName) {
    
    
    
    this.ownerName = ownerName;
  }


  public AccountOwnerDetails firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the account holder
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John", value = "The first name of the account holder")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public AccountOwnerDetails middleName(String middleName) {
    
    
    
    
    this.middleName = middleName;
    return this;
  }

   /**
   * The middle name of the account holder
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "L", value = "The middle name of the account holder")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    
    
    
    this.middleName = middleName;
  }


  public AccountOwnerDetails lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the account holder
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Smith", value = "The last name of the account holder")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public AccountOwnerDetails suffix(String suffix) {
    
    
    
    
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


  public AccountOwnerDetails nameClassification(String nameClassification) {
    
    
    
    
    this.nameClassification = nameClassification;
    return this;
  }

   /**
   * The classification of the account holder: * \&quot;person / personal / home\&quot; * \&quot;business\&quot; * \&quot;other\&quot;
   * @return nameClassification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "person", value = "The classification of the account holder: * \"person / personal / home\" * \"business\" * \"other\"")

  public String getNameClassification() {
    return nameClassification;
  }


  public void setNameClassification(String nameClassification) {
    
    
    
    this.nameClassification = nameClassification;
  }


  public AccountOwnerDetails nameClassificationconfidencescore(Double nameClassificationconfidencescore) {
    
    
    
    
    this.nameClassificationconfidencescore = nameClassificationconfidencescore;
    return this;
  }

  public AccountOwnerDetails nameClassificationconfidencescore(Integer nameClassificationconfidencescore) {
    
    
    
    
    this.nameClassificationconfidencescore = nameClassificationconfidencescore.doubleValue();
    return this;
  }

   /**
   * The confidence score 0-100 of the name classification.
   * @return nameClassificationconfidencescore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "The confidence score 0-100 of the name classification.")

  public Double getNameClassificationconfidencescore() {
    return nameClassificationconfidencescore;
  }


  public void setNameClassificationconfidencescore(Double nameClassificationconfidencescore) {
    
    
    
    this.nameClassificationconfidencescore = nameClassificationconfidencescore;
  }


  public AccountOwnerDetails addresses(List<AccountOwnerAddress> addresses) {
    
    
    
    
    this.addresses = addresses;
    return this;
  }

  public AccountOwnerDetails addAddressesItem(AccountOwnerAddress addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * List of addresses
   * @return addresses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of addresses")

  public List<AccountOwnerAddress> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<AccountOwnerAddress> addresses) {
    
    
    
    this.addresses = addresses;
  }


  public AccountOwnerDetails emails(List<AccountOwnerEmail> emails) {
    
    
    
    
    this.emails = emails;
    return this;
  }

  public AccountOwnerDetails addEmailsItem(AccountOwnerEmail emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * List of emails
   * @return emails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of emails")

  public List<AccountOwnerEmail> getEmails() {
    return emails;
  }


  public void setEmails(List<AccountOwnerEmail> emails) {
    
    
    
    this.emails = emails;
  }


  public AccountOwnerDetails phones(List<AccountOwnerPhone> phones) {
    
    
    
    
    this.phones = phones;
    return this;
  }

  public AccountOwnerDetails addPhonesItem(AccountOwnerPhone phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<>();
    }
    this.phones.add(phonesItem);
    return this;
  }

   /**
   * List of phones
   * @return phones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of phones")

  public List<AccountOwnerPhone> getPhones() {
    return phones;
  }


  public void setPhones(List<AccountOwnerPhone> phones) {
    
    
    
    this.phones = phones;
  }


  public AccountOwnerDetails documentations(List<AccountOwnerDocumentation> documentations) {
    
    
    
    
    this.documentations = documentations;
    return this;
  }

  public AccountOwnerDetails addDocumentationsItem(AccountOwnerDocumentation documentationsItem) {
    if (this.documentations == null) {
      this.documentations = new ArrayList<>();
    }
    this.documentations.add(documentationsItem);
    return this;
  }

   /**
   * List of account owner documentation
   * @return documentations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of account owner documentation")

  public List<AccountOwnerDocumentation> getDocumentations() {
    return documentations;
  }


  public void setDocumentations(List<AccountOwnerDocumentation> documentations) {
    
    
    
    this.documentations = documentations;
  }


  public AccountOwnerDetails identityInsights(AccountOwnerIdentityInsights identityInsights) {
    
    
    
    
    this.identityInsights = identityInsights;
    return this;
  }

   /**
   * Get identityInsights
   * @return identityInsights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountOwnerIdentityInsights getIdentityInsights() {
    return identityInsights;
  }


  public void setIdentityInsights(AccountOwnerIdentityInsights identityInsights) {
    
    
    
    this.identityInsights = identityInsights;
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
   * @return the AccountOwnerDetails instance itself
   */
  public AccountOwnerDetails putAdditionalProperty(String key, Object value) {
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
    AccountOwnerDetails accountOwnerDetails = (AccountOwnerDetails) o;
    return Objects.equals(this.relationship, accountOwnerDetails.relationship) &&
        Objects.equals(this.ownerName, accountOwnerDetails.ownerName) &&
        Objects.equals(this.firstName, accountOwnerDetails.firstName) &&
        Objects.equals(this.middleName, accountOwnerDetails.middleName) &&
        Objects.equals(this.lastName, accountOwnerDetails.lastName) &&
        Objects.equals(this.suffix, accountOwnerDetails.suffix) &&
        Objects.equals(this.nameClassification, accountOwnerDetails.nameClassification) &&
        Objects.equals(this.nameClassificationconfidencescore, accountOwnerDetails.nameClassificationconfidencescore) &&
        Objects.equals(this.addresses, accountOwnerDetails.addresses) &&
        Objects.equals(this.emails, accountOwnerDetails.emails) &&
        Objects.equals(this.phones, accountOwnerDetails.phones) &&
        Objects.equals(this.documentations, accountOwnerDetails.documentations) &&
        Objects.equals(this.identityInsights, accountOwnerDetails.identityInsights)&&
        Objects.equals(this.additionalProperties, accountOwnerDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationship, ownerName, firstName, middleName, lastName, suffix, nameClassification, nameClassificationconfidencescore, addresses, emails, phones, documentations, identityInsights, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountOwnerDetails {\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    nameClassification: ").append(toIndentedString(nameClassification)).append("\n");
    sb.append("    nameClassificationconfidencescore: ").append(toIndentedString(nameClassificationconfidencescore)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    documentations: ").append(toIndentedString(documentations)).append("\n");
    sb.append("    identityInsights: ").append(toIndentedString(identityInsights)).append("\n");
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
    openapiFields.add("relationship");
    openapiFields.add("ownerName");
    openapiFields.add("firstName");
    openapiFields.add("middleName");
    openapiFields.add("lastName");
    openapiFields.add("suffix");
    openapiFields.add("nameClassification");
    openapiFields.add("nameClassificationconfidencescore");
    openapiFields.add("addresses");
    openapiFields.add("emails");
    openapiFields.add("phones");
    openapiFields.add("documentations");
    openapiFields.add("identityInsights");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ownerName");
    openapiRequiredFields.add("addresses");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountOwnerDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccountOwnerDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountOwnerDetails is not found in the empty JSON string", AccountOwnerDetails.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountOwnerDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("relationship") != null && !jsonObj.get("relationship").isJsonNull()) && !jsonObj.get("relationship").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relationship` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relationship").toString()));
      }
      if (!jsonObj.get("ownerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerName").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("middleName") != null && !jsonObj.get("middleName").isJsonNull()) && !jsonObj.get("middleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middleName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("suffix") != null && !jsonObj.get("suffix").isJsonNull()) && !jsonObj.get("suffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suffix").toString()));
      }
      if ((jsonObj.get("nameClassification") != null && !jsonObj.get("nameClassification").isJsonNull()) && !jsonObj.get("nameClassification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameClassification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nameClassification").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }

      JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
      // validate the required field `addresses` (array)
      for (int i = 0; i < jsonArrayaddresses.size(); i++) {
        AccountOwnerAddress.validateJsonObject(jsonArrayaddresses.get(i).getAsJsonObject());
      };
      if (jsonObj.get("emails") != null && !jsonObj.get("emails").isJsonNull()) {
        JsonArray jsonArrayemails = jsonObj.getAsJsonArray("emails");
        if (jsonArrayemails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("emails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `emails` to be an array in the JSON string but got `%s`", jsonObj.get("emails").toString()));
          }

          // validate the optional field `emails` (array)
          for (int i = 0; i < jsonArrayemails.size(); i++) {
            AccountOwnerEmail.validateJsonObject(jsonArrayemails.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("phones") != null && !jsonObj.get("phones").isJsonNull()) {
        JsonArray jsonArrayphones = jsonObj.getAsJsonArray("phones");
        if (jsonArrayphones != null) {
          // ensure the json data is an array
          if (!jsonObj.get("phones").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `phones` to be an array in the JSON string but got `%s`", jsonObj.get("phones").toString()));
          }

          // validate the optional field `phones` (array)
          for (int i = 0; i < jsonArrayphones.size(); i++) {
            AccountOwnerPhone.validateJsonObject(jsonArrayphones.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("documentations") != null && !jsonObj.get("documentations").isJsonNull()) {
        JsonArray jsonArraydocumentations = jsonObj.getAsJsonArray("documentations");
        if (jsonArraydocumentations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("documentations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `documentations` to be an array in the JSON string but got `%s`", jsonObj.get("documentations").toString()));
          }

          // validate the optional field `documentations` (array)
          for (int i = 0; i < jsonArraydocumentations.size(); i++) {
            AccountOwnerDocumentation.validateJsonObject(jsonArraydocumentations.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `identityInsights`
      if (jsonObj.get("identityInsights") != null && !jsonObj.get("identityInsights").isJsonNull()) {
        AccountOwnerIdentityInsights.validateJsonObject(jsonObj.getAsJsonObject("identityInsights"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountOwnerDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountOwnerDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountOwnerDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountOwnerDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountOwnerDetails>() {
           @Override
           public void write(JsonWriter out, AccountOwnerDetails value) throws IOException {
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
           public AccountOwnerDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccountOwnerDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccountOwnerDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountOwnerDetails
  * @throws IOException if the JSON string is invalid with respect to AccountOwnerDetails
  */
  public static AccountOwnerDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountOwnerDetails.class);
  }

 /**
  * Convert an instance of AccountOwnerDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
