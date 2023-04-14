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
@Table(name = "resource_referential")
@AllArgsConstructor
@NoArgsConstructor
public class ResourceReferential {
    @Id
    private UUID id;

    @Column(nullable = false)
    private UUID defaultResourceOwner;

    @Column(nullable = false)
    private String name;

    public Resource onboard() {
        return Resource.makeResource(this.id, this.name);
    }
}
