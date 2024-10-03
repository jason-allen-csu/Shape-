package JavaProgramming;

public class Cylinder extends Shape {
	
	private double radius;
	private double height;

	// Parameterized constructor
	public Cylinder (double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	// Surface Area calculation
	@Override
	public double surface_area() {
		double surfaceArea = 2 * Math.PI * radius * (radius + height);
		return surfaceArea;
	}
	
	// Volume calculation
	@Override
	public double volume() {
		double vol = Math.PI * Math.pow(radius, 2) * height;
		return vol;
	}
	
	// Print Surface Area and Volume
	@Override
	public String toString() {
		return "\nCylinder details:\n" +
				"Radius:" + radius + "\n" +
				"Height:" + height + "\n" +
				"Surface Area:" + surface_area() + "\n" +
				"Volume:" + volume() + "\n";
	}
}