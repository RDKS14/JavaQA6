package vehicle;

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

    public void empty(){
        vehicles.clear();

    }

    public double totalBill() {
        double total = 0d;
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car)
                total += 1000d;
            else if (vehicle instanceof Plane)
                total+= 1000000;
            else
                total += 500d;
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
        public String toString () {
            return "Garage{" +
                    "vehicle=" + vehicles +
                    '}';
        }
    }
