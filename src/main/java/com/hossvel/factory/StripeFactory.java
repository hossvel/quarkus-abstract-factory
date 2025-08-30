package com.hossvel.factory;

import com.hossvel.repository.IPaymentRepository;
import com.hossvel.repository.StripePaymentRepository;
import com.hossvel.service.IPaymentService;
import com.hossvel.service.StripePaymentService;

public class StripeFactory implements IPaymentFactory{
    @Override
    public IPaymentService createService() {
        return new StripePaymentService();
    }

    @Override
    public IPaymentRepository createRepository() {
        return new StripePaymentRepository();
    }
}
