package com.example.graphics.impl;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.graphics.model.Point;
import com.example.graphics.service.impl.LineService;

public class LineServiceTest {

	private LineService lineService;
	
	@Before
	public void setUp() {
		lineService = new LineService();
	}
	
	@After
	public void tearDown() {
		lineService = null;
	}
	
	@Test
	public void testDrawLine() {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(6, 2);
		List<Point> linePoints = lineService.drawLine(p1, p2);
		assertEquals(9, linePoints.size());
	}
	
}
