interface Payable {
    double getPaymentAmount();
}

class Person implements Payable, Comparable<Person> {
    private static int idCounter = 1;

    private int id;
    private String name;
    private String surname;

    public Person() {
        this.id = idCounter++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("%s: %d %s %s", getPosition(), id, name, surname);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return "Person";
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Double.compare(this.getPaymentAmount(), otherPerson.getPaymentAmount());
    }

    @Override
    public double getPaymentAmount() {
        return 0.00;
    }
}