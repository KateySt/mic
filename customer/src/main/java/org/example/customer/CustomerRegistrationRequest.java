package org.example.customer;

public record CustomerRegistrationRequest(
        String fullName,
        String email
) {
}
