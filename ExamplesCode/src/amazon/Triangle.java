package amazon;

public class Triangle {

	public boolean triangleValidator(int side1, int side2, int side3) {
		
		boolean nottriangle = true;
		if (side1 == 0 || side2 == 0 || side3 == 0) {
			nottriangle = false;
		}
		if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)) {
			nottriangle = true;
		} else {
			nottriangle = false;
		}
		return nottriangle;
	}

	private String triangleType(int side1, int side2, int side3) {
		if (!triangleValidator(side1, side2, side3))
			return "Not A Triangle";
		if (side1 == side2 && side2 == side3)
			return "Equilateral Triangle";
		if ((side1 == side2) || (side2 == side3) || (side3 == side1))
			return "Isoceles Triangle";
		return "Scalar Triangle";
	}

}
