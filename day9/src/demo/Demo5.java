package demo;

public class Demo5 {
	public static void main(String[] args) {
		Outer4 outer4 = new Outer4();
		outer4.show();
		outer4.eat();
	}
}

//ģ��jdk1.7ʱ�ֲ�����ǰ����final���ε�ʱ������
class Outer4{
	Object object = null;
	public void show() {
		/*
		 * �˽�����:
		 * 
		 * final:��final���εı����ᱻ���ڳ�����,����������ֵ�Ĵ���ʱ��Ҫ���ڵ�ǰ�ķ���,�൱��������ԭ���ֲ�������������,
		 * ������ִ������,����Ҳ���ᱻ�ͷ�
		 * 
		 * 
		 * ֻҪ������Ľ��ۼ�ס�Ϳ���
		 * 
		 * ǰ��:������ʹ���˾ֲ��ڲ���
		 * ��jdk1.7֮ǰ,Ҫ�뱣ס���ֵ�����ֶ����final
		 * ��jdk1.8��֮��,java���ڲ������Ѿ��ڱ�����ǰ��Ĭ�������final
		 */
		int  age = 6;
		class Inner{//�ֲ��ڲ���
			
			public void run() {
				System.out.println("��"+age);
			}
			
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "toString"+age;
			}
		}
		
		//show���ڲ�ʹ�þֲ��ڲ���
		object = new Inner();//��̬
	
	}
	
	public void eat(){
		System.out.println(object.toString());
		System.out.println("eat");
	}
}
