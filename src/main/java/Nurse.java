public class Nurse extends Person implements ISurgery {

    private String hoursWorked;

    public Nurse(String name, String hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String administer() {
        return "medicine administered";
    }
}
