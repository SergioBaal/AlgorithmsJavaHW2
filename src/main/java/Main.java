public class Main {
    public static void main(String[] args) {

       NoteBook [] noteBooks =  MyBookArray.getArray(1000,250,2500,50,4,24,4);
       NoteBook.sort(noteBooks);
       MyBookArray.toString(noteBooks);
    }
    }