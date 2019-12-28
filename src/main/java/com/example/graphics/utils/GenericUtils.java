package com.example.graphics.utils;

import java.util.Arrays;
import java.util.List;

import com.example.graphics.model.Point;

public class GenericUtils {

	public static boolean printCanvas(String[][] canvas) {
		for (int row = 0; row < canvas.length; row++) {
			for (int col = 0; col < canvas[row].length; col++) {
				System.out.print(canvas[row][col] + " ");
			}
			System.out.println();
		}
		return true;
	}
	
	public static String[][] addPointsToCanvas(String[][] inputCanvas, List<Point> points) {
		String[][] canvas = Arrays.copyOf(inputCanvas, inputCanvas.length);
		
		for (Point point : points) {
			System.out.println(point.getX() + ", " + point.getY() );
			inputCanvas[point.getX()][point.getY()] = "x";
		}
		
		return canvas;
	}
}
