package demo;

public class Demo2 {
	public static void main(String[] args) {
		 /*��ӡʵ������            *    ����      $
	        *  $$$*         1    1      3
	        *  $$***        3    2      2
	        *  $*****       5    3      1
	        *  *******      7    4      0
	        *  
	        *  $*****       5    1
	        *  $$***        3    2
	        *  $$$*         1    3
	        */  
			//�ϰ벿��
			for(int i=1;i<=4;i++){//������
				//����ÿ�е�$�ĸ���
				for(int k=1;k<=4-i;k++){
					System.out.print(" ");
				}
				//����ÿ�е�*����
				for(int j=1;j<=i*2-1;j++){//������
					System.out.print("*");
				}
				System.out.println();
			}
			//�°벿��
			for(int i=1;i<=3;i++){//������
				//����ÿ�е�$�ĸ���
				for(int k=1;k<=i;k++){
					System.out.print(" ");
				}
				//����ÿ�е�*����
				for(int j=1;j<=6-(i*2-1);j++){//������
					System.out.print("*");
				}
				System.out.println();
			}
			
			
			
	       /*   ��ӡ��������  
	        *     *
	        *    * *
	        *   *   *
	        *  *     *
	        *   *   *
	        *    * *
	        *     *
	        */
			System.out.println();
			//�ϰ벿��
			for(int i=1;i<=4;i++){//������
				//����ÿ�е�$�ĸ���
				for(int k=1;k<=4-i;k++){
					System.out.print(" ");
				}
				//����ÿ�е�*����
				for(int j=1;j<=i*2-1;j++){//������
					if (j==1 || j==i*2-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}	
				}
				System.out.println();
			}
			//�°벿��
			for(int i=1;i<=3;i++){//������
				//����ÿ�е�$�ĸ���
				for(int k=1;k<=i;k++){
					System.out.print(" ");
				}
				//����ÿ�е�*����
				for(int j=1;j<=6-(i*2-1);j++){//������
					if (j==1 || j==6-(i*2-1)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}	
				}
				System.out.println();
			}
	}
}
