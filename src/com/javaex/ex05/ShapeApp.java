package com.javaex.ex05;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

	public static void main(String[] args) {

		Rectangle r01 = new Rectangle(5, 6);
		RecTriangle t01 = new RecTriangle(6, 2);

		List<Shape> sArray = new ArrayList<Shape>();
		sArray.add(r01);
		sArray.add(t01);

		for (Shape print : sArray) {
			if (print.getCountSides() == 4) {
				System.out.println("area: " + print.getArea());
				System.out.println("perimeter: " + print.getPerimeter());
				((Rectangle) print).resize(0.5);
				System.out.println("new area: " + print.getArea());
				System.out.println("new perimeter: " + print.getPerimeter());
			} else {
				System.out.println("area: " + print.getArea());
				System.out.println("perimeter: " + print.getPerimeter());
			}
		}
	}

}
