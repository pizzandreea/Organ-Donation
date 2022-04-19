package model;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient o1, Patient o2) {
        return Integer.compare(o2.getUrgency(), o1.getUrgency());
    }
}
