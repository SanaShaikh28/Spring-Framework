package com.bridgeit.ShapeBean;

import com.bridgeit.ShapeInterface.Shape;

public class Geometry {

	private Shape shape;

	// Inject Rectangle object via setter method
	public void setGeometry(Shape shape) {
		this.shape = shape;
	}

	public void drawShape() {
		shape.draw();
	}
}
