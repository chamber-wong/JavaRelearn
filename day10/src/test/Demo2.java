package test;

public class Demo2 {
	public static void main(String[] args) {
		Math math = new Math();
		try {
			math.div(3,-2);
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
}
class Math{
	//声明异常.告诉别人,我有可能发生异常
	public int div(int a,int b) throws CustomException {
		if (b<0) {
			throw new CustomException();//手动生成并抛出除数为负数的异常
		}
		return a/b;
	}
}
/**
 * 构造一个除数为负数的异常
 */
class CustomException extends Exception{
    public CustomException(){
        
    }
    public CustomException(String message){
        super(message);
    }
}