package com.hossvel.factory;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class PaymentFactoryProvider {

    @ConfigProperty(name = "payment.provider")
    String provider;

    public IPaymentFactory getFactory() {
        return switch (provider.toLowerCase()) {
            case "stripe" -> new StripeFactory();
            case "paypal" -> new PaypalFactory();
            default -> throw new IllegalArgumentException("Proveedor no soportado: " + provider);
        };
    }
}