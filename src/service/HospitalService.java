package service;

import model.Doctor;
import model.Donor;
import java.util.Collections;
import model.Patient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class HospitalService {
    ArrayList<Patient> patients;
    ArrayList<Doctor> doctors;
    ArrayList<Donor> donors;



    public void AddPatient() {
        System.out.println("\n The patient's first name: ");
        
    }

    public void ShowPatientsN(){
//        Collection.sort(patients);
        for(Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public int LookForMatch(int patientId) {
        String bloodt = "null", organ = "null";
        int donorId = -1;

        for(Patient patient : patients) {
            if(patient.getPatientId() == patientId) {
                bloodt = patient.getBloodType();
                organ  = patient.getOrganNeeded();
                break;
            }
        }
        if(bloodt.equals("null")) {
            System.out.println("\n the patient doesn t exist");
            return 0;
        }

        for(Donor donor : donors) {
            if(bloodt.equals(donor.getBloodType()) && organ.equals( donor.getOrganDonating()) ) {
                donorId =  donor.getDonorId();
            }
        }
        if(donorId == -1) {
            System.out.println("there is no match for this patient");
            return 0;
        }
        else {
            return donorId;
        }
    }


}
