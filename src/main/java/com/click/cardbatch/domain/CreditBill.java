package com.click.cardbatch.domain;

import com.click.cardbatch.type.BillStateType;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreditBill {

    private Long bill_id;
    private Long cardId;
    private Long bill_amount;
    private Long bill_unpaid;
    private BillStateType bill_state;
    private Date bill_date;

}
