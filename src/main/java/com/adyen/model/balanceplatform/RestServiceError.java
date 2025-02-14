/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.balanceplatform.InvalidField;
import com.adyen.model.balanceplatform.JSONObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.balanceplatform.JSON;

/**
 * RestServiceError
 */

public class RestServiceError {
  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private String instance;

  public static final String SERIALIZED_NAME_INVALID_FIELDS = "invalidFields";
  @SerializedName(SERIALIZED_NAME_INVALID_FIELDS)
  private List<InvalidField> invalidFields = null;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private JSONObject response;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public RestServiceError() { 
  }

  public RestServiceError detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * A human-readable explanation specific to this occurrence of the problem.
   * @return detail
  **/
  @ApiModelProperty(required = true, value = "A human-readable explanation specific to this occurrence of the problem.")

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  public RestServiceError errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * A code that identifies the problem type.
   * @return errorCode
  **/
  @ApiModelProperty(required = true, value = "A code that identifies the problem type.")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public RestServiceError instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * A unique URI that identifies the specific occurrence of the problem.
   * @return instance
  **/
  @ApiModelProperty(value = "A unique URI that identifies the specific occurrence of the problem.")

  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    this.instance = instance;
  }


  public RestServiceError invalidFields(List<InvalidField> invalidFields) {
    
    this.invalidFields = invalidFields;
    return this;
  }

  public RestServiceError addInvalidFieldsItem(InvalidField invalidFieldsItem) {
    if (this.invalidFields == null) {
      this.invalidFields = new ArrayList<>();
    }
    this.invalidFields.add(invalidFieldsItem);
    return this;
  }

   /**
   * Detailed explanation of each validation error, when applicable.
   * @return invalidFields
  **/
  @ApiModelProperty(value = "Detailed explanation of each validation error, when applicable.")

  public List<InvalidField> getInvalidFields() {
    return invalidFields;
  }


  public void setInvalidFields(List<InvalidField> invalidFields) {
    this.invalidFields = invalidFields;
  }


  public RestServiceError requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique reference for the request, essentially the same as &#x60;pspReference&#x60;.
   * @return requestId
  **/
  @ApiModelProperty(value = "A unique reference for the request, essentially the same as `pspReference`.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public RestServiceError response(JSONObject response) {
    
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(value = "")

  public JSONObject getResponse() {
    return response;
  }


  public void setResponse(JSONObject response) {
    this.response = response;
  }


  public RestServiceError status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * The HTTP status code.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The HTTP status code.")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public RestServiceError title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * A short, human-readable summary of the problem type.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "A short, human-readable summary of the problem type.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public RestServiceError type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * A URI that identifies the problem type, pointing to human-readable documentation on this problem type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "A URI that identifies the problem type, pointing to human-readable documentation on this problem type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestServiceError restServiceError = (RestServiceError) o;
    return Objects.equals(this.detail, restServiceError.detail) &&
        Objects.equals(this.errorCode, restServiceError.errorCode) &&
        Objects.equals(this.instance, restServiceError.instance) &&
        Objects.equals(this.invalidFields, restServiceError.invalidFields) &&
        Objects.equals(this.requestId, restServiceError.requestId) &&
        Objects.equals(this.response, restServiceError.response) &&
        Objects.equals(this.status, restServiceError.status) &&
        Objects.equals(this.title, restServiceError.title) &&
        Objects.equals(this.type, restServiceError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, errorCode, instance, invalidFields, requestId, response, status, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestServiceError {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    invalidFields: ").append(toIndentedString(invalidFields)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("detail");
    openapiFields.add("errorCode");
    openapiFields.add("instance");
    openapiFields.add("invalidFields");
    openapiFields.add("requestId");
    openapiFields.add("response");
    openapiFields.add("status");
    openapiFields.add("title");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("detail");
    openapiRequiredFields.add("errorCode");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RestServiceError
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RestServiceError.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RestServiceError is not found in the empty JSON string", RestServiceError.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RestServiceError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RestServiceError` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RestServiceError.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field detail
      if (jsonObj.get("detail") != null && !jsonObj.get("detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail").toString()));
      }
      // validate the optional field errorCode
      if (jsonObj.get("errorCode") != null && !jsonObj.get("errorCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorCode").toString()));
      }
      // validate the optional field instance
      if (jsonObj.get("instance") != null && !jsonObj.get("instance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instance").toString()));
      }
      JsonArray jsonArrayinvalidFields = jsonObj.getAsJsonArray("invalidFields");
      if (jsonArrayinvalidFields != null) {
        // ensure the json data is an array
        if (!jsonObj.get("invalidFields").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `invalidFields` to be an array in the JSON string but got `%s`", jsonObj.get("invalidFields").toString()));
        }

        // validate the optional field `invalidFields` (array)
        for (int i = 0; i < jsonArrayinvalidFields.size(); i++) {
          InvalidField.validateJsonObject(jsonArrayinvalidFields.get(i).getAsJsonObject());
        }
      }
      // validate the optional field requestId
      if (jsonObj.get("requestId") != null && !jsonObj.get("requestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestId").toString()));
      }
      // validate the optional field `response`
      if (jsonObj.getAsJsonObject("response") != null) {
        JSONObject.validateJsonObject(jsonObj.getAsJsonObject("response"));
      }
      // validate the optional field title
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the optional field type
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RestServiceError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RestServiceError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RestServiceError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RestServiceError.class));

       return (TypeAdapter<T>) new TypeAdapter<RestServiceError>() {
           @Override
           public void write(JsonWriter out, RestServiceError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RestServiceError read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RestServiceError given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RestServiceError
  * @throws IOException if the JSON string is invalid with respect to RestServiceError
  */
  public static RestServiceError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RestServiceError.class);
  }

 /**
  * Convert an instance of RestServiceError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

