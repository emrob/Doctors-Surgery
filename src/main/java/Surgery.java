import java.util.ArrayList;

public class Surgery {

    private Patient patient;
    private Doctor doctor;
    private Nurse nurse;
    private ArrayList<People> waitingRoom;
    private ArrayList<People> doctorsRoom;


    public Surgery(Patient patient, Doctor doctor, Nurse nurse,ArrayList<People> waitingRoom,ArrayList<People> doctorsRoom){
        this.patient = patient;
        this.doctor = doctor;
        this.nurse = nurse;
        this.waitingRoom = waitingRoom;
        this.doctorsRoom = doctorsRoom;
    }

    public int checkIn(){
        waitingRoom.add(patient);
        return waitingRoom.size();
    }

    public int doctorSeePatient(){
        doctorsRoom.add(patient);
        if (doctorsRoom.size() > 0)
        waitingRoom.remove(patient);
        return doctorsRoom.size();

    }

    public String doctorTreatPatient(){
        if (patient.getSymptomlevel() == SymptomLevel.High)
       return doctor.administer();
       else
           return "no medicine required";

    }
}





