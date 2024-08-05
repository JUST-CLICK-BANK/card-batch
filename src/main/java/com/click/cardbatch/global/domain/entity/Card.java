package com.click.cardbatch.global.domain.entity;
import com.click.cardbatch.domain.type.CardCheck;
import com.click.cardbatch.domain.type.CardTransportation;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "CARDS")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CARD_ID")
    private Long cardId;

    @Setter
    @Column(name = "CARD_NAME")
    private String cardName;

    @Column(name = "CARD_NUMBER")
    private String cardNumber;

    @Column(name = "CARD_ONE_TIME_LIMIT")
    private Long cardOneTimeLimit;

    @Column(name = "ACCOUNT")
    private String account;

    @Column(name = "CARD_CVC")
    private String cardCVC;

    @Column(name = "CARD_CHECK")
    @Enumerated(EnumType.STRING)
    private CardCheck cardCheck;

    @Column(name ="USER_ID")
    private UUID userId;

    @Column(name = "CARD_MONTH_LIMIT")
    private Long cardMonthLimit;

    @Column(name = "CARD_ANNUAl_FEE")
    private Long cardAnnualFee;

    @Column(name = "CARD_PASSWORD")
    @Setter
    private String cardPassword;

    @Column(name = "CARD_SALT")
    private String cardSalt;

    @Column(name = "CARD_DISABLE")
    @Setter
    private Boolean cardDisable;

    @Column(name = "CARD_CREATED_AT")
    private Date cardCreatedAt;

    @ManyToOne
    @JoinColumn(name = "CARD_PRODUCT_ID")
    private CardProduct cardProduct;

    @Column(name = "CARD_TRANSPORTATION")
    @Enumerated(EnumType.STRING)
    private CardTransportation cardTransportation;


    public void updateCard(String cardPassword,Long cardOneTimeLimit,Long cardMonthLimit,String cardName){
        this.cardPassword = cardPassword;
        this.cardOneTimeLimit = cardOneTimeLimit;
        this.cardMonthLimit = cardMonthLimit;
        this.cardName = cardName;
//        this.cardNumber = cardNumber;
    }

}
