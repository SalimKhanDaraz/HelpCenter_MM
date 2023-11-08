package Utilis;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {


    public static Properties getProperties() throws IOException {

        FileInputStream fps = new FileInputStream("Config/config.properties");

        Properties prop = new Properties();

        prop.load(fps);

        return prop;

    }


    public String getMMUrl() throws IOException
    {
        return getProperties().getProperty("MMUrl");
    }


    public String getUsername() throws IOException
    {
        return getProperties().getProperty("Username");

    }

    public String getPassword() throws IOException
    {
        return getProperties().getProperty("Password");

    }

    public String getHomepageUrl() throws IOException
    {

        return getProperties().getProperty("HomepageUrl");

    }

}