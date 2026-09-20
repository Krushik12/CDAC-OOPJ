import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		
		System.out.println(colors);
		
		
		// insert at first position
		
		
		colors.add(0, "Black");
		System.out.println("Insert in FirstPosition: "+ colors);
		
		
		//retrieve  an element at specified index
		
		
		String color = colors.get(2);
		System.out.println("Element at index 2 is "+ color);
		
		//Update
		colors.set(1, "Orange");
		System.out.println("Update element : "+colors);
		
		//remove
		colors.remove(4);
        System.out.println("Remove at index 4: "+colors);
		
		//Search
        if (colors.contains("Blue")) {
            System.out.println("Blue is present in the list.");
        } else {
            System.out.println("Blue is not present in the list.");
        }
        
        if (colors.contains("Yellow")) {
            System.out.println("Yellow is present in the list.");
        } else {
            System.out.println("Yellow is not present in the list.");
        }
        //Changes on according to 20-09-2026
		
		//sort
		Collections.sort(colors);
		System.out.println(colors);
		
		//copy array
		
		ArrayList<String> col = new ArrayList<>();
		col.addAll(Collections.nCopies(colors.size(), ""));
		Collections.copy(col, colors);
		System.out.println(col);
		//shuffle
		Collections.shuffle(colors);
		System.out.println(colors);
		//reverse
		Collections.reverse(colors);
		System.out.println(colors);
		
		
	}

}
