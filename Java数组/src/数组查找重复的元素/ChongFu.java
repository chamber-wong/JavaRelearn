package 数组查找重复的元素;

import java.util.ArrayList;

public class ChongFu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
		System.out.println("重复的数据为:"+ repetition(my_array));
		
	}
	public static ArrayList repetition(int[] arrs) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arrs.length-1; i++)
        {
            for (int j = i+1; j < arrs.length; j++)
            {
                if ((arrs[i] == arrs[j]) && (i != j))
                {
                	list.add(arrs[j]);
                }
             }
        }
		return list;
	}

}
