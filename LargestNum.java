
import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");

		int num1 = sc.nextInt();
		System.out.println("Enter the second Number");
		int num2 = sc.nextInt();

		if(num1 > num2)
		   System.out.println("Num1 is Larger");
		   else
		   System.out.println("Num2 is larger");

		

	}
}