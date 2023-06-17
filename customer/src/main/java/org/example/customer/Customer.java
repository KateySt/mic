package org.example.customer;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @SequenceGenerator(
            name = "customer_id",
            sequenceName = "customer_id"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id"
    )
    private Long id;
    private String fullName;
    private String email;
}
