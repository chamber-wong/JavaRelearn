package demo;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * һά����:�ڲ�ֱ�Ӵ洢��������
		 * ��ά����:�ڲ��洢���Ƕ��һά����ĵ�ַ(��ά�����о��Ƕ��һά����)
		 * 
		 */
		
		//����һά����
		int[] arr = new int[]{3,4,5};
		
		//������ά����--�յĶ�ά����
		/*
		 * ��ά������һά����һ��������������
		 * ��ά�������͵Ĺ���:��������+[]+[]
		 * =����Ĺ���:new + [һά����ĸ���] +[һά������Ԫ�صĸ���]
		 * ע���:��һ��[]�б�����,�ڶ���[]�е�ֵ����ʡ��.���д��,����һ�������ֵ
		 */
		int[][] arr1 = new int[2][];
		
		//��ֵ--�����±�
		arr1[0] = new int[]{3,4,5};
		arr1[1] = new int[]{3,4};
		
		//ȡֵ  ����:���������+[һά������±�]+[һά������Ԫ�ص��±�]
		int value = arr1[0][0];
		System.out.println(value);
		
		//����
		for (int i = 0; i < arr1.length; i++) {//���Ƶ�һά����ĸ���
			for(int j=0;j<arr1[i].length;j++){//���Ƶ���һά�����Ԫ��
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
		
		/*
		 * ��ǿforѭ��:��ʼѭ�����ȴ�������ȡ����һ��Ԫ��,����:ǰ��ı�����.����ѭ����ʹ�ñ�����ʱ��,ʹ�õľ������ֵ.
		 * ��һ��ѭ���������Զ���������ȡ���ڶ���Ԫ��,�ٴη���:ǰ��ı�����,���ν���,ֱ�����е�Ԫ�ر�����.ֹͣѭ��.
		 */
		for (int[] is : arr1) {
			for (int i : is) {
				System.out.print("��ǿforѭ��:"+i);
			}
			System.out.println();
		}
		
		//�����Ĵ�������:
		int[][] arr2 = {{4,5},{6,7,8}};
	}
}
