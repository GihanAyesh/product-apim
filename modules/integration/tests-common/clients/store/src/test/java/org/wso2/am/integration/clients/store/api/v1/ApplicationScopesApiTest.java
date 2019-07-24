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

import org.wso2.am.integration.clients.store.api.ApiException;
import org.wso2.am.integration.clients.store.api.v1.dto.ErrorDTO;
import org.wso2.am.integration.clients.store.api.v1.dto.ScopeListDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicationScopesApi
 */
@Ignore
public class ApplicationScopesApiTest {

    private final ApplicationScopesApi api = new ApplicationScopesApi();

    
    /**
     * Get scopes of application 
     *
     * Get scopes associated with a particular application based on subscribed APIs 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applicationsApplicationIdScopesGetTest() throws ApiException {
        String applicationId = null;
        Boolean filterByUserRoles = null;
        String ifNoneMatch = null;
        ScopeListDTO response = api.applicationsApplicationIdScopesGet(applicationId, filterByUserRoles, ifNoneMatch);

        // TODO: test validations
    }
    
}
