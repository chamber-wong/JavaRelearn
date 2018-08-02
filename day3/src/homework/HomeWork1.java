package homework;
/**
 * 根据用户输入,打印相应的菱形
 * @author 弄风
 *
 */
import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入菱形横对角线数量(请输入大于1的奇数):");
		int nub = sca.nextInt();
		System.out.println("请输入外边框字符(用a代表空格):");
		String outSide = sca.next();
		System.out.println("请输入内边框字符(用a代表空格):");
		String inSide = sca.next();
		
		HomeWork1 hw = new HomeWork1();
		hw.soidRho(nub,outSide,inSide);
		sca.close();
		
	}
	/**
	 * 根据指定外边和内边的字符和菱形最大边的大小,组合成新的菱形
	 * @param nub 最大边的数量
	 * @param outSide 外边字符
	 * @param outSide 内边字符
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
