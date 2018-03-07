import java.util.ArrayList;

public class Surgery {

    private Doctor doctor;
    private Nurse nurse;
    private ArrayList<Person> waitingRoom;
    private ArrayList<Person> doctorsRoom;


    public Surgery(Doctor doctor, Nurse nurse){
        this.doctor = doctor;
        this.nurse = nurse;
        this.waitingRoom = new ArrayList<>();
        this.doctorsRoom = new ArrayList<>();
    }

    public void checkIn(Patient patient){
        waitingRoom.add(patient);
    }

    public int getWaitingRoomLength() {
        return waitingRoom.size();
    }

    public int getDoctorsRoomLength() {
        return doctorsRoom.size();
    }

    public void doctorSeePatient(Patient patient){
        if (waitingRoom.contains(patient)){
            doctorsRoom.add(patient);
            waitingRoom.remove(patient);
        }
    }

    public String doctorTreatPatient(Patient patient){
        if (patient.getSymptomlevel() == SymptomLevel.High)
            return doctor.administer();
        else
            return "no medicine required";

    }
}





