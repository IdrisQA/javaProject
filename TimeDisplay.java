class TimeDisplay {
	public static void main(String[] args) {
		TimeSet idris = new TimeSet();
		System.out.println(idris.toMilitary());
		idris.setTime(13, 25,6);
		System.out.println(idris.toMilitary());
	}
}