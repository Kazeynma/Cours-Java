import java.time.LocalDate;
import java.util.ArrayList;

public class Person {
    public String lastName;
    public String firstName;
    public LocalDate birthDate;
    private ArrayList<String> works = new ArrayList<>();


    public Person(String lastName, String firstName, LocalDate birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

    public void addWork(String title) {
        works.add(title);
    }

    public void getWorks() {
        System.out.println(lastName + " " + firstName + " a travaillé sur : " + works);
    }
}
