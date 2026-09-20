
public class EquilateralTriangle implements RegularPolygon {
	
	private double sidelength;
	
	public EquilateralTriangle(double sidelength) {
		super();
		this.sidelength = sidelength;
	}

	@Override
	public int getNumSides() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public double getSideLength() {
		// TODO Auto-generated method stub
		return sidelength;
	}
	

}
