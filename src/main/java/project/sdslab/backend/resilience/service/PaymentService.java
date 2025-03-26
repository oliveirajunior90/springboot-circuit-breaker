package project.sdslab.backend.resilience.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentService {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${spring.external.serviceA.url}")
    private String apiUrl;

    public String getApiUrl() {
        return apiUrl;
    }

    public String validate() {
        return restTemplate.postForEntity(getApiUrl() + "/api/v1/payment", null, String.class).getBody();
    }
}
