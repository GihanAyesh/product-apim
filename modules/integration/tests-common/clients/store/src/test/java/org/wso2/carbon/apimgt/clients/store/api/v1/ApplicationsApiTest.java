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
import org.wso2.carbon.apimgt.clients.store.api.v1.dto.ApplicationDTO;
import org.wso2.carbon.apimgt.clients.store.api.v1.dto.ApplicationListDTO;
import org.wso2.carbon.apimgt.clients.store.api.v1.dto.ErrorDTO;
import org.wso2.carbon.apimgt.clients.store.api.v1.dto.WorkflowResponseDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicationsApi
 */
@Ignore
public class ApplicationsApiTest {

    private final ApplicationsApi api = new ApplicationsApi();

    
    /**
     * Remove an application 
     *
     * This operation can be used to remove an application specifying its id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applicationsApplicationIdDeleteTest() throws ApiException {
        String applicationId = null;
        String ifMatch = null;
        api.applicationsApplicationIdDelete(applicationId, ifMatch);

        // TODO: test validations
    }
    
    /**
     * Get details of an application 
     *
     * This operation can be used to retrieve details of an individual application specifying the application id in the URI. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applicationsApplicationIdGetTest() throws ApiException {
        String applicationId = null;
        String ifNoneMatch = null;
        ApplicationDTO response = api.applicationsApplicationIdGet(applicationId, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Update an application 
     *
     * This operation can be used to update an application. Upon succesfull you will retrieve the updated application as the response. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applicationsApplicationIdPutTest() throws ApiException {
        String applicationId = null;
        ApplicationDTO body = null;
        String ifMatch = null;
        ApplicationDTO response = api.applicationsApplicationIdPut(applicationId, body, ifMatch);

        // TODO: test validations
    }
    
    /**
     * Retrieve/Search applications 
     *
     * This operation can be used to retrieve list of applications that is belonged to the user associated with the provided access token. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applicationsGetTest() throws ApiException {
        String groupId = null;
        String query = null;
        String sortBy = null;
        String sortOrder = null;
        Integer limit = null;
        Integer offset = null;
        String ifNoneMatch = null;
        ApplicationListDTO response = api.applicationsGet(groupId, query, sortBy, sortOrder, limit, offset, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Create a new application 
     *
     * This operation can be used to create a new application specifying the details of the application in the payload. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applicationsPostTest() throws ApiException {
        ApplicationDTO body = null;
        ApplicationDTO response = api.applicationsPost(body);

        // TODO: test validations
    }
    
}
