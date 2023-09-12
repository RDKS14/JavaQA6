package vehicle;

public class Plane extends Vehicle {
    public Plane() {
    }

    public Plane(String name, int age, String brand, int wheels, int doors, int id){
        super(name, age, brand, wheels, doors, id);
    }

    public void voosh(){
        System.out.println("Come on Lets Fly lets Fly awayyyyyyy");

    }
}
