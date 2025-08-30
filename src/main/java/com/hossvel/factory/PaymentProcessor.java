package com.hossvel.factory;

import com.hossvel.model.Payment;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PaymentProcessor {

    @Inject
    PaymentFactoryProvider factoryProvider;

    public void execute(Payment payment) {
        var factory = factoryProvider.getFactory();
        factory.createRepository().save(payment);
        factory.createService().process(payment);
    }
}