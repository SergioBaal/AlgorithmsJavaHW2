public class NoteBook {
    private Integer price;
    private Integer ramValue;
    private Manufacturer manufacturer;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRamValue() {
        return ramValue;
    }

    public void setRamValue(Integer ramValue) {
        this.ramValue = ramValue;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public static void sort(NoteBook [] noteBooks) {
        for (int i = 0; i < noteBooks.length; i++) {
            int minPrice = i;
            int minMemory = i;
            for (int j = minPrice + 1; j < noteBooks.length; j++) {
                if (noteBooks[j].getPrice() < noteBooks[minPrice].getPrice()) {
                    minPrice = j;
                }
                if (noteBooks[j].getPrice().equals(noteBooks[minPrice].getPrice())) {
                    minMemory = j;
                    if (noteBooks[j].getRamValue() < noteBooks[minPrice].getRamValue()){
                       NoteBook temp = noteBooks[minPrice];
                        noteBooks[minPrice] = noteBooks[minMemory];
                        noteBooks[minMemory] = temp;
                    }

                }
            }


            NoteBook temp = noteBooks[i];
            noteBooks[i] = noteBooks[minPrice];
            noteBooks[minPrice] = temp;

        }
    }

    @Override
    public String toString() {
        return "NoteBook: " +
                + price + "$, " +
                + ramValue + "Gb RAM, manufacturer = "
                + manufacturer +
                " ";
    }

    }
