package src.main.java.generics.domain;

public class Account {
	
	private String nsc;
	private String accountNmbr;
	private Double balance;
	
	
	
	public Account(String nsc, String accountNmbr, Double balance){
		this.nsc = nsc;
		this.accountNmbr = accountNmbr;
		this.balance = balance;
	}



	public String getNsc() {
		return nsc;
	}



	public void setNsc(String nsc) {
		this.nsc = nsc;
	}



	public String getAccountNmbr() {
		return accountNmbr;
	}



	public void setAccountNmbr(String accountNmbr) {
		this.accountNmbr = accountNmbr;
	}



	public Double getBalance() {
		return balance;
	}



	public void setBalance(Double balance) {
		this.balance = balance;
	}

}
