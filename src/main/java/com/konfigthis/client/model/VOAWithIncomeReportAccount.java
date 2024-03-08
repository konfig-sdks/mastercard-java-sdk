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
import com.konfigthis.client.model.AccountDetailsTxBased;
import com.konfigthis.client.model.PrequalificationReportAssetSummary;
import com.konfigthis.client.model.ReportAccountPosition;
import com.konfigthis.client.model.ReportTransactionNewTxBased;
import com.konfigthis.client.model.VOAIReportIncomeStream;
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
 * VOAWithIncomeReportAccount
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VOAWithIncomeReportAccount {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_OWNER_NAME = "ownerName";
  @SerializedName(SERIALIZED_NAME_OWNER_NAME)
  private String ownerName;

  public static final String SERIALIZED_NAME_OWNER_ADDRESS = "ownerAddress";
  @SerializedName(SERIALIZED_NAME_OWNER_ADDRESS)
  private String ownerAddress;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_AVAILABLE_BALANCE = "availableBalance";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE)
  private Double availableBalance;

  public static final String SERIALIZED_NAME_AGGREGATION_STATUS_CODE = "aggregationStatusCode";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_STATUS_CODE)
  private Integer aggregationStatusCode;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Double balance;

  public static final String SERIALIZED_NAME_BALANCE_DATE = "balanceDate";
  @SerializedName(SERIALIZED_NAME_BALANCE_DATE)
  private Long balanceDate;

  public static final String SERIALIZED_NAME_AVERAGE_MONTHLY_BALANCE = "averageMonthlyBalance";
  @SerializedName(SERIALIZED_NAME_AVERAGE_MONTHLY_BALANCE)
  private Double averageMonthlyBalance;

  public static final String SERIALIZED_NAME_TOT_NUMBER_INSUFFICIENT_FUNDS_FEE_DEBIT_TX_ACCOUNT = "totNumberInsufficientFundsFeeDebitTxAccount";
  @SerializedName(SERIALIZED_NAME_TOT_NUMBER_INSUFFICIENT_FUNDS_FEE_DEBIT_TX_ACCOUNT)
  private Long totNumberInsufficientFundsFeeDebitTxAccount;

  public static final String SERIALIZED_NAME_TOT_NUMBER_INSUFFICIENT_FUNDS_FEE_DEBIT_TX_OVER2_MONTHS_ACCOUNT = "totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount";
  @SerializedName(SERIALIZED_NAME_TOT_NUMBER_INSUFFICIENT_FUNDS_FEE_DEBIT_TX_OVER2_MONTHS_ACCOUNT)
  private Long totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount;

  public static final String SERIALIZED_NAME_TOT_NUMBER_DAYS_SINCE_MOST_RECENT_INSUFFICIENT_FUNDS_FEE_DEBIT_TX_ACCOUNT = "totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount";
  @SerializedName(SERIALIZED_NAME_TOT_NUMBER_DAYS_SINCE_MOST_RECENT_INSUFFICIENT_FUNDS_FEE_DEBIT_TX_ACCOUNT)
  private Long totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<ReportTransactionNewTxBased> transactions = null;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private AccountDetailsTxBased details;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private ReportAccountPosition position;

  public static final String SERIALIZED_NAME_ASSET = "asset";
  @SerializedName(SERIALIZED_NAME_ASSET)
  private PrequalificationReportAssetSummary asset;

  public static final String SERIALIZED_NAME_INCOME_STREAMS = "incomeStreams";
  @SerializedName(SERIALIZED_NAME_INCOME_STREAMS)
  private List<VOAIReportIncomeStream> incomeStreams = null;

  public VOAWithIncomeReportAccount() {
  }

  public VOAWithIncomeReportAccount id(Long id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the account
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000023996", value = "The ID of the account")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    
    
    
    this.id = id;
  }


  public VOAWithIncomeReportAccount number(String number) {
    
    
    
    
    this.number = number;
    return this;
  }

   /**
   * The account number from the institution (all digits except the last four are obfuscated)
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1111", value = "The account number from the institution (all digits except the last four are obfuscated)")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    
    
    
    this.number = number;
  }


  public VOAWithIncomeReportAccount ownerName(String ownerName) {
    
    
    
    
    this.ownerName = ownerName;
    return this;
  }

   /**
   * The name(s) of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report.
   * @return ownerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JOHN DOE", value = "The name(s) of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report.")

  public String getOwnerName() {
    return ownerName;
  }


  public void setOwnerName(String ownerName) {
    
    
    
    this.ownerName = ownerName;
  }


  public VOAWithIncomeReportAccount ownerAddress(String ownerAddress) {
    
    
    
    
    this.ownerAddress = ownerAddress;
    return this;
  }

   /**
   * The mailing address of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report.
   * @return ownerAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "924 GAINSVILLE HIGHWAY SUITE 130 BUFORD, GA 30518", value = "The mailing address of the account owner(s). This field is optional. If no owner information is available, this field will not appear in the report.")

  public String getOwnerAddress() {
    return ownerAddress;
  }


  public void setOwnerAddress(String ownerAddress) {
    
    
    
    this.ownerAddress = ownerAddress;
  }


  public VOAWithIncomeReportAccount name(String name) {
    
    
    
    
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


  public VOAWithIncomeReportAccount type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * One of the values from account types
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "checking", value = "One of the values from account types")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public VOAWithIncomeReportAccount availableBalance(Double availableBalance) {
    
    
    
    
    this.availableBalance = availableBalance;
    return this;
  }

  public VOAWithIncomeReportAccount availableBalance(Integer availableBalance) {
    
    
    
    
    this.availableBalance = availableBalance.doubleValue();
    return this;
  }

   /**
   * The available balance for the account
   * @return availableBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "501.24", value = "The available balance for the account")

  public Double getAvailableBalance() {
    return availableBalance;
  }


  public void setAvailableBalance(Double availableBalance) {
    
    
    
    this.availableBalance = availableBalance;
  }


  public VOAWithIncomeReportAccount aggregationStatusCode(Integer aggregationStatusCode) {
    
    
    
    
    this.aggregationStatusCode = aggregationStatusCode;
    return this;
  }

   /**
   * The status of the most recent aggregation attempt
   * @return aggregationStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The status of the most recent aggregation attempt")

  public Integer getAggregationStatusCode() {
    return aggregationStatusCode;
  }


  public void setAggregationStatusCode(Integer aggregationStatusCode) {
    
    
    
    this.aggregationStatusCode = aggregationStatusCode;
  }


  public VOAWithIncomeReportAccount balance(Double balance) {
    
    
    
    
    this.balance = balance;
    return this;
  }

  public VOAWithIncomeReportAccount balance(Integer balance) {
    
    
    
    
    this.balance = balance.doubleValue();
    return this;
  }

   /**
   * The cleared balance of the account as-of balanceDate
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "501.24", value = "The cleared balance of the account as-of balanceDate")

  public Double getBalance() {
    return balance;
  }


  public void setBalance(Double balance) {
    
    
    
    this.balance = balance;
  }


  public VOAWithIncomeReportAccount balanceDate(Long balanceDate) {
    
    
    
    
    this.balanceDate = balanceDate;
    return this;
  }

   /**
   * A timestamp showing when the balance was captured
   * @return balanceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1588350276", value = "A timestamp showing when the balance was captured")

  public Long getBalanceDate() {
    return balanceDate;
  }


  public void setBalanceDate(Long balanceDate) {
    
    
    
    this.balanceDate = balanceDate;
  }


  public VOAWithIncomeReportAccount averageMonthlyBalance(Double averageMonthlyBalance) {
    
    
    
    
    this.averageMonthlyBalance = averageMonthlyBalance;
    return this;
  }

  public VOAWithIncomeReportAccount averageMonthlyBalance(Integer averageMonthlyBalance) {
    
    
    
    
    this.averageMonthlyBalance = averageMonthlyBalance.doubleValue();
    return this;
  }

   /**
   * The average monthly balance of this account
   * @return averageMonthlyBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "501.02", value = "The average monthly balance of this account")

  public Double getAverageMonthlyBalance() {
    return averageMonthlyBalance;
  }


  public void setAverageMonthlyBalance(Double averageMonthlyBalance) {
    
    
    
    this.averageMonthlyBalance = averageMonthlyBalance;
  }


  public VOAWithIncomeReportAccount totNumberInsufficientFundsFeeDebitTxAccount(Long totNumberInsufficientFundsFeeDebitTxAccount) {
    
    
    
    
    this.totNumberInsufficientFundsFeeDebitTxAccount = totNumberInsufficientFundsFeeDebitTxAccount;
    return this;
  }

   /**
   * The count for the total number of insufficient funds transactions, based on the &#x60;fromDate&#x60; of the report.
   * @return totNumberInsufficientFundsFeeDebitTxAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The count for the total number of insufficient funds transactions, based on the `fromDate` of the report.")

  public Long getTotNumberInsufficientFundsFeeDebitTxAccount() {
    return totNumberInsufficientFundsFeeDebitTxAccount;
  }


  public void setTotNumberInsufficientFundsFeeDebitTxAccount(Long totNumberInsufficientFundsFeeDebitTxAccount) {
    
    
    
    this.totNumberInsufficientFundsFeeDebitTxAccount = totNumberInsufficientFundsFeeDebitTxAccount;
  }


  public VOAWithIncomeReportAccount totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount(Long totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount) {
    
    
    
    
    this.totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount = totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount;
    return this;
  }

   /**
   * The count for the total number of insufficient funds transactions for the last two months, based on the &#x60;fromDate&#x60; of the report.
   * @return totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The count for the total number of insufficient funds transactions for the last two months, based on the `fromDate` of the report.")

  public Long getTotNumberInsufficientFundsFeeDebitTxOver2MonthsAccount() {
    return totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount;
  }


  public void setTotNumberInsufficientFundsFeeDebitTxOver2MonthsAccount(Long totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount) {
    
    
    
    this.totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount = totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount;
  }


  public VOAWithIncomeReportAccount totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount(Long totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount) {
    
    
    
    
    this.totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount = totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount;
    return this;
  }

   /**
   * The number of days since the most recent insufficient funds transaction, based on the &#x60;fromDate&#x60; of the report.
   * @return totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120", value = "The number of days since the most recent insufficient funds transaction, based on the `fromDate` of the report.")

  public Long getTotNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount() {
    return totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount;
  }


  public void setTotNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount(Long totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount) {
    
    
    
    this.totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount = totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount;
  }


  public VOAWithIncomeReportAccount transactions(List<ReportTransactionNewTxBased> transactions) {
    
    
    
    
    this.transactions = transactions;
    return this;
  }

  public VOAWithIncomeReportAccount addTransactionsItem(ReportTransactionNewTxBased transactionsItem) {
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

  public List<ReportTransactionNewTxBased> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<ReportTransactionNewTxBased> transactions) {
    
    
    
    this.transactions = transactions;
  }


  public VOAWithIncomeReportAccount details(AccountDetailsTxBased details) {
    
    
    
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountDetailsTxBased getDetails() {
    return details;
  }


  public void setDetails(AccountDetailsTxBased details) {
    
    
    
    this.details = details;
  }


  public VOAWithIncomeReportAccount position(ReportAccountPosition position) {
    
    
    
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportAccountPosition getPosition() {
    return position;
  }


  public void setPosition(ReportAccountPosition position) {
    
    
    
    this.position = position;
  }


  public VOAWithIncomeReportAccount asset(PrequalificationReportAssetSummary asset) {
    
    
    
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PrequalificationReportAssetSummary getAsset() {
    return asset;
  }


  public void setAsset(PrequalificationReportAssetSummary asset) {
    
    
    
    this.asset = asset;
  }


  public VOAWithIncomeReportAccount incomeStreams(List<VOAIReportIncomeStream> incomeStreams) {
    
    
    
    
    this.incomeStreams = incomeStreams;
    return this;
  }

  public VOAWithIncomeReportAccount addIncomeStreamsItem(VOAIReportIncomeStream incomeStreamsItem) {
    if (this.incomeStreams == null) {
      this.incomeStreams = new ArrayList<>();
    }
    this.incomeStreams.add(incomeStreamsItem);
    return this;
  }

   /**
   * A list of income stream records
   * @return incomeStreams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of income stream records")

  public List<VOAIReportIncomeStream> getIncomeStreams() {
    return incomeStreams;
  }


  public void setIncomeStreams(List<VOAIReportIncomeStream> incomeStreams) {
    
    
    
    this.incomeStreams = incomeStreams;
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
   * @return the VOAWithIncomeReportAccount instance itself
   */
  public VOAWithIncomeReportAccount putAdditionalProperty(String key, Object value) {
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
    VOAWithIncomeReportAccount voAWithIncomeReportAccount = (VOAWithIncomeReportAccount) o;
    return Objects.equals(this.id, voAWithIncomeReportAccount.id) &&
        Objects.equals(this.number, voAWithIncomeReportAccount.number) &&
        Objects.equals(this.ownerName, voAWithIncomeReportAccount.ownerName) &&
        Objects.equals(this.ownerAddress, voAWithIncomeReportAccount.ownerAddress) &&
        Objects.equals(this.name, voAWithIncomeReportAccount.name) &&
        Objects.equals(this.type, voAWithIncomeReportAccount.type) &&
        Objects.equals(this.availableBalance, voAWithIncomeReportAccount.availableBalance) &&
        Objects.equals(this.aggregationStatusCode, voAWithIncomeReportAccount.aggregationStatusCode) &&
        Objects.equals(this.balance, voAWithIncomeReportAccount.balance) &&
        Objects.equals(this.balanceDate, voAWithIncomeReportAccount.balanceDate) &&
        Objects.equals(this.averageMonthlyBalance, voAWithIncomeReportAccount.averageMonthlyBalance) &&
        Objects.equals(this.totNumberInsufficientFundsFeeDebitTxAccount, voAWithIncomeReportAccount.totNumberInsufficientFundsFeeDebitTxAccount) &&
        Objects.equals(this.totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount, voAWithIncomeReportAccount.totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount) &&
        Objects.equals(this.totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount, voAWithIncomeReportAccount.totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount) &&
        Objects.equals(this.transactions, voAWithIncomeReportAccount.transactions) &&
        Objects.equals(this.details, voAWithIncomeReportAccount.details) &&
        Objects.equals(this.position, voAWithIncomeReportAccount.position) &&
        Objects.equals(this.asset, voAWithIncomeReportAccount.asset) &&
        Objects.equals(this.incomeStreams, voAWithIncomeReportAccount.incomeStreams)&&
        Objects.equals(this.additionalProperties, voAWithIncomeReportAccount.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, ownerName, ownerAddress, name, type, availableBalance, aggregationStatusCode, balance, balanceDate, averageMonthlyBalance, totNumberInsufficientFundsFeeDebitTxAccount, totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount, totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount, transactions, details, position, asset, incomeStreams, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VOAWithIncomeReportAccount {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    ownerAddress: ").append(toIndentedString(ownerAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    aggregationStatusCode: ").append(toIndentedString(aggregationStatusCode)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    balanceDate: ").append(toIndentedString(balanceDate)).append("\n");
    sb.append("    averageMonthlyBalance: ").append(toIndentedString(averageMonthlyBalance)).append("\n");
    sb.append("    totNumberInsufficientFundsFeeDebitTxAccount: ").append(toIndentedString(totNumberInsufficientFundsFeeDebitTxAccount)).append("\n");
    sb.append("    totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount: ").append(toIndentedString(totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount)).append("\n");
    sb.append("    totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount: ").append(toIndentedString(totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    incomeStreams: ").append(toIndentedString(incomeStreams)).append("\n");
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
    openapiFields.add("number");
    openapiFields.add("ownerName");
    openapiFields.add("ownerAddress");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("availableBalance");
    openapiFields.add("aggregationStatusCode");
    openapiFields.add("balance");
    openapiFields.add("balanceDate");
    openapiFields.add("averageMonthlyBalance");
    openapiFields.add("totNumberInsufficientFundsFeeDebitTxAccount");
    openapiFields.add("totNumberInsufficientFundsFeeDebitTxOver2MonthsAccount");
    openapiFields.add("totNumberDaysSinceMostRecentInsufficientFundsFeeDebitTxAccount");
    openapiFields.add("transactions");
    openapiFields.add("details");
    openapiFields.add("position");
    openapiFields.add("asset");
    openapiFields.add("incomeStreams");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VOAWithIncomeReportAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VOAWithIncomeReportAccount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VOAWithIncomeReportAccount is not found in the empty JSON string", VOAWithIncomeReportAccount.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("number") != null && !jsonObj.get("number").isJsonNull()) && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
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
            ReportTransactionNewTxBased.validateJsonObject(jsonArraytransactions.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `details`
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        AccountDetailsTxBased.validateJsonObject(jsonObj.getAsJsonObject("details"));
      }
      // validate the optional field `position`
      if (jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull()) {
        ReportAccountPosition.validateJsonObject(jsonObj.getAsJsonObject("position"));
      }
      // validate the optional field `asset`
      if (jsonObj.get("asset") != null && !jsonObj.get("asset").isJsonNull()) {
        PrequalificationReportAssetSummary.validateJsonObject(jsonObj.getAsJsonObject("asset"));
      }
      if (jsonObj.get("incomeStreams") != null && !jsonObj.get("incomeStreams").isJsonNull()) {
        JsonArray jsonArrayincomeStreams = jsonObj.getAsJsonArray("incomeStreams");
        if (jsonArrayincomeStreams != null) {
          // ensure the json data is an array
          if (!jsonObj.get("incomeStreams").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `incomeStreams` to be an array in the JSON string but got `%s`", jsonObj.get("incomeStreams").toString()));
          }

          // validate the optional field `incomeStreams` (array)
          for (int i = 0; i < jsonArrayincomeStreams.size(); i++) {
            VOAIReportIncomeStream.validateJsonObject(jsonArrayincomeStreams.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VOAWithIncomeReportAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VOAWithIncomeReportAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VOAWithIncomeReportAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VOAWithIncomeReportAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<VOAWithIncomeReportAccount>() {
           @Override
           public void write(JsonWriter out, VOAWithIncomeReportAccount value) throws IOException {
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
           public VOAWithIncomeReportAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VOAWithIncomeReportAccount instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VOAWithIncomeReportAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VOAWithIncomeReportAccount
  * @throws IOException if the JSON string is invalid with respect to VOAWithIncomeReportAccount
  */
  public static VOAWithIncomeReportAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VOAWithIncomeReportAccount.class);
  }

 /**
  * Convert an instance of VOAWithIncomeReportAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

