import java.util.Scanner;
public class ifex1 {
//  accept two numbers, find which big
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter any two values ");
		int x = scn.nextInt();
		int y = scn.nextInt();
		
		if(x>y)
			System.out.println("First Number is Big");
		else
			System.out.println("Second Number is Big");
	}

}
