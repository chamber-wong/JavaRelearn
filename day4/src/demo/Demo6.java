package demo;

public class Demo6 {
	public static void main(String[] args) {
		//实例二:实现两个数的交换
		int[] arr4 = {4,5};
		//change(arr4[0], arr4[1]);  //4,5 没有交换
		change1(arr4);//5 ,4  交换了
		System.out.println(arr4[0]+"  "+arr4[1]);
		
		//可以将数组本身直接当做参数传递
		//但是直接写大括号的形式不可以直接作为参数
		//change({3,4});  不可以
		//change(new int[]{3,4});  可以
	}
	
	//值传递
	public static void change(int a,int b){
		a = a ^b;
		b = a ^b;
		a = a ^b;
	}
	
	//地址传递--址传递
	public static void change(int[] arr) {
		arr[0] = arr[0] ^ arr[1];
		arr[1] = arr[0] ^ arr[1];
		arr[0] = arr[0] ^ arr[1];
	}
	
	//址传递时,如果函数内部的引用的指向发生了改变,就不能再影响外部的值.
	public static void change1(int[] arr) {
		int[] arr1 = {5,6};
		arr = arr1;
		arr[0] = arr[0] ^ arr[1];
		arr[1] = arr[0] ^ arr[1];
		arr[0] = arr[0] ^ arr[1];
	}
}
