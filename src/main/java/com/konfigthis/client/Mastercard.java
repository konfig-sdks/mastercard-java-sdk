package com.konfigthis.client;

import com.konfigthis.client.api.AccountValidationAssistanceApi;
import com.konfigthis.client.api.AccountsApi;
import com.konfigthis.client.api.AccountsSimpleApi;
import com.konfigthis.client.api.AppRegistrationApi;
import com.konfigthis.client.api.AssetsApi;
import com.konfigthis.client.api.AuthenticationApi;
import com.konfigthis.client.api.BalanceAnalyticsApi;
import com.konfigthis.client.api.BankStatementsApi;
import com.konfigthis.client.api.BusinessesApiApi;
import com.konfigthis.client.api.CashFlowApi;
import com.konfigthis.client.api.CashFlowAnalyticsApi;
import com.konfigthis.client.api.ConnectApi;
import com.konfigthis.client.api.ConsumersApi;
import com.konfigthis.client.api.CustomerAuthorizationDetailsApi;
import com.konfigthis.client.api.CustomersApi;
import com.konfigthis.client.api.InstitutionsApi;
import com.konfigthis.client.api.PayStatementsApi;
import com.konfigthis.client.api.PaymentHistoryApi;
import com.konfigthis.client.api.PaymentsApi;
import com.konfigthis.client.api.PortfoliosApi;
import com.konfigthis.client.api.ReportsApi;
import com.konfigthis.client.api.ThirdPartyAccessApi;
import com.konfigthis.client.api.TransactionsApi;
import com.konfigthis.client.api.TxPushApi;
import com.konfigthis.client.api.VerifyAssetsApi;
import com.konfigthis.client.api.VerifyIncomeAndEmploymentApi;

public class Mastercard {
    private ApiClient apiClient;
    public final AccountValidationAssistanceApi accountValidationAssistance;
    public final AccountsApi accounts;
    public final AccountsSimpleApi accountsSimple;
    public final AppRegistrationApi appRegistration;
    public final AssetsApi assets;
    public final AuthenticationApi authentication;
    public final BalanceAnalyticsApi balanceAnalytics;
    public final BankStatementsApi bankStatements;
    public final BusinessesApiApi businessesApi;
    public final CashFlowApi cashFlow;
    public final CashFlowAnalyticsApi cashFlowAnalytics;
    public final ConnectApi connect;
    public final ConsumersApi consumers;
    public final CustomerAuthorizationDetailsApi customerAuthorizationDetails;
    public final CustomersApi customers;
    public final InstitutionsApi institutions;
    public final PayStatementsApi payStatements;
    public final PaymentHistoryApi paymentHistory;
    public final PaymentsApi payments;
    public final PortfoliosApi portfolios;
    public final ReportsApi reports;
    public final ThirdPartyAccessApi thirdPartyAccess;
    public final TransactionsApi transactions;
    public final TxPushApi txPush;
    public final VerifyAssetsApi verifyAssets;
    public final VerifyIncomeAndEmploymentApi verifyIncomeAndEmployment;

    public Mastercard() {
        this(null);
    }

    public Mastercard(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.accountValidationAssistance = new AccountValidationAssistanceApi(this.apiClient);
        this.accounts = new AccountsApi(this.apiClient);
        this.accountsSimple = new AccountsSimpleApi(this.apiClient);
        this.appRegistration = new AppRegistrationApi(this.apiClient);
        this.assets = new AssetsApi(this.apiClient);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.balanceAnalytics = new BalanceAnalyticsApi(this.apiClient);
        this.bankStatements = new BankStatementsApi(this.apiClient);
        this.businessesApi = new BusinessesApiApi(this.apiClient);
        this.cashFlow = new CashFlowApi(this.apiClient);
        this.cashFlowAnalytics = new CashFlowAnalyticsApi(this.apiClient);
        this.connect = new ConnectApi(this.apiClient);
        this.consumers = new ConsumersApi(this.apiClient);
        this.customerAuthorizationDetails = new CustomerAuthorizationDetailsApi(this.apiClient);
        this.customers = new CustomersApi(this.apiClient);
        this.institutions = new InstitutionsApi(this.apiClient);
        this.payStatements = new PayStatementsApi(this.apiClient);
        this.paymentHistory = new PaymentHistoryApi(this.apiClient);
        this.payments = new PaymentsApi(this.apiClient);
        this.portfolios = new PortfoliosApi(this.apiClient);
        this.reports = new ReportsApi(this.apiClient);
        this.thirdPartyAccess = new ThirdPartyAccessApi(this.apiClient);
        this.transactions = new TransactionsApi(this.apiClient);
        this.txPush = new TxPushApi(this.apiClient);
        this.verifyAssets = new VerifyAssetsApi(this.apiClient);
        this.verifyIncomeAndEmployment = new VerifyIncomeAndEmploymentApi(this.apiClient);
    }

}
