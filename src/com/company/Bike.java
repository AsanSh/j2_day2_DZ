package com.company;

public class Bike extends Transport{

    private String typeOfBike;  //горный или простой
    private int quantityOfWeel;

    public String createObject(){
        new Bike();
    }
    public Bike(int prodYear, String fuelType, String model, String typeOfBike, int quantityOfWeel) {
        super(prodYear, fuelType, model);
        this.typeOfBike = typeOfBike;
        this.quantityOfWeel = quantityOfWeel;
    }

    public String getTypeOfBike() {
        return typeOfBike;
    }

    public int getQuantityOfWeel() {
        return quantityOfWeel;
    }
    public String print(){
        return "\uD83D\uDEB2";
    }


}
