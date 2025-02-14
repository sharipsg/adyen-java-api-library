/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

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

import com.adyen.model.management.JSON;

/**
 * Connectivity
 */

public class Connectivity {
  /**
   * Indicates the status of the SIM card in the payment terminal. Can be updated and received only at terminal level, and only for models that support cellular connectivity.  Possible values: * **ACTIVATED**: the SIM card is activated. Cellular connectivity may still need to be enabled on the terminal itself, in the **Network** settings. * **INVENTORY**: the SIM card is not activated. The terminal can&#39;t use cellular connectivity.
   */
  @JsonAdapter(SimcardStatusEnum.Adapter.class)
  public enum SimcardStatusEnum {
    ACTIVATED("ACTIVATED"),
    
    INVENTORY("INVENTORY");

    private String value;

    SimcardStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SimcardStatusEnum fromValue(String value) {
      for (SimcardStatusEnum b : SimcardStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SimcardStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SimcardStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SimcardStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SimcardStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SIMCARD_STATUS = "simcardStatus";
  @SerializedName(SERIALIZED_NAME_SIMCARD_STATUS)
  private SimcardStatusEnum simcardStatus;

  public Connectivity() { 
  }

  public Connectivity simcardStatus(SimcardStatusEnum simcardStatus) {
    
    this.simcardStatus = simcardStatus;
    return this;
  }

   /**
   * Indicates the status of the SIM card in the payment terminal. Can be updated and received only at terminal level, and only for models that support cellular connectivity.  Possible values: * **ACTIVATED**: the SIM card is activated. Cellular connectivity may still need to be enabled on the terminal itself, in the **Network** settings. * **INVENTORY**: the SIM card is not activated. The terminal can&#39;t use cellular connectivity.
   * @return simcardStatus
  **/
  @ApiModelProperty(value = "Indicates the status of the SIM card in the payment terminal. Can be updated and received only at terminal level, and only for models that support cellular connectivity.  Possible values: * **ACTIVATED**: the SIM card is activated. Cellular connectivity may still need to be enabled on the terminal itself, in the **Network** settings. * **INVENTORY**: the SIM card is not activated. The terminal can't use cellular connectivity.")

  public SimcardStatusEnum getSimcardStatus() {
    return simcardStatus;
  }


  public void setSimcardStatus(SimcardStatusEnum simcardStatus) {
    this.simcardStatus = simcardStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectivity connectivity = (Connectivity) o;
    return Objects.equals(this.simcardStatus, connectivity.simcardStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simcardStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectivity {\n");
    sb.append("    simcardStatus: ").append(toIndentedString(simcardStatus)).append("\n");
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
    openapiFields.add("simcardStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Connectivity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Connectivity.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectivity is not found in the empty JSON string", Connectivity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Connectivity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectivity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the field simcardStatus can be parsed to an enum value
      if (jsonObj.get("simcardStatus") != null) {
        if(!jsonObj.get("simcardStatus").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `simcardStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("simcardStatus").toString()));
        }
        SimcardStatusEnum.fromValue(jsonObj.get("simcardStatus").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectivity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectivity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectivity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectivity.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectivity>() {
           @Override
           public void write(JsonWriter out, Connectivity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectivity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectivity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectivity
  * @throws IOException if the JSON string is invalid with respect to Connectivity
  */
  public static Connectivity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectivity.class);
  }

 /**
  * Convert an instance of Connectivity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

