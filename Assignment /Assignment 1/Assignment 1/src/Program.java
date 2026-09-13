
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Date objDate = new Date();
        
		int choice;

        do {
            
            System.out.println("Date Menu");
            System.out.println("1. Set Date");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display");
            System.out.println("6. Compare Dates (not implemented)");
            System.out.println("7. Exit");
         

            System.out.println("Enter your choice:");
            choice = ConsoleInput.getInt();

            switch (choice) {
            
            case 1:
                System.out.println("Enter the day:");
                int day = ConsoleInput.getInt();

                System.out.println("Enter the month:");
                int month = ConsoleInput.getInt();

                System.out.println("Enter the year:");
                int year = ConsoleInput.getInt();

                objDate.setDate(day, month, year);

                System.out.println("Date set successfully.");
                break;
                
            case 2:
                System.out.println("Enter number of days:");
                int days = ConsoleInput.getInt();

                objDate.addDays(days);

                System.out.println("Date after adding days:");
                System.out.println(objDate.getDay() + "/"
                        + objDate.getMonth() + "/"
                        + objDate.getYear());

                break;
            case 3:
                System.out.println("Enter number of months:");
                int months = ConsoleInput.getInt();

                objDate.addMonths(months);

                System.out.println("Date after adding months:");
                System.out.println(objDate.getDay() + "/"
                        + objDate.getMonth() + "/"
                        + objDate.getYear());

                break;

            case 4:
                System.out.println("Enter number of years:");
                int years = ConsoleInput.getInt();

                objDate.addYears(years);

                System.out.println("Date after adding years:");
                System.out.println(objDate.getDay() + "/"
                        + objDate.getMonth() + "/"
                        + objDate.getYear());

                break;

            case 5:
                System.out.println("Current Date:");

                System.out.println(objDate.getDay() + "/"
                        + objDate.getMonth() + "/"
                        + objDate.getYear());

                break;

            
            case 6:
                System.out.println("Program exited.");
                break;

            default:
                System.out.println("Invalid choice.");
              
                
             }
            
            
        } while (choice != 6);
		
		
	}

}