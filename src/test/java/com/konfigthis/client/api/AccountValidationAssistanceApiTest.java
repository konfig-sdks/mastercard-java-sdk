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
import com.konfigthis.client.model.InitiatedMicroDeposit;
import com.konfigthis.client.model.MicroDepositDetails;
import com.konfigthis.client.model.MicroDepositInitiation;
import com.konfigthis.client.model.MicroDepositVerification;
import com.konfigthis.client.model.Receiver;
import java.net.URI;
import com.konfigthis.client.model.VerifiedMicroDeposit;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountValidationAssistanceApi
 */
@Disabled
public class AccountValidationAssistanceApiTest {

    private static AccountValidationAssistanceApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AccountValidationAssistanceApi(apiClient);
    }

    /**
     * Get Micro Entries Details
     *
     * Fetch the micro entries details. &#x60;customerId&#x60; and &#x60;accountId&#x60; are the identifiers of the customer and account receiving the micro entries.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMicroEntriesDetailsTest() throws ApiException {
        String customerId = null;
        String accountId = null;
        MicroDepositDetails response = api.getMicroEntriesDetails(customerId, accountId)
                .execute();
        // TODO: test validations
    }

    /**
     * Initiate Micro Entries
     *
     * Initiate the micro entries to customer&#39;s account.  Two random micro amounts less than a dollar each will be deposited to provided customer&#39;s account.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void initiateMicroEntriesTest() throws ApiException {
        Receiver receiver = null;
        String customerId = null;
        String institutionLoginId = null;
        URI callbackUrl = null;
        InitiatedMicroDeposit response = api.initiateMicroEntries(receiver, customerId)
                .institutionLoginId(institutionLoginId)
                .callbackUrl(callbackUrl)
                .execute();
        // TODO: test validations
    }

    /**
     * Verify Micro Entries
     *
     * Verify the micro entries as received by customer in customer&#39;s account. Customer needs to verify the micro amounts received in customer&#39;s account. &#x60;customerId&#x60; and &#x60;accountId&#x60; are the identifiers of the customer and account  receiving the micro entries.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void verifyMicroEntriesTest() throws ApiException {
        List<Float> amounts = null;
        String customerId = null;
        String accountId = null;
        VerifiedMicroDeposit response = api.verifyMicroEntries(amounts, customerId, accountId)
                .execute();
        // TODO: test validations
    }

}