package com.example.dddshowcase.resources.application;

import com.example.dddshowcase.resources.domain.model.ResourceReferentialRepository;
import com.example.dddshowcase.resources.domain.model.ResourceRepository;

import java.util.UUID;

public class ResourceReferentialApi {

    private final ResourceReferentialRepository resourceReferentialRepository;
    private final ResourceRepository resourceRepository;

    public ResourceReferentialApi(ResourceReferentialRepository resourceReferentialRepository, ResourceRepository resourceRepository) {
        this.resourceReferentialRepository = resourceReferentialRepository;
        this.resourceRepository = resourceRepository;
    }

    public void onboardResource(UUID resourceReferentialId) {

    }
}
