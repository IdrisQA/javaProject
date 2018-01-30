import java.util.Scanner;

public class Election {
	String title,name,gender,state;
	int age;

	public void setTitle(){	
		System.out.print("Enter your Title (Mr/Mrs): ");
		title = new Scanner(System.in).nextLine();
	}

	public void setName(){
		System.out.print("Enter your name: ");
	  	name = new Scanner(System.in).nextLine();
	}

	public void setGender(){
		System.out.print("Enter your Gender (male/female): ");
		gender = new Scanner(System.in).nextLine();

	}

	public void setAge(){
		System.out.print("Enter your Age: ");
		age = new Scanner(System.in).nextInt();
	}

	public void setState(){
		System.out.print("Enter your state: ");
		state = new Scanner(System.in).nextLine();
	}

	public void printDetails(){
		System.out.print("\n" + "\n");
		System.out.println("Below are your election details");
		System.out.println("**********************************");
		System.out.print("\n");
		System.out.println("Title: "+ title);
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Gender: "+ gender);
		System.out.println("State: "+ state);

		if(age>=18)
			System.out.println("congrats.. you're eligible to vote");
		else 
			System.out.println("sorry, you're not eligible to vote");
	}

	public static void main(String[] args) {
		Election election = new Election();
		election.setTitle();
		election.setName();
		election.setAge();
		election.setGender();
		election.setState();
		election.printDetails();
		return;
	}
} 