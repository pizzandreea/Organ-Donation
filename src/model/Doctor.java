package model;

public class Doctor extends Person {
    private int doctorId;
    private float salary;
    private String jobId;
    private float charge;


    public Doctor(String firstName, String lastName, int age, int addressId, String gender, int doctorId, float salary, String jobId, float charge) {
        super(firstName, lastName, age, addressId, gender);
        this.doctorId = doctorId;
        this.salary = salary;
        this.charge = charge;
        this.jobId = jobId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public float getCharge() {
        return charge;
    }

    public void setCharge(float charge) {
        this.charge = charge;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId='" + doctorId + '\'' +
                ", salary=" + salary +
                ", jobId='" + jobId + '\'' +
                ", charge=" + charge +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", addressId='" + addressId + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public void ChangeAddress(int newId) {
        addressId = newId;
    }
}
