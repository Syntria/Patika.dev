import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {

        TreeSet<Book> bookSet = new TreeSet<>();

        TreeSet<Book> bookSet2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });


        bookSet.add(new Book("Ateşle Oynayan Kız", "Steig Larsson", "19-2-2007", 453));
        bookSet.add(new Book("Yeraltından Notlar", "Dostoyevski", "10-3-1980", 80));
        bookSet.add(new Book("Karamazov Kardeşler", "Dostoyevski", "12-7-1974", 684));
        bookSet.add(new Book("Kapak Kızı", "Ayfer Tunç", "6-5-2010", 327));
        bookSet.add(new Book("Sapiens", "Yuval Noah Harrari", "10-3-2012", 398));


        System.out.println();
        System.out.println("Sorted by book name:");
        System.out.println("----------------------");

        for (Book book: bookSet) {

            System.out.printf("%-25s %-20s %-15s %-15s %n", book.getBookName(), book.getWriterName(), book.getPublishDate(), book.getPageNumber());
            bookSet2.add(book);
        }

        System.out.println();
        System.out.println("Sorted by page number:");
        System.out.println("----------------------");

        for (Book book: bookSet2) {

            System.out.printf("%-25s %-20s %-15s %-15s %n", book.getBookName(), book.getWriterName(), book.getPublishDate(), book.getPageNumber());
        }


    }
}
