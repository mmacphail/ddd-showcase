package com.example.dddshowcase.resources.domain.model;

import com.example.dddshowcase.resources.domain.model.Resource;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Data
@Builder
@Entity
@Table(name = "resource_referential")
@NoArgsConstructor
@AllArgsConstructor
public class ResourceReferential {
    @Id
    private UUID id;
    @Column(nullable = false)
    private String name;

    public Resource onboard() {
        return Resource.builder()
                .id(UUID.randomUUID())
                .resourceReferentialId(this.id)
                .name(this.name)
                .active(false)
                .build();
    }
}
