package junitTest;

public class Problem {
	public class Calculator {
		private int a;
		private int b;

		public Calculator(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public int sum() {
			return a + b;
		}

		public int subtract() {
			return a - b;
		}
	}

	public static boolean isTriangle(int sideA, int sideB, int sideC) {
		if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
			return false; // Các cạnh phải lớn hơn 0
		} else if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
			return true; // Tổng độ dài 2 cạnh bất kỳ phải lớn hơn cạnh còn lại
		} else {
			return false; // Không tạo thành tam giác
		}
	}

	public static double ptbacnhat(int a, int b) {
		if (a == 0) {
			if (b == 0) {
				return Double.MAX_VALUE;
			} else
				return Double.MIN_VALUE;
		} else
			return -b / a;
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

}
