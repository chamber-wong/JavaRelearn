package demo;

public class Demo3 {
	public static void main(String[] args) {
		//要求星星要一个一个的打印
		/*
		 *  *         1
		 *  **        2
		 *  ***       3
		 *  ****      4
		 *  *****     5
		 */
		
		for(int i=1;i<=5;i++){//控制行数
			//System.out.println("*****");//一行的星星    print():只是打印,没有换行    println:即打印又换行
			
			//打一行*
			for(int j=1;j<=i;j++){//控制*的个数(列数)
				System.out.print("*");
			}
			
			//换行
			System.out.println();
			
		}
		
		//练习一:打印99乘法表    \t:制表符
        /*
         * 练习二:
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
