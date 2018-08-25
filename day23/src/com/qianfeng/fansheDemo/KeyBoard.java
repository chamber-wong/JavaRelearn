package com.qianfeng.fansheDemo;

public class KeyBoard implements USB{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("开始使用键盘");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关闭键盘");
	}

}
