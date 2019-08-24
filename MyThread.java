package threads;

import java.time.LocalTime;

public class MyThread extends Thread {

	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		t1.setName("MyThread");
		System.out.println("Current Name : " + t1.getName());
		System.out.println("Current Time : " + LocalTime.now());
		try {
			System.out.println("******** Thread sleep starts for 10 seconds ********");
			Thread.sleep(10000);
			System.out.println("******** Thread sleep ends after 10 seconds ********");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Current Time now : " + LocalTime.now());
	}

}
