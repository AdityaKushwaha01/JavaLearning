package companies.interview.questions;

public class BottomLine {

	//for the range of 0-44 if even number found right rotate the array even number time and same for odd number
	public static void main(String[] args) {
		int[] arr = {2321, 324, 768, 877, 3232, 234, 534, 324, 897, 7879, 124, 9879, 2342, 87326};
		int rotCount = 44;

		for (int i = 1; i <= rotCount; i++) {
			if (i % 2 == 0) {
				for (int k = 0; k < i; k++) {
					rightRotate(arr);
				}
			} else {
				for (int k = 0; k < i; k++) {
					leftRotate(arr);
				}
			}
		}

		// Step B: Reverse
		reverse(arr);

		for (int h : arr) {
			System.out.print(h + " ");
		}
	}

	public static void leftRotate(int[] arr) {
		int first = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = first;
	}

	public static void rightRotate(int[] arr) {
		int last = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = last;
	}

	public static void reverse(int[] arr) {
		int l = 0, r = arr.length - 1;
		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}
}


