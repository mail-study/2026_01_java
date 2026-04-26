class ArrayUtil {

	public static int[] concat(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];

		for(int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i];
		}

		for(int i = 0; i < arr2.length; i++) {
			result[i + arr1.length] = arr2[i];
		}

		return result;
	}

	public static void print(int[] arr) {
		System.out.print("[ ");

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");

		}
		System.out.print("]");

	}

}

public class ArrayUtilTest {
	public static void main(String[] args){
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		ArrayUtil.print(ArrayUtil.concat(array1, array2));
	}
}
