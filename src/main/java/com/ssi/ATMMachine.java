package com.ssi;

public class ATMMachine {

	private Card card;
	
	public void setCard(Card card){
		this.card=card;
	}
	
	public String getCardDetails(){
		return card.getAccountNo()+","+card.getCardNo();
	}
	
}
