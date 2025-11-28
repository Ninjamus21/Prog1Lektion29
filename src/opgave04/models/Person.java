package opgave04.models;

public class Person implements Comparable<Person> {
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public int compareTo(Person other) {
        if (other == null) return 1;
        String ln1 = lastname == null ? "" : lastname;
        String ln2 = other.lastname == null ? "" : other.lastname;
        int cmp = ln1.compareTo(ln2);
        if (cmp != 0) return cmp;
        String fn1 = firstname == null ? "" : firstname;
        String fn2 = other.firstname == null ? "" : other.firstname;
        return fn1.compareTo(fn2);
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }
}
