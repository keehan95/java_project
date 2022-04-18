package P1;

import java.util.Scanner;

public class Fruit {
		
	public int Price() {
		
		System.out.println("Price\n1. Apple\n2. Strawberry\n3. Grape\n4. Watermelon");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if (n == 1) {
			return 8000;
		} else if (n == 2) {
			return 6000;
		} else if (n == 3) {
			return 5000;
		} else if (n == 4) {
			return 10000;
		} else {
			return 0;
		}
	}
}

