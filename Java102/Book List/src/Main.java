import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Calıkusu", 541, "Reşat Nuri Güntekin", 1922));
        bookList.add(new Book("Beyaz Zambaklar Ulkesinde", 248, " Grigoriy Petrov", 1923));
        bookList.add(new Book("Aylak Adam", 192, "Yusuf Atilgan", 1959));
        bookList.add(new Book("Bu Ulke", 339, "Cemil Meric", 1975));
        bookList.add(new Book("Sol Ayagım", 89, "Christy Brown", 1985));
        bookList.add(new Book("Dönüşüm", 160, "Franz Kafka", 1940));
        bookList.add(new Book("Siyah Inci", 150, "Anna Sewell", 2014));
        bookList.add(new Book("Yılkı Atı", 95, "Peyami Safa", 1977));
        bookList.add(new Book("Ateş ve Kan", 800, "George R. R. Martin", 2020));
        bookList.add(new Book("Momo", 119, "Michael Ende", 1980));

        Map<String,String> bookAuthorPairs = new HashMap<>();

        bookList.forEach(book -> bookAuthorPairs.put(book.getBookName(), book.getAuthorName()));


        List<Book> filteredList = bookList.stream().filter(book -> book.getPageCount() < 100).toList();

        filteredList.stream().forEach(book -> System.out.println(book.getBookName()));

    }
}
