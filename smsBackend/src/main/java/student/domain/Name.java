
package student.domain;

import java.util.Optional;

public class Name {

    private String firstName;
    private Optional<String> middleName = Optional.empty();
    private Optional<String> lastName = Optional.empty();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Optional<String> getMiddleName() {
        return middleName;
    }

    public void setMiddleName(Optional<String> middleName) {
        this.middleName = middleName;
    }

    public Optional<String> getLastName() {
        return lastName;
    }

    public void setLastName(Optional<String> lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName=" + middleName +
                ", lastName=" + lastName +
                '}';
    }
}

