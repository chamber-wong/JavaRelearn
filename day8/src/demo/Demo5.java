package demo;

public class Demo5 {
	public static void main(String[] args) {
		/*
		 * ʵ��:����Ȯ,�Ѿ�Ȯ,��äȮ��ȥ����,�м仹��һ����ä¿ҲҪ�ɻ��,��äȮ�͵�ä¿��Ҫѧϰ��ä����
		 * 
		 * ������,���󷽷�,�ӿ�,�̳�
		 */
	}
}

abstract class Ȯ{
	public abstract void work();
}

class ����Ȯ extends Ȯ{
	
	public void work() {
		System.out.println("����");
		
	}
}

class �Ѿ�Ȯ extends Ȯ{
	
	public void work() {
		System.out.println("�Ѿ�");
		
	}
}

interface Inter{
	public void study();
}

class ��äȮ extends Ȯ implements Inter{ 
	@Override
	public void work() {
		System.out.println("��ä");
		
	}
	
	@Override
	public void study() {
		System.out.println("ѧϰ��ä����");
		
	}
}

class ��ä¿  implements Inter{
	@Override
	public void study() {
		System.out.println("ѧϰ��ä����");
		
	}
}