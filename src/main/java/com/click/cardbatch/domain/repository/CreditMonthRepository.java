package com.click.cardbatch.domain.repository;

import com.click.cardbatch.domain.entity.CreditMonth;
import com.click.cardbatch.global.domain.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditMonthRepository extends JpaRepository<CreditMonth, Card> {

}
