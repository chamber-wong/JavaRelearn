package test;

public class Test {
	public static void main(String[] args) {
		
	}
//	public static Object sum(Object o1,Object o2) {
////		Object sum = o1+o2;
//		
//		return sum;
//	}
}

abstract class A{
	public abstract void name() ;
}
class B extends A{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("子类中的name方法");
	}
	
}
