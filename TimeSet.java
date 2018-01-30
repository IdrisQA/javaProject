class TimeSet {
	private int hours;
	private int minutes;
	private int seconds;

	public void setTime(int h, int m, int s) {
		hours = ((h >= 0 && h < 24) ? h : 0);
		minutes = ((m >= 0 && m < 60) ? m : 0);
		seconds = ((s >= 0 && s < 60) ? s : 0);
	}

	public String toMilitary() {
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}
}