import java.util.ArrayList;
import java.util.Random;

public class MyBookArray {


    private static final Random randomPrice = new Random();
    private static final Random randomRAM = new Random();
    private static final Random randomManufacturer = new Random();
    private static Manufacturer manufacturer;
    public static void setManufacturer(Manufacturer manufacturer) {
        MyBookArray.manufacturer = manufacturer;
    }

    public static NoteBook[] getArray(int bookCount, int minPrice, int maxPrice, int stepPrice, int minRAM, int maxRAM, int stepRAM) {

        NoteBook[] noteBooks = new NoteBook[bookCount];

        for (int i = 0; i < bookCount; i++) {
            noteBooks[i] = new NoteBook();
            noteBooks[i].setPrice(minPrice + randomPrice.nextInt((maxPrice - minPrice) / stepPrice) * stepPrice);
            noteBooks[i].setRamValue(minRAM + randomRAM.nextInt((maxRAM - minRAM) / stepRAM) * stepRAM);
            noteBooks[i].setManufacturer(manufacturer.values()[randomManufacturer.nextInt(manufacturer.values().length-1)]);
        }
        return noteBooks;
    }


    public static void toString(NoteBook[] noteBooks) {
        for (NoteBook n : noteBooks) {
            System.out.println(n);
        }
    }
}
