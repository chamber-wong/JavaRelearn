package com.qianfeng.test;

public class Demo3 {
	public static void main(String[] args) {
		String s1 = "1000phone";
		//1.�жϣ�
	    //�ж��Ƿ����һ�����ַ���
		//boolean contains(CharSequence s) 
		System.out.println(s1.contains("1000"));//true
	    //�ж������ַ����������Ƿ���ͬ
		//boolean equals(Object anObject) 
		System.out.println(s1.equals("10000phone"));//false
	    //���Դ�Сд�ж������ַ����������Ƿ���ͬ
		//boolean equalsIgnoreCase(String anotherString) 
		System.out.println(s1.equalsIgnoreCase("1000phonE"));//true
	    //�ж��Ƿ���ĳ�ַ�����ͷ
		//boolean startsWith(String prefix)
		System.out.println(s1.startsWith("1000"));//true
		//�ж��Ƿ���ĳ�ַ�����β
		//boolean endsWith(String suffix) 
		System.out.println(s1.endsWith("1000"));//false
		
		
	    //2.ת�������ַ�����ת�����ַ���
		char[] arr = {'a','b','c'};
		//1:ʹ�ù��췽��
		//String(char[] value) 
		String s2 = new String(arr);
		System.out.println(s2);//abc
		//String(char[] value, int offset, int count) ���ַ������һ����ת���ַ���
		String s3 = new String(arr, 0, 2);
		System.out.println(s3);//ab
		//2:ʹ�þ�̬����
		//static String copyValueOf(char[] data) 
		//static String copyValueOf(char[] data, int offset, int count) 
		//���ַ���ת���ַ�����
	    //char[] toCharArray() 
		char[] arr2 = s1.toCharArray();
		System.out.println(arr2.length);//9
		//���ֽ�����ת���ַ���--Ĭ����GBK
	    //String(byte[] bytes) 
		byte[] arr3 = {96,97,98};
		String s4 = new String(arr3);
		System.out.println(s4);
	    //String(byte[] bytes, int offset, int length)
	    //String(byte[] bytes, String charsetName)//ʹ��ָ���ı��뽫�ֽ�����ת�����ַ���
		//���ַ���ת���ֽ�����
	    //byte[] getBytes() 
		byte[] arr4 = s4.getBytes();
		System.out.println(arr4.length);//3
		//��������������ת�����ַ���
	    //String.valueOf()
		String s5 = String.valueOf(34);
		System.out.println(s5+1);
		
	    //3.�滻��
		//String replace(char oldChar, char newChar) 
		String s6 = s1.replace("1000", "9999");
		System.out.println(s6+"  "+s1);//9999phone
		//�Ӵ�:
		//String substring(int beginIndex)  
		String subString1 = s1.substring(2);
		System.out.println(subString1);
	    //String substring(int beginIndex, int endIndex) //������ʼλ�ã�����������λ�ã�������λ�õ�ǰһλ
		String subString2 = s1.substring(0, 4);
		System.out.println(subString2);
		//ת����ȥ���ո񣬱Ƚ�:
		//��Сдת��
	    //String toUpperCase()
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		//String toLowerCase() 
		String s8 = s7.toLowerCase();
	    //���ַ������˵Ŀո�ȥ��,�м���޷�ȥ��
	    //String trim() 
		System.out.println("  ph  one  ".trim()+"haha");
		//���ֵ�˳��Ƚ������ַ���
		/*
		 * �ֵ�˳��:����ASCII��Ƚϵ�ǰ�������ַ�,ASCII������Ϊ�Ǵ���ַ�
		 * ����:����ߵ�һ���ַ���ʼ�Ƚ�
		 * �����ǰ���ַ�����ͬ,ֱ����ΪASCII����ַ����Ǵ��ַ���,������ַ�ֹͣ�Ƚ�
		 * ��ǰ�ַ��Ƚϵľ������:ʹ��ǰ����ַ�-������ַ�,���ز�ֵ.����Ǹ���,˵��ǰ����ַ���С�ں����.��֮ǰ��Ĵ�.
		 * �����ǰ���ַ���ͬ,��ȥ�Ƚϵڶ����ַ�,����������,����ȵ������ͬ,����Ϊ�����ַ������,��ֵ����0.
		 */
	    //int compareTo(String anotherString)
		int value = s1.compareTo("1000hone");
		System.out.println(value);
		
		//4.�и�: String[] split(String)
		String ss = "a,b,c,d";
		//String[] strings = ss.split("");//ʹ��""���Խ����и�
		String[] strings = ss.split(",");//�����ַ�����Ϊ�˵�,�Ͳ����ٱ���Ϊ����.
		for (String string : strings) {
			System.out.println("�Ӵ�:"+string);
		}
	}
}
