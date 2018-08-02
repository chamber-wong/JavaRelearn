package demo;

public class Demo6 {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		//
		System.out.println(runtime.freeMemory()/1024./1024);
		//使用的总内存量
		System.out.println(runtime.totalMemory()/1024./1024);
		//最大可以使用的内存量
		System.out.println(runtime.maxMemory()/1024./1024);
		
	}
}
