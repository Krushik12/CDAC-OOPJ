public class Rectangle {

    private double length;
    private double breadth;

    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        double area = length * breadth;
        
        System.out.println("Area of Rectangle: " + area);
    }

    
    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }



    
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }
}