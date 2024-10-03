package JavaProgramming;

public class Sphere extends Shape {
	
	private double radius;

	// Parameterized constructor
	public Sphere (double radius) {
		this.radius = radius;
	}

	// Surface Area calculation
	@Override
	public double surface_area() {
		double surfaceArea = 4 * Math.PI * Math.pow(radius,2);
		return surfaceArea;
	}
	
	// Volume calculation
	@Override
	public double volume() {
		double vol = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		return vol;
	}
	
	// Print Surface Area and Volume
	@Override
	public String toString() {
		return "\nSphere details:\n" +
				"Radius:" + radius + "\n" +
				"Surface Area:" + surface_area() + "\n" +
				"Volume:" + volume() + "\n";
	}
}