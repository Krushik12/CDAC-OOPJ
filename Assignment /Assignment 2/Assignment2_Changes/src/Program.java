
public class Program {
	 	static Employee[] employees = new Employee[100];
	 	
	 	
	 	
	    static int count = 0;
	    static int currentIndex = -1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int ADD_EMPLOYEE = 1;
	 	final int ADD_DISPLAY = 2;
	 	final int ADD_SORT = 3;
	 	final int EXIT = 4;
		int choice;

        do {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = ConsoleInput.getInt();

            switch (choice) {
 
                case ADD_EMPLOYEE :
                    addEmployeeMenu();
                    break;

                case ADD_DISPLAY :
                    displayMenu();
                    break;

                case ADD_SORT:
                    sortMenu();
                    break;

                case EXIT:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != EXIT );
    }


// EMPLOYEE MENU 

    public static void addEmployeeMenu() {
    	final int ADD_MANAGER = 'a';
	 	final int ADD_ENGINEER = 'b';
	 	final int ADD_SALEPERSON = 'c';
	 	final int RETURN_MENU = 'd';
	 	
        char choice;

        do {
            System.out.println("\n------ ADD EMPLOYEE ------");
            System.out.println("a. Manager");
            System.out.println("b. Engineer");
            System.out.println("c. Sales Person");
            System.out.println("d. Exit to Main Menu");

            System.out.print("Enter choice: ");
            choice = ConsoleInput.getString().charAt(0);

            switch (choice) {

                case ADD_MANAGER :
                    addManager();
                    break;

                case ADD_ENGINEER :
                    addEngineer();
                    break;

                case ADD_SALEPERSON:
                    addSalesPerson();
                    break;

                case RETURN_MENU :
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != RETURN_MENU);
    }


    // ADD MANAGER 

    public static void addManager() {

        if (count == employees.length) {
            System.out.println("Employee storage is full!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = ConsoleInput.getString();

        System.out.print("Enter Age: ");
        int age = ConsoleInput.getInt();

        System.out.print("Enter Salary: ");
        double salary = ConsoleInput.getDouble();
        
        System.out.print("Enter Address: ");
        String address = ConsoleInput.getString();
        
        System.out.print("Enter Gender: ");
        String gender = ConsoleInput.getString();

        System.out.print("Enter Hra: ");
        double hra = ConsoleInput.getDouble();

        employees[count] = new Manager(name, age, salary,address,gender, hra);
        count++;

        System.out.println("Manager added successfully!");
    }


    // ADD ENGINEER 

    public static void addEngineer() {

        if (count == employees.length) {
            System.out.println("Employee storage is full!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = ConsoleInput.getString();

        System.out.print("Enter Age: ");
        int age = ConsoleInput.getInt();

        System.out.print("Enter Salary: ");
        double salary = ConsoleInput.getDouble();
        
        System.out.print("Enter Address: ");
        String address = ConsoleInput.getString();
        
        System.out.print("Enter Gender: ");
        String gender = ConsoleInput.getString();

        System.out.print("Enter Overtime: ");
        int Overtime = ConsoleInput.getInt();

        employees[count] = new Engineer(name, age, salary,address,gender, Overtime);
        count++;

        System.out.println("Engineer added successfully!");
    }


    // ADD SALES PERSON 

    public static void addSalesPerson() {

        if (count == employees.length) {
            System.out.println("Employee storage is full!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = ConsoleInput.getString();

        System.out.print("Enter Age: ");
        int age = ConsoleInput.getInt();

        System.out.print("Enter Salary: ");
        double salary = ConsoleInput.getDouble();
        
        System.out.print("Enter Address: ");
        String address = ConsoleInput.getString();
        
        System.out.print("Enter Gender: ");
        String gender = ConsoleInput.getString();

        System.out.print("Enter Commission: ");
        double commission = ConsoleInput.getDouble();

        employees[count] = new SalesPerson(name, age, salary,address,gender, commission);
        count++;

        System.out.println("Sales Person added successfully!");
    }


    // DISPLAY MENU 

    public static void displayMenu() {

    	final int ALL_EMPLOYEE = 'a';
    	final int FIRST_EMPLOYEE = 'b';
    	final int NEXT_EMPLOYEE = 'c';
    	final int PREV_EMPLOYEE = 'd';
    	final int LAST_EMPLOYEE = 'e';
    	final int RETURN_MENU = 'f';
	 	
        char choice;

        do {
            System.out.println("\n------ DISPLAY MENU ------");
            System.out.println("a. All Employees");
            System.out.println("b. First Employee");
            System.out.println("c. Next Employee");
            System.out.println("d. Previous Employee");
            System.out.println("e. Last Employee");
            System.out.println("f. Exit to Main Menu");

            System.out.print("Enter choice: ");
            choice = ConsoleInput.getString().charAt(0);

            switch (choice) {

                case ALL_EMPLOYEE :
                    displayAll();
                    break;

                case FIRST_EMPLOYEE:
                    displayFirst();
                    break;

                case NEXT_EMPLOYEE :
                    displayNext();
                    break;

                case PREV_EMPLOYEE:
                    displayPrevious();
                    break;

                case LAST_EMPLOYEE :
                    displayLast();
                    break;

                case RETURN_MENU:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != RETURN_MENU);
    }


    // ================= DISPLAY FUNCTIONS =================

    public static void displayAll() {

        if (count == 0) {
            System.out.println("No employees available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }


    public static void displayFirst() {

        if (count == 0) {
            System.out.println("No employees available.");
            return;
        }

        currentIndex = 0;
        employees[currentIndex].display();
    }


    public static void displayNext() {

        if (count == 0) {
            System.out.println("No employees available.");
            return;
        }

        if (currentIndex == -1) {
            currentIndex = 0;
            employees[currentIndex].display();
        }
        else if (currentIndex < count - 1) {
            currentIndex++;
            employees[currentIndex].display();
        }
        else {
            System.out.println("Already at last employee.");
        }
    }


    public static void displayPrevious() {

        if (count == 0) {
            System.out.println("No employees available.");
            return;
        }

        if (currentIndex > 0) {
            currentIndex--;
            employees[currentIndex].display();
        }
        else {
            System.out.println("Already at first employee.");
        }
    }


    public static void displayLast() {

        if (count == 0) {
            System.out.println("No employees available.");
            return;
        }

        currentIndex = count - 1;
        employees[currentIndex].display();
    }


    //  SORT MENU 

    public static void sortMenu() {
    	final int MANAGER = 'a';
    	final int ENGINEER = 'b';
    	final int SALE_PERSON = 'c';
    	final int EMPLOYEE_ASC = 'd';
    	final int EMPLOYEE_DSC = 'e';
    	final int RETURN_MENU = 'f';
    	

        char choice;

        do {
            System.out.println("\n------ SORT MENU ------");
            System.out.println("a. All Managers");
            System.out.println("b. All Engineers");
            System.out.println("c. All Sales Person");
            System.out.println("d. All Employees Alphabetic Ascending");
            System.out.println("e. All Employees Alphabetic Descending");
            System.out.println("f. Exit to Main Menu");

            System.out.print("Enter choice: ");
            choice = ConsoleInput.getString().charAt(0);

            switch (choice) {

                case MANAGER:
                    displayManagers();
                    break;

                case ENGINEER:
                    displayEngineers();
                    break;

                case SALE_PERSON:
                    displaySalesPersons();
                    break;

                case EMPLOYEE_ASC:
                    sortAscending();
                    break;

                case EMPLOYEE_DSC:
                    sortDescending();
                    break;

                case RETURN_MENU :
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != RETURN_MENU );
    }


    //  DISPLAY BY CATEGORY 

    public static void displayManagers() {

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (employees[i] instanceof Manager) {
                employees[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Managers found.");
        }
    }


    public static void displayEngineers() {

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (employees[i] instanceof Engineer) {
                employees[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Engineers found.");
        }
    }


    public static void displaySalesPersons() {

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (employees[i] instanceof SalesPerson) {
                employees[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Sales Persons found.");
        }
    }


    //  SORT ASCENDING 

    public static void sortAscending() {

        Employee temp;

        for (int i = 0; i < count - 1; i++) {

            for (int j = i + 1; j < count; j++) {

                if (employees[i].getName()
                        .compareToIgnoreCase(employees[j].getName()) > 0) {

                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }

        System.out.println("\nEmployees sorted in Ascending Order:");
        displayAll();
    }


    //  SORT DESCENDING 

    public static void sortDescending() {

        Employee temp;

        for (int i = 0; i < count - 1; i++) {

            for (int j = i + 1; j < count; j++) {

                if (employees[i].getName()
                        .compareToIgnoreCase(employees[j].getName()) < 0) {

                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }

        System.out.println("\nEmployees sorted in Descending Order:");
        displayAll();
	}

}
