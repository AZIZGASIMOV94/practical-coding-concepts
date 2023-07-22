package az.design.designpatters.builder.car;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Car {
    private String name;
    private String model;
    private String year;

    private Type type;

    public enum Type {
        SEDAN, HATCHBACK, SUV, SPORT, BUS
    }
}
