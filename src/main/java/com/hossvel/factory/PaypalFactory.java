package com.hossvel.factory;

import com.hossvel.repository.IPaymentRepository;
import com.hossvel.repository.PaypalPaymentRepository;
import com.hossvel.service.IPaymentService;
import com.hossvel.service.PaypalPaymentService;

public class PaypalFactory implements IPaymentFactory{
    @Override
    public IPaymentService createService() {
        return new PaypalPaymentService();
    }

    @Override
    public IPaymentRepository createRepository() {
        return new PaypalPaymentRepository();
    }
}
