package just4test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ParseException {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "chenxiang");
		map.put(2, "liuxiang");
		map.put(3, "jixiang");
		
		for (Integer i : map.keySet()) {
			System.out.println(i);
			System.out.println(map.get(i));
		}
		
		for (String i : map.values()) {
			System.out.println(i);
		}
//		System.out.println(map.get(1));
		
//		ArrayList<String> list = new ArrayList<>();
//		list.add("aa");
//		Object a = new Object();
//		System.out.println(a.hashCode());
		
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println(simpleDateFormat.parse("2018-09-06 10:16:34"));
	}
}
