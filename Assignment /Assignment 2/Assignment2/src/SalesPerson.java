public class SalesPerson extends Employee {

    private double commission;

    public SalesPerson(String name, int age, double salary, double commission) {
        super(name, age, salary);
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public void display() {
        System.out.println("\n--- Sales Person ---");
        super.display();
        System.out.println("Commission: " + commission);
    }
}