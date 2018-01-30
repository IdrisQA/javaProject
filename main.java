import java.util.Scanner;

class main {
	public static void main(String[] args) {
		Idris myFuture = new Idris();
		myFuture.simpleMessage();

		System.out.println("\n\n\n");

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = input.nextLine();

		myFuture.anotherMessage(name);
	}
}