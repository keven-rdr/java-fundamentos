package cursojavaNelioAlves.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Customer {
    private String name;
    private String email;
    private LocalDate birthDate;

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Customer() {}

    public Customer(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return name + " (" + fmt.format(birthDate) + ") - " + email;
    }
}
