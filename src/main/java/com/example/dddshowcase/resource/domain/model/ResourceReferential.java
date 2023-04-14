package com.example.dddshowcase.resource.domain.model;

import lombok.Data;

import java.util.UUID;

@Data
public class ResourceReferential {
    private UUID id;
    private UUID defaultResourceOwner;
    private String name;

    public Resource onboard() {
        return Resource.makeResource(this.id, name);
    }
}
