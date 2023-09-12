package vehicle;

public class Runner {

    public static void main(String[] args) {
        Car c = new Car();

        c.setName("ARONA");
        c.setAge(2);
        c.setBrand("SEAT");
        c.setWheels(4);
        c.setDoors(5);

  //      System.out.println(c);

        Motorbike d = new Motorbike("Ninja", 6 , "Kowazaki", 2, 0, 0);

  //      System.out.println(d);

        Garage g = new Garage();

        g.addVehicle(c);
        g.addVehicle(d);

        System.out.println(g);

 //       g.removeByID(1);
 //       System.out.println(g);

//        g.empty();

//        System.out.println(g);

        System.out.println(g.totalBill());
        g.removeByType("Car");
        System.out.println(g);

    }
}

