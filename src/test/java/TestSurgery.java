import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestSurgery {
    Surgery surgery;
    Patient patient;
    Doctor doctor;
    Nurse nurse;
    ArrayList<Person> waitingRoom;
    ArrayList<Person> doctorsRoom;

    @Before
    public void setup() {
        doctor = new Doctor("Dr Strathie", "full time");
        patient = new Patient(SymptomLevel.Minor, "Miranda");
        nurse = new Nurse("Nurse Barbara", "part time");

        surgery = new Surgery(doctor, nurse);
    }

    @Test
    public void testCheckIn(){
        surgery.checkIn(patient);
        assertEquals(1, surgery.getWaitingRoomLength());}

    @Test
    public void testSeePatient(){
        surgery.checkIn(patient);
        surgery.doctorSeePatient(patient);
        assertEquals(0, surgery.getWaitingRoomLength());
        assertEquals(1, surgery.getDoctorsRoomLength());}


    @Test
    public void testDocTreatPatient(){
        assertEquals("no medicine required", surgery.doctorTreatPatient(patient));
    }
}
