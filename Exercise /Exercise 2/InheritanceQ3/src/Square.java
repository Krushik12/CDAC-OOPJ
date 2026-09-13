public class Square extends Rectangle {

    private double side;

  
    public Square(double side) {
    	
    	
        super(side, side);
        this.side = side;
    }

  
    @Override
    public void printArea() {
        double area = side * side;
        
        System.out.println("Area of Square: " + area);
    }

    
    @Override
    public void printPerimeter() {
    	
        double perimeter = 4 * side;
        System.out.println("Perimeter of Square: " + perimeter);
        
        
        
    }
}