package com.company;

public class Train extends Transport implements Printable {

    private int howManyVagons;
    private String typeOfVagons; //грузовой или пассажирский

    public Train(int prodYear, String fuelType, String model, int howManyVagons, String typeOfVagons) {
        super(prodYear, fuelType, model);
        this.howManyVagons = howManyVagons;
        this.typeOfVagons = typeOfVagons;
    }

    public int getHowManyVagons() {
        return howManyVagons;
    }

    public String getTypeOfVagons() {
        return typeOfVagons;
    }

    public String print() {
        return super.print() +
                "\nколичество вагонов = " + howManyVagons +
                "\nтип вагонов " + typeOfVagons +
                "\n\uD83D\uDE86";
    }
}


