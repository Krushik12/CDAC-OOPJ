
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	String str = "Java Exercises!";

	        System.out.println("Original String = " + str);

	        System.out.println("The character at position 0 is " + str.charAt(0));

	        System.out.println("The character at position 10 is " + str.charAt(10));
	        
	        
	        System.out.println("====================================== ");
	        String str1 = "This is Exercise 1";
	        String str2 = "This is Exercise 2";

	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        int result = str1.compareTo(str2);

	        if (result == 0) {
	            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
	        } 
	        else if (result < 0) {
	            System.out.println("\"" + str1 + "\" is less than \"" + str2 + "\"");
	        } 
	        else {
	            System.out.println("\"" + str1 + "\" is greater than \"" + str2 + "\"");
	        }
	        
	        System.out.println("====================================== ");
	        
	        String str3 = "Python Exercises";
	        String str4 = "se";

	        System.out.println("\"" + str3 + "\" ends with \"" + str4 + "\"? "
	                + str3.endsWith(str4));

	        String str5 = "Python Exercise";

	        System.out.println("\"" + str5 + "\" ends with \"" + str4 + "\"? "
	                + str5.endsWith(str4));
	        
	        System.out.println("====================================== ");
	        
	        String str6 = "The quick brown fox jumps over the lazy dog.";

	        str6 = str6.toLowerCase();

	        for (char ch = 'a'; ch <= 'z'; ch++) {

	            int index = str6.indexOf(ch);

	            System.out.print(ch + " ");
	            System.out.print(" ");
	            System.out.print(index + " ");
	        }
	        
	        System.out.println("====================================== ");
	    System.out.println("====================================== ");
	    
	    String str7 = "The quick brown fox jumps over the lazy dog.";

        System.out.println("Original string: " + str7);

        String newString = str7.replaceAll("fox", "cat");

        System.out.println("New String: " + newString);
        
        System.out.println("====================================== ");
        
        String str8 = "The Quick BroWn FoX!";

        System.out.println("Original String: " + str8);

        String upperString = str8.toUpperCase();

        System.out.println("String in uppercase: " + upperString);
        
        System.out.println("====================================== ");
        
        String str9 = "The quick brown fox jumps";

        System.out.println("The given string is: " + str9);

        StringBuilder sb = new StringBuilder(str9);

        String reversedString = sb.reverse().toString();

        System.out.println("The string in reverse order is:");
        System.out.println(reversedString);
        
	}

}
