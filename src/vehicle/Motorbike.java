package vehicle;

public class Motorbike extends Vehicle{

    public Motorbike() {
    }

    public Motorbike(String name, int age, String brand, int wheels, int doors, int id){
        super(name, age, brand, wheels, doors, id);
    }

    public void bike(){
        System.out.println(" I Drive on and off roads ");

    }
}
