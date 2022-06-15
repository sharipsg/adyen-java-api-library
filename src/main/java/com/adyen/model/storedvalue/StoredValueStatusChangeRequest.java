/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2020 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.model.storedvalue;

import java.util.Objects;

import com.adyen.model.checkout.PaymentMethodDetails;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

import com.adyen.model.Amount;

/**
 * StoredValueStatusChangeRequest
 */

public class StoredValueStatusChangeRequest {
    @SerializedName("amount")
    private Amount amount = null;

    @SerializedName("merchantAccount")
    private String merchantAccount = null;

    @SerializedName("paymentMethod")
    private PaymentMethodDetails paymentMethod = null;

    @SerializedName("recurringDetailReference")
    private String recurringDetailReference = null;

    @SerializedName("reference")
    private String reference = null;

    /**
     * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
     */
    @JsonAdapter(ShopperInteractionEnum.Adapter.class)
    public enum ShopperInteractionEnum {
        ECOMMERCE("Ecommerce"),
        CONTAUTH("ContAuth"),
        MOTO("Moto"),
        POS("POS");

        @JsonValue
        private final String value;

        ShopperInteractionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ShopperInteractionEnum fromValue(String text) {
            for (ShopperInteractionEnum b : ShopperInteractionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ShopperInteractionEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ShopperInteractionEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ShopperInteractionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ShopperInteractionEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("shopperInteraction")
    private ShopperInteractionEnum shopperInteraction = null;

    @SerializedName("shopperReference")
    private String shopperReference = null;

    /**
     * The status you want to change to
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        ACTIVE("active"),
        INACTIVE("inactive");

        @JsonValue
        private final String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("status")
    private StatusEnum status = null;

    @SerializedName("store")
    private String store = null;

    public StoredValueStatusChangeRequest amount(Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public StoredValueStatusChangeRequest merchantAccount(String merchantAccount) {
        this.merchantAccount = merchantAccount;
        return this;
    }

    /**
     * The merchant account identifier, with which you want to process the transaction.
     *
     * @return merchantAccount
     **/
    public String getMerchantAccount() {
        return merchantAccount;
    }

    public void setMerchantAccount(String merchantAccount) {
        this.merchantAccount = merchantAccount;
    }

    public StoredValueStatusChangeRequest paymentMethod(PaymentMethodDetails paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * The collection that contains the type of the payment method and its specific information if available
     *
     * @return paymentMethod
     **/
    public PaymentMethodDetails getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethodDetails paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public StoredValueStatusChangeRequest recurringDetailReference(String recurringDetailReference) {
        this.recurringDetailReference = recurringDetailReference;
        return this;
    }

    /**
     * Get recurringDetailReference
     *
     * @return recurringDetailReference
     **/
    public String getRecurringDetailReference() {
        return recurringDetailReference;
    }

    public void setRecurringDetailReference(String recurringDetailReference) {
        this.recurringDetailReference = recurringDetailReference;
    }

    public StoredValueStatusChangeRequest reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\&quot;-\&quot;). Maximum length: 80 characters.
     *
     * @return reference
     **/
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public StoredValueStatusChangeRequest shopperInteraction(ShopperInteractionEnum shopperInteraction) {
        this.shopperInteraction = shopperInteraction;
        return this;
    }

    /**
     * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
     *
     * @return shopperInteraction
     **/
    public ShopperInteractionEnum getShopperInteraction() {
        return shopperInteraction;
    }

    public void setShopperInteraction(ShopperInteractionEnum shopperInteraction) {
        this.shopperInteraction = shopperInteraction;
    }

    public StoredValueStatusChangeRequest shopperReference(String shopperReference) {
        this.shopperReference = shopperReference;
        return this;
    }

    /**
     * Get shopperReference
     *
     * @return shopperReference
     **/
    public String getShopperReference() {
        return shopperReference;
    }

    public void setShopperReference(String shopperReference) {
        this.shopperReference = shopperReference;
    }

    public StoredValueStatusChangeRequest status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The status you want to change to
     *
     * @return status
     **/
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public StoredValueStatusChangeRequest store(String store) {
        this.store = store;
        return this;
    }

    /**
     * The physical store, for which this payment is processed.
     *
     * @return store
     **/
    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StoredValueStatusChangeRequest storedValueStatusChangeRequest = (StoredValueStatusChangeRequest) o;
        return Objects.equals(this.amount, storedValueStatusChangeRequest.amount) &&
                Objects.equals(this.merchantAccount, storedValueStatusChangeRequest.merchantAccount) &&
                Objects.equals(this.paymentMethod, storedValueStatusChangeRequest.paymentMethod) &&
                Objects.equals(this.recurringDetailReference, storedValueStatusChangeRequest.recurringDetailReference) &&
                Objects.equals(this.reference, storedValueStatusChangeRequest.reference) &&
                Objects.equals(this.shopperInteraction, storedValueStatusChangeRequest.shopperInteraction) &&
                Objects.equals(this.shopperReference, storedValueStatusChangeRequest.shopperReference) &&
                Objects.equals(this.status, storedValueStatusChangeRequest.status) &&
                Objects.equals(this.store, storedValueStatusChangeRequest.store);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, merchantAccount, paymentMethod, recurringDetailReference, reference, shopperInteraction, shopperReference, status, store);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StoredValueStatusChangeRequest {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
        sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
        sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    shopperInteraction: ").append(toIndentedString(shopperInteraction)).append("\n");
        sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    store: ").append(toIndentedString(store)).append("\n");
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

}
