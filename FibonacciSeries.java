package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int x = -1;
		int y = 1;
		int total = 0;
		for (int i =1; i<=8; i++) {
			total = x + y;
			x = y;
			y= total;
			System.out.println(total);
		}
	}
}
