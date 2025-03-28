package project.sdslab.backend.resilience.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FallbackPaymentService
{
    public String validate() {
        return "ok service B";
    }
}
