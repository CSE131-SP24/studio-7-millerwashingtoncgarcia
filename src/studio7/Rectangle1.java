package studio7;

public class Rectangle1 {

	private double length;
	private double width;
	
	public Rectangle1( double length1, double width1) {
		length = length1;
		width = width1;
	}
	public double Area() {
		double area = this.length * this.width;
		return area;
		
	}
	public String getArea() {
		return getArea();

	}
	public double P1() {
		double p1= 2*this.length + 2*this.width;
		return p1;
	}
	public boolean Square() {
		if (this.length == this.width) {
			return true;			
		}
		return false;
	}
	
	public static void main(String[] args) {
		Rectangle1 r= new Rectangle1(2,3);
		Rectangle1 r2= new Rectangle1(9,2);
		System.out.println("Area: " + r.Area());
		System.out.println("Perimeter: "+r.P1());
		System.out.println("Is a square: "+ r.Square());
		System.out.println("Area: " + r2.Area());
	}

	
}
