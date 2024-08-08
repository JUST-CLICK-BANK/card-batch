package com.click.cardbatch.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreditHistory {

    private Long creditId;
    private Long cardId;
    private Date creditPayAt;
    private Long creditAmount;
    private String creditReceiveName;
    private String creditReceiveAccount;
    private Long creditAmountSum;
    private Integer categoryId;
    private String creditMemo;
}
