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
import com.adyen.model.management.CompanyUser;
import com.adyen.model.management.CreateCompanyUserRequest;
import com.adyen.model.management.CreateCompanyUserResponse;
import com.adyen.model.management.ListCompanyUsersResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.management.UpdateCompanyUserRequest;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UsersCompanyLevelApi extends Service {
    private final String baseURL;

    public UsersCompanyLevelApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://management-test.adyen.com/v1");
    }

    /**
    * Get a list of users
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @return {@link ListCompanyUsersResponse }
    * @throws ApiException if fails to make API call
    */
    public ListCompanyUsersResponse listUsers(String companyId) throws ApiException, IOException {
        return listUsers(companyId, null,  null,  null,  null);
    }

    /**
    * Get a list of users
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param pageNumber {@link Integer } Query: The number of the page to return. (optional)
    * @param pageSize {@link Integer } Query: The number of items to have on a page. Maximum value is **100**. The default is **10** items on a page. (optional)
    * @param username {@link String } Query: The partial or complete username to select all users that match. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ListCompanyUsersResponse }
    * @throws ApiException if fails to make API call
    */
    public ListCompanyUsersResponse listUsers(String companyId, Integer pageNumber, Integer pageSize, String username, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (pageNumber != null) {
        queryParams.put("pageNumber", pageNumber.toString());
        }
        if (pageSize != null) {
        queryParams.put("pageSize", pageSize.toString());
        }
        if (username != null) {
        queryParams.put("username", username);
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/users", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return ListCompanyUsersResponse.fromJson(jsonResult);
    }

    /**
    * Get user details
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param userId {@link String } The unique identifier of the user. (required)
    * @return {@link CompanyUser }
    * @throws ApiException if fails to make API call
    */
    public CompanyUser getUserDetails(String companyId, String userId) throws ApiException, IOException {
        return getUserDetails(companyId, userId, null);
    }

    /**
    * Get user details
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param userId {@link String } The unique identifier of the user. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CompanyUser }
    * @throws ApiException if fails to make API call
    */
    public CompanyUser getUserDetails(String companyId, String userId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        if (userId == null) {
            throw new IllegalArgumentException("Please provide the userId path parameter");
        }
        pathParams.put("userId", userId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/users/{userId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return CompanyUser.fromJson(jsonResult);
    }

    /**
    * Update user details
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param userId {@link String } The unique identifier of the user. (required)
    * @param updateCompanyUserRequest {@link UpdateCompanyUserRequest }  (required)
    * @return {@link CompanyUser }
    * @throws ApiException if fails to make API call
    */
    public CompanyUser updateUserDetails(String companyId, String userId, UpdateCompanyUserRequest updateCompanyUserRequest) throws ApiException, IOException {
        return updateUserDetails(companyId, userId, updateCompanyUserRequest, null);
    }

    /**
    * Update user details
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param userId {@link String } The unique identifier of the user. (required)
    * @param updateCompanyUserRequest {@link UpdateCompanyUserRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CompanyUser }
    * @throws ApiException if fails to make API call
    */
    public CompanyUser updateUserDetails(String companyId, String userId, UpdateCompanyUserRequest updateCompanyUserRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        if (userId == null) {
            throw new IllegalArgumentException("Please provide the userId path parameter");
        }
        pathParams.put("userId", userId);

        String requestBody = updateCompanyUserRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/users/{userId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return CompanyUser.fromJson(jsonResult);
    }

    /**
    * Create a new user
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param createCompanyUserRequest {@link CreateCompanyUserRequest }  (required)
    * @return {@link CreateCompanyUserResponse }
    * @throws ApiException if fails to make API call
    */
    public CreateCompanyUserResponse createNewUser(String companyId, CreateCompanyUserRequest createCompanyUserRequest) throws ApiException, IOException {
        return createNewUser(companyId, createCompanyUserRequest, null);
    }

    /**
    * Create a new user
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param createCompanyUserRequest {@link CreateCompanyUserRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CreateCompanyUserResponse }
    * @throws ApiException if fails to make API call
    */
    public CreateCompanyUserResponse createNewUser(String companyId, CreateCompanyUserRequest createCompanyUserRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);

        String requestBody = createCompanyUserRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/users", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return CreateCompanyUserResponse.fromJson(jsonResult);
    }
}
