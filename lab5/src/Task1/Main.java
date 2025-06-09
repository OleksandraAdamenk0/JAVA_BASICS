package Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Tour[] tours = {new Tour("Tour 1", "12.06.2000", 14), new Tour("Tour2", "01.12.2019", 9)};
        List<Tour> tours2 = Arrays.asList(tours);

        FileManager.TourToFile(tours[0], "lab5/src/Task1/TourToFile.txt");
        FileManager.TourToFile(tours[1], "lab5/src/Task1/TourToFile.dat");

        ArrayMusicBand arrayBand = new ArrayMusicBand("Band1", "Dude1", tours);
        ArrayListMusicBand arrayListBand = new ArrayListMusicBand("Band 2", "Dude2",  tours2);
        ListMusicBand listBand = new ListMusicBand("Band3", "Dude3");
        listBand.addTour(tours[0]);
        listBand.addTour(tours[1]);
        SortedSetMusicBand sortedSetMusicBand = new SortedSetMusicBand("Band 4", "Dude4");
        sortedSetMusicBand.addTour(tours[0]);
        sortedSetMusicBand.addTour(tours[1]);

        FileManager.arrayMusicBandToFile(arrayBand, "lab5/src/Task1/ArrayMusicBand.txt");
        FileManager.arrayListMusicBandToFile(arrayListBand, "lab5/src/Task1/ArrayListMusicBand.txt");
        FileManager.listMusicBandToFile(listBand, "lab5/src/Task1/ListMusicBand.txt");
        FileManager.sortedSetMusicBandToFile(sortedSetMusicBand, "lab5/src/Task1/SortedSetMusicBand.txt");

        FileManager.arrayMusicBandToFile(arrayBand, "lab5/src/Task1/ArrayMusicBand.dat");
        FileManager.arrayListMusicBandToFile(arrayListBand, "lab5/src/Task1/ArrayListMusicBand.dat");
        FileManager.listMusicBandToFile(listBand, "lab5/src/Task1/ListMusicBand.dat");
        FileManager.sortedSetMusicBandToFile(sortedSetMusicBand, "lab5/src/Task1/SortedSetMusicBand.dat");

        Tour restored = FileManager.fileToTour("lab5/src/Task1/TourToFile.txt");
        System.out.print("Restored txt tour:\n");
        PrintTour.printTour(restored);

        ArrayMusicBand restoredArrayMusicBand = FileManager.fileToArrayMusicBand("lab5/src/Task1/ArrayMusicBand.txt");
        System.out.println("\nRestored txt arrayMusicBand:");
        PrintBand.printBand(restoredArrayMusicBand);

        ArrayListMusicBand restoredArrayListMusicBand = FileManager.fileToArrayListMusicBand("lab5/src/Task1/ArrayListMusicBand.txt");
        System.out.println("\nRestored txt arrayListMusicBand:");
        PrintBand.printBand(restoredArrayListMusicBand);

        ListMusicBand restoredListMusicBand = FileManager.fileToListMusicBand("lab5/src/Task1/ListMusicBand.txt");
        System.out.println("\nRestored txt listMusicBand:");
        PrintBand.printBand(restoredListMusicBand);
        
        SortedSetMusicBand restoredSortedSetMusicBand = FileManager.fileToSortedSetMusicBand("lab5/src/Task1/SortedSetMusicBand.txt");
        System.out.println("\nRestored txt SortedSetMusicBand:");
        PrintBand.printBand(restoredSortedSetMusicBand);

        Tour restored1 = FileManager.fileToTour("lab5/src/Task1/TourToFile.dat");
        System.out.print("\nRestored dat tour:\n");
        PrintTour.printTour(restored1);

        ArrayMusicBand restoredArrayMusicBand1 = FileManager.fileToArrayMusicBand("lab5/src/Task1/ArrayMusicBand.dat");
        System.out.println("\nRestored dat arrayMusicBand:");
        PrintBand.printBand(restoredArrayMusicBand1);

        ArrayListMusicBand restoredArrayListMusicBand1 = FileManager.fileToArrayListMusicBand("lab5/src/Task1/ArrayListMusicBand.dat");
        System.out.println("\nRestored dat arrayListMusicBand:");
        PrintBand.printBand(restoredArrayListMusicBand1);

        ListMusicBand restoredListMusicBand1 = FileManager.fileToListMusicBand("lab5/src/Task1/ListMusicBand.txt");
        System.out.println("\nRestored dat listMusicBand:");
        PrintBand.printBand(restoredListMusicBand1);

        SortedSetMusicBand restoredSortedSetMusicBand1 = FileManager.fileToSortedSetMusicBand("lab5/src/Task1/SortedSetMusicBand.dat");
        System.out.println("\nRestored dat SortedSetMusicBand:");
        PrintBand.printBand(restoredSortedSetMusicBand1);
    }
}
