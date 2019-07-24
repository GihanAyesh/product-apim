/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.store.api.v1;

import org.wso2.am.integration.clients.store.api.ApiCallback;
import org.wso2.am.integration.clients.store.api.ApiClient;
import org.wso2.am.integration.clients.store.api.ApiException;
import org.wso2.am.integration.clients.store.api.ApiResponse;
import org.wso2.am.integration.clients.store.api.Configuration;
import org.wso2.am.integration.clients.store.api.Pair;
import org.wso2.am.integration.clients.store.api.ProgressRequestBody;
import org.wso2.am.integration.clients.store.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.wso2.am.integration.clients.store.api.v1.dto.CommentDTO;
import org.wso2.am.integration.clients.store.api.v1.dto.CommentListDTO;
import org.wso2.am.integration.clients.store.api.v1.dto.ErrorDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentsApi {
    private ApiClient apiClient;

    public CommentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CommentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for apisApiIdCommentsCommentIdDelete
     * @param commentId Comment Id  (required)
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apisApiIdCommentsCommentIdDeleteCall(String commentId, String apiId, String ifMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/{apiId}/comments/{commentId}"
            .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()))
            .replaceAll("\\{" + "apiId" + "\\}", apiClient.escapeString(apiId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifMatch != null)
        localVarHeaderParams.put("If-Match", apiClient.parameterToString(ifMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apisApiIdCommentsCommentIdDeleteValidateBeforeCall(String commentId, String apiId, String ifMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new ApiException("Missing the required parameter 'commentId' when calling apisApiIdCommentsCommentIdDelete(Async)");
        }
        
        // verify the required parameter 'apiId' is set
        if (apiId == null) {
            throw new ApiException("Missing the required parameter 'apiId' when calling apisApiIdCommentsCommentIdDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = apisApiIdCommentsCommentIdDeleteCall(commentId, apiId, ifMatch, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete an API comment
     * Remove a Comment 
     * @param commentId Comment Id  (required)
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void apisApiIdCommentsCommentIdDelete(String commentId, String apiId, String ifMatch) throws ApiException {
        apisApiIdCommentsCommentIdDeleteWithHttpInfo(commentId, apiId, ifMatch);
    }

    /**
     * Delete an API comment
     * Remove a Comment 
     * @param commentId Comment Id  (required)
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> apisApiIdCommentsCommentIdDeleteWithHttpInfo(String commentId, String apiId, String ifMatch) throws ApiException {
        com.squareup.okhttp.Call call = apisApiIdCommentsCommentIdDeleteValidateBeforeCall(commentId, apiId, ifMatch, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete an API comment (asynchronously)
     * Remove a Comment 
     * @param commentId Comment Id  (required)
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apisApiIdCommentsCommentIdDeleteAsync(String commentId, String apiId, String ifMatch, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apisApiIdCommentsCommentIdDeleteValidateBeforeCall(commentId, apiId, ifMatch, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for apisApiIdCommentsCommentIdGet
     * @param commentId Comment Id  (required)
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apisApiIdCommentsCommentIdGetCall(String commentId, String apiId, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/{apiId}/comments/{commentId}"
            .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()))
            .replaceAll("\\{" + "apiId" + "\\}", apiClient.escapeString(apiId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apisApiIdCommentsCommentIdGetValidateBeforeCall(String commentId, String apiId, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new ApiException("Missing the required parameter 'commentId' when calling apisApiIdCommentsCommentIdGet(Async)");
        }
        
        // verify the required parameter 'apiId' is set
        if (apiId == null) {
            throw new ApiException("Missing the required parameter 'apiId' when calling apisApiIdCommentsCommentIdGet(Async)");
        }
        

        com.squareup.okhttp.Call call = apisApiIdCommentsCommentIdGetCall(commentId, apiId, ifNoneMatch, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get details of an API comment
     * Get the individual comment given by a username for a certain API. 
     * @param commentId Comment Id  (required)
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @return CommentDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommentDTO apisApiIdCommentsCommentIdGet(String commentId, String apiId, String ifNoneMatch) throws ApiException {
        ApiResponse<CommentDTO> resp = apisApiIdCommentsCommentIdGetWithHttpInfo(commentId, apiId, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get details of an API comment
     * Get the individual comment given by a username for a certain API. 
     * @param commentId Comment Id  (required)
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @return ApiResponse&lt;CommentDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommentDTO> apisApiIdCommentsCommentIdGetWithHttpInfo(String commentId, String apiId, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = apisApiIdCommentsCommentIdGetValidateBeforeCall(commentId, apiId, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<CommentDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get details of an API comment (asynchronously)
     * Get the individual comment given by a username for a certain API. 
     * @param commentId Comment Id  (required)
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apisApiIdCommentsCommentIdGetAsync(String commentId, String apiId, String ifNoneMatch, final ApiCallback<CommentDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apisApiIdCommentsCommentIdGetValidateBeforeCall(commentId, apiId, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommentDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apisApiIdCommentsCommentIdPut
     * @param commentId Comment Id  (required)
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param body Comment object that needs to be updated  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apisApiIdCommentsCommentIdPutCall(String commentId, String apiId, CommentDTO body, String ifMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{apiId}/comments/{commentId}"
            .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()))
            .replaceAll("\\{" + "apiId" + "\\}", apiClient.escapeString(apiId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifMatch != null)
        localVarHeaderParams.put("If-Match", apiClient.parameterToString(ifMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apisApiIdCommentsCommentIdPutValidateBeforeCall(String commentId, String apiId, CommentDTO body, String ifMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new ApiException("Missing the required parameter 'commentId' when calling apisApiIdCommentsCommentIdPut(Async)");
        }
        
        // verify the required parameter 'apiId' is set
        if (apiId == null) {
            throw new ApiException("Missing the required parameter 'apiId' when calling apisApiIdCommentsCommentIdPut(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling apisApiIdCommentsCommentIdPut(Async)");
        }
        

        com.squareup.okhttp.Call call = apisApiIdCommentsCommentIdPutCall(commentId, apiId, body, ifMatch, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update an API comment
     * Update a certain Comment 
     * @param commentId Comment Id  (required)
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param body Comment object that needs to be updated  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @return CommentDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommentDTO apisApiIdCommentsCommentIdPut(String commentId, String apiId, CommentDTO body, String ifMatch) throws ApiException {
        ApiResponse<CommentDTO> resp = apisApiIdCommentsCommentIdPutWithHttpInfo(commentId, apiId, body, ifMatch);
        return resp.getData();
    }

    /**
     * Update an API comment
     * Update a certain Comment 
     * @param commentId Comment Id  (required)
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param body Comment object that needs to be updated  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @return ApiResponse&lt;CommentDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommentDTO> apisApiIdCommentsCommentIdPutWithHttpInfo(String commentId, String apiId, CommentDTO body, String ifMatch) throws ApiException {
        com.squareup.okhttp.Call call = apisApiIdCommentsCommentIdPutValidateBeforeCall(commentId, apiId, body, ifMatch, null, null);
        Type localVarReturnType = new TypeToken<CommentDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an API comment (asynchronously)
     * Update a certain Comment 
     * @param commentId Comment Id  (required)
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param body Comment object that needs to be updated  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apisApiIdCommentsCommentIdPutAsync(String commentId, String apiId, CommentDTO body, String ifMatch, final ApiCallback<CommentDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apisApiIdCommentsCommentIdPutValidateBeforeCall(commentId, apiId, body, ifMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommentDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apisApiIdCommentsGet
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apisApiIdCommentsGetCall(String apiId, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/{apiId}/comments"
            .replaceAll("\\{" + "apiId" + "\\}", apiClient.escapeString(apiId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apisApiIdCommentsGetValidateBeforeCall(String apiId, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiId' is set
        if (apiId == null) {
            throw new ApiException("Missing the required parameter 'apiId' when calling apisApiIdCommentsGet(Async)");
        }
        

        com.squareup.okhttp.Call call = apisApiIdCommentsGetCall(apiId, limit, offset, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve API comments
     * Get a list of Comments that are already added to APIs 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @return CommentListDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommentListDTO apisApiIdCommentsGet(String apiId, Integer limit, Integer offset) throws ApiException {
        ApiResponse<CommentListDTO> resp = apisApiIdCommentsGetWithHttpInfo(apiId, limit, offset);
        return resp.getData();
    }

    /**
     * Retrieve API comments
     * Get a list of Comments that are already added to APIs 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @return ApiResponse&lt;CommentListDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommentListDTO> apisApiIdCommentsGetWithHttpInfo(String apiId, Integer limit, Integer offset) throws ApiException {
        com.squareup.okhttp.Call call = apisApiIdCommentsGetValidateBeforeCall(apiId, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<CommentListDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve API comments (asynchronously)
     * Get a list of Comments that are already added to APIs 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apisApiIdCommentsGetAsync(String apiId, Integer limit, Integer offset, final ApiCallback<CommentListDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apisApiIdCommentsGetValidateBeforeCall(apiId, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommentListDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apisApiIdCommentsPost
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param body Comment object that should to be added  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apisApiIdCommentsPostCall(String apiId, CommentDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{apiId}/comments"
            .replaceAll("\\{" + "apiId" + "\\}", apiClient.escapeString(apiId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apisApiIdCommentsPostValidateBeforeCall(String apiId, CommentDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiId' is set
        if (apiId == null) {
            throw new ApiException("Missing the required parameter 'apiId' when calling apisApiIdCommentsPost(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling apisApiIdCommentsPost(Async)");
        }
        

        com.squareup.okhttp.Call call = apisApiIdCommentsPostCall(apiId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add an API comment
     * 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param body Comment object that should to be added  (required)
     * @return CommentDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommentDTO apisApiIdCommentsPost(String apiId, CommentDTO body) throws ApiException {
        ApiResponse<CommentDTO> resp = apisApiIdCommentsPostWithHttpInfo(apiId, body);
        return resp.getData();
    }

    /**
     * Add an API comment
     * 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param body Comment object that should to be added  (required)
     * @return ApiResponse&lt;CommentDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommentDTO> apisApiIdCommentsPostWithHttpInfo(String apiId, CommentDTO body) throws ApiException {
        com.squareup.okhttp.Call call = apisApiIdCommentsPostValidateBeforeCall(apiId, body, null, null);
        Type localVarReturnType = new TypeToken<CommentDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add an API comment (asynchronously)
     * 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param body Comment object that should to be added  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apisApiIdCommentsPostAsync(String apiId, CommentDTO body, final ApiCallback<CommentDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apisApiIdCommentsPostValidateBeforeCall(apiId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommentDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
