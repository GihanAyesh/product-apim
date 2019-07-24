/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1;

import org.wso2.am.integration.clients.publisher.api.ApiException;
import org.wso2.am.integration.clients.publisher.api.v1.dto.APIDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.APIMonetizationInfoDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.APIRevenueDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.ErrorDTO;
import java.io.File;
import org.wso2.am.integration.clients.publisher.api.v1.dto.FileInfoDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.LifecycleHistoryDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.LifecycleStateDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.ResourcePolicyInfoDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.ResourcePolicyListDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.ThrottlingPolicyDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.WorkflowResponseDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiIndividualApi
 */
@Ignore
public class ApiIndividualApiTest {

    private final ApiIndividualApi api = new ApiIndividualApi();

    
    /**
     * Delete an API
     *
     * This operation can be used to delete an existing API proving the Id of the API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdDeleteTest() throws ApiException {
        String apiId = null;
        String ifMatch = null;
        api.apisApiIdDelete(apiId, ifMatch);

        // TODO: test validations
    }
    
    /**
     * Get details of an API
     *
     * Using this operation, you can retrieve complete details of a single API. You need to provide the Id of the API to retrive it. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdGetTest() throws ApiException {
        String apiId = null;
        String xWSO2Tenant = null;
        String ifNoneMatch = null;
        APIDTO response = api.apisApiIdGet(apiId, xWSO2Tenant, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get Lifecycle state change history of the API.
     *
     * This operation can be used to retrieve Lifecycle state change history of the API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdLifecycleHistoryGetTest() throws ApiException {
        String apiId = null;
        String ifNoneMatch = null;
        LifecycleHistoryDTO response = api.apisApiIdLifecycleHistoryGet(apiId, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get Lifecycle state data of the API.
     *
     * This operation can be used to retrieve Lifecycle state data of the API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdLifecycleStateGetTest() throws ApiException {
        String apiId = null;
        String ifNoneMatch = null;
        LifecycleStateDTO response = api.apisApiIdLifecycleStateGet(apiId, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Delete pending lifecycle state change tasks.
     *
     * This operation can be used to remove pending lifecycle state change requests that are in pending state 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdLifecycleStatePendingTasksDeleteTest() throws ApiException {
        String apiId = null;
        api.apisApiIdLifecycleStatePendingTasksDelete(apiId);

        // TODO: test validations
    }
    
    /**
     * Get monetization status for each tier in a given API
     *
     * This operation can be used to get monetization status for each tier in a given API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdMonetizationGetTest() throws ApiException {
        String apiId = null;
        api.apisApiIdMonetizationGet(apiId);

        // TODO: test validations
    }
    
    /**
     * Configure monetization for a given API
     *
     * This operation can be used to configure monetization for a given API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdMonetizePostTest() throws ApiException {
        String apiId = null;
        APIMonetizationInfoDTO body = null;
        api.apisApiIdMonetizePost(apiId, body);

        // TODO: test validations
    }
    
    /**
     * Update an API
     *
     * This operation can be used to update an existing API. But the properties &#x60;name&#x60;, &#x60;version&#x60;, &#x60;context&#x60;, &#x60;provider&#x60;, &#x60;state&#x60; will not be changed by this operation. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdPutTest() throws ApiException {
        String apiId = null;
        APIDTO body = null;
        String ifMatch = null;
        APIDTO response = api.apisApiIdPut(apiId, body, ifMatch);

        // TODO: test validations
    }
    
    /**
     * Get the resource policy (inflow/outflow) definitions
     *
     * This operation can be used to retrieve conversion policy resource definitions of an API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdResourcePoliciesGetTest() throws ApiException {
        String apiId = null;
        String sequenceType = null;
        String resourcePath = null;
        String verb = null;
        String ifNoneMatch = null;
        ResourcePolicyListDTO response = api.apisApiIdResourcePoliciesGet(apiId, sequenceType, resourcePath, verb, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get the resource policy (inflow/outflow) definition for a given resource identifier.
     *
     * This operation can be used to retrieve conversion policy resource definitions of an API given the resource identifier. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdResourcePoliciesResourcePolicyIdGetTest() throws ApiException {
        String apiId = null;
        String resourcePolicyId = null;
        String ifNoneMatch = null;
        ResourcePolicyInfoDTO response = api.apisApiIdResourcePoliciesResourcePolicyIdGet(apiId, resourcePolicyId, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Update the resource policy(inflow/outflow) definition for the given resource identifier
     *
     * This operation can be used to update the resource policy(inflow/outflow) definition for the given resource identifier of an existing API. resource policy definition to be updated is passed as a body parameter &#x60;content&#x60;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdResourcePoliciesResourcePolicyIdPutTest() throws ApiException {
        String apiId = null;
        String resourcePolicyId = null;
        ResourcePolicyInfoDTO body = null;
        String ifMatch = null;
        ResourcePolicyInfoDTO response = api.apisApiIdResourcePoliciesResourcePolicyIdPut(apiId, resourcePolicyId, body, ifMatch);

        // TODO: test validations
    }
    
    /**
     * Get total revenue details of a given monetized API with meterd billing.
     *
     * This operation can be used to get details of total revenue details of a given monetized API with meterd billing. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdRevenueGetTest() throws ApiException {
        String apiId = null;
        APIRevenueDTO response = api.apisApiIdRevenueGet(apiId);

        // TODO: test validations
    }
    
    /**
     * Get details of the subscription throttling policies of an API 
     *
     * This operation can be used to retrieve details of the subscription throttling policy of an API by specifying the API Id.  &#x60;X-WSO2-Tenant&#x60; header can be used to retrive API subscription throttling policies that belongs to a different tenant domain. If not specified super tenant will be used. If Authorization header is present in the request, the user&#39;s tenant associated with the access token will be used. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdSubscriptionPoliciesGetTest() throws ApiException {
        String apiId = null;
        String xWSO2Tenant = null;
        String ifNoneMatch = null;
        ThrottlingPolicyDTO response = api.apisApiIdSubscriptionPoliciesGet(apiId, xWSO2Tenant, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get swagger definition
     *
     * This operation can be used to retrieve the swagger definition of an API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdSwaggerGetTest() throws ApiException {
        String apiId = null;
        String ifNoneMatch = null;
        String response = api.apisApiIdSwaggerGet(apiId, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Update swagger definition
     *
     * This operation can be used to update the swagger definition of an existing API. Swagger definition to be updated is passed as a form data parameter &#x60;apiDefinition&#x60;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdSwaggerPutTest() throws ApiException {
        String apiId = null;
        String apiDefinition = null;
        String ifMatch = null;
        api.apisApiIdSwaggerPut(apiId, apiDefinition, ifMatch);

        // TODO: test validations
    }
    
    /**
     * Delete a threat protection policy from an API
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdThreatProtectionPoliciesDeleteTest() throws ApiException {
        String apiId = null;
        String policyId = null;
        api.apisApiIdThreatProtectionPoliciesDelete(apiId, policyId);

        // TODO: test validations
    }
    
    /**
     * Get all threat protection policies associated with an API
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdThreatProtectionPoliciesGetTest() throws ApiException {
        String apiId = null;
        List<String> response = api.apisApiIdThreatProtectionPoliciesGet(apiId);

        // TODO: test validations
    }
    
    /**
     * Add a threat protection policy to an API
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdThreatProtectionPoliciesPostTest() throws ApiException {
        String apiId = null;
        String policyId = null;
        api.apisApiIdThreatProtectionPoliciesPost(apiId, policyId);

        // TODO: test validations
    }
    
    /**
     * Get thumbnail image
     *
     * This operation can be used to download a thumbnail image of an API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdThumbnailGetTest() throws ApiException {
        String apiId = null;
        String ifNoneMatch = null;
        api.apisApiIdThumbnailGet(apiId, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get WSDL definition
     *
     * This operation can be used to retrieve the WSDL definition of an API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdWsdlGetTest() throws ApiException {
        String apiId = null;
        String ifNoneMatch = null;
        api.apisApiIdWsdlGet(apiId, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Update WSDL definition
     *
     * This operation can be used to update the WSDL definition of an existing API. WSDL to be updated is passed as a form data parameter &#x60;inlineContent&#x60;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdWsdlPutTest() throws ApiException {
        String apiId = null;
        File file = null;
        String ifMatch = null;
        api.apisApiIdWsdlPut(apiId, file, ifMatch);

        // TODO: test validations
    }
    
    /**
     * Change API Status
     *
     * This operation is used to change the lifecycle of an API. Eg: Publish an API which is in &#x60;CREATED&#x60; state. In order to change the lifecycle, we need to provide the lifecycle &#x60;action&#x60; as a query parameter.  For example, to Publish an API, &#x60;action&#x60; should be &#x60;Publish&#x60;. Note that the &#x60;Re-publish&#x60; action is available only after calling &#x60;Block&#x60;.  Some actions supports providing additional paramters which should be provided as &#x60;lifecycleChecklist&#x60; parameter. Please see parameters table for more information. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisChangeLifecyclePostTest() throws ApiException {
        String action = null;
        String apiId = null;
        String lifecycleChecklist = null;
        String ifMatch = null;
        WorkflowResponseDTO response = api.apisChangeLifecyclePost(action, apiId, lifecycleChecklist, ifMatch);

        // TODO: test validations
    }
    
    /**
     * Create a new API version
     *
     * This operation can be used to create a new version of an existing API. The new version is specified as &#x60;newVersion&#x60; query parameter. New API will be in &#x60;CREATED&#x60; state. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisCopyApiPostTest() throws ApiException {
        String newVersion = null;
        String apiId = null;
        Boolean defaultVersion = null;
        api.apisCopyApiPost(newVersion, apiId, defaultVersion);

        // TODO: test validations
    }
    
    /**
     * Create a new API
     *
     * This operation can be used to create a new API specifying the details of the API in the payload. The new API will be in &#x60;CREATED&#x60; state.  There is a special capability for a user who has &#x60;APIM Admin&#x60; permission such that he can create APIs on behalf of other users. For that he can to specify &#x60;\&quot;provider\&quot; : \&quot;some_other_user\&quot;&#x60; in the payload so that the API&#39;s creator will be shown as &#x60;some_other_user&#x60; in the UI. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisPostTest() throws ApiException {
        APIDTO body = null;
        APIDTO response = api.apisPost(body);

        // TODO: test validations
    }
    
    /**
     * Upload a thumbnail image
     *
     * This operation can be used to upload a thumbnail image of an API. The thumbnail to be uploaded should be given as a form data parameter &#x60;file&#x60;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAPIThumbnailTest() throws ApiException {
        String apiId = null;
        File file = null;
        String ifMatch = null;
        FileInfoDTO response = api.updateAPIThumbnail(apiId, file, ifMatch);

        // TODO: test validations
    }
    
}
