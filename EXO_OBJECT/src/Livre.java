public class Livre extends Article {
    private String ISBN;
    int nbPages;
    final Person author;
    public Livre(String reference, String designation, double price, String ISBN, int nbPages, Person author) {
        super(reference, designation, price);
        this.ISBN = ISBN;
        this.nbPages = nbPages;
        this.author = author;
    }

    public void getAuthor() {
        System.out.println("Vous voulez lire " + designation + " de " + author.firstName + " " + author.lastName + "?");
    }
}
