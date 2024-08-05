package com.click.cardbatch.global.domain.repository;

import com.click.cardbatch.global.domain.entity.Card;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CardRepository extends JpaRepository<Card, Long> {
    Optional<Card> findByCardId(long cardId);
//    Optional<Card> findBy
    Optional<Card> findByCardNumber(String cardNumber);
    Optional<Card>findByUserIdAndCardNumber(UUID userId, String cardNumber);
    @Query("SELECT c FROM Card c JOIN FETCH c.cardProduct cp WHERE c.cardId = :cardId")
    Optional<Card> findCardCardProductByCardId(@Param("cardId") long cardId);

    List<Card> findByUserId(UUID userId);

}
