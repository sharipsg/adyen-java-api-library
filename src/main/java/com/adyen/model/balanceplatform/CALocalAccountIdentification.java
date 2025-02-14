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
 * CALocalAccountIdentification
 */

public class CALocalAccountIdentification {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  /**
   * The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    CHECKING("checking"),
    
    SAVINGS("savings");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AccountTypeEnum accountType = AccountTypeEnum.CHECKING;

  public static final String SERIALIZED_NAME_INSTITUTION_NUMBER = "institutionNumber";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NUMBER)
  private String institutionNumber;

  public static final String SERIALIZED_NAME_TRANSIT_NUMBER = "transitNumber";
  @SerializedName(SERIALIZED_NAME_TRANSIT_NUMBER)
  private String transitNumber;

  /**
   * **caLocal**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CALOCAL("caLocal");

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
  private TypeEnum type = TypeEnum.CALOCAL;

  public CALocalAccountIdentification() { 
  }

  public CALocalAccountIdentification accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The 5- to 12-digit bank account number, without separators or whitespace.
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The 5- to 12-digit bank account number, without separators or whitespace.")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public CALocalAccountIdentification accountType(AccountTypeEnum accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.
   * @return accountType
  **/
  @ApiModelProperty(value = "The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.")

  public AccountTypeEnum getAccountType() {
    return accountType;
  }


  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  public CALocalAccountIdentification institutionNumber(String institutionNumber) {
    
    this.institutionNumber = institutionNumber;
    return this;
  }

   /**
   * The 3-digit institution number, without separators or whitespace.
   * @return institutionNumber
  **/
  @ApiModelProperty(required = true, value = "The 3-digit institution number, without separators or whitespace.")

  public String getInstitutionNumber() {
    return institutionNumber;
  }


  public void setInstitutionNumber(String institutionNumber) {
    this.institutionNumber = institutionNumber;
  }


  public CALocalAccountIdentification transitNumber(String transitNumber) {
    
    this.transitNumber = transitNumber;
    return this;
  }

   /**
   * The 5-digit transit number, without separators or whitespace.
   * @return transitNumber
  **/
  @ApiModelProperty(required = true, value = "The 5-digit transit number, without separators or whitespace.")

  public String getTransitNumber() {
    return transitNumber;
  }


  public void setTransitNumber(String transitNumber) {
    this.transitNumber = transitNumber;
  }


  public CALocalAccountIdentification type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **caLocal**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**caLocal**")

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
    CALocalAccountIdentification caLocalAccountIdentification = (CALocalAccountIdentification) o;
    return Objects.equals(this.accountNumber, caLocalAccountIdentification.accountNumber) &&
        Objects.equals(this.accountType, caLocalAccountIdentification.accountType) &&
        Objects.equals(this.institutionNumber, caLocalAccountIdentification.institutionNumber) &&
        Objects.equals(this.transitNumber, caLocalAccountIdentification.transitNumber) &&
        Objects.equals(this.type, caLocalAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountType, institutionNumber, transitNumber, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CALocalAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    institutionNumber: ").append(toIndentedString(institutionNumber)).append("\n");
    sb.append("    transitNumber: ").append(toIndentedString(transitNumber)).append("\n");
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
    openapiFields.add("accountType");
    openapiFields.add("institutionNumber");
    openapiFields.add("transitNumber");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountNumber");
    openapiRequiredFields.add("institutionNumber");
    openapiRequiredFields.add("transitNumber");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CALocalAccountIdentification
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CALocalAccountIdentification.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CALocalAccountIdentification is not found in the empty JSON string", CALocalAccountIdentification.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CALocalAccountIdentification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CALocalAccountIdentification` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CALocalAccountIdentification.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field accountNumber
      if (jsonObj.get("accountNumber") != null && !jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      // ensure the field accountType can be parsed to an enum value
      if (jsonObj.get("accountType") != null) {
        if(!jsonObj.get("accountType").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `accountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountType").toString()));
        }
        AccountTypeEnum.fromValue(jsonObj.get("accountType").getAsString());
      }
      // validate the optional field institutionNumber
      if (jsonObj.get("institutionNumber") != null && !jsonObj.get("institutionNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institutionNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institutionNumber").toString()));
      }
      // validate the optional field transitNumber
      if (jsonObj.get("transitNumber") != null && !jsonObj.get("transitNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transitNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transitNumber").toString()));
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
       if (!CALocalAccountIdentification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CALocalAccountIdentification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CALocalAccountIdentification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CALocalAccountIdentification.class));

       return (TypeAdapter<T>) new TypeAdapter<CALocalAccountIdentification>() {
           @Override
           public void write(JsonWriter out, CALocalAccountIdentification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CALocalAccountIdentification read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CALocalAccountIdentification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CALocalAccountIdentification
  * @throws IOException if the JSON string is invalid with respect to CALocalAccountIdentification
  */
  public static CALocalAccountIdentification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CALocalAccountIdentification.class);
  }

 /**
  * Convert an instance of CALocalAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

