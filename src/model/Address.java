package model;

final public class Address {
    private String addressId;
    private String postalCode;
    private String phone;
    private String city;
    private String street;
    private Integer number;

    public Address(String addressId, String postalCode, String phone, String city, String street, Integer number) {
        this.addressId = addressId;
        this.postalCode = postalCode;
        this.phone = phone;
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId='" + addressId + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
