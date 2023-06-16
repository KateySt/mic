package org.example.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class FraudCheckService {
    private FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public boolean isFraudulentCustomer(long customerId) {
        fraudCheckHistoryRepository.save(FraudCheckHistory.builder()
                .createAt(LocalDateTime.now())
                .customerId(customerId)
                .isFraudster(false)
                .build());
        return false;
    }

}
