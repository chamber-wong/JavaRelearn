package demo;
/*
 * 循环语句:
 */
public class Demo2 {
    public static void main(String[] args) {
		//while  :打印从1-10之间的数. 条件一:当遇到5的时候结束循环-break  条件二:当遇到5的时候结束本次循环--continue
//    	int i = 0;//起始条件
//    	while (i<10) {//结束条件
//    		//自增条件
//    		i++;
//    		
//			
//			if (i==5) {
//				//break;//结束循环
//				continue;//结束本次循环
//			}
//			System.out.println(i);
//		}
    	
    	//do while
//    	int j = 0;//其实条件
//    	do {
//    		//自增条件
//    		j++;
//    		
//			
//			if (j==5) {
//				//break;//结束循环
//				continue;//结束本次循环
//			}
//			System.out.println(j);
//		} while (j<10);//结束条件
    	
    	//dowhile 与 while的区别:dowhile不管条件成立与否,都会首先执行一次.
    	
    	
    	//for循环
/*    	for(定义的初始值;结束的条件;自增量(变化量))
    	{
    		执行语句;//循环体
    	}*/
    	/*
    	 * 执行过程:1.首先执行起始条件 k=0     执行一次
    	 * 2.判断  k<10,如果不成立直接退出循环,如果成立执行3    至少执行一次
    	 * 3.执行循环体内的语句      执行0次或多次
    	 * 4.执行k++     执行0次或多次
    	 * 5.继续判断k<10,如果不成立直接退出循环,如果成立执行3
    	 */
    	
    	for(int k=0;k<10;k++){//循环体
    		if (k == 5) {
				break;
			}
    		System.out.println(k);
    	}
    	
    	//注意点:--死循环:循环无法结束,一直循环下去
    	//循环后面默认跟一条语句,如果想加多条就要加{}
//    	for(;;){//循环体
//  
//    	}
//    	for(;;)
//    		System.out.println("哈哈");
//    	System.out.println("呵呵");
    	
    	//比较for和while?
    	//是否使用初始值工作,如果使用尽量使用for.否则使用while
	}
}
