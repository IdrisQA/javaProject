class Nestedif {
	public static void main(String[] args) {
		int age = 34;

		if (age < 50) {
			System.out.println("You are young");
		}else{
			System.out.println("You are old");

			if (age == 75) {
				System.out.println("You are too old");
			}else {
				System.out.println("Don't worry you are not too old");

				if (age >90 && age <= 100) {
					System.out.println("You should be preparing for death anytime soon");
				}else if(age >75 && age <= 90){
					System.out.println("Death is monitoring your situation");
				}
			}
		}
	}
}