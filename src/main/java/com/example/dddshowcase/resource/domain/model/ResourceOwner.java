package com.example.dddshowcase.resource.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@Table(name = "resource_owner")
@AllArgsConstructor
@NoArgsConstructor
public class ResourceOwner {

    @Id
    private UUID id;

    @Column(nullable = false)
    private UUID resourceId;

    @Column(nullable = false)
    private UUID userId;

    public static ResourceOwner createNew(UUID resourceId, UUID userId) {
        return new ResourceOwner(
                UUID.randomUUID(),
                resourceId,
                userId
        );
    }
}
