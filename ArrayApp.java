class ArrayApp {
	public static void main(String[] args) {
		System.out.println("Index \t Value");

		int idris[] = {65, 24, 77, 89, 32};

		for (int counter = 0; counter < idris.length; counter++) {
			System.out.println(counter + " \t " + idris[counter]);
		}
	}
}