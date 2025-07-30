package Equals;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int weight;

    public Person() {
    }

    public Person(String firstName, String lastName, String dateOfBirth, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {

        if(! (obj instanceof Person)){
            return false;
        }

        Person per = (Person) obj;
        return per.firstName.equals(this.firstName) && per.lastName.equals(this.lastName) && per.dateOfBirth.equals(this.dateOfBirth) && per.weight == this.weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", weight=" + weight +
                '}';
    }
}
