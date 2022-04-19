package service;

import model.Doctor;
import model.Donor;

import java.util.*;

import model.Patient;
import model.PatientComparator;

public class HospitalService {
    ArrayList<Patient> patients;
    ArrayList<Doctor> doctors;
    ArrayList<Donor> donors;

    private HospitalService(){
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        donors = new ArrayList<>();

    }

    private static class SINGLETON_HOLDER{
        private static final HospitalService INSTANCE = new HospitalService();
    }

    public static HospitalService getInstance() {
        return SINGLETON_HOLDER.INSTANCE;
    }

    public void AddPatient() {
//        System.out.println("\n The patient's first name: ");
        Patient p1 = new Patient("Cristi", "Cris", 30,
                2, "male", 1, "0-", "Liver",
                1, null);
        Patient p2 = new Patient("Cristi", "Cris", 30,
                1, "male", 2, "0-", "Liver",
                2, null);

        Patient p3 = new Patient("Cristi", "Cris", 30,
                5, "male", 3, "0-", "Liver",
                4, null);
//        Scanner scanner = new Scanner(System.in);
//        String value = scanner.nextLine();
        patients.add(p1);
        patients.add(p3);
        patients.add(p2);
    }

    public void ShowPatientsN(){
        PatientComparator patientComparator = new PatientComparator();
        Collections.sort(patients, patientComparator);

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
