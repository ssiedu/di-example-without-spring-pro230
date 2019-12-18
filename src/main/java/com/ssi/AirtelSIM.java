package com.ssi;

public class AirtelSIM implements SIM {

	private String mobileNo;
	
	public AirtelSIM(String mobileNo){
		this.mobileNo=mobileNo;
	}
	
	public void call(){
		System.out.println("Calling Using Airtel SIM "+mobileNo);
	}
	public void message(){
		System.out.println("Messaging Using Airtel SIM "+mobileNo);
	}
}
