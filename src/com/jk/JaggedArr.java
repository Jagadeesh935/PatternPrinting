
public class JaggedArr {
	public static void main(String[] ags) {

		int a[][] = { { 0, 1, 2 }, { 3, 4 } };

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col] + "  ");
			}
			System.out.println();
		}

		System.out.println("---------------");

		int arr[][] = { { 0 }, { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 } };

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + "  ");
			}
			System.out.println();
		}
	}
}
