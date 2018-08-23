package com.qianfeng.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * IP地址:
 * java将IP地址面向对象了---InetAddress
 */
public class Demo2 {
	public static void main(String[] args) throws UnknownHostException {
		//获取自己的主机
		InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println(inetAddress.getHostName());//USER-85BEF3RHOD
		System.out.println(inetAddress.getHostAddress());//10.0.156.102
		//获取网络上任意一台主机
		InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");//根据域名
		System.out.println(inetAddress2.getHostName());//www.baidu.com
		System.out.println(inetAddress2.getHostAddress());//220.181.112.244
	}
}
