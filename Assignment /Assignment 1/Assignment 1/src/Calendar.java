
public class Calendar {
	
	public static final int[] DAYS_OF_MONTH = {0, 31, 28, 31, 30, 31,30, 31, 31, 30, 31, 30, 31};

	    public static boolean isLeapYear(int year) {
	        return (year % 400 == 0) ||
	               (year % 4 == 0 && year % 100 != 0);
	    }

	    
	    public static int getDaysInMonth(int month, int year) {

	        if (month == 2 && isLeapYear(year)) {
	            return 29;
	        }

	        return DAYS_OF_MONTH[month];
	    }
}
