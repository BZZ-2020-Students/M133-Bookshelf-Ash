package ch.bzz.dev.ash.bookshelf.service;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@ApplicationPath("/resource")
public class Config extends Application {
    private static Properties properties;


    public String getProperties(String key) {
        checkIfPropertyExists();
        return properties.getProperty(key);
    }

    private static void checkIfPropertyExists() {
        if (properties == null) {
            properties = new Properties();
            try (InputStream input = new FileInputStream(Config.class.getClassLoader().getResource("config.properties").getFile())) {
                properties.load(input);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}