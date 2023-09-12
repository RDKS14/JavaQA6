package vehicle;

public class Car extends Vehicle {

    @Override
    public double totalBill() {
        return 1000;
    }

    public Car() {
    }

    public Car(String name, int age, String brand, int wheels, int doors, int id){
        super(name, age, brand, wheels, doors, id);
    }

    public void road(){
        System.out.println("I Drive on roads");

    }

}