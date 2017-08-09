package esPrimo;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int i = 0;
		int n = 0;
		n = sc.nextInt();
		for (i = 1; i < (n + 1); i++) {
			if (n % i == 0) {
				a++;
			}
		}
		if (a != 2) {
			System.out.println("No es Primo");
		} else {
			System.out.println("Si es Primo");
		}
	}
}