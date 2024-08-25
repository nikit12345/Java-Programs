package com.example.threading;

public class RunnableEx {
	public static void main(String[] args) {
		runnable r = new runnable();
		Thread t = new Thread(r);
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
class runnable implements Runnable{

	@Override
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