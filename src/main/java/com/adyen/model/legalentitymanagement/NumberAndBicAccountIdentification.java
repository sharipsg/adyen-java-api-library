/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.legalentitymanagement.AdditionalBankIdentification;
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

import com.adyen.model.legalentitymanagement.JSON;

/**
 * NumberAndBicAccountIdentification
 */

public class NumberAndBicAccountIdentification {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_ADDITIONAL_BANK_IDENTIFICATION = "additionalBankIdentification";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_BANK_IDENTIFICATION)
  private AdditionalBankIdentification additionalBankIdentification;

  public static final String SERIALIZED_NAME_BIC = "bic";
  @SerializedName(SERIALIZED_NAME_BIC)
  private String bic;

  /**
   * **numberAndBic**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NUMBERANDBIC("numberAndBic");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.NUMBERANDBIC;

  public NumberAndBicAccountIdentification() { 
  }

  public NumberAndBicAccountIdentification accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The bank account number, without separators or whitespace. The length and format depends on the bank or country.
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The bank account number, without separators or whitespace. The length and format depends on the bank or country.")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public NumberAndBicAccountIdentification additionalBankIdentification(AdditionalBankIdentification additionalBankIdentification) {
    
    this.additionalBankIdentification = additionalBankIdentification;
    return this;
  }

   /**
   * Get additionalBankIdentification
   * @return additionalBankIdentification
  **/
  @ApiModelProperty(value = "")

  public AdditionalBankIdentification getAdditionalBankIdentification() {
    return additionalBankIdentification;
  }


  public void setAdditionalBankIdentification(AdditionalBankIdentification additionalBankIdentification) {
    this.additionalBankIdentification = additionalBankIdentification;
  }


  public NumberAndBicAccountIdentification bic(String bic) {
    
    this.bic = bic;
    return this;
  }

   /**
   * The bank&#39;s 8- or 11-character BIC or SWIFT code.
   * @return bic
  **/
  @ApiModelProperty(required = true, value = "The bank's 8- or 11-character BIC or SWIFT code.")

  public String getBic() {
    return bic;
  }


  public void setBic(String bic) {
    this.bic = bic;
  }


  public NumberAndBicAccountIdentification type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **numberAndBic**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**numberAndBic**")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
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
    NumberAndBicAccountIdentification numberAndBicAccountIdentification = (NumberAndBicAccountIdentification) o;
    return Objects.equals(this.accountNumber, numberAndBicAccountIdentification.accountNumber) &&
        Objects.equals(this.additionalBankIdentification, numberAndBicAccountIdentification.additionalBankIdentification) &&
        Objects.equals(this.bic, numberAndBicAccountIdentification.bic) &&
        Objects.equals(this.type, numberAndBicAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, additionalBankIdentification, bic, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberAndBicAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    additionalBankIdentification: ").append(toIndentedString(additionalBankIdentification)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
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
    openapiFields.add("accountNumber");
    openapiFields.add("additionalBankIdentification");
    openapiFields.add("bic");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountNumber");
    openapiRequiredFields.add("bic");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NumberAndBicAccountIdentification
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NumberAndBicAccountIdentification.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NumberAndBicAccountIdentification is not found in the empty JSON string", NumberAndBicAccountIdentification.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NumberAndBicAccountIdentification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NumberAndBicAccountIdentification` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NumberAndBicAccountIdentification.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field accountNumber
      if (jsonObj.get("accountNumber") != null && !jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      // validate the optional field `additionalBankIdentification`
      if (jsonObj.getAsJsonObject("additionalBankIdentification") != null) {
        AdditionalBankIdentification.validateJsonObject(jsonObj.getAsJsonObject("additionalBankIdentification"));
      }
      // validate the optional field bic
      if (jsonObj.get("bic") != null && !jsonObj.get("bic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bic").toString()));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NumberAndBicAccountIdentification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NumberAndBicAccountIdentification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NumberAndBicAccountIdentification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NumberAndBicAccountIdentification.class));

       return (TypeAdapter<T>) new TypeAdapter<NumberAndBicAccountIdentification>() {
           @Override
           public void write(JsonWriter out, NumberAndBicAccountIdentification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NumberAndBicAccountIdentification read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NumberAndBicAccountIdentification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NumberAndBicAccountIdentification
  * @throws IOException if the JSON string is invalid with respect to NumberAndBicAccountIdentification
  */
  public static NumberAndBicAccountIdentification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NumberAndBicAccountIdentification.class);
  }

 /**
  * Convert an instance of NumberAndBicAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

