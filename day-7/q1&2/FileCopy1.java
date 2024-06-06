package com.ey.q1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy1 implements Runnable{

	private final Object lock;
	
	public FileCopy1(Object lock) {
		this.lock=lock;
	}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (lock) {
				try {
					FileInputStream f1=new FileInputStream("D:\\java assignments\\Results dat-7\\Image1.txt");
					FileOutputStream f2=new FileOutputStream("D:\\\\java assignments\\\\Results dat-7\\\\temp.txt");
					int k;
					while((k=f1.read())!=-1) {
						f2.write(k);
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
					lock.notify();
					
				}
			}
		}


}

	
