package com.example.graphics.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.graphics.service.impl.CanvasService;
import com.example.graphics.utils.GenericUtils;

public class CanvasServiceTest {
	
	private CanvasService canvasService;
	
	@Before
	public void setUp() {
		canvasService = new CanvasService();
	}
	
	@After
	public void tearDown() {
		canvasService = null;
	}

	@Test
	public void testDrawCanvasHappyPath() {
		String[][] canvas = canvasService.drawCanvas(10, 10);
		assertEquals("-", canvas[0][1]);
		assertEquals("-", canvas[11][1]);
		assertEquals("|", canvas[1][0]);
		assertEquals(" ", canvas[1][1]);
	}
	
	@Test
	public void testPrintCanvasHappyPath() {
		String[][] canvas = canvasService.drawCanvas(10, 10);

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

}
