package com.driver;

public class Vehicle {

    private  String name;
    public int currentSpeed = 0;
    private int currentDirection = 0;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    /*public int getCurrentSpeed(){
        return currentSpeed;
    }*/
    /*public void setcurrentSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }*/


    public int getCurrentDirection(){
        return currentDirection;
    }
    public void setCurrentDirection(int currentDirection){
        this.currentDirection = currentDirection;
    }
    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle() {

    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        currentDirection += direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        currentSpeed += speed;
        currentDirection += direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){

        System.out.println("stop method called - The vehicle is stopped");
    }

}
