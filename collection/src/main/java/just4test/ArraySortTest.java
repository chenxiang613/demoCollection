package just4test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 简单数组的重新排序
 *
 */
public class ArraySortTest {
	public static void main(String[] args) {
		int[] intArray = {1,0,19,7,9,12};
		Arrays.sort(intArray);
		for (int i : intArray) {
			System.out.println(i);
		}
	}

}
