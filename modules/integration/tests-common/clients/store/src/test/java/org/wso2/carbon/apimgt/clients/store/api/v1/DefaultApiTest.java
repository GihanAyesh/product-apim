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
import org.wso2.carbon.apimgt.clients.store.api.v1.dto.SettingsDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * Retreive store settings
     *
     * Retreive store settings 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void settingsGetTest() throws ApiException {
        SettingsDTO response = api.settingsGet();

        // TODO: test validations
    }
    
}
