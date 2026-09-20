
public class Square implements RegularPolygon {
	
	private double sidelength;
	
	public Square(double sidelength) {
		
		this.sidelength = sidelength;
	}
	

	@Override
	public int getNumSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double getSideLength() {
		// TODO Auto-generated method stub
		return sidelength;
	}

}
