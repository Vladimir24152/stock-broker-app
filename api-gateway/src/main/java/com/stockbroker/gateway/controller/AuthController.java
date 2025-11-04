//package com.stockbroker.gateway.controller;
//
//import lombok.Setter;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.*;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Setter
//@RestController
//public class AuthController {
//
//
//    @Value("${spring.security.oauth2.client.registration.keycloak.client-id}")
//    private String clientId;
//
//    @Value("${spring.security.oauth2.client.registration.keycloak.client-secret}")
//    private String clientSecret;
//
//    @Value("${app.auth.resource-url}")
//    private String tokenUrl;
//
//    @Value("${app.auth.grant-type}")
//    private String grantType;
//
//    private final RestTemplate restTemplate = new RestTemplate();
//
//    @PostMapping("/auth")
//    public String auth(@RequestBody AuthDTO authDTO){
//        var headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//
//        var body = "client_id=" + clientId +
//                    "&client_secret=" + clientSecret +
//                    "&grant_type=" + grantType +
//                    "&username=" + authDTO.login() +
//                    "&username=" + authDTO.password();
//
//        var requestEntity = new HttpEntity<String>(body, headers);
//        var responseEntity = restTemplate.exchange(
//                tokenUrl,
//                HttpMethod.POST,
//                requestEntity,
//                String.class
//        );
//
//        if (responseEntity.getStatusCode().value() == 200){
//            return responseEntity.getBody();
//        }
//
//        return null;
//    }
//}
