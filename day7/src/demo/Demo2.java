package demo;
/*
 * ��װ��:(���ݶ����Եķ�װ��˵��)�ѶԳ�Ա�����ķ��ʽ���˽�л�,ͨ��һ�������ķ�����ӵ�ʵ���˷���.
 * �ô�:����˴���İ�ȫ��,����˴���Ŀɶ��Ժ͸�����.
 * 
 * ��ݼ�:shift+alt+s
 */
public class Demo2 {
	public static void main(String[] args) {
		/*
		 * ��ǹ���
		 */
		Gun gun = new Gun();
		//�ڳ����г��ֵĲ������߼������ݳ�Ϊ������
		/*
		 * ԭ��:ֱ�ӽ����ݽ����˳�Ա����
		 * ���:1.��Ҫ������ֱ�Ӹ�ֵ����Ա����--����Ա����˽�л�
		 * 2.ͨ��������ӵķ�����,�ڷ������ȹ���,�ٸ�ֵ
		 */
		
		//gun.bulletNumber = -5;
		gun.addBullet(5);
		gun.shoot();
		/*
		 * ��Ϊ�����е����Զ���Ҫ���и�ֵ,ȡֵ,����ϵͳָ����һ�׹淶---set,get����
		 * set---��ֵ�Ĺ���
		 * ����:  ���δ�   ����ֵ����  ������(�����б�){������
		 * 		����ֵ
		 * }
		 * ����ֵ����:����Ҫ--void
		 * ������:set+��Ա����������,���ǳ�Ա����������ĸ��Ҫ��д
		 * �����б�:һ��������ɶ�һ�����Եĸ�ֵ,����ֻ��Ҫһ������.�������������Ա������һ��,�������������Ա����һ��
		 * ������:this.��Ա���� = �βε�����
		 * 
		 * get---ȡֵ�Ĺ���
		 * ����:  ���δ�   ����ֵ����  ������(�����б�){������
		 * 		����ֵ
		 * }
		 * ����ֵ����:�������Ա����һ��
		 * ������:get+��Ա����������,���ǳ�Ա����������ĸ��Ҫ��д
		 * �����б�:����Ҫ����
		 * ������:return ��Ա����
		 */
	}
}

class Gun{
	//private:�����δ�,�������εĳ�Աֻ�ڵ�ǰ���пɼ�
	private int bulletNumber;
	private String name;
	private int height;
	private int weight;
	private int model;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getBulletNumber() {
		return bulletNumber;
	}

	public void addBullet(int number){
		//����
		if (number >= 0) {
			this.bulletNumber = number;
		}else {
			this.bulletNumber = 0;
		}
	}
	
	public void setBulletNumber(int bulletNumber){
		//����
		if (bulletNumber >= 0) {
			this.bulletNumber = bulletNumber;
		}else {
			this.bulletNumber = 0;
		}
		
	}
	
	//���
	public void shoot(){
		if (bulletNumber>0) {
			--bulletNumber;
		}
		
		System.out.println("ʣ����ӵ�����:"+ bulletNumber);
	}
}
