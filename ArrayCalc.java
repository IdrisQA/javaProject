class ArrayCalc {
	public static void main(String[] args) {
		int idris[] = {77, 65, 47, 35, 90};
		int sum = 0;
		int n = 0;
		int average;

		for (int counter = 0; counter < idris.length; counter++) {
			sum += idris[counter];
			n = counter + 1;
		}
		System.out.println("The sum of the values is " + sum);
		average = sum/n;
		System.out.println(sum + " / " + n + " = " + average);
	}
}