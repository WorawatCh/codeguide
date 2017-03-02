import java.util.Scanner;

/**
 * Try to move this nested code to be easy to read.
 * 
 * @author Worawat Chueajedton
 *
 */
public class Greatnumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type number (1-10) : ");
		int number = input.nextInt();
		if (number > 0) {
			System.out.println("A little");
			if (number > 5) {
				System.out.println("So close");
				if (number > 8) {
					System.out.println("Done");
				}
			}
		}
	}
}
