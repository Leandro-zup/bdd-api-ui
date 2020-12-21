package webSite.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class handleProperties {

  private static final String PROPERTIES = "./src/test/resources/config.properties";

  private static Properties properties;

  public static String getValue(String value) {
    try {
      if (properties == null) {
        handleProperties.properties = new Properties();
        handleProperties.properties.load(new FileInputStream(PROPERTIES));
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

    return handleProperties.properties.getProperty(value);
  }
}
