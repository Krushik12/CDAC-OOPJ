import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("Red");
		treeSet.add("Blue");
		treeSet.add("Yellow");
		treeSet.add("White");
		//addall
		System.out.println(treeSet);
		TreeSet<String> newtree = new TreeSet<>();
		newtree.add("Orange");
		newtree.add("Black");
		newtree.addAll(treeSet);
		System.out.println(newtree);
		
		//reverse
		
		System.out.println(treeSet.descendingSet());
		
		//First and last
		
		String first = treeSet.first();
		String last = treeSet.last();
		System.out.println(first + " "+last);
		
		System.out.println("");
		//Ceiling
		TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int Element = 25;
        Integer result = numbers.ceiling(Element);
        System.out.println("Element greater than or equal to "
                + Element + ": " + result);
        
        
        
		
	}

}
