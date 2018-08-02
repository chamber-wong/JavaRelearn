package cdStore;

import java.util.Scanner;

public class DVDContorller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		CDStore cdStore = CDStore.getCDStore();
		cdStoreWhile : while(true) {
			cdStore.menu();
			switch (scanner.nextInt()) {
			case 1:
				System.out.print("请输入新增的书名:");
				cdStore.addDVD(scanner.next());
				System.out.println("新增成功!");
				cdStore.goBack(scanner);
				break;	
			case 2:
				System.out.println("---->查看DVD\n");
				System.out.println("序号\t状态\t名称\t\t借出日期\t\t借出次数");
				cdStore.checkDVD();
				cdStore.goBack(scanner);
				break;	
			case 3:
				System.out.println("请输入要删除的名字:");
				cdStore.deleteDVD(scanner.next());
				System.out.println("删除成功!");
				cdStore.goBack(scanner);
				break;	
			case 4:
				System.out.println("请输入您想要借的书籍:");
				if(cdStore.loanDVD(scanner.next())) {
					System.out.println("借出成功!");
				}else {
					System.out.println("借出失败!");
				}
				cdStore.goBack(scanner);
				break;	
			case 5:
				System.out.println("请输入您将要归还的名称:");
				int is = cdStore.returnDVD(scanner.next());
				if (is == -1) {
					System.out.println("此书还没有没有借出");
				}else if (is == 0) {
					System.out.println("没有此书");
				}else {
					System.out.println("还书成功!");
				}
				cdStore.goBack(scanner);
				break;	
			case 6:
				System.out.println("Bay~");
				break cdStoreWhile;

			default:
				System.out.println("输入错误!");
				cdStore.goBack(scanner);
				break;
			}
		}
	}

}
