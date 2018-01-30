import java.util.Scanner;

public class BMI{
	double weight, height, result;

	public void setWeight(){
		Scanner bmi = new Scanner(System.in);
		System.out.print("What is your weight(kg)? ");
		weight = bmi.nextDouble();
	}

	public void setHeight(){
		Scanner bmi = new Scanner(System.in);
		System.out.print("What is your height(m)? ");
		height = bmi.nextDouble();
	}

	public void setBMIResult(){
		result = weight / (height * height);
		return;
	}

	public void showDetails(){
		System.out.println("\n These are your BMI details and status");
		System.out.println("---------------------------------------");
		System.out.println("Weight (kg): " + weight);
		System.out.println("Height (kg): " + height);
		System.out.println("BMI Result (kg/m): " + result);

		if (result < 18.5)
			System.out.println("Result: Underweight");

		if (result >= 18.5 && result <= 24.9)
			System.out.println("Result: Normal");

		if (result >= 25 && result <= 29.9)
			System.out.println("Result: Overweight");

		if (result >= 30)
			System.out.println("Result: Obese");
	}

	public static void main(String[] args) {
		BMI status = new BMI();
		status.setWeight();
		status.setHeight();
		status.setBMIResult();
		status.showDetails();
	}
}