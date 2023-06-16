package org.example.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public void registrationCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .email(request.email())
                .fullName(request.fullName())
                .build();
        //TODO: email checked,valid
        customerRepository.save(customer);
    }
}
