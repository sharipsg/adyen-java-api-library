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
import com.adyen.model.balanceplatform.CronSweepSchedule;
import com.adyen.model.balanceplatform.SweepSchedule;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import jakarta.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.adyen.model.balanceplatform.JSON;


public class SweepConfigurationV2Schedule extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SweepConfigurationV2Schedule.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SweepConfigurationV2Schedule.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SweepConfigurationV2Schedule' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CronSweepSchedule> adapterCronSweepSchedule = gson.getDelegateAdapter(this, TypeToken.get(CronSweepSchedule.class));
            final TypeAdapter<SweepSchedule> adapterSweepSchedule = gson.getDelegateAdapter(this, TypeToken.get(SweepSchedule.class));

            return (TypeAdapter<T>) new TypeAdapter<SweepConfigurationV2Schedule>() {
                @Override
                public void write(JsonWriter out, SweepConfigurationV2Schedule value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CronSweepSchedule`
                    if (value.getActualInstance() instanceof CronSweepSchedule) {
                        JsonObject obj = adapterCronSweepSchedule.toJsonTree((CronSweepSchedule)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SweepSchedule`
                    if (value.getActualInstance() instanceof SweepSchedule) {
                        JsonObject obj = adapterSweepSchedule.toJsonTree((SweepSchedule)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CronSweepSchedule, SweepSchedule");
                }

                @Override
                public SweepConfigurationV2Schedule read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CronSweepSchedule
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CronSweepSchedule.validateJsonObject(jsonObject);
                        actualAdapter = adapterCronSweepSchedule;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CronSweepSchedule'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CronSweepSchedule failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CronSweepSchedule'", e);
                    }

                    // deserialize SweepSchedule
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SweepSchedule.validateJsonObject(jsonObject);
                        actualAdapter = adapterSweepSchedule;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SweepSchedule'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SweepSchedule failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SweepSchedule'", e);
                    }

                    if (match == 1) {
                        SweepConfigurationV2Schedule ret = new SweepConfigurationV2Schedule();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for SweepConfigurationV2Schedule: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SweepConfigurationV2Schedule() {
        super("oneOf", Boolean.FALSE);
    }

    public SweepConfigurationV2Schedule(CronSweepSchedule o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SweepConfigurationV2Schedule(SweepSchedule o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CronSweepSchedule", new GenericType<CronSweepSchedule>() {
        });
        schemas.put("SweepSchedule", new GenericType<SweepSchedule>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SweepConfigurationV2Schedule.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CronSweepSchedule, SweepSchedule
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CronSweepSchedule) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SweepSchedule) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CronSweepSchedule, SweepSchedule");
    }

    /**
     * Get the actual instance, which can be the following:
     * CronSweepSchedule, SweepSchedule
     *
     * @return The actual instance (CronSweepSchedule, SweepSchedule)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CronSweepSchedule`. If the actual instance is not `CronSweepSchedule`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CronSweepSchedule`
     * @throws ClassCastException if the instance is not `CronSweepSchedule`
     */
    public CronSweepSchedule getCronSweepSchedule() throws ClassCastException {
        return (CronSweepSchedule)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SweepSchedule`. If the actual instance is not `SweepSchedule`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SweepSchedule`
     * @throws ClassCastException if the instance is not `SweepSchedule`
     */
    public SweepSchedule getSweepSchedule() throws ClassCastException {
        return (SweepSchedule)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SweepConfigurationV2Schedule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CronSweepSchedule
    try {
      CronSweepSchedule.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CronSweepSchedule failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SweepSchedule
    try {
      SweepSchedule.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SweepSchedule failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for SweepConfigurationV2Schedule with oneOf schemas: CronSweepSchedule, SweepSchedule. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of SweepConfigurationV2Schedule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SweepConfigurationV2Schedule
  * @throws IOException if the JSON string is invalid with respect to SweepConfigurationV2Schedule
  */
  public static SweepConfigurationV2Schedule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SweepConfigurationV2Schedule.class);
  }

 /**
  * Convert an instance of SweepConfigurationV2Schedule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

