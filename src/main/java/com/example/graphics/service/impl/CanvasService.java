package com.example.graphics.service.impl;

public class CanvasService {

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