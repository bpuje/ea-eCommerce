package com.cs544.accountservice.accountservice.serviceImpl;

import com.cs544.accountservice.accountservice.model.Account;
import com.cs544.accountservice.accountservice.repository.AccountRepository;
import com.cs544.accountservice.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
}
