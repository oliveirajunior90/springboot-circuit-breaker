package project.sdslab.backend.resilience.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.sdslab.backend.resilience.service.PaymentService;

@RestController
@RequestMapping(value="/api/v1/test")
public class Controller {

    @Autowired
    PaymentService paymentService;

    @PostMapping
    public String createOrder() {

        return paymentService.validate();

    }


}
