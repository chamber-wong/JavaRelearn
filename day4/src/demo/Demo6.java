package demo;

public class Demo6 {
	public static void main(String[] args) {
		//ʵ����:ʵ���������Ľ���
		int[] arr4 = {4,5};
		//change(arr4[0], arr4[1]);  //4,5 û�н���
		change1(arr4);//5 ,4  ������
		System.out.println(arr4[0]+"  "+arr4[1]);
		
		//���Խ����鱾��ֱ�ӵ�����������
		//����ֱ��д�����ŵ���ʽ������ֱ����Ϊ����
		//change({3,4});  ������
		//change(new int[]{3,4});  ����
	}
	
	//ֵ����
	public static void change(int a,int b){
		a = a ^b;
		b = a ^b;
		a = a ^b;
	}
	
	//��ַ����--ַ����
	public static void change(int[] arr) {
		arr[0] = arr[0] ^ arr[1];
		arr[1] = arr[0] ^ arr[1];
		arr[0] = arr[0] ^ arr[1];
	}
	
	//ַ����ʱ,��������ڲ������õ�ָ�����˸ı�,�Ͳ�����Ӱ���ⲿ��ֵ.
	public static void change1(int[] arr) {
		int[] arr1 = {5,6};
		arr = arr1;
		arr[0] = arr[0] ^ arr[1];
		arr[1] = arr[0] ^ arr[1];
		arr[0] = arr[0] ^ arr[1];
	}
}
