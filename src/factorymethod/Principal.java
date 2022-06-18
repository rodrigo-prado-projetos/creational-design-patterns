package factorymethod;

public class Principal {
    public static void main(String[] args) {
        FactoryVehicle factoryVehicle = new FactoryVehicle();

        Vehicle car = factoryVehicle.createObject("Car");
        System.out.println(car.getType());

        Vehicle truck = factoryVehicle.createObject("Truck");
        System.out.println(truck.getType());
    }
}
