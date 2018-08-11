package demo;
/*
 * 数组:用来存储数据的
 * 数组的解释,是一种引用数据类型,可以同时存储多个相同类型的数据.
 * 
 * 比较简单数据类型和引用数据类型?
 * 引用数据类型的变量中存储的是地址,并且是十六进制的数据.简单数据类型存储的是数值,是十进制的.
 * 
 * 特点:数组的内存空间是连续的,数组内的元素如果没有赋值会有默认值,简单数据类型默认值是0
 * 
 * 缺点:这个空间一旦被创建出来就不能再被改变.
 * 
 * new :每new一次会在堆中开辟一块儿新的空间.两个数组之间没有关系,互不影响.
 * new出来的空间都在堆里面
 */
public class Demo5 {
	public static void main(String[] args) {
		int a = 5;
		//创建一个可以存3个int型数据的数组,并将地址保存在arr变量中.
		/*
		 * 构成: new + 数据类型+[元素的个数]
		 * new 的功能:1.开辟一块儿内存空间      2.将当前数组的地址返回,默认当前数组的地址就是首元素的地址.
		 * 关于int[3]中的int:存储的值是什么类型,这里就写什么类型.
		 * 
		 * =前的int+[]代表存储的是int型数据,int[]是一个整体,代表int型的数组类型.
		 * =后面是数组(实体),注意:后面的int+[]与前面的意义不同.
		 * =前面的arr是局部变量,是引用数据类型
		 */
		int[] arr = new int[3];
		
		//给元素赋值--通过下标
	    //构成:数组的名字+[下标的值],先通过arr里面保存的地址找到对应的数组,再通过下标找到对应的元素,完成赋值
		arr[0] = 3;
		arr[1] = 5;
		arr[2] = 6;
		
		//取值
		System.out.println(arr[2]);
		
		//注意点:数组下标越界的错误,会报ArrayIndexOutOfBoundsException
		//System.out.println(arr[10]);
		
		//其他的创建数组的方式:
		//方式一:创建数组的同时完成了初始化
		//要求:int后面的[]里面什么都不能写.数组的大小默认就是后面{}中数的个数.
		int[] arr1 = new int[]{2,3,4};
		
		//方式二
		int[] arr2 = {2,3,4};
		
		//遍历:arr2.length获取的是数组的长度(元素的个数)
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
		
		//实际应用:
		//实例一:求三个数的最大值
		int[] arr3 = {4,2,7,1};
		int max = getMax(arr3);
		System.out.println(max);
		
	}
	
	//实例一:求三个数的最大值
	public static int getMax(int[] arr){
		int temp = arr[0];
//		temp = arr[0]>arr[1]?arr[0]:arr[1];
//		return temp >arr[2] ?temp:arr[2];
		for (int i = 0; i < arr.length; i++) {
			if (temp <arr[i]) {
				temp = arr[i];
			}
		}
		
		return temp;
	}
	
}
