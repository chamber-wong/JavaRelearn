package com.chamber.test;

public class Demo3 {
	public static void main(String[] args) {
		/*
		 * 运算符:
		 * a:从功能分类
		 * 1.算数运算符         + - * / %  ++  --
		 * 2.赋值运算符         =  +=  -=  *= /= %=
		 * 3.关系运算符         >  <  <= >= != ==
		 * 4.逻辑运算符        &&(与)    ||(或)   !(非)
		 * 5.位运算符:直接操作的是位     &(按位与)   |(按位或)   ^(按位异或)   ~(按位取反)
		 * 6.移位运算符:直接操作的位      >>1  右移一位:代表除以二     <<1 左移一位:代表乘以二
		 * 
		 * b:按运算符操作的元素个数分类:
		 * 一元(元素)运算符
		 * 二元运算符
		 * 三元运算符
		 */
		
//		 * 运算符:
//		 * a:从功能分类
//		 * 1.算数运算符         + - * / %  ++  --
		int a =3,b = 4;
		System.out.println(a+b);
		System.out.println(-2/-1);//整数相除得到的一定是整数      与普通的运算规则一致
		System.out.println(3%-2);//余数的符号与被余数一致
		
		//++(自增) --(自减) 
		//研究++:默认一次增加一
		/*
		 * 当++在变量的后面时,变量会使用当前的值先参与运算,之后再自身加一
		 * 当++在变量的前面时,变量会首先自身加一,之后使用当前的值再参与运算
		 */
		int q = 2,w = 1,y=0,x;
		x = q++;
		y = ++w;
		System.out.println(x+"   "+y+"   "+q+"   "+w);
//		 * 2.赋值运算符         =  +=  -=  *= /= %=
		int z = 3,z1=2;//一个变量在使用之前必须先赋值
		z1+=z;//z1 = z1+z;
		
		//实例:算n,m,u,o的值
		int n=2,m=3,u=1,o=0;
		o=n++ - --m + (u++ - n--);
		System.out.println(n+"  "+m+"  "+u+"  "+o);
		/*
		 * 实例的分析:先考虑优先级,优先级相同再考虑结合性.,先考虑优先级低的,使用排除法将优先级高的找出来,再一步步运算
		 * 1.先考虑=,使用排除法,根据右结合性,先算=的右边
		 * 2.再考虑()外的-,+,根据左结合性
		 * 3.算n++  n=3   n++=2
		 * 4.算 --m  m=2  --m=2
		 * 5.算()   (1-3)  u=2  n=2
		 * 6.算2中的-+    2-2+(1-3)=-2
		 * 7.算=  将值付给o=-2
		 */
//		 * 3.关系运算符         >  <  <= >= != ==    
		//  注意点:返回值只有两个true/false
		System.out.println(2<3);//true
		System.out.println(4==5);//false
//		 * 4.逻辑运算符        &&(与)    ||(或)   !(非)
		//特点:运算的结果是true/false    参与运算的元素也必须是true/false
		/*
		 *   &&(与):全真则真,一假则假
		 *   ||(或):全假则假,一真则真   
		 *   !(非) :假则真,真则假
		 *   
		 *   短路与:当有多个&&连接的时候,从左往右运算,只要得到一个false,就会停止运算,整个的结果就是false
		 *   短路或:当有多个||连接的时候,从左往右运算,只要得到一个true,就会停止运算,整个的结果就是true
		 */
		System.out.println(true && false);//false
		System.out.println(2>3 || (3<4));//true
		System.out.println(!true);//false
		System.out.println(true && true && true && false);
		//推出的r的值是2,说明出现false之后,停止了运算.这个思路只适用于连续的&& 或者 连续的||,一旦出现了其他的运算符,就要单独进行运算
		int r = 2;
		boolean istrue = 2>1 && 3<4 && 4>5 && r++>9;
		System.out.println(istrue+"  r:"+r);//2
//		 * 5.位运算符:直接操作的是位     &(按位与):全1则1,有0则0   |(按位或):全0则0,有1则1
			//^(按位异或):参与运算的当前位相同则是0,不同则是1     ~(按位取反):1就取0,0就取1
		//问题:有了普通的运算符,为什么还要有位运算符?
		//答:速度快效率高,因为直接操作的是二进制
		
		
		//实例: 13和7
		/*
		 * 1101    13
		 * 0111    7
		 * 
		 * 0101    &
		 * 1111    |
		 * 1010    ^
		 * 
		 * 1101  13
		 * 0010  ~
		 */
		
		//有两个数:t=4,h = 5,要求交换两个数
		//第一种:借助三方变量
		int t=4,h=5,l=0;
//		l=t;
//		t = h;
//		h = l;
		
		//第二种:通过^实现两个数的交换,不再需要借助于三方变量
		t = t ^ h;
		h = t ^ h;
		t = t ^ h;
		System.out.println(t+"  "+h);
		/*
		 * 分析:
		 * 0100   4
		 * 0101   5
		 * 
		 * 0001   t
		 * 0101   5
		 * 
		 * 0100   h-----4
		 * 0001   t
		 * 
		 * 0101   t-----5
		 */
//		 * 6.移位运算符:直接操作的位      >>1  右移一位:代表除以二     <<1 左移一位:代表乘以二   >>>1  无符号右移   <<<1  无符号左移
		//只能用于整数的运算
		System.out.println(5>>1);//2
		/*
		 * 0101 --右移一位--0010---左移一位--00100:4   不一定能得到 ,因为当前的数不一定被2整除
		 * 0101  --左移一位--01010---右移一位--0101    不一定能得到,因为当前的数有可能溢出
		 */
		
		 /*
		  * 表达式:由变量和常量以及运算符组成的式子
		  * 语句:表达式+;  注意点:如果只有一个;也叫语句---空语句
		  */
		 //* b:按运算符操作的元素个数分类:
		 //* 一元(元素)运算符:++  --  ~   !   -(负号)  +(正号)
		 //* 二元运算符:+ - * / 
		 //* 三元运算符:三目运算符: ?:---表达式一 < 表达式二 ?变量一 :变量二
		//解释:先让表达式一与表达式二比较,如果结果是true,整个式子的结果就是变量一的值.如果是false,就取变量二的值.
		//利用三目运算符求两个数的最大值
		int a2=3,a3 = 5;
		System.out.println(a2 < a3?a3 :a2);
	}
}
