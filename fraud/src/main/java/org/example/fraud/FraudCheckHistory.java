package org.example.fraud;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Entity
public class FraudCheckHistory {
    @Id
    @SequenceGenerator(
            name = "fraud_id",
            sequenceName = "fraud_id"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "fraud_id"
    )
    private Long id;
    private Long customerId;
    private Boolean isFraudster;
    private LocalDateTime createAt;
}
