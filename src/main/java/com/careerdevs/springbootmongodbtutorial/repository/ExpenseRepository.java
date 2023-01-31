package com.careerdevs.springbootmongodbtutorial.repository;

import com.careerdevs.springbootmongodbtutorial.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
}
