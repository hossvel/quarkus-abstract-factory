package com.hossvel.factory;

import com.hossvel.repository.IPaymentRepository;
import com.hossvel.service.IPaymentService;

public interface IPaymentFactory {

        IPaymentService createService();
        IPaymentRepository createRepository();
    }

