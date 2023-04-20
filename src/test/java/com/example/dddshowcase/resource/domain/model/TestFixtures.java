package com.example.dddshowcase.resource.domain.model;

import com.example.dddshowcase.resources.domain.model.Resource;
import com.example.dddshowcase.resources.domain.model.ResourceReferential;

import java.util.UUID;

public class TestFixtures {
    public static ResourceReferential getResourceReferential() {
        return ResourceReferential.builder()
                .id(UUID.randomUUID())
                .name("test resource")
                .build();
    }

    public static Resource getResource() {
        return Resource.builder()
                .id(UUID.randomUUID())
                .resourceReferentialId(UUID.randomUUID())
                .name("test resource")
                .active(false)
                .build();
    }
}
