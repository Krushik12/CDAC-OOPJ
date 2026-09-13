public class Engineer extends Employee {

    private String specialization;

    public Engineer(String name, int age, double salary, String specialization) {
        super(name, age, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void display() {
        System.out.println("\n--- Engineer ---");
        super.display();
        System.out.println("Specialization: " + specialization);
    }
}