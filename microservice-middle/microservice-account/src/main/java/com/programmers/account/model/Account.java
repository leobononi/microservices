package com.programmers.account.model;

import java.math.*;

import org.eclipse.jetty.server.Authentication.User;

public class Account {

	private String name;
	private BigDecimal amount;
	
	public Account() {}
	
	public Account(String name, BigDecimal amount) {
		this.name = name;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
