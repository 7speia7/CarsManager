package com.company;

import java.time.LocalDate;

public class Car {
    private String manufacturer;
    private String model;
    private int year;
    private int motorCapacity;
    private String engine;


    public void setManufacturer(String cManufacturer){ this.manufacturer = cManufacturer; }
    public void setModel(String cModel){this.model = cModel;}
    public void setYear(int cYear){ this.year = cYear; }
    public void setMotorCapacity(int cMotorCapacity){ this.motorCapacity = cMotorCapacity; }
    public void setEngine(String cEngine){ this.engine = cEngine;}

    public String getManufacturer(){ return this.manufacturer;}
    public String getModel(){ return this.model;}
    public int getYear(){ return this.year;}
    public int getMotorCapacity(){ return this.motorCapacity;}
    public String getEngine(){ return this.engine;}

    public Car(String manufacturer, String model, int year, int motorCapacity, String engine){
        setManufacturer(manufacturer);
        setModel(model);
        setYear(year);
        setMotorCapacity(motorCapacity);
        setEngine(engine);
    }

}
