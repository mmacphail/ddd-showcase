package com.example.dddshowcase.resources.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Getter
@Builder
@Entity
@Table(name = "resource")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Resource {
    @Id
    private UUID id;
    @Column(nullable = false)
    private UUID resourceReferentialId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private boolean active;
}
