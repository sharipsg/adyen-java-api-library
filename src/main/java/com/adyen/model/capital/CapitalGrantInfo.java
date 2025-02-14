/*
 * Capital API
 * Adyen Capital allows you to build an embedded financing offering for your users to serve their operational needs. Learn more about [Adyen Capital](https://docs.adyen.com/marketplaces-and-platforms/capital).  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -H \"Content-Type: application/json\" \\ -U \"ws@BalancePlatform.YOUR_BALANCE_PLATFORM\":\"YOUR_WS_PASSWORD\" \\ ... ``` ## Roles and permissions To use the Capital API, you need an additional role for your API credential. Your Adyen contact will set up the roles and permissions for you. ## Versioning The Capital API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://balanceplatform-api-test.adyen.com/btl/v3/grants ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the username and password to send requests to `https://balanceplatform-api-live.adyen.com/btl/v3`.  
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.capital;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.capital.Counterparty;
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

import com.adyen.model.capital.JSON;

/**
 * CapitalGrantInfo
 */

public class CapitalGrantInfo {
  public static final String SERIALIZED_NAME_COUNTERPARTY = "counterparty";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY)
  private Counterparty counterparty;

  public static final String SERIALIZED_NAME_GRANT_ACCOUNT_ID = "grantAccountId";
  @SerializedName(SERIALIZED_NAME_GRANT_ACCOUNT_ID)
  private String grantAccountId;

  public static final String SERIALIZED_NAME_GRANT_OFFER_ID = "grantOfferId";
  @SerializedName(SERIALIZED_NAME_GRANT_OFFER_ID)
  private String grantOfferId;

  public CapitalGrantInfo() { 
  }

  public CapitalGrantInfo counterparty(Counterparty counterparty) {
    
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @ApiModelProperty(value = "")

  public Counterparty getCounterparty() {
    return counterparty;
  }


  public void setCounterparty(Counterparty counterparty) {
    this.counterparty = counterparty;
  }


  public CapitalGrantInfo grantAccountId(String grantAccountId) {
    
    this.grantAccountId = grantAccountId;
    return this;
  }

   /**
   * The identifier of the grant account used for the grant.
   * @return grantAccountId
  **/
  @ApiModelProperty(required = true, value = "The identifier of the grant account used for the grant.")

  public String getGrantAccountId() {
    return grantAccountId;
  }


  public void setGrantAccountId(String grantAccountId) {
    this.grantAccountId = grantAccountId;
  }


  public CapitalGrantInfo grantOfferId(String grantOfferId) {
    
    this.grantOfferId = grantOfferId;
    return this;
  }

   /**
   * The identifier of the grant offer that has been selected and from which the grant details will be used.
   * @return grantOfferId
  **/
  @ApiModelProperty(required = true, value = "The identifier of the grant offer that has been selected and from which the grant details will be used.")

  public String getGrantOfferId() {
    return grantOfferId;
  }


  public void setGrantOfferId(String grantOfferId) {
    this.grantOfferId = grantOfferId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapitalGrantInfo capitalGrantInfo = (CapitalGrantInfo) o;
    return Objects.equals(this.counterparty, capitalGrantInfo.counterparty) &&
        Objects.equals(this.grantAccountId, capitalGrantInfo.grantAccountId) &&
        Objects.equals(this.grantOfferId, capitalGrantInfo.grantOfferId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counterparty, grantAccountId, grantOfferId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapitalGrantInfo {\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    grantAccountId: ").append(toIndentedString(grantAccountId)).append("\n");
    sb.append("    grantOfferId: ").append(toIndentedString(grantOfferId)).append("\n");
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
    openapiFields.add("counterparty");
    openapiFields.add("grantAccountId");
    openapiFields.add("grantOfferId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("grantAccountId");
    openapiRequiredFields.add("grantOfferId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CapitalGrantInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CapitalGrantInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CapitalGrantInfo is not found in the empty JSON string", CapitalGrantInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CapitalGrantInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CapitalGrantInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CapitalGrantInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `counterparty`
      if (jsonObj.getAsJsonObject("counterparty") != null) {
        Counterparty.validateJsonObject(jsonObj.getAsJsonObject("counterparty"));
      }
      // validate the optional field grantAccountId
      if (jsonObj.get("grantAccountId") != null && !jsonObj.get("grantAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grantAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grantAccountId").toString()));
      }
      // validate the optional field grantOfferId
      if (jsonObj.get("grantOfferId") != null && !jsonObj.get("grantOfferId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grantOfferId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grantOfferId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CapitalGrantInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CapitalGrantInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CapitalGrantInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CapitalGrantInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CapitalGrantInfo>() {
           @Override
           public void write(JsonWriter out, CapitalGrantInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CapitalGrantInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CapitalGrantInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CapitalGrantInfo
  * @throws IOException if the JSON string is invalid with respect to CapitalGrantInfo
  */
  public static CapitalGrantInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CapitalGrantInfo.class);
  }

 /**
  * Convert an instance of CapitalGrantInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

