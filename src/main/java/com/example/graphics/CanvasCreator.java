package com.example.graphics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.graphics.model.Point;

public class CanvasCreator {

	@Test
	public void testDrawLine() {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(6, 2);
		List<Point> linePoints = drawLine(p1, p2);
		assertEquals(9, linePoints.size());
	}
	
	private List<Point> drawLine(Point p1, Point p2) {
		List<Point> linePoints = new ArrayList<>();
		/**
		   L 1 2 6 2
		 * 1 2 
		 * 2 2 
		 * 3 2
		 * 4 2 
		 * 5 2 
		 * 6 2
		 */
		
		for(int x = p1.getX(); x <= p2.getX(); x++) {
			for(int y = p1.getY(); y <= p2.getY(); y++) {
				linePoints.add(new Point(x, y));
			}
		}
		
		return linePoints;
	}
	
	public String[][] addPointsToCanvas(String[][] canvas, List<Point> points) {
		for (Point point : points) {
			System.out.println(point.getX() + ", " + point.getY() );
			canvas[point.getX()][point.getY()] = "x";
		}
		return canvas;
	}
}








