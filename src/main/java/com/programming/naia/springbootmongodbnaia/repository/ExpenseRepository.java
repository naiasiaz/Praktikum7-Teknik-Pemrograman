package com.programming.naia.springbootmongodbnaia.repository;

/**
 * Program  : ExpenseRepository.java
 * NIM      : 221524052
 * Nama     : Naia Siti Az-zahra
 * Tanggal  : 14 Maret 2023
 */

import com.programming.naia.springbootmongodbnaia.model.Expense;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
    @Query("{'name': ?0}")
    Optional<Expense> findByName(String name);
}
