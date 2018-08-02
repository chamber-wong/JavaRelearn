package demo;

public class Demo3 {
}
abstract class Animal{
	public abstract void job();
}
interface DaoMang{
	public void daoMang();
}
class FangBaoDog extends Animal{

	@Override
	public void job() {
		// TODO Auto-generated method stub
		
	}
	
}

class DaoMangDog extends Animal implements DaoMang{

	@Override
	public void job() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void daoMang() {
		// TODO Auto-generated method stub
		
	}
	
}
class SouJiuDog extends Animal{

	@Override
	public void job() {
		// TODO Auto-generated method stub
		
	}
	
}
class Dokey extends Animal implements DaoMang{

	@Override
	public void daoMang() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void job() {
		// TODO Auto-generated method stub
		
	}
	
}