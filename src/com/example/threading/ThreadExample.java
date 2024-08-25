package com.example.threading;

public class ThreadExample {
	public static void main(String[] args) {
		thread t = new thread();
		t.start();
		
		for(int i=0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class thread extends Thread{
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}