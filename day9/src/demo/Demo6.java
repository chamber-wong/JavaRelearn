package demo;
/*
 * �����ڲ���(����):������һ���෽���е������������,���ھֲ��ڲ���.
 * 1.��������������������
 * 2.�����ڲ������
 * 
 * ���������ڲ������ע���:1.�����ڲ����������и�����߸��ӿ�
 * 
     �����ڲ�����������:
 * 1.��ֻ�õ���ǰ�����һ��ʵ�������ʱ��,���������ʹ��
 * 2.�����������ֵ�ʱ��
 * 3.���Ը��õĶ�������ʱ�Ļص�(֪������)
 * 
 * �ڲ��������:
 * 1.���ʵ���˶�̳�
 * 2.���㶨��
 * 3.ֻ���ⲿ����Է��ʴ������ڲ�������Ժͷ���,����˽�з���
 * 4.ͬһ�������������಻�ɼ�,���˺ܺõķ�װ��
 * 
 */
public class Demo6 {
	public static void main(String[] args) {
//		//�о���������,�����������
//		//������������,��ɷ����ĵ���
//		new Test1().test1Method();
//		
//		//���������������
//		//��һ�ַ���
//		//ʹ�����е�������������������󲢵��÷���
//		//Ӧ�ó���:�ֳɵ��������ʹ�ö��,��ͬ�Ĺ���Ҫ���ö�ε�ʱ��
//		new SubTest1().test1Method();
//		//�ڶ��ַ���
//		//ֱ�Ӵ���û�����ֵ�Test1��������������
//		//����: new + ���������/���ӿڵ����� + (){���������ִ����}+;
//		//����:ֻ��ʹ��һ��,ʹ���������ͷ�.ÿ�ζ����ò�ͬ�Ĺ���.
//		new Test1(){
//			//��д��Test1��ķ���
//			public void test1Method() {
//				System.out.println("���������෽��");
//			}
//			//�������еķ���
//			public void bark(){
//				System.out.println("bark");
//			}
//		}.bark();
//		
//		//�������������������
//		SubTest1 subTest1 = new SubTest1();
//		Test1 test1 = new Test1(){//��̬
//			//��д��Test1��ķ���
//			public void test1Method() {
//				System.out.println("���������෽��");
//			}
//			//�������еķ���
//			public void bark(){
//				System.out.println("bark");
//			}
//		};
		
		//�о������ڲ���--����
		Out out = new Out();
		out.show();
		out.testCanshu1();
		out.testCanshu2();
		Test1 test1 =  out.testFanhuizhi1();
		test1.test1Method();
		Test1 test12 = out.testFanhuizhi2();
	}
}

//�о���������,�����������
class Test1{
	public void test1Method(){
		System.out.println("test1-Method");
	}
}

class SubTest1 extends Test1{
	@Override
	public void test1Method() {
		System.out.println("SubTest1-Method");
	}
}

//�о������ڲ���
class Out{
	public void show() {
		//�����ڲ���
		new Test1(){
			//��д��Test1��ķ���
			public void test1Method() {
				System.out.println("���������෽��");
			}
			//�������еķ���
			public void bark(){
				System.out.println("bark");
			}
		}.bark();		
		new Test1(){
			//��д��Test1��ķ���
			public void test1Method() {
				System.out.println("���������෽��");
			}
			//�������еķ���
			public void bark(){
				System.out.println("bark");
			}
		}.test1Method();
	}
	
	//��ͨ������������Ϊ����
	public void testCanshu1(){
		System.out.println(new Test1());
	}
	//���������ڲ��������Ϊ����
	public void testCanshu2(){
		System.out.println(
				
			new Test1(){
			
			public void  bark(){
				System.out.println("bark");
			}
			@Override
			public String toString() {
				
				return "haha";
			}
		}.toString()
				
				);
	}
	
	//��ͨ����������䵱����ֵ
	public Test1 testFanhuizhi1(){
		return new Test1();
	}
	//�����ڲ������䵱����ֵ
	public Test1 testFanhuizhi2(){
		return new Test1(){
			
			public void  bark(){
				System.out.println("bark");
			}
			@Override
			public String toString() {
				
				return "haha";
			}
		};
	}
	
	//�Լ�����ʹ�ýӿڳ䵱����������ڲ������---��Ϊ����,����ֵ.
}