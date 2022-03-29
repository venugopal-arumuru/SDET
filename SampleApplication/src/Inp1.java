import java.util.Scanner;
public class Inp1 {
// accept a number then calculate square and cube of that number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value ");
		int x = sc.nextInt();
		int sq = x*x;
		System.out.println("Square Value : " + sq);
		int cb = x*x*x;
		System.out.println("Cube Value : " + cb);
	}

}
