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
import com.adyen.model.management.AdditionalSettings;
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
 * CreateCompanyWebhookRequest
 */

public class CreateCompanyWebhookRequest {
  public static final String SERIALIZED_NAME_ACCEPTS_EXPIRED_CERTIFICATE = "acceptsExpiredCertificate";
  @SerializedName(SERIALIZED_NAME_ACCEPTS_EXPIRED_CERTIFICATE)
  private Boolean acceptsExpiredCertificate;

  public static final String SERIALIZED_NAME_ACCEPTS_SELF_SIGNED_CERTIFICATE = "acceptsSelfSignedCertificate";
  @SerializedName(SERIALIZED_NAME_ACCEPTS_SELF_SIGNED_CERTIFICATE)
  private Boolean acceptsSelfSignedCertificate;

  public static final String SERIALIZED_NAME_ACCEPTS_UNTRUSTED_ROOT_CERTIFICATE = "acceptsUntrustedRootCertificate";
  @SerializedName(SERIALIZED_NAME_ACCEPTS_UNTRUSTED_ROOT_CERTIFICATE)
  private Boolean acceptsUntrustedRootCertificate;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ADDITIONAL_SETTINGS = "additionalSettings";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_SETTINGS)
  private AdditionalSettings additionalSettings;

  /**
   * Format or protocol for receiving webhooks. Possible values: * **soap** * **http** * **json** 
   */
  @JsonAdapter(CommunicationFormatEnum.Adapter.class)
  public enum CommunicationFormatEnum {
    HTTP("http"),
    
    JSON("json"),
    
    SOAP("soap");

    private String value;

    CommunicationFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CommunicationFormatEnum fromValue(String value) {
      for (CommunicationFormatEnum b : CommunicationFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CommunicationFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CommunicationFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CommunicationFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CommunicationFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COMMUNICATION_FORMAT = "communicationFormat";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION_FORMAT)
  private CommunicationFormatEnum communicationFormat;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Shows how merchant accounts are filtered when configuring the webhook. Possible values: * **includeAccounts**: The webhook is configured for the merchant accounts listed in &#x60;filterMerchantAccounts&#x60;. * **excludeAccounts**: The webhook is not configured for the merchant accounts listed in &#x60;filterMerchantAccounts&#x60;. * **allAccounts**: Includes all merchant accounts, and does not require specifying &#x60;filterMerchantAccounts&#x60;.
   */
  @JsonAdapter(FilterMerchantAccountTypeEnum.Adapter.class)
  public enum FilterMerchantAccountTypeEnum {
    ALLACCOUNTS("allAccounts"),
    
    EXCLUDEACCOUNTS("excludeAccounts"),
    
    INCLUDEACCOUNTS("includeAccounts");

    private String value;

    FilterMerchantAccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FilterMerchantAccountTypeEnum fromValue(String value) {
      for (FilterMerchantAccountTypeEnum b : FilterMerchantAccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FilterMerchantAccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FilterMerchantAccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FilterMerchantAccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FilterMerchantAccountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FILTER_MERCHANT_ACCOUNT_TYPE = "filterMerchantAccountType";
  @SerializedName(SERIALIZED_NAME_FILTER_MERCHANT_ACCOUNT_TYPE)
  private FilterMerchantAccountTypeEnum filterMerchantAccountType;

  public static final String SERIALIZED_NAME_FILTER_MERCHANT_ACCOUNTS = "filterMerchantAccounts";
  @SerializedName(SERIALIZED_NAME_FILTER_MERCHANT_ACCOUNTS)
  private List<String> filterMerchantAccounts = new ArrayList<>();

  /**
   * Network type for Terminal API notification webhooks. Possible values: * **public** * **local**  Default Value: **public**.
   */
  @JsonAdapter(NetworkTypeEnum.Adapter.class)
  public enum NetworkTypeEnum {
    LOCAL("LOCAL"),
    
    PUBLIC("PUBLIC");

    private String value;

    NetworkTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NetworkTypeEnum fromValue(String value) {
      for (NetworkTypeEnum b : NetworkTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NetworkTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NetworkTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NetworkTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NetworkTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NETWORK_TYPE = "networkType";
  @SerializedName(SERIALIZED_NAME_NETWORK_TYPE)
  private NetworkTypeEnum networkType;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_POPULATE_SOAP_ACTION_HEADER = "populateSoapActionHeader";
  @SerializedName(SERIALIZED_NAME_POPULATE_SOAP_ACTION_HEADER)
  private Boolean populateSoapActionHeader;

  /**
   * SSL version to access the public webhook URL specified in the &#x60;url&#x60; field. Possible values: * **TLSv1.3** * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use &#x60;sslVersion&#x60;: **TLSv1.2**.
   */
  @JsonAdapter(SslVersionEnum.Adapter.class)
  public enum SslVersionEnum {
    HTTP("HTTP"),
    
    SSL("SSL"),
    
    SSLV3("SSLv3"),
    
    TLS("TLS"),
    
    TLSV1("TLSv1"),
    
    TLSV1_1("TLSv1.1"),
    
    TLSV1_2("TLSv1.2"),
    
    TLSV1_3("TLSv1.3");

    private String value;

    SslVersionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SslVersionEnum fromValue(String value) {
      for (SslVersionEnum b : SslVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SslVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SslVersionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SslVersionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SslVersionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SSL_VERSION = "sslVersion";
  @SerializedName(SERIALIZED_NAME_SSL_VERSION)
  private SslVersionEnum sslVersion;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public CreateCompanyWebhookRequest() { 
  }

  public CreateCompanyWebhookRequest acceptsExpiredCertificate(Boolean acceptsExpiredCertificate) {
    
    this.acceptsExpiredCertificate = acceptsExpiredCertificate;
    return this;
  }

   /**
   * Indicates if expired SSL certificates are accepted. Default value: **false**.
   * @return acceptsExpiredCertificate
  **/
  @ApiModelProperty(value = "Indicates if expired SSL certificates are accepted. Default value: **false**.")

  public Boolean getAcceptsExpiredCertificate() {
    return acceptsExpiredCertificate;
  }


  public void setAcceptsExpiredCertificate(Boolean acceptsExpiredCertificate) {
    this.acceptsExpiredCertificate = acceptsExpiredCertificate;
  }


  public CreateCompanyWebhookRequest acceptsSelfSignedCertificate(Boolean acceptsSelfSignedCertificate) {
    
    this.acceptsSelfSignedCertificate = acceptsSelfSignedCertificate;
    return this;
  }

   /**
   * Indicates if self-signed SSL certificates are accepted. Default value: **false**.
   * @return acceptsSelfSignedCertificate
  **/
  @ApiModelProperty(value = "Indicates if self-signed SSL certificates are accepted. Default value: **false**.")

  public Boolean getAcceptsSelfSignedCertificate() {
    return acceptsSelfSignedCertificate;
  }


  public void setAcceptsSelfSignedCertificate(Boolean acceptsSelfSignedCertificate) {
    this.acceptsSelfSignedCertificate = acceptsSelfSignedCertificate;
  }


  public CreateCompanyWebhookRequest acceptsUntrustedRootCertificate(Boolean acceptsUntrustedRootCertificate) {
    
    this.acceptsUntrustedRootCertificate = acceptsUntrustedRootCertificate;
    return this;
  }

   /**
   * Indicates if untrusted SSL certificates are accepted. Default value: **false**.
   * @return acceptsUntrustedRootCertificate
  **/
  @ApiModelProperty(value = "Indicates if untrusted SSL certificates are accepted. Default value: **false**.")

  public Boolean getAcceptsUntrustedRootCertificate() {
    return acceptsUntrustedRootCertificate;
  }


  public void setAcceptsUntrustedRootCertificate(Boolean acceptsUntrustedRootCertificate) {
    this.acceptsUntrustedRootCertificate = acceptsUntrustedRootCertificate;
  }


  public CreateCompanyWebhookRequest active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Indicates if the webhook configuration is active. The field must be **true** for us to send webhooks about events related an account.
   * @return active
  **/
  @ApiModelProperty(required = true, value = "Indicates if the webhook configuration is active. The field must be **true** for us to send webhooks about events related an account.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public CreateCompanyWebhookRequest additionalSettings(AdditionalSettings additionalSettings) {
    
    this.additionalSettings = additionalSettings;
    return this;
  }

   /**
   * Get additionalSettings
   * @return additionalSettings
  **/
  @ApiModelProperty(value = "")

  public AdditionalSettings getAdditionalSettings() {
    return additionalSettings;
  }


  public void setAdditionalSettings(AdditionalSettings additionalSettings) {
    this.additionalSettings = additionalSettings;
  }


  public CreateCompanyWebhookRequest communicationFormat(CommunicationFormatEnum communicationFormat) {
    
    this.communicationFormat = communicationFormat;
    return this;
  }

   /**
   * Format or protocol for receiving webhooks. Possible values: * **soap** * **http** * **json** 
   * @return communicationFormat
  **/
  @ApiModelProperty(example = "soap", required = true, value = "Format or protocol for receiving webhooks. Possible values: * **soap** * **http** * **json** ")

  public CommunicationFormatEnum getCommunicationFormat() {
    return communicationFormat;
  }


  public void setCommunicationFormat(CommunicationFormatEnum communicationFormat) {
    this.communicationFormat = communicationFormat;
  }


  public CreateCompanyWebhookRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Your description for this webhook configuration.
   * @return description
  **/
  @ApiModelProperty(value = "Your description for this webhook configuration.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateCompanyWebhookRequest filterMerchantAccountType(FilterMerchantAccountTypeEnum filterMerchantAccountType) {
    
    this.filterMerchantAccountType = filterMerchantAccountType;
    return this;
  }

   /**
   * Shows how merchant accounts are filtered when configuring the webhook. Possible values: * **includeAccounts**: The webhook is configured for the merchant accounts listed in &#x60;filterMerchantAccounts&#x60;. * **excludeAccounts**: The webhook is not configured for the merchant accounts listed in &#x60;filterMerchantAccounts&#x60;. * **allAccounts**: Includes all merchant accounts, and does not require specifying &#x60;filterMerchantAccounts&#x60;.
   * @return filterMerchantAccountType
  **/
  @ApiModelProperty(required = true, value = "Shows how merchant accounts are filtered when configuring the webhook. Possible values: * **includeAccounts**: The webhook is configured for the merchant accounts listed in `filterMerchantAccounts`. * **excludeAccounts**: The webhook is not configured for the merchant accounts listed in `filterMerchantAccounts`. * **allAccounts**: Includes all merchant accounts, and does not require specifying `filterMerchantAccounts`.")

  public FilterMerchantAccountTypeEnum getFilterMerchantAccountType() {
    return filterMerchantAccountType;
  }


  public void setFilterMerchantAccountType(FilterMerchantAccountTypeEnum filterMerchantAccountType) {
    this.filterMerchantAccountType = filterMerchantAccountType;
  }


  public CreateCompanyWebhookRequest filterMerchantAccounts(List<String> filterMerchantAccounts) {
    
    this.filterMerchantAccounts = filterMerchantAccounts;
    return this;
  }

  public CreateCompanyWebhookRequest addFilterMerchantAccountsItem(String filterMerchantAccountsItem) {
    this.filterMerchantAccounts.add(filterMerchantAccountsItem);
    return this;
  }

   /**
   * A list of merchant account names that are included or excluded from receiving the webhook. Inclusion or exclusion is based on the value defined for &#x60;filterMerchantAccountType&#x60;.  Required if &#x60;filterMerchantAccountType&#x60; is either: * **includeAccounts** * **excludeAccounts**  Not needed for &#x60;filterMerchantAccountType&#x60;: **allAccounts**.
   * @return filterMerchantAccounts
  **/
  @ApiModelProperty(required = true, value = "A list of merchant account names that are included or excluded from receiving the webhook. Inclusion or exclusion is based on the value defined for `filterMerchantAccountType`.  Required if `filterMerchantAccountType` is either: * **includeAccounts** * **excludeAccounts**  Not needed for `filterMerchantAccountType`: **allAccounts**.")

  public List<String> getFilterMerchantAccounts() {
    return filterMerchantAccounts;
  }


  public void setFilterMerchantAccounts(List<String> filterMerchantAccounts) {
    this.filterMerchantAccounts = filterMerchantAccounts;
  }


  public CreateCompanyWebhookRequest networkType(NetworkTypeEnum networkType) {
    
    this.networkType = networkType;
    return this;
  }

   /**
   * Network type for Terminal API notification webhooks. Possible values: * **public** * **local**  Default Value: **public**.
   * @return networkType
  **/
  @ApiModelProperty(value = "Network type for Terminal API notification webhooks. Possible values: * **public** * **local**  Default Value: **public**.")

  public NetworkTypeEnum getNetworkType() {
    return networkType;
  }


  public void setNetworkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
  }


  public CreateCompanyWebhookRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password to access the webhook URL.
   * @return password
  **/
  @ApiModelProperty(value = "Password to access the webhook URL.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public CreateCompanyWebhookRequest populateSoapActionHeader(Boolean populateSoapActionHeader) {
    
    this.populateSoapActionHeader = populateSoapActionHeader;
    return this;
  }

   /**
   * Indicates if the SOAP action header needs to be populated. Default value: **false**.  Only applies if &#x60;communicationFormat&#x60;: **soap**.
   * @return populateSoapActionHeader
  **/
  @ApiModelProperty(value = "Indicates if the SOAP action header needs to be populated. Default value: **false**.  Only applies if `communicationFormat`: **soap**.")

  public Boolean getPopulateSoapActionHeader() {
    return populateSoapActionHeader;
  }


  public void setPopulateSoapActionHeader(Boolean populateSoapActionHeader) {
    this.populateSoapActionHeader = populateSoapActionHeader;
  }


  public CreateCompanyWebhookRequest sslVersion(SslVersionEnum sslVersion) {
    
    this.sslVersion = sslVersion;
    return this;
  }

   /**
   * SSL version to access the public webhook URL specified in the &#x60;url&#x60; field. Possible values: * **TLSv1.3** * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use &#x60;sslVersion&#x60;: **TLSv1.2**.
   * @return sslVersion
  **/
  @ApiModelProperty(example = "TLSv1.2", value = "SSL version to access the public webhook URL specified in the `url` field. Possible values: * **TLSv1.3** * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use `sslVersion`: **TLSv1.2**.")

  public SslVersionEnum getSslVersion() {
    return sslVersion;
  }


  public void setSslVersion(SslVersionEnum sslVersion) {
    this.sslVersion = sslVersion;
  }


  public CreateCompanyWebhookRequest type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of webhook that is being created. Possible values are:  - **standard** - **account-settings-notification** - **banktransfer-notification** - **boletobancario-notification** - **directdebit-notification** - **pending-notification** - **ideal-notification** - **ideal-pending-notification** - **report-notification** - **rreq-notification**  Find out more about [standard notification webhooks](https://docs.adyen.com/development-resources/webhooks/understand-notifications#event-codes) and [other types of notifications](https://docs.adyen.com/development-resources/webhooks/understand-notifications#other-notifications).
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of webhook that is being created. Possible values are:  - **standard** - **account-settings-notification** - **banktransfer-notification** - **boletobancario-notification** - **directdebit-notification** - **pending-notification** - **ideal-notification** - **ideal-pending-notification** - **report-notification** - **rreq-notification**  Find out more about [standard notification webhooks](https://docs.adyen.com/development-resources/webhooks/understand-notifications#event-codes) and [other types of notifications](https://docs.adyen.com/development-resources/webhooks/understand-notifications#other-notifications).")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CreateCompanyWebhookRequest url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Public URL where webhooks will be sent, for example **https://www.domain.com/webhook-endpoint**.
   * @return url
  **/
  @ApiModelProperty(example = "http://www.adyen.com", required = true, value = "Public URL where webhooks will be sent, for example **https://www.domain.com/webhook-endpoint**.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CreateCompanyWebhookRequest username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username to access the webhook URL.
   * @return username
  **/
  @ApiModelProperty(value = "Username to access the webhook URL.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompanyWebhookRequest createCompanyWebhookRequest = (CreateCompanyWebhookRequest) o;
    return Objects.equals(this.acceptsExpiredCertificate, createCompanyWebhookRequest.acceptsExpiredCertificate) &&
        Objects.equals(this.acceptsSelfSignedCertificate, createCompanyWebhookRequest.acceptsSelfSignedCertificate) &&
        Objects.equals(this.acceptsUntrustedRootCertificate, createCompanyWebhookRequest.acceptsUntrustedRootCertificate) &&
        Objects.equals(this.active, createCompanyWebhookRequest.active) &&
        Objects.equals(this.additionalSettings, createCompanyWebhookRequest.additionalSettings) &&
        Objects.equals(this.communicationFormat, createCompanyWebhookRequest.communicationFormat) &&
        Objects.equals(this.description, createCompanyWebhookRequest.description) &&
        Objects.equals(this.filterMerchantAccountType, createCompanyWebhookRequest.filterMerchantAccountType) &&
        Objects.equals(this.filterMerchantAccounts, createCompanyWebhookRequest.filterMerchantAccounts) &&
        Objects.equals(this.networkType, createCompanyWebhookRequest.networkType) &&
        Objects.equals(this.password, createCompanyWebhookRequest.password) &&
        Objects.equals(this.populateSoapActionHeader, createCompanyWebhookRequest.populateSoapActionHeader) &&
        Objects.equals(this.sslVersion, createCompanyWebhookRequest.sslVersion) &&
        Objects.equals(this.type, createCompanyWebhookRequest.type) &&
        Objects.equals(this.url, createCompanyWebhookRequest.url) &&
        Objects.equals(this.username, createCompanyWebhookRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptsExpiredCertificate, acceptsSelfSignedCertificate, acceptsUntrustedRootCertificate, active, additionalSettings, communicationFormat, description, filterMerchantAccountType, filterMerchantAccounts, networkType, password, populateSoapActionHeader, sslVersion, type, url, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompanyWebhookRequest {\n");
    sb.append("    acceptsExpiredCertificate: ").append(toIndentedString(acceptsExpiredCertificate)).append("\n");
    sb.append("    acceptsSelfSignedCertificate: ").append(toIndentedString(acceptsSelfSignedCertificate)).append("\n");
    sb.append("    acceptsUntrustedRootCertificate: ").append(toIndentedString(acceptsUntrustedRootCertificate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalSettings: ").append(toIndentedString(additionalSettings)).append("\n");
    sb.append("    communicationFormat: ").append(toIndentedString(communicationFormat)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filterMerchantAccountType: ").append(toIndentedString(filterMerchantAccountType)).append("\n");
    sb.append("    filterMerchantAccounts: ").append(toIndentedString(filterMerchantAccounts)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    populateSoapActionHeader: ").append(toIndentedString(populateSoapActionHeader)).append("\n");
    sb.append("    sslVersion: ").append(toIndentedString(sslVersion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("acceptsExpiredCertificate");
    openapiFields.add("acceptsSelfSignedCertificate");
    openapiFields.add("acceptsUntrustedRootCertificate");
    openapiFields.add("active");
    openapiFields.add("additionalSettings");
    openapiFields.add("communicationFormat");
    openapiFields.add("description");
    openapiFields.add("filterMerchantAccountType");
    openapiFields.add("filterMerchantAccounts");
    openapiFields.add("networkType");
    openapiFields.add("password");
    openapiFields.add("populateSoapActionHeader");
    openapiFields.add("sslVersion");
    openapiFields.add("type");
    openapiFields.add("url");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("communicationFormat");
    openapiRequiredFields.add("filterMerchantAccountType");
    openapiRequiredFields.add("filterMerchantAccounts");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCompanyWebhookRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateCompanyWebhookRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCompanyWebhookRequest is not found in the empty JSON string", CreateCompanyWebhookRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCompanyWebhookRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCompanyWebhookRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCompanyWebhookRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `additionalSettings`
      if (jsonObj.getAsJsonObject("additionalSettings") != null) {
        AdditionalSettings.validateJsonObject(jsonObj.getAsJsonObject("additionalSettings"));
      }
      // ensure the field communicationFormat can be parsed to an enum value
      if (jsonObj.get("communicationFormat") != null) {
        if(!jsonObj.get("communicationFormat").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `communicationFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("communicationFormat").toString()));
        }
        CommunicationFormatEnum.fromValue(jsonObj.get("communicationFormat").getAsString());
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the field filterMerchantAccountType can be parsed to an enum value
      if (jsonObj.get("filterMerchantAccountType") != null) {
        if(!jsonObj.get("filterMerchantAccountType").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `filterMerchantAccountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filterMerchantAccountType").toString()));
        }
        FilterMerchantAccountTypeEnum.fromValue(jsonObj.get("filterMerchantAccountType").getAsString());
      }
      // ensure the json data is an array
      if (jsonObj.get("filterMerchantAccounts") != null && !jsonObj.get("filterMerchantAccounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `filterMerchantAccounts` to be an array in the JSON string but got `%s`", jsonObj.get("filterMerchantAccounts").toString()));
      }
      // ensure the field networkType can be parsed to an enum value
      if (jsonObj.get("networkType") != null) {
        if(!jsonObj.get("networkType").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `networkType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkType").toString()));
        }
        NetworkTypeEnum.fromValue(jsonObj.get("networkType").getAsString());
      }
      // validate the optional field password
      if (jsonObj.get("password") != null && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      // ensure the field sslVersion can be parsed to an enum value
      if (jsonObj.get("sslVersion") != null) {
        if(!jsonObj.get("sslVersion").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `sslVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sslVersion").toString()));
        }
        SslVersionEnum.fromValue(jsonObj.get("sslVersion").getAsString());
      }
      // validate the optional field type
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field url
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the optional field username
      if (jsonObj.get("username") != null && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCompanyWebhookRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCompanyWebhookRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCompanyWebhookRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCompanyWebhookRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCompanyWebhookRequest>() {
           @Override
           public void write(JsonWriter out, CreateCompanyWebhookRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCompanyWebhookRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCompanyWebhookRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCompanyWebhookRequest
  * @throws IOException if the JSON string is invalid with respect to CreateCompanyWebhookRequest
  */
  public static CreateCompanyWebhookRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCompanyWebhookRequest.class);
  }

 /**
  * Convert an instance of CreateCompanyWebhookRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

