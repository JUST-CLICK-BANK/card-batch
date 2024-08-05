package com.click.cardbatch.domain.repository;

import com.click.cardbatch.domain.entity.CreditHistory;
import com.click.cardbatch.global.domain.entity.Card;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditHistoryRepository extends JpaRepository<CreditHistory, Long> {

    List<CreditHistory> findAllByCardId(Card card);
}
