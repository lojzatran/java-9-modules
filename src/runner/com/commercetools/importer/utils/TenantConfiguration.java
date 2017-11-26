package com.commercetools.importer.utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class TenantConfiguration {

    private String projectKey;
    private String clientId;
    private String clientSecret;
    private String endpointUrl;

    public TenantConfiguration() {
    }

    /**
     * Creates a configuration of a tenant.
     *
     * @param key    ctp project key
     * @param id     ctp project client id
     * @param secret ctp project client secret
     * @param url    api endpoint url
     */
    public TenantConfiguration(final String key, final String id, final String secret, final String url) {
        projectKey = key;
        clientId = id;
        clientSecret = secret;
        endpointUrl = url;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setClientId(final String clientId) {
        this.clientId = clientId;
    }

    public void setClientSecret(final String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public void setEndpointUrl(final String url) {
        this.endpointUrl = url;
    }

    @Override
    public String toString() {
        return "TenantConfiguration{" +
                "projectKey='" + projectKey + '\'' +
                ", clientId='" + clientId + '\'' +
                ", clientSecret='" + clientSecret + '\'' +
                ", endpointUrl='" + endpointUrl + '\'' +
                '}';
    }
}
