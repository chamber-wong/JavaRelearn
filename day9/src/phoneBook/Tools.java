package phoneBook;

import java.util.Scanner;

/**
 * 联系人管理系统 Tools工具类,串联整个系统的逻辑
 * 
 * @author 弄风
 *
 */
public class Tools {
	static LinkMan[] linkMans = new LinkMan[20];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 获取方法类的唯一实例
		Function function = Function.getFunction();
		// 初始化数组,为系统初始新建3个对象
		function.addLinkMan(new LinkMan("王春博", 18, "男", "18638710336"), linkMans);
		function.addLinkMan(new LinkMan("李立", 32, "男", "18600000000"), linkMans);
		function.addLinkMan(new LinkMan("马文超", 19, "男", "18699999999"), linkMans);

		loop: while (true) {
			pGetMune();
			int index = scanner.nextInt();
			switch (index) {
			case 1:
				pAddLinkMan();
				pScanNane();
				String name = scanner.next();
				pScanAge();
				int age = scanner.nextInt();
				pScanGender();
				String gender = scanner.next();
				pScanNumber();
				String number = scanner.next();

				function.addLinkMan(new LinkMan(name, age, gender, number), linkMans);
				pGoBack(scanner);
				break;
			case 2:
				pDelectLinkMan();
				pScanNane();
				function.deleteLinkManByName(scanner.next(), linkMans);
				pGoBack(scanner);
				break;
			case 3:
				pDelectLinkMan();
				pScanNumber();
				function.deleteLinkManByNumber(scanner.next(), linkMans);
				pGoBack(scanner);
				break;
			case 4:
				pSetLinkMans();
				pScanNane();
				String name1 = scanner.next();
				pSetNumber();
				String number1 = scanner.next();
				function.setLinkMan(name1, number1, linkMans);
				pGoBack(scanner);
				break;
			case 5:
				pSelectLinkMans();
				pScanNane();
				LinkMan linkMan = function.searchLinkMan(scanner.next(), linkMans);
				if (linkMan == null) {
					System.out.println("***您要查询的数据不存在***");
				} else {
					pScanTitle();
					System.out.println(linkMan.toString());
				}
				pGoBack(scanner);
				break;
			case 6:
				function.searchAll(linkMans);
				pGoBack(scanner);
				break;
			case 0:
				System.out.println("Bye~");
				scanner.close();
				break loop;
			default:
				System.out.println("***输入有误,请您重新输入!***");
				break;
			}

		}

	}

	/**
	 * 打印菜单界面
	 */
	public static void pGetMune() {
		System.out.println("+---------------------------------------+");
		System.out.printf("|\t\t%s\t\t|\n", "欢迎来到联系人");
		System.out.println("+---------------------------------------+");
		System.out.println("|\t联系人使用说明\t\t\t|");
		System.out.println("|\t请输入您将要选择的功能前的数字:\t\t|");
		System.out.println("+---------------------------------------+");
		System.out.println("|\t1.添加联系人\t\t\t|");
		System.out.println("|\t2.按姓名删除联系人\t\t\t|");
		System.out.println("|\t3.按联系人删除联系人\t\t\t|");
		System.out.println("|\t4.按姓名修改联系人号码\t\t|");
		System.out.println("|\t5.按姓名查询联系人\t\t\t|");
		System.out.println("|\t6.查询所有联系人\t\t\t|");
		System.out.println("|\t0.输入0退出\t\t\t|");
		System.out.println("+---------------------------------------+");
	}

	/**
	 * 返回上一级的逻辑方法
	 * 
	 * @param scanner
	 *            传输一个系统控制台输入对象
	 */
	public static void pGoBack(Scanner scanner) {
		while (true) {
			System.out.println("--->输入0返回上一级:");
			int index = scanner.nextInt();
			if (index != 0) {
				System.out.println("输入有误!请重新输入");
			} else {
				break;
			}
		}
	}

	/**
	 * 打印添加联系人
	 */
	public static void pAddLinkMan() {
		System.out.println("--->添加联系人:");
	}

	/**
	 * 打印请输入姓名
	 */
	public static void pScanNane() {
		System.out.println("***请输入姓名:***");
	}

	/**
	 * 打印请输入年龄
	 */
	public static void pScanAge() {
		System.out.println("***请输入年龄:***");
	}

	/**
	 * 打印请输入性别
	 */
	public static void pScanGender() {
		System.out.println("***请输入性别:***");
	}

	/**
	 * 打印请输入号码
	 */
	public static void pScanNumber() {
		System.out.println("***请输入号码:***");
	}

	/**
	 * 打印删除联系人
	 */
	public static void pDelectLinkMan() {
		System.out.println("--->删除联系人:");
	}

	/**
	 * 打印修改联系人
	 */
	public static void pSetLinkMans() {
		System.out.println("--->修改联系人:");
	}

	/**
	 * 打印将要修改的号码
	 */
	public static void pSetNumber() {
		System.out.println("***请输入将要修改的号码:***");
	}

	/**
	 * 打印查询联系人
	 */
	public static void pSelectLinkMans() {
		System.out.println("--->查询联系人:");
	}

	/**
	 * 打印输出的标题
	 */
	public static void pScanTitle() {
		System.out.println("姓名\t年龄\t性别\t电话号码");
	}
}
