package wang.chamber.test;

import wang.chamber.model.URLParser;

public class Main {

	public static void main(String[] args) {
		/**
		 * https://www.google.com:80/search?newwindow=1&source=hp
		 * www.google.com:8080/search?newwindow=1&source=hp
		 * wwwgggggom/search?newwindow=1&source=hp
		 * 
		 * 协议,端口号,参数,资源地址都可以缺省
		 */
		URLParser urlParser = new URLParser("https://www.google.com:80/search?newwindow=1&source=hp");
		System.out.println(urlParser.toString());
		
		System.out.println("5"+2);
//		System.out.println("协议名为:\t"+urlParser.getProtocol());
//		System.out.println("域名为:\t"+urlParser.getHost());
//		System.out.println("端口号为:\t"+urlParser.getPort());
//		System.out.println("资源路径为:\t"+urlParser.getSourcePath());
//		System.out.println("参数为:\t"+urlParser.getSearch());
	}

}
