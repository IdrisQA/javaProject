import java.util.Scanner;
	
public class Questionnaire{
	String name, school, department, course, cgpa;
	int age;
	public void setName(){
		Scanner info = new Scanner(System.in);
		System.out.print("What is your name? ");
		name = info.nextLine();
	}

	public void setSchool(){
		Scanner info = new Scanner(System.in);
		System.out.print("What is the name of your school? ");
		school = info.nextLine();
	}

	public void setDepartment(){
		Scanner info = new Scanner(System.in);
		System.out.print("Which department are you? ");
		department = info.nextLine();
	}

	public void setCourse(){
		Scanner info = new Scanner(System.in);
		System.out.print("Which course are you offering? ");
		course = info.nextLine();
	}

	public void setCgpa(){
		Scanner info = new Scanner(System.in);
		System.out.print("What is your CGPA? ");
		cgpa = info.nextLine();
	}

	public void setAge(){
		Scanner info = new Scanner(System.in);
		System.out.print("How old are you? ");
		age = info.nextInt();
	}

	public void printResult(){
		System.out.println("\n");
		System.out.println("These are your results");
		System.out.println("-----------------------\n");
		System.out.println("Name: " + name);
		System.out.println("School: " + school);
		System.out.println("Department: " + department);
		System.out.println("Course: " + course);
		System.out.println("CGPA: " + cgpa);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args){
		Questionnaire questions = new Questionnaire();
		questions.setName();
		questions.setSchool();
		questions.setDepartment();
		questions.setCourse();
		questions.setCgpa();
		questions.setAge();
		questions.printResult();
	}
}