public class Manager extends Employee {

    private double hra;

    public Manager(String name, int age, double salary,String address,String gender, double hra) {
        super(name, age, salary,address,gender);
        this.hra = hra;
    }

    public double gethra() {
        return hra;
    }

    public void sethra(double hra) {
        this.hra = hra;
    }

    @Override
    public void display() {
        System.out.println("\n--- Manager ---");
        super.display();
        System.out.println("Hra: " + hra);
    }
}