package com.careerdevs.springbootmongodbtutorial.controller;


import com.careerdevs.springbootmongodbtutorial.model.Expense;
import com.careerdevs.springbootmongodbtutorial.service.ExpenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public ResponseEntity addExpense(@RequestBody Expense expense){
        expenseService.addExpense(expense);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public  void updateExpense(){}

    @GetMapping
    public ResponseEntity getAllExpense(){
         return ResponseEntity.ok(expenseService.getAllExpense());
    }

    public  void getExpenseByName(){}

    public  void deleteExpense(){}
}
