package com.example.dddshowcase.resources.domain.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ResourceReferentialRepository extends JpaRepository<ResourceReferential, UUID> {
}
