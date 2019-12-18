package com.ssi;

public class ATMMachineUser {

	public static void main(String[] args) {

		SBICard card1=new SBICard("SBCNO1234","SBACNO3345");
		HDFCCard card2=new HDFCCard("HDFCCNO4454","HDFCACNO655345");
		
		ATMMachine machine=new ATMMachine();
		//machine.setCard(card1);
		machine.setCard(card2);
		
		String details=machine.getCardDetails();
		System.out.println(details);

	}

}
