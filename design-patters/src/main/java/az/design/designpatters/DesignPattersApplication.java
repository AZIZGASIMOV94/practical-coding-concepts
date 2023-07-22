package az.design.designpatters;

import az.design.designpatters.abstrsctfactory.impl.MacOSFactoryImplInter;
import az.design.designpatters.abstrsctfactory.impl.WindowsFactoryInterImpl;
import az.design.designpatters.abstrsctfactory.inter.ButtonInter;
import az.design.designpatters.abstrsctfactory.inter.GUIFactoryInter;
import az.design.designpatters.builder.car.Car;
import az.design.designpatters.builder.house.ConcreteHouseBuilderImpl;
import az.design.designpatters.config.ApplicationInfoConfig;
import az.design.designpatters.singleton.AppInfoSingleton;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan(basePackages = "az.design.designpatters.config")
@RequiredArgsConstructor
public class DesignPattersApplication implements CommandLineRunner {

    private final  ApplicationInfoConfig applicationInfoConfig;

    public static void main(String[] args) {
        SpringApplication.run(DesignPattersApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

		/*
			sample runner code for singleton pattern
		 */
        System.out.println("Sample runner code for singleton pattern: ");
        System.out.println();
        AppInfoSingleton appInfoSingleton = AppInfoSingleton.getInstance();
        AppInfoSingleton appInfoSingleton2 = AppInfoSingleton.getInstance();

        System.out.println(
                String.format("App name: %s \n App version: %s \n App Owners: %s \n App instance-1 id: %s \n App instance-2 id: %s",
                        appInfoSingleton.getAppName(),
                        appInfoSingleton.getAppVersion(),
                        appInfoSingleton.getAppOwners(),
                        appInfoSingleton.hashCode(),
                        appInfoSingleton2.hashCode()
                )
        );

		/*
			sample runner code for builder pattern
		 */
        System.out.println();
        System.out.println("Sample runner code for builder pattern: ");
        System.out.println();
        ConcreteHouseBuilderImpl concreteHouseBuilder = new ConcreteHouseBuilderImpl();
        concreteHouseBuilder.buildRoof();
        concreteHouseBuilder.buildFoundation();
        concreteHouseBuilder.buildStructure();

        System.out.println(concreteHouseBuilder.getHouse());

        Car car = Car.builder()
                .name("Toyota")
                .model("Prius")
                .type(Car.Type.HATCHBACK)
                .year("2020")
                .build();

        System.out.println(car);
        System.out.println();
		/*
			sample runner code for abstract factory pattern
		 */
        System.out.println("Sample runner code for abstract factory pattern:   ");
        System.out.println();
        GUIFactoryInter windowsFactory = new WindowsFactoryInterImpl();
        GUIFactoryInter macOSFactory = new MacOSFactoryImplInter();
        ButtonInter windowsButtonInter = windowsFactory.createButton();
        ButtonInter macOSButtonInter = macOSFactory.createButton();

        windowsButtonInter.render();
        macOSButtonInter.render();
        System.out.println();

        /*
			sample runner code for use case of @ConfigurationProperties
		 */

        System.out.println("Sample runner code for abstract factory pattern:   ");
        System.out.println();
        System.out.print(applicationInfoConfig);

    }
}
