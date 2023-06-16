package org.example.fraud;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/fraud-check")
public class FraudController {
    private FraudCheckService fraudCheckService;
    @PostMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") long customerId){
        return FraudCheckResponse.builder()
                .isFraudster(fraudCheckService.isFraudulentCustomer(customerId))
                .build();
    }
}