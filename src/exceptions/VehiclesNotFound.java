package exceptions;

import vehicle.*;
import vehicle.Garage;

public class VehiclesNotFound extends Exception {

    public VehiclesNotFound(String message) {
        super(message);
    }


}
