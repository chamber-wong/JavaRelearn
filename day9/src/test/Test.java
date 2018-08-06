package test;

import java.util.Arrays;

import phoneBook.LinkMan;

public class Test {
	public static void main(String[] args) {
		String[] oldArray = {"a","a","a","a","a"};
		String[] newArray = {null,"b",null,"b"};
		copyArray(oldArray, newArray);
		System.out.println(Arrays.toString(newArray));
	}
	public static void copyArray(String[] oldArray , String[] newArray) {
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = oldArray[i];
		}
	}
}

