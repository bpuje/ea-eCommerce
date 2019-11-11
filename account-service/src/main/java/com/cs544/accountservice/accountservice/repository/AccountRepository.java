package com.cs544.accountservice.accountservice.repository;

import com.cs544.accountservice.accountservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
