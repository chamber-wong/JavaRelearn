package day2homework;

public class Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //1
		/*
		char ch = '*';  String  �ַ���
		for(int i = 0;i<10;i += 2){
		    System.out.println(ch);
		}
		//for֪ʶ�Ľ���---����ͬʱ���ڶ����ʼ�ı���
		for(int i = 0,j=0;i<10 && j == 100;i += 2,j++){
		    System.out.println(ch);
		}
	*/
		//2
		/*
		String str = "*****";
		for(int i = 0;i<10;i++){
		    System.out.println(str);
		}
		*/
		//3
		/*
		char ch = '*';
		 for(int i = 0; i<10;i++){
			 for (int j = 0; j <=i; j++) {
				System.out.print(ch);
			}
			 System.out.println();
		 }
		 */
		//4
		/*
		int a = 1;
		for(int i = 0;i<10;i++){
		    System.out.println(a);
 		*/
		//5
		/*
	    for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		*/
	
		//6
		/*
		for(int i = 5; i>0;i--){
			for(int j = 1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
 
		�ڶ���
	       //���Ƶ�����
		for(int j=0;j<5;j++){
			//һ�����ǵĸ���
			for(int i=0;i<=5-(j+1);i++){
				System.out.print(i+1);
			}
			
			//����
			System.out.println();
		}
		*/
		
		//7
		/*
		int a = 99;
		int sum = 0;
		for(int i = 0;i<10;i++){
			sum += 99;
		}
		System.out.println(sum);
		*/
		
		//8
	   /*
		int sum = 0;
		for(int i = 0;i<=100;i++){
			sum += i;
		}
		System.out.println(sum);
		*/
		
	
		//9
		/*
		int num = 1;
		for(int i = 1;i<=10;i++){
			num *= i;
		}
		System.out.println(num);
		*/
		
		//10
		 /*
		    int num = 1;
		    int a = 2;
		    for(int i = 0; i<20;i++){
		       num *= a;
		    }
		    System.out.println(num);
		*/
		
		
		//11
		/*
		  int sum = 0;
		  for(int i = 0;i<1000;i++){
		    if (i%2 != 0){
		        sum += i;
		    }
		}
		    System.out.println(sum);
		    */
		
		//12
		/*
		    int sum = 0
		    for(int i = 0;i<1000;i++){
		        if (i%3==0 || i%17==0){
		            sum = sum + i;
		        }
		    }
		    System.out.println(sum);
		 */
		
		//13
		/*
		int sum = 0;
		for(int i = 0;i<1000;i++){
		    if (i%3==0 && i%5==0 && i%7==0){
		        sum  = sum + i;
		    }
		}
		System.out.print(sum);
		*/
		
		//14
		/*
		int n = 0;
		for (int i = 0;i<100;i++) {
		    if ((i%7 == 0 || i%3 == 0) && !(i%7==0 && i%3==0)) {
		        n+=1;
		        
		    }
		}
		System.out.println(n);
	  */
		
		//15
		/*
		int n = 0;
		for  (int i = 0;i<100;i++){
		    if (i%7==0 && i%2==1) {
		        n+=1
		    }
		}
		System.out.println(n);
		  */
		
		//16
		/*
		for  (int i = 1;i<100;i++){
		    System.out.println((i+1+i)+"("+i+"+"+(i+1)+")");
		}
		*/
		
		//17
		/*
		int n = 71;
		int index = 0;
		for(int i = 2; i<=n;i++){
		    
		    if (n % i == 0){//��һ�����ܱ�n����
		        index = i;
		        break;//i<n
		    }
		}
		if (index == n) {//������
		    System.out.println("Yes");
		} else {//��������
		    System.out.println("No")
		}
        */
		
		//18
		/*
		int sum = 0;
		int n = 12345678;
		while (n != 0) {
		    sum = sum + n%10;
		    n = n/10;
		}
		  System.out.println(sum);
		*/
	}

}
