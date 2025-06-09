package Task1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {
    public static void TourToFile(Tour tour, String path) {
        if (tour == null) return;
        if (path.endsWith(".txt")) writeText(path, tour.toString());
        else if (path.endsWith(".dat")) writeBinary(path, tour);
        else throw new IllegalArgumentException("File not supported");
    }

    public static void arrayListMusicBandToFile(ArrayListMusicBand band, String path) {
        if (band == null) return;
        if (path.endsWith(".txt")) writeText(path, band.toString());
        else if (path.endsWith(".dat")) writeBinary(path, band);
        else throw new IllegalArgumentException("File not supported");
    }

    public static void arrayMusicBandToFile(ArrayMusicBand band, String path) {
        if (band == null) return;
        if (path.endsWith(".txt")) writeText(path, band.toString());
        else if (path.endsWith(".dat")) writeBinary(path, band);
        else throw new IllegalArgumentException("File not supported");
    }

    public static void listMusicBandToFile(ListMusicBand band, String path) {
        if (band == null) return;
        if (path.endsWith(".txt")) writeText(path, band.toString());
        else if (path.endsWith(".dat")) writeBinary(path, band);
        else throw new IllegalArgumentException("File not supported");
    }
    
    public static void sortedSetMusicBandToFile(SortedSetMusicBand band, String path) {
        if (band == null) return;
        if (path.endsWith(".txt")) writeText(path, band.toString());
        else if (path.endsWith(".dat")) writeBinary(path, band);
        else throw new IllegalArgumentException("File not supported");
    }

    public static Tour fileToTour(String filename) {
        if (filename.endsWith(".dat")) return (Tour) readBinary(filename);
        else if (filename.endsWith(".txt")) return Tour.fromString(readText(filename));
        throw new IllegalArgumentException("File not supported");
    }

    public static ArrayMusicBand fileToArrayMusicBand(String filename) {
        if (filename.endsWith(".dat")) return (ArrayMusicBand) readBinary(filename);
        else if (filename.endsWith(".txt")) return ArrayMusicBand.fromString(readText(filename));
        throw new IllegalArgumentException("File not supported");
    }

    public static ArrayListMusicBand fileToArrayListMusicBand(String filename) {
        if (filename.endsWith(".dat")) return (ArrayListMusicBand) readBinary(filename);
        else if (filename.endsWith(".txt")) return ArrayListMusicBand.fromString(readText(filename));
        throw new IllegalArgumentException("File not supported");
    }

    public  static ListMusicBand fileToListMusicBand(String filename) {
        if (filename.endsWith(".dat")) return (ListMusicBand) readBinary(filename);
        else if (filename.endsWith(".txt")) return ListMusicBand.fromString(readText(filename));
        throw new IllegalArgumentException("File not supported");
    }
    
    public static SortedSetMusicBand fileToSortedSetMusicBand(String filename) {
        if (filename.endsWith(".dat")) return (SortedSetMusicBand) readBinary(filename);
        else if (filename.endsWith(".txt")) return SortedSetMusicBand.fromString(readText(filename));
        throw new IllegalArgumentException("File not supported");
    }

    private static String readText(String filename) {
        try { return Files.readString(Path.of(filename), StandardCharsets.UTF_8).trim(); }
        catch (IOException e) {
            System.err.println("Read error: " + filename);
            e.printStackTrace();
            return "";
        }
    }

    private static Object readBinary(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) { return ois.readObject(); }
        catch (IOException | ClassNotFoundException e) {
            System.err.println("Read error: " + filename);
            e.printStackTrace();
            return null;
        }
    }

    private static void writeText(String filename, String content) {
        try { Files.writeString(Path.of(filename), content, StandardCharsets.UTF_8); }
        catch (IOException e) {
            System.err.println("Write error: " + filename);
            e.printStackTrace();
        }
    }

    private static void writeBinary(String filename, Object obj) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) { oos.writeObject(obj); }
        catch (IOException e) {
            System.err.println("Write error: " + filename);
            e.printStackTrace();
        }
    }
}
