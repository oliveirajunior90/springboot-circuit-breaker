package project.sdslab.backend.resilience.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.sdslab.backend.resilience.service.FallbackPaymentService;
import project.sdslab.backend.resilience.service.PaymentService;

@RestController
@RequestMapping(value="/api/v1/test")
public class Controller {

    @Autowired
    CircuitBreakerFactory circuitBreakerFactory;

    @Autowired
    FallbackPaymentService fallbackPaymentService;

    @Autowired
    PaymentService paymentService;

    @PostMapping
    public String createOrder() {
        CircuitBreaker circuitBreaker = circuitBreakerFactory.create("circuitbreaker");

        return
                circuitBreaker.run(
                () -> paymentService.validate(),
                throwable -> fallbackPaymentService.validate()
        );

    }



}
