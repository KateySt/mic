package org.example.customer;

import lombok.Builder;

@Builder
public record FraudCheckResponse(
        boolean isFraudster
) {
}
