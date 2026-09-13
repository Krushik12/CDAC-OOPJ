
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // 1. method of parent class by object of parent class
        Parent p = new Parent();
        p.parentMethod();

        // 2. method of child class by object of child class
        Child c = new Child();
        c.childMethod();

        // 3. method of parent class by object of child class
        c.parentMethod();
	}

}
