package Bien;

public class Hang {
	final float pi = 3.14f;	
	final int hour = 24;
	
	public void ChuVI() {
		int r = 2;
		double chuvi = 2  * r * pi;
		System.out.println("chu vi hinh tron la " + chuvi);
	}
	
	public void Day() {
		int minute = 60;
		long day = minute * hour;
		System.out.println("Mot ngay co so phut la: " + day);
	}
	
	public static void main(String[] args) {
		Hang h = new Hang();
		h.ChuVI();
		h.Day();
	}
}
