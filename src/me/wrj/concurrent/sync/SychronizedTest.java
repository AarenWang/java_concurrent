package me.wrj.concurrent.sync;


public class SychronizedTest {

	public static final Object mutex = new Object();
	
	public  void test1(){
		synchronized (mutex) {
			System.out.println("test1");
		}
		
	}
}
