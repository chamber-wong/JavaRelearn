package demo;
/*
 * ������֮��Ĺ�ϵ:
 * 1.�̳�--����ʵ�Ĺ�ϵ���ǵ�����ʹ��˭��˭����
 * 2.���--����ʵ�Ĺ�ϵ���ǵ�����ʹ��˭����˭����
 * 3.����
 * 
 * ���ε��ھ������,��������
 */
public class Demo2 {
	public static void main(String[] args) {
		//ʵ��:�������ӵĸ����Ƚ�������
		Car car1 = new Car(3);
		Car car2 = new Car(2);
		boolean isTrue =  car1.comWithWheels(car2);
		System.out.println(isTrue);
		
		//ѧϰequals
		//Ĭ�ϵıȽϹ����ǰ��յ�ַ�Ƚ�,����ͨ����д��,���԰����Լ��ıȽϹ������.
		boolean istrue1 = car1.equals(car2);
		System.out.println(istrue1);
		
		//hashCode()����--��ȡ���Ƕ���Ĺ�ϣֵ,�������ɵ�ǰ��������֤
		System.out.println(car1.hashCode());//31168322  ʮ���ƵĹ�ϣֵ
		System.out.println(car2.hashCode());
		
		System.out.println(Integer.toHexString(car1.hashCode()));//1db9742  ʮ�����ƵĹ�ϣֵ
		
		//toString()Ĭ�ϵõ����ǰ���+����+@+��ϣֵ
		System.out.println(car1.toString());//com.qianfeng.test.Car@1db9742
//		System.out.println(car1);/com.qianfeng.test.Car@1db9742  ˵��Ĭ�ϵ��õ�toString()����
		
		
		//�˽�:getClass():��ȡ���ǵ�ǰ������ֽ����ļ�,�൱�ڽ�ϵͳ��������Ĺ�������������γ���Class��
		Class class1 = car1.getClass();
		System.out.println(class1);//class com.qianfeng.test.Car  �õ��ľ����ֽ����ļ�
		//�Լ�ƴ��Ĭ�ϵ�toString()
		System.out.println(class1.getName()+"@"+Integer.toHexString(car1.hashCode()));
	}
}

class Car{
	int wheels;
	public Car(int wheels) {
		super();
		this.wheels = wheels;
	}

	//�������ӵĸ����Ƚ�������
	public boolean comWithWheels(Car car){
		return this.wheels > car.wheels;
	}
    
	//��дequals����
	public boolean equals(Object obj) {
		//�Լ��ƶ��ȽϵĹ���
		//1�ݴ���
		if (!(obj instanceof Car)) {
			System.out.println("���ʹ���");
			//�˳�����
			System.exit(0);
		}
		
		//2.����ת��
		Car car = (Car)obj;
		
		return this.wheels > car.wheels;
	}
	
	@Override
	public String toString() {
		return "Car [wheels=" + wheels + "]";
	}
     
}
