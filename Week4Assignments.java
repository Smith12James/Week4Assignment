// James Smith
import java.util.Scanner;

public class Week4Assignments {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		float height;
		float length;
		float width;
		
		System.out.print("This program will take box measurements and find the surface area and volume of that box.\n");
		System.out.print("What is the height of the box? ");
		height = input.nextFloat();
		System.out.print("What is the length of the box? ");
		length = input.nextFloat();
		System.out.print("What is the width of the box? ");
		width = input.nextFloat();
		
		surfaceArea(length, width, height);
		volume(length, width, height);
		
	}
	
	private static void surfaceArea(float len, float wid, float hei) {
		
		float surfArea = 2 * (len * wid) + 2 * (len * hei) + 2 * (hei * wid);
		
		System.out.printf("The surface area is %,.2f.%n", surfArea);
		
	}
	
	
	private static void volume(float len, float wid, float hei) {
		
		float vol = (len * wid * hei);
		
		System.out.printf("The volume is %,.2f.", vol);
		
	}

}