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
import com.konfigthis.client.model.Report;
import com.konfigthis.client.model.ReportSummaries;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportsApi
 */
@Disabled
public class ReportsApiTest {

    private static ReportsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ReportsApi(apiClient);
    }

    /**
     * Get Reports by Consumer ID
     *
     * Get all reports that have been generated by previous calls to Generate Report services for the given consumer.  The &#x60;status&#x60; fields in the returned list contain \&quot;inProgress\&quot;, \&quot;failure\&quot;, or \&quot;success\&quot;. If the status shows \&quot;inProgress\&quot;, the client app should wait 20 seconds and then call this API again.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void byConsumerIdTest() throws ApiException {
        String consumerId = null;
        String purpose = null;
        ReportSummaries response = api.byConsumerId(consumerId)
                .purpose(purpose)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Reports by Customer ID
     *
     * Get all reports that have been generated by previous calls to Generate Report services for the given customer.  The &#x60;status&#x60; fields in the returned list contain \&quot;inProgress\&quot;, \&quot;failure\&quot;, or \&quot;success\&quot;. If the status shows \&quot;inProgress\&quot;, the client app should wait 20 seconds and then call this API again.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void byCustomerIdTest() throws ApiException {
        String customerId = null;
        String purpose = null;
        ReportSummaries response = api.byCustomerId(customerId)
                .purpose(purpose)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Report by Consumer and ID
     *
     * Get a report that has been generated by a previous call to one of the Generate Report services.  The report&#39;s &#x60;status&#x60; field contains \&quot;inProgress\&quot;, \&quot;failure\&quot;, or \&quot;success\&quot;. If the status shows \&quot;inProgress\&quot;, the client app should wait 20 seconds and then call this API again.  Report data can either be retrieved as a JSON document or a PDF file.  To specify the format required, set the _Accept request header_ to either **application/json** or **application/pdf**. If neither is set, the report format will be returned as a JSON document.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByConsumerAndIdTest() throws ApiException {
        String consumerId = null;
        String reportId = null;
        String purpose = null;
        String onBehalfOf = null;
        Report response = api.getByConsumerAndId(consumerId, reportId)
                .purpose(purpose)
                .onBehalfOf(onBehalfOf)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Report by Customer and ID
     *
     * Get a report that has been generated by a previous call to one of the Generate Report services.  The report&#39;s &#x60;status&#x60; field contains \&quot;inProgress\&quot;, \&quot;failure\&quot;, or \&quot;success\&quot;. If the status shows \&quot;inProgress\&quot;, the client app should wait 20 seconds and then call this API again.  Report data can either be retrieved as a JSON document or a PDF file.  To specify the format required, set the _Accept request header_ to either **application/json** or **application/pdf**. If neither is set, the report format will be returned as a JSON document.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatusTest() throws ApiException {
        String customerId = null;
        String reportId = null;
        String onBehalfOf = null;
        String purpose = null;
        Report response = api.getStatus(customerId, reportId)
                .onBehalfOf(onBehalfOf)
                .purpose(purpose)
                .execute();
        // TODO: test validations
    }

}
