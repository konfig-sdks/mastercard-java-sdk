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
import com.konfigthis.client.model.ErrorMessage;
import com.konfigthis.client.model.ReportInstitution;
import com.konfigthis.client.model.VOIEPaystubWithStatementPayStatement;
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
 * A VOIE Paystub With TXVerify report
 */
@ApiModel(description = "A VOIE Paystub With TXVerify report")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VOIEPaystubWithTXVerifyReport {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CUSTOMER_TYPE = "customerType";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_TYPE)
  private String customerType;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private Long customerId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_REQUESTER_NAME = "requesterName";
  @SerializedName(SERIALIZED_NAME_REQUESTER_NAME)
  private String requesterName;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private Long createdDate;

  public static final String SERIALIZED_NAME_CONSUMER_ID = "consumerId";
  @SerializedName(SERIALIZED_NAME_CONSUMER_ID)
  private String consumerId;

  public static final String SERIALIZED_NAME_CONSUMER_SSN = "consumerSsn";
  @SerializedName(SERIALIZED_NAME_CONSUMER_SSN)
  private String consumerSsn;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ErrorMessage> errors = null;

  public static final String SERIALIZED_NAME_PORTFOLIO_ID = "portfolioId";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_ID)
  private String portfolioId;

  public static final String SERIALIZED_NAME_ASSET_IDS = "assetIds";
  @SerializedName(SERIALIZED_NAME_ASSET_IDS)
  private List<String> assetIds = null;

  public static final String SERIALIZED_NAME_NUMBER_OF_BILLABLE_ASSETS = "numberOfBillableAssets";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_BILLABLE_ASSETS)
  private Integer numberOfBillableAssets;

  public static final String SERIALIZED_NAME_PAY_STATEMENTS = "payStatements";
  @SerializedName(SERIALIZED_NAME_PAY_STATEMENTS)
  private List<VOIEPaystubWithStatementPayStatement> payStatements = null;

  public static final String SERIALIZED_NAME_INSTITUTIONS = "institutions";
  @SerializedName(SERIALIZED_NAME_INSTITUTIONS)
  private List<ReportInstitution> institutions = null;

  public VOIEPaystubWithTXVerifyReport() {
  }

  public VOIEPaystubWithTXVerifyReport title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Title of the report
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Finicity Asset Ready Report (CRA)", value = "Title of the report")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public VOIEPaystubWithTXVerifyReport id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * A report ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "u4hstnnak45g", value = "A report ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public VOIEPaystubWithTXVerifyReport customerType(String customerType) {
    
    
    
    
    this.customerType = customerType;
    return this;
  }

   /**
   * The type of customer (\&quot;active\&quot; or \&quot;testing\&quot; or \&quot;\&quot; for all types)
   * @return customerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "active", value = "The type of customer (\"active\" or \"testing\" or \"\" for all types)")

  public String getCustomerType() {
    return customerType;
  }


  public void setCustomerType(String customerType) {
    
    
    
    this.customerType = customerType;
  }


  public VOIEPaystubWithTXVerifyReport customerId(Long customerId) {
    
    
    
    
    this.customerId = customerId;
    return this;
  }

   /**
   * A customer ID represented as a number. See Add Customer API for how to create a customer ID.
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1005061234", value = "A customer ID represented as a number. See Add Customer API for how to create a customer ID.")

  public Long getCustomerId() {
    return customerId;
  }


  public void setCustomerId(Long customerId) {
    
    
    
    this.customerId = customerId;
  }


  public VOIEPaystubWithTXVerifyReport requestId(String requestId) {
    
    
    
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Finicity indicator to track all activity associated with this report
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cjqm4wtdcn", value = "Finicity indicator to track all activity associated with this report")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    
    
    
    this.requestId = requestId;
  }


  public VOIEPaystubWithTXVerifyReport requesterName(String requesterName) {
    
    
    
    
    this.requesterName = requesterName;
    return this;
  }

   /**
   * Name of a Finicity partner
   * @return requesterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Finicity Test API", value = "Name of a Finicity partner")

  public String getRequesterName() {
    return requesterName;
  }


  public void setRequesterName(String requesterName) {
    
    
    
    this.requesterName = requesterName;
  }


  public VOIEPaystubWithTXVerifyReport createdDate(Long createdDate) {
    
    
    
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). Note: If the report is retrieved on a day other than the day it was generated, on the header of the PDF version of the report there will be a \&quot;Retrieved Date\&quot; populated.
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1607450357", value = "A date in Unix epoch time (in seconds). See: [Handling Epoch Dates and Times](https://developer.mastercard.com/open-banking-us/documentation/codes-and-formats/). Note: If the report is retrieved on a day other than the day it was generated, on the header of the PDF version of the report there will be a \"Retrieved Date\" populated.")

  public Long getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(Long createdDate) {
    
    
    
    this.createdDate = createdDate;
  }


  public VOIEPaystubWithTXVerifyReport consumerId(String consumerId) {
    
    
    
    
    this.consumerId = consumerId;
    return this;
  }

   /**
   * A consumer ID. See Create Consumer API for how to create a consumer ID.
   * @return consumerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0bf46322c167b562e6cbed9d40e19a4c", value = "A consumer ID. See Create Consumer API for how to create a consumer ID.")

  public String getConsumerId() {
    return consumerId;
  }


  public void setConsumerId(String consumerId) {
    
    
    
    this.consumerId = consumerId;
  }


  public VOIEPaystubWithTXVerifyReport consumerSsn(String consumerSsn) {
    
    
    
    
    this.consumerSsn = consumerSsn;
    return this;
  }

   /**
   * Last 4 digits of a SSN
   * @return consumerSsn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9999", value = "Last 4 digits of a SSN")

  public String getConsumerSsn() {
    return consumerSsn;
  }


  public void setConsumerSsn(String consumerSsn) {
    
    
    
    this.consumerSsn = consumerSsn;
  }


  public VOIEPaystubWithTXVerifyReport type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * A report type. Possible values:  * &#x60;voi&#x60;  * &#x60;voa&#x60;  * &#x60;voaHistory&#x60;  * &#x60;history&#x60;  * &#x60;voieTxVerify&#x60;  * &#x60;voieWithReport&#x60;  * &#x60;voieWithInterview&#x60;  * &#x60;paystatement&#x60;  * &#x60;preQualVoa&#x60;  * &#x60;assetSummary&#x60;  * &#x60;voie&#x60;  * &#x60;transactions&#x60;  * &#x60;statement&#x60;  * &#x60;voiePayroll&#x60;  * &#x60;voeTransactions&#x60;  * &#x60;voePayroll&#x60;  * &#x60;cfrp&#x60;  * &#x60;cfrb&#x60;  * &#x60;barpcra&#x60;  * &#x60;barpnoncra&#x60;  * &#x60;barbcra&#x60;  * &#x60;barbftc&#x60;  * &#x60;barbnoncra&#x60; 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "voi", value = "A report type. Possible values:  * `voi`  * `voa`  * `voaHistory`  * `history`  * `voieTxVerify`  * `voieWithReport`  * `voieWithInterview`  * `paystatement`  * `preQualVoa`  * `assetSummary`  * `voie`  * `transactions`  * `statement`  * `voiePayroll`  * `voeTransactions`  * `voePayroll`  * `cfrp`  * `cfrb`  * `barpcra`  * `barpnoncra`  * `barbcra`  * `barbftc`  * `barbnoncra` ")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public VOIEPaystubWithTXVerifyReport status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * A report generation status. Possible values:  * &#x60;inProgress&#x60;  * &#x60;success&#x60;  * &#x60;failure&#x60; 
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "inProgress", value = "A report generation status. Possible values:  * `inProgress`  * `success`  * `failure` ")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public VOIEPaystubWithTXVerifyReport errors(List<ErrorMessage> errors) {
    
    
    
    
    this.errors = errors;
    return this;
  }

  public VOIEPaystubWithTXVerifyReport addErrorsItem(ErrorMessage errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * In case errors occurred during the report generation
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "In case errors occurred during the report generation")

  public List<ErrorMessage> getErrors() {
    return errors;
  }


  public void setErrors(List<ErrorMessage> errors) {
    
    
    
    this.errors = errors;
  }


  public VOIEPaystubWithTXVerifyReport portfolioId(String portfolioId) {
    
    
    
    
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * A unique identifier that will be consistent across all reports created for the same customer
   * @return portfolioId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "y4zsgccj4xpw-6-port", value = "A unique identifier that will be consistent across all reports created for the same customer")

  public String getPortfolioId() {
    return portfolioId;
  }


  public void setPortfolioId(String portfolioId) {
    
    
    
    this.portfolioId = portfolioId;
  }


  public VOIEPaystubWithTXVerifyReport assetIds(List<String> assetIds) {
    
    
    
    
    this.assetIds = assetIds;
    return this;
  }

  public VOIEPaystubWithTXVerifyReport addAssetIdsItem(String assetIdsItem) {
    if (this.assetIds == null) {
      this.assetIds = new ArrayList<>();
    }
    this.assetIds.add(assetIdsItem);
    return this;
  }

   /**
   * The pay statements included in the report
   * @return assetIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pay statements included in the report")

  public List<String> getAssetIds() {
    return assetIds;
  }


  public void setAssetIds(List<String> assetIds) {
    
    
    
    this.assetIds = assetIds;
  }


  public VOIEPaystubWithTXVerifyReport numberOfBillableAssets(Integer numberOfBillableAssets) {
    
    
    
    
    this.numberOfBillableAssets = numberOfBillableAssets;
    return this;
  }

   /**
   * Total number of billable pay statements included in the report
   * @return numberOfBillableAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Total number of billable pay statements included in the report")

  public Integer getNumberOfBillableAssets() {
    return numberOfBillableAssets;
  }


  public void setNumberOfBillableAssets(Integer numberOfBillableAssets) {
    
    
    
    this.numberOfBillableAssets = numberOfBillableAssets;
  }


  public VOIEPaystubWithTXVerifyReport payStatements(List<VOIEPaystubWithStatementPayStatement> payStatements) {
    
    
    
    
    this.payStatements = payStatements;
    return this;
  }

  public VOIEPaystubWithTXVerifyReport addPayStatementsItem(VOIEPaystubWithStatementPayStatement payStatementsItem) {
    if (this.payStatements == null) {
      this.payStatements = new ArrayList<>();
    }
    this.payStatements.add(payStatementsItem);
    return this;
  }

   /**
   * Extracted pay statement details, and the transaction matching summary
   * @return payStatements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extracted pay statement details, and the transaction matching summary")

  public List<VOIEPaystubWithStatementPayStatement> getPayStatements() {
    return payStatements;
  }


  public void setPayStatements(List<VOIEPaystubWithStatementPayStatement> payStatements) {
    
    
    
    this.payStatements = payStatements;
  }


  public VOIEPaystubWithTXVerifyReport institutions(List<ReportInstitution> institutions) {
    
    
    
    
    this.institutions = institutions;
    return this;
  }

  public VOIEPaystubWithTXVerifyReport addInstitutionsItem(ReportInstitution institutionsItem) {
    if (this.institutions == null) {
      this.institutions = new ArrayList<>();
    }
    this.institutions.add(institutionsItem);
    return this;
  }

   /**
   * The details of the financial institution accounts included in the report.
   * @return institutions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The details of the financial institution accounts included in the report.")

  public List<ReportInstitution> getInstitutions() {
    return institutions;
  }


  public void setInstitutions(List<ReportInstitution> institutions) {
    
    
    
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
   * @return the VOIEPaystubWithTXVerifyReport instance itself
   */
  public VOIEPaystubWithTXVerifyReport putAdditionalProperty(String key, Object value) {
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
    VOIEPaystubWithTXVerifyReport voIEPaystubWithTXVerifyReport = (VOIEPaystubWithTXVerifyReport) o;
    return Objects.equals(this.title, voIEPaystubWithTXVerifyReport.title) &&
        Objects.equals(this.id, voIEPaystubWithTXVerifyReport.id) &&
        Objects.equals(this.customerType, voIEPaystubWithTXVerifyReport.customerType) &&
        Objects.equals(this.customerId, voIEPaystubWithTXVerifyReport.customerId) &&
        Objects.equals(this.requestId, voIEPaystubWithTXVerifyReport.requestId) &&
        Objects.equals(this.requesterName, voIEPaystubWithTXVerifyReport.requesterName) &&
        Objects.equals(this.createdDate, voIEPaystubWithTXVerifyReport.createdDate) &&
        Objects.equals(this.consumerId, voIEPaystubWithTXVerifyReport.consumerId) &&
        Objects.equals(this.consumerSsn, voIEPaystubWithTXVerifyReport.consumerSsn) &&
        Objects.equals(this.type, voIEPaystubWithTXVerifyReport.type) &&
        Objects.equals(this.status, voIEPaystubWithTXVerifyReport.status) &&
        Objects.equals(this.errors, voIEPaystubWithTXVerifyReport.errors) &&
        Objects.equals(this.portfolioId, voIEPaystubWithTXVerifyReport.portfolioId) &&
        Objects.equals(this.assetIds, voIEPaystubWithTXVerifyReport.assetIds) &&
        Objects.equals(this.numberOfBillableAssets, voIEPaystubWithTXVerifyReport.numberOfBillableAssets) &&
        Objects.equals(this.payStatements, voIEPaystubWithTXVerifyReport.payStatements) &&
        Objects.equals(this.institutions, voIEPaystubWithTXVerifyReport.institutions)&&
        Objects.equals(this.additionalProperties, voIEPaystubWithTXVerifyReport.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, id, customerType, customerId, requestId, requesterName, createdDate, consumerId, consumerSsn, type, status, errors, portfolioId, assetIds, numberOfBillableAssets, payStatements, institutions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VOIEPaystubWithTXVerifyReport {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    requesterName: ").append(toIndentedString(requesterName)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    consumerSsn: ").append(toIndentedString(consumerSsn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
    sb.append("    numberOfBillableAssets: ").append(toIndentedString(numberOfBillableAssets)).append("\n");
    sb.append("    payStatements: ").append(toIndentedString(payStatements)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("id");
    openapiFields.add("customerType");
    openapiFields.add("customerId");
    openapiFields.add("requestId");
    openapiFields.add("requesterName");
    openapiFields.add("createdDate");
    openapiFields.add("consumerId");
    openapiFields.add("consumerSsn");
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("errors");
    openapiFields.add("portfolioId");
    openapiFields.add("assetIds");
    openapiFields.add("numberOfBillableAssets");
    openapiFields.add("payStatements");
    openapiFields.add("institutions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VOIEPaystubWithTXVerifyReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VOIEPaystubWithTXVerifyReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VOIEPaystubWithTXVerifyReport is not found in the empty JSON string", VOIEPaystubWithTXVerifyReport.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("customerType") != null && !jsonObj.get("customerType").isJsonNull()) && !jsonObj.get("customerType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerType").toString()));
      }
      if ((jsonObj.get("requestId") != null && !jsonObj.get("requestId").isJsonNull()) && !jsonObj.get("requestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestId").toString()));
      }
      if ((jsonObj.get("requesterName") != null && !jsonObj.get("requesterName").isJsonNull()) && !jsonObj.get("requesterName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requesterName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requesterName").toString()));
      }
      if ((jsonObj.get("consumerId") != null && !jsonObj.get("consumerId").isJsonNull()) && !jsonObj.get("consumerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumerId").toString()));
      }
      if ((jsonObj.get("consumerSsn") != null && !jsonObj.get("consumerSsn").isJsonNull()) && !jsonObj.get("consumerSsn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumerSsn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumerSsn").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            ErrorMessage.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("portfolioId") != null && !jsonObj.get("portfolioId").isJsonNull()) && !jsonObj.get("portfolioId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `portfolioId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("portfolioId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("assetIds") != null && !jsonObj.get("assetIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetIds` to be an array in the JSON string but got `%s`", jsonObj.get("assetIds").toString()));
      }
      if (jsonObj.get("payStatements") != null && !jsonObj.get("payStatements").isJsonNull()) {
        JsonArray jsonArraypayStatements = jsonObj.getAsJsonArray("payStatements");
        if (jsonArraypayStatements != null) {
          // ensure the json data is an array
          if (!jsonObj.get("payStatements").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `payStatements` to be an array in the JSON string but got `%s`", jsonObj.get("payStatements").toString()));
          }

          // validate the optional field `payStatements` (array)
          for (int i = 0; i < jsonArraypayStatements.size(); i++) {
            VOIEPaystubWithStatementPayStatement.validateJsonObject(jsonArraypayStatements.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("institutions") != null && !jsonObj.get("institutions").isJsonNull()) {
        JsonArray jsonArrayinstitutions = jsonObj.getAsJsonArray("institutions");
        if (jsonArrayinstitutions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("institutions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `institutions` to be an array in the JSON string but got `%s`", jsonObj.get("institutions").toString()));
          }

          // validate the optional field `institutions` (array)
          for (int i = 0; i < jsonArrayinstitutions.size(); i++) {
            ReportInstitution.validateJsonObject(jsonArrayinstitutions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VOIEPaystubWithTXVerifyReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VOIEPaystubWithTXVerifyReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VOIEPaystubWithTXVerifyReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VOIEPaystubWithTXVerifyReport.class));

       return (TypeAdapter<T>) new TypeAdapter<VOIEPaystubWithTXVerifyReport>() {
           @Override
           public void write(JsonWriter out, VOIEPaystubWithTXVerifyReport value) throws IOException {
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
           public VOIEPaystubWithTXVerifyReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VOIEPaystubWithTXVerifyReport instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VOIEPaystubWithTXVerifyReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VOIEPaystubWithTXVerifyReport
  * @throws IOException if the JSON string is invalid with respect to VOIEPaystubWithTXVerifyReport
  */
  public static VOIEPaystubWithTXVerifyReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VOIEPaystubWithTXVerifyReport.class);
  }

 /**
  * Convert an instance of VOIEPaystubWithTXVerifyReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
