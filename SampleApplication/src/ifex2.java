import java.util.Scanner;
public class ifex2 {
//  accept three numbers, find which big
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter any 3 values ");
		int x = scn.nextInt(); // 10
		int y = scn.nextInt(); // 40
		int z = scn.nextInt(); // 50
		
		if(x>y && x>z)
			System.out.println("First Number is Big");
		else if(y>x && y>z)
			System.out.println("Second Number is Big");
		else if(z>x && z>y)
			System.out.println("Third Number is Big");
		else
			System.out.println("Any two values might be same");
	}

}
