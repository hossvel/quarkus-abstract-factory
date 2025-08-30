package com.hossvel.repository;

import com.hossvel.model.Payment;

public interface IPaymentRepository {
    void save(Payment payment);
}