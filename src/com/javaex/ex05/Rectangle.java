package com.javaex.ex05;

public class Rectangle extends Shape implements Resizable {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public int getCountSides() {
		return 4;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return (width + height) * 2;
	}

	public void resize(double s) {
		this.width = width * s;
		this.height = height * s;
	}

}
