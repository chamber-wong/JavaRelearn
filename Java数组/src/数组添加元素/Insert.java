package 数组添加元素;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;

/**
 * 使用sort()方法对Java数组进行排序
 * 及如何使用 insertElement () 方法向数组插入元素
 * 定义了 printArray() 方法来打印数组：
 * @author 弄风
 *
 */
public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(array);
		printArray("排列后的数组为", array);
		array = insertElement(array, 100, 8) ;
		printArray("插入值后的数组为:", array);
	}
	private static void printArray(String message, int array[]) {
        System.out.println(message
        + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if(i != 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
	}
	/**
	 * 在数组内添加元素
	 * @param original 原始数组
	 * @param element 将要插入的元素
	 * @param index 插入的位置
	 * @return 返回新的数组
	 */
	private static int[] insertElement(int original[],int element, int index) {
		int length = original.length;
		int destination[] = new int[length + 1];
		System.arraycopy(original, 0, destination, 0, index);
		destination[index] = element;
		System.arraycopy(original, index, destination, index + 1, length - index);
		return destination;
	}
}
