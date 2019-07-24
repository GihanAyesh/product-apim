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
import org.wso2.am.integration.clients.publisher.api.v1.dto.CertificateInfoDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.ClientCertMetadataDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.ErrorDTO;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientCertificatesIndividualApi
 */
@Ignore
public class ClientCertificatesIndividualApiTest {

    private final ClientCertificatesIndividualApi api = new ClientCertificatesIndividualApi();

    
    /**
     * Download a certificate.
     *
     * This operation can be used to download a certificate which matches the given alias. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clientCertificatesAliasContentGetTest() throws ApiException {
        String alias = null;
        api.clientCertificatesAliasContentGet(alias);

        // TODO: test validations
    }
    
    /**
     * Delete a certificate.
     *
     * This operation can be used to delete an uploaded certificate. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clientCertificatesAliasDeleteTest() throws ApiException {
        String alias = null;
        api.clientCertificatesAliasDelete(alias);

        // TODO: test validations
    }
    
    /**
     * Get the certificate information.
     *
     * This operation can be used to get the information about a certificate. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clientCertificatesAliasGetTest() throws ApiException {
        String alias = null;
        CertificateInfoDTO response = api.clientCertificatesAliasGet(alias);

        // TODO: test validations
    }
    
    /**
     * Update a certificate.
     *
     * This operation can be used to update an uploaded certificate. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clientCertificatesAliasPutTest() throws ApiException {
        String alias = null;
        File certificate = null;
        String tier = null;
        ClientCertMetadataDTO response = api.clientCertificatesAliasPut(alias, certificate, tier);

        // TODO: test validations
    }
    
    /**
     * Upload a new certificate.
     *
     * This operation can be used to upload a new certificate for an endpoint. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clientCertificatesPostTest() throws ApiException {
        File certificate = null;
        String alias = null;
        String apiId = null;
        String tier = null;
        ClientCertMetadataDTO response = api.clientCertificatesPost(certificate, alias, apiId, tier);

        // TODO: test validations
    }
    
}
