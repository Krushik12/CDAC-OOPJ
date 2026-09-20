
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EquilateralTriangle triangle = new EquilateralTriangle(5);

		Square square = new Square(10);

		System.out.println("Triangle");
		System.out.println("Number of sides:" + triangle.getNumSides());
		System.out.println("Side length: " + triangle.getSideLength());
		System.out.println("Perimeter :" + triangle.getPerimeter());
		System.out.println("Interior Angle:  " + triangle.getInteriorAngle()+" radians");

		System.out.println();

		System.out.println("Square");
		System.out.println("Number of sides: " + square.getNumSides());
		System.out.println("Side length: " + square.getSideLength());
		System.out.println("Perimeter :" + square.getPerimeter());
		System.out.println("Interior Angle:  " + square.getInteriorAngle()+" radians");
		System.out.println();
		
		RegularPolygon[] polygons = {
				triangle,
	            square,
	            new EquilateralTriangle(7)
			};

			int total = RegularPolygon.totalSides(polygons);

			System.out.println("Total number of sides: " + total);
		
	}

}
