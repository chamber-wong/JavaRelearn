package 查找数组中的指定元素;

import java.util.ArrayList;

public class Contanis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> objArray = new ArrayList<String>();
        ArrayList<String> objArray2 = new ArrayList<String>();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        
        boolean a = objArray.contains("comm1");
        System.out.println(a);
	}

}
