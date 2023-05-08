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

package com.adyen.service.management;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.management.BillingEntitiesResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.management.ShippingLocation;
import com.adyen.model.management.ShippingLocationsResponse;
import com.adyen.model.management.TerminalModelsResponse;
import com.adyen.model.management.TerminalOrder;
import com.adyen.model.management.TerminalOrderRequest;
import com.adyen.model.management.TerminalOrdersResponse;
import com.adyen.model.management.TerminalProductsResponse;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TerminalOrdersCompanyLevelApi extends Service {
    private final String baseURL;

    public TerminalOrdersCompanyLevelApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://management-test.adyen.com/v1");
    }

    /**
    * Get a list of billing entities
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @return {@link BillingEntitiesResponse }
    * @throws ApiException if fails to make API call
    */
    public BillingEntitiesResponse listBillingEntities(String companyId) throws ApiException, IOException {
        return listBillingEntities(companyId, null,  null);
    }

    /**
    * Get a list of billing entities
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param name {@link String } Query: The name of the billing entity. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link BillingEntitiesResponse }
    * @throws ApiException if fails to make API call
    */
    public BillingEntitiesResponse listBillingEntities(String companyId, String name, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (name != null) {
        queryParams.put("name", name);
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/billingEntities", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return BillingEntitiesResponse.fromJson(jsonResult);
    }

    /**
    * Get a list of shipping locations
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @return {@link ShippingLocationsResponse }
    * @throws ApiException if fails to make API call
    */
    public ShippingLocationsResponse listShippingLocations(String companyId) throws ApiException, IOException {
        return listShippingLocations(companyId, null,  null,  null,  null);
    }

    /**
    * Get a list of shipping locations
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param name {@link String } Query: The name of the shipping location. (optional)
    * @param offset {@link Integer } Query: The number of locations to skip. (optional)
    * @param limit {@link Integer } Query: The number of locations to return. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ShippingLocationsResponse }
    * @throws ApiException if fails to make API call
    */
    public ShippingLocationsResponse listShippingLocations(String companyId, String name, Integer offset, Integer limit, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (name != null) {
        queryParams.put("name", name);
        }
        if (offset != null) {
        queryParams.put("offset", offset.toString());
        }
        if (limit != null) {
        queryParams.put("limit", limit.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/shippingLocations", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return ShippingLocationsResponse.fromJson(jsonResult);
    }

    /**
    * Get a list of terminal models
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @return {@link TerminalModelsResponse }
    * @throws ApiException if fails to make API call
    */
    public TerminalModelsResponse listTerminalModels(String companyId) throws ApiException, IOException {
        return listTerminalModels(companyId, null);
    }

    /**
    * Get a list of terminal models
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalModelsResponse }
    * @throws ApiException if fails to make API call
    */
    public TerminalModelsResponse listTerminalModels(String companyId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/terminalModels", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return TerminalModelsResponse.fromJson(jsonResult);
    }

    /**
    * Get a list of orders
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @return {@link TerminalOrdersResponse }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrdersResponse listOrders(String companyId) throws ApiException, IOException {
        return listOrders(companyId, null,  null,  null,  null,  null);
    }

    /**
    * Get a list of orders
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param customerOrderReference {@link String } Query: Your purchase order number. (optional)
    * @param status {@link String } Query: The order status. Possible values (not case-sensitive): Placed, Confirmed, Cancelled, Shipped, Delivered. (optional)
    * @param offset {@link Integer } Query: The number of orders to skip. (optional)
    * @param limit {@link Integer } Query: The number of orders to return. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalOrdersResponse }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrdersResponse listOrders(String companyId, String customerOrderReference, String status, Integer offset, Integer limit, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (customerOrderReference != null) {
        queryParams.put("customerOrderReference", customerOrderReference);
        }
        if (status != null) {
        queryParams.put("status", status);
        }
        if (offset != null) {
        queryParams.put("offset", offset.toString());
        }
        if (limit != null) {
        queryParams.put("limit", limit.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/terminalOrders", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return TerminalOrdersResponse.fromJson(jsonResult);
    }

    /**
    * Get an order
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param orderId {@link String } The unique identifier of the order. (required)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder getOrder(String companyId, String orderId) throws ApiException, IOException {
        return getOrder(companyId, orderId, null);
    }

    /**
    * Get an order
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param orderId {@link String } The unique identifier of the order. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder getOrder(String companyId, String orderId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        if (orderId == null) {
            throw new IllegalArgumentException("Please provide the orderId path parameter");
        }
        pathParams.put("orderId", orderId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/terminalOrders/{orderId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return TerminalOrder.fromJson(jsonResult);
    }

    /**
    * Get a list of terminal products
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param country {@link String } The country to return products for, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. For example, **US** (required)
    * @return {@link TerminalProductsResponse }
    * @throws ApiException if fails to make API call
    */
    public TerminalProductsResponse listTerminalProducts(String companyId, String country) throws ApiException, IOException {
        return listTerminalProducts(companyId, country,  null,  null,  null,  null);
    }

    /**
    * Get a list of terminal products
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param country {@link String } Query: The country to return products for, in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. For example, **US** (required)
    * @param terminalModelId {@link String } Query: The terminal model to return products for. Use the ID returned in the [GET &#x60;/terminalModels&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/companies/{companyId}/terminalModels) response. For example, **Verifone.M400** (optional)
    * @param offset {@link Integer } Query: The number of products to skip. (optional)
    * @param limit {@link Integer } Query: The number of products to return. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalProductsResponse }
    * @throws ApiException if fails to make API call
    */
    public TerminalProductsResponse listTerminalProducts(String companyId, String country, String terminalModelId, Integer offset, Integer limit, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (country != null) {
        queryParams.put("country", country);
        }
        if (terminalModelId != null) {
        queryParams.put("terminalModelId", terminalModelId);
        }
        if (offset != null) {
        queryParams.put("offset", offset.toString());
        }
        if (limit != null) {
        queryParams.put("limit", limit.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/terminalProducts", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return TerminalProductsResponse.fromJson(jsonResult);
    }

    /**
    * Update an order
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param orderId {@link String } The unique identifier of the order. (required)
    * @param terminalOrderRequest {@link TerminalOrderRequest }  (required)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder updateOrder(String companyId, String orderId, TerminalOrderRequest terminalOrderRequest) throws ApiException, IOException {
        return updateOrder(companyId, orderId, terminalOrderRequest, null);
    }

    /**
    * Update an order
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param orderId {@link String } The unique identifier of the order. (required)
    * @param terminalOrderRequest {@link TerminalOrderRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder updateOrder(String companyId, String orderId, TerminalOrderRequest terminalOrderRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        if (orderId == null) {
            throw new IllegalArgumentException("Please provide the orderId path parameter");
        }
        pathParams.put("orderId", orderId);

        String requestBody = terminalOrderRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/terminalOrders/{orderId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return TerminalOrder.fromJson(jsonResult);
    }

    /**
    * Create a shipping location
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param shippingLocation {@link ShippingLocation }  (required)
    * @return {@link ShippingLocation }
    * @throws ApiException if fails to make API call
    */
    public ShippingLocation createShippingLocation(String companyId, ShippingLocation shippingLocation) throws ApiException, IOException {
        return createShippingLocation(companyId, shippingLocation, null);
    }

    /**
    * Create a shipping location
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param shippingLocation {@link ShippingLocation }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ShippingLocation }
    * @throws ApiException if fails to make API call
    */
    public ShippingLocation createShippingLocation(String companyId, ShippingLocation shippingLocation, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);

        String requestBody = shippingLocation.toJson();
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/shippingLocations", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return ShippingLocation.fromJson(jsonResult);
    }

    /**
    * Create an order
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param terminalOrderRequest {@link TerminalOrderRequest }  (required)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder createOrder(String companyId, TerminalOrderRequest terminalOrderRequest) throws ApiException, IOException {
        return createOrder(companyId, terminalOrderRequest, null);
    }

    /**
    * Create an order
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param terminalOrderRequest {@link TerminalOrderRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder createOrder(String companyId, TerminalOrderRequest terminalOrderRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);

        String requestBody = terminalOrderRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/terminalOrders", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return TerminalOrder.fromJson(jsonResult);
    }

    /**
    * Cancel an order
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param orderId {@link String } The unique identifier of the order. (required)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder cancelOrder(String companyId, String orderId) throws ApiException, IOException {
        return cancelOrder(companyId, orderId, null);
    }

    /**
    * Cancel an order
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param orderId {@link String } The unique identifier of the order. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalOrder }
    * @throws ApiException if fails to make API call
    */
    public TerminalOrder cancelOrder(String companyId, String orderId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        if (orderId == null) {
            throw new IllegalArgumentException("Please provide the orderId path parameter");
        }
        pathParams.put("orderId", orderId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/terminalOrders/{orderId}/cancel", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return TerminalOrder.fromJson(jsonResult);
    }
}
