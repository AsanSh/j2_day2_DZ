package com.company;

public class Plane extends Transport{

   private int speedLimit;
   private int quantityOfPassangers;

    public Plane(int prodYear, String fuelType, String model, int speedLimit, int quantityOfPassangers) {
        super(prodYear, fuelType, model);
        this.speedLimit = speedLimit;
        this.quantityOfPassangers = quantityOfPassangers;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public int getQuantityOfPassangers() {
        return quantityOfPassangers;
    }
    public String print(){
        return "\uD83D\uDE86";
    }



}
