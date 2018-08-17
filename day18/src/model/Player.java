package model;

import java.util.ArrayList;
/**
 * 玩家类
 * @author 弄风
 *
 */
public class Player {
	private ArrayList<String> list = new ArrayList<>();
	// 玩家的地主属性
	private boolean landlord;

	/**
	 * 得到一张牌
	 * 
	 * @param poker
	 */
	public void addPoker(String poker) {
		list.add(poker);
	}

	/**
	 * 设置地主
	 * @param landlord
	 */
	public void setLandlord(boolean landlord) {
		this.landlord = landlord;
	}

	/**
	 * 重写toString方法
	 */
	public String toString() {
		String string = "";
		if (landlord) {
			string += "<<---地主的牌为: --->>\r\n";
		} else {
			string += "[[~~~ 农民的牌为:~~~]]\r\n";
		}
		string += list.toString();
		return string;
	}

}
