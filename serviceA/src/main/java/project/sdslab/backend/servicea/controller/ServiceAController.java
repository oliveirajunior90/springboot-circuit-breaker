package project.sdslab.backend.servicea.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/payment")
public class ServiceAController {

    @PostMapping
    public ResponseEntity<String> validate() {
        return ResponseEntity.ok("OK");
    }

}
