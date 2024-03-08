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


import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AssetsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AssetsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AssetsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getBinaryFileCall(String customerId, String assetId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/aggregation/v1/customers/{customerId}/assets/{assetId}"
            .replace("{" + "customerId" + "}", localVarApiClient.escapeString(customerId.toString()))
            .replace("{" + "assetId" + "}", localVarApiClient.escapeString(assetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream",
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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBinaryFileValidateBeforeCall(String customerId, String assetId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getBinaryFile(Async)");
        }

        // verify the required parameter 'assetId' is set
        if (assetId == null) {
            throw new ApiException("Missing the required parameter 'assetId' when calling getBinaryFile(Async)");
        }

        return getBinaryFileCall(customerId, assetId, _callback);

    }


    private ApiResponse<File> getBinaryFileWithHttpInfo(String customerId, String assetId) throws ApiException {
        okhttp3.Call localVarCall = getBinaryFileValidateBeforeCall(customerId, assetId, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getBinaryFileAsync(String customerId, String assetId, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBinaryFileValidateBeforeCall(customerId, assetId, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetBinaryFileRequestBuilder {
        private final String customerId;
        private final String assetId;

        private GetBinaryFileRequestBuilder(String customerId, String assetId) {
            this.customerId = customerId;
            this.assetId = assetId;
        }

        /**
         * Build call for getBinaryFile
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The asset was successfully downloaded </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getBinaryFileCall(customerId, assetId, _callback);
        }


        /**
         * Execute getBinaryFile request
         * @return File
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The asset was successfully downloaded </td><td>  -  </td></tr>
         </table>
         */
        public File execute() throws ApiException {
            ApiResponse<File> localVarResp = getBinaryFileWithHttpInfo(customerId, assetId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getBinaryFile request with HTTP info returned
         * @return ApiResponse&lt;File&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The asset was successfully downloaded </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<File> executeWithHttpInfo() throws ApiException {
            return getBinaryFileWithHttpInfo(customerId, assetId);
        }

        /**
         * Execute getBinaryFile request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The asset was successfully downloaded </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<File> _callback) throws ApiException {
            return getBinaryFileAsync(customerId, assetId, _callback);
        }
    }

    /**
     * Get Asset by Customer and ID
     * Retrieve a binary file for the given asset ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * @param customerId A customer ID (required)
     * @param assetId The asset ID (required)
     * @return GetBinaryFileRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The asset was successfully downloaded </td><td>  -  </td></tr>
     </table>
     */
    public GetBinaryFileRequestBuilder getBinaryFile(String customerId, String assetId) throws IllegalArgumentException {
        if (customerId == null) throw new IllegalArgumentException("\"customerId\" is required but got null");
            

        if (assetId == null) throw new IllegalArgumentException("\"assetId\" is required but got null");
            

        return new GetBinaryFileRequestBuilder(customerId, assetId);
    }
}
