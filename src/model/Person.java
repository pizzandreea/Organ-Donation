package model;

public abstract class Person {
    String firstName ="";
    String lastName;
    int age;
    String addressId;
    String gender;

    public Person(String firstName, String lastName, int age, String addressId, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.addressId = addressId;
        this.gender = gender;
    }


}
