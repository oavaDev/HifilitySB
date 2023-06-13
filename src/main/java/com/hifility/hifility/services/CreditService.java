package com.hifility.hifility.services;

import com.hifility.hifility.entities.Credit;
import com.hifility.hifility.repository.CreditRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
@ComponentScan
public class CreditService implements ICreditService{
    private CreditRepository repository;

    public CreditService(CreditRepository repository) {
        this.repository = repository;
    }

    @Override
    public Credit createCredit(Long userId) {
        Credit newCredit = new Credit();
        newCredit.setUser_id(userId);
        newCredit.setAmount(BigDecimal.valueOf(100));
        return repository.save(newCredit);
    }

    @Override
    public BigDecimal findAmountByClientId(Long userId) {
        return repository.findAmountByClientId(userId);
    }
}
