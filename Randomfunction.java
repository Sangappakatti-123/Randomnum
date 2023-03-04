package com.jspider.p11;

public class Randomfunction {
	public static void main(String[] args) {
		long n = 100000000l;
		getting_pi(n);
	}
   private static void getting_pi(long n) {
		double num_point_circle = 0;
		double num_point_square = 0;
		for (int i = 0; i <= n; i++) {
			double x = Math.random();
			double y = Math.random();
			// System.out.println(x);
			// System.out.println(y);

			double m = Math.sqrt((x * x) + (y * y));
			// System.out.println(m);
			if (m <= 1) {
				num_point_circle += 1;

			}
			num_point_square += 1;
			// System.out.println(num_point_circle);
			// System.out.println(num_point_circle);
		}
		if (num_point_square != 0) {
			double pi = 4 * num_point_circle / num_point_square;
			System.out.println("pi is" + pi);
		}

	}
}
