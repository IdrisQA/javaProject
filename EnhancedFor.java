class EnhancedFor {
	public static void main(String[] args) {
		int idris[] = {7, 45, 76, 4, 9};
		int total = 0;

		for (int x : idris) {
			total += x;
		}
		System.out.println(total);
	}
}