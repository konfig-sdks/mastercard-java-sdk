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
import com.konfigthis.client.model.AppStatuses;
import com.konfigthis.client.model.Application;
import com.konfigthis.client.model.CustomerAccounts;
import com.konfigthis.client.model.RegisteredApplication;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppRegistrationApi
 */
@Disabled
public class AppRegistrationApiTest {

    private static AppRegistrationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AppRegistrationApi(apiClient);
    }

    /**
     * Set Customer App ID
     *
     * If you have multiple applications for a single client, and you want to register their applications to access financial institutions using OAuth connections, then use this API to assign applications to an existing customer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignApplicationsTest() throws ApiException {
        String customerId = null;
        String applicationId = null;
        api.assignApplications(customerId, applicationId)
                .execute();
        // TODO: test validations
    }

    /**
     * Register App
     *
     * Register a new application to access financial institutions using OAuth connections.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewApplicationTest() throws ApiException {
        String appDescription = null;
        String appName = null;
        String appUrl = null;
        String ownerAddressLine1 = null;
        String ownerAddressLine2 = null;
        String ownerCity = null;
        String ownerCountry = null;
        String ownerName = null;
        String ownerPostalCode = null;
        String ownerState = null;
        String image = null;
        RegisteredApplication response = api.createNewApplication(appDescription, appName, appUrl, ownerAddressLine1, ownerAddressLine2, ownerCity, ownerCountry, ownerName, ownerPostalCode, ownerState, image)
                .execute();
        // TODO: test validations
    }

    /**
     * Get App Registration Status
     *
     * Get the status of your application registration(s).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getApplicationStatusTest() throws ApiException {
        String preAppId = null;
        String applicationId = null;
        String status = null;
        String appName = null;
        Long submittedDate = null;
        Long modifiedDate = null;
        Integer page = null;
        Integer pageSize = null;
        AppStatuses response = api.getApplicationStatus()
                .preAppId(preAppId)
                .applicationId(applicationId)
                .status(status)
                .appName(appName)
                .submittedDate(submittedDate)
                .modifiedDate(modifiedDate)
                .page(page)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Migrate Institution Login Accounts
     *
     * The &#x60;institutionLoginId&#x60; parameter uses Finicity&#39;s internal FI mapping to move accounts from the current FI legacy connection to the new OAuth FI connection.  This API returns a list of accounts for the given institution login ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void migrateInstitutionLoginAccountsTest() throws ApiException {
        String customerId = null;
        String institutionLoginId = null;
        CustomerAccounts response = api.migrateInstitutionLoginAccounts(customerId, institutionLoginId)
                .execute();
        // TODO: test validations
    }

    /**
     * Modify App Registration
     *
     * Update a registered application.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRegistrationTest() throws ApiException {
        String appDescription = null;
        String appName = null;
        String appUrl = null;
        String ownerAddressLine1 = null;
        String ownerAddressLine2 = null;
        String ownerCity = null;
        String ownerCountry = null;
        String ownerName = null;
        String ownerPostalCode = null;
        String ownerState = null;
        String image = null;
        String preAppId = null;
        RegisteredApplication response = api.updateRegistration(appDescription, appName, appUrl, ownerAddressLine1, ownerAddressLine2, ownerCity, ownerCountry, ownerName, ownerPostalCode, ownerState, image, preAppId)
                .execute();
        // TODO: test validations
    }

}
