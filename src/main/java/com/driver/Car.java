package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    public boolean isManual;
    private int currentGear;
    private int seats;

    public Car(){

    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
    }

    public void changeGear(int newGear){
        if(newGear == 0){
            currentGear = 1;
        }else if(newGear>=1 && newGear<=50){
            currentGear = 1;
        }else if(newGear>=51 && newGear<=100){
            currentGear = 2;
        }else if(newGear>=101 && newGear<=150){
            currentGear = 3;
        }else if(newGear>=151 && newGear<=200){
            currentGear = 4;
        }else if(newGear>=201 && newGear<=250){
            currentGear = 5;
        }else{
            currentGear = 6;
        }
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
