package abstractmethod;

import abstractmethod.car.basic.BasicVehicle;
import abstractmethod.car.lux.LuxVehicle;
import abstractmethod.factory.VehicleFactory;

public class Application {
    private BasicVehicle basicVehicle;
    private LuxVehicle luxVehicle;

    public Application(VehicleFactory vehicleFactory) {
        this.basicVehicle = vehicleFactory.getBasicVehicle();
        this.luxVehicle = vehicleFactory.getLuxVehicle();
    }

    public String getDescriptionOfBasicVehicle() {
        return this.basicVehicle.description();
    }

    public String getDescriptionOfLuxVehicle() {
        return this.luxVehicle.description();
    }
}
