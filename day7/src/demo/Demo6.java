package demo;

public class Demo6 {
	public static void main(String[] args) {
		//ÿ�� Java Ӧ�ó�����һ�� Runtime ��ʵ����ʹӦ�ó����ܹ��������еĻ��������ӡ�
		//����ͨ�� getRuntime ������ȡ��ǰ����ʱ�� 
        //Ӧ�ó����ܴ����Լ��� Runtime ��ʵ����

		Runtime runtime = Runtime.getRuntime();
		
		//��λ���ֽ�
		System.out.println(runtime.freeMemory()/1024./1024);//���е�
		System.out.println(runtime.totalMemory()/1024./1024);//ʹ�õ����ڴ���
		System.out.println(runtime.maxMemory()/1024./1024);//����ʹ�õ�����ڴ���
	}
}
