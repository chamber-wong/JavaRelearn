package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = "123456";
		System.out.println("传值之前String的hash为:"+aString.hashCode());
		System.out.println("传值之前String的值为:"+aString);
		a(aString);
		System.out.println("传值之后String的值为:"+aString+"\r");
		
		int[] nums = {1,2,3,4,5,6,7,89};
		System.out.println("传值之前int[]的hash为:"+nums.hashCode());
		b(nums);
		System.out.println("修改之后的值数组值为:"+nums[0]+""+nums[1]+""+nums[2]+""+nums[3]+""+nums[4]+""+nums[5]+""+nums[6]+"");
	}
	public static void a(String str ) {
		System.out.println("方法内部String的hash为:"+str.hashCode());
		
		str = "789";
	}
	public static void b(int[] num1) {
		System.out.println("方法内部int[]的hash为:"+num1.hashCode());
		for(int i = 0;i<num1.length;i++) {
			num1[i] = 0;
		}
	}
}
