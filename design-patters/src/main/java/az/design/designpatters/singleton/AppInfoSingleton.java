package az.design.designpatters.singleton;

import java.util.List;

public class AppInfoSingleton {

    private String appName = "Awesome App ";
    private String appVersion = "1.0.0";
    private List<String> appOwners = List.of("John", "Adam", "Doug", "Jerry");

    private static AppInfoSingleton instance;

    private AppInfoSingleton(){

    }

    public static AppInfoSingleton getInstance() {
        if(instance == null) {
            synchronized (AppInfoSingleton.class) {
                if(instance == null) {
                    instance = new AppInfoSingleton();
                }
            }
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public List<String> getAppOwners() {
        return appOwners;
    }
}
