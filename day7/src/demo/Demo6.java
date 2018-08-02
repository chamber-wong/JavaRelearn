package demo;

public class Demo6 {
	public static void main(String[] args) {
		//每个 Java 应用程序都有一个 Runtime 类实例，使应用程序能够与其运行的环境相连接。
		//可以通过 getRuntime 方法获取当前运行时。 
        //应用程序不能创建自己的 Runtime 类实例。

		Runtime runtime = Runtime.getRuntime();
		
		//单位是字节
		System.out.println(runtime.freeMemory()/1024./1024);//空闲的
		System.out.println(runtime.totalMemory()/1024./1024);//使用的总内存量
		System.out.println(runtime.maxMemory()/1024./1024);//可以使用的最大内存量
	}
}
