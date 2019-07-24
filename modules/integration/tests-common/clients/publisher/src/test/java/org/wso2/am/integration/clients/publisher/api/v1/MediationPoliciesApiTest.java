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
import org.wso2.am.integration.clients.publisher.api.v1.dto.ErrorDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.MediationDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.MediationListDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MediationPoliciesApi
 */
@Ignore
public class MediationPoliciesApiTest {

    private final MediationPoliciesApi api = new MediationPoliciesApi();

    
    /**
     * Get all mediation policies of an API 
     *
     * This operation provides you a list of available mediation policies of an API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdMediationPoliciesGetTest() throws ApiException {
        String apiId = null;
        Integer limit = null;
        Integer offset = null;
        String query = null;
        String ifNoneMatch = null;
        MediationListDTO response = api.apisApiIdMediationPoliciesGet(apiId, limit, offset, query, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Delete an API specific mediation policy
     *
     * This operation can be used to delete an existing API specific mediation policy providing the Id of the API and the Id of the mediation policy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdMediationPoliciesMediationPolicyIdDeleteTest() throws ApiException {
        String apiId = null;
        String mediationPolicyId = null;
        String ifMatch = null;
        api.apisApiIdMediationPoliciesMediationPolicyIdDelete(apiId, mediationPolicyId, ifMatch);

        // TODO: test validations
    }
    
    /**
     * Get an API specific mediation policy
     *
     * This operation can be used to retrieve a particular API specific mediation policy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdMediationPoliciesMediationPolicyIdGetTest() throws ApiException {
        String apiId = null;
        String mediationPolicyId = null;
        String ifNoneMatch = null;
        MediationDTO response = api.apisApiIdMediationPoliciesMediationPolicyIdGet(apiId, mediationPolicyId, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Update an API specific mediation policy
     *
     * This operation can be used to update an existing mediation policy of an API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdMediationPoliciesMediationPolicyIdPutTest() throws ApiException {
        String apiId = null;
        String mediationPolicyId = null;
        MediationDTO body = null;
        String ifMatch = null;
        MediationDTO response = api.apisApiIdMediationPoliciesMediationPolicyIdPut(apiId, mediationPolicyId, body, ifMatch);

        // TODO: test validations
    }
    
    /**
     * Add an API specific mediation policy
     *
     * This operation can be used to add an API specifc mediation policy. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdMediationPoliciesPostTest() throws ApiException {
        MediationDTO body = null;
        String apiId = null;
        String ifMatch = null;
        MediationDTO response = api.apisApiIdMediationPoliciesPost(body, apiId, ifMatch);

        // TODO: test validations
    }
    
    /**
     * Get all global level mediation policies 
     *
     * This operation provides you a list of available all global level mediation policies. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mediationPoliciesGetTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String query = null;
        String ifNoneMatch = null;
        MediationListDTO response = api.mediationPoliciesGet(limit, offset, query, ifNoneMatch);

        // TODO: test validations
    }
    
}
