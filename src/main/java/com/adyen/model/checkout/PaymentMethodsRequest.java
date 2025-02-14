/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.checkout.Amount;
import com.adyen.model.checkout.EncryptedOrderData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.adyen.model.checkout.JSON;

/**
 * PaymentMethodsRequest
 */

public class PaymentMethodsRequest {
  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additionalData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private Map<String, String> additionalData = null;

  public static final String SERIALIZED_NAME_ALLOWED_PAYMENT_METHODS = "allowedPaymentMethods";
  @SerializedName(SERIALIZED_NAME_ALLOWED_PAYMENT_METHODS)
  private List<String> allowedPaymentMethods = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_BLOCKED_PAYMENT_METHODS = "blockedPaymentMethods";
  @SerializedName(SERIALIZED_NAME_BLOCKED_PAYMENT_METHODS)
  private List<String> blockedPaymentMethods = null;

  /**
   * The platform where a payment transaction takes place. This field can be used for filtering out payment methods that are only available on specific platforms. Possible values: * iOS * Android * Web
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    IOS("iOS"),
    
    ANDROID("Android"),
    
    WEB("Web");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelEnum fromValue(String value) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private ChannelEnum channel;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private EncryptedOrderData order;

  public static final String SERIALIZED_NAME_SHOPPER_LOCALE = "shopperLocale";
  @SerializedName(SERIALIZED_NAME_SHOPPER_LOCALE)
  private String shopperLocale;

  public static final String SERIALIZED_NAME_SHOPPER_REFERENCE = "shopperReference";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFERENCE)
  private String shopperReference;

  public static final String SERIALIZED_NAME_SPLIT_CARD_FUNDING_SOURCES = "splitCardFundingSources";
  @SerializedName(SERIALIZED_NAME_SPLIT_CARD_FUNDING_SOURCES)
  private Boolean splitCardFundingSources = false;

  public static final String SERIALIZED_NAME_STORE = "store";
  @SerializedName(SERIALIZED_NAME_STORE)
  private String store;

  public PaymentMethodsRequest() { 
  }

  public PaymentMethodsRequest additionalData(Map<String, String> additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

  public PaymentMethodsRequest putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * This field contains additional data, which may be required for a particular payment request.  The &#x60;additionalData&#x60; object consists of entries, each of which includes the key and value.
   * @return additionalData
  **/
  @ApiModelProperty(value = "This field contains additional data, which may be required for a particular payment request.  The `additionalData` object consists of entries, each of which includes the key and value.")

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public PaymentMethodsRequest allowedPaymentMethods(List<String> allowedPaymentMethods) {
    
    this.allowedPaymentMethods = allowedPaymentMethods;
    return this;
  }

  public PaymentMethodsRequest addAllowedPaymentMethodsItem(String allowedPaymentMethodsItem) {
    if (this.allowedPaymentMethods == null) {
      this.allowedPaymentMethods = new ArrayList<>();
    }
    this.allowedPaymentMethods.add(allowedPaymentMethodsItem);
    return this;
  }

   /**
   * List of payment methods to be presented to the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: &#x60;\&quot;allowedPaymentMethods\&quot;:[\&quot;ideal\&quot;,\&quot;giropay\&quot;]&#x60;
   * @return allowedPaymentMethods
  **/
  @ApiModelProperty(value = "List of payment methods to be presented to the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: `\"allowedPaymentMethods\":[\"ideal\",\"giropay\"]`")

  public List<String> getAllowedPaymentMethods() {
    return allowedPaymentMethods;
  }


  public void setAllowedPaymentMethods(List<String> allowedPaymentMethods) {
    this.allowedPaymentMethods = allowedPaymentMethods;
  }


