package hu.progmatic.model;

public class Main {

    public static void main(String[] args) {

        City budapest = new City("CITY001", "Budapest", "HU", 47.50, 19.04);
        City gyor = new City("CITY002", "Győr", "HU", 47.68, 17.65);
        Travel[] travels = {
                new TrainTravel(budapest, gyor),
                new AirTravel(budapest, gyor)
        };

        Product[] products = {
                new Product("mogyoró", 500.0),
                new Product("sör", 169.0)
        };

        Activity[] activities = {
                new Activity("sétálás", 1.0),
                new Activity("mozizás", 2.5)
        };

        HasTime[] hasTimes = {
                travels[0],
                travels[1],
                activities[0],
                activities[1]
        };

        HasPrice[] hasPrices = {
                travels[0],
                travels[1],
                products[0],
                products[1]
        };

        System.out.println(getTotalTime(hasTimes));

        System.out.println(getTotalPrice(hasPrices));


    }

    private static double getTotalTime(HasTime[] items) {
        double sum = 0.0;

        for (HasTime item : items) {
            sum += item.getTime();
        }

        return sum;
    }

    private static double getTotalPrice(HasPrice[] items) {
        double sum = 0.0;

        for (HasPrice item : items) {
            sum += item.getPrice();
        }

        return sum;
    }

}
