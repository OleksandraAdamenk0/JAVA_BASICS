package Task5;

public class TaskFive {

    public static void main(String[] args) {
        Tour tour1 = new Tour("Kharkiv", "23.11.2023", 2);
        Tour tour2 = new Tour("Lviv", "12.09.2024", 3);
        Tour tour3 = new Tour("Dnipro", "16.08.2023", 7);
        Tour tour4 = new Tour("Lviv", "09.01.2025", 3);
        Tour tour5 = new Tour("Ivano-Frankivsk", "01.04.2026", 5);

        Tour[] tours = {tour1, tour2, tour3, tour4, tour5};
        Band band = new Band("SuperDuperBand", "Bogdanych", tours);

        PrintBand.printBand(band);

        System.out.printf("%c\n", (Utils.findLastLetter(band)));
        PrintTour.printTour(Utils.findMaxConcertTour(band));

        System.out.println("Tours to Lviv:");
        Tour[] toursToLviv = Utils.findToursToCity(band, "Lviv");
        if (toursToLviv == null) System.out.println("No tours found");
        else for (Tour tour : toursToLviv) PrintTour.printTour(tour);

        System.out.println("Tours to Krakiv:");
        Tour[] toursToKrakiv = Utils.findToursToCity(band, "Krakiv");
        if (toursToKrakiv == null) System.out.println("No tours found");
        else for (Tour tour : toursToKrakiv) PrintTour.printTour(tour);
    }
}

