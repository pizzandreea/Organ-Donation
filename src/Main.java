import model.Doctor;
import model.Person;
import service.Connection;
import service.DBConnection;
import service.HospitalService;


public class Main {
//* Organ donation center -
// Donors, Doctors, Patients with an address
// Labs, Medicine
// Every patient and donor has an organ they want to recive /donate
// and a blood type*



    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection("username", "password", "url");
        Connection connection = dbConnection.getConnection();


        Person d1 = new Doctor("Gelu", "Cine", 40,1, "female", 1, 120000, "1", 3000);
//        System.out.println(d1);
        HospitalService hospitalService = HospitalService.getInstance();

        hospitalService.AddPatient();
        hospitalService.ShowPatientsN();

    }
}
