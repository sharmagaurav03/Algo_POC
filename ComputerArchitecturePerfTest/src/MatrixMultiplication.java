
class MatrixMultiplication {
	public static void main(String args[]) {
		long startTime = System.nanoTime();
		
		int m, n, p, q, sum = 0, c, d, k;

		m = 1000;
		n = 1000;

		int first[][] = new int[m][n];

		for (c = 0; c < m; c++)
			for (d = 0; d < n; d++)
				first[c][d] = c * d;
//		System.out.println("First Matrix");
//		printMatrix(first);

		p = 1000;
		q = 1000;

		int second[][] = new int[p][q];
		int multiply[][] = new int[m][q];

		for (c = 0; c < p; c++)
			for (d = 0; d < q; d++)
				second[c][d] = c * d;

//		System.out.println("Second Matrix");
//		printMatrix(second);

		for (c = 0; c < m; c++) {
			for (d = 0; d < q; d++) {
				for (k = 0; k < p; k++) {
					sum = sum + first[c][k] * second[k][d];
				}

				multiply[c][d] = sum;
				sum = 0;
			}
		}

//		System.out.println("Product of entered matrices:-");
//		printMatrix(multiply);
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
//		System.out.println(duration);

	}

//	public static void printMatrix(int[][] matrix) {
//		int c, d;
//		for (c = 0; c < 1000; c++) {
//			for (d = 0; d < 1000; d++)
////				System.out.print(matrix[c][d] + "\t");
//
////			System.out.print("\n");
//		}
//
//	}
}