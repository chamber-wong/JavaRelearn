package 查找;

public class Select {
	//查找
		/*
		 * 注意点:1.插到值时-返回下标
		 * 2.查不到值--返回-1
		 * 3.有相同值时--返回查到的第一个值的下标
		 * 普通查找:
		 * 二分查找:
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int search(int[] arr,int key) {
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				return arr[i];
			}
		}
		return -1;
	}
	public int erFenSerach(int[] arr,int key) {
		int l = 0;
		int h = arr.length-1;
		while(l<=h) {
			int m = (l+h)>>1;
			if (key == arr[m]) {
				return m;
			}else if (key > arr[m]) {
				l = m+1;
			}else if (key < arr[m]) {
				h= m-1;
			}
		}
		return -1;//没有查到值
	}
}
