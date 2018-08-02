package 排序;

public class Sort {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[] {5,9,1,3,7,0};
		Sort sort = new Sort();
		sort.bubbleSort(arr1);
//		sort.selectSort(arr1);
		
		for(int arr : arr1) {
			System.out.print(arr+" ");
		}
		
	}
	/**
	 * 冒泡排序
	 * @param arr
	 */
	public void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					arr[j] = arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];
					arr[j] = arr[j] ^ arr[j+1];
				}
			}
		}
	}
	/**
	 * 选择排序
	 * @param arr
	 */
	public void selectSort(int[] arr) {
		int index = 0;
		int min = arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j =i+1; j < arr.length-1; j++) {
				if (arr[i] < arr[j+1]) {
					arr[i] = arr[i] ^ arr[j+1];
					arr[j+1] = arr[i] ^ arr[j+1];
					arr[i] = arr[i] ^ arr[j+1];
				}
			}
		}
	}
	

}
