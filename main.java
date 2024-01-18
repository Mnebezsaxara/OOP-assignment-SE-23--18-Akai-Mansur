import java.util.ArrayList;
import java.util.Collections;
public class main {
    public static void main(String[] args) {
        Employee employee_1 = new Employee("Ansar", "Akaev", "Manager", 3000000);
        Employee employee_2 = new Employee("Danial", "Salamat", "Developer", 500000.00);
        Student student_1 = new Student("Mansur", "Akai", 3.50);
        Student student_2 = new Student("Nariman", "Zabirhan", 2.20);

        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(employee_1);
        peopleList.add(employee_2);
        peopleList.add(student_1);
        peopleList.add(student_2);

        Collections.sort(peopleList);


        printData(peopleList);
    }
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.printf("%s earns %.2f tenge%n", person, person.getPaymentAmount());
        }
    }
}