/**
 * Rohit Haridas
 * Input project
 */
import java.util.Scanner;
public class Rect 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
				
		System.out.print("Enter the length of the rectangle: ");
		double length = in.nextDouble();
		
		System.out.print("\nEnter the width of the rectangle: ");
		double width = in.nextDouble();
		
		System.out.print("\nThe area of the rectangle is: ");
		System.out.printf("%10.2f", length*width);
		
		System.out.print("\nThe perimeter of the rectangle is: ");
		System.out.printf("%.2f", length*2 + width*2);
		
		System.out.print("\nThe diagonal of the rectangle is: ");
		System.out.printf("%6.2f", Math.sqrt(width*width + length*length));
	}

}
	
	
