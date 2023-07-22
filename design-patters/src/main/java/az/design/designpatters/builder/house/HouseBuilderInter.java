package az.design.designpatters.builder.house;

public interface HouseBuilderInter {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();
}