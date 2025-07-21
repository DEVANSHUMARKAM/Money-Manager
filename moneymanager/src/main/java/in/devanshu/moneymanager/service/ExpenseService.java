package in.devanshu.moneymanager.service;

import in.devanshu.moneymanager.dto.ExpenseDTO;
import in.devanshu.moneymanager.entity.CategoryEntity;
import in.devanshu.moneymanager.entity.ExpenseEntity;
import in.devanshu.moneymanager.entity.ProfileEntity;
import in.devanshu.moneymanager.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final CategoryService categoryService;
    private final ExpenseRepository expenseRepository;

    //helper method
    private ExpenseEntity toEntity(ExpenseDTO dto, ProfileEntity profile, CategoryEntity category){
        return ExpenseEntity.builder()
                .name(dto.getName())
                .icon(dto.getIcon())
                .amount(dto.getAmount())
                .date(dto.getDate())
                .profile(profile)
                .category(category)
                .build();
    }


}
