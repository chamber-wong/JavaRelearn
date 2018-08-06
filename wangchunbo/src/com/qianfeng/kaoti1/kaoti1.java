package com.qianfeng.kaoti1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class kaoti1 {
	public static void main(String[] args) {
		// 随机生成10个从2到222之间的数字
		int[] random = getRandomwangchunbo();
		System.out.println(Arrays.toString(random));
		//第二题
		setFilewangchunbo(random);
		//第三题
		sortwangchunbo(random);
		System.out.println(Arrays.toString(random));
		//第四题
		int[] arrs = {11,22,1,33,1,1,44,55,66,1,77,1,1,88};
		int[] newArray = removeOnewangchunbo(arrs);
		System.out.println("新数组为:"+Arrays.toString(newArray));
		
	}

	/**
	 * 随机生成10个从2到222之间的数字(大于等于2小于等于222)，将生成的随机数存储在整型数组中(不考虑重复)
	 * 
	 * @return
	 */
	public static int[] getRandomwangchunbo() {
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 200 + 22);
		}

		return nums;
	}

	/**
	 * 数组内容写入到当前项目下的randomArray.txt文件中，数字之间使用”-”隔开，并且在文件的结尾追加上”张三-2015/11/12
	 * 21:47:20”
	 * 
	 * @param nums
	 */
	public static void setFilewangchunbo(int[] nums) {
		String string = "";
		for (int i = 0; i < nums.length; i++) {
			if (i != nums.length - 1) {
				string += nums[i] + "-";
			} else {
				string += nums[i];
			}
		}
		string += "\r\n" + "王春博-" + getSimpleDate();
		byte[] bs = string.getBytes();

		OutputStream os;
		try {
			File file = new File("G:\\JavaSE\\qianfeng\\wangchunbo\\src\\com\\qianfeng\\kaoti1\\RandomArray.txt");
			os = new FileOutputStream(file);
			os.write(bs);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//获取当前时间,并格式化输出
	public static String getSimpleDate() {
		Date date = new Date();
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return sFormat.format(date);
	}
	//冒泡排序
	public static void sortwangchunbo(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					arr[j] = arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];
					arr[j] = arr[j] ^ arr[j+1];
				}
			}
		}
	}
	//删除数组中的1
	public static int[] removeOnewangchunbo(int[] arrs) {
		int index = 0;
		for (int i = 0; i < arrs.length; i++) {
			if (arrs[i] != 1) {
				index++;
			}
		}
		int[] newArray = new int[index];
		int i = 0;
		for (int arr : arrs) {
			if (arr != 1) {
				newArray[i] = arr;
				i++;
			}
		}
		return newArray;
	}
}
