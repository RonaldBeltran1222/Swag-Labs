package org.store.automation.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("config/config.properties");
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException("No se pudo cargar el archivo de configuración: " + e.getMessage());
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
