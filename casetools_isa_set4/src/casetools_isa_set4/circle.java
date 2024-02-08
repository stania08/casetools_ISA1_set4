package casetools_isa_set4;

public class circle {
	private double radius;
	public circle(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}

}
