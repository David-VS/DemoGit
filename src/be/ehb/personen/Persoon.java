package be.ehb.personen;

import java.time.LocalDate;

/**
 * This class representas a person. you can use this class to add an <b>owner</b> to a pet
 * @author david.van.steertegem
 * @version 1.0.0
* */
public class Persoon {

    private String firstName, lastName;
    private LocalDate birthdate;

    /**
     * Creates a person object
     * @param birthdate a LocalDate containing the date of birth
     * @param lastName a String containing the person's last name as stated on his ID
     * @param firstName a String containing the person's last name as stated on his ID*/
    public Persoon(String firstName, String lastName, LocalDate birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    /**
    * Calculates the age of a person, simply by subtracting the birthyear form the current year
    * @return the age of the person
    * */
    public int getAge(){
        return LocalDate.now().getYear() - this.birthdate.getYear();
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
