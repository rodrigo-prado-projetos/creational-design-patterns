package abstractmethod;

import abstractmethod.factory.BranchVehicleFactory;
import abstractmethod.factory.MainVehicleFactory;
import abstractmethod.factory.VehicleFactory;

public class Principal {
    public static void main(String[] args) {
        setApplication(new BranchVehicleFactory());
        setApplication(new MainVehicleFactory());
    }

    private static void setApplication(VehicleFactory vehicleFactory) {
        Application application = new Application(vehicleFactory);
        System.out.println(application.getDescriptionOfLuxVehicle());
        System.out.println(application.getDescriptionOfBasicVehicle());
    }
}
