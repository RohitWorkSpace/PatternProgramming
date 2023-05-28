package patternprogramming;

public class DiagonalPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (i >= 2 && k > 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
//result:-
