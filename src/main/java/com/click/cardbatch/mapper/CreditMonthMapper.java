package com.click.cardbatch.mapper;

public interface CreditMonthMapper {
    int updateAmountByCardId(Long cardId);
    int updateAllAmountToZero();
}
