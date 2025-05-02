package com.example.legalrisk.services.integration;

import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

public class IntegrationEGRN implements IntegrationService{
    @Override
    @Transactional
    public void sendRequest(UUID id) {

    }
}
