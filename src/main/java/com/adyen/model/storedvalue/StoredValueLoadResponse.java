/*
 * Adyen Stored Value API
 * A set of API endpoints to manage stored value products.
 *
 * The version of the OpenAPI document: 46
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.storedvalue;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.storedvalue.Amount;
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

import com.adyen.model.storedvalue.JSON;

/**
 * StoredValueLoadResponse
 */

public class StoredValueLoadResponse {
  public static final String SERIALIZED_NAME_AUTH_CODE = "authCode";
  @SerializedName(SERIALIZED_NAME_AUTH_CODE)
  private String authCode;

  public static final String SERIALIZED_NAME_CURRENT_BALANCE = "currentBalance";
  @SerializedName(SERIALIZED_NAME_CURRENT_BALANCE)
  private Amount currentBalance;

  public static final String SERIALIZED_NAME_PSP_REFERENCE = "pspReference";
  @SerializedName(SERIALIZED_NAME_PSP_REFERENCE)
  private String pspReference;

  public static final String SERIALIZED_NAME_REFUSAL_REASON = "refusalReason";
  @SerializedName(SERIALIZED_NAME_REFUSAL_REASON)
  private String refusalReason;

  /**
   * The result of the payment. Possible values:  * **Success** – The operation has been completed successfully.  * **Refused** – The operation was refused. The reason is given in the &#x60;refusalReason&#x60; field.  * **Error** – There was an error when the operation was processed. The reason is given in the &#x60;refusalReason&#x60; field.  * **NotEnoughBalance** – The amount on the payment method is lower than the amount given in the request. Only applicable to balance checks.  
   */
  @JsonAdapter(ResultCodeEnum.Adapter.class)
  public enum ResultCodeEnum {
    SUCCESS("Success"),
    
    REFUSED("Refused"),
    
    ERROR("Error"),
    
    NOTENOUGHBALANCE("NotEnoughBalance");

    private String value;

    ResultCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultCodeEnum fromValue(String value) {
      for (ResultCodeEnum b : ResultCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResultCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResultCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESULT_CODE = "resultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private ResultCodeEnum resultCode;

  public static final String SERIALIZED_NAME_THIRD_PARTY_REFUSAL_REASON = "thirdPartyRefusalReason";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_REFUSAL_REASON)
  private String thirdPartyRefusalReason;

  public StoredValueLoadResponse() { 
  }

  public StoredValueLoadResponse authCode(String authCode) {
    
    this.authCode = authCode;
    return this;
  }

   /**
   * Authorisation code: * When the payment is authorised, this field holds the authorisation code for the payment. * When the payment is not authorised, this field is empty.
   * @return authCode
  **/
  @ApiModelProperty(value = "Authorisation code: * When the payment is authorised, this field holds the authorisation code for the payment. * When the payment is not authorised, this field is empty.")

  public String getAuthCode() {
    return authCode;
  }


  public void setAuthCode(String authCode) {
    this.authCode = authCode;
  }


  public StoredValueLoadResponse currentBalance(Amount currentBalance) {
    
    this.currentBalance = currentBalance;
    return this;
  }

   /**
   * Get currentBalance
   * @return currentBalance
  **/
  @ApiModelProperty(value = "")

  public Amount getCurrentBalance() {
    return currentBalance;
  }


  public void setCurrentBalance(Amount currentBalance) {
    this.currentBalance = currentBalance;
  }


  public StoredValueLoadResponse pspReference(String pspReference) {
    
    this.pspReference = pspReference;
    return this;
  }

   /**
   * Adyen&#39;s 16-character string reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request.
   * @return pspReference
  **/
  @ApiModelProperty(value = "Adyen's 16-character string reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request.")

  public String getPspReference() {
    return pspReference;
  }


  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public StoredValueLoadResponse refusalReason(String refusalReason) {
    
    this.refusalReason = refusalReason;
    return this;
  }

   /**
   * If the transaction is refused or an error occurs, this field holds Adyen&#39;s mapped reason for the refusal or a description of the error.  When a transaction fails, the authorisation response includes &#x60;resultCode&#x60; and &#x60;refusalReason&#x60; values.
   * @return refusalReason
  **/
  @ApiModelProperty(value = "If the transaction is refused or an error occurs, this field holds Adyen's mapped reason for the refusal or a description of the error.  When a transaction fails, the authorisation response includes `resultCode` and `refusalReason` values.")

  public String getRefusalReason() {
    return refusalReason;
  }


  public void setRefusalReason(String refusalReason) {
    this.refusalReason = refusalReason;
  }


  public StoredValueLoadResponse resultCode(ResultCodeEnum resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * The result of the payment. Possible values:  * **Success** – The operation has been completed successfully.  * **Refused** – The operation was refused. The reason is given in the &#x60;refusalReason&#x60; field.  * **Error** – There was an error when the operation was processed. The reason is given in the &#x60;refusalReason&#x60; field.  * **NotEnoughBalance** – The amount on the payment method is lower than the amount given in the request. Only applicable to balance checks.  
   * @return resultCode
  **/
  @ApiModelProperty(value = "The result of the payment. Possible values:  * **Success** – The operation has been completed successfully.  * **Refused** – The operation was refused. The reason is given in the `refusalReason` field.  * **Error** – There was an error when the operation was processed. The reason is given in the `refusalReason` field.  * **NotEnoughBalance** – The amount on the payment method is lower than the amount given in the request. Only applicable to balance checks.  ")

  public ResultCodeEnum getResultCode() {
    return resultCode;
  }


  public void setResultCode(ResultCodeEnum resultCode) {
    this.resultCode = resultCode;
  }


  public StoredValueLoadResponse thirdPartyRefusalReason(String thirdPartyRefusalReason) {
    
    this.thirdPartyRefusalReason = thirdPartyRefusalReason;
    return this;
  }

   /**
   * Raw refusal reason received from the third party, where available
   * @return thirdPartyRefusalReason
  **/
  @ApiModelProperty(value = "Raw refusal reason received from the third party, where available")

  public String getThirdPartyRefusalReason() {
    return thirdPartyRefusalReason;
  }


  public void setThirdPartyRefusalReason(String thirdPartyRefusalReason) {
    this.thirdPartyRefusalReason = thirdPartyRefusalReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredValueLoadResponse storedValueLoadResponse = (StoredValueLoadResponse) o;
    return Objects.equals(this.authCode, storedValueLoadResponse.authCode) &&
        Objects.equals(this.currentBalance, storedValueLoadResponse.currentBalance) &&
        Objects.equals(this.pspReference, storedValueLoadResponse.pspReference) &&
        Objects.equals(this.refusalReason, storedValueLoadResponse.refusalReason) &&
        Objects.equals(this.resultCode, storedValueLoadResponse.resultCode) &&
        Objects.equals(this.thirdPartyRefusalReason, storedValueLoadResponse.thirdPartyRefusalReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authCode, currentBalance, pspReference, refusalReason, resultCode, thirdPartyRefusalReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredValueLoadResponse {\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    refusalReason: ").append(toIndentedString(refusalReason)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    thirdPartyRefusalReason: ").append(toIndentedString(thirdPartyRefusalReason)).append("\n");
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
    openapiFields.add("authCode");
    openapiFields.add("currentBalance");
    openapiFields.add("pspReference");
    openapiFields.add("refusalReason");
    openapiFields.add("resultCode");
    openapiFields.add("thirdPartyRefusalReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StoredValueLoadResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StoredValueLoadResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StoredValueLoadResponse is not found in the empty JSON string", StoredValueLoadResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StoredValueLoadResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StoredValueLoadResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field authCode
      if (jsonObj.get("authCode") != null && !jsonObj.get("authCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authCode").toString()));
      }
      // validate the optional field `currentBalance`
      if (jsonObj.getAsJsonObject("currentBalance") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("currentBalance"));
      }
      // validate the optional field pspReference
      if (jsonObj.get("pspReference") != null && !jsonObj.get("pspReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pspReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pspReference").toString()));
      }
      // validate the optional field refusalReason
      if (jsonObj.get("refusalReason") != null && !jsonObj.get("refusalReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refusalReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refusalReason").toString()));
      }
      // ensure the field resultCode can be parsed to an enum value
      if (jsonObj.get("resultCode") != null) {
        if(!jsonObj.get("resultCode").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `resultCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultCode").toString()));
        }
        ResultCodeEnum.fromValue(jsonObj.get("resultCode").getAsString());
      }
      // validate the optional field thirdPartyRefusalReason
      if (jsonObj.get("thirdPartyRefusalReason") != null && !jsonObj.get("thirdPartyRefusalReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thirdPartyRefusalReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thirdPartyRefusalReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StoredValueLoadResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StoredValueLoadResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StoredValueLoadResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StoredValueLoadResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<StoredValueLoadResponse>() {
           @Override
           public void write(JsonWriter out, StoredValueLoadResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StoredValueLoadResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StoredValueLoadResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StoredValueLoadResponse
  * @throws IOException if the JSON string is invalid with respect to StoredValueLoadResponse
  */
  public static StoredValueLoadResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StoredValueLoadResponse.class);
  }

 /**
  * Convert an instance of StoredValueLoadResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

