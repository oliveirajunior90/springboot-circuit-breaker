package project.sdslab.backend.resilience.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class FallbackPaymentService
{
    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${spring.external.serviceB.url}")
    private String apiUrl;

    public String getApiUrl() {
        return apiUrl;
    }

    public String validate() {
        return restTemplate.postForEntity(getApiUrl() + "/api/v1/payment", null, String.class).getBody();
    }
}
