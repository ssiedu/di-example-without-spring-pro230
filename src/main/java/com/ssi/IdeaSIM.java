package com.ssi;

public class IdeaSIM implements SIM {
	
	private String mobileNo;
	
	public IdeaSIM(String mobileNo){
		this.mobileNo=mobileNo;
	}
	
	public void call(){
		System.out.println("Calling Using Idea SIM "+mobileNo);
	}
	public void message(){
		System.out.println("Messaging Using Idea SIM "+mobileNo);
	}
}
