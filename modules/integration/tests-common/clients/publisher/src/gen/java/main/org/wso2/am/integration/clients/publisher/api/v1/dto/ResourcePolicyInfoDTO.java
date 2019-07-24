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


package org.wso2.am.integration.clients.publisher.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ResourcePolicyInfoDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-19T12:20:14.501+05:30")
public class ResourcePolicyInfoDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("httpVerb")
  private String httpVerb = null;

  @SerializedName("resourcePath")
  private String resourcePath = null;

  @SerializedName("content")
  private String content = null;

  public ResourcePolicyInfoDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * UUID of the resource policy registry artifact 
   * @return id
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "UUID of the resource policy registry artifact ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResourcePolicyInfoDTO httpVerb(String httpVerb) {
    this.httpVerb = httpVerb;
    return this;
  }

   /**
   * HTTP verb used for the resource path
   * @return httpVerb
  **/
  @ApiModelProperty(example = "get", value = "HTTP verb used for the resource path")
  public String getHttpVerb() {
    return httpVerb;
  }

  public void setHttpVerb(String httpVerb) {
    this.httpVerb = httpVerb;
  }

  public ResourcePolicyInfoDTO resourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
    return this;
  }

   /**
   * A string that represents the resource path of the api for the related resource policy
   * @return resourcePath
  **/
  @ApiModelProperty(example = "CalculatorAPI", value = "A string that represents the resource path of the api for the related resource policy")
  public String getResourcePath() {
    return resourcePath;
  }

  public void setResourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
  }

  public ResourcePolicyInfoDTO content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The resource policy content
   * @return content
  **/
  @ApiModelProperty(example = "<header description=\"SOAPAction\" name=\"SOAPAction\" scope=\"transport\" value=\"http://ws.cdyne.com/PhoneVerify/query/CheckPhoneNumber\"/>", value = "The resource policy content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourcePolicyInfoDTO resourcePolicyInfo = (ResourcePolicyInfoDTO) o;
    return Objects.equals(this.id, resourcePolicyInfo.id) &&
        Objects.equals(this.httpVerb, resourcePolicyInfo.httpVerb) &&
        Objects.equals(this.resourcePath, resourcePolicyInfo.resourcePath) &&
        Objects.equals(this.content, resourcePolicyInfo.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, httpVerb, resourcePath, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcePolicyInfoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    httpVerb: ").append(toIndentedString(httpVerb)).append("\n");
    sb.append("    resourcePath: ").append(toIndentedString(resourcePath)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

