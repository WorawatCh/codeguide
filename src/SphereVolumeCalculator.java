import java.util.Scanner;

/**
 * Try to change a variable name that suitable to the code
 * 
 * @author Worawat chueajedton
 *
 */
public class SphereVolumeCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type radius :");
		double n = input.nextInt();
		double x = 4 / 3;
		double a = x * n * Math.PI;
		System.out.println(a);
	}
}
