package in.devanshu.moneymanager.controller;

import in.devanshu.moneymanager.dto.ExpenseDTO;
import in.devanshu.moneymanager.dto.IncomeDTO;
import in.devanshu.moneymanager.entity.IncomeEntity;
import in.devanshu.moneymanager.service.ExpenseService;
import in.devanshu.moneymanager.service.IncomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1.0/incomes")
public class IncomeController {

    private final IncomeService incomeService;

    @PostMapping
    public ResponseEntity<IncomeDTO> addExpense(@RequestBody IncomeDTO dto){
        IncomeDTO saved = incomeService.addIncome(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping
    public ResponseEntity<List<IncomeDTO>> getExpenses(){
        List<IncomeDTO> expenses = incomeService.getCurrentMonthIncomesForCurrentUser();
        return ResponseEntity.ok(expenses);
    }

    @DeleteMapping("/api/v1.0/{id}")
    public ResponseEntity<Void> deleteIncome(@PathVariable Long id){
        incomeService.deleteIncome(id);
        return ResponseEntity.noContent().build();
    }
}
