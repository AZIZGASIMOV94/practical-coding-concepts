package az.design.designpatters.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@ConfigurationProperties(prefix = "design-patterns-app")
@Data
@Component
public class ApplicationInfoConfig {

    private String name;
    private String version;
    private List<String> socialAddresses;
    private List<Owners> owners;

    @Data
    public static class Owners {
        private String name;
        private String surname;
        private String contact;
    }

}
