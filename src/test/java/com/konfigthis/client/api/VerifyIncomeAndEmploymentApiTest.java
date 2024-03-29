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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.PayStatementData;
import com.konfigthis.client.model.PayStatementReportAck;
import com.konfigthis.client.model.PayStatementReportConstraints;
import com.konfigthis.client.model.PayrollData;
import com.konfigthis.client.model.PayrollReportAck;
import com.konfigthis.client.model.PayrollReportConstraints;
import com.konfigthis.client.model.ReportCustomField;
import com.konfigthis.client.model.VOETransactionsReportAck;
import com.konfigthis.client.model.VOETransactionsReportConstraints;
import com.konfigthis.client.model.VOIEPaystubReportAck;
import com.konfigthis.client.model.VOIEPaystubWithTXVerifyReportAck;
import com.konfigthis.client.model.VOIEReportConstraints;
import com.konfigthis.client.model.VOIEWithInterviewData;
import com.konfigthis.client.model.VOIEWithStatementData;
import com.konfigthis.client.model.VOIEWithTXVerifyReportConstraints;
import com.konfigthis.client.model.VOIReportAck;
import com.konfigthis.client.model.VOIReportConstraints;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VerifyIncomeAndEmploymentApi
 */
@Disabled
public class VerifyIncomeAndEmploymentApiTest {

    private static VerifyIncomeAndEmploymentApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new VerifyIncomeAndEmploymentApi(apiClient);
    }

    /**
     * Generate VOI Report
     *
     * Generate a Verification of Income (VOI) report for all checking, savings, and money market accounts for the given customer. This service retrieves up to two years of transaction history for each account and uses this information to generate the VOI report.  This is a premium service. The billing rate is the variable rate for Verification of Income under the current subscription plan. The billable event is the successful generation of a VOI report.  If no account of type checking, savings, or money market is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createVOIReportTest() throws ApiException {
        String customerId = null;
        String accountIds = null;
        List<ReportCustomField> reportCustomFields = null;
        Long fromDate = null;
        Integer incomeStreamConfidenceMinimum = null;
        String callbackUrl = null;
        VOIReportAck response = api.createVOIReport(customerId)
                .accountIds(accountIds)
                .reportCustomFields(reportCustomFields)
                .fromDate(fromDate)
                .incomeStreamConfidenceMinimum(incomeStreamConfidenceMinimum)
                .callbackUrl(callbackUrl)
                .execute();
        // TODO: test validations
    }

    /**
     * Generate Pay Statement Report
     *
     * Generate Pay Statement Extraction Report for the given customer. This service accepts asset IDs of the stored pay statements to generate a Pay Statement Extraction Report.  This is a premium service. The billing rate is the variable rate for Pay Statement Extraction Report under the current subscription plan. The billable event is the successful generation of a Pay Statement Extraction Report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generatePayStatementReportTest() throws ApiException {
        PayStatementData paystatementReport = null;
        String customerId = null;
        List<ReportCustomField> reportCustomFields = null;
        String callbackUrl = null;
        PayStatementReportAck response = api.generatePayStatementReport(paystatementReport, customerId)
                .reportCustomFields(reportCustomFields)
                .callbackUrl(callbackUrl)
                .execute();
        // TODO: test validations
    }

    /**
     * Generate VOE - Transactions Report
     *
     * Premium Service: A billable event when the API response is successful.  MVS-Direct integration developers only.  Used as a complimentary report to the VOA with Income and VOIE - Paystub (with TXVerify) reports and used to fulfill the pre-close VOE requirements.  Retrieve the latest credit transaction information from the borrower&#39;s connected bank accounts and groups them into income streams so that you can view their payment history to ensure a direct deport was made within the expected cadence. The report displays transaction descriptions without any dollar amounts so that income re-verification isn&#39;t necessary.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateVOETransactionsReportTest() throws ApiException {
        String customerId = null;
        String reportId = null;
        String accountIds = null;
        List<ReportCustomField> reportCustomFields = null;
        Long fromDate = null;
        Integer incomeStreamConfidenceMinimum = null;
        String callbackUrl = null;
        VOETransactionsReportAck response = api.generateVOETransactionsReport(customerId)
                .reportId(reportId)
                .accountIds(accountIds)
                .reportCustomFields(reportCustomFields)
                .fromDate(fromDate)
                .incomeStreamConfidenceMinimum(incomeStreamConfidenceMinimum)
                .callbackUrl(callbackUrl)
                .execute();
        // TODO: test validations
    }

    /**
     * Generate VOIE - Paystub (with TXVerify) Report
     *
     * Generate a VOIE - Paystub (with TXVerify) report for all checking and savings under the given customer. This service retrieves up to two years of transaction history for the given accounts. It then uses this information as well as the provided paystub(s), which are passed into the request body as asset IDs (generated using the Store Customer Pay Statement API) to generate the VOIE - Paystub (with TXVerify) report.  Note: if you are using this API to refresh the bank transactions, use the same asset ID from the first report. A new paystub is not required unless the paystub is too old for underwriting requirements. Using the same asset ID that was on the original report and the previously extracted details will be used to speed up report generation response time.  This is a premium service. The billing rate is the variable rate for VOIE TXVerify under the current subscription plan. The billable event is the successful generation of a VOIE TXVerify Report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateVOIEPaystubWithTxVerifyReportTest() throws ApiException {
        VOIEWithInterviewData voieWithInterviewData = null;
        String customerId = null;
        String accountIds = null;
        List<ReportCustomField> reportCustomFields = null;
        Long fromDate = null;
        Integer incomeStreamConfidenceMinimum = null;
        String callbackUrl = null;
        VOIEPaystubWithTXVerifyReportAck response = api.generateVOIEPaystubWithTxVerifyReport(voieWithInterviewData, customerId)
                .accountIds(accountIds)
                .reportCustomFields(reportCustomFields)
                .fromDate(fromDate)
                .incomeStreamConfidenceMinimum(incomeStreamConfidenceMinimum)
                .callbackUrl(callbackUrl)
                .execute();
        // TODO: test validations
    }

    /**
     * Generate VOE - Payroll Report
     *
     * Generate or refresh a VOE - Payroll report. Often used as a complementary report to the VOIE-Payroll report to fulfill the pre-close VOE requirements. It retrieves the customer&#39;s employment details and employment status through the payroll source without any income information.  This is a premium service. The billable event is the successful generation of a VOE - Payroll report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateVoePayrollReportTest() throws ApiException {
        PayrollData payrollData = null;
        String customerId = null;
        List<ReportCustomField> reportCustomFields = null;
        Long payStatementsFromDate = null;
        String marketSegment = null;
        Boolean excludeEmpInfo = null;
        String purpose = null;
        String callbackUrl = null;
        PayrollReportAck response = api.generateVoePayrollReport(payrollData, customerId)
                .reportCustomFields(reportCustomFields)
                .payStatementsFromDate(payStatementsFromDate)
                .marketSegment(marketSegment)
                .excludeEmpInfo(excludeEmpInfo)
                .purpose(purpose)
                .callbackUrl(callbackUrl)
                .execute();
        // TODO: test validations
    }

    /**
     * Generate VOIE - Paystub Report
     *
     * Generate a VOIE - Paystub report. This service uses the provided paystub(s), which are passed into the request body as asset IDs (generated using the Store Customer Pay Statement API) to generate the VOIE - Paystub report with digitized paystub details.  This is a premium service. The billing rate is the variable rate for VOIE - Paystub under the current subscription plan. The billable event is the successful generation of a VOIE - Paystub Report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateVoiePaystubReportTest() throws ApiException {
        VOIEWithStatementData voieWithStatementData = null;
        String customerId = null;
        List<ReportCustomField> reportCustomFields = null;
        String callbackUrl = null;
        VOIEPaystubReportAck response = api.generateVoiePaystubReport(voieWithStatementData, customerId)
                .reportCustomFields(reportCustomFields)
                .callbackUrl(callbackUrl)
                .execute();
        // TODO: test validations
    }

    /**
     * Generate VOIE - Payroll Report
     *
     * Generate or refresh a VOIE - Payroll report. For clients using the product via a consumer permissioning experience via Connect, the original VOIE - Payroll report generates when the consumer completes the Connect experience, and this API is only used for future report refreshes without reengaging the consumer.  This is a premium service. The billable event is the successful generation of a VOIE - Payroll report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void refreshVOIEPayrollReportTest() throws ApiException {
        PayrollData payrollData = null;
        String customerId = null;
        List<ReportCustomField> reportCustomFields = null;
        Long payStatementsFromDate = null;
        String marketSegment = null;
        Boolean excludeEmpInfo = null;
        String purpose = null;
        String callbackUrl = null;
        PayrollReportAck response = api.refreshVOIEPayrollReport(payrollData, customerId)
                .reportCustomFields(reportCustomFields)
                .payStatementsFromDate(payStatementsFromDate)
                .marketSegment(marketSegment)
                .excludeEmpInfo(excludeEmpInfo)
                .purpose(purpose)
                .callbackUrl(callbackUrl)
                .execute();
        // TODO: test validations
    }

}
