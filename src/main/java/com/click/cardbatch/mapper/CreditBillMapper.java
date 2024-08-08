package com.click.cardbatch.mapper;

import com.click.cardbatch.domain.CreditBill;
import java.util.List;
import java.util.Map;

public interface CreditBillMapper {
    List<CreditBill> findAllByStateISWaitingPayment();
    List<CreditBill> findAllByStateIsNonPayment();
    List<CreditBill> findAllByCardId(Long cardId);
    // todo: apply mybatis foreach
    int insertAll(List<Map<String, String>> bills);
    int updateStateAndUnpaidAmount(Map<String, String> updateBill);
    int updateAllStateAndUnpaidAmount(List<Map<String, String>> updateBills);
}
