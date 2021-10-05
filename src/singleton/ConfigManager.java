package singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {

    private Map<String,Object> settings = new HashMap<>();
    private static ConfigManager instance = new ConfigManager();

    private ConfigManager() {}

    public Object get(String key) {
        return settings.get(key);
    }

    public void set(String key, Object value) {
        settings.put(key,value);
    }

    public static ConfigManager getInstance(){
            return instance;
    }
}
