package hu.progmatic.model;

public class Main {

    public static void main(String[] args) {

        City budapest = new City("CITY001", "Budapest", "HU", 47.50, 19.04);
        City gyor = new City("CITY002", "Győr", "HU", 47.68, 17.65);
        Travel travel = new TrainTravel(budapest, gyor);
        AirTravel planeTravel = new AirTravel(budapest, gyor);


    }
}
