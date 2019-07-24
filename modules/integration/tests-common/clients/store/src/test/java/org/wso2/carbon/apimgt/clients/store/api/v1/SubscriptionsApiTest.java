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


package org.wso2.carbon.apimgt.clients.store.api.v1;

import org.wso2.carbon.apimgt.clients.store.api.ApiException;
import org.wso2.carbon.apimgt.clients.store.api.v1.dto.ErrorDTO;
import org.wso2.carbon.apimgt.clients.store.api.v1.dto.SubscriptionDTO;
import org.wso2.carbon.apimgt.clients.store.api.v1.dto.SubscriptionListDTO;
import org.wso2.carbon.apimgt.clients.store.api.v1.dto.WorkflowResponseDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionsApi
 */
@Ignore
public class SubscriptionsApiTest {

    private final SubscriptionsApi api = new SubscriptionsApi();

    
    /**
     * Get all subscriptions 
     *
     * This operation can be used to retrieve a list of subscriptions of the user associated with the provided access token. This operation is capable of  1. Retrieving applications which are subscibed to a specific API. &#x60;GET https://localhost:9443/api/am/store/v1.0/subscriptions?apiId&#x3D;c43a325c-260b-4302-81cb-768eafaa3aed&#x60;  2. Retrieving APIs which are subscribed by a specific application. &#x60;GET https://localhost:9443/api/am/store/v1.0/subscriptions?applicationId&#x3D;c43a325c-260b-4302-81cb-768eafaa3aed&#x60;  **IMPORTANT:** * It is mandatory to provide either **apiId** or **applicationId**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subscriptionsGetTest() throws ApiException {
        String apiId = null;
        String applicationId = null;
        String groupId = null;
        Integer offset = null;
        Integer limit = null;
        String ifNoneMatch = null;
        SubscriptionListDTO response = api.subscriptionsGet(apiId, applicationId, groupId, offset, limit, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Add new subscriptions 
     *
     * This operation can be used to add a new subscriptions providing the ids of the APIs and the applications. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subscriptionsMultiplePostTest() throws ApiException {
        List<SubscriptionDTO> body = null;
        List<SubscriptionDTO> response = api.subscriptionsMultiplePost(body);

        // TODO: test validations
    }
    
    /**
     * Add a new subscription 
     *
     * This operation can be used to add a new subscription providing the id of the API and the application. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subscriptionsPostTest() throws ApiException {
        SubscriptionDTO body = null;
        SubscriptionDTO response = api.subscriptionsPost(body);

        // TODO: test validations
    }
    
    /**
     * Remove a subscription 
     *
     * This operation can be used to remove a subscription. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subscriptionsSubscriptionIdDeleteTest() throws ApiException {
        String subscriptionId = null;
        String ifMatch = null;
        api.subscriptionsSubscriptionIdDelete(subscriptionId, ifMatch);

        // TODO: test validations
    }
    
    /**
     * Get details of a subscription 
     *
     * This operation can be used to get details of a single subscription. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subscriptionsSubscriptionIdGetTest() throws ApiException {
        String subscriptionId = null;
        String ifNoneMatch = null;
        SubscriptionDTO response = api.subscriptionsSubscriptionIdGet(subscriptionId, ifNoneMatch);

        // TODO: test validations
    }
    
}
