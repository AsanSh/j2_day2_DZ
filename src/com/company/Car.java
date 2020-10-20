package com.company;

public class Car extends Transport implements Printable {

    private String transmissionType;
    private int volume;

    public Car(int prodYear, String fuelType, String model, String transmissionType, int volume) {
        super(prodYear, fuelType, model);
        this.transmissionType = transmissionType;
        this.volume = volume;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public int getVolume() {
        return volume;
    }

    public String print() {
        return "🚗";
    }

    }


