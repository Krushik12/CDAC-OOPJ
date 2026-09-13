public class Manager extends Employee {

    private double bonus;

    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void display() {
        System.out.println("\n--- Manager ---");
        super.display();
        System.out.println("Bonus: " + bonus);
    }
}