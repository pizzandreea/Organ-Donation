package model;

public class Doctor extends Person {
    private String doctorId;
    private float salary;
    private String jobId;
    private float charge;


    public Doctor(String firstName, String lastName, int age, String addressId, String gender, String doctorId, float salary, String jobId, float charge) {
        super(firstName, lastName, age, addressId, gender);
        this.doctorId = doctorId;
        this.salary = salary;
        this.charge = charge;
        this.jobId = jobId;
    }


}
