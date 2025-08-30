package com.hossvel.resource;

import com.hossvel.factory.IPaymentFactory;
import com.hossvel.factory.PaymentFactoryProvider;
import com.hossvel.factory.PaymentProcessor;
import com.hossvel.model.Payment;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Set;

@Path("/payments")
public class PaymentResource {

    @Inject
    PaymentProcessor paymentProcessor;

    @POST
    public Response pay(Payment payment) {

        paymentProcessor.execute(payment);
        return Response.ok("Pago procesado").build();
    }

}