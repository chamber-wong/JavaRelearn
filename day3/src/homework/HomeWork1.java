package homework;
/**
 * �����û�����,��ӡ��Ӧ������
 * @author Ū��
 *
 */
import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("���������κ�Խ�������(���������1������):");
		int nub = sca.nextInt();
		System.out.println("��������߿��ַ�(��a����ո�):");
		String outSide = sca.next();
		System.out.println("�������ڱ߿��ַ�(��a����ո�):");
		String inSide = sca.next();
		
		HomeWork1 hw = new HomeWork1();
		hw.soidRho(nub,outSide,inSide);
		sca.close();
		
	}
	/**
	 * ����ָ����ߺ��ڱߵ��ַ����������ߵĴ�С,��ϳ��µ�����
	 * @param nub ���ߵ�����
	 * @param outSide ����ַ�
	 * @param outSide �ڱ��ַ�
	 */
	public void soidRho(int nub,String outSide,String inSide) {
		if(outSide.equals("a")) 
			outSide = " ";
		if(inSide.equals("a"))
			inSide = " ";
		for(int i = 1; i<=nub/2+1 ;i ++) {
			for(int q = nub/2+1-i; q>0;q--) 
				System.out.print(" ");
			for(int j = 1; j<=i*2-1;j++) {
				if(j==1 || j==i*2-1) 
					System.out.print(outSide);
				else
					System.out.print(inSide);
			}
				
			System.out.println("");
		}
		for(int a = nub/2; a>0;a--) {
			for(int b =1 ; b<=nub/2+1-a ; b++)
				System.out.print(" ");
			for(int c = a*2-1;c>=1;c--) {
				if(c==1 || c==a*2-1) 
					System.out.print(outSide);
				else
					System.out.print(inSide);
			}
			System.out.println("");
		}
		
	}

}
