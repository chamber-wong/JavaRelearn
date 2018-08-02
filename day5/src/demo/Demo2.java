package demo;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {20,15,100,80,59,79};
		Demo2 demo2 = new Demo2();
		demo2.sort(arr);
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println("成绩为80的人为"+demo2.erFenSearch(arr, 80));
		
		
	}
	
	public int erFenSearch(int[] arrs,int key) {
		int l = 0;
		int h = arrs.length-1;
		while(l<=h) {
			int m = (h+l)>>1;
			if (arrs[m] == key) {
				return m;
			}else if (arrs[m] < key) {
				l = m+1;
			}else if (arrs[m] > key) {
				h = m -1;
			}
		}
		return -1;
	}
	
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					arr[j] = arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];
					arr[j] = arr[j] ^ arr[j+1];
				}
			}
		}
	}

}
