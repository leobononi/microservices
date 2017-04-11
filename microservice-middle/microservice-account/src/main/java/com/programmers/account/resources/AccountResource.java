package com.programmers.account.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.programmers.account.model.Account;
import com.programmers.account.services.interfaces.AccountService;

@RestController
@RequestMapping(value="/account")
public class AccountResource {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Account> getAccounts(){
		return accountService.getAcounts();
	}
}
