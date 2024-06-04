package com.ey.method2;

public class Activity1 {
	private String string1;
	private String string2;
	private String string3;
	public Activity1(String string1, String string2, String string3) {
		super();
		this.string1 = string1;
		this.string2 = string2;
		this.string3 = string3;
	}
	public String getString1() {
		return string1;
	}
	public void setString1(String string1) {
		this.string1 = string1;
	}
	public String getString2() {
		return string2;
	}
	public void setString2(String string2) {
		this.string2 = string2;
	}
	public String getString3() {
		return string3;
	}
	public void setString3(String string3) {
		this.string3 = string3;
	}
	@Override
	public String toString() {
		return "Activity1 [string1=" + string1 + ", string2=" + string2 + ", string3=" + string3 + "]";
	}
	
	

}
