
public class Date {

	private int day;
	
	private int month;
	
	private int year;
	
	
	
	public void setDate(int dd,int mm, int yy) {
		
		
		if (yy < 1) 
            year = 1;
        else 
            year = yy;
        
		
		
		if (mm < 1 || mm > 12) 
            month = 1;
         else 
            month = mm;
        
		
		
		
		int maxDays = Calendar.getDaysInMonth(month, year);
		
		
		 if (dd < 1 || dd > maxDays) 
	         day = 1;
	     else 
	         day = dd;
	        
		
		
		
	}
	 
//add days
	 
	 public void addDays(int days) {

	        if (days >= 0) {

	            for (int i = 0; i < days; i++) {
	                day++;

	                if (day > Calendar.getDaysInMonth(month, year)) {
	                    day = 1;
	                    month++;

	                    if (month > 12) {
	                        month = 1;
	                        year++;
	                    }
	                }
	            }

	        } else {

	           System.out.println("Enter Positive number for day");	        }
	    }

//add month
	 
	 public void addMonths(int months) {

	      if (months >= 0) {

	          for (int i = 0; i < months; i++) {
	              month++;

	              if (month > 12) {
	                  month = 1;
	                  year++;
	                }
	            }

	      } else {
	    	  System.out.println("Enter Positive number for month");	
	         
	      }

	      int maxDays = Calendar.getDaysInMonth(month, year);

	        if (day > maxDays) {
	            day = maxDays;
	        }
	 
	 }
	 
	    // Add Years
	 public void addYears(int years) {

	   year = year + years;

	       
	    if (month == 2 && day == 29 && !Calendar.isLeapYear(year)) {
	       day = 28;
	    }
	    else {
            System.out.println("Enter positive number for years");
        }
	 }
	 
	 
	public int getDay() {
		return day;
	}

	

	public int getMonth() {
		return month;
	}

	
	public int getYear() {
		return year;
	}

	public void display() {
        System.out.println(day + "/" + month + "/" + year);
    }
	
	
}
