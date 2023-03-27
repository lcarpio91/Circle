package com.skillstorm.Shape;

import java.util.Scanner;

public class CircleLogic {
	
	public CircleLogic() {}
		
		
	public int numChoice(String prompt, int choice) {
		
		int input = 0;
		
		do {
			Scanner in = new Scanner(System.in);
			System.out.println(prompt);
				try {
					input = Integer.parseInt(in.nextLine());
				}catch(Exception e) {
					System.out.println("Choose a Number!");
				}
		   }while (input < 1 || input > choice);
		   		return input;
	}
	
}
