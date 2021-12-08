package com.javaex.ex05;

public class RecTriangle extends Shape {

	private double width;
	private double height;

	public RecTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public int getCountSides() {
		return 3;
	}
	
	public double getArea() {
		return width * height * 1 / 2;
	}

	public double getPerimeter() {
		return width + height + Math.sqrt(width * width + height * height);
	}

}
