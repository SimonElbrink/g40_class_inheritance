package se.lexicon;

import java.time.LocalDate;
import java.util.Arrays;

public class Developer extends Employee{

    String[] certificates;

    public Developer(String firstName, String lastName, LocalDate birthDate, double salary, LocalDate hiredDate, String[] certificates) {
        super(firstName, lastName, birthDate, salary, hiredDate);
        this.certificates = certificates;
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "certificates=" + Arrays.toString(certificates) +
                "} " + super.toString();
    }
}
