package com.click.cardbatch.global.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CardProduct {

    private Long cardProductId;
    private Long cardAnnualFee;
    private String cardProductName;
    private String cardImg;
    private String cardBenefits;

}
