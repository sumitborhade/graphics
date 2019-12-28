package com.example.graphics.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.graphics.model.Point;

public class LineService {

	public List<Point> drawLine(Point p1, Point p2) {
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
}
