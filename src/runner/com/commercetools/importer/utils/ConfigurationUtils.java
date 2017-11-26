package com.commercetools.importer.utils;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Optional;


public class ConfigurationUtils {

    public static final String CTP_PROJECT_CONFIG = "CTP_PROJECT_CONFIG";

    /**
     * Load a configuration from a enviroment variable or, if given, a configuration file.
     *
     * @param resourcePath optional path to a configuration file
     * @return a projectconfiguration
     */
    public static Optional<ProjectConfiguration> getConfiguration(final String resourcePath) throws IOException {
        final ObjectMapper objectMapper = new ObjectMapper();
        ProjectConfiguration projectConfiguration = null;
        final File file = new File(resourcePath);
        projectConfiguration = objectMapper.readValue(file, ProjectConfiguration.class);
        return Optional.ofNullable(projectConfiguration);
    }
}
