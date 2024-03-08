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
import com.konfigthis.client.model.CashFlowCashFlowBalance;
import com.konfigthis.client.model.CashFlowCashFlowCharacteristic;
import com.konfigthis.client.model.CashFlowCashFlowCredit;
import com.konfigthis.client.model.CashFlowCashFlowDebit;
import com.konfigthis.client.model.ReportTransaction;
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
 * CashFlowReportAccount
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CashFlowReportAccount {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_OWNER_NAME = "ownerName";
  @SerializedName(SERIALIZED_NAME_OWNER_NAME)
  private String ownerName;

  public static final String SERIALIZED_NAME_OWNER_ADDRESS = "ownerAddress";
  @SerializedName(SERIALIZED_NAME_OWNER_ADDRESS)
  private String ownerAddress;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_AGGREGATION_STATUS_CODE = "aggregationStatusCode";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_STATUS_CODE)
  private Integer aggregationStatusCode;

  public static final String SERIALIZED_NAME_CURRENT_BALANCE = "currentBalance";
  @SerializedName(SERIALIZED_NAME_CURRENT_BALANCE)
  private Double currentBalance;

  public static final String SERIALIZED_NAME_AVAILABLE_BALANCE = "availableBalance";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE)
  private Double availableBalance;

  public static final String SERIALIZED_NAME_BALANCE_DATE = "balanceDate";
  @SerializedName(SERIALIZED_NAME_BALANCE_DATE)
  private Long balanceDate;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<ReportTransaction> transactions = null;

  public static final String SERIALIZED_NAME_CASH_FLOW_BALANCE = "cashFlowBalance";
  @SerializedName(SERIALIZED_NAME_CASH_FLOW_BALANCE)
  private CashFlowCashFlowBalance cashFlowBalance;

  public static final String SERIALIZED_NAME_CASH_FLOW_CREDIT = "cashFlowCredit";
  @SerializedName(SERIALIZED_NAME_CASH_FLOW_CREDIT)
  private CashFlowCashFlowCredit cashFlowCredit;

  public static final String SERIALIZED_NAME_CASH_FLOW_DEBIT = "cashFlowDebit";
  @SerializedName(SERIALIZED_NAME_CASH_FLOW_DEBIT)
  private CashFlowCashFlowDebit cashFlowDebit;

  public static final String SERIALIZED_NAME_CASH_FLOW_CHARACTERISTIC = "cashFlowCharacteristic";
  @SerializedName(SERIALIZED_NAME_CASH_FLOW_CHARACTERISTIC)
  private CashFlowCashFlowCharacteristic cashFlowCharacteristic;

  public CashFlowReportAccount() {
  }

  public CashFlowReportAccount id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Finicity account ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6681984", value = "Finicity account ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public CashFlowReportAccount ownerName(String ownerName) {
    
    
    
    
    this.ownerName = ownerName;
    return this;
  }

   /**
   * The name(s) of the account owner(s), retrieved from the institution.
   * @return ownerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PATRICK & LORRAINE PURCHASER", value = "The name(s) of the account owner(s), retrieved from the institution.")

  public String getOwnerName() {
    return ownerName;
  }


  public void setOwnerName(String ownerName) {
    
    
    
    this.ownerName = ownerName;
  }


  public CashFlowReportAccount ownerAddress(String ownerAddress) {
    
    
    
    
    this.ownerAddress = ownerAddress;
    return this;
  }

   /**
   * The mailing address of the account owner, retrieved from the institution.
   * @return ownerAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7195 BELMONT ST. PARLIN, NJ 08859", value = "The mailing address of the account owner, retrieved from the institution.")

  public String getOwnerAddress() {
    return ownerAddress;
  }


  public void setOwnerAddress(String ownerAddress) {
    
    
    
    this.ownerAddress = ownerAddress;
  }


  public CashFlowReportAccount name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The account name from the institution
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Checking", value = "The account name from the institution")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CashFlowReportAccount number(String number) {
    
    
    
    
    this.number = number;
    return this;
  }

   /**
   * The account number from the institution (obfuscated)
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XX1111", value = "The account number from the institution (obfuscated)")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    
    
    
    this.number = number;
  }


  public CashFlowReportAccount type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * CFR: &#x60;ALL&#x60; (&#x60;checking&#x60; / &#x60;savings&#x60; / &#x60;loan&#x60; / &#x60;mortgage&#x60; / &#x60;credit card&#x60; / &#x60;CD&#x60; / &#x60;MM&#x60; / &#x60;investment&#x60;...)
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "checking", value = "CFR: `ALL` (`checking` / `savings` / `loan` / `mortgage` / `credit card` / `CD` / `MM` / `investment`...)")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public CashFlowReportAccount aggregationStatusCode(Integer aggregationStatusCode) {
    
    
    
    
    this.aggregationStatusCode = aggregationStatusCode;
    return this;
  }

   /**
   * The status of the most recent aggregation attempt for this account (non-zero means the account was not accessed successfully for this report, and additional fields for this account may not be reliable)
   * @return aggregationStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The status of the most recent aggregation attempt for this account (non-zero means the account was not accessed successfully for this report, and additional fields for this account may not be reliable)")

  public Integer getAggregationStatusCode() {
    return aggregationStatusCode;
  }


  public void setAggregationStatusCode(Integer aggregationStatusCode) {
    
    
    
    this.aggregationStatusCode = aggregationStatusCode;
  }


  public CashFlowReportAccount currentBalance(Double currentBalance) {
    
    
    
    
    this.currentBalance = currentBalance;
    return this;
  }

  public CashFlowReportAccount currentBalance(Integer currentBalance) {
    
    
    
    
    this.currentBalance = currentBalance.doubleValue();
    return this;
  }

   /**
   * The cleared balance of the account as-of &#x60;balanceDate&#x60;
   * @return currentBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100000", value = "The cleared balance of the account as-of `balanceDate`")

  public Double getCurrentBalance() {
    return currentBalance;
  }


  public void setCurrentBalance(Double currentBalance) {
    
    
    
    this.currentBalance = currentBalance;
  }


  public CashFlowReportAccount availableBalance(Double availableBalance) {
    
    
    
    
    this.availableBalance = availableBalance;
    return this;
  }

  public CashFlowReportAccount availableBalance(Integer availableBalance) {
    
    
    
    
    this.availableBalance = availableBalance.doubleValue();
    return this;
  }

   /**
   * Available balance
   * @return availableBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Available balance")

  public Double getAvailableBalance() {
    return availableBalance;
  }


  public void setAvailableBalance(Double availableBalance) {
    
    
    
    this.availableBalance = availableBalance;
  }


  public CashFlowReportAccount balanceDate(Long balanceDate) {
    
    
    
    
    this.balanceDate = balanceDate;
    return this;
  }

   /**
   * A timestamp showing when the &#x60;balance&#x60; was captured
   * @return balanceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1614880526", value = "A timestamp showing when the `balance` was captured")

  public Long getBalanceDate() {
    return balanceDate;
  }


  public void setBalanceDate(Long balanceDate) {
    
    
    
    this.balanceDate = balanceDate;
  }


  public CashFlowReportAccount transactions(List<ReportTransaction> transactions) {
    
    
    
    
    this.transactions = transactions;
    return this;
  }

  public CashFlowReportAccount addTransactionsItem(ReportTransaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * a list of transaction records
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a list of transaction records")

  public List<ReportTransaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<ReportTransaction> transactions) {
    
    
    
    this.transactions = transactions;
  }


  public CashFlowReportAccount cashFlowBalance(CashFlowCashFlowBalance cashFlowBalance) {
    
    
    
    
    this.cashFlowBalance = cashFlowBalance;
    return this;
  }

   /**
   * Get cashFlowBalance
   * @return cashFlowBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CashFlowCashFlowBalance getCashFlowBalance() {
    return cashFlowBalance;
  }


  public void setCashFlowBalance(CashFlowCashFlowBalance cashFlowBalance) {
    
    
    
    this.cashFlowBalance = cashFlowBalance;
  }


  public CashFlowReportAccount cashFlowCredit(CashFlowCashFlowCredit cashFlowCredit) {
    
    
    
    
    this.cashFlowCredit = cashFlowCredit;
    return this;
  }

   /**
   * Get cashFlowCredit
   * @return cashFlowCredit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CashFlowCashFlowCredit getCashFlowCredit() {
    return cashFlowCredit;
  }


  public void setCashFlowCredit(CashFlowCashFlowCredit cashFlowCredit) {
    
    
    
    this.cashFlowCredit = cashFlowCredit;
  }


  public CashFlowReportAccount cashFlowDebit(CashFlowCashFlowDebit cashFlowDebit) {
    
    
    
    
    this.cashFlowDebit = cashFlowDebit;
    return this;
  }

   /**
   * Get cashFlowDebit
   * @return cashFlowDebit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CashFlowCashFlowDebit getCashFlowDebit() {
    return cashFlowDebit;
  }


  public void setCashFlowDebit(CashFlowCashFlowDebit cashFlowDebit) {
    
    
    
    this.cashFlowDebit = cashFlowDebit;
  }


  public CashFlowReportAccount cashFlowCharacteristic(CashFlowCashFlowCharacteristic cashFlowCharacteristic) {
    
    
    
    
    this.cashFlowCharacteristic = cashFlowCharacteristic;
    return this;
  }

   /**
   * Get cashFlowCharacteristic
   * @return cashFlowCharacteristic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CashFlowCashFlowCharacteristic getCashFlowCharacteristic() {
    return cashFlowCharacteristic;
  }


  public void setCashFlowCharacteristic(CashFlowCashFlowCharacteristic cashFlowCharacteristic) {
    
    
    
    this.cashFlowCharacteristic = cashFlowCharacteristic;
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
   * @return the CashFlowReportAccount instance itself
   */
  public CashFlowReportAccount putAdditionalProperty(String key, Object value) {
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
    CashFlowReportAccount cashFlowReportAccount = (CashFlowReportAccount) o;
    return Objects.equals(this.id, cashFlowReportAccount.id) &&
        Objects.equals(this.ownerName, cashFlowReportAccount.ownerName) &&
        Objects.equals(this.ownerAddress, cashFlowReportAccount.ownerAddress) &&
        Objects.equals(this.name, cashFlowReportAccount.name) &&
        Objects.equals(this.number, cashFlowReportAccount.number) &&
        Objects.equals(this.type, cashFlowReportAccount.type) &&
        Objects.equals(this.aggregationStatusCode, cashFlowReportAccount.aggregationStatusCode) &&
        Objects.equals(this.currentBalance, cashFlowReportAccount.currentBalance) &&
        Objects.equals(this.availableBalance, cashFlowReportAccount.availableBalance) &&
        Objects.equals(this.balanceDate, cashFlowReportAccount.balanceDate) &&
        Objects.equals(this.transactions, cashFlowReportAccount.transactions) &&
        Objects.equals(this.cashFlowBalance, cashFlowReportAccount.cashFlowBalance) &&
        Objects.equals(this.cashFlowCredit, cashFlowReportAccount.cashFlowCredit) &&
        Objects.equals(this.cashFlowDebit, cashFlowReportAccount.cashFlowDebit) &&
        Objects.equals(this.cashFlowCharacteristic, cashFlowReportAccount.cashFlowCharacteristic)&&
        Objects.equals(this.additionalProperties, cashFlowReportAccount.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ownerName, ownerAddress, name, number, type, aggregationStatusCode, currentBalance, availableBalance, balanceDate, transactions, cashFlowBalance, cashFlowCredit, cashFlowDebit, cashFlowCharacteristic, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowReportAccount {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    ownerAddress: ").append(toIndentedString(ownerAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    aggregationStatusCode: ").append(toIndentedString(aggregationStatusCode)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    balanceDate: ").append(toIndentedString(balanceDate)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    cashFlowBalance: ").append(toIndentedString(cashFlowBalance)).append("\n");
    sb.append("    cashFlowCredit: ").append(toIndentedString(cashFlowCredit)).append("\n");
    sb.append("    cashFlowDebit: ").append(toIndentedString(cashFlowDebit)).append("\n");
    sb.append("    cashFlowCharacteristic: ").append(toIndentedString(cashFlowCharacteristic)).append("\n");
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
    openapiFields.add("ownerName");
    openapiFields.add("ownerAddress");
    openapiFields.add("name");
    openapiFields.add("number");
    openapiFields.add("type");
    openapiFields.add("aggregationStatusCode");
    openapiFields.add("currentBalance");
    openapiFields.add("availableBalance");
    openapiFields.add("balanceDate");
    openapiFields.add("transactions");
    openapiFields.add("cashFlowBalance");
    openapiFields.add("cashFlowCredit");
    openapiFields.add("cashFlowDebit");
    openapiFields.add("cashFlowCharacteristic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CashFlowReportAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CashFlowReportAccount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CashFlowReportAccount is not found in the empty JSON string", CashFlowReportAccount.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("ownerName") != null && !jsonObj.get("ownerName").isJsonNull()) && !jsonObj.get("ownerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerName").toString()));
      }
      if ((jsonObj.get("ownerAddress") != null && !jsonObj.get("ownerAddress").isJsonNull()) && !jsonObj.get("ownerAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerAddress").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("number") != null && !jsonObj.get("number").isJsonNull()) && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("transactions") != null && !jsonObj.get("transactions").isJsonNull()) {
        JsonArray jsonArraytransactions = jsonObj.getAsJsonArray("transactions");
        if (jsonArraytransactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("transactions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `transactions` to be an array in the JSON string but got `%s`", jsonObj.get("transactions").toString()));
          }

          // validate the optional field `transactions` (array)
          for (int i = 0; i < jsonArraytransactions.size(); i++) {
            ReportTransaction.validateJsonObject(jsonArraytransactions.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `cashFlowBalance`
      if (jsonObj.get("cashFlowBalance") != null && !jsonObj.get("cashFlowBalance").isJsonNull()) {
        CashFlowCashFlowBalance.validateJsonObject(jsonObj.getAsJsonObject("cashFlowBalance"));
      }
      // validate the optional field `cashFlowCredit`
      if (jsonObj.get("cashFlowCredit") != null && !jsonObj.get("cashFlowCredit").isJsonNull()) {
        CashFlowCashFlowCredit.validateJsonObject(jsonObj.getAsJsonObject("cashFlowCredit"));
      }
      // validate the optional field `cashFlowDebit`
      if (jsonObj.get("cashFlowDebit") != null && !jsonObj.get("cashFlowDebit").isJsonNull()) {
        CashFlowCashFlowDebit.validateJsonObject(jsonObj.getAsJsonObject("cashFlowDebit"));
      }
      // validate the optional field `cashFlowCharacteristic`
      if (jsonObj.get("cashFlowCharacteristic") != null && !jsonObj.get("cashFlowCharacteristic").isJsonNull()) {
        CashFlowCashFlowCharacteristic.validateJsonObject(jsonObj.getAsJsonObject("cashFlowCharacteristic"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CashFlowReportAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CashFlowReportAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CashFlowReportAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CashFlowReportAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<CashFlowReportAccount>() {
           @Override
           public void write(JsonWriter out, CashFlowReportAccount value) throws IOException {
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
           public CashFlowReportAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CashFlowReportAccount instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CashFlowReportAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CashFlowReportAccount
  * @throws IOException if the JSON string is invalid with respect to CashFlowReportAccount
  */
  public static CashFlowReportAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CashFlowReportAccount.class);
  }

 /**
  * Convert an instance of CashFlowReportAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
