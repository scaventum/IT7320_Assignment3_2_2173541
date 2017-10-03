
public class Geometric {

	//measuring diameter of a circle with radius
	public double circleDiameter(int r) {
		double result = 0.0;
		result = 2 * r;
		return result;
	}
	
	//measuring perimeter of a circle with radius 
	public double circlePerimeter(int r) {
		double result = 0.0;
		result = (22  * 2 * r) / 7;
		return result;
	}

	//measuring area of a circle with radius 
	public double circleArea(int r) {
		double result = 0.0;
		result = (22 * r * r)/ 7;
		return result;
	}
	
}
