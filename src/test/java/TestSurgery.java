import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestSurgery {
    Surgery surgery;
    Patient patient;
    Doctor doctor;
    Nurse nurse;
    ArrayList<People> waitingRoom;
    ArrayList<People> doctorsRoom;

    @Before
    public void setup() {
        doctor = new Doctor("Dr Strathie", "full time");
        patient = new Patient(SymptomLevel.Minor, "Miranda");
        nurse = new Nurse("Nurse Barbara", "part time");
        waitingRoom = new ArrayList<>();
        waitingRoom.add(patient);
        doctorsRoom = new ArrayList<>();

        surgery = new Surgery(patient, doctor, nurse, waitingRoom, doctorsRoom);
    }

    @Test
    public void testCheckIn(){
        assertEquals(2, surgery.checkIn());}

    @Test
    public void testSeePatient(){
        assertEquals(1, surgery.doctorSeePatient());
        assertEquals(1, surgery.checkIn());
       }

    @Test
    public void testDocTreatPatient(){
        assertEquals("no medicine required", surgery.doctorTreatPatient());
    }
}
