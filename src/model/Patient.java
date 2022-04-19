package model;

import java.util.ArrayList;
import java.util.Comparator;

public class Patient extends Person  {

    private int patientId;
    private final String bloodType;
    private String organNeeded;
//    0 - fine (it has already received it)
//    1 - ok
//    2 - in bad shape
//    3 - needs it in the next 2 months
//    4 - urgently needs it in the next two weeks

    private int urgency;
    private ArrayList<Medicine> medicines;


    public Patient(String firstName, String lastName, int age, int addressId, String gender, int patientId, String bloodType, String organNeeded, int urgency, ArrayList<Medicine> medicines) {
        super(firstName, lastName, age, addressId, gender);
        this.patientId = patientId;
        this.bloodType = bloodType;
        this.organNeeded = organNeeded;
        this.urgency = urgency;
        this.medicines = medicines;
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getOrganNeeded() {
        return organNeeded;
    }

    public void setOrganNeeded(String organNeeded) {
        this.organNeeded = organNeeded;
    }

    public int getUrgency() {
        return urgency;
    }

    public int isUrgency() {
        return urgency;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    @Override
    public void ChangeAddress(int newId) {
        addressId = newId;
    }

    public void AddMedication(Medicine newMedicine){
        medicines.add(newMedicine);
    }

    public void DeleteMedication(int medicineId) {
        for(Medicine medicine : medicines) {
            if(medicine.getMedicineId() == medicineId) {
                medicines.remove(medicine);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", bloodType='" + bloodType + '\'' +
                ", organNeeded='" + organNeeded + '\'' +
                ", urgency=" + urgency +
                ", medicines=" + medicines +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", addressId=" + addressId +
                ", gender='" + gender + '\'' +
                '}';
    }


}

