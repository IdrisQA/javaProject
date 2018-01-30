import java.util.Scanner;

public class Election2{
	String name, sex, another;
	int age;

	private void input(){
		Scanner a = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		name = a.nextLine();
		System.out.print("Enter your Gender (m/f): ");
		sex = a.nextLine();
		System.out.print("Enter your Age (no.): ");
		age = a.nextInt();
	}

	private String getTitle(String sex){
		switch(sex){
			case "m":
			case "M":
				return "Mr";

			case "f":
			case "F":
				return "Mrs";

			default:
				return " ";
		}
	}

	private String getEligibility(int age){
		if (age < 18)
			return "You are not Eligible to vote";
		else 
			return "You are Eligible to vote";
	}

	private String output(){
		System.out.println("\nWelcome " + getTitle(sex) + " " + name);
		return String.format("Hello! %s %s %s", getTitle(sex), name, getEligibility(age));
	}

	public static void main(String[] args) {
		Election2 election = new Election2();

		election.input();
		System.out.println(election.output());

	}
}