package com.qianfeng.test;
/*
 * 验证qq是否合法
 * 要求:1.首字母不能为0   2.长度 5-13   3.全部是数字
 */
public class Demo11 {
	public static void main(String[] args) {
		String qq = "07283904";
		//第一种:简单的判断
		boolean b = test1(qq);
		System.out.println(b);
		//第二种:利用异常判断--小练习
		
		//第三种:通过正则表达式
		//正则表达式相当于一个规则
		String regex = "[1-9]\\d{4,12}";
		boolean b1 = qq.matches(regex);
		System.out.println(b1);
	}
	//第一种
	public static boolean test1(String qq){
		if (!qq.startsWith("0")) {
			if (qq.length()>=5 && qq.length()<=13) {
				char[] arr = qq.toCharArray();
				int a = 0;
				for(int i=0;i<arr.length;i++){
					if (!(arr[i]>=48 && arr[i]<=57)) {
						System.out.println("不全是数字");
					}else {
						a++;
					}
					
				}
				
				if (a == arr.length) {
					return true;
				}
				
			}else {
				System.out.println("qq的长度不能在(5,13)之外");
			}
		}else {
			System.out.println("qq不能以0开头");
		}
		
		return false;
	}
	
	//第二种:
	
	//第三种:
}
