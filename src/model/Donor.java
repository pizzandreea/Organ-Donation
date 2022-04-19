package model;

public class Donor extends Person{
    private int donorId;
    private final String bloodType;
    private String organDonating;
    private boolean donated;

    public Donor(String firstName, String lastName, int age, int addressId, String gender, int donorId, String bloodType, String organDonating, boolean donated) {
        super(firstName, lastName, age, addressId, gender);
        this.donorId = donorId;
        this.bloodType = bloodType;
        this.organDonating = organDonating;
        this.donated = donated;
    }


    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getOrganDonating() {
        return organDonating;
    }

    public void setOrganDonating(String organDonating) {
        this.organDonating = organDonating;
    }

    public boolean isDonated() {
        return donated;
    }

    public void setDonated(boolean donated) {
        this.donated = donated;
    }

    @Override
    public void ChangeAddress(int newId) {
        addressId = newId;
    }

    @Override
    public String toString() {
        return "Donor{" +
                "donorId='" + donorId + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", organDonating='" + organDonating + '\'' +
                ", donated=" + donated +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", addressId='" + addressId + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
