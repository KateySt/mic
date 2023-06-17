package org.example.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;

    public void registrationCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .email(request.email())
                .fullName(request.fullName())
                .build();
        //TODO: email checked,valid,
        customerRepository.save(customer);
        //TODO: if fraudster
        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
                "http://FRAUD/api/v1/fraud-check/{customerId}",
                FraudCheckResponse.class,
                customer.getId()
        );
        if (fraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("fraudster");
        }

        //TODO: send notification
    }
}
