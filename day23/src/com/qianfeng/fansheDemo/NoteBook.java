package com.qianfeng.fansheDemo;

public class NoteBook {
	public void run() {
	System.out.println("开始运行笔记本");
}
	
	//使用鼠标   使用键盘
	public void useUSB(USB usb) {
		usb.open();
		usb.close();
	}
	
}
