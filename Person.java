
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person extends PersonDetails
{
    public String name;
    public String dob;

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age + " years");

    }

    public static void main(String[] args) {
        Person s = new Person();
        s.name = "Ranjita";
        s.displayName();
        s.displayAge("15-02-2005");  
        s.displayDetails();
    }
}

