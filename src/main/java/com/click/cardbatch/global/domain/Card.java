package com.click.cardbatch.global.domain;

import com.click.cardbatch.type.CardCheck;
import com.click.cardbatch.type.CardTransportation;
import java.util.Date;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Card {

    private Long cardId;
    private String account;
    private Long cardOneTimeLimit;
    private String cardName;
    private String cardNumber;
    private String cardCVC;
    private CardCheck cardCheck;
    private UUID userId;
    private Long cardMonthLimit;
    private Long cardAnnualFee;
    private String cardPassword;
    private String cardSalt;
    private Boolean cardDisable;
    private Date cardCreatedAt;
    private Long cardProductId;
    private CardTransportation cardTransportation;
    private String cardPaymentDate;

}
