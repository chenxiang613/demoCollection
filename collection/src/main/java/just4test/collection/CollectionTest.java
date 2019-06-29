package just4test.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.LinkedList;

import just4test.pojo.Person;

public class CollectionTest {
	private Reader in;
	
	public static void main(String args[]) {
		testLinkedList();
		HashMap<String,Person> map = new HashMap<String, Person>();
	}
	 
	
	private static void testLinkedList()  {
		LinkedList<Person> linkedList = new LinkedList<Person>();
		for (int i = 0; i < 10; i++) {
			linkedList.add(new Person(i, i + "test", "male"));
		}
		
		/**
		 * poll就是取队列的对头元素，每poll一次队列，队列元素就少一个
		 */
//		int size = linkedList.size();
//		for (int i = 0; i < size; i++) {
//			System.out.println(linkedList.peek().toString());
//			System.out.println(linkedList.poll().toString());
//		}
		int b = 2;
		int a = 12;
		System.out.println(a ^ b);
		
		/**
		 * poll就是取队列的对头元素，每poll一次队列，队列元素就少一个
		 */
//		int size = linkedList.size();
//		for (int i = 0; i < size; i++) {
//			System.out.println(linkedList.peek().toString());
//		}
		
	}
        
}