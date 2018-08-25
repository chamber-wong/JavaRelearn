package com.qianfeng.fansheDemo;

public class Mouse implements USB  {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("开始使用鼠标");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("结束使用鼠标");
	}

}
