package org.emsi.digitalbankingbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.emsi.digitalbankingbackend.enums.OperationType;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data@AllArgsConstructor@NoArgsConstructor

public class AccountOpperation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    @ManyToOne
    private BankAccount bankAccount;
}
