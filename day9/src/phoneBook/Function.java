package phoneBook;
/**
 * 联系人管理系统
 * Function系统方法类
 * @author 弄风
 *
 */
public class Function implements Operation {
	private static Function function = null;
	
	private Function() {
		
		
	}
	
	public static Function getFunction() {
		if (function==null) {
			function = new Function();
		}
		return function;
	}

	public LinkMan[] addLinkMan(LinkMan linkMan, LinkMan[] linkMans) {
		boolean b = true;
		for (int i = 0; i < linkMans.length; i++) {
			if (linkMans[i]==null) {
				linkMans[i] = linkMan;
				b = false;
				break;
			}
		}
		if (b) {
			System.out.println("***数组已满,请删除后再添加!***");
		}else {
			System.out.println("***添加成功!***");
		}
		
		return linkMans;
	}

	public LinkMan[] deleteLinkManByName(String name, LinkMan[] linkMans) {
		boolean b = true;
		for (int i = 0; i < linkMans.length; i++) {
			if(linkMans[i] != null) {
				if(linkMans[i].getName().equals(name)) {
					linkMans[i] = null;
					b = false;
					break;
				}
			}
		}
		if (b) {
			System.out.println("***您所要删除的数据不存在!***");
		}else {
			System.out.println("***删除成功!***");
		}
		return linkMans;
	}

	public LinkMan[] deleteLinkManByNumber(String number, LinkMan[] linkMans) {
		boolean b = true;
		for (int i = 0; i < linkMans.length; i++) {
			if (linkMans[i] != null) {
				if (linkMans[i].getNumber().equals(number)) {
					linkMans[i] = null;
					b = false;
					break;
				}
			}
		}
		if (b) {
			System.out.println("***您所要删除的数据不存在!***");
		}else {
			System.out.println("***删除成功!***");
		}
		return linkMans;
	}

	public LinkMan[] setLinkMan(String name, String number, LinkMan[] linkMans) {
		boolean b = true;
		for (int i = 0; i < linkMans.length; i++) {
			if(linkMans[i] != null) {
				if (linkMans[i].getName().equals(name)) {
					linkMans[i].setNumber(number);
					b = false;
					break;
				}
			}
		}
		if (b) {
			System.out.println("***您所要修改的数据不存在!***");
		}else {
			System.out.println("***修改成功!***");
		}
		return linkMans;
	}

	public LinkMan searchLinkMan(String name, LinkMan[] linkMans) {
		LinkMan linkMan = null;
		for (int i = 0; i < linkMans.length; i++) {
			if(linkMans[i] != null) {
				if (linkMans[i].getName().equals(name)) {
					linkMan = linkMans[i];
					break;
				}
			}
		}
		return linkMan;
	}

	public void searchAll(LinkMan[] linkMans) {
		Tools.pScanTitle();
		for (int i = 0; i < linkMans.length; i++) {
			if(linkMans[i] != null) {
				System.out.println(linkMans[i].toString());
			}
		}
	}

}
