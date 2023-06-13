package com.hifility.hifility.services;

import com.hifility.hifility.entities.Credit;

import java.math.BigDecimal;

public interface ICreditService {
    Credit createCredit (Long userId);

    BigDecimal findAmountByClientId(Long userId);
}
