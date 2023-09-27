import java.time.Duration;

public class DVD extends Article {
    private Duration time;
    final Person director;

    public DVD(String reference, String designation, double price, Duration time, Person director) {
        super(reference, designation, price);
        this.time = time;
        this.director = director;
    }

    public void getDirector() {
        System.out.println("Le réalisateur du film est : " + director.firstName + " " + director.lastName);
    }
}
