/*
 * Adyen Data Protection API
 * Adyen Data Protection API provides a way for you to process [Subject Erasure Requests](https://gdpr-info.eu/art-17-gdpr/) as mandated in GDPR.  Use our API to submit a request to delete shopper's data, including payment details and other related information (for example, delivery address or shopper email).## Authentication Each request to the Data Protection API must be signed with an API key. Get your API Key from your Customer Area, as described in [How to get the API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key). Then set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: Your_API_key\" \\ ... ``` Note that when going live, you need to generate a new API Key to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning Data Protection Service API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://ca-test.adyen.com/ca/services/DataProtectionService/v1/requestSubjectErasure ```
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.dataprotection;

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

import com.adyen.model.dataprotection.JSON;

/**
 * SubjectErasureByPspReferenceRequest
 */

public class SubjectErasureByPspReferenceRequest {
  public static final String SERIALIZED_NAME_FORCE_ERASURE = "forceErasure";
  @SerializedName(SERIALIZED_NAME_FORCE_ERASURE)
  private Boolean forceErasure;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_PSP_REFERENCE = "pspReference";
  @SerializedName(SERIALIZED_NAME_PSP_REFERENCE)
  private String pspReference;

  public SubjectErasureByPspReferenceRequest() { 
  }

  public SubjectErasureByPspReferenceRequest forceErasure(Boolean forceErasure) {
    
    this.forceErasure = forceErasure;
    return this;
  }

   /**
   * Set this to **true** if you want to delete shopper-related data, even if the shopper has an existing recurring transaction. This only deletes the shopper-related data for the specific payment, but does not cancel the existing recurring transaction.
   * @return forceErasure
  **/
  @ApiModelProperty(value = "Set this to **true** if you want to delete shopper-related data, even if the shopper has an existing recurring transaction. This only deletes the shopper-related data for the specific payment, but does not cancel the existing recurring transaction.")

  public Boolean getForceErasure() {
    return forceErasure;
  }


  public void setForceErasure(Boolean forceErasure) {
    this.forceErasure = forceErasure;
  }


  public SubjectErasureByPspReferenceRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * Your merchant account
   * @return merchantAccount
  **/
  @ApiModelProperty(value = "Your merchant account")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public SubjectErasureByPspReferenceRequest pspReference(String pspReference) {
    
    this.pspReference = pspReference;
    return this;
  }

   /**
   * The PSP reference of the payment. We will delete all shopper-related data for this payment.
   * @return pspReference
  **/
  @ApiModelProperty(value = "The PSP reference of the payment. We will delete all shopper-related data for this payment.")

  public String getPspReference() {
    return pspReference;
  }


  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubjectErasureByPspReferenceRequest subjectErasureByPspReferenceRequest = (SubjectErasureByPspReferenceRequest) o;
    return Objects.equals(this.forceErasure, subjectErasureByPspReferenceRequest.forceErasure) &&
        Objects.equals(this.merchantAccount, subjectErasureByPspReferenceRequest.merchantAccount) &&
        Objects.equals(this.pspReference, subjectErasureByPspReferenceRequest.pspReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forceErasure, merchantAccount, pspReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectErasureByPspReferenceRequest {\n");
    sb.append("    forceErasure: ").append(toIndentedString(forceErasure)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
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
    openapiFields.add("forceErasure");
    openapiFields.add("merchantAccount");
    openapiFields.add("pspReference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubjectErasureByPspReferenceRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubjectErasureByPspReferenceRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubjectErasureByPspReferenceRequest is not found in the empty JSON string", SubjectErasureByPspReferenceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubjectErasureByPspReferenceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubjectErasureByPspReferenceRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field pspReference
      if (jsonObj.get("pspReference") != null && !jsonObj.get("pspReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pspReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pspReference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubjectErasureByPspReferenceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubjectErasureByPspReferenceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubjectErasureByPspReferenceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubjectErasureByPspReferenceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SubjectErasureByPspReferenceRequest>() {
           @Override
           public void write(JsonWriter out, SubjectErasureByPspReferenceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubjectErasureByPspReferenceRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubjectErasureByPspReferenceRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubjectErasureByPspReferenceRequest
  * @throws IOException if the JSON string is invalid with respect to SubjectErasureByPspReferenceRequest
  */
  public static SubjectErasureByPspReferenceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubjectErasureByPspReferenceRequest.class);
  }

 /**
  * Convert an instance of SubjectErasureByPspReferenceRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

