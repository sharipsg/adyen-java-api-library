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
 * RepaymentTerm
 */

public class RepaymentTerm {
  public static final String SERIALIZED_NAME_ESTIMATED_DAYS = "estimatedDays";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_DAYS)
  private Integer estimatedDays;

  public static final String SERIALIZED_NAME_MAXIMUM_DAYS = "maximumDays";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_DAYS)
  private Integer maximumDays;

  public RepaymentTerm() { 
  }

  public RepaymentTerm estimatedDays(Integer estimatedDays) {
    
    this.estimatedDays = estimatedDays;
    return this;
  }

   /**
   * The estimated term for repaying the grant, in days.
   * @return estimatedDays
  **/
  @ApiModelProperty(required = true, value = "The estimated term for repaying the grant, in days.")

  public Integer getEstimatedDays() {
    return estimatedDays;
  }


  public void setEstimatedDays(Integer estimatedDays) {
    this.estimatedDays = estimatedDays;
  }


  public RepaymentTerm maximumDays(Integer maximumDays) {
    
    this.maximumDays = maximumDays;
    return this;
  }

   /**
   * The maximum term for repaying the grant, in days. Only applies when &#x60;contractType&#x60; is **loan**.
   * @return maximumDays
  **/
  @ApiModelProperty(value = "The maximum term for repaying the grant, in days. Only applies when `contractType` is **loan**.")

  public Integer getMaximumDays() {
    return maximumDays;
  }


  public void setMaximumDays(Integer maximumDays) {
    this.maximumDays = maximumDays;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepaymentTerm repaymentTerm = (RepaymentTerm) o;
    return Objects.equals(this.estimatedDays, repaymentTerm.estimatedDays) &&
        Objects.equals(this.maximumDays, repaymentTerm.maximumDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedDays, maximumDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepaymentTerm {\n");
    sb.append("    estimatedDays: ").append(toIndentedString(estimatedDays)).append("\n");
    sb.append("    maximumDays: ").append(toIndentedString(maximumDays)).append("\n");
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
    openapiFields.add("estimatedDays");
    openapiFields.add("maximumDays");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("estimatedDays");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RepaymentTerm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RepaymentTerm.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RepaymentTerm is not found in the empty JSON string", RepaymentTerm.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RepaymentTerm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RepaymentTerm` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RepaymentTerm.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RepaymentTerm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RepaymentTerm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RepaymentTerm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RepaymentTerm.class));

       return (TypeAdapter<T>) new TypeAdapter<RepaymentTerm>() {
           @Override
           public void write(JsonWriter out, RepaymentTerm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RepaymentTerm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RepaymentTerm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RepaymentTerm
  * @throws IOException if the JSON string is invalid with respect to RepaymentTerm
  */
  public static RepaymentTerm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RepaymentTerm.class);
  }

 /**
  * Convert an instance of RepaymentTerm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

