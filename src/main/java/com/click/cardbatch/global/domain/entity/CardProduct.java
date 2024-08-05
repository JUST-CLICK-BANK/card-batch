package com.click.cardbatch.global.domain.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "CARD_PRODUCTS")
public class CardProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CARD_PRODUCT_ID")
    private Long cardProductId;

    @Column(name = "CARD_PRODUCT_NAME")
    private String cardProductName;

    @Column(name = "CARD_ANNUAL_FEE")
    private Long cardAnnualFee;

    @Setter
    @Column(name = "CARD_IMG")
    private String cardImg;

    @Column(name = "CARD_BENEFITS")
    private String cardBenefits;

//    @Column(name = "CARD_BRAND")
//    @Enumerated(EnumType.STRING)
//    private CardBrand cardBrand;


}
