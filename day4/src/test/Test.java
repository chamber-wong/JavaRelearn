package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = "123456";
		System.out.println("��ֵ֮ǰString��hashΪ:"+aString.hashCode());
		System.out.println("��ֵ֮ǰString��ֵΪ:"+aString);
		a(aString);
		System.out.println("��ֵ֮��String��ֵΪ:"+aString+"\r");
		
		int[] nums = {1,2,3,4,5,6,7,89};
		System.out.println("��ֵ֮ǰint[]��hashΪ:"+nums.hashCode());
		b(nums);
		System.out.println("�޸�֮���ֵ����ֵΪ:"+nums[0]+""+nums[1]+""+nums[2]+""+nums[3]+""+nums[4]+""+nums[5]+""+nums[6]+"");
	}
	public static void a(String str ) {
		System.out.println("�����ڲ�String��hashΪ:"+str.hashCode());
		
		str = "789";
	}
	public static void b(int[] num1) {
		System.out.println("�����ڲ�int[]��hashΪ:"+num1.hashCode());
		for(int i = 0;i<num1.length;i++) {
			num1[i] = 0;
		}
	}
}
