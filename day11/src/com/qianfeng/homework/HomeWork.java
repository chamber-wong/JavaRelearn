package com.qianfeng.homework;

public class HomeWork {

	public static void main(String[] args){
		String url = "https://www.google.com/search?newwindow=1&ei=SUFqW6mFMrjB0PEPha-jwAg&q=Java%E5%AE%9E%E7%8E%B0%E5%9F%9F%E5%90%8D%E5%90%88%E6%A0%BC%E6%80%A7%E6%A3%80%E6%9F%A5&oq=Java%E5%AE%9E%E7%8E%B0%E5%9F%9F%E5%90%8D%E5%90%88%E6%A0%BC%E6%80%A7%E6%A3%80%E6%9F%A5&gs_l=psy-ab.3...2916342.2923038.0.2923373.37.25.0.0.0.0.444.3146.2-2j5j2.9.0..2..0...1.1j4.64.psy-ab..30.3.973...0j0i203k1j35i39k1j0i12k1.0.JqalqsqqF8w";
//		String[] strings = splitString(url);
//		System.out.println(Arrays.toString(strings));
//
//		URL url2 = new URL("https://blog.csdn.net/xcwll_sina/article/details/46444477");
//		url2.getHost();
//		
		StringBuilder sBuilder = new StringBuilder(url);
//		System.out.println(sBuilder.substring(0,7));
//		System.out.println(sBuilder);
//		sBuilder.delete(0, sBuilder.indexOf("//") + 2);
//		System.out.println(sBuilder);
//		System.out.println(sBuilder.indexOf("/"));
//		String h = sBuilder.substring(0, sBuilder.indexOf("/"));
//		System.out.println(h);
//		
		URLParser url3 = new URLParser(url);
		String protocol = url3.getProtocol();
		String host = url3.getHost();
		System.out.println(protocol);
		System.out.println(host);
		System.out.println(url3.getPort());
		System.out.println(url3.getSourcePath());
		System.out.println(url3.getSearch());
		System.out.println(url3.toString());
	}

	
}
