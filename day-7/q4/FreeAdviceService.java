package com.ey.q4;

import java.util.Random;

public class FreeAdviceService {
	volatile	int x;//11  5    9
	String s[];
		public String Free(String...s) {
				this.s = s;
				Random r=new Random();
				String s1=s[r.nextInt(s.length)];
				return s1;
			}
}
