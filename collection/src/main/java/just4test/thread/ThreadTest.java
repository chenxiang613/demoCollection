package just4test.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {

	private volatile AtomicInteger count = new AtomicInteger(0); 
//	private volatile int count = 0;

	public void print(){
		for (int i = 0; i < 10; i++) {
//			System.out.println(Thread.currentThread().getName() + " counter vlaue :" + count++);
//			System.out.println(Thread.currentThread().getName() + count);
			System.out.println(count);
			count.incrementAndGet();
//			count++;
		}
	}
	
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		
		List<Thread> threadList = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			threadList.add(new Thread(t::print,"thread" +i));
		}
		
		threadList.forEach((o)->o.start());
		
		threadList.forEach((o)->{
			try {
				o.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		
		System.err.println("end");
	}
}
