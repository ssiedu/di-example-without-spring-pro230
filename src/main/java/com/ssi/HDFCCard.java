package com.ssi;

public class HDFCCard implements Card {

	private String cardNo, accountNo;
	
	public HDFCCard(String cardNo, String accountNo) {
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
