package model;

import java.util.ArrayList;

public class Patient extends Person{

    private int patientId;
    private String bloodType;
    private String organNeeded;
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

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getOrganNeeded() {
        return organNeeded;
    }

    public void setOrganNeeded(String organNeeded) {
        this.organNeeded = organNeeded;
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
}
