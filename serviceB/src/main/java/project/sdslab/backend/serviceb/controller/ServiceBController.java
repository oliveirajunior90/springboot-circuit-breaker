package project.sdslab.backend.serviceb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/payment")
public class ServiceBController {

    @GetMapping
    public ResponseEntity<String> validate() {



        return ResponseEntity.ok("OK");
    }

}
