package com.hossvel.service;

import com.hossvel.model.Payment;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StripePaymentService implements IPaymentService {
    @Override
    public void process(Payment payment) {
        System.out.println("Procesando pago con Stripe: $" + payment.amount);
    }
}