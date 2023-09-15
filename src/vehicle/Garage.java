package vehicle;

import exceptions.VehiclesNotFound;

import java.util.ArrayList;
import java.util.List;

public class Garage extends Vehicle {

    private int idCount;

    public Garage() {
        this.idCount = 0;
    }

    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle a) {
        a.setID(idCount);
        idCount++;
        vehicles.add(a);

    }

    public boolean removeVehicle(Vehicle a) {
        return this.vehicles.remove(a);
    }

    public boolean removeByID(int id) {
        Vehicle removing = null;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getID() == id) {
                return vehicles.remove(vehicle);
            }
        }
        return false;
    }

    public String findByID(int id) throws VehiclesNotFound {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getID() == id) {
                return "details" + vehicle;
            }
        }
        throw new VehiclesNotFound("Not in this Garage " + id);
    }

    public void empty() {
        vehicles.clear();

    }

    public double totalBill() {
        double total = 0;
        for (Vehicle vehicle : vehicles) {
            total += vehicle.totalBill();
        }
        return total;
    }

    public void removeByType(String type) {
        switch (type.toLowerCase()) {
            case "car":
                vehicles.removeIf(vehicle -> vehicle instanceof Car);
                break;
            case "motorbike":
                vehicles.removeIf(vehicle -> vehicle instanceof Motorbike);
                break;
            case "plane":
                vehicles.removeIf(vehicle -> vehicle instanceof Plane);
                break;
            default:
                System.out.println(" No Vehicle matching that description");
                break;

        }

    }

    @Override
    public String toString() {
        return "Garage{" +
                "vehicle=" + vehicles +
                '}';
    }
}
