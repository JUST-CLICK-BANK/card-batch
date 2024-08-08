package com.click.cardbatch.mapper;

import com.click.cardbatch.domain.CreditHistory;
import java.util.List;

public interface CreditHistoryMapper {
    List<CreditHistory> findAllByCardId(Long cardId); // todo: need pagination
    List<CreditHistory> findAllByCardIdAndRecentOneMonth(Long cardId);
}
