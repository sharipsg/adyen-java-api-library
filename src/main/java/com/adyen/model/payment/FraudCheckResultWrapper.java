/*
 * Adyen Payment API
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.payment.FraudCheckResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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

import com.adyen.model.payment.JSON;

/**
 * FraudCheckResultWrapper
 */

public class FraudCheckResultWrapper {
  public static final String SERIALIZED_NAME_FRAUD_CHECK_RESULT = "FraudCheckResult";
  @SerializedName(SERIALIZED_NAME_FRAUD_CHECK_RESULT)
  private FraudCheckResult fraudCheckResult;

  public FraudCheckResultWrapper() { 
  }

  public FraudCheckResultWrapper fraudCheckResult(FraudCheckResult fraudCheckResult) {
    
    this.fraudCheckResult = fraudCheckResult;
    return this;
  }

   /**
   * Get fraudCheckResult
   * @return fraudCheckResult
  **/
  @ApiModelProperty(value = "")

  public FraudCheckResult getFraudCheckResult() {
    return fraudCheckResult;
  }


  public void setFraudCheckResult(FraudCheckResult fraudCheckResult) {
    this.fraudCheckResult = fraudCheckResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudCheckResultWrapper fraudCheckResultWrapper = (FraudCheckResultWrapper) o;
    return Objects.equals(this.fraudCheckResult, fraudCheckResultWrapper.fraudCheckResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fraudCheckResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudCheckResultWrapper {\n");
    sb.append("    fraudCheckResult: ").append(toIndentedString(fraudCheckResult)).append("\n");
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
    openapiFields.add("FraudCheckResult");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FraudCheckResultWrapper
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FraudCheckResultWrapper.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FraudCheckResultWrapper is not found in the empty JSON string", FraudCheckResultWrapper.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FraudCheckResultWrapper.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FraudCheckResultWrapper` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `FraudCheckResult`
      if (jsonObj.getAsJsonObject("FraudCheckResult") != null) {
        FraudCheckResult.validateJsonObject(jsonObj.getAsJsonObject("FraudCheckResult"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FraudCheckResultWrapper.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FraudCheckResultWrapper' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FraudCheckResultWrapper> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FraudCheckResultWrapper.class));

       return (TypeAdapter<T>) new TypeAdapter<FraudCheckResultWrapper>() {
           @Override
           public void write(JsonWriter out, FraudCheckResultWrapper value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FraudCheckResultWrapper read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FraudCheckResultWrapper given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FraudCheckResultWrapper
  * @throws IOException if the JSON string is invalid with respect to FraudCheckResultWrapper
  */
  public static FraudCheckResultWrapper fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FraudCheckResultWrapper.class);
  }

 /**
  * Convert an instance of FraudCheckResultWrapper to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

