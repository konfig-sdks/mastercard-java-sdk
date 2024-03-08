<div align="left">

[![Visit Mastercard](./header.png)](https://finicity.com)

# [Mastercard](https://finicity.com)

OpenAPI specification for Finicity APIs.

Open Banking solutions in the US are provided by Finicity, a Mastercard
company.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Mastercard&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>mastercard-java-sdk</artifactId>
  <version>1.16.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:mastercard-java-sdk:1.16.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/mastercard-java-sdk-1.16.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mastercard;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountValidationAssistanceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.finicity.com";
    
    configuration.finicityAppKey  = "YOUR API KEY";
    
    configuration.finicityAppToken  = "YOUR API KEY";
    Mastercard client = new Mastercard(configuration);
    String customerId = "1005061234"; // A customer ID
    String accountId = "5011648377"; // The account ID
    try {
      MicroDepositDetails result = client
              .accountValidationAssistance
              .getMicroEntriesDetails(customerId, accountId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getStatusDescription());
      System.out.println(result.getCreationDate());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getAccountNumberLast4());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountValidationAssistanceApi#getMicroEntriesDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MicroDepositDetails> response = client
              .accountValidationAssistance
              .getMicroEntriesDetails(customerId, accountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountValidationAssistanceApi#getMicroEntriesDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.finicity.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountValidationAssistanceApi* | [**getMicroEntriesDetails**](docs/AccountValidationAssistanceApi.md#getMicroEntriesDetails) | **GET** /microentry/v1/customers/{customerId}/accounts/{accountId} | Get Micro Entries Details
*AccountValidationAssistanceApi* | [**initiateMicroEntries**](docs/AccountValidationAssistanceApi.md#initiateMicroEntries) | **POST** /microentry/v1/customers/{customerId} | Initiate Micro Entries
*AccountValidationAssistanceApi* | [**verifyMicroEntries**](docs/AccountValidationAssistanceApi.md#verifyMicroEntries) | **POST** /microentry/v1/customers/{customerId}/accounts/{accountId}/amounts | Verify Micro Entries
*AccountsApi* | [**getById**](docs/AccountsApi.md#getById) | **GET** /aggregation/v2/customers/{customerId}/accounts/{accountId} | Get Customer Account by ID
*AccountsApi* | [**getByInstitutionLogin**](docs/AccountsApi.md#getByInstitutionLogin) | **GET** /aggregation/v1/customers/{customerId}/institutionLogins/{institutionLoginId}/accounts | Get Customer Accounts by Institution Login ID
*AccountsApi* | [**getCustomerAccounts**](docs/AccountsApi.md#getCustomerAccounts) | **GET** /aggregation/v1/customers/{customerId}/accounts | Get Customer Accounts
*AccountsApi* | [**getCustomerInstitutionAccounts**](docs/AccountsApi.md#getCustomerInstitutionAccounts) | **GET** /aggregation/v1/customers/{customerId}/institutions/{institutionId}/accounts | Get Customer Accounts by Institution ID
*AccountsApi* | [**refreshCustomerAccountByInstitutionLogin**](docs/AccountsApi.md#refreshCustomerAccountByInstitutionLogin) | **POST** /aggregation/v2/customers/{customerId}/institutionLogins/{institutionLoginId}/accounts | Refresh Customer Account by Institution Login ID for Data Access Tiers
*AccountsApi* | [**refreshCustomerAggregation**](docs/AccountsApi.md#refreshCustomerAggregation) | **POST** /aggregation/v1/customers/{customerId}/accounts | Refresh Customer Accounts
*AccountsApi* | [**refreshCustomerByInstitutionLogin**](docs/AccountsApi.md#refreshCustomerByInstitutionLogin) | **POST** /aggregation/v1/customers/{customerId}/institutionLogins/{institutionLoginId}/accounts | Refresh Customer Accounts by Institution Login ID
*AccountsApi* | [**refreshCustomerData**](docs/AccountsApi.md#refreshCustomerData) | **POST** /aggregation/v2/customers/{customerId}/accounts | Refresh Customer Accounts for Data Access Tiers
*AccountsApi* | [**removeByCustomerIdAndAccountId**](docs/AccountsApi.md#removeByCustomerIdAndAccountId) | **DELETE** /aggregation/v1/customers/{customerId}/accounts/{accountId} | Delete Customer Account by ID
*AccountsApi* | [**removeByInstitutionLogin**](docs/AccountsApi.md#removeByInstitutionLogin) | **DELETE** /aggregation/v1/customers/{customerId}/institutionLogins/{institutionLoginId} | Delete Customer Accounts by Institution Login ID
*AccountsSimpleApi* | [**getBasicInfo**](docs/AccountsSimpleApi.md#getBasicInfo) | **GET** /aggregation/v1/customers/{customerId}/institutions/{institutionId}/accounts/simple | Get Customer Accounts by Institution ID (Simple)
*AccountsSimpleApi* | [**getBasicInfo_0**](docs/AccountsSimpleApi.md#getBasicInfo_0) | **GET** /aggregation/v1/customers/{customerId}/institutionLogins/{institutionLoginId}/accounts/simple | Get Customer Accounts by Institution Login ID (Simple)
*AccountsSimpleApi* | [**getBasicInfo_1**](docs/AccountsSimpleApi.md#getBasicInfo_1) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/simple | Get Customer Account by ID (Simple)
*AccountsSimpleApi* | [**getBasicInfo_2**](docs/AccountsSimpleApi.md#getBasicInfo_2) | **GET** /aggregation/v1/customers/{customerId}/accounts/simple | Get Customer Accounts (Simple)
*AppRegistrationApi* | [**assignApplications**](docs/AppRegistrationApi.md#assignApplications) | **PUT** /aggregation/v1/customers/{customerId}/applications/{applicationId} | Set Customer App ID
*AppRegistrationApi* | [**createNewApplication**](docs/AppRegistrationApi.md#createNewApplication) | **POST** /aggregation/v1/partners/applications | Register App
*AppRegistrationApi* | [**getApplicationStatus**](docs/AppRegistrationApi.md#getApplicationStatus) | **GET** /aggregation/v2/partners/applications | Get App Registration Status
*AppRegistrationApi* | [**migrateInstitutionLoginAccounts**](docs/AppRegistrationApi.md#migrateInstitutionLoginAccounts) | **PUT** /aggregation/v2/customers/{customerId}/institutionLogins/{institutionLoginId}/migration | Migrate Institution Login Accounts
*AppRegistrationApi* | [**updateRegistration**](docs/AppRegistrationApi.md#updateRegistration) | **PUT** /aggregation/v1/partners/applications/{preAppId} | Modify App Registration
*AssetsApi* | [**getBinaryFile**](docs/AssetsApi.md#getBinaryFile) | **GET** /aggregation/v1/customers/{customerId}/assets/{assetId} | Get Asset by Customer and ID
*AuthenticationApi* | [**createAccessToken**](docs/AuthenticationApi.md#createAccessToken) | **POST** /aggregation/v2/partners/authentication | Create Access Token
*AuthenticationApi* | [**modifyPartnerSecret**](docs/AuthenticationApi.md#modifyPartnerSecret) | **PUT** /aggregation/v2/partners/authentication | Modify Partner Secret
*BalanceAnalyticsApi* | [**generateAnalyticsReport**](docs/BalanceAnalyticsApi.md#generateAnalyticsReport) | **POST** /analytics/balance/v1/customer/{customerId} | Generate Balance Analytics
*BalanceAnalyticsApi* | [**generateFcraAnalyticsReport**](docs/BalanceAnalyticsApi.md#generateFcraAnalyticsReport) | **POST** /analytics/balance/v1/customer/{customerId}/fcra | Generate Balance Analytics - FCRA
*BalanceAnalyticsApi* | [**generateReport**](docs/BalanceAnalyticsApi.md#generateReport) | **POST** /decisioning/v2/customers/{customerId}/reports/balance-analytics/userTypes/{userType} | Generate Balance Analytics Report - Personal/Business
*BalanceAnalyticsApi* | [**getReportData**](docs/BalanceAnalyticsApi.md#getReportData) | **GET** /analytics/data/v1/{obb_report_id} | Get OBB Analytics Report
*BalanceAnalyticsApi* | [**getReportDataFcra**](docs/BalanceAnalyticsApi.md#getReportDataFcra) | **GET** /analytics/data/v1/{obb_report_id}/fcra | Get OBB Analytics Report - FCRA
*BankStatementsApi* | [**generateReport**](docs/BankStatementsApi.md#generateReport) | **POST** /decisioning/v2/customers/{customerId}/statement | Generate Statement Report
*BankStatementsApi* | [**getCustomerStatementInPdf**](docs/BankStatementsApi.md#getCustomerStatementInPdf) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/statement | Get Customer Account Statement
*BankStatementsApi* | [**getMultipleStatements**](docs/BankStatementsApi.md#getMultipleStatements) | **GET** /aggregation/v3/customers/{customerId}/accounts/{accountId}/statement | Get Customer Account Multiple Statements
*BusinessesApiApi* | [**createNewBusiness**](docs/BusinessesApiApi.md#createNewBusiness) | **POST** /business-services/customers/{customer_id}/businesses | Create a New Business for a Customer
*BusinessesApiApi* | [**getDetailsByCustomerId**](docs/BusinessesApiApi.md#getDetailsByCustomerId) | **GET** /business-services/customers/{customer_id}/businesses | Get Business for Customer
*BusinessesApiApi* | [**getDetailsById**](docs/BusinessesApiApi.md#getDetailsById) | **GET** /business-services/businesses/{business_id} | Get Business by ID
*BusinessesApiApi* | [**updateById**](docs/BusinessesApiApi.md#updateById) | **PUT** /business-services/businesses/{business_id} | Update Business by ID
*CashFlowApi* | [**generatePersonalReport**](docs/CashFlowApi.md#generatePersonalReport) | **POST** /decisioning/v2/customers/{customerId}/cashFlowPersonal | Generate Cash Flow Report - Personal
*CashFlowApi* | [**generateReportBusiness**](docs/CashFlowApi.md#generateReportBusiness) | **POST** /decisioning/v2/customers/{customerId}/cashFlowBusiness | Generate Cash Flow Report - Business
*CashFlowAnalyticsApi* | [**generateAnalytics**](docs/CashFlowAnalyticsApi.md#generateAnalytics) | **POST** /analytics/cashflow/v1/customer/{customerId} | Generate Cash Flow Analytics
*CashFlowAnalyticsApi* | [**generateFcraAnalyticsReport**](docs/CashFlowAnalyticsApi.md#generateFcraAnalyticsReport) | **POST** /analytics/cashflow/v1/customer/{customerId}/fcra | Generate Cash Flow Analytics - FCRA
*CashFlowAnalyticsApi* | [**generateReport**](docs/CashFlowAnalyticsApi.md#generateReport) | **POST** /decisioning/v2/customers/{customerId}/reports/cashflow-analytics/userTypes/{userType} | Generate Cashflow Analytics Report - Personal/Business
*CashFlowAnalyticsApi* | [**getReportData**](docs/CashFlowAnalyticsApi.md#getReportData) | **GET** /analytics/data/v1/{obb_report_id} | Get OBB Analytics Report
*CashFlowAnalyticsApi* | [**getReportDataFcra**](docs/CashFlowAnalyticsApi.md#getReportDataFcra) | **GET** /analytics/data/v1/{obb_report_id}/fcra | Get OBB Analytics Report - FCRA
*ConnectApi* | [**fixUrlGeneration**](docs/ConnectApi.md#fixUrlGeneration) | **POST** /connect/v2/generate/fix | Generate Fix Connect URL
*ConnectApi* | [**generateJointBorrowerUrl**](docs/ConnectApi.md#generateJointBorrowerUrl) | **POST** /connect/v2/generate/jointBorrower | Generate Connect URL - Joint Borrower
*ConnectApi* | [**generateLiteUrl**](docs/ConnectApi.md#generateLiteUrl) | **POST** /connect/v2/generate/lite | Generate Lite Connect URL
*ConnectApi* | [**generateUrl**](docs/ConnectApi.md#generateUrl) | **POST** /connect/v2/generate | Generate Connect URL
*ConnectApi* | [**sendConnectEmail**](docs/ConnectApi.md#sendConnectEmail) | **POST** /connect/v2/send/email | Send Connect Email
*ConnectApi* | [**sendEmailJointBorrower**](docs/ConnectApi.md#sendEmailJointBorrower) | **POST** /connect/v2/send/email/jointBorrower | Send Connect Email - Joint Borrower
*ConnectApi* | [**verifyMicroEntryMicrodeposits**](docs/ConnectApi.md#verifyMicroEntryMicrodeposits) | **POST** /connect/v2/generate/microentry/verify | Account Validation Assistant User verification of microdeposits
*ConsumersApi* | [**createConsumerRecord**](docs/ConsumersApi.md#createConsumerRecord) | **POST** /decisioning/v1/customers/{customerId}/consumer | Create Consumer
*ConsumersApi* | [**getByCustomerId**](docs/ConsumersApi.md#getByCustomerId) | **GET** /decisioning/v1/customers/{customerId}/consumer | Get Consumer For Customer
*ConsumersApi* | [**getById**](docs/ConsumersApi.md#getById) | **GET** /decisioning/v1/consumers/{consumerId} | Get Consumer by ID
*ConsumersApi* | [**modifyById**](docs/ConsumersApi.md#modifyById) | **PUT** /decisioning/v1/consumers/{consumerId} | Modify Consumer by ID
*CustomerAuthorizationDetailsApi* | [**getAuthorizationDetails**](docs/CustomerAuthorizationDetailsApi.md#getAuthorizationDetails) | **GET** /customers/institution-logins/{institution_login_id}/authorization-details | Returns customer authorization details for the institution login identification.
*CustomersApi* | [**enrollActiveCustomer**](docs/CustomersApi.md#enrollActiveCustomer) | **POST** /aggregation/v2/customers/active | Add Customer
*CustomersApi* | [**enrollTestingCustomer**](docs/CustomersApi.md#enrollTestingCustomer) | **POST** /aggregation/v2/customers/testing | Add Testing Customer
*CustomersApi* | [**findEnrolledUsers**](docs/CustomersApi.md#findEnrolledUsers) | **GET** /aggregation/v1/customers | Get Customers
*CustomersApi* | [**getById**](docs/CustomersApi.md#getById) | **GET** /aggregation/v1/customers/{customerId} | Get Customer by ID
*CustomersApi* | [**getWithAppDataById**](docs/CustomersApi.md#getWithAppDataById) | **GET** /aggregation/v1/customers/{customerId}/application | Get Customer With App Data by ID
*CustomersApi* | [**modifyById**](docs/CustomersApi.md#modifyById) | **PUT** /aggregation/v1/customers/{customerId} | Modify Customer by ID
*CustomersApi* | [**removeById**](docs/CustomersApi.md#removeById) | **DELETE** /aggregation/v1/customers/{customerId} | Delete Customer by ID
*InstitutionsApi* | [**getBrandingById**](docs/InstitutionsApi.md#getBrandingById) | **GET** /institution/v2/institutions/{institutionId}/branding | Get Institution Branding by ID
*InstitutionsApi* | [**getByIdDetails**](docs/InstitutionsApi.md#getByIdDetails) | **GET** /institution/v2/institutions/{institutionId} | Get Institution by ID
*InstitutionsApi* | [**getCertifiedInstitutionsWithRssd**](docs/InstitutionsApi.md#getCertifiedInstitutionsWithRssd) | **GET** /institution/v2/certifiedInstitutions/rssd | Get Certified Institutions With RSSD
*InstitutionsApi* | [**listCertifiedInstitutions**](docs/InstitutionsApi.md#listCertifiedInstitutions) | **GET** /institution/v2/certifiedInstitutions | Get Certified Institutions
*InstitutionsApi* | [**searchFinancialInstitutions**](docs/InstitutionsApi.md#searchFinancialInstitutions) | **GET** /institution/v2/institutions | Get Institutions
*PayStatementsApi* | [**uploadForCustomer**](docs/PayStatementsApi.md#uploadForCustomer) | **POST** /aggregation/v1/customers/{customerId}/payStatements | Store Customer Pay Statement
*PaymentHistoryApi* | [**generateCustomerPaymentReport**](docs/PaymentHistoryApi.md#generateCustomerPaymentReport) | **POST** /analytics/payment-history/v1/customer/{customerId} | Generate Payment History
*PaymentHistoryApi* | [**generateFcraPaymentReport**](docs/PaymentHistoryApi.md#generateFcraPaymentReport) | **POST** /analytics/payment-history/v1/customer/{customerId}/fcra | Generate Payment History - FCRA
*PaymentHistoryApi* | [**getReportData**](docs/PaymentHistoryApi.md#getReportData) | **GET** /analytics/data/v1/{obb_report_id} | Get OBB Analytics Report
*PaymentHistoryApi* | [**getReportDataFcra**](docs/PaymentHistoryApi.md#getReportDataFcra) | **GET** /analytics/data/v1/{obb_report_id}/fcra | Get OBB Analytics Report - FCRA
*PaymentsApi* | [**getAccountOwnerDetails**](docs/PaymentsApi.md#getAccountOwnerDetails) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/owner | Get Account Owner
*PaymentsApi* | [**getAccountOwnerDetails_0**](docs/PaymentsApi.md#getAccountOwnerDetails_0) | **GET** /aggregation/v3/customers/{customerId}/accounts/{accountId}/owner | Get Account Owner Details
*PaymentsApi* | [**getAchDetails**](docs/PaymentsApi.md#getAchDetails) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/details | Get Account ACH Details
*PaymentsApi* | [**getAvailableBalanceLive**](docs/PaymentsApi.md#getAvailableBalanceLive) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/availableBalance/live | Get Available Balance - Live
*PaymentsApi* | [**getLatestCachedBalance**](docs/PaymentsApi.md#getLatestCachedBalance) | **GET** /aggregation/v1/customers/{customerId}/accounts/{accountId}/availableBalance | Get Available Balance
*PaymentsApi* | [**getLoanPaymentDetails**](docs/PaymentsApi.md#getLoanPaymentDetails) | **GET** /aggregation/v2/customers/{customerId}/accounts/{accountId}/loanDetails | Get Loan Payment Details
*PortfoliosApi* | [**getMostRecentReports**](docs/PortfoliosApi.md#getMostRecentReports) | **GET** /decisioning/v1/customers/{customerId}/portfolios/{portfolioId} | Get Portfolio by Customer
*PortfoliosApi* | [**getPortfolioByConsumer**](docs/PortfoliosApi.md#getPortfolioByConsumer) | **GET** /decisioning/v1/consumers/{consumerId}/portfolios/{portfolioId} | Get Portfolio by Consumer
*ReportsApi* | [**byConsumerId**](docs/ReportsApi.md#byConsumerId) | **GET** /decisioning/v1/consumers/{consumerId}/reports | Get Reports by Consumer ID
*ReportsApi* | [**byCustomerId**](docs/ReportsApi.md#byCustomerId) | **GET** /decisioning/v1/customers/{customerId}/reports | Get Reports by Customer ID
*ReportsApi* | [**getByConsumerAndId**](docs/ReportsApi.md#getByConsumerAndId) | **GET** /decisioning/v3/consumers/{consumerId}/reports/{reportId} | Get Report by Consumer and ID
*ReportsApi* | [**getStatus**](docs/ReportsApi.md#getStatus) | **GET** /decisioning/v3/customers/{customerId}/reports/{reportId} | Get Report by Customer and ID
*ThirdPartyAccessApi* | [**generateKey**](docs/ThirdPartyAccessApi.md#generateKey) | **POST** /aggregation/v1/partners/accessKey | Generate Third Party Access Key
*ThirdPartyAccessApi* | [**revokePartnersAccess**](docs/ThirdPartyAccessApi.md#revokePartnersAccess) | **DELETE** /aggregation/v1/partners/accessKey/{consentReceiptId} | Revoke Third Party Access
*ThirdPartyAccessApi* | [**updateAccess**](docs/ThirdPartyAccessApi.md#updateAccess) | **PUT** /aggregation/v1/partners/accessKey/{consentReceiptId} | Update Third Party Access
*TransactionsApi* | [**get24MonthsHistoryAndGenerateReport**](docs/TransactionsApi.md#get24MonthsHistoryAndGenerateReport) | **POST** /decisioning/v2/customers/{customerId}/transactions | Generate Transactions Report
*TransactionsApi* | [**getAllCustomerTransactions**](docs/TransactionsApi.md#getAllCustomerTransactions) | **GET** /aggregation/v3/customers/{customerId}/transactions | Get All Customer Transactions
*TransactionsApi* | [**getById**](docs/TransactionsApi.md#getById) | **GET** /aggregation/v2/customers/{customerId}/transactions/{transactionId} | Get Customer Transaction by ID
*TransactionsApi* | [**getCustomerAccountTransactions**](docs/TransactionsApi.md#getCustomerAccountTransactions) | **GET** /aggregation/v4/customers/{customerId}/accounts/{accountId}/transactions | Get Customer Account Transactions
*TransactionsApi* | [**loadHistoricTransactionsForCustomerAccount**](docs/TransactionsApi.md#loadHistoricTransactionsForCustomerAccount) | **POST** /aggregation/v1/customers/{customerId}/accounts/{accountId}/transactions/historic | Load Historic Transactions for Customer Account
*TxPushApi* | [**deleteSubscription**](docs/TxPushApi.md#deleteSubscription) | **DELETE** /aggregation/v1/customers/{customerId}/subscriptions/{subscriptionId} | Delete TxPush Subscription
*TxPushApi* | [**disableNotifications**](docs/TxPushApi.md#disableNotifications) | **DELETE** /aggregation/v1/customers/{customerId}/accounts/{accountId}/txpush | Disable TxPush Notifications
*TxPushApi* | [**injectTestTransaction**](docs/TxPushApi.md#injectTestTransaction) | **POST** /aggregation/v1/customers/{customerId}/accounts/{accountId}/transactions | Create TxPush Test Transaction
*TxPushApi* | [**subscribeNotifications**](docs/TxPushApi.md#subscribeNotifications) | **POST** /aggregation/v1/customers/{customerId}/accounts/{accountId}/txpush | Subscribe to TxPush Notifications
*VerifyAssetsApi* | [**customerVOAReport**](docs/VerifyAssetsApi.md#customerVOAReport) | **POST** /decisioning/v2/customers/{customerId}/voa | Generate VOA Report
*VerifyAssetsApi* | [**generateVOAWithIncomeReport**](docs/VerifyAssetsApi.md#generateVOAWithIncomeReport) | **POST** /decisioning/v2/customers/{customerId}/voaHistory | Generate VOA With Income Report
*VerifyAssetsApi* | [**getAssetSummary**](docs/VerifyAssetsApi.md#getAssetSummary) | **POST** /decisioning/v2/customers/{customerId}/assetSummary | Generate Prequalification (Non-CRA) Report
*VerifyAssetsApi* | [**getCheckingSavingsInvestmentAccounts**](docs/VerifyAssetsApi.md#getCheckingSavingsInvestmentAccounts) | **POST** /decisioning/v2/customers/{customerId}/preQualVoa | Generate Prequalification (CRA) Report
*VerifyIncomeAndEmploymentApi* | [**createVOIReport**](docs/VerifyIncomeAndEmploymentApi.md#createVOIReport) | **POST** /decisioning/v2/customers/{customerId}/voi | Generate VOI Report
*VerifyIncomeAndEmploymentApi* | [**generatePayStatementReport**](docs/VerifyIncomeAndEmploymentApi.md#generatePayStatementReport) | **POST** /decisioning/v2/customers/{customerId}/payStatement | Generate Pay Statement Report
*VerifyIncomeAndEmploymentApi* | [**generateVOETransactionsReport**](docs/VerifyIncomeAndEmploymentApi.md#generateVOETransactionsReport) | **POST** /decisioning/v2/customers/{customerId}/voeTransactions | Generate VOE - Transactions Report
*VerifyIncomeAndEmploymentApi* | [**generateVOIEPaystubWithTxVerifyReport**](docs/VerifyIncomeAndEmploymentApi.md#generateVOIEPaystubWithTxVerifyReport) | **POST** /decisioning/v2/customers/{customerId}/voieTxVerify/withInterview | Generate VOIE - Paystub (with TXVerify) Report
*VerifyIncomeAndEmploymentApi* | [**generateVoePayrollReport**](docs/VerifyIncomeAndEmploymentApi.md#generateVoePayrollReport) | **POST** /decisioning/v2/customers/{customerId}/voePayroll | Generate VOE - Payroll Report
*VerifyIncomeAndEmploymentApi* | [**generateVoiePaystubReport**](docs/VerifyIncomeAndEmploymentApi.md#generateVoiePaystubReport) | **POST** /decisioning/v2/customers/{customerId}/voieTxVerify/withStatement | Generate VOIE - Paystub Report
*VerifyIncomeAndEmploymentApi* | [**refreshVOIEPayrollReport**](docs/VerifyIncomeAndEmploymentApi.md#refreshVOIEPayrollReport) | **POST** /decisioning/v2/customers/{customerId}/voiePayroll | Generate VOIE - Payroll Report


## Documentation for Models

 - [ACHDetails](docs/ACHDetails.md)
 - [AFBalanceAnalyticsReport](docs/AFBalanceAnalyticsReport.md)
 - [AFBalanceAnalyticsReportAllOf](docs/AFBalanceAnalyticsReportAllOf.md)
 - [AFBusiness](docs/AFBusiness.md)
 - [AFBusinessAddress](docs/AFBusinessAddress.md)
 - [AFCashFlowAnalyticsReport](docs/AFCashFlowAnalyticsReport.md)
 - [AFCashFlowAnalyticsReportAllOf](docs/AFCashFlowAnalyticsReportAllOf.md)
 - [AccessToken](docs/AccessToken.md)
 - [AccountAnalytics](docs/AccountAnalytics.md)
 - [AccountDetails](docs/AccountDetails.md)
 - [AccountDetailsTxBased](docs/AccountDetailsTxBased.md)
 - [AccountDetailsTxBasedAllOf](docs/AccountDetailsTxBasedAllOf.md)
 - [AccountOwner](docs/AccountOwner.md)
 - [AccountOwnerAddress](docs/AccountOwnerAddress.md)
 - [AccountOwnerDetails](docs/AccountOwnerDetails.md)
 - [AccountOwnerDocumentation](docs/AccountOwnerDocumentation.md)
 - [AccountOwnerEmail](docs/AccountOwnerEmail.md)
 - [AccountOwnerHolders](docs/AccountOwnerHolders.md)
 - [AccountOwnerIdentityInsights](docs/AccountOwnerIdentityInsights.md)
 - [AccountOwnerPhone](docs/AccountOwnerPhone.md)
 - [AnalyticsReportAck](docs/AnalyticsReportAck.md)
 - [AnalyticsReportAckAllOf](docs/AnalyticsReportAckAllOf.md)
 - [AnalyticsReportConstraints](docs/AnalyticsReportConstraints.md)
 - [AnalyticsReportConstraintsOut](docs/AnalyticsReportConstraintsOut.md)
 - [AnalyticsReportData](docs/AnalyticsReportData.md)
 - [AnalyticsReportsAccount](docs/AnalyticsReportsAccount.md)
 - [AnnualIncome](docs/AnnualIncome.md)
 - [AppFinancialInstitutionStatus](docs/AppFinancialInstitutionStatus.md)
 - [AppStatus](docs/AppStatus.md)
 - [AppStatuses](docs/AppStatuses.md)
 - [Application](docs/Application.md)
 - [Asset](docs/Asset.md)
 - [AvailableBalance](docs/AvailableBalance.md)
 - [BalanceAnalyticsAccountResult](docs/BalanceAnalyticsAccountResult.md)
 - [BalanceAnalyticsBusinessSummary](docs/BalanceAnalyticsBusinessSummary.md)
 - [BalanceAnalyticsMetrics](docs/BalanceAnalyticsMetrics.md)
 - [BalanceAnalyticsReport](docs/BalanceAnalyticsReport.md)
 - [BalanceAndCashFlowAnalyticsReportConstraints](docs/BalanceAndCashFlowAnalyticsReportConstraints.md)
 - [BaseReportAck](docs/BaseReportAck.md)
 - [BaseReportAckWithPortfolioId](docs/BaseReportAckWithPortfolioId.md)
 - [BaseReportAckWithPortfolioIdAllOf](docs/BaseReportAckWithPortfolioIdAllOf.md)
 - [Birthday](docs/Birthday.md)
 - [Borrower](docs/Borrower.md)
 - [Branding](docs/Branding.md)
 - [BrandingWrapper](docs/BrandingWrapper.md)
 - [Business](docs/Business.md)
 - [BusinessAllOf](docs/BusinessAllOf.md)
 - [BusinessDetails](docs/BusinessDetails.md)
 - [BusinessDetailsAllOf](docs/BusinessDetailsAllOf.md)
 - [CadenceDetails](docs/CadenceDetails.md)
 - [CashFlowActivityDepositsCredits](docs/CashFlowActivityDepositsCredits.md)
 - [CashFlowActivityWithdrawalsDebits](docs/CashFlowActivityWithdrawalsDebits.md)
 - [CashFlowAnalyticsAccountResult](docs/CashFlowAnalyticsAccountResult.md)
 - [CashFlowAnalyticsBusinessSummary](docs/CashFlowAnalyticsBusinessSummary.md)
 - [CashFlowAnalyticsMetrics](docs/CashFlowAnalyticsMetrics.md)
 - [CashFlowAnalyticsReport](docs/CashFlowAnalyticsReport.md)
 - [CashFlowCashFlowBalance](docs/CashFlowCashFlowBalance.md)
 - [CashFlowCashFlowBalanceSummary](docs/CashFlowCashFlowBalanceSummary.md)
 - [CashFlowCashFlowCharacteristic](docs/CashFlowCashFlowCharacteristic.md)
 - [CashFlowCashFlowCharacteristicsSummary](docs/CashFlowCashFlowCharacteristicsSummary.md)
 - [CashFlowCashFlowCredit](docs/CashFlowCashFlowCredit.md)
 - [CashFlowCashFlowCreditSummary](docs/CashFlowCashFlowCreditSummary.md)
 - [CashFlowCashFlowDebit](docs/CashFlowCashFlowDebit.md)
 - [CashFlowCashFlowDebitSummary](docs/CashFlowCashFlowDebitSummary.md)
 - [CashFlowInflowAttributes](docs/CashFlowInflowAttributes.md)
 - [CashFlowInsufficientFundsFees](docs/CashFlowInsufficientFundsFees.md)
 - [CashFlowMonthlyCashFlowBalanceSummaries](docs/CashFlowMonthlyCashFlowBalanceSummaries.md)
 - [CashFlowMonthlyCashFlowBalances](docs/CashFlowMonthlyCashFlowBalances.md)
 - [CashFlowMonthlyCashFlowCharacteristics](docs/CashFlowMonthlyCashFlowCharacteristics.md)
 - [CashFlowMonthlyCashFlowCharacteristicsSummaries](docs/CashFlowMonthlyCashFlowCharacteristicsSummaries.md)
 - [CashFlowMonthlyCashFlowCreditSummaries](docs/CashFlowMonthlyCashFlowCreditSummaries.md)
 - [CashFlowMonthlyCashFlowCredits](docs/CashFlowMonthlyCashFlowCredits.md)
 - [CashFlowMonthlyCashFlowDebitSummaries](docs/CashFlowMonthlyCashFlowDebitSummaries.md)
 - [CashFlowMonthlycashflowDebits](docs/CashFlowMonthlycashflowDebits.md)
 - [CashFlowNegativeTriggers](docs/CashFlowNegativeTriggers.md)
 - [CashFlowNumWeeksZeros](docs/CashFlowNumWeeksZeros.md)
 - [CashFlowOutflowAttributes](docs/CashFlowOutflowAttributes.md)
 - [CashFlowPossibleLoanDeposits](docs/CashFlowPossibleLoanDeposits.md)
 - [CashFlowPossibleLoanDepositsAccount](docs/CashFlowPossibleLoanDepositsAccount.md)
 - [CashFlowPossibleLoanDepositsInstitutions](docs/CashFlowPossibleLoanDepositsInstitutions.md)
 - [CashFlowReport](docs/CashFlowReport.md)
 - [CashFlowReportAccount](docs/CashFlowReportAccount.md)
 - [CashFlowReportAck](docs/CashFlowReportAck.md)
 - [CashFlowReportAckAllOf](docs/CashFlowReportAckAllOf.md)
 - [CashFlowReportAllOf](docs/CashFlowReportAllOf.md)
 - [CashFlowReportConstraints](docs/CashFlowReportConstraints.md)
 - [CashFlowReportConstraintsOut](docs/CashFlowReportConstraintsOut.md)
 - [CashFlowTransactionAnalyticsAttributes](docs/CashFlowTransactionAnalyticsAttributes.md)
 - [CashFlowTransactionAnalyticsAttributesLastTransactionDateInner](docs/CashFlowTransactionAnalyticsAttributesLastTransactionDateInner.md)
 - [Categorization](docs/Categorization.md)
 - [CertifiedInstitution](docs/CertifiedInstitution.md)
 - [CertifiedInstitutions](docs/CertifiedInstitutions.md)
 - [ChildInstitution](docs/ChildInstitution.md)
 - [ConnectEmailParameters](docs/ConnectEmailParameters.md)
 - [ConnectEmailUrl](docs/ConnectEmailUrl.md)
 - [ConnectJointBorrowerEmailParameters](docs/ConnectJointBorrowerEmailParameters.md)
 - [ConnectJointBorrowerParameters](docs/ConnectJointBorrowerParameters.md)
 - [ConnectParameters](docs/ConnectParameters.md)
 - [ConnectUrl](docs/ConnectUrl.md)
 - [Consumer](docs/Consumer.md)
 - [ConsumerInfo](docs/ConsumerInfo.md)
 - [ConsumerUpdate](docs/ConsumerUpdate.md)
 - [CreatedConsumer](docs/CreatedConsumer.md)
 - [CreatedCustomer](docs/CreatedCustomer.md)
 - [CreatedTestTxPushTransaction](docs/CreatedTestTxPushTransaction.md)
 - [Customer](docs/Customer.md)
 - [CustomerAccount](docs/CustomerAccount.md)
 - [CustomerAccountDetail](docs/CustomerAccountDetail.md)
 - [CustomerAccountMultipleStatement](docs/CustomerAccountMultipleStatement.md)
 - [CustomerAccountMultipleStatements](docs/CustomerAccountMultipleStatements.md)
 - [CustomerAccountPosition](docs/CustomerAccountPosition.md)
 - [CustomerAccountSimple](docs/CustomerAccountSimple.md)
 - [CustomerAccounts](docs/CustomerAccounts.md)
 - [CustomerAccountsSimple](docs/CustomerAccountsSimple.md)
 - [CustomerAnalytics](docs/CustomerAnalytics.md)
 - [CustomerAuthorizationDetails](docs/CustomerAuthorizationDetails.md)
 - [CustomerUpdate](docs/CustomerUpdate.md)
 - [CustomerWithAppData](docs/CustomerWithAppData.md)
 - [CustomerWithAppDataAllOf](docs/CustomerWithAppDataAllOf.md)
 - [Customers](docs/Customers.md)
 - [Deduction](docs/Deduction.md)
 - [Deductions](docs/Deductions.md)
 - [DirectDeposit](docs/DirectDeposit.md)
 - [DirectDeposits](docs/DirectDeposits.md)
 - [DirectPayStatements](docs/DirectPayStatements.md)
 - [Earnings](docs/Earnings.md)
 - [EmailOptions](docs/EmailOptions.md)
 - [Employee](docs/Employee.md)
 - [Employer](docs/Employer.md)
 - [FixConnectParameters](docs/FixConnectParameters.md)
 - [InitiatedMicroDeposit](docs/InitiatedMicroDeposit.md)
 - [Institution](docs/Institution.md)
 - [InstitutionAddress](docs/InstitutionAddress.md)
 - [InstitutionWrapper](docs/InstitutionWrapper.md)
 - [Institutions](docs/Institutions.md)
 - [InsufficientFundsTransaction](docs/InsufficientFundsTransaction.md)
 - [LiteConnectParameters](docs/LiteConnectParameters.md)
 - [LoanPaymentDetails](docs/LoanPaymentDetails.md)
 - [LoanPaymentDetailsAccount](docs/LoanPaymentDetailsAccount.md)
 - [LoanPaymentDetailsGroup](docs/LoanPaymentDetailsGroup.md)
 - [LoanPaymentDetailsLoan](docs/LoanPaymentDetailsLoan.md)
 - [MainPayStatementFields](docs/MainPayStatementFields.md)
 - [MicroDepositDetails](docs/MicroDepositDetails.md)
 - [MicroDepositInitiation](docs/MicroDepositInitiation.md)
 - [MicroDepositVerification](docs/MicroDepositVerification.md)
 - [MicroEntryVerifyRequestParameter](docs/MicroEntryVerifyRequestParameter.md)
 - [MonthlyIncome](docs/MonthlyIncome.md)
 - [NetMonthly](docs/NetMonthly.md)
 - [NewAddress](docs/NewAddress.md)
 - [NewBusiness](docs/NewBusiness.md)
 - [NewConsumer](docs/NewConsumer.md)
 - [NewCustomer](docs/NewCustomer.md)
 - [ObbAccountDetails](docs/ObbAccountDetails.md)
 - [ObbAccountOwner](docs/ObbAccountOwner.md)
 - [ObbAnalyticsReport](docs/ObbAnalyticsReport.md)
 - [ObbAnalyticsReportAck](docs/ObbAnalyticsReportAck.md)
 - [ObbAverageWeeklyBalance](docs/ObbAverageWeeklyBalance.md)
 - [ObbCurrentReportRequestDetails](docs/ObbCurrentReportRequestDetails.md)
 - [ObbDailyBalance](docs/ObbDailyBalance.md)
 - [ObbDataAvailability](docs/ObbDataAvailability.md)
 - [ObbDateRangeAndAmount](docs/ObbDateRangeAndAmount.md)
 - [ObbDateRangeAndCount](docs/ObbDateRangeAndCount.md)
 - [ObbInstitution](docs/ObbInstitution.md)
 - [ObbNumWeeksAverageBalanceIncreasing](docs/ObbNumWeeksAverageBalanceIncreasing.md)
 - [ObbReportHeader](docs/ObbReportHeader.md)
 - [ObbWeekOfYear](docs/ObbWeekOfYear.md)
 - [PartnerCredentials](docs/PartnerCredentials.md)
 - [PartnerCredentialsWithNewSecret](docs/PartnerCredentialsWithNewSecret.md)
 - [PartnerCredentialsWithNewSecretAllOf](docs/PartnerCredentialsWithNewSecretAllOf.md)
 - [PayStat](docs/PayStat.md)
 - [PayStatement](docs/PayStatement.md)
 - [PayStatementData](docs/PayStatementData.md)
 - [PayStatementForVoie](docs/PayStatementForVoie.md)
 - [PayStatementReport](docs/PayStatementReport.md)
 - [PayStatementReportAck](docs/PayStatementReportAck.md)
 - [PayStatementReportAckAllOf](docs/PayStatementReportAckAllOf.md)
 - [PayStatementReportAllOf](docs/PayStatementReportAllOf.md)
 - [PayStatementReportConstraints](docs/PayStatementReportConstraints.md)
 - [PaymentHistoryAccountSummary](docs/PaymentHistoryAccountSummary.md)
 - [PaymentHistoryAccountSummaryAccountOwner](docs/PaymentHistoryAccountSummaryAccountOwner.md)
 - [PaymentHistoryAnalytics](docs/PaymentHistoryAnalytics.md)
 - [PaymentHistoryCustomerMonthlySummary](docs/PaymentHistoryCustomerMonthlySummary.md)
 - [PaymentHistoryReport](docs/PaymentHistoryReport.md)
 - [PaymentHistoryTransactionsSummary](docs/PaymentHistoryTransactionsSummary.md)
 - [PayrollData](docs/PayrollData.md)
 - [PayrollDataOut](docs/PayrollDataOut.md)
 - [PayrollEmployeeAddress](docs/PayrollEmployeeAddress.md)
 - [PayrollEmployeeRecord](docs/PayrollEmployeeRecord.md)
 - [PayrollEmployerAddress](docs/PayrollEmployerAddress.md)
 - [PayrollEmploymentHistoryVOE](docs/PayrollEmploymentHistoryVOE.md)
 - [PayrollEmploymentHistoryVOIE](docs/PayrollEmploymentHistoryVOIE.md)
 - [PayrollEmploymentRecord](docs/PayrollEmploymentRecord.md)
 - [PayrollReportAck](docs/PayrollReportAck.md)
 - [PayrollReportAckAllOf](docs/PayrollReportAckAllOf.md)
 - [PayrollReportConstraints](docs/PayrollReportConstraints.md)
 - [PayrollReportConstraintsOut](docs/PayrollReportConstraintsOut.md)
 - [PayrollVOEIncomeRecord](docs/PayrollVOEIncomeRecord.md)
 - [PayrollVOIEIncomeRecord](docs/PayrollVOIEIncomeRecord.md)
 - [PaystubMonthlyIncomeRecord](docs/PaystubMonthlyIncomeRecord.md)
 - [PaystubTxVerifyMonthlyIncomeRecord](docs/PaystubTxVerifyMonthlyIncomeRecord.md)
 - [PhoneNumberFormat](docs/PhoneNumberFormat.md)
 - [PortfolioConsumer](docs/PortfolioConsumer.md)
 - [PortfolioReport](docs/PortfolioReport.md)
 - [PortfolioSummary](docs/PortfolioSummary.md)
 - [PortfolioWithConsumerSummary](docs/PortfolioWithConsumerSummary.md)
 - [PortfolioWithConsumerSummaryAllOf](docs/PortfolioWithConsumerSummaryAllOf.md)
 - [PrequalificationReport](docs/PrequalificationReport.md)
 - [PrequalificationReportAccount](docs/PrequalificationReportAccount.md)
 - [PrequalificationReportAck](docs/PrequalificationReportAck.md)
 - [PrequalificationReportAckAllOf](docs/PrequalificationReportAckAllOf.md)
 - [PrequalificationReportAllOf](docs/PrequalificationReportAllOf.md)
 - [PrequalificationReportAssetSummary](docs/PrequalificationReportAssetSummary.md)
 - [PrequalificationReportConstraints](docs/PrequalificationReportConstraints.md)
 - [PrequalificationReportConstraintsOut](docs/PrequalificationReportConstraintsOut.md)
 - [Receiver](docs/Receiver.md)
 - [RegisteredApplication](docs/RegisteredApplication.md)
 - [Report](docs/Report.md)
 - [ReportAccountPosition](docs/ReportAccountPosition.md)
 - [ReportCustomField](docs/ReportCustomField.md)
 - [ReportIncomeEstimate](docs/ReportIncomeEstimate.md)
 - [ReportIncomeStreamSummary](docs/ReportIncomeStreamSummary.md)
 - [ReportInstitution](docs/ReportInstitution.md)
 - [ReportInstitutionAccount](docs/ReportInstitutionAccount.md)
 - [ReportSummaries](docs/ReportSummaries.md)
 - [ReportSummary](docs/ReportSummary.md)
 - [ReportTransaction](docs/ReportTransaction.md)
 - [ReportTransactionBase1](docs/ReportTransactionBase1.md)
 - [ReportTransactionBase2](docs/ReportTransactionBase2.md)
 - [ReportTransactionNewTxBased](docs/ReportTransactionNewTxBased.md)
 - [ReportTransactionNewTxBasedAllOf](docs/ReportTransactionNewTxBasedAllOf.md)
 - [StateAttribute](docs/StateAttribute.md)
 - [StatePeriod](docs/StatePeriod.md)
 - [StateTimeInterval](docs/StateTimeInterval.md)
 - [StatementData](docs/StatementData.md)
 - [StatementReport](docs/StatementReport.md)
 - [StatementReportAck](docs/StatementReportAck.md)
 - [StatementReportAckAllOf](docs/StatementReportAckAllOf.md)
 - [StatementReportAllOf](docs/StatementReportAllOf.md)
 - [StatementReportConstraints](docs/StatementReportConstraints.md)
 - [StreamModel](docs/StreamModel.md)
 - [SubscriptionRecord](docs/SubscriptionRecord.md)
 - [TestTxPushTransaction](docs/TestTxPushTransaction.md)
 - [ThirdPartyAccessKeyData](docs/ThirdPartyAccessKeyData.md)
 - [ThirdPartyAccessKeyReceiptData](docs/ThirdPartyAccessKeyReceiptData.md)
 - [ThirdPartyAccessPeriod](docs/ThirdPartyAccessPeriod.md)
 - [ThirdPartyAccessProduct](docs/ThirdPartyAccessProduct.md)
 - [ThirdPartyAccessProof](docs/ThirdPartyAccessProof.md)
 - [ThirdPartyAccessProvenance](docs/ThirdPartyAccessProvenance.md)
 - [ThirdPartyAccessReceipt](docs/ThirdPartyAccessReceipt.md)
 - [ThirdPartyAccessReceiptData](docs/ThirdPartyAccessReceiptData.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionalAttribute](docs/TransactionalAttribute.md)
 - [TransactionalPeriod](docs/TransactionalPeriod.md)
 - [TransactionalTimeInterval](docs/TransactionalTimeInterval.md)
 - [Transactions](docs/Transactions.md)
 - [TransactionsReport](docs/TransactionsReport.md)
 - [TransactionsReportAccount](docs/TransactionsReportAccount.md)
 - [TransactionsReportAck](docs/TransactionsReportAck.md)
 - [TransactionsReportAckAllOf](docs/TransactionsReportAckAllOf.md)
 - [TransactionsReportAllOf](docs/TransactionsReportAllOf.md)
 - [TransactionsReportConstraints](docs/TransactionsReportConstraints.md)
 - [TransactionsReportConstraintsOut](docs/TransactionsReportConstraintsOut.md)
 - [TxPushSubscriptionParameters](docs/TxPushSubscriptionParameters.md)
 - [TxPushSubscriptions](docs/TxPushSubscriptions.md)
 - [TxVerifyInterview](docs/TxVerifyInterview.md)
 - [VOAIReportIncomeStream](docs/VOAIReportIncomeStream.md)
 - [VOAReport](docs/VOAReport.md)
 - [VOAReportAccount](docs/VOAReportAccount.md)
 - [VOAReportAck](docs/VOAReportAck.md)
 - [VOAReportAckAllOf](docs/VOAReportAckAllOf.md)
 - [VOAReportAllOf](docs/VOAReportAllOf.md)
 - [VOAReportConstraints](docs/VOAReportConstraints.md)
 - [VOAReportConstraintsOut](docs/VOAReportConstraintsOut.md)
 - [VOAWithIncomeReport](docs/VOAWithIncomeReport.md)
 - [VOAWithIncomeReportAccount](docs/VOAWithIncomeReportAccount.md)
 - [VOAWithIncomeReportAccountAllOf](docs/VOAWithIncomeReportAccountAllOf.md)
 - [VOAWithIncomeReportAck](docs/VOAWithIncomeReportAck.md)
 - [VOAWithIncomeReportAckAllOf](docs/VOAWithIncomeReportAckAllOf.md)
 - [VOAWithIncomeReportAllOf](docs/VOAWithIncomeReportAllOf.md)
 - [VOAWithIncomeReportConstraints](docs/VOAWithIncomeReportConstraints.md)
 - [VOAWithIncomeReportConstraintsOut](docs/VOAWithIncomeReportConstraintsOut.md)
 - [VOEPayrollReport](docs/VOEPayrollReport.md)
 - [VOEPayrollReportAllOf](docs/VOEPayrollReportAllOf.md)
 - [VOETransactionsReport](docs/VOETransactionsReport.md)
 - [VOETransactionsReportAccount](docs/VOETransactionsReportAccount.md)
 - [VOETransactionsReportAck](docs/VOETransactionsReportAck.md)
 - [VOETransactionsReportAckAllOf](docs/VOETransactionsReportAckAllOf.md)
 - [VOETransactionsReportAllOf](docs/VOETransactionsReportAllOf.md)
 - [VOETransactionsReportConstraints](docs/VOETransactionsReportConstraints.md)
 - [VOETransactionsReportConstraintsOut](docs/VOETransactionsReportConstraintsOut.md)
 - [VOETransactionsReportIncomeStream](docs/VOETransactionsReportIncomeStream.md)
 - [VOIEPayStatement](docs/VOIEPayStatement.md)
 - [VOIEPayrollReport](docs/VOIEPayrollReport.md)
 - [VOIEPayrollReportAllOf](docs/VOIEPayrollReportAllOf.md)
 - [VOIEPaystubPayStatement](docs/VOIEPaystubPayStatement.md)
 - [VOIEPaystubPayStatementAllOf](docs/VOIEPaystubPayStatementAllOf.md)
 - [VOIEPaystubReport](docs/VOIEPaystubReport.md)
 - [VOIEPaystubReportAck](docs/VOIEPaystubReportAck.md)
 - [VOIEPaystubReportAckAllOf](docs/VOIEPaystubReportAckAllOf.md)
 - [VOIEPaystubReportAllOf](docs/VOIEPaystubReportAllOf.md)
 - [VOIEPaystubWithStatementPayStatement](docs/VOIEPaystubWithStatementPayStatement.md)
 - [VOIEPaystubWithStatementPayStatementAllOf](docs/VOIEPaystubWithStatementPayStatementAllOf.md)
 - [VOIEPaystubWithTXVerifyReport](docs/VOIEPaystubWithTXVerifyReport.md)
 - [VOIEPaystubWithTXVerifyReportAck](docs/VOIEPaystubWithTXVerifyReportAck.md)
 - [VOIEPaystubWithTXVerifyReportAckAllOf](docs/VOIEPaystubWithTXVerifyReportAckAllOf.md)
 - [VOIEPaystubWithTXVerifyReportAllOf](docs/VOIEPaystubWithTXVerifyReportAllOf.md)
 - [VOIEReportConstraints](docs/VOIEReportConstraints.md)
 - [VOIETXVerifyReportAccount](docs/VOIETXVerifyReportAccount.md)
 - [VOIETXVerifyReportIncomeStream](docs/VOIETXVerifyReportIncomeStream.md)
 - [VOIEWithInterviewData](docs/VOIEWithInterviewData.md)
 - [VOIEWithStatementData](docs/VOIEWithStatementData.md)
 - [VOIEWithTXVerifyReportConstraints](docs/VOIEWithTXVerifyReportConstraints.md)
 - [VOIEWithTXVerifyReportConstraintsOut](docs/VOIEWithTXVerifyReportConstraintsOut.md)
 - [VOIReport](docs/VOIReport.md)
 - [VOIReportAccount](docs/VOIReportAccount.md)
 - [VOIReportAck](docs/VOIReportAck.md)
 - [VOIReportAckAllOf](docs/VOIReportAckAllOf.md)
 - [VOIReportAllOf](docs/VOIReportAllOf.md)
 - [VOIReportConstraints](docs/VOIReportConstraints.md)
 - [VOIReportConstraintsOut](docs/VOIReportConstraintsOut.md)
 - [VOIReportIncomeStream](docs/VOIReportIncomeStream.md)
 - [VerifiedMicroDeposit](docs/VerifiedMicroDeposit.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
