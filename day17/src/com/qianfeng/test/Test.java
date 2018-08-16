//package com.qianfeng.test;
//
//import java.awt.event.MouseWheelEvent;
//
//import javax.sound.midi.Soundbank;
//
///*
// * 实现等待操作
// */
//public class Test {
//	public static void main(String[] args) {
//		Num num = new Num();
//		
//		SleepThread sleepThread = new SleepThread(num);
//		sleepThread.start();
//		
//		synchronized (num) {
//				try {
//					num.wait();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		}
//		System.out.println("睡觉执行完了");
//		System.out.println("线程锁以外的东西!!");
//	}
//}
//class Num{
//}
//class SleepThread extends Thread{
//	Num num;
//	public SleepThread(Num num) {
//		this.num = num;
//	}
//	public void run() {
//		synchronized (num) {
//			for (int i = 1; i <= 10; i++) {
//				try {
//					this.sleep(300);
//					System.out.println("睡了第"+i + "个0.3秒");
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			num.notify();
//		}
//		
//	}
//}