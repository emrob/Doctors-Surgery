public class Patient extends People {

    private SymptomLevel symptomlevel;

    public Patient(SymptomLevel symptomlevel, String name){
        super(name);
        this.symptomlevel = symptomlevel;


}

    public SymptomLevel getSymptomlevel() {
        return symptomlevel;
    }
}
