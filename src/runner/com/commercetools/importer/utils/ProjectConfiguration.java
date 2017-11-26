package com.commercetools.importer.utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectConfiguration {
    private List<TenantConfiguration> tenants;

    public ProjectConfiguration() {
    }

    public void setTenants(final List<TenantConfiguration> tenants) {
        this.tenants = tenants;
    }

    public ProjectConfiguration(final List<TenantConfiguration> currentTenants) {
        this.tenants = currentTenants;
    }

    public List<TenantConfiguration> getTenants() {
        return tenants;
    }

    @Override
    public String toString() {
        return "ProjectConfiguration{" +
                "tenants=" + tenants +
                '}';
    }
}
