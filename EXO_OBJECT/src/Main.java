import java.time.Duration;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Article phone = new Article("apple12", "iPhone", 700);
        //Livre
        Person author = new Person(
                "de Saint-Exupéry",
                "Antoine",
                LocalDate.of(1900, 5, 29));
        Livre book = new Livre(
                "refPP",
                "Le Petit Prince",
                14,
                "342453",
                50,
                author);

        book.getAuthor();
        author.addWork(book.designation);
        author.getWorks();

        //DVD
        Person director = new Person(
                "Cuaron",
                "Alfonso",
                LocalDate.of(1961, 11, 28)
        );

        DVD harryPotter = new DVD("hp", "Harry Potter", 20, Duration.ofSeconds(6000), director);
        harryPotter.getDirector();
        director.addWork(harryPotter.designation);
        director.getWorks();



    }
}