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
import com.konfigthis.client.model.PaymentHistoryAccountSummaryAccountOwner;
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
 * Account-level summary of transactions
 */
@ApiModel(description = "Account-level summary of transactions")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentHistoryAccountSummary {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER_DISPLAY = "accountNumberDisplay";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER_DISPLAY)
  private String accountNumberDisplay;

  public static final String SERIALIZED_NAME_FINANCIAL_INSTITUTION = "financialInstitution";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_INSTITUTION)
  private String financialInstitution;

  public static final String SERIALIZED_NAME_INSTITUTION_ICON = "institutionIcon";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ICON)
  private String institutionIcon;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "accountName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_ACCOUNT_OWNER = "accountOwner";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_OWNER)
  private PaymentHistoryAccountSummaryAccountOwner accountOwner;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_BEGINNING_BALANCE = "beginningBalance";
  @SerializedName(SERIALIZED_NAME_BEGINNING_BALANCE)
  private Double beginningBalance;

  public static final String SERIALIZED_NAME_AVERAGE_MONTHLY_BALANCE = "averageMonthlyBalance";
  @SerializedName(SERIALIZED_NAME_AVERAGE_MONTHLY_BALANCE)
  private Double averageMonthlyBalance;

  public static final String SERIALIZED_NAME_CURRENT_BALANCE = "currentBalance";
  @SerializedName(SERIALIZED_NAME_CURRENT_BALANCE)
  private Double currentBalance;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private String beginDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_TOTAL_NONSUFFICIENT_FUNDS = "totalNonsufficientFunds";
  @SerializedName(SERIALIZED_NAME_TOTAL_NONSUFFICIENT_FUNDS)
  private Double totalNonsufficientFunds;

  public static final String SERIALIZED_NAME_DAYS_SINCE_NONSUFFICIENT_FUNDS = "daysSinceNonsufficientFunds";
  @SerializedName(SERIALIZED_NAME_DAYS_SINCE_NONSUFFICIENT_FUNDS)
  private Integer daysSinceNonsufficientFunds;

  public PaymentHistoryAccountSummary() {
  }

  public PaymentHistoryAccountSummary accountNumberDisplay(String accountNumberDisplay) {
    
    
    
    
    this.accountNumberDisplay = accountNumberDisplay;
    return this;
  }

   /**
   * Last four digits of the account
   * @return accountNumberDisplay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2222", required = true, value = "Last four digits of the account")

  public String getAccountNumberDisplay() {
    return accountNumberDisplay;
  }


  public void setAccountNumberDisplay(String accountNumberDisplay) {
    
    
    
    this.accountNumberDisplay = accountNumberDisplay;
  }


  public PaymentHistoryAccountSummary financialInstitution(String financialInstitution) {
    
    
    
    
    this.financialInstitution = financialInstitution;
    return this;
  }

   /**
   * Name of the account&#39;s institution
   * @return financialInstitution
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "FinBank", required = true, value = "Name of the account's institution")

  public String getFinancialInstitution() {
    return financialInstitution;
  }


  public void setFinancialInstitution(String financialInstitution) {
    
    
    
    this.financialInstitution = financialInstitution;
  }


  public PaymentHistoryAccountSummary institutionIcon(String institutionIcon) {
    
    
    
    
    this.institutionIcon = institutionIcon;
    return this;
  }

   /**
   * URL of institution icon
   * @return institutionIcon
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://my-sample-app.com/12345/some-icon.jpg", required = true, value = "URL of institution icon")

  public String getInstitutionIcon() {
    return institutionIcon;
  }


  public void setInstitutionIcon(String institutionIcon) {
    
    
    
    this.institutionIcon = institutionIcon;
  }


  public PaymentHistoryAccountSummary currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * A currency code
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USD", required = true, value = "A currency code")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
  }


  public PaymentHistoryAccountSummary status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * An account status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "pending", required = true, value = "An account status")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public PaymentHistoryAccountSummary accountName(String accountName) {
    
    
    
    
    this.accountName = accountName;
    return this;
  }

   /**
   * The account name from the institution
   * @return accountName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My 401k", required = true, value = "The account name from the institution")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    
    
    
    this.accountName = accountName;
  }


  public PaymentHistoryAccountSummary accountOwner(PaymentHistoryAccountSummaryAccountOwner accountOwner) {
    
    
    
    
    this.accountOwner = accountOwner;
    return this;
  }

   /**
   * Get accountOwner
   * @return accountOwner
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PaymentHistoryAccountSummaryAccountOwner getAccountOwner() {
    return accountOwner;
  }


  public void setAccountOwner(PaymentHistoryAccountSummaryAccountOwner accountOwner) {
    
    
    
    this.accountOwner = accountOwner;
  }


  public PaymentHistoryAccountSummary accountType(String accountType) {
    
    
    
    
    this.accountType = accountType;
    return this;
  }

   /**
   * The list of supported account types. * \&quot;checking\&quot;: Standard checking * \&quot;savings\&quot;: Standard savings * \&quot;cd\&quot;: Certificates of deposit * \&quot;moneyMarket\&quot;: Money Market * \&quot;creditCard\&quot;: Standard credit cards * \&quot;lineOfCredit\&quot;: Home equity, line of credit * \&quot;investment\&quot;: Generic investment (no details) * \&quot;investmentTaxDeferred\&quot;: Generic tax-advantaged investment (no details) * \&quot;employeeStockPurchasePlan\&quot;: ESPP, Employee Stock Ownership Plans (ESOP), Stock Purchase Plans * \&quot;ira\&quot;: Individual Retirement Account (not Rollover or Roth) * \&quot;401k\&quot;: 401K Plan * \&quot;roth\&quot;: Roth IRA, Roth 401K * \&quot;403b\&quot;: 403B Plan * \&quot;529plan\&quot;: 529 Plan (True value is 529) * \&quot;rollover\&quot;: Rollover IRA * \&quot;ugma\&quot;: Uniform Gifts to Minors Act * \&quot;utma\&quot;: Uniform Transfers to Minors Act * \&quot;keogh\&quot;: Keogh Plan * \&quot;457plan\&quot;: 457 Plan (True value is 457) * \&quot;401a\&quot;: 401A Plan * \&quot;brokerageAccount\&quot;: Brokerage Account * \&quot;educationSavings\&quot;: Education Savings Account that is not a 529 * \&quot;healthSavingsAccount\&quot;: HSA (Health Savings Accounts) * \&quot;pension\&quot;: Pension * \&quot;profitSharingPlan\&quot;: Profit Sharing Plan * \&quot;roth401k\&quot;: Roth 401K * \&quot;sepIRA\&quot;: Simplified Employee Pension IRA * \&quot;simpleIRA\&quot;: Simple IRA * \&quot;thriftSavingsPlan\&quot;: Thrift Savings Plan * \&quot;variableAnnuity\&quot;: Variable Annuity * \&quot;cryptocurrency\&quot;: Cryptocurrency Wallet, Cryptocurrency Account * \&quot;mortgage\&quot;: Standard Mortgages * \&quot;loan\&quot;: Auto loans, equity loans, other loans * \&quot;studentLoan\&quot;: Student Loan * \&quot;studentLoanGroup\&quot;: Student Loan Group * \&quot;studentLoanAccount\&quot;: Student Loan Account
   * @return accountType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "checking", required = true, value = "The list of supported account types. * \"checking\": Standard checking * \"savings\": Standard savings * \"cd\": Certificates of deposit * \"moneyMarket\": Money Market * \"creditCard\": Standard credit cards * \"lineOfCredit\": Home equity, line of credit * \"investment\": Generic investment (no details) * \"investmentTaxDeferred\": Generic tax-advantaged investment (no details) * \"employeeStockPurchasePlan\": ESPP, Employee Stock Ownership Plans (ESOP), Stock Purchase Plans * \"ira\": Individual Retirement Account (not Rollover or Roth) * \"401k\": 401K Plan * \"roth\": Roth IRA, Roth 401K * \"403b\": 403B Plan * \"529plan\": 529 Plan (True value is 529) * \"rollover\": Rollover IRA * \"ugma\": Uniform Gifts to Minors Act * \"utma\": Uniform Transfers to Minors Act * \"keogh\": Keogh Plan * \"457plan\": 457 Plan (True value is 457) * \"401a\": 401A Plan * \"brokerageAccount\": Brokerage Account * \"educationSavings\": Education Savings Account that is not a 529 * \"healthSavingsAccount\": HSA (Health Savings Accounts) * \"pension\": Pension * \"profitSharingPlan\": Profit Sharing Plan * \"roth401k\": Roth 401K * \"sepIRA\": Simplified Employee Pension IRA * \"simpleIRA\": Simple IRA * \"thriftSavingsPlan\": Thrift Savings Plan * \"variableAnnuity\": Variable Annuity * \"cryptocurrency\": Cryptocurrency Wallet, Cryptocurrency Account * \"mortgage\": Standard Mortgages * \"loan\": Auto loans, equity loans, other loans * \"studentLoan\": Student Loan * \"studentLoanGroup\": Student Loan Group * \"studentLoanAccount\": Student Loan Account")

  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    
    
    
    this.accountType = accountType;
  }


  public PaymentHistoryAccountSummary beginningBalance(Double beginningBalance) {
    
    
    
    
    this.beginningBalance = beginningBalance;
    return this;
  }

  public PaymentHistoryAccountSummary beginningBalance(Integer beginningBalance) {
    
    
    
    
    this.beginningBalance = beginningBalance.doubleValue();
    return this;
  }

   /**
   * Beginning balance of account
   * @return beginningBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.45", required = true, value = "Beginning balance of account")

  public Double getBeginningBalance() {
    return beginningBalance;
  }


  public void setBeginningBalance(Double beginningBalance) {
    
    
    
    this.beginningBalance = beginningBalance;
  }


  public PaymentHistoryAccountSummary averageMonthlyBalance(Double averageMonthlyBalance) {
    
    
    
    
    this.averageMonthlyBalance = averageMonthlyBalance;
    return this;
  }

  public PaymentHistoryAccountSummary averageMonthlyBalance(Integer averageMonthlyBalance) {
    
    
    
    
    this.averageMonthlyBalance = averageMonthlyBalance.doubleValue();
    return this;
  }

   /**
   * Monthly average balance of account
   * @return averageMonthlyBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.45", required = true, value = "Monthly average balance of account")

  public Double getAverageMonthlyBalance() {
    return averageMonthlyBalance;
  }


  public void setAverageMonthlyBalance(Double averageMonthlyBalance) {
    
    
    
    this.averageMonthlyBalance = averageMonthlyBalance;
  }


  public PaymentHistoryAccountSummary currentBalance(Double currentBalance) {
    
    
    
    
    this.currentBalance = currentBalance;
    return this;
  }

  public PaymentHistoryAccountSummary currentBalance(Integer currentBalance) {
    
    
    
    
    this.currentBalance = currentBalance.doubleValue();
    return this;
  }

   /**
   * Current balance of account
   * @return currentBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123.45", required = true, value = "Current balance of account")

  public Double getCurrentBalance() {
    return currentBalance;
  }


  public void setCurrentBalance(Double currentBalance) {
    
    
    
    this.currentBalance = currentBalance;
  }


  public PaymentHistoryAccountSummary beginDate(String beginDate) {
    
    
    
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Begin date of account
   * @return beginDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2023-06-01", required = true, value = "Begin date of account")

  public String getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(String beginDate) {
    
    
    
    this.beginDate = beginDate;
  }


  public PaymentHistoryAccountSummary endDate(String endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of account
   * @return endDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2023-06-01", required = true, value = "End date of account")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    
    
    
    this.endDate = endDate;
  }


  public PaymentHistoryAccountSummary totalNonsufficientFunds(Double totalNonsufficientFunds) {
    
    
    
    
    this.totalNonsufficientFunds = totalNonsufficientFunds;
    return this;
  }

  public PaymentHistoryAccountSummary totalNonsufficientFunds(Integer totalNonsufficientFunds) {
    
    
    
    
    this.totalNonsufficientFunds = totalNonsufficientFunds.doubleValue();
    return this;
  }

   /**
   * Total of NSF transactions in this account
   * @return totalNonsufficientFunds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123.45", value = "Total of NSF transactions in this account")

  public Double getTotalNonsufficientFunds() {
    return totalNonsufficientFunds;
  }


  public void setTotalNonsufficientFunds(Double totalNonsufficientFunds) {
    
    
    
    this.totalNonsufficientFunds = totalNonsufficientFunds;
  }


  public PaymentHistoryAccountSummary daysSinceNonsufficientFunds(Integer daysSinceNonsufficientFunds) {
    
    
    
    
    this.daysSinceNonsufficientFunds = daysSinceNonsufficientFunds;
    return this;
  }

   /**
   * Days since the latest NSF transaction for this account
   * @return daysSinceNonsufficientFunds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "Days since the latest NSF transaction for this account")

  public Integer getDaysSinceNonsufficientFunds() {
    return daysSinceNonsufficientFunds;
  }


  public void setDaysSinceNonsufficientFunds(Integer daysSinceNonsufficientFunds) {
    
    
    
    this.daysSinceNonsufficientFunds = daysSinceNonsufficientFunds;
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
   * @return the PaymentHistoryAccountSummary instance itself
   */
  public PaymentHistoryAccountSummary putAdditionalProperty(String key, Object value) {
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
    PaymentHistoryAccountSummary paymentHistoryAccountSummary = (PaymentHistoryAccountSummary) o;
    return Objects.equals(this.accountNumberDisplay, paymentHistoryAccountSummary.accountNumberDisplay) &&
        Objects.equals(this.financialInstitution, paymentHistoryAccountSummary.financialInstitution) &&
        Objects.equals(this.institutionIcon, paymentHistoryAccountSummary.institutionIcon) &&
        Objects.equals(this.currency, paymentHistoryAccountSummary.currency) &&
        Objects.equals(this.status, paymentHistoryAccountSummary.status) &&
        Objects.equals(this.accountName, paymentHistoryAccountSummary.accountName) &&
        Objects.equals(this.accountOwner, paymentHistoryAccountSummary.accountOwner) &&
        Objects.equals(this.accountType, paymentHistoryAccountSummary.accountType) &&
        Objects.equals(this.beginningBalance, paymentHistoryAccountSummary.beginningBalance) &&
        Objects.equals(this.averageMonthlyBalance, paymentHistoryAccountSummary.averageMonthlyBalance) &&
        Objects.equals(this.currentBalance, paymentHistoryAccountSummary.currentBalance) &&
        Objects.equals(this.beginDate, paymentHistoryAccountSummary.beginDate) &&
        Objects.equals(this.endDate, paymentHistoryAccountSummary.endDate) &&
        Objects.equals(this.totalNonsufficientFunds, paymentHistoryAccountSummary.totalNonsufficientFunds) &&
        Objects.equals(this.daysSinceNonsufficientFunds, paymentHistoryAccountSummary.daysSinceNonsufficientFunds)&&
        Objects.equals(this.additionalProperties, paymentHistoryAccountSummary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumberDisplay, financialInstitution, institutionIcon, currency, status, accountName, accountOwner, accountType, beginningBalance, averageMonthlyBalance, currentBalance, beginDate, endDate, totalNonsufficientFunds, daysSinceNonsufficientFunds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentHistoryAccountSummary {\n");
    sb.append("    accountNumberDisplay: ").append(toIndentedString(accountNumberDisplay)).append("\n");
    sb.append("    financialInstitution: ").append(toIndentedString(financialInstitution)).append("\n");
    sb.append("    institutionIcon: ").append(toIndentedString(institutionIcon)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountOwner: ").append(toIndentedString(accountOwner)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    beginningBalance: ").append(toIndentedString(beginningBalance)).append("\n");
    sb.append("    averageMonthlyBalance: ").append(toIndentedString(averageMonthlyBalance)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    totalNonsufficientFunds: ").append(toIndentedString(totalNonsufficientFunds)).append("\n");
    sb.append("    daysSinceNonsufficientFunds: ").append(toIndentedString(daysSinceNonsufficientFunds)).append("\n");
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
    openapiFields.add("financialInstitution");
    openapiFields.add("institutionIcon");
    openapiFields.add("currency");
    openapiFields.add("status");
    openapiFields.add("accountName");
    openapiFields.add("accountOwner");
    openapiFields.add("accountType");
    openapiFields.add("beginningBalance");
    openapiFields.add("averageMonthlyBalance");
    openapiFields.add("currentBalance");
    openapiFields.add("beginDate");
    openapiFields.add("endDate");
    openapiFields.add("totalNonsufficientFunds");
    openapiFields.add("daysSinceNonsufficientFunds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountNumberDisplay");
    openapiRequiredFields.add("financialInstitution");
    openapiRequiredFields.add("institutionIcon");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("accountName");
    openapiRequiredFields.add("accountOwner");
    openapiRequiredFields.add("accountType");
    openapiRequiredFields.add("beginningBalance");
    openapiRequiredFields.add("averageMonthlyBalance");
    openapiRequiredFields.add("currentBalance");
    openapiRequiredFields.add("beginDate");
    openapiRequiredFields.add("endDate");
    openapiRequiredFields.add("daysSinceNonsufficientFunds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentHistoryAccountSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentHistoryAccountSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentHistoryAccountSummary is not found in the empty JSON string", PaymentHistoryAccountSummary.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentHistoryAccountSummary.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("accountNumberDisplay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumberDisplay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumberDisplay").toString()));
      }
      if (!jsonObj.get("financialInstitution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `financialInstitution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("financialInstitution").toString()));
      }
      if (!jsonObj.get("institutionIcon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institutionIcon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institutionIcon").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("accountName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountName").toString()));
      }
      // validate the required field `accountOwner`
      PaymentHistoryAccountSummaryAccountOwner.validateJsonObject(jsonObj.getAsJsonObject("accountOwner"));
      if (!jsonObj.get("accountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountType").toString()));
      }
      if (!jsonObj.get("beginDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beginDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beginDate").toString()));
      }
      if (!jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentHistoryAccountSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentHistoryAccountSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentHistoryAccountSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentHistoryAccountSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentHistoryAccountSummary>() {
           @Override
           public void write(JsonWriter out, PaymentHistoryAccountSummary value) throws IOException {
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
           public PaymentHistoryAccountSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentHistoryAccountSummary instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentHistoryAccountSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentHistoryAccountSummary
  * @throws IOException if the JSON string is invalid with respect to PaymentHistoryAccountSummary
  */
  public static PaymentHistoryAccountSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentHistoryAccountSummary.class);
  }

 /**
  * Convert an instance of PaymentHistoryAccountSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
