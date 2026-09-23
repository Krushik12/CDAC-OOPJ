import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;



public class Program {
	static List<Employee> employees = new ArrayList<>();

	static int count = 0;
	static int currentIndex = -1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int ADD_EMPLOYEE = 1;
		final int ADD_DISPLAY = 2;
		final int ADD_SORT = 3;
		final int SAVE = 4;
		final int LOAD = 5;
		final int EXIT = 6;
		int choice;

		do {
			System.out.println("\n========== MAIN MENU ==========");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display");
			System.out.println("3. Sort");
			System.out.println("4. Save Employees");
			System.out.println("5. Load Employees");
			System.out.println("6. Exit");

			System.out.print("Enter your choice: ");
			choice = ConsoleInput.getInt();

			switch (choice) {

			case ADD_EMPLOYEE:
				addEmployeeMenu();
				break;

			case ADD_DISPLAY:
				displayMenu();
				break;

			case ADD_SORT:
				sortMenu();
				break;

			case SAVE:
				saveEmployees();
				break;

			case LOAD:
				loadEmployees();
				break;

			case EXIT:
				System.out.println("Exiting program...");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != EXIT);
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

			if (choice == ADD_MANAGER || choice == ADD_ENGINEER || choice == ADD_SALEPERSON) {
				
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
				
				
				
				if(choice == ADD_MANAGER) {
					System.out.print("Enter Hra: ");
					double hra = ConsoleInput.getDouble();
					
					employees.add(new Manager(name, age, salary, address, gender, hra));

					System.out.println("Manager added successfully!");
				}
				
				if(choice == ADD_ENGINEER) {
					System.out.print("Enter Overtime: ");
					int Overtime = ConsoleInput.getInt();

					employees.add( new Engineer(name, age, salary, address, gender, Overtime));
					

					System.out.println("Engineer added successfully!");
				}
				if(choice == ADD_SALEPERSON) {
					System.out.print("Enter Commission: ");
					double commission = ConsoleInput.getDouble();

					employees.add( new SalesPerson(name, age, salary, address, gender, commission));
					

					System.out.println("Sales Person added successfully!");
				}
				
				if(choice==RETURN_MENU) {
					System.out.println("Returning to Main menu");
					
				}	
			}
			else {
				 System.out.println("Invalid employee choice.");
			}


		} while (choice != RETURN_MENU);
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

			case ALL_EMPLOYEE:
				displayAll();
				break;

			case FIRST_EMPLOYEE:
				displayFirst();
				break;

			case NEXT_EMPLOYEE:
				displayNext();
				break;

			case PREV_EMPLOYEE:
				displayPrevious();
				break;

			case LAST_EMPLOYEE:
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

	// DISPLAY FUNCTIONS
	public static void displayAll() {

		if (employees.isEmpty()) {
			System.out.println("No employees available.");
			return;
		}

		for (Employee employee : employees) {
			employee.display();
		}
	}

	public static void displayFirst() {

		if (employees.isEmpty()) {
			System.out.println("No employees available.");
			return;
		}

		currentIndex = 0;
		employees.get(currentIndex).display();
	}

	public static void displayNext() {

		if (employees.isEmpty()) {
			System.out.println("No employees available.");
			return;
		}

		if (currentIndex == -1) {
			currentIndex = 0;
			employees.get(currentIndex).display();
		} else if (currentIndex < employees.size() - 1) {
			currentIndex++;
			employees.get(currentIndex).display();
		} else {
			System.out.println("Already at last employee.");
		}
	}

	public static void displayPrevious() {

		if (employees.isEmpty()) {
			System.out.println("No employees available.");
			return;
		}

		if (currentIndex > 0) {
			currentIndex--;
			employees.get(currentIndex).display();
		} else {
			System.out.println("Already at first employee.");
		}
	}

	public static void displayLast() {

		if (employees.isEmpty()) {
			System.out.println("No employees available.");
			return;
		}

		currentIndex = employees.size() - 1;
		employees.get(currentIndex).display();
	}

	// SORT MENU

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

			case RETURN_MENU:
				System.out.println("Returning to Main Menu...");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != RETURN_MENU);
	}

	// DISPLAY BY CATEGORY

	public static void displayManagers() {

		boolean found = false;

		for (Employee employee : employees) {

			if (employee instanceof Manager manager) {
				manager.display();
				found = true;
			}
		}

		if (!found) {
			System.out.println("No Managers found.");
		}
	}

	public static void displayEngineers() {

		boolean found = false;

		for (Employee employee : employees) {

			if (employee instanceof Engineer engineer) {
				engineer.display();
				found = true;
			}
		}

		if (!found) {
			System.out.println("No Engineers found.");
		}
	}

	public static void displaySalesPersons() {

		boolean found = false;

		for (Employee employee : employees) {

			if (employee instanceof SalesPerson salesperson) {
				salesperson.display();
				found = true;
			}
		}

		if (!found) {
			System.out.println("No Sales Persons found.");
		}
	}

	// SORT ASCENDING

	public static void sortAscending() {

		employees.sort((employee1,employee2)->employee1.getName().compareToIgnoreCase(employee2.getName())
				
				);
		
		

		System.out.println("\nEmployees sorted in Ascending Order:");
		displayAll();
	}

	// SORT DESCENDING

	public static void sortDescending() {

		employees.sort((employee1,employee2)->employee2.getName().compareToIgnoreCase(employee1.getName())
				);

		System.out.println("\nEmployees sorted in Descending Order:");
		displayAll();
	}

	// save
	public static void saveEmployees() {
		
		FileOutputStream fileStream = null;
		ObjectOutputStream objectStream =null;
		
		try{
    		fileStream = new FileOutputStream("Employee.txt");
    		objectStream = new ObjectOutputStream(fileStream);
    		
    		objectStream.writeObject(employees);
    		
    		System.out.println("Employee object created successfully");
    		}
    		catch(FileNotFoundException fn) {
    			fn.printStackTrace();
    		}
    		catch(IOException io) {
    			System.out.println("Error writing the file, check permissions");
    		}
    		finally {
    			try{
    				if(objectStream!= null) 
    					objectStream.close();
    				if(fileStream!= null) 
    					fileStream.close();
    				}catch(IOException e) {
    					e.printStackTrace();
    				}
    		}	
		
	}

	// load
	public static void loadEmployees() {
		
		FileInputStream fStream = null;
        ObjectInputStream otStream = null;

        try {

            fStream = new FileInputStream("Employee.txt");
            otStream = new ObjectInputStream(fStream);

            employees = (ArrayList<Employee>) otStream.readObject();
            System.out.println("Employees loaded successfully.");

        }
        catch (FileNotFoundException fn) {
            System.out.println("Employee.txt file not found.");
        }
        catch (ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }
        catch (IOException io) {
            System.out.println("Error reading the file.");

        }
        finally {

            try {

                if (otStream != null)
                    otStream.close();
                if (fStream != null)
                    fStream.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
	}

}
