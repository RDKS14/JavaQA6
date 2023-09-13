package vehicle;

public class Shed <T extends Vehicle> {

    private T vehicle;

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;

    }

    public void getinfo() {
        System.out.println("Not Taxed");
        System.out.println(vehicle);

    }

}
