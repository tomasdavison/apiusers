package com.cash.users.repositories;

import com.cash.users.entities.Loan;
import org.springframework.data.repository.CrudRepository;

public interface LoanRepository extends CrudRepository<Loan, Integer> {
}
