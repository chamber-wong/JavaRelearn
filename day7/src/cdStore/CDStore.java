package cdStore;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CDStore {
	private static CDStore cdStore = null;
	ArrayList<DVDBean> list = new ArrayList<>();
	
	private CDStore() {
		DVDBean dvd1 = new DVDBean("风声鹤唳", 1, 0);
		DVDBean dvd2 = new DVDBean("乱世佳人", 1, 0);
		DVDBean dvd3 = new DVDBean("罗马假日", 1, 0);
		list.add(dvd1);
		list.add(dvd2);
		list.add(dvd3);
		
	}
	public static CDStore getCDStore() {
		if (cdStore == null) {
			cdStore = new CDStore();
		}
		return cdStore;
	}
	/**
	 * 菜单
	 */
	public void menu() {
		System.out.println("欢迎使用迷你DVD管理器!");
		System.out.println("----------------------------");
		System.out.println("1. 新增DVD");
		System.out.println("2. 查看DVD");
		System.out.println("3. 删除DVD");
		System.out.println("4. 借出DVD");
		System.out.println("5. 归还DVD");
		System.out.println("6. 退出DVD");
		System.out.println("----------------------------");
		System.out.print("请输入:");
	}
	/**
	 * 新增DVD
	 * @param name
	 */
	public void addDVD(String name) {
		list.add(new DVDBean(name, 1, 0));
	}
	/**
	 * 查看DVD
	 */
	public void checkDVD() {
		int i = 1;
		for (DVDBean dvdBean : list) {
			System.out.print(i+"\t");
			System.out.println(dvdBean.toString());
			i++;
		}
	}
	/**
	 * 删除DVD
	 * @param name
	 */
	public void deleteDVD(String name) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
				break;
			}
		}
	}
	/**
	 * 借出DVD
	 * @param name
	 * @return
	 */
	public boolean loanDVD(String name) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				if (list.get(i).getState() == 1) {
					list.get(i).setState(0);
					list.get(i).setDate(new Date().getDate());
					list.get(i).setCount(list.get(i).getCount() + 1);
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * 归还DVD
	 * @param name
	 * @return 1代表还书成功,0代表没有此书,-1代表没有借出
	 */
	public int returnDVD(String name) {
		int money;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				if(list.get(i).getState() == 0) {
					list.get(i).setState(1);
					money = (new Date().getDate() - list.get(i).getDate())*1;
					list.get(i).setDate(0);
					System.out.println("您需要支付"+ money +"元");
					return 1;
				}else if (list.get(i).getState() == 1) {
					return -1;
				}
			}
		}
		return 0;
	}
	/**
	 * 退出DVD
	 */
	public void exitDVD() {
		
	}
	public void goBack(Scanner scanner) {
		while(true) {
			System.out.println("输入0返回上级");
			if(scanner.nextInt() == 0) {
				break;
			}
		}
		
	}
	
	

}
