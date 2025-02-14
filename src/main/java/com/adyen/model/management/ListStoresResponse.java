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
import com.adyen.model.management.PaginationLinks;
import com.adyen.model.management.Store;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ListStoresResponse
 */

public class ListStoresResponse {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private PaginationLinks links;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Store> data = null;

  public static final String SERIALIZED_NAME_ITEMS_TOTAL = "itemsTotal";
  @SerializedName(SERIALIZED_NAME_ITEMS_TOTAL)
  private Integer itemsTotal;

  public static final String SERIALIZED_NAME_PAGES_TOTAL = "pagesTotal";
  @SerializedName(SERIALIZED_NAME_PAGES_TOTAL)
  private Integer pagesTotal;

  public ListStoresResponse() { 
  }

  public ListStoresResponse links(PaginationLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  public PaginationLinks getLinks() {
    return links;
  }


  public void setLinks(PaginationLinks links) {
    this.links = links;
  }


  public ListStoresResponse data(List<Store> data) {
    
    this.data = data;
    return this;
  }

  public ListStoresResponse addDataItem(Store dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of stores
   * @return data
  **/
  @ApiModelProperty(value = "List of stores")

  public List<Store> getData() {
    return data;
  }


  public void setData(List<Store> data) {
    this.data = data;
  }


  public ListStoresResponse itemsTotal(Integer itemsTotal) {
    
    this.itemsTotal = itemsTotal;
    return this;
  }

   /**
   * Total number of items.
   * @return itemsTotal
  **/
  @ApiModelProperty(required = true, value = "Total number of items.")

  public Integer getItemsTotal() {
    return itemsTotal;
  }


  public void setItemsTotal(Integer itemsTotal) {
    this.itemsTotal = itemsTotal;
  }


  public ListStoresResponse pagesTotal(Integer pagesTotal) {
    
    this.pagesTotal = pagesTotal;
    return this;
  }

   /**
   * Total number of pages.
   * @return pagesTotal
  **/
  @ApiModelProperty(required = true, value = "Total number of pages.")

  public Integer getPagesTotal() {
    return pagesTotal;
  }


  public void setPagesTotal(Integer pagesTotal) {
    this.pagesTotal = pagesTotal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListStoresResponse listStoresResponse = (ListStoresResponse) o;
    return Objects.equals(this.links, listStoresResponse.links) &&
        Objects.equals(this.data, listStoresResponse.data) &&
        Objects.equals(this.itemsTotal, listStoresResponse.itemsTotal) &&
        Objects.equals(this.pagesTotal, listStoresResponse.pagesTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, data, itemsTotal, pagesTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListStoresResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    itemsTotal: ").append(toIndentedString(itemsTotal)).append("\n");
    sb.append("    pagesTotal: ").append(toIndentedString(pagesTotal)).append("\n");
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
    openapiFields.add("_links");
    openapiFields.add("data");
    openapiFields.add("itemsTotal");
    openapiFields.add("pagesTotal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("itemsTotal");
    openapiRequiredFields.add("pagesTotal");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListStoresResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListStoresResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListStoresResponse is not found in the empty JSON string", ListStoresResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListStoresResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListStoresResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListStoresResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `_links`
      if (jsonObj.getAsJsonObject("_links") != null) {
        PaginationLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      }
      JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
      if (jsonArraydata != null) {
        // ensure the json data is an array
        if (!jsonObj.get("data").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
        }

        // validate the optional field `data` (array)
        for (int i = 0; i < jsonArraydata.size(); i++) {
          Store.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListStoresResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListStoresResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListStoresResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListStoresResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListStoresResponse>() {
           @Override
           public void write(JsonWriter out, ListStoresResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListStoresResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListStoresResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListStoresResponse
  * @throws IOException if the JSON string is invalid with respect to ListStoresResponse
  */
  public static ListStoresResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListStoresResponse.class);
  }

 /**
  * Convert an instance of ListStoresResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

