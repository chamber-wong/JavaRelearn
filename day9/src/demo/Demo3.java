package demo;


/*
 * �ڲ���:������A�������B������ڲ���,B����A���еĵ�λ�������ĳ�Ա��ͬ,�����໥����.
 */
public class Demo3 {
     public static void main(String[] args) {
    	 //����һ:�Ȼ�ȡ�ڲ�������ٵ��÷���
		Outer outer = new Outer();
		//�������ڲ��ڵĶ���;��ʽ��:�ⲿ��Ķ���.new �ڲ��๹�췽��.
		//Outer.Inner ��ȡ�ڲ���ķ�ʽ
		Outer.Inner inner =  outer.new Inner();
		inner.play();
		
		//������:�������ⲿ��ķ���ʵ���ڲ��෽���ĵ���
		outer.show();
	}
}

class Outer{
	int age = 10;
	class Inner{//�ڲ���
		int height = 20;
		
		public void play(){
			System.out.println("Inner-play"+age);
		}
	}
	
	public  void  show() {
		System.out.println("Outer-show");
		
		//�൱����ʹ��Inner
		Inner inner = new Inner();
		inner.play();
	}
}


//ͨ���ڲ�����java���ʵ���˶�̳�
class A{
	
}

class B{
	
}

class X extends A{
	class Y extends B{
		
	}
}
