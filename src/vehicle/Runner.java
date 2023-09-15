package vehicle;

import exceptions.VehiclesNotFound;

public class Runner {

    public static void main(String[] args) {
        Car c = new Car();

        c.setName("ARONA");
        c.setAge(2);
        c.setBrand("SEAT");
        c.setWheels(4);
        c.setDoors(5);

        //      System.out.println(c);

        Motorbike d = new Motorbike("Ninja", 6, "Kowazaki", 2, 0, 0);
        Plane r = new Plane("Boeing", 6, "Tui", 6, 2, 2);

        //     System.out.println(d);

        Garage g = new Garage();

        g.addVehicle(c);
        g.addVehicle(d);
        g.addVehicle(r);

        //     System.out.println(g);
        //      g.removeByID(1);
        //       System.out.println(g);

        //       g.empty();

        //       System.out.println(g);

//        System.out.println(g.totalBill());
        //       g.removeByType("Car");
        //       System.out.println(g);


        Bird b = new Bird();

        Plane p = new Plane();

        Flyable[] flyable = {b, p};
        for (Flyable a : flyable) {
            a.fly();
        }

        Shed cg = new Shed();
        Car arona = new Car();
        cg.setVehicle(arona);

        Vehicle myCar = cg.getVehicle();

        System.out.println(myCar);

        Shed<Vehicle> shed = new Shed<>();
        shed.setVehicle(c);

        shed.getinfo();

        Shed<Motorbike> shed2 = new Shed<>();
        shed2.setVehicle(d);

        shed2.getinfo();

        try {
            System.out.println(g.findByID(8));
        } catch (VehiclesNotFound e) {
            System.out.println(e.getMessage());
        }
    }
}

