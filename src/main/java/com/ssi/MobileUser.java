package com.ssi;

public class MobileUser {

	public static void main(String[] args) {

		Mobile mobile=new Mobile();
		
		IdeaSIM sim1=new IdeaSIM("9826012345");
		AirtelSIM sim2=new AirtelSIM("9893213456");

		
		//here mobile is dependent on SIM
		//below we are injecting a sim object in mobile object
		//that is what dependency injection is.
		//mobile.setSim(sim1);
		mobile.setSim(sim2);
		
		mobile.doCall();
		mobile.doMessage();

	}

}
