package JavaProgramming;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeArray {
	public static void main (String[] args) {
		Scanner scnr = new Scanner(System.in);
		Shape sphere = null, cylinder = null, cone = null;
		
		// Sphere inputs
		while(sphere == null) {
			try {
				System.out.print("\nEnter Sphere radius:");
				double sphereRadius = scnr.nextDouble();
				if(sphereRadius < 0) 
					throw new IllegalArgumentException("Radius cannot be negative");
				
				sphere = new Sphere(sphereRadius);
			
			} catch(InputMismatchException e) {
				System.out.println("Invalid input. Enter valid inputs.");
				scnr.next();
			} catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		// Cylinder inputs
		while (cylinder == null) {
            try {
                System.out.print("\nEnter the radius of the cylinder: ");
                double cylinderRadius = scnr.nextDouble();
                System.out.print("\nEnter the height of the cylinder: ");
                double cylinderHeight = scnr.nextDouble();
                if (cylinderRadius < 0 || cylinderHeight < 0) 
                	throw new IllegalArgumentException("Radius or height cannot be negative.");
                
                cylinder = new Cylinder(cylinderRadius, cylinderHeight);
            
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values.");
                scnr.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
		
		// Cone inputs
		while (cone == null) {
            try {
                System.out.print("\nEnter the radius of the cone: ");
                double coneRadius = scnr.nextDouble();
                System.out.print("\nEnter the height of the cone: ");
                double coneHeight = scnr.nextDouble();
                if (coneRadius < 0 || coneHeight < 0) 
                	throw new IllegalArgumentException("Radius or height cannot be negative.");
                
                cone = new Cone(coneRadius, coneHeight);
            
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values.");
                scnr.next(); 
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
	
		// Store the instances in an array
        Shape[] shapeArray = {sphere, cylinder, cone};

        // Loop through the array and print the object data
        for (Shape shape : shapeArray) {
            System.out.println(shape);
            System.out.println();
        }

        // Close the scanner
        scnr.close();
	
	}
}