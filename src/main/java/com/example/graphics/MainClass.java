package com.example.graphics;

import java.util.Scanner;

import com.example.graphics.exception.CustomException;
import com.example.graphics.validation.impl.ValidationOrchestrator;

public class MainClass {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			while (true) {
				
				try {
					System.out.print("Enter command : ");
					String inputString = scan.nextLine();

					if(inputString.equalsIgnoreCase("q")) {
						break;
					}
					
					//1. Validation
					ValidationOrchestrator validationOrchestrator = new ValidationOrchestrator();
					validationOrchestrator.triggerValidation(inputString);
					
					//2. Parsing
					
				} catch (CustomException e) {
					System.out.println(e.getExceptionCode().getMessage());
				}
				
			}
		}
	}
}
