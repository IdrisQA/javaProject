class Contructor {
	String girlName;

	public Contructor(String name){
		girlName = name;
	}

	public String getName() {
		return girlName;
	}

	public void saying() {
		System.out.printf("The name of my first girlfriend is %s \n", getName());
	}
}