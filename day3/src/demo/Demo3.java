package demo;

public class Demo3 {
	public static void main(String[] args) {
		//Ҫ������Ҫһ��һ���Ĵ�ӡ
		/*
		 *  *         1
		 *  **        2
		 *  ***       3
		 *  ****      4
		 *  *****     5
		 */
		
		for(int i=1;i<=5;i++){//��������
			//System.out.println("*****");//һ�е�����    print():ֻ�Ǵ�ӡ,û�л���    println:����ӡ�ֻ���
			
			//��һ��*
			for(int j=1;j<=i;j++){//����*�ĸ���(����)
				System.out.print("*");
			}
			
			//����
			System.out.println();
			
		}
		
		//��ϰһ:��ӡ99�˷���    \t:�Ʊ��
        /*
         * ��ϰ��:
         *   @@*
         *   @***
         *   *****
         *   
         *    ***
         *     *
         *     
         *     *
         *    * *
         *   *   *
         *    * *
         *     *
         */
	}
}
