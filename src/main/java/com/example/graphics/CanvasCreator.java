package com.example.graphics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.graphics.model.Point;

public class CanvasCreator {

	@Test
	public void testDrawCanvasHappyPath() {
		String[][] canvas = drawCanvas(10, 10);
		assertEquals("-", canvas[0][1]);
		assertEquals("-", canvas[11][1]);
		assertEquals("|", canvas[1][0]);
		assertEquals(" ", canvas[1][1]);
	}
	
	@Test
	public void testPrintCanvasHappyPath() {
		String[][] canvas = drawCanvas(10, 10);

		Point p1 = new Point(1, 2);
		Point p2 = new Point(6, 2);
		List<Point> points = drawLine(p1, p2);
		assertEquals(6, points.size());
		addPointsToCanvas(canvas, points);
		
		p1 = new Point(6, 2);
		p2 = new Point(6, 10);
		points = drawLine(p1, p2);
		assertEquals(9, points.size());
//		addPointsToCanvas(canvas, points);
		
		assertTrue(printCanvas(canvas));
	}

	private String[][] drawCanvas(int rows, int cols) {
		String[][] canvas = new String[rows + 2][cols + 2];
		for (int row = 0; row < canvas.length; row++) {
			for (int col = 0; col < canvas[row].length; col++) {
				if (row == 0 || row == canvas.length - 1) {
					canvas[row][col] = "-";
				} else if (col == 0 || col == canvas[row].length - 1) {
					canvas[row][col] = "|";
				} else {
					canvas[row][col] = " ";
				}
			}
		}

		return canvas;
	}

	private boolean printCanvas(String[][] canvas) {
		for (int row = 0; row < canvas.length; row++) {
			for (int col = 0; col < canvas[row].length; col++) {
				System.out.print(canvas[row][col] + " ");
			}
			System.out.println();
		}
		return true;
	}
	
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








