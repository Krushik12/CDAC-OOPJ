import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
//import java.util.stream.IntStream;

public class FuncInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<>();

		names.add("Krushik");
		names.add("Amit");
		names.add("Rahul");
		names.add("Piyush");

		System.out.println("Before sorting");
		System.out.println(names);
		//sort
		names.sort((s1, s2) -> s1.compareTo(s2));
		System.out.println("After sorting");
		System.out.println(names);

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		// largest number
		Function<ArrayList<Integer>, Integer> largest =
                list ->  {

                    int max = list.get(0);

                    for (int number : list) {

                        if (number > max) {
                            max = number;
                        }
                    }

                    return max;
                };
		
        //Collections.max(list);
		int result = largest.apply(numbers);

		System.out.println("Numbers: " + numbers);
		System.out.println("Largest number: " + result);
		
		
		// smallest number
		Function<ArrayList<Integer>, Integer> smallest =
                list -> {
                	
                	int min = list.get(0);

                    for (int number : list) {

                        if (number < min) {
                            min = number;
                        }
                }
                    return min;
                };
                
                
		//Collections.min(list);
		int result1 = smallest.apply(numbers);

		System.out.println("Numbers: " + numbers);
		System.out.println("Largest number: " + result1);
		
		
		//Random number
		Random random = new Random();
		Supplier<Integer> randomNumber= ()-> random.nextInt(1000);
		int num =randomNumber.get();
		System.out.println("Random 3 digit number : " + num);
		
		
		//current date
		Supplier<LocalDate> currentDate = ()-> LocalDate.now();
		
		LocalDate date = currentDate.get();
		
		System.out.println("Current date: "+ date);
		
		
		//concate
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String first = sc.nextLine();

        System.out.println("Enter second string: ");
        String second = sc.nextLine();

        BiFunction<String, String, String> concatenate =
                (s1, s2) -> s1 + s2;

        String result2 = concatenate.apply(first, second);

        System.out.println("Concatenated string: " + result2);
        

        //prime
        System.out.print("Enter number for prime or not: ");
        int number = sc.nextInt();

        Predicate<Integer> predicate = num1 ->
		{
			for(int temp=2; temp<num; temp++) {
				if(num1%temp == 0)
					return false;
			}
			return true;
		};
		
		System.out.println(predicate.test(number));
//        Predicate<Integer> isPrime = n ->
//                n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n))
//                                  .noneMatch(i -> n % i == 0);
//
//        System.out.println(isPrime.test(number) ? 
//                "Prime number" : "Not a Prime number");

        //Reverse
        Function<ArrayList<Integer>, ArrayList<Integer>> reverse = list -> {
        	
        	ArrayList<Integer> reversed = new ArrayList<>();

            for (int i = list.size() - 1; i >= 0; i--) {
                reversed.add(list.get(i));
            }

            return reversed;
           // Collections.reverse(list);
           // return list;
        };

        System.out.println("Original: " + numbers);
        System.out.println("Reverse: " + reverse.apply(numbers));

		
        sc.close();
        
	}

}
