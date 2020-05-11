package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void showMeniu(){
        System.out.println("\t\t\tMeniu");
        System.out.println("\t\t\t1 - Add");
        System.out.println("\t\t\t2 - Search");
        System.out.println("\t\t\t3 - Exit");
    }

    public static void main(String[] args) {
        CarManager carManager = new CarManager();
        ArrayList<Car> CarsList = new ArrayList();
        Scanner scan = new Scanner(System.in);
        byte finish = 0;
        char input;
        try {
            do {
                showMeniu();
                input = scan.next().charAt(0);
                switch (input) {
                    case '1':{
                        System.out.println("Add");
                        System.out.println("Enter Manufacturer:");
                        scan.nextLine();
                        String manufacturer = scan.nextLine();
                        System.out.println("Enter Model:");
                        String model = scan.nextLine();
                        System.out.println("Enter Year:");
                        int year = scan.nextInt();
                        System.out.println("Enter Motor Capacity:");
                        int motorCapacity = scan.nextInt();
                        System.out.println("Enter Engine type :");
                        String engine = scan.nextLine();
                        scan.nextLine();
                        Car car = new Car(manufacturer,model,year,motorCapacity,engine);
                        carManager.add(CarsList,car);
                        break;
                    }

                    case '2':{
                        System.out.println("Search");
                        System.out.println("Enter Manufacturer:");
                        scan.nextLine();
                        String manufacturer = scan.nextLine();
                        carManager.searchManufacturer(CarsList,manufacturer);
                        break;
                      }
                    case '3':{
                        System.out.println("Exit");
                        finish=1;
                        break;
                    }
                    default: {
                        System.out.println("Enter 1|2|3 only");
                    }
                }
            } while (finish != 1);
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}