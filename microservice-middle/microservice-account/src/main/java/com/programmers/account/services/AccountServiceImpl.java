package com.programmers.account.services;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.programmers.account.model.Account;
import com.programmers.account.services.interfaces.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public List<Account> getAcounts() {
		Account act1 = new Account("Act1", BigDecimal.TEN);
		Account act2 = new Account("Act2", BigDecimal.valueOf(123));
		
		return Arrays.asList(act1, act2);
	}

	
}
