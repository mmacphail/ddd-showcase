package com.example.dddshowcase.resource.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
public class Resource {
    private UUID id;
    private UUID resourceReferentialId;
    private String name;
    private boolean active;

    private Resource() {}

    static Resource makeResource(UUID resourceReferentialId, String name) {
        var resource = new Resource();
        resource.id = UUID.randomUUID();
        resource.resourceReferentialId = resourceReferentialId;
        resource.name = name;
        resource.active = false;
        return resource;
    }
}
