class SimpleInterest {
	public static void main(String[] args) {
		double simpleInterest;
		double pricipal = 100000;
		double rate = 0.05;

		for (int year = 1; year <= 5; year++) {
			simpleInterest = (pricipal * year *rate) / 100;

			System.out.println(simpleInterest);
		}
	}
}