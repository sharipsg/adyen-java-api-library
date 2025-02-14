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

import com.adyen.model.balanceplatform.JSON;

/**
 * SweepCounterparty
 */

public class SweepCounterparty {
  public static final String SERIALIZED_NAME_BALANCE_ACCOUNT_ID = "balanceAccountId";
  @SerializedName(SERIALIZED_NAME_BALANCE_ACCOUNT_ID)
  private String balanceAccountId;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_TRANSFER_INSTRUMENT_ID = "transferInstrumentId";
  @SerializedName(SERIALIZED_NAME_TRANSFER_INSTRUMENT_ID)
  private String transferInstrumentId;

  public SweepCounterparty() { 
  }

  public SweepCounterparty balanceAccountId(String balanceAccountId) {
    
    this.balanceAccountId = balanceAccountId;
    return this;
  }

   /**
   * The unique identifier of the destination or source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).   You can only use this for periodic sweep schedules such as &#x60;schedule.type&#x60; **daily** or **monthly**.
   * @return balanceAccountId
  **/
  @ApiModelProperty(value = "The unique identifier of the destination or source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).   You can only use this for periodic sweep schedules such as `schedule.type` **daily** or **monthly**.")

  public String getBalanceAccountId() {
    return balanceAccountId;
  }


  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }


  public SweepCounterparty merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account that will be the source of funds, if you are processing payments with Adyen. You can only use this with sweeps of &#x60;type&#x60; **pull** and &#x60;schedule.type&#x60; **balance**.
   * @return merchantAccount
  **/
  @ApiModelProperty(value = "The merchant account that will be the source of funds, if you are processing payments with Adyen. You can only use this with sweeps of `type` **pull** and `schedule.type` **balance**.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public SweepCounterparty transferInstrumentId(String transferInstrumentId) {
    
    this.transferInstrumentId = transferInstrumentId;
    return this;
  }

   /**
   * The unique identifier of the destination or source [transfer instrument](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/transferInstruments__resParam_id).  You can also use this in combination with a &#x60;merchantAccount&#x60; and a &#x60;type&#x60; **pull** to start a direct debit request from the source transfer instrument. To use this feature, reach out to your Adyen contact.
   * @return transferInstrumentId
  **/
  @ApiModelProperty(value = "The unique identifier of the destination or source [transfer instrument](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/transferInstruments__resParam_id).  You can also use this in combination with a `merchantAccount` and a `type` **pull** to start a direct debit request from the source transfer instrument. To use this feature, reach out to your Adyen contact.")

  public String getTransferInstrumentId() {
    return transferInstrumentId;
  }


  public void setTransferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SweepCounterparty sweepCounterparty = (SweepCounterparty) o;
    return Objects.equals(this.balanceAccountId, sweepCounterparty.balanceAccountId) &&
        Objects.equals(this.merchantAccount, sweepCounterparty.merchantAccount) &&
        Objects.equals(this.transferInstrumentId, sweepCounterparty.transferInstrumentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccountId, merchantAccount, transferInstrumentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SweepCounterparty {\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    transferInstrumentId: ").append(toIndentedString(transferInstrumentId)).append("\n");
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
    openapiFields.add("balanceAccountId");
    openapiFields.add("merchantAccount");
    openapiFields.add("transferInstrumentId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SweepCounterparty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SweepCounterparty.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SweepCounterparty is not found in the empty JSON string", SweepCounterparty.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SweepCounterparty.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SweepCounterparty` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field balanceAccountId
      if (jsonObj.get("balanceAccountId") != null && !jsonObj.get("balanceAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balanceAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balanceAccountId").toString()));
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field transferInstrumentId
      if (jsonObj.get("transferInstrumentId") != null && !jsonObj.get("transferInstrumentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferInstrumentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferInstrumentId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SweepCounterparty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SweepCounterparty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SweepCounterparty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SweepCounterparty.class));

       return (TypeAdapter<T>) new TypeAdapter<SweepCounterparty>() {
           @Override
           public void write(JsonWriter out, SweepCounterparty value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SweepCounterparty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SweepCounterparty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SweepCounterparty
  * @throws IOException if the JSON string is invalid with respect to SweepCounterparty
  */
  public static SweepCounterparty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SweepCounterparty.class);
  }

 /**
  * Convert an instance of SweepCounterparty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

