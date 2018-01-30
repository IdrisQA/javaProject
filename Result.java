import java.util.Scanner;

class Result {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Girl girlObject = new Girl();

		System.out.println("Enter the name of your first girlfriend ? ");
		String gf = input.nextLine();
		girlObject.setName(gf);
		girlObject.saying();
	}
}