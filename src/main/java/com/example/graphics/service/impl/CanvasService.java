package com.example.graphics.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.graphics.utils.GenericUtils;

public class CanvasService {

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

//		Point p1 = new Point(1, 2);
//		Point p2 = new Point(6, 2);
//		List<Point> points = drawLine(p1, p2);
//		assertEquals(6, points.size());
//		addPointsToCanvas(canvas, points);
//		
//		p1 = new Point(6, 2);
//		p2 = new Point(6, 10);
//		points = drawLine(p1, p2);
//		assertEquals(9, points.size());
////		addPointsToCanvas(canvas, points);
		
		assertTrue(GenericUtils.printCanvas(canvas));
	}

	public String[][] drawCanvas(int rows, int cols) {
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

}