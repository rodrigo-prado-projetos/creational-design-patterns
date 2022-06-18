package abstractmethod.factory;

import abstractmethod.car.basic.BasicVehicle;
import abstractmethod.car.lux.LuxVehicle;

public interface VehicleFactory {
    LuxVehicle getLuxVehicle();

    BasicVehicle getBasicVehicle();
}
