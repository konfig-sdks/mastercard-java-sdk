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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.ThirdPartyAccessKeyData;
import com.konfigthis.client.model.ThirdPartyAccessKeyReceiptData;
import com.konfigthis.client.model.ThirdPartyAccessProduct;
import com.konfigthis.client.model.ThirdPartyAccessProvenance;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ThirdPartyAccessApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ThirdPartyAccessApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ThirdPartyAccessApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getFinicityAppKey() == null) {
            throw new IllegalArgumentException("\"Finicity-App-Key\" is required but no API key was provided. Please set \"Finicity-App-Key\" with ApiClient#setFinicityAppKey(String).");
        }
        if (apiClient.getFinicityAppToken() == null) {
            throw new IllegalArgumentException("\"Finicity-App-Token\" is required but no API key was provided. Please set \"Finicity-App-Token\" with ApiClient#setFinicityAppToken(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call generateKeyCall(ThirdPartyAccessKeyData thirdPartyAccessKeyData, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = thirdPartyAccessKeyData;

        // create path and map variables
        String localVarPath = "/aggregation/v1/partners/accessKey";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "FinicityAppKey", "FinicityAppToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call generateKeyValidateBeforeCall(ThirdPartyAccessKeyData thirdPartyAccessKeyData, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'thirdPartyAccessKeyData' is set
        if (thirdPartyAccessKeyData == null) {
            throw new ApiException("Missing the required parameter 'thirdPartyAccessKeyData' when calling generateKey(Async)");
        }

        return generateKeyCall(thirdPartyAccessKeyData, _callback);

    }


    private ApiResponse<ThirdPartyAccessKeyReceiptData> generateKeyWithHttpInfo(ThirdPartyAccessKeyData thirdPartyAccessKeyData) throws ApiException {
        okhttp3.Call localVarCall = generateKeyValidateBeforeCall(thirdPartyAccessKeyData, null);
        Type localVarReturnType = new TypeToken<ThirdPartyAccessKeyReceiptData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call generateKeyAsync(ThirdPartyAccessKeyData thirdPartyAccessKeyData, final ApiCallback<ThirdPartyAccessKeyReceiptData> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateKeyValidateBeforeCall(thirdPartyAccessKeyData, _callback);
        Type localVarReturnType = new TypeToken<ThirdPartyAccessKeyReceiptData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GenerateKeyRequestBuilder {
        private final String customerId;
        private final String partnerId;
        private final String thirdPartyPartnerId;
        private final List<ThirdPartyAccessProduct> products;
        private ThirdPartyAccessProvenance provenance;

        private GenerateKeyRequestBuilder(String customerId, String partnerId, String thirdPartyPartnerId, List<ThirdPartyAccessProduct> products) {
            this.customerId = customerId;
            this.partnerId = partnerId;
            this.thirdPartyPartnerId = thirdPartyPartnerId;
            this.products = products;
        }

        /**
         * Set provenance
         * @param provenance  (optional)
         * @return GenerateKeyRequestBuilder
         */
        public GenerateKeyRequestBuilder provenance(ThirdPartyAccessProvenance provenance) {
            this.provenance = provenance;
            return this;
        }
        
        /**
         * Build call for generateKey
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The third party access key was successfully generated </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            ThirdPartyAccessKeyData thirdPartyAccessKeyData = buildBodyParams();
            return generateKeyCall(thirdPartyAccessKeyData, _callback);
        }

        private ThirdPartyAccessKeyData buildBodyParams() {
            ThirdPartyAccessKeyData thirdPartyAccessKeyData = new ThirdPartyAccessKeyData();
            thirdPartyAccessKeyData.customerId(this.customerId);
            thirdPartyAccessKeyData.partnerId(this.partnerId);
            thirdPartyAccessKeyData.thirdPartyPartnerId(this.thirdPartyPartnerId);
            thirdPartyAccessKeyData.provenance(this.provenance);
            thirdPartyAccessKeyData.products(this.products);
            return thirdPartyAccessKeyData;
        }

        /**
         * Execute generateKey request
         * @return ThirdPartyAccessKeyReceiptData
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The third party access key was successfully generated </td><td>  -  </td></tr>
         </table>
         */
        public ThirdPartyAccessKeyReceiptData execute() throws ApiException {
            ThirdPartyAccessKeyData thirdPartyAccessKeyData = buildBodyParams();
            ApiResponse<ThirdPartyAccessKeyReceiptData> localVarResp = generateKeyWithHttpInfo(thirdPartyAccessKeyData);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute generateKey request with HTTP info returned
         * @return ApiResponse&lt;ThirdPartyAccessKeyReceiptData&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The third party access key was successfully generated </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ThirdPartyAccessKeyReceiptData> executeWithHttpInfo() throws ApiException {
            ThirdPartyAccessKeyData thirdPartyAccessKeyData = buildBodyParams();
            return generateKeyWithHttpInfo(thirdPartyAccessKeyData);
        }

        /**
         * Execute generateKey request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The third party access key was successfully generated </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ThirdPartyAccessKeyReceiptData> _callback) throws ApiException {
            ThirdPartyAccessKeyData thirdPartyAccessKeyData = buildBodyParams();
            return generateKeyAsync(thirdPartyAccessKeyData, _callback);
        }
    }

    /**
     * Generate Third Party Access Key
     * Generate access key for third party partners. A partner can provide access to third party partners with this access key.
     * @param thirdPartyAccessKeyData  (required)
     * @return GenerateKeyRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The third party access key was successfully generated </td><td>  -  </td></tr>
     </table>
     */
    public GenerateKeyRequestBuilder generateKey(String customerId, String partnerId, String thirdPartyPartnerId, List<ThirdPartyAccessProduct> products) throws IllegalArgumentException {
        if (customerId == null) throw new IllegalArgumentException("\"customerId\" is required but got null");
            

        if (partnerId == null) throw new IllegalArgumentException("\"partnerId\" is required but got null");
            

        if (thirdPartyPartnerId == null) throw new IllegalArgumentException("\"thirdPartyPartnerId\" is required but got null");
            

        if (products == null) throw new IllegalArgumentException("\"products\" is required but got null");
        return new GenerateKeyRequestBuilder(customerId, partnerId, thirdPartyPartnerId, products);
    }
    private okhttp3.Call revokePartnersAccessCall(String consentReceiptId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/aggregation/v1/partners/accessKey/{consentReceiptId}"
            .replace("{" + "consentReceiptId" + "}", localVarApiClient.escapeString(consentReceiptId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "FinicityAppKey", "FinicityAppToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call revokePartnersAccessValidateBeforeCall(String consentReceiptId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'consentReceiptId' is set
        if (consentReceiptId == null) {
            throw new ApiException("Missing the required parameter 'consentReceiptId' when calling revokePartnersAccess(Async)");
        }

        return revokePartnersAccessCall(consentReceiptId, _callback);

    }


    private ApiResponse<Void> revokePartnersAccessWithHttpInfo(String consentReceiptId) throws ApiException {
        okhttp3.Call localVarCall = revokePartnersAccessValidateBeforeCall(consentReceiptId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call revokePartnersAccessAsync(String consentReceiptId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = revokePartnersAccessValidateBeforeCall(consentReceiptId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class RevokePartnersAccessRequestBuilder {
        private final String consentReceiptId;

        private RevokePartnersAccessRequestBuilder(String consentReceiptId) {
            this.consentReceiptId = consentReceiptId;
        }

        /**
         * Build call for revokePartnersAccess
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The third party access key was successfully revoked </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return revokePartnersAccessCall(consentReceiptId, _callback);
        }


        /**
         * Execute revokePartnersAccess request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The third party access key was successfully revoked </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            revokePartnersAccessWithHttpInfo(consentReceiptId);
        }

        /**
         * Execute revokePartnersAccess request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The third party access key was successfully revoked </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return revokePartnersAccessWithHttpInfo(consentReceiptId);
        }

        /**
         * Execute revokePartnersAccess request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> The third party access key was successfully revoked </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return revokePartnersAccessAsync(consentReceiptId, _callback);
        }
    }

    /**
     * Revoke Third Party Access
     * Revoke access of third party partners
     * @param consentReceiptId Third party access key receipt ID (required)
     * @return RevokePartnersAccessRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The third party access key was successfully revoked </td><td>  -  </td></tr>
     </table>
     */
    public RevokePartnersAccessRequestBuilder revokePartnersAccess(String consentReceiptId) throws IllegalArgumentException {
        if (consentReceiptId == null) throw new IllegalArgumentException("\"consentReceiptId\" is required but got null");
            

        return new RevokePartnersAccessRequestBuilder(consentReceiptId);
    }
    private okhttp3.Call updateAccessCall(String consentReceiptId, ThirdPartyAccessKeyData thirdPartyAccessKeyData, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = thirdPartyAccessKeyData;

        // create path and map variables
        String localVarPath = "/aggregation/v1/partners/accessKey/{consentReceiptId}"
            .replace("{" + "consentReceiptId" + "}", localVarApiClient.escapeString(consentReceiptId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "FinicityAppKey", "FinicityAppToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateAccessValidateBeforeCall(String consentReceiptId, ThirdPartyAccessKeyData thirdPartyAccessKeyData, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'consentReceiptId' is set
        if (consentReceiptId == null) {
            throw new ApiException("Missing the required parameter 'consentReceiptId' when calling updateAccess(Async)");
        }

        // verify the required parameter 'thirdPartyAccessKeyData' is set
        if (thirdPartyAccessKeyData == null) {
            throw new ApiException("Missing the required parameter 'thirdPartyAccessKeyData' when calling updateAccess(Async)");
        }

        return updateAccessCall(consentReceiptId, thirdPartyAccessKeyData, _callback);

    }


    private ApiResponse<ThirdPartyAccessKeyReceiptData> updateAccessWithHttpInfo(String consentReceiptId, ThirdPartyAccessKeyData thirdPartyAccessKeyData) throws ApiException {
        okhttp3.Call localVarCall = updateAccessValidateBeforeCall(consentReceiptId, thirdPartyAccessKeyData, null);
        Type localVarReturnType = new TypeToken<ThirdPartyAccessKeyReceiptData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call updateAccessAsync(String consentReceiptId, ThirdPartyAccessKeyData thirdPartyAccessKeyData, final ApiCallback<ThirdPartyAccessKeyReceiptData> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateAccessValidateBeforeCall(consentReceiptId, thirdPartyAccessKeyData, _callback);
        Type localVarReturnType = new TypeToken<ThirdPartyAccessKeyReceiptData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UpdateAccessRequestBuilder {
        private final String customerId;
        private final String partnerId;
        private final String thirdPartyPartnerId;
        private final List<ThirdPartyAccessProduct> products;
        private final String consentReceiptId;
        private ThirdPartyAccessProvenance provenance;

        private UpdateAccessRequestBuilder(String customerId, String partnerId, String thirdPartyPartnerId, List<ThirdPartyAccessProduct> products, String consentReceiptId) {
            this.customerId = customerId;
            this.partnerId = partnerId;
            this.thirdPartyPartnerId = thirdPartyPartnerId;
            this.products = products;
            this.consentReceiptId = consentReceiptId;
        }

        /**
         * Set provenance
         * @param provenance  (optional)
         * @return UpdateAccessRequestBuilder
         */
        public UpdateAccessRequestBuilder provenance(ThirdPartyAccessProvenance provenance) {
            this.provenance = provenance;
            return this;
        }
        
        /**
         * Build call for updateAccess
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The third party access key was successfully updated </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            ThirdPartyAccessKeyData thirdPartyAccessKeyData = buildBodyParams();
            return updateAccessCall(consentReceiptId, thirdPartyAccessKeyData, _callback);
        }

        private ThirdPartyAccessKeyData buildBodyParams() {
            ThirdPartyAccessKeyData thirdPartyAccessKeyData = new ThirdPartyAccessKeyData();
            thirdPartyAccessKeyData.customerId(this.customerId);
            thirdPartyAccessKeyData.partnerId(this.partnerId);
            thirdPartyAccessKeyData.thirdPartyPartnerId(this.thirdPartyPartnerId);
            thirdPartyAccessKeyData.provenance(this.provenance);
            thirdPartyAccessKeyData.products(this.products);
            return thirdPartyAccessKeyData;
        }

        /**
         * Execute updateAccess request
         * @return ThirdPartyAccessKeyReceiptData
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The third party access key was successfully updated </td><td>  -  </td></tr>
         </table>
         */
        public ThirdPartyAccessKeyReceiptData execute() throws ApiException {
            ThirdPartyAccessKeyData thirdPartyAccessKeyData = buildBodyParams();
            ApiResponse<ThirdPartyAccessKeyReceiptData> localVarResp = updateAccessWithHttpInfo(consentReceiptId, thirdPartyAccessKeyData);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute updateAccess request with HTTP info returned
         * @return ApiResponse&lt;ThirdPartyAccessKeyReceiptData&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The third party access key was successfully updated </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ThirdPartyAccessKeyReceiptData> executeWithHttpInfo() throws ApiException {
            ThirdPartyAccessKeyData thirdPartyAccessKeyData = buildBodyParams();
            return updateAccessWithHttpInfo(consentReceiptId, thirdPartyAccessKeyData);
        }

        /**
         * Execute updateAccess request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The third party access key was successfully updated </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ThirdPartyAccessKeyReceiptData> _callback) throws ApiException {
            ThirdPartyAccessKeyData thirdPartyAccessKeyData = buildBodyParams();
            return updateAccessAsync(consentReceiptId, thirdPartyAccessKeyData, _callback);
        }
    }

    /**
     * Update Third Party Access
     * Update access for third party partners
     * @param consentReceiptId Third party access key receipt ID (required)
     * @param thirdPartyAccessKeyData  (required)
     * @return UpdateAccessRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The third party access key was successfully updated </td><td>  -  </td></tr>
     </table>
     */
    public UpdateAccessRequestBuilder updateAccess(String customerId, String partnerId, String thirdPartyPartnerId, List<ThirdPartyAccessProduct> products, String consentReceiptId) throws IllegalArgumentException {
        if (customerId == null) throw new IllegalArgumentException("\"customerId\" is required but got null");
            

        if (partnerId == null) throw new IllegalArgumentException("\"partnerId\" is required but got null");
            

        if (thirdPartyPartnerId == null) throw new IllegalArgumentException("\"thirdPartyPartnerId\" is required but got null");
            

        if (products == null) throw new IllegalArgumentException("\"products\" is required but got null");
        if (consentReceiptId == null) throw new IllegalArgumentException("\"consentReceiptId\" is required but got null");
            

        return new UpdateAccessRequestBuilder(customerId, partnerId, thirdPartyPartnerId, products, consentReceiptId);
    }
}
