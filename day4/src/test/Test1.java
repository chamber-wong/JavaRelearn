package test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "����̳̹�����";
		StringBuffer sBuffer = new StringBuffer(string1);
	    sBuffer.append("www");
	    sBuffer.append(".runoob");
	    sBuffer.append(".com");
	    System.out.println(sBuffer);
	    System.out.println(sBuffer.reverse());
	}

}
