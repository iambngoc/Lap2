package Lab2;

public class PacalTriangle {
	public static void printPascalTriangle(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < row - i; j++) {
				System.out.print(" ");
			}
			printArr(getPascalTriangle(i));
			System.out.println();
		}
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static int[] getPascalTriangle(int n) {
		if (n == 1) {
			return new int[] { 1 };
		} else {
			int[] prevRow = getPascalTriangle(n - 1);
			return generateNextRow(prevRow);
		}
	}

	public static int[] generateNextRow(int[] prevRow) {
		int[] nextRow = new int[prevRow.length + 1];
		nextRow[0] = 1;
		nextRow[nextRow.length - 1] = 1;
		for (int i = 1; i < nextRow.length - 1; i++) {
			nextRow[i] = prevRow[i - 1] + prevRow[i];
		}
		return nextRow;
	}

	public static void main(String[] args) {
		printPascalTriangle(5);
	}
}
