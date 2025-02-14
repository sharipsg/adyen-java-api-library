/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payout;

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

import com.adyen.model.payout.JSON;

/**
 * FraudCheckResult
 */

public class FraudCheckResult {
  public static final String SERIALIZED_NAME_ACCOUNT_SCORE = "accountScore";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SCORE)
  private Integer accountScore;

  public static final String SERIALIZED_NAME_CHECK_ID = "checkId";
  @SerializedName(SERIALIZED_NAME_CHECK_ID)
  private Integer checkId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public FraudCheckResult() { 
  }

  public FraudCheckResult accountScore(Integer accountScore) {
    
    this.accountScore = accountScore;
    return this;
  }

   /**
   * The fraud score generated by the risk check.
   * @return accountScore
  **/
  @ApiModelProperty(required = true, value = "The fraud score generated by the risk check.")

  public Integer getAccountScore() {
    return accountScore;
  }


  public void setAccountScore(Integer accountScore) {
    this.accountScore = accountScore;
  }


  public FraudCheckResult checkId(Integer checkId) {
    
    this.checkId = checkId;
    return this;
  }

   /**
   * The ID of the risk check.
   * @return checkId
  **/
  @ApiModelProperty(required = true, value = "The ID of the risk check.")

  public Integer getCheckId() {
    return checkId;
  }


  public void setCheckId(Integer checkId) {
    this.checkId = checkId;
  }


  public FraudCheckResult name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the risk check.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the risk check.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudCheckResult fraudCheckResult = (FraudCheckResult) o;
    return Objects.equals(this.accountScore, fraudCheckResult.accountScore) &&
        Objects.equals(this.checkId, fraudCheckResult.checkId) &&
        Objects.equals(this.name, fraudCheckResult.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountScore, checkId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudCheckResult {\n");
    sb.append("    accountScore: ").append(toIndentedString(accountScore)).append("\n");
    sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("accountScore");
    openapiFields.add("checkId");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountScore");
    openapiRequiredFields.add("checkId");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FraudCheckResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FraudCheckResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FraudCheckResult is not found in the empty JSON string", FraudCheckResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FraudCheckResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FraudCheckResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FraudCheckResult.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field name
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FraudCheckResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FraudCheckResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FraudCheckResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FraudCheckResult.class));

       return (TypeAdapter<T>) new TypeAdapter<FraudCheckResult>() {
           @Override
           public void write(JsonWriter out, FraudCheckResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FraudCheckResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FraudCheckResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FraudCheckResult
  * @throws IOException if the JSON string is invalid with respect to FraudCheckResult
  */
  public static FraudCheckResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FraudCheckResult.class);
  }

 /**
  * Convert an instance of FraudCheckResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

