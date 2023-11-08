package Pages;

import Utilis.ReadConfig;
import Utilis.Wait;

import java.io.IOException;

public class GotoShopMsite {

    public static String Venture = "MM";

    ReadConfig readConfig = new ReadConfig();

    public void openURL() throws IOException {

        switch (Venture) {
            case "MM":

                Wait.driver.get(readConfig.getMMUrl());
                System.out.println("Launched Shop Msite for Login");

                break;

        }
    }


}
