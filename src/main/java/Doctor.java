public class Doctor extends Person implements ISurgery {

    private String hoursWorked;

    public Doctor(String name, String hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String administer() {
        return "medicine provided";
    }
}