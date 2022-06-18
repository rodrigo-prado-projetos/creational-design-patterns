package abstractmethod.factory;

import abstractmethod.car.basic.BasicVehicle;
import abstractmethod.car.basic.CarBasicMain;
import abstractmethod.car.lux.CarLuxMain;
import abstractmethod.car.lux.LuxVehicle;

public class MainVehicleFactory implements VehicleFactory {
    @Override
    public LuxVehicle getLuxVehicle() {
        return new CarLuxMain();
    }

    @Override
    public BasicVehicle getBasicVehicle() {
        return new CarBasicMain();
    }
}
