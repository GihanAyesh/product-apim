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
import org.wso2.am.integration.clients.store.api.v1.dto.RatingDTO;
import org.wso2.am.integration.clients.store.api.v1.dto.RatingListDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RatingsApi
 */
@Ignore
public class RatingsApiTest {

    private final RatingsApi api = new RatingsApi();

    
    /**
     * Get API ratings
     *
     * Get the rating of an API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdRatingsGetTest() throws ApiException {
        String apiId = null;
        Integer limit = null;
        Integer offset = null;
        RatingListDTO response = api.apisApiIdRatingsGet(apiId, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Get a single API rating
     *
     * Get a specific rating of an API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdRatingsRatingIdGetTest() throws ApiException {
        String apiId = null;
        String ratingId = null;
        String ifNoneMatch = null;
        RatingDTO response = api.apisApiIdRatingsRatingIdGet(apiId, ratingId, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Add or update logged in user&#39;s rating for an API
     *
     * Adds or updates a rating 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdUserRatingPutTest() throws ApiException {
        String apiId = null;
        RatingDTO body = null;
        RatingDTO response = api.apisApiIdUserRatingPut(apiId, body);

        // TODO: test validations
    }
    
}
