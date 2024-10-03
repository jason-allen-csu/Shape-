package JavaProgramming;

public class Cone extends Shape {
	
	private double radius;
	private double height;
	
	// Parameterized constructor
	public Cone (double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	// Surface Area calculation
	@Override
	public double surface_area() {
		double slant = Math.sqrt((Math.pow(radius, 2) + Math.pow(height, 2)));
		double surfaceArea = Math.PI * radius * (radius + slant);
		return surfaceArea;
	}
	
	// Volume calculation
	@Override
	public double volume() {
		double vol = (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
		return vol;
	}
	
	// Print Surface Area and Volume
	@Override
	public String toString() {
		return "\nCone details:\n" +
				"Radius:" + radius + "\n" +
				"Height:" + height + "\n" +
				"Surface Area:" + surface_area() + "\n" +
				"Volume:" + volume() + "\n";
	}
}