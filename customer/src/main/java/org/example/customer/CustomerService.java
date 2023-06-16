package org.example.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registrationCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .email(request.email())
                .fullName(request.fullName())
                .build();
        //TODO: email checked,valid
        customerRepository.save(customer);
    }
}
