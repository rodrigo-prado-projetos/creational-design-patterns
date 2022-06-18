package abstractmethod.factory;

import abstractmethod.car.basic.BasicVehicle;
import abstractmethod.car.basic.CarBasicBranch;
import abstractmethod.car.lux.CarLuxBranch;
import abstractmethod.car.lux.LuxVehicle;

public class BranchVehicleFactory implements VehicleFactory {
    @Override
    public LuxVehicle getLuxVehicle() {
        return new CarLuxBranch();
    }

    @Override
    public BasicVehicle getBasicVehicle() {
        return new CarBasicBranch();
    }
}
