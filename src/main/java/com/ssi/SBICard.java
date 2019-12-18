package com.ssi;

public class SBICard implements Card {

	private String cardNo, accountNo;
	
	
	
	public SBICard(String cardNo, String accountNo) {
		super();
		this.cardNo = cardNo;
		this.accountNo = accountNo;
	}

	public String getCardNo() {
		return cardNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

}
