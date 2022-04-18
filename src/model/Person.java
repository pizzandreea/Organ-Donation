package model;

public abstract class Person {
    String firstName ="";
    String lastName;
    int age;
    int addressId;
    String gender;

    public Person(String firstName, String lastName, int age, int addressId, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.addressId = addressId;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract void ChangeAddress(int newId);

}
