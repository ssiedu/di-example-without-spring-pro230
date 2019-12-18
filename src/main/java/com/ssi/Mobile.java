package com.ssi;

public class Mobile {
	
	private SIM sim;
	
	public SIM getSim() {
		return sim;
	}
	public void setSim(SIM sim) {
		this.sim = sim;
	}
	public void doCall(){
		if(sim==null){
			System.out.println("Please Insert A Sim For Calling");
		}else{
			sim.call();	
		}
		
	}
	public void doMessage(){
		if(sim==null){
			System.out.println("Please Insert A Sim For Messaging");
		}else{
			sim.message();	
		}
		
	}
}
