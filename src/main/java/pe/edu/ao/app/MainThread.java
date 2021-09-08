package pe.edu.ao.app;

import java.util.Vector;

class Counter{
	int count;
	public synchronized void increment() {
		count++;
	}
}

public class MainThread {

	public static void main(String[] args) throws Exception{
		Counter c = new Counter();
		c.increment();
//		System.out.println(c.count);
		//ArrayList<Integer>v = new ArrayList<Integer>();
		Vector<Integer>v = new Vector<Integer>();
		
		Thread t1 = new Thread(new Runnable()
		{	
			@Override
			public void run() {
				for (int i=0;i<1000;i++) {
					//c.increment();
					v.add(1);
				}		
			}
		});
		
		Thread t2 = new Thread(new Runnable()
		{	
			@Override
			public void run() {
				
				for (int i=0;i<1000;i++) {
					if (v.size()>=0) {
						v.add(1);
					}
				}		
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		///System.out.println(c.count);
		System.out.println((int)v.size());

	}

}
