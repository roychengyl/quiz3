package quiz3;

public class Triangle {
	
	//Three double data fields named side1, side2, and side3 with default values 1.0 to
	//denote three sides of the triangle.
	
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	//A no-arg constructor that creates a default triangle.
	
	Triangle (){
		
	}
	
	//A constructor that creates a triangle with the specified side1, side2, and side3.
	
	public Triangle(double side1, double side2, double side3){
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	
	//The accessor methods for all three data fields.
	
	public double getside1() {
		
		return side1;
	}
	
	public double getside2() {
		
		return side2;
	}
	
	public double getside3() {
		
		return side3;
	}
	
	//A method named getArea() that returns the area of this triangle.
	
	public double getArea(){
		
		double perimeter = (side1 + side2 + side3)/2;
		
		return Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
		
	}
	//A method named getPerimeter() that returns the perimeter of this triangle.
	
	public double getPerimeter(){
		
		return side1 + side2 + side3;
	}
	//A method named toString() that returns a string description for the triangle.
	
	public String toString(){
		
		return("side1 = " + side1 + "side2 = " + side2 + "side3 = " + side3 + "area = " + getArea() + "getPerimeter = " + getPerimeter());
		
	}
	//Junit test cases (test Area, Perimeter calculations)
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
