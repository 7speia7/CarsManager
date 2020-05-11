package com.company;

import java.util.ArrayList;

public class CarManager {
    public void add(ArrayList<Car> Cars, Car car) {
    Cars.add(car);
}
    public void searchManufacturer(ArrayList<Car> carsList,String amanufacturer){
        System.out.println("|     Manufacturer      |      Model      |      Year      |      MotorCapacity      |     Engine      |");
        System.out.println("|---------------------------------------------------------------------------------------------------|");
        String manufacturer;
        String model;
        int year;
        int motorCapacity;
        String engine;

        for (int i = 0;i< carsList.size();i++){
            Car car = carsList.get(i);
            manufacturer= car.getManufacturer();
            model = car.getModel();
            year = car.getYear();
            motorCapacity = car.getMotorCapacity();
            engine = car.getEngine();

            if(amanufacturer.equals(manufacturer)) {
                System.out.println("| " + i + " | " + manufacturer + " | "+ model+" | "+ year + " | "+ motorCapacity + " |"+ engine + " |");
                System.out.println("|---------------------------------------------------------------------------------------------------|");
            }
        }
    }
}
