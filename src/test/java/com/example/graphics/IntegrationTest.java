package com.example.graphics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.graphics.model.Point;
import com.example.graphics.service.impl.CanvasService;
import com.example.graphics.service.impl.LineService;
import com.example.graphics.utils.GenericUtils;

public class IntegrationTest {
	
	private CanvasService canvasService;
	
	private LineService lineService;
	
	@Before
	public void setUp() {
		canvasService = new CanvasService();
		lineService = new LineService();
	}
	
	@After
	public void tearDown() {
		canvasService = null;
		lineService = null;
	}

	@Test
	public void testPrintCanvasHappyPath() {
		String[][] canvas = canvasService.drawCanvas(10, 10);

		Point p1 = new Point(1, 2);
		Point p2 = new Point(6, 2);
		List<Point> points = lineService.drawLine(p1, p2);
		assertEquals(6, points.size());
		GenericUtils.addPointsToCanvas(canvas, points);
		
		p1 = new Point(6, 2);
		p2 = new Point(6, 10);
		points = lineService.drawLine(p1, p2);
		assertEquals(9, points.size());
		GenericUtils.addPointsToCanvas(canvas, points);
		
		assertTrue(GenericUtils.printCanvas(canvas));
	}

}
