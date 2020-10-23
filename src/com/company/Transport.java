package com.company;

public class Transport implements Printable{
    private int prodYear;
    private String fuelType;
    private String model;

    public Transport(int prodYear, String fuelType, String model) {
        this.prodYear = prodYear;
        this.fuelType = fuelType;
        this.model = model;
    }

    public int getProdYear() {
        return prodYear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String print() {
            return "Transport = "+
                    "\nгод выпуска = "+prodYear+
                    "\nтип топлива = "+ fuelType+
                    "\nмодель = "+ model;
        }


    }

