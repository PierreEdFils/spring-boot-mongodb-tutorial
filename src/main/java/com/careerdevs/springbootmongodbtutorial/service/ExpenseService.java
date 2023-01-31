package com.careerdevs.springbootmongodbtutorial.service;

import com.careerdevs.springbootmongodbtutorial.model.Expense;
import com.careerdevs.springbootmongodbtutorial.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository  expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }


    public  void addExpense( Expense expense){
        expenseRepository.insert(expense);
    }

    public  void updateExpense(){}

    public List<Expense> getAllExpense(){
         return expenseRepository.findAll();
    }

    public  void getExpenseByName(){}

    public  void deleteExpense(){}
}
