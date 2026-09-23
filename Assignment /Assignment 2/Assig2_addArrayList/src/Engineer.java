public class Engineer extends Employee {

    private int Overtime;

    public Engineer(String name, int age, double salary,String address,String gender, int Overtime) {
        super(name, age, salary,address,gender);
        this.Overtime = Overtime;
    }

    public int getOvertime() {
        return Overtime;
    }

    public void setOvertime(int Overtime) {
        this.Overtime = Overtime;
    }

    @Override
    public void display() {
        System.out.println("\n--- Engineer ---");
        super.display();
        System.out.println("Overtime: " + Overtime);
    }
}