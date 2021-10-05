package singleton;

public class Main {

    public static void main(String[] args) {

        // the configuration should be defined once
        ConfigManager configManager = ConfigManager.getInstance();
        configManager.set("username","hamza");
        System.out.println(configManager.get("username"));


        // second instance returns always the same
        ConfigManager configManager2 = ConfigManager.getInstance();
        System.out.println(configManager2.get("username"));

    }
}
