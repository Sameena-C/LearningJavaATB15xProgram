package ex_29_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab259_REAL_EXAMPLE {
    public static void main(String[] args) {
        //Urls - Stage, dev, qa, preprod, prod.

        Map<String, String > env_config = new HashMap<>();
        env_config.put("production", "https://prod.api.com");
        env_config.put("staging", "https://staging.api.com");
        env_config.put("qa", "https://qa.api.com");
        env_config.put("preprod", "https://preprod.api.com");
        env_config.put("uat", "https://uat.api.com");
        env_config.put("dev", "https://dev.api.com");

        //Managing user credentials
        Map<String, String> credentails = new HashMap<>();
        credentails.put("admin", "admin123");
        credentails.put("user", "user123");
        credentails.put("user1", null);
        credentails.put("user2", null);

        // Sending the data from Map to JSON, JSON TO MAP - API Automation
        // Web Selenium - Store the Webelements with keys.


        Map<String,String> map = new HashMap(10);
        // initialCapacity -> 10
        // 20 -> Load Factor * new value = Total Capacity -> Hashmap -> increased.

        Map<Float,Double> env_config2 = new HashMap<>();

    }
}
