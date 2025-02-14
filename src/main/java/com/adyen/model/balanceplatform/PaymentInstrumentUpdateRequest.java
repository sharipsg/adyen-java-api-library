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
import com.adyen.model.balanceplatform.CardInfo;
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
 * PaymentInstrumentUpdateRequest
 */

public class PaymentInstrumentUpdateRequest {
  public static final String SERIALIZED_NAME_BALANCE_ACCOUNT_ID = "balanceAccountId";
  @SerializedName(SERIALIZED_NAME_BALANCE_ACCOUNT_ID)
  private String balanceAccountId;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private CardInfo card;

  /**
   * The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the &#x60;card.formFactor&#x60; and the &#x60;issuingCountryCode&#x60;. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.   
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    CLOSED("closed"),
    
    INACTIVE("inactive"),
    
    SUSPENDED("suspended");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_STATUS_COMMENT = "statusComment";
  @SerializedName(SERIALIZED_NAME_STATUS_COMMENT)
  private String statusComment;

  /**
   * The reason for updating the status of the payment instrument.  Possible values: **lost**, **stolen**, **damaged**, **suspectedFraud**, **expired**, **endOfLife**, **accountClosure**, **other**. If the reason is **other**, you must also send the &#x60;statusComment&#x60; parameter describing the status change.
   */
  @JsonAdapter(StatusReasonEnum.Adapter.class)
  public enum StatusReasonEnum {
    ACCOUNTCLOSURE("accountClosure"),
    
    DAMAGED("damaged"),
    
    ENDOFLIFE("endOfLife"),
    
    EXPIRED("expired"),
    
    LOST("lost"),
    
    OTHER("other"),
    
    STOLEN("stolen"),
    
    SUSPECTEDFRAUD("suspectedFraud");

    private String value;

    StatusReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusReasonEnum fromValue(String value) {
      for (StatusReasonEnum b : StatusReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS_REASON = "statusReason";
  @SerializedName(SERIALIZED_NAME_STATUS_REASON)
  private StatusReasonEnum statusReason;

  public PaymentInstrumentUpdateRequest() { 
  }

  public PaymentInstrumentUpdateRequest balanceAccountId(String balanceAccountId) {
    
    this.balanceAccountId = balanceAccountId;
    return this;
  }

   /**
   * The unique identifier of the balance account associated with this payment instrument. &gt;You can only change the balance account ID if the payment instrument has **inactive** status.
   * @return balanceAccountId
  **/
  @ApiModelProperty(value = "The unique identifier of the balance account associated with this payment instrument. >You can only change the balance account ID if the payment instrument has **inactive** status.")

  public String getBalanceAccountId() {
    return balanceAccountId;
  }


  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }


  public PaymentInstrumentUpdateRequest card(CardInfo card) {
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")

  public CardInfo getCard() {
    return card;
  }


  public void setCard(CardInfo card) {
    this.card = card;
  }


  public PaymentInstrumentUpdateRequest status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the &#x60;card.formFactor&#x60; and the &#x60;issuingCountryCode&#x60;. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.   
   * @return status
  **/
  @ApiModelProperty(value = "The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the `card.formFactor` and the `issuingCountryCode`. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.   ")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public PaymentInstrumentUpdateRequest statusComment(String statusComment) {
    
    this.statusComment = statusComment;
    return this;
  }

   /**
   * Comment for the status of the payment instrument.  Required if &#x60;statusReason&#x60; is **other**.
   * @return statusComment
  **/
  @ApiModelProperty(value = "Comment for the status of the payment instrument.  Required if `statusReason` is **other**.")

  public String getStatusComment() {
    return statusComment;
  }


  public void setStatusComment(String statusComment) {
    this.statusComment = statusComment;
  }


  public PaymentInstrumentUpdateRequest statusReason(StatusReasonEnum statusReason) {
    
    this.statusReason = statusReason;
    return this;
  }

   /**
   * The reason for updating the status of the payment instrument.  Possible values: **lost**, **stolen**, **damaged**, **suspectedFraud**, **expired**, **endOfLife**, **accountClosure**, **other**. If the reason is **other**, you must also send the &#x60;statusComment&#x60; parameter describing the status change.
   * @return statusReason
  **/
  @ApiModelProperty(value = "The reason for updating the status of the payment instrument.  Possible values: **lost**, **stolen**, **damaged**, **suspectedFraud**, **expired**, **endOfLife**, **accountClosure**, **other**. If the reason is **other**, you must also send the `statusComment` parameter describing the status change.")

  public StatusReasonEnum getStatusReason() {
    return statusReason;
  }


  public void setStatusReason(StatusReasonEnum statusReason) {
    this.statusReason = statusReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentUpdateRequest paymentInstrumentUpdateRequest = (PaymentInstrumentUpdateRequest) o;
    return Objects.equals(this.balanceAccountId, paymentInstrumentUpdateRequest.balanceAccountId) &&
        Objects.equals(this.card, paymentInstrumentUpdateRequest.card) &&
        Objects.equals(this.status, paymentInstrumentUpdateRequest.status) &&
        Objects.equals(this.statusComment, paymentInstrumentUpdateRequest.statusComment) &&
        Objects.equals(this.statusReason, paymentInstrumentUpdateRequest.statusReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccountId, card, status, statusComment, statusReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentUpdateRequest {\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusComment: ").append(toIndentedString(statusComment)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
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
    openapiFields.add("card");
    openapiFields.add("status");
    openapiFields.add("statusComment");
    openapiFields.add("statusReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentInstrumentUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentInstrumentUpdateRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentInstrumentUpdateRequest is not found in the empty JSON string", PaymentInstrumentUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentInstrumentUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentInstrumentUpdateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field balanceAccountId
      if (jsonObj.get("balanceAccountId") != null && !jsonObj.get("balanceAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balanceAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balanceAccountId").toString()));
      }
      // validate the optional field `card`
      if (jsonObj.getAsJsonObject("card") != null) {
        CardInfo.validateJsonObject(jsonObj.getAsJsonObject("card"));
      }
      // ensure the field status can be parsed to an enum value
      if (jsonObj.get("status") != null) {
        if(!jsonObj.get("status").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
        }
        StatusEnum.fromValue(jsonObj.get("status").getAsString());
      }
      // validate the optional field statusComment
      if (jsonObj.get("statusComment") != null && !jsonObj.get("statusComment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusComment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusComment").toString()));
      }
      // ensure the field statusReason can be parsed to an enum value
      if (jsonObj.get("statusReason") != null) {
        if(!jsonObj.get("statusReason").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `statusReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusReason").toString()));
        }
        StatusReasonEnum.fromValue(jsonObj.get("statusReason").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentInstrumentUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentInstrumentUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentInstrumentUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentInstrumentUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentInstrumentUpdateRequest>() {
           @Override
           public void write(JsonWriter out, PaymentInstrumentUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentInstrumentUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentInstrumentUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentInstrumentUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to PaymentInstrumentUpdateRequest
  */
  public static PaymentInstrumentUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentInstrumentUpdateRequest.class);
  }

 /**
  * Convert an instance of PaymentInstrumentUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

