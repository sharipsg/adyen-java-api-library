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
 * TaxReportingClassification
 */

public class TaxReportingClassification {
  /**
   * The organization&#39;s business type.  Possible values: **other**, **listedPublicCompany**, **subsidiaryOfListedPublicCompany**, **governmentalOrganization**, **internationalOrganization**, **financialInstitution**.
   */
  @JsonAdapter(BusinessTypeEnum.Adapter.class)
  public enum BusinessTypeEnum {
    OTHER("other"),
    
    LISTEDPUBLICCOMPANY("listedPublicCompany"),
    
    SUBSIDIARYOFLISTEDPUBLICCOMPANY("subsidiaryOfListedPublicCompany"),
    
    GOVERNMENTALORGANIZATION("governmentalOrganization"),
    
    INTERNATIONALORGANIZATION("internationalOrganization"),
    
    FINANCIALINSTITUTION_("financialInstitution.");

    private String value;

    BusinessTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BusinessTypeEnum fromValue(String value) {
      for (BusinessTypeEnum b : BusinessTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BusinessTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BusinessTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BusinessTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BusinessTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BUSINESS_TYPE = "businessType";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TYPE)
  private BusinessTypeEnum businessType;

  public static final String SERIALIZED_NAME_FINANCIAL_INSTITUTION_NUMBER = "financialInstitutionNumber";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_INSTITUTION_NUMBER)
  private String financialInstitutionNumber;

  /**
   * The organization&#39;s main source of income.  Possible values: **businessOperation**, **realEstateSales**, **investmentInterestOrRoyalty**, **propertyRental**, **other**.
   */
  @JsonAdapter(MainSourceOfIncomeEnum.Adapter.class)
  public enum MainSourceOfIncomeEnum {
    BUSINESSOPERATION("businessOperation"),
    
    REALESTATESALES("realEstateSales"),
    
    INVESTMENTINTERESTORROYALTY("investmentInterestOrRoyalty"),
    
    PROPERTYRENTAL("propertyRental"),
    
    OTHER("other");

    private String value;

    MainSourceOfIncomeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MainSourceOfIncomeEnum fromValue(String value) {
      for (MainSourceOfIncomeEnum b : MainSourceOfIncomeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MainSourceOfIncomeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MainSourceOfIncomeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MainSourceOfIncomeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MainSourceOfIncomeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MAIN_SOURCE_OF_INCOME = "mainSourceOfIncome";
  @SerializedName(SERIALIZED_NAME_MAIN_SOURCE_OF_INCOME)
  private MainSourceOfIncomeEnum mainSourceOfIncome;

  /**
   * The tax reporting classification type.  Possible values: **nonFinancialNonReportable**, **financialNonReportable**, **nonFinancialActive**, **nonFinancialPassive**.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NONFINANCIALNONREPORTABLE("nonFinancialNonReportable"),
    
    FINANCIALNONREPORTABLE("financialNonReportable"),
    
    NONFINANCIALACTIVE("nonFinancialActive"),
    
    NONFINANCIALPASSIVE("nonFinancialPassive");

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
  private TypeEnum type;

  public TaxReportingClassification() { 
  }

  public TaxReportingClassification businessType(BusinessTypeEnum businessType) {
    
    this.businessType = businessType;
    return this;
  }

   /**
   * The organization&#39;s business type.  Possible values: **other**, **listedPublicCompany**, **subsidiaryOfListedPublicCompany**, **governmentalOrganization**, **internationalOrganization**, **financialInstitution**.
   * @return businessType
  **/
  @ApiModelProperty(value = "The organization's business type.  Possible values: **other**, **listedPublicCompany**, **subsidiaryOfListedPublicCompany**, **governmentalOrganization**, **internationalOrganization**, **financialInstitution**.")

  public BusinessTypeEnum getBusinessType() {
    return businessType;
  }


  public void setBusinessType(BusinessTypeEnum businessType) {
    this.businessType = businessType;
  }


  public TaxReportingClassification financialInstitutionNumber(String financialInstitutionNumber) {
    
    this.financialInstitutionNumber = financialInstitutionNumber;
    return this;
  }

   /**
   * The Global Intermediary Identification Number (GIIN) required for FATCA.
   * @return financialInstitutionNumber
  **/
  @ApiModelProperty(value = "The Global Intermediary Identification Number (GIIN) required for FATCA.")

  public String getFinancialInstitutionNumber() {
    return financialInstitutionNumber;
  }


  public void setFinancialInstitutionNumber(String financialInstitutionNumber) {
    this.financialInstitutionNumber = financialInstitutionNumber;
  }


  public TaxReportingClassification mainSourceOfIncome(MainSourceOfIncomeEnum mainSourceOfIncome) {
    
    this.mainSourceOfIncome = mainSourceOfIncome;
    return this;
  }

   /**
   * The organization&#39;s main source of income.  Possible values: **businessOperation**, **realEstateSales**, **investmentInterestOrRoyalty**, **propertyRental**, **other**.
   * @return mainSourceOfIncome
  **/
  @ApiModelProperty(value = "The organization's main source of income.  Possible values: **businessOperation**, **realEstateSales**, **investmentInterestOrRoyalty**, **propertyRental**, **other**.")

  public MainSourceOfIncomeEnum getMainSourceOfIncome() {
    return mainSourceOfIncome;
  }


  public void setMainSourceOfIncome(MainSourceOfIncomeEnum mainSourceOfIncome) {
    this.mainSourceOfIncome = mainSourceOfIncome;
  }


  public TaxReportingClassification type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The tax reporting classification type.  Possible values: **nonFinancialNonReportable**, **financialNonReportable**, **nonFinancialActive**, **nonFinancialPassive**.
   * @return type
  **/
  @ApiModelProperty(value = "The tax reporting classification type.  Possible values: **nonFinancialNonReportable**, **financialNonReportable**, **nonFinancialActive**, **nonFinancialPassive**.")

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
    TaxReportingClassification taxReportingClassification = (TaxReportingClassification) o;
    return Objects.equals(this.businessType, taxReportingClassification.businessType) &&
        Objects.equals(this.financialInstitutionNumber, taxReportingClassification.financialInstitutionNumber) &&
        Objects.equals(this.mainSourceOfIncome, taxReportingClassification.mainSourceOfIncome) &&
        Objects.equals(this.type, taxReportingClassification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessType, financialInstitutionNumber, mainSourceOfIncome, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxReportingClassification {\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    financialInstitutionNumber: ").append(toIndentedString(financialInstitutionNumber)).append("\n");
    sb.append("    mainSourceOfIncome: ").append(toIndentedString(mainSourceOfIncome)).append("\n");
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
    openapiFields.add("businessType");
    openapiFields.add("financialInstitutionNumber");
    openapiFields.add("mainSourceOfIncome");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxReportingClassification
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TaxReportingClassification.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxReportingClassification is not found in the empty JSON string", TaxReportingClassification.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TaxReportingClassification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TaxReportingClassification` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the field businessType can be parsed to an enum value
      if (jsonObj.get("businessType") != null) {
        if(!jsonObj.get("businessType").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `businessType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessType").toString()));
        }
        BusinessTypeEnum.fromValue(jsonObj.get("businessType").getAsString());
      }
      // validate the optional field financialInstitutionNumber
      if (jsonObj.get("financialInstitutionNumber") != null && !jsonObj.get("financialInstitutionNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `financialInstitutionNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("financialInstitutionNumber").toString()));
      }
      // ensure the field mainSourceOfIncome can be parsed to an enum value
      if (jsonObj.get("mainSourceOfIncome") != null) {
        if(!jsonObj.get("mainSourceOfIncome").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `mainSourceOfIncome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mainSourceOfIncome").toString()));
        }
        MainSourceOfIncomeEnum.fromValue(jsonObj.get("mainSourceOfIncome").getAsString());
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
       if (!TaxReportingClassification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxReportingClassification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxReportingClassification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxReportingClassification.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxReportingClassification>() {
           @Override
           public void write(JsonWriter out, TaxReportingClassification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaxReportingClassification read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TaxReportingClassification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxReportingClassification
  * @throws IOException if the JSON string is invalid with respect to TaxReportingClassification
  */
  public static TaxReportingClassification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxReportingClassification.class);
  }

 /**
  * Convert an instance of TaxReportingClassification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

