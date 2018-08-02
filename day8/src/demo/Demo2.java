package demo;

public class Demo2 {

}

//接口本身是抽象的
interface Inter1{
	int age = 4;//默认是public final static的,所以定义的时候必须给赋一个值
	public void show();//默认是abstract的,
}

class Son implements Inter1{
	//重写show()方法
	public void show() {
		
	}
}
