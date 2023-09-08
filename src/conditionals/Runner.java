package conditionals;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
//
//        Scanner num1 = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int x = num1.nextInt();
//
//        Scanner num2 = new Scanner(System.in);
//        System.out.println("Enter a 2nd number");
//        int y = num2.nextInt();
//
//        if (x > y)
//            System.out.println("Your The Highest number and you chose " + x);
//        else
//            System.out.println("Your The Highest number and you chose " + y);
//
//
//        Scanner num3 = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int z = num3.nextInt();
//
//        if (z % 2 == 0)
//            System.out.println("Your number was Even " + z);
//        else
//            System.out.println("Your number was Odd1 " + z);
//
//        System.out.println("Enter a traffic light colour:");
//        String colour = num1.next();
//
//       if (colour.equals("green")) System.out.println("GO!");
//        else if (colour.equals("amber")) System.out.println("Prep");
//        else if (colour.equals("red")) System.out.println("Wait");


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12");
        int z = scan.nextInt();

        switch (z){
            case 2:
            case 12:
            case 1:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("you have entered incorreectly");


        }



    }



}
