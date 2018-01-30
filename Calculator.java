import java.util.Scanner;

public class Calculator{
	double firstNumber, secondNumber, result;
	int choice;

	public void addition(){
		Scanner calc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		firstNumber = calc.nextDouble();
		System.out.print("Enter Second Number: ");
		secondNumber = calc.nextDouble();
		result = firstNumber + secondNumber;
		System.out.print("This is the result: " + result);
		return;

	}

	public void subtraction(){
		Scanner calc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		firstNumber = calc.nextDouble();
		System.out.print("Enter Second Number: ");
		secondNumber = calc.nextDouble();
		result = firstNumber - secondNumber;
		System.out.print("This is the result: " + result);
		return;

	}

	public void multiplication(){
		Scanner calc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		firstNumber = calc.nextDouble();
		System.out.print("Enter Second Number: ");
		secondNumber = calc.nextDouble();
		result = firstNumber * secondNumber;
		System.out.print("This is the result: " + result);
		return;

	}

	public void division(){
		Scanner calc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		firstNumber = calc.nextDouble();
		System.out.print("Enter Second Number: ");
		secondNumber = calc.nextDouble();
		result = firstNumber / secondNumber;
		System.out.print("This is the result: " + result);
		return;

	}

	public void modulo(){
		Scanner calc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		firstNumber = calc.nextDouble();
		System.out.print("Enter Second Number: ");
		secondNumber = calc.nextDouble();
		result = firstNumber % secondNumber;
		System.out.print("This is the result: " + result);
		return;

	}

	public void seeResult(){
		System.out.println("\nWelcome to my demo Calculator");
		System.out.println("------------------------------\n");
		System.out.println(" 1. Add\n 2. Subtract\n 3. Multiply\n 4. Divide\n 5. Modulo\n");

		Scanner choose = new Scanner(System.in);
		System.out.print("Choose what to perform: ");
		choice = choose.nextInt();

		if(choice == 1)
			addition();

		if(choice == 2)
			subtraction();

		if(choice == 3)
			multiplication();

		if(choice == 4)
			division();

		if(choice == 5)
			modulo();
	}

	public static void main(String []args){
		Calculator calculate= new Calculator();
		calculate.seeResult();
	}
}