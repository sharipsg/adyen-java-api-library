/*
 * Transfers API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.transfers.Address2;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

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

import com.adyen.model.transfers.JSON;

/**
 * PartyIdentification2
 */

public class PartyIdentification2 {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address2 address;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  /**
   * The type of entity that owns the bank account.   Possible values: **individual**, **organization**, or **unknown**.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INDIVIDUAL("individual"),
    
    ORGANIZATION("organization"),
    
    UNKNOWN("unknown");

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
  private TypeEnum type = TypeEnum.UNKNOWN;

  public PartyIdentification2() { 
  }

  public PartyIdentification2 address(Address2 address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  public Address2 getAddress() {
    return address;
  }


  public void setAddress(Address2 address) {
    this.address = address;
  }


  public PartyIdentification2 dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The date of birth of the individual in [ISO-8601](https://www.w3.org/TR/NOTE-datetime) format. For example, **YYYY-MM-DD**.  Allowed only when &#x60;type&#x60; is **individual**.
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "The date of birth of the individual in [ISO-8601](https://www.w3.org/TR/NOTE-datetime) format. For example, **YYYY-MM-DD**.  Allowed only when `type` is **individual**.")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public PartyIdentification2 firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the individual.  Allowed only when &#x60;type&#x60; is **individual**.
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of the individual.  Allowed only when `type` is **individual**.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public PartyIdentification2 fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * The name of the entity.
   * @return fullName
  **/
  @ApiModelProperty(required = true, value = "The name of the entity.")

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public PartyIdentification2 lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the individual.  Allowed only when &#x60;type&#x60; is **individual**.
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of the individual.  Allowed only when `type` is **individual**.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public PartyIdentification2 reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your unique reference of the party. This should be consistent for all transfers initiated to/from the same party/counterparty. e.g Your client&#39;s unique wallet or payee ID
   * @return reference
  **/
  @ApiModelProperty(value = "Your unique reference of the party. This should be consistent for all transfers initiated to/from the same party/counterparty. e.g Your client's unique wallet or payee ID")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public PartyIdentification2 type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of entity that owns the bank account.   Possible values: **individual**, **organization**, or **unknown**.
   * @return type
  **/
  @ApiModelProperty(value = "The type of entity that owns the bank account.   Possible values: **individual**, **organization**, or **unknown**.")

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
    PartyIdentification2 partyIdentification2 = (PartyIdentification2) o;
    return Objects.equals(this.address, partyIdentification2.address) &&
        Objects.equals(this.dateOfBirth, partyIdentification2.dateOfBirth) &&
        Objects.equals(this.firstName, partyIdentification2.firstName) &&
        Objects.equals(this.fullName, partyIdentification2.fullName) &&
        Objects.equals(this.lastName, partyIdentification2.lastName) &&
        Objects.equals(this.reference, partyIdentification2.reference) &&
        Objects.equals(this.type, partyIdentification2.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, dateOfBirth, firstName, fullName, lastName, reference, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyIdentification2 {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("dateOfBirth");
    openapiFields.add("firstName");
    openapiFields.add("fullName");
    openapiFields.add("lastName");
    openapiFields.add("reference");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fullName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PartyIdentification2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PartyIdentification2.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartyIdentification2 is not found in the empty JSON string", PartyIdentification2.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PartyIdentification2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PartyIdentification2` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PartyIdentification2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `address`
      if (jsonObj.getAsJsonObject("address") != null) {
        Address2.validateJsonObject(jsonObj.getAsJsonObject("address"));
      }
      // validate the optional field firstName
      if (jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      // validate the optional field fullName
      if (jsonObj.get("fullName") != null && !jsonObj.get("fullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fullName").toString()));
      }
      // validate the optional field lastName
      if (jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
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
       if (!PartyIdentification2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartyIdentification2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartyIdentification2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartyIdentification2.class));

       return (TypeAdapter<T>) new TypeAdapter<PartyIdentification2>() {
           @Override
           public void write(JsonWriter out, PartyIdentification2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PartyIdentification2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PartyIdentification2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PartyIdentification2
  * @throws IOException if the JSON string is invalid with respect to PartyIdentification2
  */
  public static PartyIdentification2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartyIdentification2.class);
  }

 /**
  * Convert an instance of PartyIdentification2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

