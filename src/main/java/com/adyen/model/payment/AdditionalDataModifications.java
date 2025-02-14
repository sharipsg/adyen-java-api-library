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
 * AdditionalDataModifications
 */

public class AdditionalDataModifications {
  public static final String SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_SELECTED_INSTALLMENT_OPTION = "installmentPaymentData.selectedInstallmentOption";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_SELECTED_INSTALLMENT_OPTION)
  private String installmentPaymentDataSelectedInstallmentOption;

  public AdditionalDataModifications() { 
  }

  public AdditionalDataModifications installmentPaymentDataSelectedInstallmentOption(String installmentPaymentDataSelectedInstallmentOption) {
    
    this.installmentPaymentDataSelectedInstallmentOption = installmentPaymentDataSelectedInstallmentOption;
    return this;
  }

   /**
   * This is the installment option selected by the shopper. It is required only if specified by the user.
   * @return installmentPaymentDataSelectedInstallmentOption
  **/
  @ApiModelProperty(value = "This is the installment option selected by the shopper. It is required only if specified by the user.")

  public String getInstallmentPaymentDataSelectedInstallmentOption() {
    return installmentPaymentDataSelectedInstallmentOption;
  }


  public void setInstallmentPaymentDataSelectedInstallmentOption(String installmentPaymentDataSelectedInstallmentOption) {
    this.installmentPaymentDataSelectedInstallmentOption = installmentPaymentDataSelectedInstallmentOption;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataModifications additionalDataModifications = (AdditionalDataModifications) o;
    return Objects.equals(this.installmentPaymentDataSelectedInstallmentOption, additionalDataModifications.installmentPaymentDataSelectedInstallmentOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentPaymentDataSelectedInstallmentOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataModifications {\n");
    sb.append("    installmentPaymentDataSelectedInstallmentOption: ").append(toIndentedString(installmentPaymentDataSelectedInstallmentOption)).append("\n");
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
    openapiFields.add("installmentPaymentData.selectedInstallmentOption");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalDataModifications
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalDataModifications.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalDataModifications is not found in the empty JSON string", AdditionalDataModifications.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalDataModifications.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdditionalDataModifications` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field installmentPaymentData.selectedInstallmentOption
      if (jsonObj.get("installmentPaymentData.selectedInstallmentOption") != null && !jsonObj.get("installmentPaymentData.selectedInstallmentOption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installmentPaymentData.selectedInstallmentOption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installmentPaymentData.selectedInstallmentOption").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalDataModifications.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalDataModifications' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalDataModifications> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalDataModifications.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalDataModifications>() {
           @Override
           public void write(JsonWriter out, AdditionalDataModifications value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalDataModifications read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdditionalDataModifications given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdditionalDataModifications
  * @throws IOException if the JSON string is invalid with respect to AdditionalDataModifications
  */
  public static AdditionalDataModifications fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalDataModifications.class);
  }

 /**
  * Convert an instance of AdditionalDataModifications to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

