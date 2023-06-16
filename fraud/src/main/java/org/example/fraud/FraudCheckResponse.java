package org.example.fraud;

import lombok.Builder;

@Builder
public record FraudCheckResponse(
        boolean isFraudster
) {
}
