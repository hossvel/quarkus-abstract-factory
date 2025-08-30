package com.hossvel.repository;

import com.hossvel.model.Payment;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PaypalPaymentRepository implements IPaymentRepository {
    @Override
    public void save(Payment payment) {
        System.out.println("Guardando pago en PayPal DB");
    }
}