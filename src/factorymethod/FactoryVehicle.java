package factorymethod;

public class FactoryVehicle {
    public Vehicle createObject(String type) {
        switch (type) {
            case "Car":
                return new Car();
            case "Truck":
                return new Truck();
            default:
                return null;
        }
    }
}