class ArrayChange {
	public static void main(String[] args) {
		int idris[] = {3,4,5,6,7};
		change(idris);

		for(int y : idris) {
			System.out.println(y);
		}

	}

	public static void change(int x[]) {
		for (int counter = 0; counter < x.length; counter++) {
			x[counter] += 5;
		}
	}
}