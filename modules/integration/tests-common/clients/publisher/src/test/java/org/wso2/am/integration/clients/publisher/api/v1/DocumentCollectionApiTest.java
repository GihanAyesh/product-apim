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
import org.wso2.am.integration.clients.publisher.api.v1.dto.DocumentDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.DocumentListDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.ErrorDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentCollectionApi
 */
@Ignore
public class DocumentCollectionApiTest {

    private final DocumentCollectionApi api = new DocumentCollectionApi();

    
    /**
     * Get a list of documents of an API
     *
     * This operation can be used to retrieve a list of documents belonging to an API by providing the id of the API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdDocumentsGetTest() throws ApiException {
        String apiId = null;
        Integer limit = null;
        Integer offset = null;
        String ifNoneMatch = null;
        DocumentListDTO response = api.apisApiIdDocumentsGet(apiId, limit, offset, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Add a new document to an API
     *
     * This operation can be used to add a new documentation to an API. This operation only adds the metadata of a document. To add the actual content we need to use **Upload the content of an API document ** API once we obtain a document Id by this operation. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdDocumentsPostTest() throws ApiException {
        String apiId = null;
        DocumentDTO body = null;
        String ifMatch = null;
        DocumentDTO response = api.apisApiIdDocumentsPost(apiId, body, ifMatch);

        // TODO: test validations
    }
    
}
