import java.util.Scanner;

class Apples {
	public static void main(String[] args) {
		Scanner idris = new Scanner(System.in);
		double fnum, snum,answer;

		System.out.println("Enter First Number: ");
		fnum = idris.nextDouble();

		System.out.println("Enter Second Number: ");
		snum = idris.nextDouble();

		answer = fnum + snum;

		System.out.println(answer);
	}
}