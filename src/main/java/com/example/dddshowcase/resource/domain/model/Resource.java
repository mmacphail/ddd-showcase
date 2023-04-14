package com.example.dddshowcase.resource.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "resource")
public class Resource {
    @Id
    private UUID id;

    @Column(nullable = false)
    private UUID resourceReferentialId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private boolean active;


    static Resource makeResource(UUID resourceReferentialId, String name) {
        var resource = new Resource();
        resource.id = UUID.randomUUID();
        resource.resourceReferentialId = resourceReferentialId;
        resource.name = name;
        resource.active = false;
        return resource;
    }
}
