package com.skillstorm.Shape;

import java.util.Arrays;
import java.util.Scanner;

public class Circle {
	
	// a = PI * r * r
	public static double area(double a) {
		return Math.PI * a * a;
	}
	
	// c = 2 * PI * r
	public static double circumfrence(double c) {
		return 2 * Math.PI * c;
	}
	
	// d = 2 * r
	public static int diameter(int d) {
		return 2 * d;
	}
	
	//
	//
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int radius;
			int choice;
			int i = 0;
			CircleLogic user = new CircleLogic();
			//array size: 5
			//gave the array values to allow for comparison if User does not fill the array
			int[] store = {1, 1, 1, 10, 35};
			
			// Collect Radius and store
			System.out.println("Circles!\n");
			System.out.println("I will give you either the Radius, the Circumference,\nthe"
					+ " Area of a Circle or All three!");
			
			// Returning the Diameter, Circumference, Area
			do {
				System.out.println("\nPlease provide a number.\nWhat is the radius?");  
				radius = in.nextInt();
				store[i] = radius;
				
				// User choice 
				System.out.println("\nWhat would like to know about your circle?");
				System.out.println("1 - Diameter\n2 - Circumference\n3 - Area\n4 - All Three");
				
				choice = user.numChoice("Enter 1 - 4 :\n", 4);
					
				if(choice == 1) {
					System.out.println("The Diameter is: " + Math.round((diameter(radius))));
					} else if(choice == 2) {
						System.out.println("The Circumfrence is: " + Math.round((circumfrence(radius))));
					} else if (choice == 3) {
						System.out.println("The Area is: " + Math.round((area(radius))));
					} else if (choice == 4) {
						System.out.println("The Diameter is " + Math.round((diameter(radius))) 
						+ "\nA Circumference of " + Math.round((circumfrence(radius)))
						+ "\nA Area of " + Math.round((area(radius))));
					} else {}
				
				System.out.println("\nDo you want to provide another radius?");
				
				choice = user.numChoice("1 - Yes\n2 - No", 2);
					
				i++;
					if (choice == 2){
						System.out.println("Time to compare circles!");
						break;
					} else if (i == 5){
						System.out.println("No more circles, Time to compare!");
						break;
					} else {
						System.out.println("~~Lets run it again~~");
					}
					
			} while(i < 5);
			
			// Returning the comparison
			do {
				System.out.println("\nThere are five Circles, lets see if any are equal!");
					choice = user.numChoice("Enter 1 - 5 :", 5);
					int circle1 = choice - 1;
				
				System.out.println("Now pick a second Circle");
					choice = user.numChoice("Enter 1 - 5 :", 5);
					int circle2 = choice - 1;
				System.out.println("\nCircle size is:");
				System.out.println("\nThe first circle diameter of " + Math.round((diameter(store[circle1]))) 
									+ "\nA Circumference of " + Math.round((circumfrence(store[circle1])))
									+ "\nA Area of " + Math.round((area(store[circle1]))));
				
				System.out.println("\nThe Second circle diameter of " + Math.round((diameter(store[circle2]))) 
									+ "\nA Circumference of " + Math.round((circumfrence(store[circle2])))
									+ "\nA Area of " + Math.round((area(store[circle2]))));
				
				System.out.println("\nLet's see which is larger!");
				
				if (store[circle1] > store[circle2]) {
					System.out.println("Circle One is Larger!");
				}else if (store[circle1] < store[circle2]) {
					System.out.println("Circle Two is Larger!");
				}else if (store[circle1] == store[circle2]){
					System.out.println("Circle one and circle two are Equal!");
				} else {}
				
				System.out.println("\nDo you want to compare two more circles?");
				choice = user.numChoice("1 - Yes\n2 - No", 2);
				
					if(choice == 1) {
						System.out.println("Lets run it again");
						i++;
					} else {
						System.out.println("~FIN~");
						break;
					}
				
			}while(true);
			
	}
}
