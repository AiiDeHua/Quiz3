package base;

import exception.TriangleException;

public class Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() {
	}
	public Triangle(double side1, double side2, double side3) throws TriangleException{
		if( (side1 + side2) > side3 && (side2 + side3 > side1) && (side1 + side3 > side2)){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		}else{
			throw new TriangleException(this);
		}
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea(){
		double p = (side1 + side2 + side3 ) / 2;
		return Math.pow(p * (p-side1) * (p-side2) * (p-side3), 0.5);
	}
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	public String toString(){
		return ("Triangle's side1 = " + side1 + '\n' + "Triangle's side2 = " + side2 + '\n'
		           + "Triangle's side3 = " + side3 + '\n' + "Triangle's area = " + getArea() + '\n' +
		           "Triangle's perimeter = " + getPerimeter());
	}
}