  public PaymentMethodsRequest amount(Amount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")

  public Amount getAmount() {
    return amount;
  }


  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public PaymentMethodsRequest blockedPaymentMethods(List<String> blockedPaymentMethods) {
    
    this.blockedPaymentMethods = blockedPaymentMethods;
    return this;
  }

  public PaymentMethodsRequest addBlockedPaymentMethodsItem(String blockedPaymentMethodsItem) {
    if (this.blockedPaymentMethods == null) {
      this.blockedPaymentMethods = new ArrayList<>();
    }
    this.blockedPaymentMethods.add(blockedPaymentMethodsItem);
    return this;
  }

   /**
   * List of payment methods to be hidden from the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: &#x60;\&quot;blockedPaymentMethods\&quot;:[\&quot;ideal\&quot;,\&quot;giropay\&quot;]&#x60;
   * @return blockedPaymentMethods
  **/
  @ApiModelProperty(value = "List of payment methods to be hidden from the shopper. To refer to payment methods, use their [payment method type](https://docs.adyen.com/payment-methods/payment-method-types).  Example: `\"blockedPaymentMethods\":[\"ideal\",\"giropay\"]`")

  public List<String> getBlockedPaymentMethods() {
    return blockedPaymentMethods;
  }


  public void setBlockedPaymentMethods(List<String> blockedPaymentMethods) {
    this.blockedPaymentMethods = blockedPaymentMethods;
  }


  public PaymentMethodsRequest channel(ChannelEnum channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * The platform where a payment transaction takes place. This field can be used for filtering out payment methods that are only available on specific platforms. Possible values: * iOS * Android * Web
   * @return channel
  **/
  @ApiModelProperty(value = "The platform where a payment transaction takes place. This field can be used for filtering out payment methods that are only available on specific platforms. Possible values: * iOS * Android * Web")

  public ChannelEnum getChannel() {
    return channel;
  }


  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }


  public PaymentMethodsRequest countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The shopper&#39;s country code.
   * @return countryCode
  **/
  @ApiModelProperty(value = "The shopper's country code.")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public PaymentMethodsRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account identifier, with which you want to process the transaction.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account identifier, with which you want to process the transaction.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public PaymentMethodsRequest order(EncryptedOrderData order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")

  public EncryptedOrderData getOrder() {
    return order;
  }


  public void setOrder(EncryptedOrderData order) {
    this.order = order;
  }


  public PaymentMethodsRequest shopperLocale(String shopperLocale) {
    
    this.shopperLocale = shopperLocale;
    return this;
  }

   /**
   * The combination of a language code and a country code to specify the language to be used in the payment.
   * @return shopperLocale
  **/
  @ApiModelProperty(value = "The combination of a language code and a country code to specify the language to be used in the payment.")

  public String getShopperLocale() {
    return shopperLocale;
  }


  public void setShopperLocale(String shopperLocale) {
    this.shopperLocale = shopperLocale;
  }


  public PaymentMethodsRequest shopperReference(String shopperReference) {
    
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address.
   * @return shopperReference
  **/
  @ApiModelProperty(value = "Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. > Your reference must not include personally identifiable information (PII), for example name or email address.")

  public String getShopperReference() {
    return shopperReference;
  }


  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }


  public PaymentMethodsRequest splitCardFundingSources(Boolean splitCardFundingSources) {
    
    this.splitCardFundingSources = splitCardFundingSources;
    return this;
  }

   /**
   * Boolean value indicating whether the card payment method should be split into separate debit and credit options.
   * @return splitCardFundingSources
  **/
  @ApiModelProperty(value = "Boolean value indicating whether the card payment method should be split into separate debit and credit options.")

  public Boolean getSplitCardFundingSources() {
    return splitCardFundingSources;
  }


  public void setSplitCardFundingSources(Boolean splitCardFundingSources) {
    this.splitCardFundingSources = splitCardFundingSources;
  }


  public PaymentMethodsRequest store(String store) {
    
    this.store = store;
    return this;
  }

   /**
   * The ecommerce or point-of-sale store that is processing the payment. Used in [partner model integrations](https://docs.adyen.com/marketplaces-and-platforms/classic/platforms-for-partners#route-payments) for Adyen for Platforms.
   * @return store
  **/
  @ApiModelProperty(value = "The ecommerce or point-of-sale store that is processing the payment. Used in [partner model integrations](https://docs.adyen.com/marketplaces-and-platforms/classic/platforms-for-partners#route-payments) for Adyen for Platforms.")

  public String getStore() {
    return store;
  }


  public void setStore(String store) {
    this.store = store;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodsRequest paymentMethodsRequest = (PaymentMethodsRequest) o;
    return Objects.equals(this.additionalData, paymentMethodsRequest.additionalData) &&
        Objects.equals(this.allowedPaymentMethods, paymentMethodsRequest.allowedPaymentMethods) &&
        Objects.equals(this.amount, paymentMethodsRequest.amount) &&
        Objects.equals(this.blockedPaymentMethods, paymentMethodsRequest.blockedPaymentMethods) &&
        Objects.equals(this.channel, paymentMethodsRequest.channel) &&
        Objects.equals(this.countryCode, paymentMethodsRequest.countryCode) &&
        Objects.equals(this.merchantAccount, paymentMethodsRequest.merchantAccount) &&
        Objects.equals(this.order, paymentMethodsRequest.order) &&
        Objects.equals(this.shopperLocale, paymentMethodsRequest.shopperLocale) &&
        Objects.equals(this.shopperReference, paymentMethodsRequest.shopperReference) &&
        Objects.equals(this.splitCardFundingSources, paymentMethodsRequest.splitCardFundingSources) &&
        Objects.equals(this.store, paymentMethodsRequest.store);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, allowedPaymentMethods, amount, blockedPaymentMethods, channel, countryCode, merchantAccount, order, shopperLocale, shopperReference, splitCardFundingSources, store);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodsRequest {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    allowedPaymentMethods: ").append(toIndentedString(allowedPaymentMethods)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    blockedPaymentMethods: ").append(toIndentedString(blockedPaymentMethods)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    shopperLocale: ").append(toIndentedString(shopperLocale)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    splitCardFundingSources: ").append(toIndentedString(splitCardFundingSources)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
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
    openapiFields.add("additionalData");
    openapiFields.add("allowedPaymentMethods");
    openapiFields.add("amount");
    openapiFields.add("blockedPaymentMethods");
    openapiFields.add("channel");
    openapiFields.add("countryCode");
    openapiFields.add("merchantAccount");
    openapiFields.add("order");
    openapiFields.add("shopperLocale");
    openapiFields.add("shopperReference");
    openapiFields.add("splitCardFundingSources");
    openapiFields.add("store");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("merchantAccount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentMethodsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentMethodsRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentMethodsRequest is not found in the empty JSON string", PaymentMethodsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentMethodsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentMethodsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentMethodsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("allowedPaymentMethods") != null && !jsonObj.get("allowedPaymentMethods").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedPaymentMethods` to be an array in the JSON string but got `%s`", jsonObj.get("allowedPaymentMethods").toString()));
      }
      // validate the optional field `amount`
      if (jsonObj.getAsJsonObject("amount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      // ensure the json data is an array
      if (jsonObj.get("blockedPaymentMethods") != null && !jsonObj.get("blockedPaymentMethods").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `blockedPaymentMethods` to be an array in the JSON string but got `%s`", jsonObj.get("blockedPaymentMethods").toString()));
      }
      // ensure the field channel can be parsed to an enum value
      if (jsonObj.get("channel") != null) {
        if(!jsonObj.get("channel").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
        }
        ChannelEnum.fromValue(jsonObj.get("channel").getAsString());
      }
      // validate the optional field countryCode
      if (jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field `order`
      if (jsonObj.getAsJsonObject("order") != null) {
        EncryptedOrderData.validateJsonObject(jsonObj.getAsJsonObject("order"));
      }
      // validate the optional field shopperLocale
      if (jsonObj.get("shopperLocale") != null && !jsonObj.get("shopperLocale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperLocale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperLocale").toString()));
      }
      // validate the optional field shopperReference
      if (jsonObj.get("shopperReference") != null && !jsonObj.get("shopperReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperReference").toString()));
      }
      // validate the optional field store
      if (jsonObj.get("store") != null && !jsonObj.get("store").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodsRequest>() {
           @Override
           public void write(JsonWriter out, PaymentMethodsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodsRequest
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodsRequest
  */
  public static PaymentMethodsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodsRequest.class);
  }

 /**
  * Convert an instance of PaymentMethodsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

