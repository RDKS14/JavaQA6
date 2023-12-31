package vehicle;

public abstract class Vehicle {


    private String name;
    private int age;
    private String brand;
    private int wheels;

    private int doors;

    private int id;

    public Vehicle() {
        super();
    }

    public Vehicle(String name, int age, String brand, int wheels, int doors, int id) {
        super();
        this.name = name;
        this.age = age;
        this.brand = brand;
        this.wheels = wheels;
        this.doors = doors;
        this.id = id;
    }

    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", brand=" + brand +
                ", number of wheels =" + wheels +
                ", number of doors=" + doors +
                " ID " + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
    public abstract double totalBill();
}